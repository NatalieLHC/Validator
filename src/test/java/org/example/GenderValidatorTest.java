package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderValidatorTest {
@Test
    public void testGenderValidator() throws Exception{
    var genderValidator = new GenderValidator("female");
    assertEquals("female", genderValidator.gender);
}
}