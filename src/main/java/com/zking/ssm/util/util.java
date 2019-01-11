package com.zking.ssm.util;

import java.util.Date;
import java.sql.Timestamp;

public class util {


        public static Date TimeStamptodate(Timestamp timestamp){
        Date  date=new Date();
        date=timestamp;
        return date;
    }
}
