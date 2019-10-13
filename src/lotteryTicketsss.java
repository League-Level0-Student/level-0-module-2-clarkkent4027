import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryTicketsss {
public static void main(String[] args) {
	int num = 0;
	
	Random factory = new Random();
	num = factory.nextInt(200);

	int numb = 0;
	numb = factory.nextInt(200);
	
	int numbe = 0;
	numbe = factory.nextInt(200);
	
	int nu = 0;
	nu = factory.nextInt(200);
	
	int n = 0;
	n = factory.nextInt(200);
	
	String message = "";
	String and = ",";
	
	message +=  num;
	message += and;
	message +=  numb;
	message += and;
	message +=  numbe;
	message += and;
	message +=  nu;
	message += and;
	message +=  n;
			
JOptionPane.showMessageDialog(null, "Your numbers are " + message);
}
}
