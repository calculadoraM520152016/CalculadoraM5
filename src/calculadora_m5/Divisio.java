
package calculadora_m5;
import static java.lang.Integer.parseInt;
/**
 *
 * @author grup1
 */
public class Divisio {
    public int opera(String [] array){
        boolean signePositiu1 = true;
        boolean signePositiu2 = true;
        int resultat = 0;
        int numero1 = parseInt(array[0]);
        int numero2 = parseInt(array[1]);
        
        if(numero1<0){
            numero1 = numero1*-1;
            signePositiu1=false;
        }
        if(numero2<0){
            numero2 = numero2*-1;
            signePositiu2=false;
        }
        
        while(numero1>=numero2){
            numero1 = numero1-numero2;
            resultat++;
        }
        
        if(!signePositiu1 && signePositiu2){
            resultat = resultat*-1;
        }else if(signePositiu1 && !signePositiu2){
            resultat = resultat*-1;
        }
        
        return resultat;
    }
}
