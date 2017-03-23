package org.outrospective.calisthenics.model.resume;

import org.outrospective.calisthenics.model.jobseeker.JobseekerName;

public enum NullResume implements Resume {

    NULL_RESUME;

    public JobseekerName getName() {
        return new JobseekerName("No", "resume");
    }
}