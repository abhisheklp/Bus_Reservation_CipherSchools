package reservation;
import java.util.*;

public class MainPanel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //String name,email,street,city,state,password;
        //long phone;
//        System.out.println("Enter Name :- ");
//        name=input.next();
//        System.out.println("Enter Email :- ");
//        email=input.next();
//        System.out.println("Enter Phone No. :- ");
//        phone=input.nextLong();
//        System.out.println("Enter Street :- ");
//        street=input.next();
//        System.out.println("Enter City :- ");
//        city=input.next();
//        System.out.println("Enter State :- ");
//        state=input.next();
//        System.out.println("Enter Password :- ");
//        password=input.next();

//        LoginSignUp signup = new LoginSignUp();
//        //signup.signUp(name,phone,email,street,city,state,password);
//        System.out.println(signup.signUp("Abhishek",9157806213l,"abhisheklp50@gmail.com","Chanod","Vapi","Gujarat","@Ab932847"));
//        System.out.println(signup.login("abhisheklp50@gmail.com","@Ab932847"));
        BusOperations busOperations = new BusOperations();
        busOperations.addBus("HR0001","xyz","Delhi","Jalandhar",440);
        busOperations.addBus("DL0002","abc","Panchkula","Delhi",580);
        busOperations.addBus("PB0003","ijk","Jalandhar","Lucknow",640);
        busOperations.addBus("GJ0004","mno","Vapi","Surat",110);

        System.out.println(busOperations.searchBus("Vapi","Surat"));


    }
}
