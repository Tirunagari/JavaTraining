
public class FirstExample {

	public static void main(String[] args) {
      System.out.println("Hello");
      int x = 10;
      int y = 20;
      int result = sum(x,y);
      System.out.println("Sum: " + result);
	}

	private static int sum(int x, int y) {
		return x + y;
	}

}
