package awtExamples;

import java.awt.Button;
import java.awt.Frame;

public class FirstExample extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2226497943609152876L;

	public FirstExample() {

		Button b = new Button("Click Me");
		b.setBounds(30, 100, 80, 30);

		add(b);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {

		FirstExample f = new FirstExample();
		
		/*f.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent we) {
	            dispose();
	         }
	     }
	);
*/
	}

}
