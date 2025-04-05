package testa.phone;

import smartphone.iphone.Iphone;

public class TestaIphone {

    public static void main(String[] args) {
        
        Iphone meuIphone = new Iphone();

        
        meuIphone.selecionarMusica("Shape of You");
        System.out.println(); 

        meuIphone.exibirPagina("https://facebook.com");
        System.out.println();

        meuIphone.ligar("1234-5678");
    }
}
