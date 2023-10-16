package org.lab2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    //@Bean
    //public CommandLineRunner demo(AddressBookRepository addressBookRepository) {
        //return args -> {
            //Ask TA
            //BuddyInfo buddyInfo = new BuddyInfo("Hamza", "Carleton", "12345");
            //AddressBook addressBook = new AddressBook();
            //addressBook.addBuddy(buddyInfo);

            //addressBookRepository.save(addressBook);

            // Fetch the address book and print the buddy info
            //AddressBook savedAddressBook = addressBookRepository.findById(addressBook.getId()).orElse(null);
            //if (savedAddressBook != null) {
                //for (BuddyInfo buddy : savedAddressBook.getBuddies()) {
                    //System.out.println("BuddyInfo: " + buddy.getName() + ", Address: " + buddy.getAddress() + ", Number: " + buddy.getNumber());
                //}
            //}
        //};
    //}
}
