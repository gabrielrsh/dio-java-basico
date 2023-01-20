package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Logicos && - ||
        boolean condicao1, condicao2;

        condicao1 = 2>2;
        condicao2 = 11==10;

        if(condicao1 && condicao2)
            System.out.println("Ambas condicoes sao verdadeiras");
        else if (condicao1 || condicao2)
            System.out.println("Ao menos uma condicao é verdadeira");
        else
            System.out.println("Ambas condicoes sao falsas");
        
            
    }
}
