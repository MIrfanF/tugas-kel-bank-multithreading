package tugasKelPekan13;

/**
 * Class Multithreading (Main Class dimana multithreading dijalankan)
 *
 * @author Kel 01 - PBO 01
 * @author Muhammad Irfan Fakhrianto - 1806200356
 * @author Rifqi Hari Putranto - 1806200192
 * @author Syahmi Mutahajjid - 1806200034
 */
public class Multithreading {
	
	/**
	* main method
	* @param args input argumen
	*/
	public static void main(String args[]) {
		SavingsAccount savingsAccountObject = new SavingsAccount();
		
        Thread1 t1 = new Thread1(savingsAccountObject);
		Thread2 t2 = new Thread2(savingsAccountObject);
		
		t1.start();
		t2.start();
	}
}