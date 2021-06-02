package tugasKelPekan13;

/**
 * Class Thread2 sebagai Thread Kedua dengan extend Thread
 *
 * @author Kel 01 - PBO 01
 * @author Muhammad Irfan Fakhrianto - 1806200356
 * @author Rifqi Hari Putranto - 1806200192
 * @author Syahmi Mutahajjid - 1806200034
 */
public class Thread2 extends Thread {
    SavingsAccount savingsAccountObject;

    /**
     * Constructor untuk Thread2
     * @param savingsAccountObject Object SavingsAccount
     */
    Thread2(SavingsAccount savingsAccountObject) {
        this.savingsAccountObject = savingsAccountObject;
    }

    /**
     * method untuk Run Thread2
     */
    public void run() {
        savingsAccountObject.withdraw(100);
        // -100
        savingsAccountObject.withdraw(200);
        // -200
        savingsAccountObject.withdraw(400);
        // -2000
    }
}
