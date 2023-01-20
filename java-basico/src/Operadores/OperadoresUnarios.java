package Operadores;

public class OperadoresUnarios {
    
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = numero2 = 5;
        // Operador pos fixado
        System.out.println(numero1++);
        System.out.println(numero2--);
        
        System.out.println(numero1);
        System.out.println(numero2);

        //Operador pre fixado
        System.out.println(++numero1);
        System.out.println(--numero2);
    }
}
