package project;

import java.util.Comparator;

public class NumberComparator implements Comparator<ParkingSpace> {
	
	public int compare(ParkingSpace ps1, ParkingSpace ps2){
		if(ps2.getNumber()>ps1.getNumber()){
			return -1;
		}else if(ps1.getNumber()>ps2.getNumber()){
			return 1;
		}else{
		return 0;
		}
}
}
