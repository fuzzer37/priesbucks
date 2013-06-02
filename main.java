import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		while (1==1){
		String fn = JOptionPane.showInputDialog("How many priesbucks do you have?");
		String sn = JOptionPane.showInputDialog("Whats the exchange rate?");
		
		float num1 = Float.parseFloat(fn);
		float num2 = Float.parseFloat(sn);
		
		float sum = num1 * num2;
		
		JOptionPane.showMessageDialog(null, sum, "priesbucksConverer", JOptionPane.PLAIN_MESSAGE);
		
		}
	}

}
