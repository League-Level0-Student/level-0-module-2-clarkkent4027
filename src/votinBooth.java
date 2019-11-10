import javax.swing.JOptionPane;

public class votinBooth {
public static void main(String[] args) {
	String quantity= JOptionPane.showInputDialog("How old are you?");
	
	int i = Integer.parseInt(quantity);

	if(i < 19) {
	JOptionPane.showMessageDialog(null, "no one cares about you");
		}else {
			JOptionPane.showMessageDialog(null, "who should replace trump");
		

	}
	}
}
