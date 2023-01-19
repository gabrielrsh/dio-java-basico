public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Exemplos
        byte idade = 23;
        short ano = 2020;
        int cep = 41440200; //se começar com zero, talvez tenha que ser outro tipo
        long cpf = 36548978956L; //se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1555.56;
        
        // Exemplo de Tipagem forte 
        //(necessario converter o tipo mais abrangente para o mais especifico)
        
        short numeroCurto = 1;
        int numeroInteiro = numeroCurto;
        short numeroCurto2 = (short) numeroInteiro;
    }
}
