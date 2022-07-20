package banking;
//extends Login
public class Banking {

    int amount = 1000;

    // initiate method
    void initiate() {
        System.out.println("Please Enter A/c number and paasword");
        Login l1 = new Login();
        l1.acceptInput();
    }

    //show balance in bank a/c
    void getBalance() {
        System.out.println(amount);
    }

    //add amount in bank a/c
    void add(int amt) {
        amount+=amt;
    }

    //withdraws amount from bank a/c
    void withdraw(int amt) {
        if(amt>amount) {
            System.out.println("Entered amount is more than the remaining balance");
        }
        else amount-=amt;
    }
}
