package Iphone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    private String musica;

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        if (url.equals("".trim())){
            System.out.println("Url inválido!");
            return;
        }
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Nova aba adcionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void tocar() {
        if (musica == null){
            System.out.println("É necessário colocar um musica antes");
            return;
        }
        System.out.println("Tocando musica...");
        System.out.println("A  musica " + musica + " está tocando!");
    }

    @Override
    public void pausar() {
        if (musica == null){
            System.out.println("É necessário colocar um musica antes");
            return;
        }
        System.out.println("Pausando musica...");
        System.out.println("Musica " + musica + " pausada!" );
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Musica selecionada: " + musica);
    }
}
