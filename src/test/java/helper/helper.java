package helper;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class helper {

    public boolean dateVAlidater(String testDate) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(testDate);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int returnMonthFromStringDate(String testDate) throws ParseException {
        String[] givenDate = testDate.split("/");
        return Integer.parseInt(givenDate[1]);
    }

    public String getMonth(int month) {
        return new DateFormatSymbols().getShortMonths()[month-1];
    }

    public int getMonth(String testDate){
        String[] dates = testDate.split("/");
        return Integer.parseInt(dates[1]);
    }
    public int getMonthFromString(String currentDate) throws ParseException {
        String[] dates = currentDate.split(" ");
        Date date  = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(dates[1]);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        System.out.println(month);
        int monthNeedtoTravers = month + 1;
        return monthNeedtoTravers;

    }


    public String  monthNameInString(String testDate){
        try{
        if(dateVAlidater(testDate)){
          return  getMonth(returnMonthFromStringDate(testDate));
        }
        }catch(Exception e){
            e.printStackTrace();
        }

     return null;
    }
}
