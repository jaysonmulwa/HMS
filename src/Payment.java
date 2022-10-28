public class Payment {
    public int paymentId;
    public String paymentMethod;
    public float paymentAmount;
    public String currencyCode;
    public String paidFor;
    public int appointmentId;

    public Payment (int _paymentId, String _paymentMethod, float _paymentAmount, String _currencyCode, String _paidFor, int _appointmentId) {
        paymentId = _paymentId;
        paymentMethod = _paymentMethod;
        paymentAmount = _paymentAmount;
        currencyCode = _currencyCode;
        paidFor = _paidFor;
        appointmentId = _appointmentId;
    }

}
