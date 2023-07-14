package org.matteria.validation.violation;

public sealed interface Violation permits SimpleViolation, FieldViolation {
    String getMessage();
}
