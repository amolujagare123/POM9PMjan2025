package Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static String convertCountry(String shortCountry) {
        String convertedCountry = "";

        switch (shortCountry) {
            case "IN":
                convertedCountry = "India";
                break;
            case "US":
                convertedCountry = "United States";
                break;
            case "UK":
                convertedCountry = "United Kingdom";
                break;
            case "CA":
                convertedCountry = "Canada";
                break;
            case "AU":
                convertedCountry = "Australia";
                break;
            case "FR":
                convertedCountry = "France";
                break;
            case "DE":
                convertedCountry = "Germany";
                break;
            case "IT":
                convertedCountry = "Italy";
                break;
            case "ES":
                convertedCountry = "Spain";
                break;
            case "JP":
                convertedCountry = "Japan";
                break;
            case "CN":
                convertedCountry = "China";
                break;
            case "RU":
                convertedCountry = "Russia";
                break;
            case "BR":
                convertedCountry = "Brazil";
                break;
            case "ZA":
                convertedCountry = "South Africa";
                break;
            case "MX":
                convertedCountry = "Mexico";
                break;
            case "NZ":
                convertedCountry = "New Zealand";
                break;
            case "SG":
                convertedCountry = "Singapore";
                break;
            case "KR":
                convertedCountry = "South Korea";
                break;
            case "AE":
                convertedCountry = "United Arab Emirates";
                break;
            case "SA":
                convertedCountry = "Saudi Arabia";
                break;
            case "NO":
                convertedCountry = "Norway";
                break;
            default:
                convertedCountry = "Unknown Country";
                break;
        }

        return convertedCountry;

    }
    public static String getGender(String genderID)
    {
        String gender = "";

        switch (genderID)
        {
            case "0" : gender="Male";break;
            case "1" : gender="Female";break;
            case "2" : gender="Other";break;
        }


        return gender;
    }

    // 09/01/2015 != 2015-09-01 --> MM/dd/yyyy - ex / yyyy-MM-dd - db

    public static  String convertDate(String dbDate) throws ParseException // yyyy-MM-dd
    {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dbDate);

        return  new SimpleDateFormat("MM/dd/yyyy").format(date);
    }
}
