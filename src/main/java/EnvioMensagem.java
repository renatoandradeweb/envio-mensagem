abstract class EnvioMensagem {
    protected abstract void enviarMensagem(String destinatario, String mensagem) throws MessageSendException;
}
