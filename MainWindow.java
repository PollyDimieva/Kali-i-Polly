package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class MainWindow {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
        showWindow();                                
	}
    
	public static void showWindow() {
		
		JFrame frame = new JFrame("Parking spaces");  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
	    frame.setSize(800,600);                        
	    frame.getContentPane().setLayout(null);       
	                                                   
	    frame.setLocationRelativeTo(null);             
	    
	    JLabel lbl = new JLabel("Parking space No. ");
	    lbl.setBounds(100, 50, 150, 20);
	    
	    frame.getContentPane().add(lbl);
	    
	    
	    
	    JLabel lbl2 = new JLabel("Area:  ");
	    lbl2.setBounds(100, 100, 150, 20);
	    frame.getContentPane().add(lbl2);
	    
	    JLabel label = new JLabel("Username: ");
	    label.setBounds(100, 150, 150, 20);
	    frame.getContentPane().add(label);
	    
	    JTextArea txt = new JTextArea();
	    txt.setBounds(200, 150, 250, 20);
	    frame.getContentPane().add(txt);
	    
	    JLabel label1 = new JLabel("Description: ");
	    label1.setBounds(100, 200, 150, 20);
	    frame.getContentPane().add(label1);
	    
	    JTextArea txt1 = new JTextArea();
	    txt1.setBounds(200, 200, 250, 100);
	    txt1.setLineWrap(true);
	    frame.getContentPane().add(txt1);
	    
	    JLabel lbl3 = new JLabel("Insert number of parking space:  ");
	    lbl3.setBounds(300, 370, 250, 20);
	    frame.getContentPane().add(lbl3);
	    
	    JTextArea txt2 = new JTextArea();
	    txt2.setBounds(485, 370, 45, 20);
	    frame.getContentPane().add(txt2);
	    
	    JButton button = new JButton("Previous");  
	    button.setBounds(100, 450, 110, 40);
	    Color lightYellow = new Color(255,255,204);    
	    button.setBackground(lightYellow);      
	    Color colorBtn = new Color(255,102,102);
	    button.setForeground(colorBtn);        
	    frame.getContentPane().add(button);
	    button.addActionListener(new ActionListener(){        
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);                           
	          
	        }  
	    }); 
	    
	    JButton watchingButton = new JButton("Next");
	    watchingButton.setBounds(600,450,110, 40);
	    watchingButton.setBackground(lightYellow);            
	    watchingButton.setForeground(colorBtn);
	    frame.getContentPane().add(watchingButton);
	    watchingButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	        
	        }  
	    }); 
	    
	   
	    JButton smthUnusualButton = new JButton("Save changes");
	    smthUnusualButton.setBounds(300, 450, 230, 40);
	    Color colorBtn1 = new Color(255,70,70);
	    smthUnusualButton.setBackground(colorBtn1);
	    smthUnusualButton.setForeground(Color.PINK);            
	    frame.getContentPane().add(smthUnusualButton);
	    smthUnusualButton.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	            frame.setVisible(false);
	         
	        }  
	    }); 
	    
	    JButton button1 = new JButton("Search");  
	    button1.setBounds(360, 400, 110, 40);
	   // Color lightYellow = new Color(255,255,204);    
	   // button1.setBackground(lightYellow);      
	  //  Color colorBtn = new Color(255,102,102);
	  //  button1.setForeground(colorBtn);         
	    JButton btn = new JButton("Choose file");
	    btn.setBounds(300, 320, 230, 40);
	  //  Color colorBtn1 = new Color(255,70,70);
	  //  smthUnusualButton.setBackground(colorBtn1);
	    btn.setForeground(Color.PINK);             //i otnovo za posledniq ni buton 
	    frame.getContentPane().add(btn);
	    btn.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	           String savedAdress ="";
	    		       JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

	    		       j.setAcceptAllFileFilterUsed(false);

	    		       j.setDialogTitle("Select a .txt file");

	    		       // only allow files of .txt extension
	    		       FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
	    		       j.addChoosableFileFilter(restrict);

	    		       // invoke the showsSaveDialog function to show the save dialog
	    		       int r = j.showSaveDialog(null);

	    		       // if the user selects a file
	    		       if (r == JFileChooser.APPROVE_OPTION)

	    		       {
	    		           // set the label to the path of the selected file
	    		    	    savedAdress = j.getSelectedFile().getAbsolutePath();
	    		           
	    		       }
	    		       File file = new File(savedAdress);
	    		       String text = "";
	    		        try {
	    		            Scanner myReader = new Scanner(file);
	    		               
	    		                text = myReader.nextLine();
	    		                lbl.setText(lbl.getText()+text);
	    		                text = myReader.nextLine();
	    		            	lbl2.setText(lbl2.getText()+text);
	    		                
	    		           
	    		            myReader.close();
	    		        } catch (FileNotFoundException e1) {
	    		            try {
	    		                file.createNewFile();
	    		            } catch (IOException e2) {
	    		                // TODO Auto-generated catch block
	    		                e2.printStackTrace();
	    		            }
	    		      
	  
	    		        } }});   
	    
	    		    
	    
	    
	    
	    frame.setVisible(true);
		
	    
	    
	
	}	        
}
	