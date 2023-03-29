public class Usuario {
    public static void main(String[] args) {

        SmartTv smartv = new SmartTv();

        smartv.ligar();
        smartv.mudarCanal(13);
        smartv.passarCanal();
        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.aumentarVolume();

        System.out.println("A tv está ligada? " + smartv.ligada);
        System.out.println("Ela está no canal: " + smartv.canal);
        System.out.println("O Volume está: " + smartv.volume);

    }

}