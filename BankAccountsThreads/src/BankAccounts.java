import java.util.concurrent.locks.ReentrantLock;

public class BankAccounts extends Thread{
    private int balance;
    //private ReentrantLock lock = new ReentrantLock();
    BankAccounts(int balance)
    {
        this.balance = balance;
    }

    public void Deposite(int Amount)
    {
        //lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" Acquired lock..");
            balance += Amount;
        }finally{
            System.out.println(Thread.currentThread().getName()+" Released Lock..");
            //lock.unlock();
            //System.out.println(Thread.currentThread().getName()+" Released Lock..");
        }
        //balance += Amount;
    }

    public void Withdraw(int Amount)
    {
        //lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" Acquired lock..");
            if (Amount > balance) {
                System.out.println(" Error...");
                throw new IllegalAccessException();
            }
            else {
                balance -= Amount;
            }
        }catch(IllegalAccessException e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println(Thread.currentThread().getName()+" Released Lock..");
            //lock.unlock();
            //System.out.println(Thread.currentThread().getName()+" Released Lock..");
        }
    }

    public int getBalance()
    {
        //System.out.println("Currennt Balance: "+this.balance);
        return this.balance;
    }
}
