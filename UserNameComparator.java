package project;

import java.util.Comparator;

public class UserNameComparator implements Comparator<ParkingSpace>{
	
	public int compare(ParkingSpace ps1, ParkingSpace ps2) {
		if(ps2.getUserName().compareTo(ps1.getUserName())<0){
			return -1;
		}
		else if(ps2.getUserName().compareTo(ps1.getUserName())>0){
			return 1;
		}
		else{
			return 0;
		}
	
	}
}
