package org.outrospective.calisthenics.repositories;

import org.outrospective.calisthenics.model.job.Job;
import org.outrospective.calisthenics.model.employer.Employer;

import java.util.Collection;

public interface Jobs {

    // TODO: Consider Employer#post(Job job)
    void post(Job job); // post(Job job, Employer employer)

    // same as above
    Collection<Job> postedJobs(Employer employer);
}