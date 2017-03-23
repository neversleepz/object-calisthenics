package org.outrospective.calisthenics.model.resume;

public enum NullResume extends Resume {

    NULL_RESUME;

    public NullResume() {
        super("No resume");
    }
}