package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int iD = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Birth Date yyyy-mm-dd: ");
        String birthDate = scanner.nextLine();
        System.out.println("Enter your gender: female/male");
        String gender = scanner.nextLine();

        IDValidator idValidator = new IDValidator(iD);
        ISODateValidator isoDateValidator = new ISODateValidator(birthDate);
        GenderValidator genderValidator = new GenderValidator(gender);

        List<Validator> validatorList = new ArrayList<>();
        validatorList.add(idValidator);
        validatorList.add(isoDateValidator);
        validatorList.add(genderValidator);

        try {
            ValidatorService.validate(validatorList);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}