import java.util.List;

public class Principal {
    public static void main(String[] args) {
        EnvioMensagem envioMensagem = new Sms();
        envioMensagem.enviarMensagem("Renato Andrade", "Ola mundo!");

        envioMensagem = new Email();
        envioMensagem.enviarMensagem("fale@renatoandrade.com", "Ola mundo!");

        envioMensagem = new Whatsapp();
        envioMensagem.enviarMensagem("5563999821991", "Ola mundo!");
    }
}
