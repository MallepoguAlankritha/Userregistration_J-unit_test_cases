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
	}