package tugasKelPekan13;

/**
 * Class Thread1 sebagai Thread Pertama dengan extend Thread
 *
 * @author Kel 01 - PBO 01
 * @author Muhammad Irfan Fakhrianto - 1806200356
 * @author Rifqi Hari Putranto - 1806200192
 * @author Syahmi Mutahajjid - 1806200034
 */
public class Thread1 extends Thread {
    SavingsAccount savingsAccountObject;

    /**
     * Constructor untuk Thread1
     * @param savingsAccountObject Object SavingsAccount
     */
    Thread1(SavingsAccount savingsAccountObject) {
        this.savingsAccountObject = savingsAccountObject;
    }

    /**
     * method untuk Run Thread1
     */
    public void run() {
        savingsAccountObject.deposit(500);
        // +500
        savingsAccountObject.deposit(5000);
        // +5000
        savingsAccountObject.deposit(500);
        // +500
    }
}