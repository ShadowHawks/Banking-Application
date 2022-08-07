
public class BankAccount {

    //Knows that this is private and it's a double
private double balance;

public void BankAccount() //setter
{
    balance = 0.0;
}
// there is a constructor called BankAccount
public  BankAccount(double startBalance)
{

    balance = startBalance;
}
public BankAccount(String str)
{
    balance = Double.parseDouble(str);
}
//Depositing method
public void deposit (String str)
{
    balance += Double.parseDouble(str);
}
public void deposit(double amount)
{
    balance += amount;
}
//Withdrawal
public void withdraw( String str)
{

    balance -= Double.parseDouble(str);
}
public void withdraw(double amount)
{
    balance -= amount;
}
//back to setting

public void setBalance(double b, String str)
{
    balance = b;
    balance = Double.parseDouble(str);
}

public double getBalance()
{
    return balance;
}
}





