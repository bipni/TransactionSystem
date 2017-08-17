package MT;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class V_UserStatus extends JFrame {

	public JScrollPane scroll = new JScrollPane();
	public JPanel p = new JPanel();
	
	V_UserStatus() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("User Registratio");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		initComponents();
	}

	private void initComponents() {
		
		p.setLayout(null);
		
		scroll.setBounds(5, 40, 485, 425);
		scroll.add(p);
		this.add(scroll);
	}
}
