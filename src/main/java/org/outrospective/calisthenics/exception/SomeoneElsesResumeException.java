package org.outrospective.calisthenics.exception;

import static java.lang.String.format;

public class SomeoneElsesResumeException extends IllegalArgumentException {
    public SomeoneElsesResumeException(JobseekerName applicantName, JobseekerName resumeName) {
        super(errorString(applicantName, resumeName));
    }

    private static String errorString(JobseekerName applicantName, JobseekerName resumeName) {
        return format("Jobseeker %s is applying for a role with a Resume for %s", applicantName, resumeName);
    }
}