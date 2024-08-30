
package Desktop.JavaProv.uppfidt1;

public class JavaU2 {

    public static void main(String args[]) {
        //Arrays listor på numror
        int[] myNum1 = {5, 10, 25, 75, 125};
        int[] myNum2 = {50, 100, 250, 750, 25};
        // Int variablar för att räkna summan av arrays
        int sum1 = 0;
        int sum2 = 0;
        
        // For loop som räknar sum av första array
          for (int i = 0; i < myNum1.length; i++) {  
           sum1 = sum1 + myNum1[i];  
        }  
          // Printar ut text + svar
          System.out.println("Sum of all the numbers of an array: " + sum1); 
          
        // For loop som räknar sum av andra array  
          for (int i = 0; i < myNum2.length; i++) {  
           sum2 = sum2 + myNum2[i];  
        }  
          // Printar ut text + svar
          System.out.println("Sum of all the numbers of an array: " + sum2);
          double sum3 = sum2 / sum1;
          System.out.println("Sum1 / sum2 is: "+sum3);
          
            
    }
}
