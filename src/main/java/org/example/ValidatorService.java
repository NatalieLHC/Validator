package org.example;

import java.util.List;

public class ValidatorService {
    public ValidatorService() {
    }

    public static void validate(List<Validator> valids) throws Exception {
        for (Validator validator: valids){
            if (!validator.isValid()){
                throw new ValidatorException(validator.getMessage());
            }
        }
    }
}
