import javax.swing.JOptionPane;

public class rollerCoaster {
	public static void main(String[] args) {
		
	
	String quantity= JOptionPane.showInputDialog("How tall are you in inches?");
	
int i = Integer.parseInt(quantity);

if(i < 48) {
JOptionPane.showMessageDialog(null, "sorry, u too short");
	}else {
		JOptionPane.showMessageDialog(null, "you cool kid");
	

}
}
}