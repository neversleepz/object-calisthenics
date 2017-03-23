package org.outrospective.calisthenics.model.resume;

import org.outrospective.calisthenics.model.jobseeker.JobseekerName;

public class Resume {

    private JobseekerName name;

    public Resume(JobseekerName name) {
        this.name = name;
    }

    public JobseekerName getName() {
        return name;
    }
}