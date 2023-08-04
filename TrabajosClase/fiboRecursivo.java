package repositorioApo2.TrabajosClase;
import java.util.Scanner;

public class fiboRecursivo {
    
	private static Scanner input;

	
	public static void main(String[] args) {
        input = new Scanner(System.in);
        int limit;

        System.out.println("escoja el numero para fibo");
        limit = input.nextInt();
        System.out.println(fibo(limit));

	}

    public static int fibo(int n){
        if(n==1){
            return 1;
        }
        else{
            if(n==2){
            return 1;
            }
            else{
                return fibo(n-1)+fibo(n-2);
            }
        }
    }
}
