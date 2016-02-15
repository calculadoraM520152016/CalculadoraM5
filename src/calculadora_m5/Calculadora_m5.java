
package calculadora_m5;

import java.util.Scanner;
/**
 *
 * @author Jacob Bolea Moreno y los demas
 */
public class Calculadora_m5 {
    /*Atributs*/
    private Scanner reader;
    private String entrada;
    private String [] numeros;
    int surtida;
    boolean numeric = false;
    private Multiplicacio Multiplica;
    private Divisio Divideix;
    private Sumar Suma;
    private Restar Resta;
    private Modul Modula;
    /*Constructor*/
    public Calculadora_m5(){
        reader = new Scanner(System.in);
        numeros = new String [2];
        Multiplica = new Multiplicacio();
        Divideix = new Divisio();
        Suma = new Sumar();
        Resta = new Restar();
        Modula = new Modul();
    }
    /*Mètodes*/
    public void menu(){
        while(true){
            entrada = reader.nextLine();    //Entrem el string amb la informació

            if(entrada.indexOf("*")>0){
                numeros = entrada.split("\\*");
                numeric = esNumeric(numeros);
                if (numeric == true){
                    surtida = Multiplica.opera(numeros);
                    System.out.println(surtida);
                }else{
                System.out.println("Error");
            }
                
            }else if(entrada.indexOf("/")>0){
                numeros = entrada.split("\\/");
                numeric = esNumeric(numeros);
                if (numeric == true){
                    if(Integer.parseInt(numeros[1]) == 0){ 
                    System.out.println("Error");
                    }else {
                        surtida = Divideix.opera(numeros);
                        System.out.println(surtida);
                    }
                }else{
                System.out.println("Error");
                }
                
            }else if(entrada.indexOf("%")>0){
                numeros = entrada.split("\\%");
                numeric = esNumeric(numeros);
                if (numeric == true){
                    if(Integer.parseInt(numeros[1]) == 0){
                    System.out.println("Error");
                    }else {
                        surtida = Modula.opera(numeros);
                        System.out.println(surtida);
                    }
                }else{
                System.out.println("Error");
                }
                
            }else if(entrada.indexOf("+")>0){         //Comprovem si l'entrada conte un "+".
                numeros = entrada.split("\\+");   //separem els numeros de la "+" i els guardem en una array.
                numeric = esNumeric(numeros);
                if (numeric == true){
                    surtida=Suma.opera(numeros);          //Els sumem dins del mètode.
                    System.out.println(surtida);    //Imprimim el resultat.
                }else{
                System.out.println("Error");
                }
            }else if(entrada.indexOf("-")>0){
                numeros = entrada.split("\\-");
                numeric = esNumeric(numeros);
                if (numeric == true){
                    surtida = Resta.opera(numeros);
                    System.out.println(surtida);
                }else{
                System.out.println("Error");
                }
            }else{
                System.out.println("Error");
            }
        }
    }
    /*Es numèric*/
    private static boolean esNumeric(String[] cadena){
                try {
                        Integer.parseInt(cadena[0]);
                        Integer.parseInt(cadena[1]);
                        return true;
                } catch (NumberFormatException e){
                        return false;
            }
    }
    /*Main*/
    public static void main(String[] args) {
        Calculadora_m5 obj=new Calculadora_m5();
        obj.menu();
    }
    
}
