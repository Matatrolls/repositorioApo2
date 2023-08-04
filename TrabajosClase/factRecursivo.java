package repositorioApo2.TrabajosClase;

import java.util.Scanner;
public class factRecursivo {
    private static Scanner input;

	
	public static void main(String[] args) {
        input = new Scanner(System.in);
        
        int limit;

        System.out.println("escoja el numero para el factorial");
		limit = input.nextInt();
        System.out.println(iterative(limit));
       

	}
    public static int iterative(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*iterative(n-1);
        }
    }
}
