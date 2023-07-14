package org.matteria.validation;

import java.util.Optional;
import org.matteria.validation.report.Report;

@FunctionalInterface
public interface Validatable<T> {
    Optional<Report> validate(final T body);
}
