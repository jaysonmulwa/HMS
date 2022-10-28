import java.util.Date;

public class History {

    public int historyId;
    public Date date;
    public String narrative;
    public int staffId;

    public History (int historyId, Date date, String narrative, int staffId) {
        this.historyId = historyId;
        this.date = date;
        this.narrative = narrative;
        this.staffId = staffId;
    }
}
