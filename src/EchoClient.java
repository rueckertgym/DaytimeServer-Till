import javax.swing.JOptionPane;
import utils.Client;
public class EchoClient extends Client {
    public EchoClient(String pServerIP, int pServerPort) {
        super(pServerIP, pServerPort);
    }

    public void processMessage(String pMessage) {
        JOptionPane.showMessageDialog(null,"Server sendet:\n" + pMessage);
    }

    public void sendMessageToServer() {
        String lMessage;
        lMessage = JOptionPane.showInputDialog("Bitte geben Sie eine neue Nachricht ein:");
        send(lMessage);
    }
}