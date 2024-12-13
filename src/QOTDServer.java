package src;
import src.utils.Server;

import java.util.Random;

public class QOTDServer extends Server {
    private String[][] arr;
    public QOTDServer() {
        super(7);
        System.out.println("Server gestartet");
        arr = new String[2][2];
        arr[0][0] = "Hallo";
        arr[0][1] = "-Niklas";
        arr[1][0] = "Warum";
        arr[1][1] = "-Berdan";
    }

    public  void processNewConnection(String pClientIP, int pClientPort) {
        Random rand = new Random();
        int n = rand.nextInt(2);
        send(pClientIP, pClientPort, arr[n][0]);
        send(pClientIP, pClientPort, arr[n][1]);
    }

    public void processMessage(String pClientIP, int pClientPort, String pMessage) {

    }
    public void processClosingConnection(String pClientIP, int pClientPort) {
    }

    public static void main(String[] args){
        QOTDServer qotdServer = new QOTDServer();
    }
}
