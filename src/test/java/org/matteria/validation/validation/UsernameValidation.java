package org.matteria.validation.validation;

import java.util.ArrayList;
import org.matteria.validation.Validatable;
import org.matteria.validation.report.Report;

public class UsernameValidation implements Validatable<String> {
    @Override
    public Report validate(final String body) {

        return new Error("", new ArrayList<>());
    }
}
