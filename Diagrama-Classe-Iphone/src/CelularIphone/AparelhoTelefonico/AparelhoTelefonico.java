package CelularIphone.AparelhoTelefonico;

import CelularIphone.Iphone;

public class AparelhoTelefonico implements Iphone {

    public void Iphone(){
        Ligar();
        Atender();
        IniciarCorreioDeVoz();
    }

    private void Ligar(){
        System.out.println("Ligar");
    }

    private void Atender(){
        System.out.println("Atender");
    }

    private void IniciarCorreioDeVoz(){
        System.out.println("Correio de voz");
    }

}
