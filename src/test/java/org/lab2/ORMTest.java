package org.lab2;
import org.junit.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;



public class ORMTest {
    public void testPersistBuddyInfo() {
        // Create an EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        // Create an EntityManager
        EntityManager em = emf.createEntityManager();

        // Create a new BuddyInfo object
        BuddyInfo buddyInfo = new BuddyInfo("Alice", "123 Main St", "555-1234");

        // Begin a transaction
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Persist the BuddyInfo object
        em.persist(buddyInfo);

        // Commit the transaction
        tx.commit();

        // Close the EntityManager and EntityManagerFactory
        em.close();
        emf.close();
    }

}
