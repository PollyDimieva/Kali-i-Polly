package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
		            frame.setVisible(false);

		            // frame to contains GUI elements
		            JFrame f = new JFrame("file chooser");

		            // set the size of the frame
		            f.setSize(400, 400);
		            f.setLocationRelativeTo(null); 
		            // set the frame's visibility
		            f.setVisible(true);

		            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		            // button to open save dialog
		            JButton button1 = new JButton("save");
		            
		            button1.addActionListener(new ActionListener(){  
				    	public void actionPerformed(ActionEvent e){  
				            f.setVisible(false);
				            MainWindow.showWindow();
				        }  
				    }); 
		            

		            // button to open open dialog
		            JButton button2 = new JButton("open");

		            // make an object of the class filechooser
		            FileChooser f1 = new FileChooser();

		            // add action listener to the button to capture user
		            // response on buttons
		            button1.addActionListener(f1);
		            button2.addActionListener(f1);

		            // make a panel to add the buttons and labels
		            JPanel p = new JPanel();

		            // add buttons to the frame
		            p.add(button1);
		            p.add(button2);

		            // set the label to its initial value
		            
		            FileChooser.l = new JLabel("no file selected");

		            // add panel to the frame
		            p.add(FileChooser.l);
		            f.add(p);

		            f.show();
		           
		        }  
		    });   
		    
		    
		    
		    
		    
		    frame.setVisible(true);              //zaduljitelno frame-a trqbva da e visible, inache nishto nqma da izleze
			
		    
		    
		}
		
	}