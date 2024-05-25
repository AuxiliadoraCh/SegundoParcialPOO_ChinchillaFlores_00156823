package TipoPago;

public class Alipay extends TipoPago{

    public Alipay(String username, String password) {
        super(username + ":alipay", password);
    }
}
