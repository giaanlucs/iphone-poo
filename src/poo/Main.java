package poo;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto do tipo iPhone
        iPhone meuIphone = new iPhone();
        
        // Testando o Reprodutor Musical
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();
        
        // Testando o Aparelho Telefônico
        meuIphone.ligar("123-456-789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Testando o Navegador na Internet
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

