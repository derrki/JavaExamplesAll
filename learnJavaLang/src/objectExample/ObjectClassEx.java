package objectExample;

import java.util.GregorianCalendar;

public class ObjectClassEx {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        GregorianCalendar calendarClone = (GregorianCalendar) calendar.clone();

        System.out.println(calendar.getTime());
        System.out.println(calendarClone.getTime());
        System.out.println(calendar.clone() != calendarClone);
        System.out.println(calendar.clone().getClass() == calendar.clone());
        System.out.println(calendar.clone().equals(calendar));
    }
}
