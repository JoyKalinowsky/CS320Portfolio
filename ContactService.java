import java.util.HashMap;

public class ContactService {

private HashMap<String, Contact> contacts = new HashMap<String, Contact>();


public ContactService() {}

int getContactMapSize() {
	return contacts.size();
}
void addContact(Contact newContact){
	if(newContact == null || newContact.getContactID() == null || newContact.getFirstName() == null || newContact.getLastName() == null || newContact.getPhone() == null || newContact.getAddress() == null) {
		return;
	}
	contacts.put(newContact.getContactID(), newContact);
}
void deleteContact(String contactID){
	contacts.remove(contactID);
}

void updateFirstName(String contactID, String newFirst) {
	if(contacts.get(contactID) != null && newFirst != null) {
		contacts.get(contactID).setFirstName(newFirst);
	}		
}
void updateLastName(String contactID, String newLast) {
	if(contacts.get(contactID) != null && newLast != null) {
		contacts.get(contactID).setLastName(newLast);
	}		
}
void updateNumber(String contactID, String newNumber) {
	if(contacts.get(contactID) != null && newNumber != null) {
		contacts.get(contactID).setPhone(newNumber);
	}		
}
void updateAddress(String contactID, String newAddress) {
	if(contacts.get(contactID) != null && newAddress != null) {
		contacts.get(contactID).setAddress(newAddress);
	}		
}

}
