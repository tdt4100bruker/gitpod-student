package encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static assertions.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

	private double epsilon = 0.000001d;

	private Account account;

	@BeforeEach
	protected void setUp() throws Exception {
		account = new Account(100, 5);
	}

    @Test
	public void testAccount() {
		account = new Account(100, 5);
		assertEquals(100.0d, account.getBalance(), epsilon);
		assertEquals(5.0d, account.getInterestRate(), epsilon);
		try {
			account = new Account(-1, 5);
			fail("Creating Account with negative balance should throw an IllegalArgumentException.");
		} catch (Exception e) {
			assertEquals(100.0d, account.getBalance(), epsilon);
			assertEquals(5.0d, account.getInterestRate(), epsilon);
			_assertTrue("Exception should be IllegalArgumentException.", e instanceof IllegalArgumentException);
		}

		try {
			account = new Account(100, -1);
			fail("Creating Account with negative interestRate should throw an IllegalArgumentException.");
		} catch (Exception e) {
			assertEquals(100.0d, account.getBalance(), epsilon);
			assertEquals(5.0d, account.getInterestRate(), epsilon);
			_assertTrue("Exception should be IllegalArgumentException.", e instanceof IllegalArgumentException);
		}
	}

    @Test
	public void testSetInterestRate() {
		account.setInterestRate(7);
		assertEquals(7.0d, account.getInterestRate(), epsilon);
		try {
			account.setInterestRate(-2);
			fail("Setting a negative interestRate should result throw exception.");
		} catch (Exception e) {
			assertEquals(7.0d, account.getInterestRate(), epsilon);
		}
	}

    @Test
	public void testDeposit() {
		account.deposit(100);
		assertEquals(200.0d, account.getBalance(), epsilon);
    }
    
    @Test
	public void testDepositNegativeAmount() {
		try {
			account.deposit(-50);
			fail("deposit should throw an IllegalArgumentException when given negative amounts.");
		} catch (Exception e) {
			_assertEquals("deposit should ignore negative amounts.", 100.0d, account.getBalance(), epsilon);
			_assertTrue("Exception should be IllegalArgumentException.", e instanceof IllegalArgumentException);
		}
	}
    @Test
	public void testWithdraw() {
		try {
			account.withdraw(50);
			assertEquals(50.0d, account.getBalance(), epsilon);
		} catch (Exception e){
			fail();
		}
	}

    @Test
	public void testWithdrawTooLargeAmount() {
		try {
			account.withdraw(150);
			fail("Expected IllegalArgumentException here");
		} catch (Exception e){
			assertEquals(100.0d, account.getBalance(), epsilon);
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
}