package org.outrospective.calisthenics.model.jobseeker;

import org.outrospective.calisthenics.model.application.JobApplication;
import org.outrospective.calisthenics.model.job.Job;
import org.outrospective.calisthenics.model.job.ATS;
import org.outrospective.calisthenics.model.job.JReq;
import org.outrospective.calisthenics.model.resume.Resume;
import org.outrospective.calisthenics.model.resume.NullResume;
import org.outrospective.calisthenics.exception.NotYetImplementedException;
import org.outrospective.calisthenics.exception.SomeoneElsesResumeException;

import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.outrospective.calisthenics.model.resume.NullResume.NULL_RESUME;

public class Jobseeker {

    private JobseekerName name;

    public JobseekerName getName() {
        return name;
    }

    public void saveForLater(Job job) {
        throw new NotYetImplementedException();
    }

    // TODO: should these apply() return void and use the JobApplications repository classes
    //              OR return the JobApplication object

    public JobApplication apply(ATS job) {
        Objects.requireNonNull(job);

        return apply(job, NULL_RESUME);
    }

    public JobApplication apply(Job job, Resume resume) {
        Objects.requireNonNull(job);
        checkResumeIsForThisApplicant(resume);
        return new JobApplication(job, this, resume);
    }

    public JobApplication apply(JReq job, Resume resume) {
        Objects.requireNonNull(resume, "JReq jobs require a resume to apply");

        return apply((Job) job, resume);
    }

    public List<JobApplication> apply(Map<Job, Resume> applicationResumesForJobs) {
        return applicationResumesForJobs.entrySet().stream()
                .map(entry -> apply(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    // XXX: smell - should the resume subclasses own this impl?
    public void checkResumeIsForThisApplicant(NullResume resume) {
        return;
    }

    public void checkResumeIsForThisApplicant(Resume resume) {
        if (!Objects.equals(this.getName(), resume.getName())) {
            throw new SomeoneElsesResumeException(this.getName(), resume.getName());
        }
    }
}