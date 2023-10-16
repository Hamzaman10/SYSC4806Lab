package org.lab2;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class AddressBook {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null) {
            buddies.add(buddy);
        }
    }

    public void removeBuddy(int index) {
        if (index >= 0 && index < buddies.size()) {
            buddies.remove(index);
        } else {
            System.out.println("Invalid index. No buddy removed.");
        }
    }

    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        BuddyInfo buddy1 = new BuddyInfo("Hamza", "Test St", "1234");
        BuddyInfo buddy2 = new BuddyInfo("John", "Test Ave", "5678");

        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);


    }

    public Long getId() {
        return id;
    }
}
