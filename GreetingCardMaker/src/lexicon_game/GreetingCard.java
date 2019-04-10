package lexicon_game;
import javax.swing.*; 

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetingCard extends JFrame{
	public GreetingCard(){
		setTitle("Create personalized greeting cards");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JPanel second_panel=new JPanel();
		
		JLabel firstLabel = new JLabel("Input the name of the person", JLabel.LEFT);
		firstLabel.setBounds(50, 30, 200, 20);
		
		final JTextField txt1 = new JTextField(20);
		txt1.setBounds(50, 80, 200, 20);	
		//txt1.setText("Hello" + txt1.getText());
		
		JCheckBox checkBox1 = new JCheckBox("Chrismas");  
        checkBox1.setBounds(100,100, 150,50);  
        JCheckBox checkBox2 = new JCheckBox("Birthday", true);  
        checkBox2.setBounds(100,150, 150,50);
        JCheckBox checkBox3 = new JCheckBox("Easter");  
        checkBox3.setBounds(100,200, 150,50);  
        JCheckBox checkBox4 = new JCheckBox("New year");  
        checkBox4.setBounds(100,250, 150,50);
        
        ButtonGroup b = new ButtonGroup();
        b.add(checkBox1);
        b.add(checkBox2);
        b.add(checkBox3);
        b.add(checkBox4);
     
         
        JButton myButton1 = new JButton("Make card");
		myButton1.setBounds(80, 300, 100, 30);
		myButton1.setBackground(Color.PINK);
		myButton1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					
					}
					
				
			});	
		JButton myButton2 = new JButton("Close");
		myButton2.setBounds(220, 300, 100, 30);
		myButton2.setBackground(Color.RED);
		myButton2.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					System.exit(0);				
				}			
			});
      		
		panel.add(firstLabel);
		panel.add(txt1);
		panel.add(checkBox1);  
	    panel.add(checkBox2);
	    panel.add(checkBox3);  
	    panel.add(checkBox4);
		panel.add(myButton1);
		panel.add(myButton2);

		//second_panel.add(myButton2);
		
		
		//CardLayout cl = new CardLayout();
		//panel.setLayout(cl);
		//panel.add(second_panel, "2");
	}
}
