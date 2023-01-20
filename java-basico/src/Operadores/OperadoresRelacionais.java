package Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        // Operadores Relacionais == != > < >= <= 
        // Comparar objetos com equals para conteudo e nao endereco de memoria

        int a, b;
        a = 1;
        b = 2;

        if(a==b)
            System.out.println("Os valores são iguais");
        else if(a>b)
            System.out.println("O valor a é maior do que b");
        else if(a<b)
            System.out.println("O valor a é menor do que b");

        String palavra1 = "palavra";
        String palavra2 = new String("palavra");

        if(palavra1.equals(palavra2))
            System.out.println("palavras iguais");

    }
    
}
