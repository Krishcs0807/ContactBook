package phone.contactbook.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contactsbook")
public class ContactModel {
	
	
	@Id
	@Column(name="Phonenumber")
	private String PhoneNumber;
	
	@Column(name="Name")
	private String Name;
	
	

	
	
	public ContactModel() {
		
	}

	public ContactModel(String phoneNumber, String name) {
		
		PhoneNumber = phoneNumber;
		Name = name;
	}

	@Override
	public String toString() {
		return "ContactModel [Name=" + Name + ", PhoneNumber=" + PhoneNumber + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	
	

	
	
	
	
	

	

}
