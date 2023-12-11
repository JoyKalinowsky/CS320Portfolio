import org.junit.jupiter.api.*;

public class ContactServiceTest {
			
	@Test
	void testAddContact(){
		ContactService newService1 = new ContactService();

		Contact testContact = new Contact("12345","Joy","K","1234567890","123 Street Rd.");
		newService1.addContact(testContact);
		assert(newService1.getContactMapSize() == 1);	
		Contact testContact2 = new Contact("123456789012","Joy","K","1234567890","123 Street Rd.");
		newService1.addContact(testContact2);
		assert(newService1.getContactMapSize() == 1);
		Contact testContact3 = new Contact(null,"Joy","K","1234567890","123 Street Rd.");
		newService1.addContact(testContact3);
		assert(newService1.getContactMapSize() == 1);
	}
	
	@Test
	void testRemoveContact(){
		ContactService newService2 = new ContactService();

		Contact testContact = new Contact("12345","Joy","K","1234567890","123 Street Rd.");	
		newService2.addContact(testContact);
		assert(newService2.getContactMapSize() == 1);		
		newService2.deleteContact("12345");
		assert(newService2.getContactMapSize() == 0);		
	}
	
	@Test
	void testChangeFirstName(){
		ContactService newService3 = new ContactService();

		Contact testContact = new Contact("12345","Joy","K","1234567890","123 Street Rd.");
		newService3.addContact(testContact);
		newService3.updateFirstName("12345","Joy");
		assert(testContact.getFirstName().equals("Joy")):"First name is " + testContact.getFirstName() + ". Should be Joy.";
		newService3.updateFirstName("12345","JoyJoyJoyJoyJoyJoy");
		assert(!testContact.getFirstName().equals("JoyJoyJoyJoyJoyJoy")):"First name is " + testContact.getFirstName() + ". Should be Joy.";
		newService3.updateFirstName("12345",null);
		assert(!testContact.getFirstName().equals(null)):"First name is " + testContact.getFirstName() + ". Should be Joy.";		
	}
	
	@Test
	void testChangeLastName(){
		ContactService newService4 = new ContactService();

		Contact testContact = new Contact("12345","Joy","K","1234567890","123 Street Rd.");
		newService4.addContact(testContact);
		newService4.updateLastName("12345","K");		
		assert(testContact.getLastName().equals("K")):"Last name is " + testContact.getLastName() + ". Should be K.";
		newService4.updateLastName("12345","KalinowskyKalinowskyKalinowsky");
		assert(!testContact.getLastName().equals("KalinowskyKalinowskyKalinowsky")):"Last name is " + testContact.getLastName() + ". Should be K.";
		newService4.updateLastName("12345",null);
		assert(!testContact.getLastName().equals(null)):"Last name is " + testContact.getLastName() + ". Should be K.";		
	}	
	
	@Test
	void testChangePhone(){
		ContactService newService5 = new ContactService();

		Contact testContact = new Contact("12345","Joy","K","1234567890","123 Street Rd.");
		newService5.addContact(testContact);
		newService5.updateNumber("12345","0123456789");
		assert(testContact.getPhone().equals("0123456789")):"Phone number is " + testContact.getPhone() + ". Should be 0123456789.";
		newService5.updateNumber("12345","1233434534534645345");
		assert(!testContact.getPhone().equals("1233434534534645345")):"Phone number is " + testContact.getPhone() + ". Should be 0123456789.";
		newService5.updateNumber("12345",null);
		assert(!testContact.getPhone().equals(null)):"Phone number is is " + testContact.getPhone() + ". Should be 0123456789.";		

	}

	@Test
	void testChangeAddress(){
		ContactService newService6 = new ContactService();

		Contact testContact = new Contact("12345","Joy","K","1234567890","123 Street Rd.");
		newService6.addContact(testContact);
		newService6.updateAddress("12345","123 Street Rd.");
		assert(testContact.getAddress().equals("123 Street Rd.")):"Address is " + testContact.getAddress() + ". Should be 123 Street Rd.";
		newService6.updateAddress("12345","123 Street Rd.123 Street Rd.123 Street Rd.");
		assert(!testContact.getAddress().equals("123 Street Rd.123 Street Rd.123 Street Rd.")):"Address is " + testContact.getAddress() + ". Should be 123 Street Rd.";
		newService6.updateAddress("12345",null);
		assert(!testContact.getAddress().equals(null)):"Address is " + testContact.getAddress() + ". Should be 123 Street Rd.";		

	}	
}
