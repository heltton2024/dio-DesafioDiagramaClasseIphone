package CelularIphone.ReprodutorMusical;

import CelularIphone.Iphone;

public class ReprodutorMusical implements Iphone {

    public void RM(){
        Tocar();
        Pausar();
        SelecionarMusica();
    }

    private void Tocar() {
        System.out.println("Tocando");
    }

    private void Pausar(){
        System.out.println("Pausa");
    }

    private void SelecionarMusica(){
        System.out.println("Selecionar Musica");
    }

}
