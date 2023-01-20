package Metodos;

public class SmartTv {
    int canal = 1;
    int volume = 10;
    boolean ligada = false;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int numero_canal){
        canal = numero_canal;
    }
}
