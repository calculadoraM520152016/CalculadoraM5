
package calculadora_m5;
import static java.lang.Integer.parseInt;
/**
 *
 * @author Jacob Bolea
 */
public class Sumar {
    public int opera(String [] array){
        int resltat;
        resltat = parseInt(array[0])+parseInt(array[1]);    //Sumem els dos numeros pasnt-los a int.
        return resltat;
    }
}
