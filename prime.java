package testproject;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n value :");
		
		int n = 0;
		int i, j;
		int PrimeCount = 0;
 
		n = Integer.parseInt(scan.nextLine());
	
		for(i=n; i<=2; i++) {
			
			int count = 0;
						
			for(j=1; j<=i; j++) {
								
				if((i%j) == 0) {
					
					count++;
				}
			}
			if(count == 2) {
				
				PrimeCount++;
				System.out.print("  " + i);
			}
		}
		
		System.out.print("\nTotally " + PrimeCount + " Prime numbers are available..");
	}

	}


