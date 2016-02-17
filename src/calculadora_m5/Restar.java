
package calculadora_m5;
import static java.lang.Integer.parseInt;
/**
 *
 * @author Jacob Bolea
 */
public class Restar {
    public int opera(String [] array){
        int resultat;
        resultat = parseInt(array[0])-parseInt(array[1]);    //Restem els dos numeros pasnt-los a int.
        return resultat;
    }
}
