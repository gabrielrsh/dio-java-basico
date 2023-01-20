public class Operadores {
    public static void main(String[] args) {
        // Concatenação
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao;
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        
        //Operador Ternario a==b ? "verdadeiro" : "falso"
        // Operadores Relacionais == != > < >= <= | Comparar objetos com equals para conteudo e nao memoria
        // Logicos && - ||
    }
}
