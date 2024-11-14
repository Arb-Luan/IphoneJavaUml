public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.reproduzirMusica();
        iphone.fazerChamada();
        iphone.navegarNaWeb();
    }
}

class Iphone {
    private ReprodutorMusical reprodutor = new ReprodutorMusical();
    private AparelhoTelefonico telefone = new AparelhoTelefonico();
    private NavegadorInternet navegador = new NavegadorInternet();

    public void reproduzirMusica() {
        reprodutor.tocarMusica();
        reprodutor.organizarPlaylist();
        reprodutor.ajustarVolume();
    }

    public void fazerChamada() {
        telefone.fazerChamada();
        telefone.receberChamada();
        telefone.conferencia();
    }

    public void navegarNaWeb() {
        navegador.carregarPagina();
        navegador.adicionarFavorito();
        navegador.zoom();
    }

    private class ReprodutorMusical {
        public void tocarMusica() {
            System.out.println("Reproduzindo música...");
        }
        public void organizarPlaylist() {
            System.out.println("Organizando playlist...");
        }
        public void ajustarVolume() {
            System.out.println("Ajustando volume...");
        }
    }

    private class AparelhoTelefonico {
        public void fazerChamada() {
            System.out.println("Fazendo uma chamada...");
        }
        public void receberChamada() {
            System.out.println("Recebendo uma chamada...");
        }
        public void conferencia() {
            System.out.println("Iniciando uma conferência...");
        }
    }

    private class NavegadorInternet {
        public void carregarPagina() {
            System.out.println("Carregando página da web...");
        }
        public void adicionarFavorito() {
            