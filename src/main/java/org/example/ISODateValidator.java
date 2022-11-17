package org.example;

public class ISODateValidator implements Validator {
    public ISODateValidator(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMessage() {
        return "Invalid date";
    }
    String birthDate;

    @Override
    public boolean isValid() {
        return true;
    }
}
