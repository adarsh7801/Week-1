import java.util.Calendar;

public class TimeZone {
    public static void main(String[] args) {
        // Get the current local time
        Calendar localTime = Calendar.getInstance();
        int localHour = localTime.get(Calendar.HOUR_OF_DAY);
        int localMinute = localTime.get(Calendar.MINUTE);
        int localSecond = localTime.get(Calendar.SECOND);

        System.out.printf("Current Local Time: %02d:%02d:%02d%n", localHour, localMinute, localSecond);

        // Get the current GMT time
        Calendar gmtTime = Calendar.getInstance(java.util.TimeZone.getTimeZone("GMT"));
        int gmtHour = gmtTime.get(Calendar.HOUR_OF_DAY);
        int gmtMinute = gmtTime.get(Calendar.MINUTE);
        int gmtSecond = gmtTime.get(Calendar.SECOND);

        System.out.printf("Current GMT Time: %02d:%02d:%02d%n", gmtHour, gmtMinute, gmtSecond);

        // Get the current PST time
        Calendar pstTime = Calendar.getInstance(java.util.TimeZone.getTimeZone("America/Los_Angeles"));
        int pstHour = pstTime.get(Calendar.HOUR_OF_DAY);
        int pstMinute = pstTime.get(Calendar.MINUTE);
        int pstSecond = pstTime.get(Calendar.SECOND);

        System.out.printf("Current PST Time: %02d:%02d:%02d%n", pstHour, pstMinute, pstSecond);
    }
}
