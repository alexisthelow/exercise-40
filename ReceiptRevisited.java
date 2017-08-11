import java.io.PrintWriter;

public class ReceiptRevisited {
	public static void main(String [] args) throws Exception {
		PrintWriter fileout = new PrintWriter("receipt.txt");
		
		fileout.println("+------------------------+");
		fileout.println("|                        |");
		fileout.println("|      CORNER STORE      |");
		fileout.println("|                        |");
		fileout.println("| 2017-08-01  14:29pm    |");
		fileout.println("|                        |");
		fileout.println("| Gallons:       10.870  |");
		fileout.println("| Price/gallon: $ 2.299  |");
		fileout.println("|                        |");
		fileout.println("| Fuel total:   $ 24.99  |");
		fileout.println("|                        |");
		fileout.println("+------------------------+");
		fileout.close();
	}
}