	package smartphone.iphone;
	
	import smartphone.funcionalidades.aparelho.AparelhoTelefonico;
	import smartphone.funcionalidades.navegacao.NavegadorNaInternet;
	import smartphone.funcionalidades.reproducao.ReprodutorMusical;
	
	public class Multifuncoes implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {
	
	    private String musica;
	    private String pagina;
	
	    
	    public void selecionarMusica(String musica) {
	        setMusica(musica);
	        tocar();
	        pausar();
	    }
	
	    public void setMusica(String musica) {
	        this.musica = musica;
	    }
	
	    public String getMusica() {
	        return this.musica;
	    }
	
	    private void tocar() {
	        System.out.println("Tocando " + getMusica());
	    }
	
	    private void pausar() {
	        System.out.println("Pausando " + getMusica());
	    }
	
	    
	    public void exibirPagina(String url) {
	        setPagina(url);
	        System.out.println("Exibindo página: " + getPagina());
	        adicionarNovaAba();
	        atualizarPagina();
	    }
	
	    public void setPagina(String pagina) {
	        this.pagina = pagina;
	    }
	
	    public String getPagina() {
	        return this.pagina;
	    }
	
	    private void adicionarNovaAba() {
	        System.out.println("Adicionando nova aba...");
	    }
	
	    private void atualizarPagina() {
	        System.out.println("Atualizando página...");
	    }
	
	    
	    public void ligar(String numero) {
	        System.out.println("Ligando para: " + numero);
	        atender();
	        iniciarCorreioVoz();
	    }
	
	    private void atender() {
	        System.out.println("Atendendo ligação...");
	    }
	
	    private void iniciarCorreioVoz() {
	        System.out.println("Encaminhando para o correio de voz...");
	    }
	
	}
