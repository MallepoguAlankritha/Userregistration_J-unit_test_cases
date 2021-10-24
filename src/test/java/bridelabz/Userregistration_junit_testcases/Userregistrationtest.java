package bridelabz.Userregistration_junit_testcases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
	 * Unit test for validating first name
	 */
	public class Userregistrationtest {
	    Userregistration userRegistration;
	    @Before
	    public void before() {
	        userRegistration = new Userregistration();
	    }

	    @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.firstName("Mallepogu");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.firstName("mallepogu");
	        Assert.assertEquals(false, result);
	    }
	    /**
	     * Unit test for validating last name
	     */
	    @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.lastName("Alankritha");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.lastName("alankritha");
	        Assert.assertEquals(false, result);

	    }
	    /**
	     * Unit test for validating email address
	     */
	    @Test
	    public void givenEmail_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.email("abc@gmail.com.com");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.email("abc()*@gmail.com");
	        Assert.assertEquals(false, result);
	    }
	    /**
	     * Unit test for validating format of mobile number
	     */
	    @Test
	    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.phoneNumber("91 9177530368");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
	        boolean result = userRegistration.phoneNumber("+91 9177530368");
	        Assert.assertEquals(false, result);
	    }
	    /**
	     * Unit test for validating password with minimum 8 character
	     */
	    @Test
	    public void givenPassword_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.password("password@123");
	        Assert.assertEquals(true, result);
	    }
	    @Test
	    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.password("psw@");
	        Assert.assertEquals(false, result);
	    }
	    /**
	     * Unit test for validating password with atleast one upper case
	     */
	    @Test
	    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.passwordRule2("passWord@123");
	        Assert.assertEquals(true, result);
	    }
	    @Test
	    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.passwordRule2("psw@");
	        Assert.assertEquals(false, result);
	    }
	
	}
	