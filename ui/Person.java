package ui;

public class Person {

    private String firstName = null;
    private String lastName = null;
    private String addres = null;

    public Person() {
    }

    public Person(String firstName, String lastName, String addres) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addres = addres;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getAddres() {
    	return addres;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}