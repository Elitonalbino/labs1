package exercicios03;

import java.util.Scanner;

public class geradortabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero  para gerar a tabuada:");
        int num = scan.nextInt();

        System.out.println("Tabuada de: " + num);
        for(int i=1; i<=10; i++){
              int resultado = num * i;
           
            System.out.println(  num + " x " + i + " = " + resultado);
    }
    scan.close();

           
        }
        

}
