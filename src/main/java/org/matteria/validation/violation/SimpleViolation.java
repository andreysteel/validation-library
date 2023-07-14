package org.matteria.validation.violation;

public final class SimpleViolation implements Violation {
    private final String message;

    public SimpleViolation(final String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
