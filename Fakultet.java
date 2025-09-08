import java.util.Scanner;

public class Fakultet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        System.out.print(" Skriv inn et heltall ") ;
        int n = in.nextInt() ;
        
        if (n <= 0) {
            System.out.println(" Ugyldig tall! n må være større enn 0. ") ;
        } else {
            int fakultet = 1;
            
            for (int i = 1; i <= n; i ++) {
                fakultet = fakultet * i;
            }
            
            System.out.println(n + "! =" + fakultet) ;
        }
        
        }
    }