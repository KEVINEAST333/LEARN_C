package exam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class hutu {
    public int reorder (int[] prices) {
        // write code here
        int n = prices.length;
        return n/3 + n%3;
    }
    public int workdays_between (int y1, int m1, int d1, int y2, int m2, int d2) throws ParseException {
        // write code here
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar begin = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        Date beginDate = dateFormat.parse(y1 + "-" + m1 + "-" +d1);
        Date endDate = dateFormat.parse(y2 + "-" + m2 + "-" +d2);
        begin.setTime(beginDate);
        end.setTime(endDate);
        int result = 0;
        while(begin.compareTo(end) <= 0 ) {
            if(begin.get(Calendar.DAY_OF_WEEK) != 1 &&begin.get(Calendar.DAY_OF_WEEK) != 7 ) {
                result++;
            }
            begin.add(Calendar.DATE,1);
        }
        return result;
    }
}
