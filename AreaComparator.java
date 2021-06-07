package project;

import java.util.Comparator;

public class AreaComparator implements Comparator<ParkingSpace> {
	
	public int compare(ParkingSpace ps1, ParkingSpace ps2){
	if(ps2.getArea()>ps1.getArea()){
		return -1;
	}else if(ps1.getArea()>ps2.getArea()){
		return 1;
	}else{
	return 0;
	}
	}
}
