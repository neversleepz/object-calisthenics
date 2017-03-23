package org.outrospective.calisthenics.model.jobseeker;

import org.outrospective.calisthenics.model.job.Job;
import org.outrospective.calisthenics.model.resume.Resume;
import org.outrospective.calisthenics.model.resume.NullResume;
import org.outrospective.calisthenics.exceptions.NotYetImplementedException;
import org.outrospective.calisthenics.exceptions.SomeoneElsesResumeException;

import java.util.Objects;

public class Jobseeker {

    private JobseekerName name;

    public Jobseeker getName() {
        throw new NotYetImplementedException(); 
    }

    public void saveForLater(Job job) {
        throw new NotYetImplementedException();
    }

    // TODO: should these apply() return void and use the JobApplications repository classes
    //              OR return the JobApplication object

    public JobApplication apply(ATS job) {
        Objects.requireNonNull(job);

        apply(job, NULL_RESUME);
    }

    public JobApplication apply(JReq job, Resume resume) {
        Objects.requireNonNull(job);
        Objects.requireNonNull(resume);

        apply(job, resume);
    }

    public JobApplication apply(Job job, Resume resume) {
        checkResumeIsForThisApplicant(resume);
        return new JobApplication(job, this, resume);
    }

    public void checkResumeIsForThisApplicant(NullResume resume) {
        return;
    }


    public void checkResumeIsForThisApplicant(Resume resume) {
        if (!Objects.equals(this.getName(), resume.getName()) {
            throw new SomeoneElsesResumeException(this.getName(), resume.getName())
        }
    }

    public List<JobApplication> apply(Map<Job, Resume> applicationResumesForJobs) {
        return applicationResumesForJobs.entrySet().stream()
                .map(Map.Entry < Job, Resume > entry -> apply(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }
}