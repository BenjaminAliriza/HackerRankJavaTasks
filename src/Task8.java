import java.util.*;

public class Task8 {

	Scanner scan = new Scanner(System.in);

	static int B;
	static int H;
	static boolean flag;

	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		flag = true;
		scan.close();

		try {
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
