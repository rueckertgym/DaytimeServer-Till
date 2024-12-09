package src;
import utils.Server;

public class QOTDServer extends Server {
    private String[][] arr;
    public QOTDServer() {
        super(7);
        System.out.println("Server gestartet");
        arr = new String[1][1];
        arr[0][0] = "Hallo";
        arr[0][1] = "-Niklas";
        arr[1][0] = "Warum";
        arr[1][1] = "-Berdan";
    }

    public  void processNewConnection(String pClientIP, int pClientPort) {
    }

    public void processMessage(String pClientIP, int pClientPort, String pMessage) {

        send(pClientIP, pClientPort, pMessage);
    }
    public void processClosingConnection(String pClientIP, int pClientPort) {
    }

    public static void main(String[] args){
        QOTDServer qotdServer = new QOTDServer();
    }
}
