/*
Genere una solución en lenguaje java que dé como salida números en orden 
invertido del 30 al 1.

N°		x2		x3		x4
30		60		90		120
29		58		87		116
28		56		84		112
27		54		81		108
26		52		78		104
25		50		75		100
24		48		72		96
23		46		69		92
22		44		66		88
21		42		63		84
20		40		60		80
19		38		57		76
18		36		54		72
17		34		51		68
16		32		48		64
15		30		45		60
14		28		42		56
13		26		39		52
12		24		36		48
11		22		33		44
10		20		30		40
 */
package problema02;

/**
 *
 * @author oliver
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int x2;
        int x3;
        int x4;
        String salida = "";
        
        salida = salida + "\t" + "N°" + "\t" + "x2" + "\t" + "x3" + "\t" + "x4" 
                + "\n";
        
        for (int i = 30; i<=30 & i>0; i--) {
            x2= i * 2;
            x3= i * 3;
            x4= i * 4;
       
            salida = salida + "\t" + i + "\t"  + x2 + "\t" + x3 + "\t" + x4+ "\n";
            
        }
        System.out.printf("%s",salida);
    }
    
}
