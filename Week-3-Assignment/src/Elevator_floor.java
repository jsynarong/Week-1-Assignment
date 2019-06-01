import java.util.*;

public class Elevator_floor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		int e;
		int b = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			//Operate elevator
			System.out.println("1.Operate the elevator");
			System.out.println("2.Quit");
			if (b == 0)
				System.out.println("The Elevator(E) is in Basement.");
			else {
				System.out.println("The elevator is at floor " + b);
			}
			System.out.print("Enter choice:");
			e = Integer.parseInt(scan.nextLine());

			if (e == 2) {
				break;
			}
			//Loop for selection and floors
			if (e == 1) {
				System.out.print("Enter your floor (0,1,2):");
				y = Integer.parseInt(scan.nextLine());
				System.out.print("Enter which floor you want to go:");
				x = Integer.parseInt(scan.nextLine());
				if (b == 0)
					System.out.println("The Elevator(E) is in Basement.");
				else {
					System.out.println("The elevtor is at floor " + b);
				}
				if (b == y) {
					System.out.println("The Elevator(E) is now open 'O'");
					if (x > b) {
						System.out.println("The Elevator(E) is Up");
						System.out.println("The Elevator(E) is now at " + x);
						b = x;
					}
					if (x < b) {
						System.out.println("The Elevator(E) is Down");
						System.out.println("The Elevator(E) is now at " + x);
						b = x;
					}
				} 
				else {
					if (y > b) {
						System.out.println("The Elevator(E) is Up");
						System.out.println("The Elevator(E) is now at " + y);
						System.out.println("The Elevator(E) is now open 'O'");
						System.out.println("The Elevator(E) is now closed 'C'");
						b = y;
						if (x > b) {
							System.out.println("The Elevator(E) is Up");
							System.out.println("The Elevator(E) is now at " + x);
							System.out.println("The Elevator(E) is open 'O' ");
							b = x;
						}
						if (x < b) {
							System.out.println("The Elevator(E) is Down");
							System.out.println("The Elevator(E) is now at " + x);
							System.out.println("The Elevator(E) is open 'O' ");
							b = x;
						}
					}
				}
			}
		}
	}

}
