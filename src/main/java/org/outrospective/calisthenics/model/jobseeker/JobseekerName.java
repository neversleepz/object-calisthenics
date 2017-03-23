package org.outrospective.calisthenics.model.jobseeker;

import java.util.Objects;

public class JobseekerName {

    private String firstName;
    private String lastName;

    public JobseekerName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (!(that instanceof JobseekerName)) return false;

        JobseekerName other = (JobseekerName) that;
        return Objects.equals(this.firstName, other.firstName) &&
                Objects.equals(this.lastName, other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("%s %s", field(firstName), field(lastName));
    }

    private String field(String field) {
        return Objects.toString(field, "Unknown");
    }
}