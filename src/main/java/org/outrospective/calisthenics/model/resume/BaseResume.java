package org.outrospective.calisthenics.model.resume;

import org.outrospective.calisthenics.model.jobseeker.JobseekerName;

public class BaseResume implements Resume {

    private JobseekerName name;

    public BaseResume(JobseekerName name) {
        this.name = name;
    }

    @Override
    public JobseekerName getName() {
        return name;
    }
}