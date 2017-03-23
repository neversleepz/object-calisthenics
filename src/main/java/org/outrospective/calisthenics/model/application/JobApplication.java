package org.outrospective.calisthenics.model.application;

import org.outrospective.calisthenics.model.job.Job;
import org.outrospective.calisthenics.model.jobseeker.Jobseeker;
import org.outrospective.calisthenics.model.resume.Resume;

import java.time.Instant;

public class JobApplication {

    private final Job job;
    private final Jobseeker applicant;
    private final Resume resume;
    private final Instant dateApplied;

    public JobApplication(Job job, Jobseeker applicant, Resume resume) {
        this(job, applicant, resume);
        this.dateApplied = Instant.now();
    }

    public JobApplication(Job job, Jobseeker applicant, Resume resume, Instant dateApplied) {
        this.job = job;
        this.applicant = applicant;
        this.resume = resume;
        this.dateApplied = dateApplied;
    }
}