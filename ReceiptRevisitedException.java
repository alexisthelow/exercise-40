import java.io.IOException;
import java.io.PrintWriter;

public class ReceiptRevisitedException {
	public static void main(String [] args) throws Exception {
		PrintWriter fileout;

		try {
			fileout = new PrintWriter("receipt.txt");
		}
		catch (IOException err) {
			System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
			System.out.println("Maybe the file exists and is read-only?");
			fileout = null;
			System.exit(1);
		}
		
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