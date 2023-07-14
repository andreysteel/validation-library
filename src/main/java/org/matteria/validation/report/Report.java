package org.matteria.validation.report;

import java.util.Collections;
import java.util.List;
import org.matteria.validation.violation.Violation;

public class Report {
    private final List<Violation> violations;

    Report(final List<Violation> violations) {
        this.violations = violations;
    }

    public List<Violation> getViolations() {
        return Collections.unmodifiableList(this.violations);
    }

    public void addViolation(final Violation violation) {
        this.violations.add(violation);
    }

    public static ReportComposer builder() {
        return new ReportComposer();
    }
}
