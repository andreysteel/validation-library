package org.matteria.validation.report;

import java.util.ArrayList;
import java.util.List;
import org.matteria.validation.violation.Field;
import org.matteria.validation.violation.FieldViolation;
import org.matteria.validation.violation.Violation;

public class ReportComposer {
    private final List<Violation> violations = new ArrayList<>();

    public ReportComposer() {
    }
    //    public ReportComposer add(final Violation violation) {
//        if (violation instanceof FieldViolation) {
//            for (final Violation v : this.violations) {
//                if (v instanceof FieldViolation) {
//                    FieldViolation fieldViolation = (FieldViolation) v;
//                    if (fieldViolation.field().title().equalsIgnoreCase(((FieldViolation) violation).field().title())) {
//                        fieldViolation.messages().add(violation.getMessage());
//                    }
//                }
//            }
//        }
//        this.violations.add(violation);
//        return this;
//    }

    public FieldViolationComposer fieldViolation() {
        return new FieldViolationComposer(this);
    }


    public Report compose() {
        return new Report(this.violations);
    }

    public static class FieldViolationComposer {
        private final ReportComposer reportComposer;

        private final List<String> messages = new ArrayList<>();
        private String field = "";

        public FieldViolationComposer(final ReportComposer reportComposer) {
            this.reportComposer = reportComposer;
        }

        public FieldViolationComposer field(final String field) {
            this.field = field;
            return this;
        }

        public FieldViolationComposer message(final String message) {
            this.messages.add(message);
            return this;
        }

        public ReportComposer and() {
            this.reportComposer.violations.add(new FieldViolation(new Field(field), messages));
            return this.reportComposer;
        }
    }
}
