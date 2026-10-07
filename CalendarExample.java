import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println("Current Date: " + cal.get(Calendar.DATE));
        System.out.println("Current Month: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Current Year: " + cal.get(Calendar.YEAR));

        System.out.println("Day of Week: " + cal.get(Calendar.DAY_OF_WEEK));
    }
}