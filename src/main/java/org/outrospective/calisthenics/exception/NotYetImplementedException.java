package org.outrospective.calisthenics.exception;

public class NotYetImplementedException extends UnsupportedOperationException {
    public NotYetImplementedException() {
        super("Not yet implemented");
    }
}