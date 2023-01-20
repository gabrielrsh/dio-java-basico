package Operadores;

public class OperadoresUnarios {
    
    public static void main(String[] args) {
        // Operador unário
        int numero = 5;
        boolean afirmacao = true;
        
        // negação "!" para valores booleanos e "-" para inverter sinal valores numericos
        afirmacao = !afirmacao;
        numero = - numero;

        System.out.println(numero);
        System.out.println(afirmacao);
        
        numero = - numero;
        afirmacao = !afirmacao;
        System.out.println(numero);
        System.out.println(afirmacao);
        
    //-----------------------------------    
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
