# Projeto Java - Simulação de Funcionalidades do iPhone 📱

Este projeto simula as funcionalidades básicas de um iPhone utilizando conceitos de Programação Orientada a Objetos como interfaces, herança, encapsulamento e polimorfismo.

## ✨ Funcionalidades Modeladas

- **Reprodutor Musical**
  - `selecionarMusica(String musica)`
  - Métodos privados: `tocar()`, `pausar()`

- **Aparelho Telefônico**
  - `ligar(String numero)`
  - Métodos privados: `atender()`, `iniciarCorreioVoz()`

- **Navegador na Internet**
  - `exibirPagina(String url)`
  - Métodos privados: `adicionarNovaAba()`, `atualizarPagina()`

## 📦 Estrutura do Projeto

- Interfaces separadas por pacotes:
  - `ReprodutorMusical`
  - `AparelhoTelefonico`
  - `NavegadorNaInternet`
- Classe `Multifuncoes` implementando as interfaces
- Classe `Iphone` que herda de `Multifuncoes`
- Classe `TestaIphone` com método `main()` para execução

## 🧠 Conceitos Aplicados

- **Encapsulamento** com métodos `private` e `get/set`
- **Herança** com a classe `Iphone` herdando `Multifuncoes`
- **Polimorfismo** via interfaces

## 📊 Diagrama UML

O diagrama UML foi criado em [Mermaid](https://mermaid-js.github.io/mermaid/#/) e está disponível na pasta `mermaid/uml.md`.

---

Feito com 💻 por [Vitor Reis dos Santos]
