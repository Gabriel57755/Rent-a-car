package controller;

import model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import repository.CustomersRepository;

import javax.persistence.Id;

@Controller
public class CustomersController {
    @Autowired
    private CustomersRepository repository;}

   /* @GetMapping("/customers")
    public String index(Model model) {
        model.addAllAttributes("customers", repository.findAll(Id));

        model.addAttribute("curentCustomer", curentCustomer);
        return "customers/index";
    }

    @GetMapping("/customers/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customers());
        return "customers/create";
    }

    @PostMapping("/customers/create")
    public String create(Model model, @ModelAttribute("customer") Customers customerForm) {
        System.out.println(customerForm);



    }
*/
