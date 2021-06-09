package project2;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import project.MergeSort;
import project.ParkingSpace;

public class Main{
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
        showWindow();                                
	}
    
	public static void showWindow() {
		JFrame frame = new JFrame("University Ranking");  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
	    frame.setSize(850,600);                        
	    frame.getContentPane().setLayout(null);       
	                                                   
	    frame.setLocationRelativeTo(null);             
	    
	    JLabel lbl = new JLabel("Name: ");
	    lbl.setBounds(250, 50, 150, 20);
	    frame.getContentPane().add(lbl);
	    

	    JLabel lbl2 = new JLabel("Ranking number: ");
	    lbl2.setBounds(250, 100, 150, 20);
	    frame.getContentPane().add(lbl2);
	    
	    JLabel label = new JLabel("Country: ");
	    label.setBounds(250, 150, 150, 20);
	    frame.getContentPane().add(label);
	    
	    JLabel label2 = new JLabel("Cost: ");
	    label2.setBounds(250, 200, 150, 20);
	    frame.getContentPane().add(label2);
	    
	    
	    JLabel label3 = new JLabel("Personal opinion: ");
	    label3.setBounds(250, 250, 150, 20);
	    frame.getContentPane().add(label3);
	    
	    JTextArea opinionTxt = new JTextArea();
	    opinionTxt.setBounds(360, 250, 200, 50);
	    opinionTxt.setLineWrap(true);
	    frame.getContentPane().add(opinionTxt);
	    
	    JLabel opinion = new JLabel();
	    opinion.setBounds(330, 200, 250, 20);
	    frame.getContentPane().add(opinion);
	    
	    JButton prevBtn = new JButton("Previous");  
	    prevBtn.setBounds(100, 50, 110, 40);
	    Color lightYellow = new Color(255,255,204);    
	    prevBtn.setBackground(lightYellow);      
	    Color colorBtn = new Color(255,102,102);
	    prevBtn.setForeground(colorBtn);        
	    frame.getContentPane().add(prevBtn);
	    prevBtn.addActionListener(new ActionListener(){        
	    	public void actionPerformed(ActionEvent e){  
	    	
	        }  
	    }); 
		
	    JButton nextBtn = new JButton("Next");
	    nextBtn.setBounds(600,50,110, 40);
	    nextBtn.setBackground(lightYellow);            
	    nextBtn.setForeground(colorBtn);
	    frame.getContentPane().add(nextBtn);
	    nextBtn.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		
	        }  
	    }); 
	    
	   
	    JButton saveBtn = new JButton("Save changes");
	    saveBtn.setBounds(260, 500, 120, 40);
	    Color colorBtn1 = new Color(255,70,70);
	    saveBtn.setBackground(colorBtn1);
	    saveBtn.setForeground(Color.PINK);            
	    frame.getContentPane().add(saveBtn);
	    saveBtn.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		
	        }  
	    }); 
		
	    JButton numSort = new JButton("Sort by ranking number");
	    numSort.setBounds(350, 350, 170, 40);
	  //  Color colorBtn1 = new Color(255,70,70);
	    numSort.setBackground(Color.pink);
	    numSort.setForeground(colorBtn1);             
	    frame.getContentPane().add(numSort);
	    numSort.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    
	    		}});
	    
	    JButton unSort = new JButton("Sort by country");  
	    unSort.setBounds(150, 350, 140, 40);  
	    unSort.setBackground(Color.pink);
	    unSort.setForeground(colorBtn1);
	    frame.getContentPane().add(unSort);
	    unSort.addActionListener(new ActionListener(){        
	    	public void actionPerformed(ActionEvent e){
	    		
	    	}
	    });
	    
	    JButton areaSort = new JButton("Sort by costs");  
	    areaSort.setBounds(570, 350, 140, 40);  
	    areaSort.setBackground(Color.pink);
	    areaSort.setForeground(colorBtn1);
	    frame.getContentPane().add(areaSort);
	    areaSort.addActionListener(new ActionListener(){        
	    	public void actionPerformed(ActionEvent e){
			
	    	}
	    });
	    
	    JButton change = new JButton("Change");  
	    change.setBounds(450, 500, 120, 40); 
	    change.setBackground(colorBtn1);
	    change.setForeground(Color.PINK); 
	    frame.getContentPane().add(change);
	    change.addActionListener(new ActionListener(){        
	    	public void actionPerformed(ActionEvent e){
	    		
	    		
	    	}
	    });
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    frame.setVisible(true);
		
		
	}
	}
