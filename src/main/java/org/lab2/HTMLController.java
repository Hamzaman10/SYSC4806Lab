package org.lab2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HTMLController {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @GetMapping("/addressbook/{addressBookId}/buddies-list")
    public String getBuddiesPage(@PathVariable Long addressBookId, Model model) {
        AddressBook addressBook = addressBookRepository.findById(addressBookId).orElseThrow(() -> new IllegalArgumentException("Invalid address book ID"));
        model.addAttribute("buddies", addressBook.getBuddies());
        return "buddies-list";
    }

}