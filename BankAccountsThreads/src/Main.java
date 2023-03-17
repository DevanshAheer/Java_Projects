public class Main {
    public static void main(String[] args) throws Exception{

        BankAccounts bank = new BankAccounts(10);
        //Main obj = null;
        Runnable depositeTask= ()->
        {
            System.out.println("Current balance is 10");
            for(int i=0;i<2;i++)
            {
                bank.Deposite(10);
                System.out.println(bank.getBalance());
            }
        };

        Runnable withdrawTask= ()->
        {
            for(int i=0;i<2;i++)
            {
                bank.Withdraw(10);
                System.out.println(bank.getBalance());
            }
        };

        Thread t1 = new Thread(depositeTask);
        Thread t2 = new Thread(depositeTask);
        //Thread t3 = new Thread(depositeTask);
        t1.start();
        t1.join();

        t2.start();
        t2.join();
        //t1.join();
        //t2.join();
        //t3.start();


        //System.out.println("Hello world!");
    }
}