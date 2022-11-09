
package habilidades;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Habilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         Scanner sc = new Scanner(System.in);

        //▬
        boolean salir = false;

        char quality1[] = new char[200];

        int tool[] = new int[8];

        int k = 0;

        System.out.println("1. Java     → ▬▬▬\n"
                + "2. HTML     → ▬▬▬▬▬\n"
                + "3. Linux    → ▬▬▬▬▬▬\n"
                + "4. Windows  → ▬▬▬▬▬▬▬\n"
                + "5. MySQL    → ▬▬▬▬▬▬▬▬\n"
                + "6. DataBase → ▬▬▬▬\n"
                + "7. Git Hub  → ▬▬▬▬▬▬\n"
                + "8. Redes    → ▬▬▬▬▬");

        for (int i = 0; i < 8; i++) {
            System.out.println("Nivel de " + (i + 1));
            
            //Modificador aumento *5
            tool[i] = sc.nextInt()*5;
        }

        for (int i = 0; i < quality1.length; i++) {
            quality1[i] = '▬';
        }

        System.out.print("1. Java     → ");

        for (int i = 0; i < tool[0]; i++) {
            System.out.print(quality1[i]);

        }

        System.out.print("\n2. HTML     → ");

        for (int i = 0; i < tool[1]; i++) {
            System.out.print(quality1[i]);
        }

        System.out.print("\n3. Linux    → ");

        for (int i = 0; i < tool[2]; i++) {
            System.out.print(quality1[i]);

        }

        System.out.print("\n4. Windows  → ");

        for (int i = 0; i < tool[3]; i++) {
            System.out.print(quality1[i]);
        }

        System.out.print("\n5. MySQL    → ");

        for (int i = 0; i < tool[4]; i++) {
            System.out.print(quality1[i]);

        }

        System.out.print("\n6. DataBase → ");

        for (int i = 0; i < tool[5]; i++) {
            System.out.print(quality1[i]);
        }

        System.out.print("\n7. Git Hub  → ");

        for (int i = 0; i < tool[6]; i++) {
            System.out.print(quality1[i]);

        }

        System.out.print("\n8. Redes    → ");

        for (int i = 0; i < tool[7]; i++) {
            System.out.print(quality1[i]);
        }

        System.out.print("\n");

    }
    
}
