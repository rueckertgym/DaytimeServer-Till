package src;

import src.utils.Client;

import javax.swing.*;

public class DaytimeClient extends Client {
    public DaytimeClient(String pServerIP) {
        super(pServerIP, 13);
    }

    public void processMessage(String pMessage) {
        JOptionPane.showMessageDialog(null,"Server sendet:\n" + pMessage);
    }

    public static void main(String[] args) {
        DaytimeClient dtc = new DaytimeClient("time.fu-berlin.de");
    }
    //jh
}