package reservation;
import java.util.*;

public class LoginSignUp {
    List<User> userList = new ArrayList<>();
    public String signUp(String name, long phone, String email, String street, String city, String state, String password) {
        for(User user : userList) {
            if(user.getContact().getEmail().equals(email)) {
                return "Email ID already taken....";
            }
        }

        Contact contact = new Contact(email,name,phone);
        Address address = new Address(street,city,state);
        User user = new User(address,contact,password);
        userList.add(user);
        return "SignUp Successful.... ";
    }

    public String login(String email, String password) {
        for(User user : userList) {
            if(!email.equals(user.getContact().getEmail())) {
                return "Username Incorrect....";
            }
            if(!password.equals(user.getPassword())) {
                return "Password Incorrect....";
            }
        }
        return "Login Successful....";
    }
}
