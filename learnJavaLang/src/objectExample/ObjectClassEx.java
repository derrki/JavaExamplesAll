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

        Integer mInteger = new Integer(50);
        Float mFloat = new Float(50f);
        System.out.println("\n " + mInteger.equals(mFloat));
        System.out.println(mInteger.equals(50));

        Person person = new Person("Vasa", 25);
        Person person1 = new Person("Vasa", 25);
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        Person person2 = person;
        System.out.println(person2.hashCode());
        System.out.println(new Person().hashCode());
        System.out.println(mInteger.hashCode());
    }
}
