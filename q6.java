import java.util.*;
public class q6 {

	public static void main(String[] args) {
		// TOO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double total = 0;
		System.out.println("Enter the unit");
		int unit = sc.nextInt();
		if(unit <= 50) {
			total = unit*50;
		}else if(unit >= 51 && unit <=200) {
			total =  ((3*50)+((unit - 50)*4.80));
		}else if(unit >= 201 && unit <= 400) {
			total =  ((3*50)+(150*4.80)+(unit-200)*5.80);
		}else if(unit > 400) {
			total =  ((50*3)+(150*4.80)+(200*5.80)+(unit-400)*6.20);
		}else {
			System.out.println("You entered wrong");
		}
		
		System.out.println(total);

	}

}
