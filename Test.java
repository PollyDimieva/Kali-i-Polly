package project;

import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     NumberComparator nc = new NumberComparator();
     AreaComparator ac = new AreaComparator();
     UserNameComparator uc = new UserNameComparator();
     
     ParkingSpace[] list = {new ParkingSpace(2,6,"Polly","a1"), new ParkingSpace(1,7,"Kali","a2"), new ParkingSpace(4, 5, "Mihov","b1"), new ParkingSpace(3,6,"Juli","b4")};
  	
	//	MergeSort.mergeSort(list, nc);
		MergeSort.mergeSort(list, ac);
	//	MergeSort.mergeSort(list, uc);
		
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
     
		
		
		
	}
	

	

}
