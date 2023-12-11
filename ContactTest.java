import org.junit.jupiter.api.*;

public class ContactTest {
	
	@Test
	void testContactID(){
		Contact testContact = new Contact("12345", "Joy", "K", "0123456789", "123 Street Rd.");
		assert(testContact.getContactID().equals("12345"));
		Contact badTestContact = new Contact("12345678910", "Joy", "K", "0123456789", "123 Street Rd.");
		assert(badTestContact == null);
		Contact badTestContact2 = new Contact(null, "Joy", "K", "0123456789", "123 Street Rd.");
		assert(badTestContact2 == null);
	}
	
	@Test
	void testFirstName(){
		Contact testContact = new Contact("12345", "Joy", "K", "0123456789", "123 Street Rd.");
		testContact.setFirstName("Joy");
		assert(testContact.getFirstName().equals("Joy"));	
		testContact.setFirstName("FirstNameFirstName");
		assert(!testContact.getFirstName().equals("FirstNameFirstName"));
		Contact badTestContact = new Contact("12345", null, "K", "0123456789", "123 Street Rd.");
		assert(badTestContact == null);
	}
	
	@Test
	void testLastName(){
		Contact testContact = new Contact("12345", "Joy", "K", "0123456789", "123 Street Rd.");
		testContact.setLastName("K");
		assert(testContact.getLastName().equals("K"));
		testContact.setLastName("LastNameLastName");
		assert(!testContact.getLastName().equals("LastNameLastName"));
		Contact badTestContact = new Contact("12345", "Joy", null, "0123456789", "123 Street Rd.");
		assert(badTestContact == null);
	}
	
	@Test
	void testPhone(){
		Contact testContact = new Contact("12345", "Joy", "K", "0123456789", "123 Street Rd.");
		testContact.setPhone("0123456789");
		assert(testContact.getPhone().equals("0123456789"));
		testContact.setPhone("123456789");
		assert(!testContact.getPhone().equals("123456789"));
		testContact.setPhone("01234567899");
		assert(!testContact.getPhone().equals("01234567899"));
		Contact badTestContact = new Contact("12345", "Joy", "K", null, "123 Street Rd.");
		assert(badTestContact == null);
	}	

	@Test
	void testAddress(){
		Contact testContact = new Contact("12345", "Joy", "K", "0123456789", "123 Street Rd.");
		testContact.setAddress("123 Street Rd.");
		assert(testContact.getAddress().equals("123 Street Rd."));
		testContact.setAddress("123 Street Rd.123 Street Rd.123 Street Rd.");
		assert(!testContact.getAddress().equals("123 Street Rd.123 Street Rd.123 Street Rd."));
		Contact badTestContact = new Contact("12345", "Joy", "K", "0123456789", null);
		assert(badTestContact == null);
	}
	
}
