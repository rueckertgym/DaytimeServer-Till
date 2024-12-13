package src;

import src.utils.Client;

import javax.swing.*;

public class QOTDClient extends Client {
    public QOTDClient(String pServerIP, int pServerPort) {
        super(pServerIP, pServerPort);
    }

    public void processMessage(String pMessage) {
        JOptionPane.showMessageDialog(null,"Server sendet:\n" + pMessage);
    }

    public static void main(String[] args) {
        QOTDClient tcpipc = new QOTDClient("djxmmx.net",17);
    }
}