package org.matteria.validation.report;

public class Reports {
    public static Report of(final Report... reports) {
        final ReportComposer reportComposer = new ReportComposer();
        for (final Report report : reports) {
            report.getViolations().forEach(reportComposer::add);
        }
        return reportComposer.compose();
    }
}
