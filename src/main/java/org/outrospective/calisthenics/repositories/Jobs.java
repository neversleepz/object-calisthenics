package org.outrospective.calisthenics.repositories;

public interface Jobs {

    // TODO: Consider Employer#post(Job job)
    void post(Job job); // post(Job job, Employer employer)

    // same as above
    Collection<Job> postedJobs(Employer employer);
}