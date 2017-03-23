package org.outrospective.calisthenics.model.jobseeker;

import static java.util.Objects.equals;

public class JobseekerName {

    public boolean equals(Object that) {
        if (!this instanceof that)
            return false;

//        JobseekerName other = (JobseekerName) that;
        // TODO: elaboarate on this fields that JobseekerName has (eg Objects.equals(this.first, other.first)
        return Objects.equals(this, other);
    }

    public int hashCode() {
        // TODO: add fields
        return Objects.hash(0);
    }
}