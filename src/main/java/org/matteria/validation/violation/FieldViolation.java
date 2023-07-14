package org.matteria.validation.violation;

import java.util.List;

public record FieldViolation(Field field, List<String> messages) implements Violation {
    @Override
    public String getMessage() {
        return messages.toString();
    }
}
