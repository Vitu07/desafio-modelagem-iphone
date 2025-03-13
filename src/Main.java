import Iphone.Iphone;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Iphone iphone = new Iphone();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        int option;

        while (true){
            System.out.println("=========Iphone=========");
            System.out.println("***Reprodutor musical***");
            System.out.println("1 - Selecionar música");
            System.out.println("2 - Tocar música");
            System.out.println("3 - Pausar música");
            System.out.println("***Aparelho telefônico***");
            System.out.println("4 - Realizar ligação");
            System.out.println("5 - Atender ligação");
            System.out.println("6 - Gravar correio de voz");
            System.out.println("***Navegador internet***");
            System.out.println("7 - Exibir pagina");
            System.out.println("8 - Adcionar nova aba");
            System.out.println("9 - Atualizar pagina");
            System.out.println("========================");
            System.out.println("0 - Sair do Iphone");
            option = scanner.nextInt();

            switch (option){
                case 1 -> escolherMusica();
                case 2 -> iphone.tocar();
                case 3 -> iphone.pausar();
                case 4 ->  realizarLigacao();
                case 5 -> iphone.atender();
                case 6 -> iphone.iniciarCorreioVoz();
                case 7 -> mostrarPagina();
                case 8 -> iphone.adcionarNovaAba();
                case 9 -> iphone.atualizarPagina();
                case 0 -> System.exit(-1);
                default -> System.out.println("Opção inválida");
            }
        }
    }
    private static void escolherMusica(){
        System.out.println("Digite o nome da música ");
        String musica  = scanner.next();
        iphone.selecionarMusica(musica);
    }

    private static void realizarLigacao(){
        System.out.println("Informe o numero de telefone que deseja ligar ");
        String numero  = scanner.next();
        iphone.ligar(numero);
    }

    private static void mostrarPagina(){
        System.out.println("Digite o URL do site: ");
        String url  = scanner.next();
        iphone.exibirPagina(url);
    }
}