public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void passarCanal(){
        canal++;
    }
    public void voltarCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
