package util;

public class Sys {
    public static int iHash(Object x){
        return System.identityHashCode(x);
    }
}
