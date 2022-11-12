package java8way.datetime;


import java.time.*;

public class DemoDateTimeLocalDateTime {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //how to get individual elements of date
        int dd = localDate.getDayOfMonth();
        int mm = localDate.getMonthValue();
        int yyyy = localDate.getYear();

        System.out.printf("Date formatted is %d/%d/%d ",dd,mm,yyyy);
        System.out.println();
        //how to get individual time elements
        int hh = localTime.getHour();
        int min = localTime.getMinute();
        int ss = localTime.getSecond();
        int ns = localTime.getNano();

        System.out.printf("Time formatted is %d:%d:%d:%d",hh,min,ss,ns);
        System.out.println();

        //date and time together
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //to print a particular date
        LocalDateTime ldt = LocalDateTime.of(1995,03,18,8,10,00);
        System.out.println(ldt);

        //to find a date after or before some date
        System.out.println("after 6 months : "+ldt.plusMonths(6));
        System.out.println("before 6 months : "+ldt.minusMonths(6));

        //Age Calculation
        LocalDate birthday = LocalDate.of(1995,03,18);
        LocalDate todaysDate = LocalDate.now();
        Period period = Period.between(birthday,todaysDate);
        System.out.println("Age : "+period.getYears());
        System.out.println("Age in days : "+period.getDays());
        System.out.println("Age in Months: "+period.getMonths());

        //Getting specific year and finding leap year or not
        int n1 = 1995;
        int n2 = 2004;

        Year y1=Year.of(n1);
        Year y2=Year.of(n2);

        if(y1.isLeap()){
            System.out.println(y1+" is a leap year");
        }else{
            System.out.println(y1+" not a leap year");
        }
        if(y2.isLeap()){
            System.out.println(y2+" is a leap year");
        }else{
            System.out.println(y2+" not a leap year");
        }

        //Zone Id implementation
        ZoneId zoneIdLocal = ZoneId.systemDefault();
        System.out.println(zoneIdLocal);

        //ZoneId for america
        ZoneId la =ZoneId.of("America/Los_Angeles");
        ZonedDateTime dt = ZonedDateTime.now(la);

        System.out.println(dt);
    }
}
