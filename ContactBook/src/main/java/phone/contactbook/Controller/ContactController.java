package phone.contactbook.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import phone.contactbook.Model.ContactModel;
import phone.contactbook.Service.ContactService;




@Controller
public class ContactController {

	
	@Autowired
	private ContactService service;
	
	
	
	@GetMapping("home")
	public String home() {
		
		return "Home.jsp";
	}
	
	
	@GetMapping("contactbook")
	public ModelAndView contactbook(Model model) {
		
		ModelAndView mav=new ModelAndView("ContactBook.jsp");
		return mav;
	}
	
	@PostMapping
	public Optional<ContactModel> AllContacts(@RequestBody ContactModel model) {
		         Optional<ContactModel> data=service.SaveContact(model);
		         if(data.isPresent()) {
		        	 return Optional.of(data.get());
		         }else {
		        	 return Optional.empty();
		         }
		
		
	}
	

}
