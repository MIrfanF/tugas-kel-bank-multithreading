package tugasKelPekan13;

/**
 * Class SavingsAccount untuk membuat akun baru berisi uang nasabah, yang bisa digunakan untuk mengambil dan menabung uang
 *
 * @author Kel 01 - PBO 01
 * @author Muhammad Irfan Fakhrianto - 1806200356
 * @author Rifqi Hari Putranto - 1806200192
 * @author Syahmi Mutahajjid - 1806200034
 */

public class SavingsAccount {
    private float balance = 1000;

    /**
     * method withdraw / pengambilan uang
     * @param anAmount jumlah uang yang diambil
     */
    public void withdraw(float anAmount) {
    	System.out.println("Withdrawing...");
        if (anAmount<0.0) {
        	throw new IllegalArgumentException("Withdraw Amount Negative");
            //jika anAmount kurang dari 0 melempar exception
        }
        
//		kode awalnya
//		synchronized(this) {
//			if (anAmount<=balance) {
//		  		balance = balance - anAmount;
//		  		System.out.println("Withdraw completed...");
//		  		System.out.println("Current Balance After Withdraw : " + balance + "\n");
//		  	}
//    	}
//		diubah menjadi
       
        if (anAmount<=balance) {
        	synchronized(this) {
                balance = balance - anAmount;
                System.out.println("Withdraw Completed...");
                System.out.println("Current Balance After Withdraw : " + balance + "\n");
            }
        }
        else {
        	throw new IllegalArgumentException("Balance is Not Enough");
        }
    }

    /**
     * method deposit / menyimpan uang untuk ditabung
     * @param anAmount jumlah uang yang ditabung
     */
    public void deposit(float anAmount) {
    	// anAmount ini berbeda dari anAmount withdraw karena berbeda method
        System.out.println("Depositing...");
        if (anAmount<0.0) {
            throw new IllegalArgumentException("Deposit Amount Negative");
            //jika anAmount kurang dari 0 melempar exception
        }
        synchronized(this) {
            balance = balance + anAmount;
            System.out.println("Deposit Completed... ");
            System.out.println("Current Balance After Deposit : " + balance + "\n");
        }
    }
}
