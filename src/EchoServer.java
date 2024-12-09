import utils.Server;
public class EchoServer extends Server {
    public EchoServer() {
        super(7);
        System.out.println("Server gestartet");
    }

    public  void processNewConnection(String pClientIP, int pClientPort) {
    }

    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
        send(pClientIP, pClientPort, pMessage);
    }
    public void processClosingConnection(String pClientIP, int pClientPort) {
    }

    public static void main(String[] args){
        EchoServer echoServer = new EchoServer();
    }
} 