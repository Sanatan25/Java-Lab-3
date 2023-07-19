import java.util.*; 
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your guess");
		int guess = sc.nextInt();
		int rand = 1+(int)(Math.random()*10-1+1);
		System.out.println(rand);
		if(guess == rand) {
			System.out.println("good guess");
		}
		else if((guess - rand == -1) || (guess - rand == 1)) {
			System.out.println("almost got it");
		}else {
			System.out.println("you enterd wrong");
		}

	}

}
