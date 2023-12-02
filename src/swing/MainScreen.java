package swing;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;    
public class MainScreen extends JFrame{    
JProgressBar jb;    
int i=0,num=0;     
MainScreen(){
	setTitle("Electricity Bill Management System");    
jb=new JProgressBar(0,2000);    
jb.setForeground(new Color(255, 128, 128));
jb.setBounds(191,431,466,37);         
jb.setValue(0);    
jb.setStringPainted(true);    
getContentPane().add(jb);    
setSize(880,575);    
getContentPane().setLayout(null);    
JLabel lblNewLabel = new JLabel("Please Wait...");
lblNewLabel.setForeground(new Color(0, 255, 0));
lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 20));
lblNewLabel.setBounds(191, 390, 154, 30);
getContentPane().add(lblNewLabel);
JLabel lblNewLabel_2 = new JLabel("Electricity Managemenet System");
lblNewLabel_2.setForeground(new Color(0, 255, 255));
lblNewLabel_2.setFont(new Font("Imprint MT Shadow", Font.BOLD | Font.ITALIC, 30));
lblNewLabel_2.setBounds(189, 240, 507, 44);
getContentPane().add(lblNewLabel_2);
JLabel lblNewLabel_1 = new JLabel("New label");
lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\a2392618849_10.jpg"));
lblNewLabel_1.setBounds(-43, 22, 1009, 536);
getContentPane().add(lblNewLabel_1);
JTextArea textArea = new JTextArea();
textArea.setText("");
textArea.setBounds(601, 278, 5, 22);
getContentPane().add(textArea);
}    
public void iterate(){    
while(i<=2000){    
  jb.setValue(i);    
  i=i+20;    
  try{Thread.sleep(150);}catch(Exception e){}  
  if(i==2000) {
	  dispose();
	  Home a = new Home();
	  a.show();  
  }
}    
}    
public static void main(String[] args) {    
	MainScreen m=new  MainScreen();    
    m.setVisible(true);    
    m.iterate();    
}    
}    