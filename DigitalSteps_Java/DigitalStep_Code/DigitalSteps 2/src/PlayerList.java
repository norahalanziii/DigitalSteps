/**
 *
 * @author Huawei
 */

// Wajood
/*
This file has 2 classes 
Player: this class has the player attribues and its setters and getters
PlayerList: this class implemented using Linked List Data structure, the node will have an object
from Player Class and each object will represent a record in the database

this classes are used so we can access data like username easily to help with the program flow
*/

public class PlayerList {

    private class Node {

        Player player; 

        private Node next, prev;

        public Node() {
        }

        public Node(Player player, Node next, Node prev) {
            this.player = player;
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

        public Player getPlayer() {
            return player;
        }

        public void setPlayer(Player player) {
            this.player = player;
        }

    } // end Node

    Node head = null;
    Node tail = null;

    int size = 0;

    public PlayerList() {
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public Player firstPlayer() {
        return (isEmpty()) ? null : head.getPlayer();
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
            System.out.println("PLAYER #" + counter + ": " + current.getPlayer().getUsername());
            current = current.getNext();
            counter++;
        } while (current != head);

    }

    public void addFirst(Player player) {

        Node newNode = new Node(player, null, null);

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
        System.out.println("The PLAYER has been added");

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
        System.out.println("The first PLAYER has been deleted");
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

            if (current.getPlayer().getUsername() == username) {
                System.out.println("The Player #" + username + " Has Been Found.");
                found = true;
                return;
            }
            current = current.next;

        } while (current != head);

        if (!found) {
            System.out.println("The PLAYER #" + username + " Not Found.");
        }

    }

    public String getUsername(Player player) {
        return player.getUsername();
    }

}

 class Player {

    private int Player_ID;
    private String fname;
    private String lname;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private String country;
    private String level;

    public Player() {
    }


    public Player(int Player_ID, String fname, String lname, String username, String email, String password, String phoneNumber, String country, String level) {
        this.Player_ID = Player_ID;
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.level = level;
    }
    
    
    public int getPlayer_ID() {
        return Player_ID;
    }

    public void setPlayer_ID(int Player_ID) {
        this.Player_ID = Player_ID;
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
    

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    
}
