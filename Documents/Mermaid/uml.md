classDiagram
direction TB

class ReprodutorMusical {
    +selecionarMusica(String musica)
}
class AparelhoTelefonico {
    +ligar(String numero)
}
class NavegadorNaInternet {
    +exibirPagina(String url)
}

class Multifuncoes {
    -String pagina
    -String numero
    -atualizarPagina()
    -adicionarNovaAba()
    -iniciarCorreioVoz()
    -atender()
    -pausar()
    -tocar()
}

class Iphone

<<interface>> ReprodutorMusical
<<interface>> AparelhoTelefonico
<<interface>> NavegadorNaInternet

Multifuncoes ..|> ReprodutorMusical
Multifuncoes ..|> AparelhoTelefonico
Multifuncoes ..|> NavegadorNaInternet

Iphone --|> Multifuncoes
