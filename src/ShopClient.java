package src;

import src.utils.Client;
import src.utils.List;

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

    public void weiterKaufen(String pAntwort) {this.send("WEITERKAUFEN:" + pAntwort );}

    public void abmelden() {
        this.send("ABMELDEN");
    }

    public void processMessage(String pMessage) {
        if(pMessage.contains("Größe")){
            String m = JOptionPane.showInputDialog(pMessage);
            groesseFarbeWaehlen(m.split(",")[0], m.split(",")[1]);
        } else if (pMessage.contains("bestätigen") || pMessage.contains("ja")) {
            String m = JOptionPane.showInputDialog(pMessage);
            bestaetigen(m);
        } else if (pMessage.contains("Dank")){
            JOptionPane.showInputDialog(pMessage);
        }
    }

    public static void main(String [] args) {

        var shopClient = new ShopClient("10.56.17.212", 7);
    }
}
