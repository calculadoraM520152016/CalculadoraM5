
package calculadora_m5;
import static java.lang.Integer.parseInt;
/**
 *
 * @author Jacob Bolea
 */
public class Modul {
    public int opera(String [] array){
        int resultat;
        int numero1 = parseInt(array[0]);
        int numero2 = parseInt(array[1]);
        
        if(numero1<0){
            numero1 = numero1*-1;
        }
        if(numero2<0){
            numero2 = numero2*-1;
        }
        
        while(numero1>=numero2){
            numero1 = numero1-numero2;
        }
        resultat = numero1;
        return resultat;
    }
}
