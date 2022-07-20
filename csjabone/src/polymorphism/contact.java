package polymorphism;

public class contact {

    void createContact(String name, int number1, int number2) {
        System.out.println("Name :- "+name+" Number1 :- "+number1+" Number2 :- "+number2);
    }

    void createContact(int number1, int number2) {
        System.out.println("Number1 :- "+number1+" Number2 :- "+number2);
    }

    public static void main(String[] args) {

        contact Contact = new contact();
        Contact.createContact("Kamlesh",1,2);
        contact Contact1 = new contact();
        Contact1.createContact(1,2);
    }

}
