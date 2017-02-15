import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayExampleTest {

	@Test
	public void testGetSum() {
    int[] data = {10,20,30};
    int result  = 60;
    assertEquals(result, ArrayExample.getSum(data));
	}

	@Test
	public void testGetOccurence() {
	   int[] data = {2,3,5,2,5,2,10};
	   int result = 3;
	   assertEquals(result, ArrayExample.getOccurence(data, 2));
	   assertEquals(2, ArrayExample.getOccurence(data, 5));
	   assertEquals(1, ArrayExample.getOccurence(data, 10));
	}

	@Test
	public void testSort() {
		int[] data = {2,3,5,2,5,2,10};
		int[] result = {2,2,2,3,5,5,10};
		ArrayExample.sort(data);
		assertArrayEquals(result,data);
	}

}
