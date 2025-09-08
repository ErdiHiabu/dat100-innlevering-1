import java.util.Scanner;

public class Trinnskatt {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in) ;
        
        System.out.print( "bruttoinntekt: ") ;
        int inntekt = in.nextInt() ;
        
        int skatt = 0 ;
        
        if (inntekt < 217400) {
           skatt = 0 ;
            
        }  else if(inntekt <= 306050) {
            skatt = (inntekt - 217400) * 17 / 1000 ;
           
        }  else if (inntekt <= 697150) {
             skatt = (306050 - 217400) * 17 / 1000 
                           + (inntekt - 306050) * 40 / 1000 ; 
                           
        }  else if (inntekt <= 942400) {
            skatt = (306050 - 217400) * 17 / 1000  
                           + (697150 - 306050) * 40 / 1000 
                           + (inntekt - 697150) * 137 / 1000 ;
    
        }  else if (inntekt <= 1410750) {
            skatt = (306050 - 217400) * 17 /1000
                           + (697150 - 217400) * 40 / 1000
                           + (942400 - 697150) * 137 / 1000
                           + (inntekt - 9424400) * 167 / 1000 ;
                        
        } else {
            skatt = (306050 - 217400) * 17 / 1000
                       + (697150 - 306050) * 40 / 1000
                       + (942400 - 697150) * 137 / 1000
                       + (1410750 - 942400) * 167/ 1000
                       + (inntekt - 1410750) * 177 / 1000 ;
        }
        
        if (skatt == 0) {
            System.out.println( "Ingen trinnskatt." ) ;
        } else {
            System.out.println( "Trinnskatt beregnet: " + skatt + "kr" ) ;
            
        } 
    }
    
}