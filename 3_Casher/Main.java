import java.util.*; // 1 1 2 3 5 8

public class Main{
        public static void main(String[] args){
                System.out.println("Fibonachi Casher");

                int n;
                Scanner sc= new Scanner(System.in);
                System.out.print("Enter a number- ");
                n = sc.nextInt();
                System.out.println("n = " + n);

		while ( (n > 46) || (n<=0) ) {
			System.out.println("\nTry 1 <= n <=46");
			System.out.print("Enter a number: ");
                	n = sc.nextInt();
                	System.out.println("n = " + n);
		}

		Fib.casher(46);
                int res = Fib.get_Casher(n);
                System.out.println("res = " + res);

        }
}
