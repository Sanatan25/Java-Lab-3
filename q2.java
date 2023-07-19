import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount of ml of water");
		int water = sc.nextInt();
		if(water >= 5000) {
			System.out.println("yes; Alice follow doctor's advice");
		}else {
			System.out.println("NO; Alice dont follow doctor's advice");
		}

	}

}
