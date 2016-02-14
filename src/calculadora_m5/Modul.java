
package calculadora_m5;

/**
 *
 * @author Jacob Bolea
 */
public class Modul {
    public int opera(String [] array){
        int res;
        int num1 = Integer.parseInt(array[0]);
        int num2 = Integer.parseInt(array[1]);
        
        if(num1<0){
            num1 = num1*-1;
        }
        if(num2<0){
            num2 = num2*-1;
        }
        
        while(num1>=num2){
            num1 = num1-num2;
        }
        res = num1;
        return res;
    }
}
