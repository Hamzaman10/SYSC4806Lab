package org.lab2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookRestController {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Autowired
    private BuddyInfoRepository buddyInfoRepository;

    // Create a new AddressBook
    @PostMapping
    public AddressBook createAddressBook() {
        AddressBook addressBook = new AddressBook();
        return addressBookRepository.save(addressBook);
    }

    // Get all buddies for a specific AddressBook by its ID
    @GetMapping("/{addressBookId}/buddies")
    public List<BuddyInfo> getBuddies(@PathVariable Long addressBookId) {
        AddressBook addressBook = addressBookRepository.findById(addressBookId).orElseThrow(() -> new IllegalArgumentException("Invalid address book ID"));
        return addressBook.getBuddies();
    }

    @PostMapping("/{addressBookId}/buddies")
    public BuddyInfo addBuddy(@PathVariable Long addressBookId, @RequestBody BuddyInfo buddyInfo) {
        AddressBook addressBook = addressBookRepository.findById(addressBookId).orElseThrow(() -> new IllegalArgumentException("Invalid address book ID"));

        // Add the buddy to the address book
        addressBook.addBuddy(buddyInfo);

        // Save the updated address book
        addressBookRepository.save(addressBook);

        // Return the buddy info
        return buddyInfo;
    }





}
