/**
 *
 * @author Huawei
 */


// Wajood
/*
This file has 2 classes 
Admin: this class has the admin attribues and its setters and getters
AdminList: this class implemented using Linked List Data structure, the node will have an object
from Admin Class and each object will represent a record in the database

this classes are used so we can access data like username easily to help with the program flow
*/
public class AdminList {

    private class Node {

        Admin admin; 

        private Node next, prev;

        public Node() {
        }

        public Node(Admin admin, Node next, Node prev) {
            this.admin = admin;
            this.next = next;
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Admin getAdmin() {
            return admin;
        }

        public void setAdmin(Admin player) {
            this.admin = player;
        }

    } // end Node

    Node head = null;
    Node tail = null;

    int size = 0;

    public AdminList() {
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public Admin firstAdmin() {
        return (isEmpty()) ? null : head.getAdmin();
    }

    public void forwardTraversing() {
        if (isEmpty()) {
            System.out.println("The List is Empty!");
            return;
        }

        Node current = head;
        int counter = 1;
        System.out.println("PLAYERS: ");

        do {
            System.out.println("PLAYER #" + counter + ": " + current.getAdmin().getUsername());
            current = current.getNext();
            counter++;
        } while (current != head);

    }

    public void addFirst(Admin admin) {

        Node newNode = new Node(admin, null, null);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            newNode.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }

        size++;
        System.out.println("The ADMIN has been added");

    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("The List is Empty!");
            return;
        }

        head = head.next;
        tail.next = head;
        head.prev = tail;
        size--;
        System.out.println("The first ADMIN has been deleted");
        if (size == 0) {
            tail = head = null;
        }
    }

    public void find(String username) {

        if (isEmpty()) {
            System.out.println("The List is Empty!");
            return;
        }

        Node current = head;
        boolean found = false;
        do {

            if (current.getAdmin().getUsername() == username) {
                System.out.println("The ADMIN #" + username + " Has Been Found.");
                found = true;
                return;
            }
            current = current.next;

        } while (current != head);

        if (!found) {
            System.out.println("The ADMIN #" + username + " Not Found.");
        }

    }

    public String getUsername(Admin admin) {
        return admin.getUsername();
    }

}


 class Admin {

    private long Admin_ID;
    private String fname;
    private String lname;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private String country;
    private String city;
    private String zipcode;

    public Admin() {
    }

    public Admin(long Admin_ID, String fname, String lname, String username, String email, String password, String phoneNumber, String country, String city, String zipcode) {
        this.Admin_ID = Admin_ID;
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.city = city;
        this.zipcode = zipcode;
    }

    public long getAdmin_ID() {
        return Admin_ID;
    }

    public void setAdmin_ID(int Admin_ID) {
        this.Admin_ID = Admin_ID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    
}
