
import java.util.Scanner;


public class LaSentenciaIf {
   
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int numeroPensado = 5;
    System.out.println("Adivina el numero que estoy pensado del 1 al 10");
    int numeroIntroducido = scanner.nextInt();
    
    String color;
    if (numeroIntroducido == numeroPensado) {
        color = "\033[0;32m";
        System.out.println(color + "!Enhorabuena!");
    }
    else{
        color = "\033[0;31m";
        System.out.println(color + "Lo sentimos, el número que estaba pensando es el " + numeroPensado);
    }
}

    
    
}
