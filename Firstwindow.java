
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


//import java.awt.*; Little did i know, these two imports can be used to import all the above imports....the astrc (*) lets you import everything in that library

//import javax.swing.*;


public class Firstwindow extends JFrame {

	private static final long serialVersionUID = 1L;
	


	
public Firstwindow() {
	super(" This is the title of the window"); // the super is just refering to the class which we are extending which is JFrame
	
	
	setSize(600, 400);// 600 by 400 pixels window size
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	JPanel p = new JPanel();  // These are panels
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel(new GridBagLayout()); // instead of having a defualt constractor now we are allowing this JPanel to have access to the GridBagConstraint we created but we have not implemented, you implement it by when we are adding the individual components to a panel
	
	
	JButton b = new JButton("Button 1");	
	JButton d = new JButton("Button 2");
	
	

		
	
	
JCheckBox cb = new JCheckBox("This is a CheckBox cb");	
JCheckBox cb2 = new JCheckBox("This is CheckBox cb2");


	
	
	
	
	JTextArea ta = new JTextArea("This is a text are");
	JTextField tf = new JTextField("This is a text field");
	JLabel jl = new JLabel("This is a labale");
	
	
	GridBagConstraints gbc = new GridBagConstraints();  // Helps us organize a panel (with spacing, orientation etc)
	gbc.insets = new Insets(15,15,15,15);  // *insets is spacing
	
	
	p.add(d);  // So here we added both our button to the panel.
	p.add(b);
	p2.add(cb); //using BorderLayout you can orient where you want your components
	p2.add(cb2);
	
	gbc.gridx = 2;  // Positioning the gbc using x and y cordinate system....Notice that order does matter in this layout (we are continiously chaning the position of gbc by moving it along the x and y cordinates
	gbc.gridy = 0;
	
	p3.add(tf,gbc);  //adding the GridBagConstraints with the gbc
	
	gbc.gridx = 1;
	gbc.gridy = 1;
	
	p3.add(ta,gbc); //adding the GridBagConstraints with the gbc
	
	gbc.gridx = 0;
	gbc.gridy = 2;
	p3.add(jl,gbc); //adding the GridBagConstraints with the gbc
	
	
	add(p,BorderLayout.SOUTH);  // and here we are adding the panel to the.....KEY using just "add" alone will alow us to add p panel to our JFrame 
	add(p2,BorderLayout.CENTER);  //using BorderLayout you can orient where you want your components
	add(p3,BorderLayout.NORTH);
	
	
	
	
	d.addActionListener(new ActionListener() {   // Button 2 is defined as d and the addActionListener is designed for button 2
		
		public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
		
if(cb.isSelected()){
			
	System.out.println("cb is selected");
	JOptionPane.showMessageDialog(null,"cb is selected");
	
	
	
	
	if(cb2.isSelected()){
						
			System.out.println("cb2 is selected");


	
}
		
}
	
		
			
		
			JOptionPane.showMessageDialog(null,"this is the message that pops up for Button 2"); // if you get rid of e u get just the message ....lesson 34......s is a string we defined up top
			
		}

		
	});
	
	
	
	
	
	

}
}

	
	








