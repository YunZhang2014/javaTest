package ch12;

import java.lang.reflect.Method;

/**
 * Created by Allbts-IT on 24/10/2016.
 */
public class Meta {
    @MyAnno(str = "Annotation Example", val=100)
    public static void myMeth() {
//        Meta ob = new Meta();
//        Class<?> c = ob.getClass();
        Class<?> c = Meta.class;
        try {
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
