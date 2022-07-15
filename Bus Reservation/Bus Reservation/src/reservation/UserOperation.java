package reservation;

import java.util.*;

public class UserOperation {

    static List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public boolean verifyEmail(String email) {
        for(User user : userList) {
            if(email.equals(user.getContact().getEmail())) {
                return true;
            }
        }
        return false;
    }

    public boolean verifyPassword(String password) {
        for(User user : userList) {
            if(password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void updateUserName(String email, String newName) {
        for(User user : userList) {
            if(email.equals(user.getContact().getEmail())) {
                user.setContact(new Contact(user.getContact().getEmail(),newName, user.getContact().getPhone()));
            }
        }
    }

    public User findUser(String email) {
        for(User user : userList) {
            if(email.equals(user.getContact().getEmail())) {
                return user;
            }
        }
        return null;
    }

}
