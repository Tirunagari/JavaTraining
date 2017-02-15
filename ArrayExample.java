
public class ArrayExample {

	public static int getSum(int[] elems) {
		int sum = 0;
		for (int i = 0; i < elems.length; i++) {
			sum += elems[i];
		}
		return sum;
		
	}
	
	public static int getOccurence(int[] elems, int no) {
		int occurence = 0;
		for (int i = 0; i < elems.length; i++) {
			
			if(elems[i] == no) {
				
				occurence++;
			}
		}
		return occurence;
		
	}
	
	public static void sort(int[] elems) {
		
		for(int i=0; i<elems.length; i++) {
			
			for (int j =1 ; j<elems.length; j++) {
				
				if(elems[i] > elems[j]) {
					
					int temp = elems[i];;
					elems[i] = elems[j];
					elems[j] = temp;
					
				}
				
			}
		}
		
	}
	
	
}
