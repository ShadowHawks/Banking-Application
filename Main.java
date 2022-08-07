import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String input;
        //Greet and ask for starting balance.
      System.out.println("Welcome to Hawk's Bank!");

        input = JOptionPane.showInputDialog("What is your account's starting balance?");

        //Create BankAccount object

        BankAccount account = new BankAccount(input);

        //get their pay
        input = JOptionPane.showInputDialog("How much were you paid this month?");

        account.deposit(input);
//Display the new balance
        JOptionPane.showMessageDialog(null, String.format("Your pay has been deposited.\n" +
                "Your current balance is $%,.2f",account.getBalance()));

        //Withdraw some amount
        input = JOptionPane.showInputDialog("How much would you like to withdraw?");

        account.withdraw(input);

        //Display the new balance
        JOptionPane.showMessageDialog(null, String.format("Your withdrawal has been processed.\n" +
                "Your current balance is $%,.2f", account.getBalance()));

        System.exit(0);
    }
}
