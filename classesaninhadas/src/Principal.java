public class Principal {
    public static void main(String[] args) {
        ServicoEmail servico = new ServicoEmail();

        ServicoEmail.Mensagem mensagem = new  ServicoEmail.Mensagem("kadukitesesi@hotmail.com", "maria@joaninha.com",
                "Olá, tudo bem?");

        servico.enviar(mensagem);
    }
}
