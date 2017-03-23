package org.outrospective.calisthenics.model.employer;

import org.outrospective.calisthenics.model.job.Job;

import java.util.List;

public abstract class Employer {

    abstract void post(Job job);

    abstract List<Job> postedJobs();
}