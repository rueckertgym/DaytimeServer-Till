package src;
import src.utils.Server;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class GeburtstagsServer extends Server {
    public GeburtstagsServer() {
        super(7);
        System.out.println("Server gestartet");
    }

    public  void processNewConnection(String pClientIP, int pClientPort) {
    }

    private Date processDate(String pDate)
        throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(pDate);
    }

    private Date getCurrentDate() throws ParseException {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        String formattedDate = myDateObj.format(myFormatObj);
        return processDate(formattedDate);
    }

    public void processMessage(String pClientIP, int pClientPort, String pMessage){
        try {
            var diff = TimeUnit.DAYS.convert(Math.abs(processDate(pMessage).getTime() - getCurrentDate().getTime()), TimeUnit.MILLISECONDS);
            send(pClientIP, pClientPort, String.valueOf(diff));
        } catch (Exception ignored) {

        }
    }
    public void processClosingConnection(String pClientIP, int pClientPort) {
    }

    public static void main(String[] args){
        GeburtstagsServer geburtstagsServer = new GeburtstagsServer();
    }
}
