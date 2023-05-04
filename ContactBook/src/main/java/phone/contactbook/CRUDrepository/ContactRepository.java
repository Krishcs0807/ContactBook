package phone.contactbook.CRUDrepository;



import org.springframework.data.jpa.repository.JpaRepository;

import phone.contactbook.Model.ContactModel;

public interface ContactRepository extends JpaRepository<ContactModel, String> {

}
