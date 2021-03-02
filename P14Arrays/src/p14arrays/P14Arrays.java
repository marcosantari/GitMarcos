/*
30/11/2020
Arrays: Vectores : Tablas
1- Teoria
2- Define un array para los valores de IVA:0,4,10,21 y visualiza en el array
3- Define un array de notas de ASIX1: 6 y dale valor a cada nota.
4- Define un array inventado por ti y di:
    -La suma de todos los elementos
    -Cuantos elementos supera el numero 7
5- Define un array (nombre) de 10 elementos del tipo string y visualiza los elementos del array y si si hay algun Marcos.
x2.5p:
 */
package p14arrays;

/**
 *
 * @author Marcos
 */
public class P14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //apartado1();
        //apartado2();
        //apartado3();
        //apartado4();
        apartado5();

    }

    private static void apartado1() {
        System.out.println("P14-arrays - Autor: Marcos - 30/11/2020");
        //declarar un array: forma1
        int suma = 0;
        int[] arrayNdorsal = new int[11];
        arrayNdorsal[0] = 1;
        arrayNdorsal[1] = 3;
        arrayNdorsal[2] = 5;
        arrayNdorsal[3] = 6;
        arrayNdorsal[4] = 7;
        arrayNdorsal[5] = 9;
        arrayNdorsal[6] = 10;
        arrayNdorsal[7] = 13;
        arrayNdorsal[8] = 16;
        arrayNdorsal[9] = 21;
        arrayNdorsal[10] = 30;

        int[] arrayNdorsa2
                = new int[]{1, 2, 3, 5, 6, 7, 9, 10, 13, 16, 21, 30};

        System.out.println(arrayNdorsal[2]);
        System.out.println(arrayNdorsa2[6]);
        System.out.println("Numero de elementos del Array1: ");
        System.out.println(arrayNdorsal.length);
        System.out.println("____________________________");
        //visualizar el array:
        for (int i = 0; i < arrayNdorsal.length; i++) {
            System.out.print(arrayNdorsal[i] + " ");
        }
        System.out.println("\n____________________________");

        //Visualizar y sumar todos los elementos de arrayNdorsa2
        System.out.println("Numero de elementos del Array2: ");
        System.out.println(arrayNdorsa2.length);
        System.out.println("*************************");
        //visualizar el array:
        for (int i = 0; i < arrayNdorsal.length; i++) {
            System.out.print(arrayNdorsa2[i] + " ");
            suma += arrayNdorsa2[i];
        }
        System.out.println("\n*************************");
        System.out.println(suma + "\t");

    }

    private static void apartado2() {
        int[] IVA
                = new int[]{0, 4, 10, 21};
        for (int i = 0; i < IVA.length; i++) {
            System.out.print(IVA[i] + " ");
        }
    }

    private static void apartado3() {
        int[] ASIX
                = new int[]{7, 9, 8, 10, 6, 4};
        for (int i = 0; i < ASIX.length; i++) {
            System.out.print("Nota " + i + ": " + ASIX[i] + ", ");
        }
    }

    private static void apartado4() {
        int[] ASIX
                = new int[]{7, 9, 8, 10, 6, 4};
        int a = 0, b = 0;
        for (int i = 0; i < ASIX.length; i++) {
            System.out.print("Nota " + i + ": " + ASIX[i] + ", ");
            a = a + ASIX[i];
            if (ASIX[i] >= 7) {
                b++;
            }
        }
        System.out.println("\nSuma: " + a + "\nSuperan el 7: " + b);
    }

    private static void apartado5() {
        String[] ASIX
                = new String[]{"Marcos", "Sergi", "Ethan", "Marcos", "Alex", "Adrian", "Eric", "Fabio", "Gerard", "Aketza"};
        int b = 0;
        for (int i = 0; i < ASIX.length; i++) {
            System.out.print("Nota " + i + ": " + ASIX[i] + ", ");
            if (ASIX[i] == "Marcos") {
                b++;
            }
        }
        System.out.println("\nSe llaman Marcos: " + b);
    }
}
