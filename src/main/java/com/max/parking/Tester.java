package com.max.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
//        System.currentTimeMillis();
        LocalDateTime enter =
                LocalDateTime.of(2018,12,25,8,0,0);
        LocalDateTime leave =
                LocalDateTime.of(2018,12,25,10,11,0);
        Car car = new Car("AA-0001", enter);
        car.setLeave(leave);
        System.out.println(car.getDuration()+"分鐘");
        long hours = (long)Math.ceil(car.getDuration()/60.0);
        System.out.println("HOURS=" + hours);
        System.out.println("費用是"+ 30*hours +"元");
        //java8();


        //java();

    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //Local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss ");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2019,11,23,8,0,0);
        System.out.println(other);
    }

    private static void java() {
        Date date= new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s =  "2018/11/25 08:00:00";
        //Alt + Enter就有try_catch
        Date other = null;
        try {
            other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(calendar.MONTH, 1); //一月份是0
        System.out.println(calendar.getTime());
        calendar.set(calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}
