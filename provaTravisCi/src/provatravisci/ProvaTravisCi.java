package provatravisci;
import java.util.Scanner;

public class ProvaTravisCi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita un numero:");
        int a = sc.nextInt();
        System.out.print("Digita un altro numero;");
        int b = sc.nextInt();
        int c;
        c=a+b;
        System.out.println("La somma tra "+a+" e "+b+" è:"+c);
    }
    
}
