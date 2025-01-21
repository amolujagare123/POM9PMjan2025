package Utility;

import java.util.ResourceBundle;

public class Reader {

    static ResourceBundle rb = ResourceBundle.getBundle("invoiceplane");

    public static String getUrl()
    {
        return rb.getString("url");
    }

    public static String getUsername()
    {
        return rb.getString("username");
    }

    public static String getPassword()
    {
        return rb.getString("password");
    }
}
