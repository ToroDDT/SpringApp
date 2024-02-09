package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Parrot p = new Parrot();
        var context = new AnnotationConfigApplicationContext();


        System.out.println( "Hello World!" );
    }
}
