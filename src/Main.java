import navegador.Navegador;
import reprodutormusical.Reprodutor;
import telefone.Telefone;


public class Main {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        Telefone telefone = new Telefone();
        Reprodutor reprodutor = new Reprodutor();

        navegador.exibirPagina();
        navegador.atualizarPagina();
        navegador.adicionaPagina();

        telefone.atender();
        telefone.iniciarCorrerioVoz();
        telefone.ligar(784781826);

        reprodutor.selecionarMusica("Holiday");
        reprodutor.tocarMusica();
        reprodutor.pausarMusica();
        
    }
}
