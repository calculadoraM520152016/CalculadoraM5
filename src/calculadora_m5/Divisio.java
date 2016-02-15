
package calculadora_m5;

/**
 *
 * @author Jacob Bolea
 */
public class Divisio {
    public int opera(String [] array){
        boolean positiu1 = true;
        boolean positiu2 = true;
        int res = 0;
        int num1 = Integer.parseInt(array[0]);
        int num2 = Integer.parseInt(array[1]);
        
        if(num1<0){
            num1 = num1*-1;
            positiu1=false;
        }
        if(num2<0){
            num2 = num2*-1;
            positiu2=false;
        }
        
        while(num1>=num2){
            num1 = num1-num2;
            res++;
        }
        
        if(!positiu1 && positiu2){
            res = res*-1;
        }else if(positiu1 && !positiu2){
            res = res*-1;
        }
        
        return res;
    }
}
