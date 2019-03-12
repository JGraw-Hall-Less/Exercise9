package com.Grajales.projects;


abstract class Contacts{
    private String name;

    public Contacts(String name) {
        this.name = name;
    }

    public abstract void action();
}

class Email extends Contacts{
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void action() {
        System.out.println("Emailing "+email);
    }
}

class Phone extends Contacts{
    private String phone;

    public Phone(String name, String phone) {
        super(name);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void action() {
        System.out.println("Calling "+phone);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Email persona1 = new Email("Toro", "toro.tororo@toro.com");
        persona1.action();
        Phone persona2 = new Phone("Toto", "987-525-4893");
        persona2.action();
    }
}
