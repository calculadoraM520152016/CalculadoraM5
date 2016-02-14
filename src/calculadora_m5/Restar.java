
package calculadora_m5;

/**
 *
 * @author Jacob Bolea
 */
public class Restar {
    public int opera(String [] array){
        int res;
        res = Integer.parseInt(array[0])-Integer.parseInt(array[1]);    //Restem els dos numeros pasnt-los a int.
        return res;
    }
}
