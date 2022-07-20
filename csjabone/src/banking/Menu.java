package banking;
import java.util.*;

public class Menu {

    public static int Options() {
        System.out.print("Select Options from drop down menu......\n1.Withdrwal\n2.Deposit\n3.Check Balance\n4.Terminate Session\n");
        Scanner input = new Scanner(System.in);
        int inp = input.nextInt();

        if(inp<=4 && inp>=1) {
            return inp;
        }
        else {
            return 0;
        }
    }
}
