
public class Contact {

	private String contactID = null;
	private String firstName = null;
	private String lastName = null;
	private String phone = null;
	private String address = null;
	
	public Contact(String contactID, String firstName, String lastName, String newPhone, String newAddress) {
		if (contactID == null || contactID.length() > 10 ) {
            throw new IllegalArgumentException("ID cannot be null or longer than 10 characters.");
        }
		if(firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name cannot be null or longer than 10 characters.");
		}
		if(lastName == null || lastName.length() > 10) {
	         throw new IllegalArgumentException("Last name cannot be null or longer than 10 characters.");
		}
		if(newPhone == null || newPhone.length() != 10) {
	         throw new IllegalArgumentException("Phone number cannot be null or not 10 characters.");
		}
		if(newAddress == null || newAddress.length() > 30) {
	         throw new IllegalArgumentException("Address cannot be null or longer than 30 characters.");
		}
			this.contactID = contactID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phone = newPhone;
			this.address = newAddress;
	}
	
public String getContactID(){
	return this.contactID;
}

public String getFirstName() {
	return this.firstName;
}   

public String getLastName() {
	return this.lastName;
}

public String getPhone() {
	return this.phone;
}

public String getAddress() {
	return this.address;
}
    
public void setFirstName(String newFirst) {
	if(newFirst != null && newFirst.length() <= 10) {
		this.firstName = newFirst;
	}
}

public void setLastName(String newLast) {
	if(newLast != null && newLast.length() <= 10) {
		this.lastName = newLast;
	}	
}

public void setPhone(String newPhone) {
	if(newPhone != null && newPhone.length() == 10) {
		this.phone = newPhone;
	}	
}

public void setAddress(String newAddress) {
	if(newAddress != null && newAddress.length() <= 30) {
		this.address =  newAddress;
	}	
}
}
