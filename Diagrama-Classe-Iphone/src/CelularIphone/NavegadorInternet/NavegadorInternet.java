package CelularIphone.NavegadorInternet;

import CelularIphone.Iphone;

public class NavegadorInternet implements Iphone {

    public void Navegador(){
        ExibirPagina();
        AdicionarAba();
        AtualizarPagina();
    }

    private void ExibirPagina(){
        System.out.println("Exibir a Pagina");
    }

    private void AdicionarAba(){
        System.out.println("Adicionar Aba");
    }

    private void AtualizarPagina(){
        System.out.println("Atualizar Pagina");
    }

}
