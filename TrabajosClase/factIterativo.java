package repositorioApo2.TrabajosClase;
import java.util.Scanner;

public class factIterativo {
    private static Scanner input;
	public static void main(String[] args) {
        input = new Scanner(System.in);
        int c=1;
        int limit;

        System.out.println("escoja para el factorial");
		limit = input.nextInt();

        for(int i=1;i<=limit;i++){
            c=i*c;
        }
        System.out.print(c);
        
	}
}
