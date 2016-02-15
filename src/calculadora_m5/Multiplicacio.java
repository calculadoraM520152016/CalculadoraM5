
package calculadora_m5;

/**
 *
 * @author Jacob Bolea
 */
public class Multiplicacio {
    public int opera(String [] array){
        boolean signePositiu1 = true;
        boolean signePositiu2 = true;
        int resultat = 0;
        int numero1 = Integer.parseInt(array[0]);
        int numero2 = Integer.parseInt(array[1]);
        
        if(numero1<0){
            numero1 = numero1*-1;
            signePositiu1=false;
        }
        if(numero2<0){
            numero2 = numero2*-1;
            signePositiu2=false;
        }
        
        for (int i = 0; i<numero1;i++){                //Sumem de forma iterativa el segon numero les vegaden que ho indiqui el primer.  
            resultat = resultat +numero2;
        }
        
        if(!signePositiu1 && signePositiu2){
            resultat = resultat*-1;
        }else if(signePositiu1 && !signePositiu2){
            resultat = resultat*-1;
        }
        
        return resultat;
    }
}
