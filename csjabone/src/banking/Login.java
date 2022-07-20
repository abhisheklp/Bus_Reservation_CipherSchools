package banking;
import java.util.*;

//extends Menu
public class Login  {
    private static int accno=987654321;

    public static final int passLen=8;

    void acceptInput() {
        Scanner input = new Scanner(System.in);
        int accN = input.nextInt();
        input.nextLine();
        String s = input.nextLine();

        if(accN==accno && verify(s)) {
            System.out.println("Login Successful.......");

            Menu m1 = new Menu();
            Banking b1 = new Banking();
            boolean flag=true;
            while (flag) {

                switch (m1.Options()) {

                    case 1:
                        System.out.println("Enter the withdrawal amount........");
                        int amt1 = input.nextInt();
                        b1.withdraw(amt1);
                        break;

                    case 2:
                        System.out.println("Enter the deposit amount........");
                        int amt2 = input.nextInt();
                        b1.add(amt2);
                        break;

                    case 3:
                        System.out.println("Your remaining balance is........");
                        b1.getBalance();
                        break;

                    case 4:
                        System.out.println("Terminating Session........");
                        flag=false;
                        break;

                    default:
                        System.out.println("Enter valid entry........");
                }
            }
        }
        else {
            System.out.println("Login Unsuccessful.......");
        }
    }

    public boolean verify(String passW) {
        if(is_validPassword(passW)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean is_validPassword(String password) {
        if(password.length()<passLen) return false;
        int charCount=0;
        int numCount=0;
        for(int i=0;i<password.length();i++) {
            char ch = password.charAt(i);

            if(is_Numeric(ch)) numCount++;
            else if(is_Letter(ch)) charCount++;
            else return false;
        }
        return (numCount>=2 && charCount>=2);
    }

    public static boolean is_Numeric(char ch) {
        return (ch>='0' && ch<='9');
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch>='A' && ch<='Z');
    }
}
