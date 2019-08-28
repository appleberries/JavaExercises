package test;

public class BubbleSort {

	public static void main(String[] args) {
		int sort[] = {8, 5, 3, 7, 6, 1, 3};
		int temp = 0;
		boolean tof = true;
		
		System.out.print("Unsorted: ");
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
		
		System.out.println();
		
		while(tof) {
			tof = false;
			for(int i = 0; i < sort.length - 1; i++) {
				if(sort[i] > sort[i+1]) {
					temp = sort[i];
					sort[i] = sort[i+1];
					sort[i+1] = temp;
					tof = true;
				}
			}
		}
		
		System.out.print("Sorted: ");
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}

	}

}
