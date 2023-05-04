package phone.contactbook.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import phone.contactbook.CRUDrepository.ContactRepository;
import phone.contactbook.Model.ContactModel;
import phone.contactbook.Service.ServiceInerface.Serv_Interface;

@Service
public class ContactService implements Serv_Interface {

	@Autowired
	private ContactRepository Repository;

	public List<ContactModel> FindAll() {
		// TODO Auto-generated method stub
		return Repository.findAll();
	}

	@Override
	public Optional<ContactModel> FindbyOne(String number) {
		// TODO Auto-generated method stub
		return Repository.findById(number);
	}

	@Override
	public Optional<ContactModel> SaveContact(ContactModel model) {
		// TODO Auto-generated method stub
		if(Repository.existsById(model.getPhoneNumber())) {
		return Optional.empty();
		}else {
			return Optional.of(Repository.save(model));
		}
	}

	@Override
	public Optional<ContactModel> EditContact(ContactModel model) {
		// TODO Auto-generated method stub
		if(Repository.existsById(model.getPhoneNumber())) {
		return Optional.of(Repository.save(model));
		}else {
			return Optional.empty();
		}
	}

	@Override
	public boolean DeleteContact(String number) {
		if(Repository.existsById(number)) {
			Repository.deleteById(number);
			return true;
		}else {
			return false;
		}
	}

}
