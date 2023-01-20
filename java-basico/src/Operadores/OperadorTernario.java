package Operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = 4;
        numero2 = 3;
        String resultado = numero1>numero2 ? "verdadeiro" : "falso";

        System.out.println("Numero 1 é maior que numero 2? "+resultado);
    }
}
