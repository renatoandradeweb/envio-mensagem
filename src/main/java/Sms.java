public class Sms extends EnvioMensagem{



    @Override
    protected void enviarMensagem(String destinatario, String mensagem) throws MessageSendException {
        System.out.printf("Enviando um SMS para %s%n", destinatario);
        System.out.printf("Mensagem: %s%n", mensagem);
    }
}
