
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

class SBI implements Bank {
    double balance = 10000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("SBI: Deposited Rs." + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("SBI: Withdrawn Rs." + amount);
        } else {
            System.out.println("SBI: Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("SBI Balance: Rs." + balance);
    }
}


class HDFC implements Bank {
    double balance = 20000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("HDFC: Deposited Rs." + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("HDFC: Withdrawn Rs." + amount);
        } else {
            System.out.println("HDFC: Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("HDFC Balance: Rs." + balance);
    }
}

public class BankInterfaceDemo {
    public static void main(String[] args) {

        Bank sbi = new SBI();
        sbi.deposit(5000);
        sbi.withdraw(3000);
        sbi.checkBalance();

        System.out.println();

        Bank hdfc = new HDFC();
        hdfc.deposit(4000);
        hdfc.withdraw(10000);
        hdfc.checkBalance();
    }
}