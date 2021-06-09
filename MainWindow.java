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
import javax.swing.JOptionPane;
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
		int N = 7;
		ParkingSpace[] list = new ParkingSpace[N];
		
		for(int i=0; i<N; i++) {
			list[i] = new ParkingSpace();
			list[i].setNumber(i+1);
			if(i%3==0) {
				list[i].setArea(16);
			}else if(i%3==1) {
				list[i].setArea(15);
			}else {
				list[i].setArea(17);
			}
			list[i].setDescription("");
			list[i].setUserName("");
		}
	     AreaComparator ac = new AreaComparator();
	     UserNameComparator unc = new UserNameComparator();
	     NumberComparator nc = new NumberComparator();
			
			for (int i = 0; i < list.length; i++)
				System.out.print(list[i] + " ");
	
		
		JFrame frame = new JFrame("Parking spaces");  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
	    frame.setSize(850,600);                        
	    frame.getContentPane().setLayout(null);       
	                                                   
	    frame.setLocationRelativeTo(null);             
	    
	    
	    
	    JLabel psnlbl = new JLabel("Parking space No. ");
	    psnlbl.setBounds(250, 50, 150, 20);
	    frame.getContentPane().add(psnlbl);
	    
	    JLabel number = new JLabel();
	    number.setBounds(360, 50, 150, 20);
	    number.setText(""+list[0].getNumber());
	    frame.getContentPane().add(number);
	    
	    
	    
	    JLabel psalbl = new JLabel("Area:  ");
	    psalbl.setBounds(250, 100, 150, 20);
	    frame.getContentPane().add(psalbl);
	    
	    JLabel area = new JLabel();
	    area.setBounds(290, 100, 150, 20);
	    area.setText(""+list[0].getArea());
	    frame.getContentPane().add(area);
	    
	    JLabel psunlbl = new JLabel("Username: ");
	    psunlbl.setBounds(250, 150, 150, 20);
	    frame.getContentPane().add(psunlbl);
	    
	    JTextArea untxt = new JTextArea();
	    untxt.setBounds(320, 150, 200, 20);
	    frame.getContentPane().add(untxt);
	    
	    JLabel userName = new JLabel();
	    userName.setBounds(330, 150, 250, 20);
	    frame.getContentPane().add(userName);
	    
	    JLabel psdlbl = new JLabel("Description: ");
	    psdlbl.setBounds(250, 200, 150, 20);
	    frame.getContentPane().add(psdlbl);
	    
	    JTextArea descrTxt = new JTextArea();
	    descrTxt.setBounds(320, 200, 200, 100);
	    descrTxt.setLineWrap(true);
	    frame.getContentPane().add(descrTxt);
	    
	    JLabel description = new JLabel();
	    description.setBounds(330, 200, 250, 20);
	    frame.getContentPane().add(description);
	    
	    JLabel lbl = new JLabel("Insert number of parking space:  ");
	    lbl.setBounds(300, 410, 250, 20);
	    frame.getContentPane().add(lbl);
	    
	    JTextArea searchTxt = new JTextArea();
	    searchTxt.setBounds(485, 410, 45, 20);
	    frame.getContentPane().add(searchTxt);
	    
	    
	    JButton prevBtn = new JButton("Previous");  
	    prevBtn.setBounds(100, 50, 110, 40);
	    Color lightYellow = new Color(255,255,204);    
	    prevBtn.setBackground(lightYellow);      
	    Color colorBtn = new Color(255,102,102);
	    prevBtn.setForeground(colorBtn);        
	    frame.getContentPane().add(prevBtn);
	    prevBtn.addActionListener(new ActionListener(){        
	    	public void actionPerformed(ActionEvent e){  
	    		ParkingSpace ps = new ParkingSpace();
	    		for(int i=0;i<N;i++) {
	    			if(list[i].getNumber()==Integer.parseInt(number.getText())) {
	    				if(i>0) {
	    				ps=list[i-1];
	    				}else {
	    					JOptionPane.showMessageDialog(frame, "This is the first parking space");
	    				}
	    			}
	    		}
	    		number.setText(""+ps.getNumber());
	    		area.setText(""+ ps.getArea());
	    		if(ps.getUserName().equals("")) {
	    			userName.setVisible(false);
	    			untxt.setVisible(true);
	    		}else {
	    			untxt.setVisible(false);
	    			userName.setText(ps.getUserName());
	    			userName.setVisible(true);
	    		}
	    		if(ps.getDescription().equals("")) {
	    			description.setVisible(false);
	    			descrTxt.setVisible(true);
	    		}else {
	    			descrTxt.setVisible(false);
	    			description.setText(ps.getDescription());
	    			description.setVisible(true);
	    		}
	        }  
	    }); 
	    
	    JButton nextBtn = new JButton("Next");
	    nextBtn.setBounds(600,50,110, 40);
	    nextBtn.setBackground(lightYellow);            
	    nextBtn.setForeground(colorBtn);
	    frame.getContentPane().add(nextBtn);
	    nextBtn.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		ParkingSpace ps = new ParkingSpace();
	    		for(int i=0;i<N;i++) {
	    			if(list[i].getNumber()==Integer.parseInt(number.getText())) {
	    				if(i<N-1) {
	    				ps=list[i+1];
	    				}else {
	    					JOptionPane.showMessageDialog(frame, "This is the last parking space");
	    				}
	    			}
	    		}
	    		number.setText(""+ps.getNumber());
	    		area.setText(""+ ps.getArea());
	    		if(ps.getUserName().equals("")) {
	    			userName.setVisible(false);
	    			untxt.setVisible(true);
	    		}else {
	    			untxt.setVisible(false);
	    			userName.setText(ps.getUserName());
	    			userName.setVisible(true);
	    		}
	    		if(ps.getDescription().equals("")) {
	    			description.setVisible(false);
	    			descrTxt.setVisible(true);
	    		}else {
	    			descrTxt.setVisible(false);
	    			description.setText(ps.getDescription());
	    			description.setVisible(true);
	    		}
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
	    		if(untxt.getText().trim().length() != 0) {
	    			ParkingSpace ps = new ParkingSpace();
		    		for(int i=0;i<N;i++) {
		    			if(list[i].getNumber()==Integer.parseInt(number.getText())) {
		    				ps=list[i];
		    				ps.setUserName(untxt.getText());
		    			}
		    		}
		    		
		    	    userName.setText(ps.getUserName());
		    	    userName.setVisible(true);
		    	    untxt.selectAll();
		    	    untxt.replaceSelection("");
		    	    untxt.setVisible(false);
//		    		number.setText(""+ps.getNumber());
//		    		area.setText(""+ ps.getArea());
	    		}
	    		if(descrTxt.getText().trim().length() != 0) {
	    			ParkingSpace ps = new ParkingSpace();
		    		for(int i=0;i<N;i++) {
		    			if(list[i].getNumber()==Integer.parseInt(number.getText())) {
		    				ps=list[i];
		    				ps.setDescription(descrTxt.getText());
		    				
		    			}
		    		}
		    		
		    	    description.setText(ps.getDescription());
		    	    description.setVisible(true);
		    	    descrTxt.selectAll();
		    	    descrTxt.replaceSelection("");
		    	    descrTxt.setVisible(false);
	    		}
	        }  
	    }); 
	    
	    JButton searchBtn = new JButton("Search");  
	    searchBtn.setBounds(360, 440, 110, 40);
	    searchBtn.setBackground(lightYellow);      
	    searchBtn.setForeground(colorBtn);  
	    searchBtn.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){ 
	    		int wantedPS = Integer.parseInt(searchTxt.getText());
	    		boolean validPS=true;
	    		ParkingSpace ps = new ParkingSpace();
	    		for(int i=0;i<N;i++) {
	    			if(list[i].getNumber()==wantedPS) {
	    				searchTxt.selectAll();
			    	    searchTxt.replaceSelection("");
	    				ps=list[i];
	    				number.setText(""+ps.getNumber());
	    	    		area.setText(""+ ps.getArea());
	    	    		if(ps.getUserName().equals("")) {
	    	    			userName.setVisible(false);
	    	    			untxt.setVisible(true);
	    	    		}else {
	    	    			untxt.setVisible(false);
	    	    			userName.setText(ps.getUserName());
	    	    			userName.setVisible(true);
	    	    		}
	    	    		if(ps.getDescription().equals("")) {
	    	    			description.setVisible(false);
	    	    			descrTxt.setVisible(true);
	    	    		}else {
	    	    			descrTxt.setVisible(false);
	    	    			description.setVisible(true);
	    	    			description.setText(ps.getDescription());
	    	    		}
	    	    		validPS=true;
	    	    		break;
	    				}else {
	    					validPS=false;
	    			}
	    		}
	    		if(!validPS) {
					JOptionPane.showMessageDialog(frame, "This is no such parking space");
	    		}
	    }});
	    frame.getContentPane().add(searchBtn);

	    JButton numSort = new JButton("Sort by number");
	    numSort.setBounds(350, 350, 140, 40);
	  //  Color colorBtn1 = new Color(255,70,70);
	    numSort.setBackground(Color.pink);
	    numSort.setForeground(colorBtn1);             
	    frame.getContentPane().add(numSort);
	    numSort.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	    MergeSort.mergeSort(list, nc);
				number.setText(""+list[0].getNumber());
			    area.setText(""+list[0].getArea());
			    if(list[0].getUserName().equals("")) {
	    			userName.setVisible(false);
	    			untxt.setVisible(true);
	    		}else {
	    			untxt.setVisible(false);
	    			userName.setText(list[0].getUserName());
	    			userName.setVisible(true);
	    		}
	    		if(list[0].getDescription().equals("")) {
	    			description.setVisible(false);
	    			descrTxt.setVisible(true);
	    		}else {
	    			descrTxt.setVisible(false);
	    			description.setVisible(true);
	    			description.setText(list[0].getDescription());
	    		}
	    		}});
	    
	    JButton unSort = new JButton("Sort by user name");  
	    unSort.setBounds(100, 350, 140, 40);  
	    unSort.setBackground(Color.pink);
	    unSort.setForeground(colorBtn1);
	    frame.getContentPane().add(unSort);
	    unSort.addActionListener(new ActionListener(){        
	    	public void actionPerformed(ActionEvent e){
	    		MergeSort.mergeSort(list, unc);
				number.setText(""+list[0].getNumber());
			    area.setText(""+list[0].getArea());
			    if(list[0].getUserName().equals("")) {
	    			userName.setVisible(false);
	    			untxt.setVisible(true);
	    		}else {
	    			untxt.setVisible(false);
	    			userName.setText(list[0].getUserName());
	    			userName.setVisible(true);
	    		}
	    		if(list[0].getDescription().equals("")) {
	    			description.setVisible(false);
	    			descrTxt.setVisible(true);
	    		}else {
	    			descrTxt.setVisible(false);
	    			description.setVisible(true);
	    			description.setText(list[0].getDescription());
	    		}
	    	}
	    });
	    
	    JButton areaSort = new JButton("Sort by area");  
	    areaSort.setBounds(570, 350, 140, 40);  
	    areaSort.setBackground(Color.pink);
	    areaSort.setForeground(colorBtn1);
	    frame.getContentPane().add(areaSort);
	    areaSort.addActionListener(new ActionListener(){        
	    	public void actionPerformed(ActionEvent e){
				MergeSort.mergeSort(list, ac);
				number.setText(""+list[0].getNumber());
			    area.setText(""+list[0].getArea());
			    if(list[0].getUserName().equals("")) {
	    			userName.setVisible(false);
	    			untxt.setVisible(true);
	    		}else {
	    			untxt.setVisible(false);
	    			userName.setText(list[0].getUserName());
	    			userName.setVisible(true);
	    		}
	    		if(list[0].getDescription().equals("")) {
	    			description.setVisible(false);
	    			descrTxt.setVisible(true);
	    		}else {
	    			descrTxt.setVisible(false);
	    			description.setVisible(true);
	    			description.setText(list[0].getDescription());
	    		}
	    	}
	    });
	    
	    JButton change = new JButton("Change");  
	    change.setBounds(450, 500, 120, 40); 
	    change.setBackground(colorBtn1);
	    change.setForeground(Color.PINK); 
	    frame.getContentPane().add(change);
	    change.addActionListener(new ActionListener(){        
	    	public void actionPerformed(ActionEvent e){
	    		ParkingSpace ps = new ParkingSpace();
	    		for(int i=0;i<N;i++) {
	    			if(list[i].getNumber()==Integer.parseInt(number.getText())) {
	    				ps=list[i];
	    				number.setText(""+ps.getNumber());
			    		area.setText(""+ ps.getArea());
			    		ps.setUserName("");
			    		ps.setDescription("");
			    		description.setVisible(false);
			    		userName.setVisible(false);
			    		descrTxt.setVisible(true);
			    		untxt.setVisible(true);
//			    		if(ps.getUserName().equals("")) {
//			    			
//	    	    			userName.setVisible(false);
//	    	    			untxt.setVisible(true);
//	    	    		}else {
//	    	    			untxt.setVisible(false);
//	    	    			userName.setText(ps.getUserName());
//	    	    			userName.setVisible(true);
//	    	    		}
//	    	    		if(ps.getDescription().equals("")) {
//	    	    			description.setVisible(false);
//	    	    			descrTxt.setVisible(true);
//	    	    		}else {
//	    	    			descrTxt.setVisible(false);
//	    	    			description.setVisible(true);
//	    	    			description.setText(ps.getDescription());
//	    	    		}
	    			}
	    		}
	    	}
	    });
	    
//	    if(list[0].getUserName()!="") {
//	    	untxt.setVisible(false);
//	    	JLabel userName = new JLabel();
//		    userName.setBounds(220, 150, 150, 20);
//		    userName.setText(list[0].getUserName());
//		    frame.getContentPane().add(userName);
//	    }
	    
	    
	    frame.setVisible(true);
		
	    
	    
	
	}	        
}
