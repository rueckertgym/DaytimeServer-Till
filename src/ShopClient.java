package src;

import src.utils.Client;

import javax.swing.*;

public class ShopClient extends Client {
    public ShopClient(String pServerIP, int pServerPort) {
        super(pServerIP, pServerPort);
    }

    public void groesseFarbeWaehlen(String pGroesse, String pFarbe){
        this.send("TSHIRT: "+ pGroesse+":"+pFarbe);
    }

    public void bestaetigen(String pAntwort){
        this.send ("BESTAETIGUNG:"+ pAntwort);
    }


    public void abmelden() {
        this.send("ABMELDEN");
    }

    public void processMessage(String pMessage) {
        //JOptionPane.showMessageDialog(null,"Server sendet:\n" + pMessage);
        String m = JOptionPane.showInputDialog(pMessage);
    }

    public static void main(String [] args) {
        var shopClient = new ShopClient("", 7);
    }
}
