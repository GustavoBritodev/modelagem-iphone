package exercicio;

public class SistemaOperacional implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	public void tocar() {
		System.out.println("Tocando música");
		
	}

	public void pausar() {		
		System.out.println("Pausando música");
	}
	
	public void selecionarMusica() {
		System.out.println("Selecionando música");
	}

	public void ligar() {
		System.out.println("Ligando o celular");
	}

	public void atender() {
		System.out.println("Atendendo chamada telefônica");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

	public void exibirPagina() {
		System.out.println("Exibindo página na web");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no navegador");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página da web");
	}

}
