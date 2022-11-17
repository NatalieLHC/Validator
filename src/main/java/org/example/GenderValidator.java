package org.example;

public class GenderValidator implements Validator {
    public GenderValidator(String gender) {
        this.gender = gender;
    }

    public String getMessage() {
        return "Invalid gender ";
    }

    String gender;

    @Override
    public boolean isValid() {
        if (!gender.equals("female") && !gender.equals("male")) {
            return false;
        }
        return true;
    }
}
