/*
Generar una solución que permita ingresar jugadores de fútbol; por cada jugador 
se debe solicitar:
    Nombre el jugador
    Posición en el campo de juego
    Edad
    Estatura
El número de veces que se debe iterar (ingresar información), se debe ingresar 
previamente por teclado. Se debe imprimir el siguiente reporte (usar una cadena 
de acumulación), como ejemplo. En este caso se decidió ingresar 5 jugadores:

Listado de Jugadores

Alexander Dominguez -Arquero-, edad 32, estatura 1.95
Xavier Arreaga -Defensa-, edad 24, estatura 1.85
Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
Ángel Mena -Delantero-, edad 32, estatura 1.75
Michael Estrada -Delantero-, edad 27, estatura 1.93 
Listado de Edades 32 24 19 32 27 Promedio de edades: 26.8 Promedio de estaturas: 1.87
 */
package problema01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author oliver
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //Vatriables
        String nombreJugador;
        String posicion_juego;
        int edad;
        double estatura;
        String salida = " ";
        String lista = " ";
        double promedio1 = 0;
        double promedio2 = 0;
        
        //Se pide que ingrese cuantos jugadores quiere ingresar.
        int limite;
        System.out.println("Ingrese cuanto jugadores van a ingresar: ");
        limite = entrada.nextInt();
        
        //Se utiliza un ciclo para donde se pone la condicion segun el limite 
        //que ingreso
        for (int i = 1; i <= limite; i++) {
            
            System.out.print("Ingrese su Nombre y Apellido: ");
            nombreJugador = entrada.nextLine();
            salida = salida + i + "." + " "+ nombreJugador; //Se guarda en cadena 
                                                            //los datos ingresados
            entrada.nextLine(); //Limpieza de buffer
            
            System.out.print("Ingrese la posicion de juego: ");
            posicion_juego = entrada.nextLine();
            salida = salida + " -" + posicion_juego + "-,";//Se guarda en cadena 
                                                           //los datos ingresados
            
            System.out.print("Ingrese su edad: ");
            edad = entrada.nextInt();
            salida = salida + " edad " + edad + ","; //Se guarda en cadena 
                                                     //los datos ingresados
            lista = lista + edad + " ";     //se va guardando en tipo cadena los  
                                            //valores de edades ingresados
            promedio1 = promedio1 + edad;   //se va sumando los valores de 
                                            //edades ingresados
            
            System.out.print("Ingrese su estatura: ");
            estatura = entrada.nextDouble();
            salida = salida + " estatura " + estatura + "\n"; //Se guarda en cadena 
                                                             //los datos ingresados
            promedio2 = promedio2 + estatura; //se va sumando los valores de 
                                              //estatura ingresados
        }
        promedio1 = promedio1 / limite; 
        promedio2 = promedio2 / limite;
       
        System.out.printf("Listado de Jugadores\n\n%sListado de edades%s"
                +"Promedio edades:%.2f Promedio de estaturas:%.2f\n"
                ,salida
                , lista
                , promedio1
                ,promedio2);
    }
    
}
