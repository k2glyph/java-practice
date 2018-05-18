
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Solution {

    public static String getDay(String day, String month, String year) {
        try {
            String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

            Calendar cal = Calendar.getInstance();
            cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(year + "-" + month + "-" + day));

            String name = days[cal.get(Calendar.DAY_OF_WEEK) - 1];
            return name;
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}

