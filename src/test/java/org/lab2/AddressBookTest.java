package org.lab2;

import junit.framework.TestCase;

import static org.junit.Assert.*;

public class AddressBookTest {

    @org.junit.Test
    public void addBuddy() {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("Hamza", "Test St", "1234");
        BuddyInfo buddy2 = new BuddyInfo("John", "Test Ave", "5678");

        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);

        assertEquals(2, addressBook.getBuddies().size());
    }

    @org.junit.Test
    public void removeBuddy() {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("Hamza", "Test St", "1234");
        BuddyInfo buddy2 = new BuddyInfo("John", "Test Ave", "5678");

        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);

        addressBook.removeBuddy(1);
        addressBook.removeBuddy(0);

        assertEquals(0, addressBook.getBuddies().size());

    }
}