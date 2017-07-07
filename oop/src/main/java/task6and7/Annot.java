package task6and7;


import java.lang.annotation.Documented;

@Documented
public @interface Annot {
    String author();
    String date();
    String version();
}
