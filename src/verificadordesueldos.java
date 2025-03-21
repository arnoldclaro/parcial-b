import java.util.Scanner;

import java.util.Scanner;

public class verificadordesueldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalsueldos = 0;
        int contadorRango = 0;

for (int i = 0; i < 10; i++) {
    System.out.println("INGRESE SUELDO #"+ (i+1)+":");
    double sueldo = scanner.nextDouble();

    if (sueldo <= 0) {
        totalsueldos += sueldo;

        if (sueldo >= 100  && sueldo <= 300) {
            contadorRango++;
        }
    } else {
        System.out.println("el sueldo negativo no es valido, ingrese un sueldo positivo.");
    }
}

scanner.close();

 System.out.println("Total de sueldos acumulados: " + (float) totalsueldos);  
        System.out.println("Cantidad de sueldos en el rango de $100 a $300: " + contadorRango);  
    }  
}  


