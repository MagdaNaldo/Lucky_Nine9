/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ken_C
 */
public class RegistrationValidatorTest {
    
    public RegistrationValidatorTest() {
    }

    /**
     * Test of registrationValidate method, of class RegistrationValidator.
     */
//    @Test
//    public void testRegistrationValidate() {
//        System.out.println("registrationValidate");
//        RegistrationValidator instance = new RegistrationValidator();
//        instance.registrationValidate();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void testCheckLengthGood() {// > 3 characters
        System.out.println("checkLengthGood");
        String username = "Name";
        boolean expResult = true;
        boolean result = RegistrationValidator.checkLength(username); 
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testCheckLengthBad() {  //< 3 characters
        System.out.println("checkLengthBad");
        String username = "Na";
        boolean expResult = false;
        boolean result = RegistrationValidator.checkLength(username);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testCheckLengthBoundary() { // = 3 characters
        System.out.println("checkLengthBoundary");
        String username = "Nam";
        boolean expResult = true;
        boolean result = RegistrationValidator.checkLength(username);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testCheckSpecialCharacterGood() {// with at least 1 special character
        System.out.println("checkSpecialCharacterGood");
        String username = "Name!!";
        boolean expResult = true;
        boolean result = RegistrationValidator.checkSpecialCharacter(username); 
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testCheckSpecialCharacterBad() {  //no special character
        System.out.println("checkSpecialCharacterBad");
        String username = "Name";
        boolean expResult = false;
        boolean result = RegistrationValidator.checkSpecialCharacter(username);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testCheckSpecialCharacterBoundary() { //has 1 special character
        System.out.println("checkSpecialCharacterBoundary");
        String username = "Name!";
        boolean expResult = true;
        boolean result = RegistrationValidator.checkSpecialCharacter(username);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testCheckUpperCaseGood() {// at least 1 uppercase
        System.out.println("checkUpperCaseGood"); 
        String username = "NamE";
        boolean expResult = true;
        boolean result = RegistrationValidator.checkUpperCase(username); 
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testCheckUpperCaseBad() {  //no uppercase
        System.out.println("checkUpperCaseBad");
        String username = "name";
        boolean expResult = false;
        boolean result = RegistrationValidator.checkUpperCase(username);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testCheckUpperCaseBoundary() { // 1 uppercase
        System.out.println("checkUpperCaseBoundary");
        String username = "Name";
        boolean expResult = true;
        boolean result = RegistrationValidator.checkUpperCase(username);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkLength method, of class RegistrationValidator.
     */
    @Test
    public void testCheckLength() {
        System.out.println("checkLength");
        String username = "";
        boolean expResult = false;
        boolean result = RegistrationValidator.checkLength(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkSpecialCharacter method, of class RegistrationValidator.
     */
    @Test
    public void testCheckSpecialCharacter() {
        System.out.println("checkSpecialCharacter");
        String username = "";
        boolean expResult = false;
        boolean result = RegistrationValidator.checkSpecialCharacter(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkUpperCase method, of class RegistrationValidator.
     */
    @Test
    public void testCheckUpperCase() {
        System.out.println("checkUpperCase");
        String username = "";
        boolean expResult = false;
        boolean result = RegistrationValidator.checkUpperCase(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
