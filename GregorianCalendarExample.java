import java.util.GregorianCalendar;

public class GregorianCalendarExample {
    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();

        System.out.println("Current Date: " + cal.get(GregorianCalendar.DATE));
        System.out.println("Current Month: " + (cal.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Current Year: " + cal.get(GregorianCalendar.YEAR));

        System.out.println("Day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Hour: " + cal.get(GregorianCalendar.HOUR));
        System.out.println("Minute: " + cal.get(GregorianCalendar.MINUTE));
        System.out.println("Second: " + cal.get(GregorianCalendar.SECOND));
    }
}