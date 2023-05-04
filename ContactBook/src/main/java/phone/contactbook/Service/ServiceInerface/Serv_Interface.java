package phone.contactbook.Service.ServiceInerface;

import java.util.Optional;

import phone.contactbook.Model.ContactModel;

public interface Serv_Interface {
	
	
	
	public Optional<ContactModel> FindbyOne(String number);
	
	public Optional<ContactModel> SaveContact(ContactModel model);
	
	public Optional<ContactModel> EditContact(ContactModel model);
	
	public boolean DeleteContact(String number);
	

}
