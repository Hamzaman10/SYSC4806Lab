package org.lab2;


import jakarta.persistence.*;

@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String address;

    private String number;

    public BuddyInfo(String name, String address, String number){
        setDetails(name, address,number);
    }

    public BuddyInfo() {

    }

    public void setDetails(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public static void main(String[] args) {
        BuddyInfo person = new BuddyInfo("Hamza", "Carleton", "1234");
        System.out.println("hello"+ " " + person.name);
    }
}
