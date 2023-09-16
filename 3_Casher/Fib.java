public class Fib{
	private static int [] arr = new int[47];

        public static void casher(int n){
			
		arr[0] = 0;
		arr[1] = 1; // arr[position] = value

		int id = 1;//current position
		
		while(id < n){ // n>=2
			id++;
			arr[id] = arr[id-1] + arr[id-2];
		}
		
        }

	public static int get_Casher(int nn){	
		return arr[nn];
        }
}
