package project;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingSpace ps = new ParkingSpace();
		NumberComparator nc = new NumberComparator();
		AreaComparator ac = new AreaComparator();
		UserNameComparator uc = new UserNameComparator();

		ParkingSpace[] list = new ParkingSpace[5];
		for (int i = 0; i < 5; i++) {
			list[i] = new ParkingSpace();
			list[i].setNumber(i + 1);
		}
		list[0].setUserName("poli");
		MergeSort.mergeSort(list, nc);
		
		for (int i = 0; i < 5; i++) {
        System.out.println(list[i].getUserName());
		}
	}

}
