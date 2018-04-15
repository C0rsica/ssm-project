package top.yangluotong.ssm.util;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;

/**
 * @author corsica
 * @date 2018/4/11
 * @time 上午7:53
 */
public class DateUtil {

  public static void main(String[] args) {
    //日期转换  jdk8-  jdk8+   joda
//    System.out.println(LocalDate.now());

    // Format for input
    DateTimeFormatter dt = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
// Parsing the date
//    LocalDate date = LocalDate.parse(dt, inputFormat);
//    log.info("joda time test:" + dt);
    DateUtil du = new DateUtil();
//    log.info("isafterPayday:" + du.isAfterPayDay(new DateTime()));
  }


  public boolean isAfterPayDay(DateTime datetime) {
    if (datetime.getMonthOfYear() == 2) {   // February is month 2!!
      return datetime.getDayOfMonth() > 26;
    }
    return datetime.getDayOfMonth() > 28;
  }

  public Days daysToNewYear(LocalDate fromDate) {
    LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
    return Days.daysBetween(fromDate, newYear);
  }

  public boolean isRentalOverdue(DateTime datetimeRented) {
    Period rentalPeriod = new Period().withDays(2).withHours(12);
    return datetimeRented.plus(rentalPeriod).isBeforeNow();
  }

  public String getBirthMonthText(LocalDate dateOfBirth) {
    return dateOfBirth.monthOfYear().getAsText(Locale.ENGLISH);
  }

}
