package org.outrospective.calisthenics.model.employer;

import org.outrospective.calisthenics.model.job.Job;

public class Employer {

    void post(Job job);

    List<Job> postedJobs();
}