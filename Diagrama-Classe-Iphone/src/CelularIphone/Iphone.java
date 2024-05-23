package CelularIphone;

import CelularIphone.AparelhoTelefonico.AparelhoTelefonico;
import CelularIphone.NavegadorInternet.NavegadorInternet;
import CelularIphone.ReprodutorMusical.ReprodutorMusical;

public interface Iphone {

public static void main(String[] args) {
    ReprodutorMusical Rm = new ReprodutorMusical();

    Rm.RM();

    AparelhoTelefonico At = new AparelhoTelefonico();

    At.Iphone();

    NavegadorInternet Ni = new NavegadorInternet();

    Ni.Navegador();
}

}
