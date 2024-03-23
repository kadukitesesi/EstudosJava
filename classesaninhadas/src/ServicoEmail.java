public class ServicoEmail {


    public void enviar(Mensagem mensagem) {

        System.out.printf("Enviando mensagem de %s para %s",
                mensagem.remetente, mensagem.getDestinatario(), mensagem.getTexto());

    }

    public static String gerarAssinatura() {
        return "\n --\n Kadukitesesi";
    }
    public static class Mensagem {
        private static String remetente;
        private static String destinatario;
        private static String texto;

        public Mensagem(String remetente, String destinatario, String texto) {
            this.remetente = remetente;
            this.destinatario = destinatario;
            this.texto = texto;
        }

        public static String getRemetente() {
            return remetente;
        }

        public static String getDestinatario() {
            return destinatario;
        }

        public static String getTexto() {
            return texto + gerarAssinatura();
        }
    }

}

