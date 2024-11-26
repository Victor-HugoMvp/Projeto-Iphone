package aparelhos;

import apps.AparelhoTelefonico;
import apps.NavegadorDeInternet;
import apps.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefonico{
	
	String musica = "Ela é linda (Nilton)";
	String numero = "(34)9.96996547";
	String url = "https:arroz.com.br";
	
	public void tocar() {
		System.out.println("Tocando Música");
	}
	
	public void pausar() {
		System.out.println("Música pausada");
	}
	
	public void selecionarMusica(String musica) {
		 this.musica = musica;
	}
	
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
	}
	
	public void atender() {
		System.out.println("Atendendo a ligacao");
	}
	
	public void inciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
	
	public void exibirPagina(String url) {
		this.url = url;
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando Aba");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

public static void main (String args[]) {
	 Iphone iphone = new Iphone();

     System.out.println("### Testando o Reprodutor Musical ###");
     iphone.tocar();
     iphone.pausar();
     iphone.selecionarMusica("Despacito (Luis Fonsi)");

     System.out.println("\n### Testando o Aparelho Telefônico ###");
     iphone.ligar("(34) 9.9234-5678");
     iphone.atender();
     iphone.inciarCorreioVoz();

     System.out.println("\n### Testando o Navegador de Internet ###");
     iphone.exibirPagina("https://arroz.com");
     iphone.adicionarNovaAba();
     iphone.atualizarPagina();
	
}

@Override
public void selecionarMusica() {
	// TODO Auto-generated method stub
	
}

}
