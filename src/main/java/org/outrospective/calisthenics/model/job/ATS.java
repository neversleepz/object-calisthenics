package org.outrospective.calisthenics.model.job;

// TODO: should subclasses of Job have job in their name, eg AtsJob?
public class ATS extends Job {

    public boolean requiresResume() {
        return false;
    }
}