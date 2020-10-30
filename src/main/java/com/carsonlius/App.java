package com.carsonlius;

/**
 * Hello world!
 *
 */
public class App 
{


    static void f(Letter letter){
        letter.c = 'n';
    }

    public static void main( String[] args )
    {
        System.out.println(Letter.date);


//        Letter letter = new Letter();
//        letter.c = 'a';
//        System.out.println(letter.c);
//
//        f(letter);
//        System.out.println(letter.c);


        int a = (int) (1.5 *5);
        System.out.println( "a=" +a );
        int b = 5/3;
        System.out.println( "5/3=" +b );

    }
}
