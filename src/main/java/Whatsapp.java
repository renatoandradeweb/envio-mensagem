public class Whatsapp extends EnvioMensagem{
    @Override
    protected void enviarMensagem(String destinatario, String mensagem) throws MessageSendException {
        System.out.printf("Enviando um Whatsapp para %s%n", destinatario);
        System.out.printf("Mensagem: %s%n", mensagem);
    }
}
