package reprodutormusical;
public class Reprodutor{
    public String nomeMusica;

    public void tocarMusica(){
        System.out.println("A musica " + nomeMusica + ", está tocando");
    }

    public void pausarMusica(){
        System.out.println("Musica " + nomeMusica + " Pausada");
    }

    public void selecionarMusica(String nomeMusica){
        this.nomeMusica = nomeMusica;
        System.out.println("A musica " + nomeMusica + " Foi selecionada");
    }

    public String getNomeMusica() {
        return nomeMusica;
    }


    
}