import java.util.Date;

public class History {

    public int historyId;
    public Date date;
    public String narrative;
    public int staffId;

    public History (int _historyId, Date _date, String _narrative, int _staffId) {
        historyId = _historyId;
        date = _date;
        narrative = _narrative;
        staffId = _staffId;
    }
}
