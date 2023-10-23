package model;

public class Iphone implements Browser, MusicPlayer, Telephone{

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para:" + numero );
		
	}

	@Override
	public void atender(String numero) {
		System.out.println("Falando com:" + numero );
		
	}

	@Override
	public void iniciarCorreioVoz(String numero) {
		System.out.println("Mensagem de voz de:" + numero );
		
	}

	@Override
	public void tocar(String musica) {
		System.out.println("Tocando:" + musica );
		
	}

	@Override
	public void pausar(String musica) {
		System.out.println("Pausando:" + musica );
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Escolhida:" + musica );
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Mostrando:" + url );
		
	}

	@Override
	public void adicionarNovaAba(String url) {
		System.out.println("Movendo para" + url );
		
	}

	@Override
	public void atualizarPagina() {
		
		
	}

}
