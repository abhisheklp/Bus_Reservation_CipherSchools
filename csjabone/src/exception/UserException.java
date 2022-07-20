package exception;
import java.util.*;
public class UserException extends Throwable {

    public static void main(String[] args) {
        String pass;
        Scanner in = new Scanner(System.in);
        pass=in.next();
//        try {
//            if(pass.length()<8) {
//                //throw new UserException("Invalid Password");
//            }
//        } catch (UserException userException) {
//            System.err.println(userException);
//        }
    }
}
