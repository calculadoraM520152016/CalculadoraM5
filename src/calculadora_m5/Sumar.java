
package calculadora_m5;

/**
 *
 * @author Jacob Bolea
 */
public class Sumar {
    public int opera(String [] array){
        int res;
        res = Integer.parseInt(array[0])+Integer.parseInt(array[1]);    //Sumem els dos numeros pasnt-los a int.
        return res;
    }
}
