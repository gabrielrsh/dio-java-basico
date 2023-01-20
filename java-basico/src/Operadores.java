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

        // Operador unário
        int numero = 5;
        boolean afirmacao = true;
        afirmacao = !afirmacao;
        numero = - numero;

        System.out.println(numero);
        System.out.println(afirmacao);
        
        numero = - numero;
        afirmacao = !afirmacao;
        System.out.println(numero);
        System.out.println(afirmacao);
    }
}
