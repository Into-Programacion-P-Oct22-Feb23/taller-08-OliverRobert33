/*
Genere una solución en JAVA que permita presentar una tabla de 20 conversiones 
de temperatura de Fahrenheit a Celsius. La tabla deberá comenzar con un valor 
Fahrenheit de 20 grados e incrementarse en valores de 4 grados. Se recomienda 
usar la fórmula:
°C= 5/9(°F-32)

Al final se debe presentar todo en una variable acumuladora.
 */
package problema03;

/**
 *
 * @author oliver
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        String salida = "";
        double operacion;
        int n=1;
        salida = salida + "\t" + "N°" + "\t"+ "Fahrenheit" + "\t" + "Fahrenheit a Celsius" 
                + "\n";
        
        for (double f = 20; f<=96; f+=4) {
            operacion = ((f-32)*5/9);
            salida = salida+"\t"+n+"."+"\t"+f+"°"+"\t\t"+ operacion+"°C"+"\n";
            n=n+1;
        }
        
        System.out.printf("%s\n", salida);
    }
}
