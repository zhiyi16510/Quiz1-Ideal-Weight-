import java.util.Scanner;

public class IdealWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("Input your feet: ");
		int feet=in.nextInt();
		System.out.println("Input your inches: ");
		int inches=in.nextInt();
		int feet_remain=feet-5;
		int inch_new=feet_remain*12;
		int inches_new=inches + inch_new;
		
		System.out.println("Male ideal weight is " + (50 + (6*inches_new)) + "kg");
		System.out.println("Female ideal weight is " + (40 + (5*inches_new)) + "kg");
		in.close();
	}

}
