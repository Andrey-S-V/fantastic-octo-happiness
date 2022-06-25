package DataTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class  Data {

    public String dataTime () {
        java.util.Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd-MM-yyyy '   ' HH:mm:ss ");
        return formatForDateNow.format(dateNow);
    }
}
