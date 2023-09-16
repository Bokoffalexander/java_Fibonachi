public class Fib{
        public static int loop(int n){
		
		int n0 = 0;
		int n1 = 1;
		int id = 1;//current position
		
		if (n == 1) return 1;
		
		while(id < n){
			n0 = n0 + n1;
			id++;
			if (id == n) return n0;
			
			n1 = n1 + n0;
			id++;
			if (id == n) return n1;
		}

		return 0;
        }
}
