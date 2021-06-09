package project2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Picture {

	String nameOfPicture;                //vsqka snimka si ima neino ime naprimer polly.jpg
	int x;                               //koordinatite po Ox
	int y;                               //koordinatite po Oy
	int width;                           //shirochina na snimkata
	int height;                          //visochina na snimkata
	JFrame frame = new JFrame();
	
	Picture(String nameOfPicture, int x, int y, int width, int height,JFrame frame){  //konstuktorut na klasa Picture
		this.nameOfPicture = nameOfPicture;
		this.x=x;
		this.y=y;
		this.width= width;
		this.height=height;
		this.frame=frame;
	}
	
	public void addImage() {              
		ImageIcon pic = new ImageIcon(nameOfPicture);    //polzvam java klasa ImageIcon i suzdavam obekt ot nego
	    JLabel labelPic= new JLabel();                   //suzdavam i JLabel
	    labelPic.setIcon(pic);                           //slagam snimkata v label-a
	    labelPic.setBounds(x, y, width, height);         //izpolzvam setBounds za oznachavane na koordinatite na tazi snimka
	    frame.getContentPane().add(labelPic);
	}
	
}
