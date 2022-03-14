package hu.progmatic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. feladat: Nullával nem osztunk!

       /* int first = 10;
        int second = 0;

        if (second == 0){
            System.out.println("Nullával nem osztunk!");
        }else {
            System.out.println(" A két szám osztaléka:" + (first/second));
        }*/


        // 2. feladat: Szám csökkentése, ha..

       /* int number = -1;

         if (number > 0 ){
             System.out.println(number-1);
         }else {
            System.out.println();
        }*/


        // 3.feladat: Negatív vagy sem?


       /* int number = 0;

        if ( number > 0){
            System.out.println("pozitív");
        } else if (number < 0){
            System.out.println("negatív");
        } else {
            System.out.println("nulla");
        }*/


        //4.feladat: Közlekedési lámpa


        Scanner scanner = new Scanner(System.in);

       /* System.out.println(" Kérem a lámpa színét!");
        String light = scanner.nextLine();

        switch (light){
            case "zöld":
                System.out.println("SZABAD");
                break;
            case "sárga":
                System.out.println("LASSITS");
                break;
            case "piros":
                System.out.println("MEGÁLLJ");
                break;
            default:
                System.out.println("NEM TUDOM");
        }*/


        //5. feladat: Évszakok


        /*System.out.println(" Kérem a hónapot!");
        String month = scanner.nextLine();

        if (month.equalsIgnoreCase("december")
        || (month.equalsIgnoreCase("január"))
        || (month.equalsIgnoreCase("február"))){
            System.out.println("TÉL");
        } else if (month.equalsIgnoreCase("március")
                || (month.equalsIgnoreCase("április"))
                || (month.equalsIgnoreCase("május"))){
            System.out.println("TAVASZ");
        }else if (month.equalsIgnoreCase("junius")
                || (month.equalsIgnoreCase("julius"))
                || (month.equalsIgnoreCase("augusztus"))){
            System.out.println("NYÁR");
        }else if (month.equalsIgnoreCase("szeptember")
                || (month.equalsIgnoreCase("október"))
                || (month.equalsIgnoreCase("november"))){
            System.out.println("ŐSZ");
        }else {
            System.out.println(" nem meghatározható");
        }*/


        // 6. feladat: Számok kiírása

      /*  for ( int n = 2;n>0; n--) {
            System.out.println(n);
        }*/

        //7. feladat: Visszaszámlálás


       /* for ( int n = 10; n>=0; n--) {
            System.out.println(n);
        }*/

        //8. feladat: Faktoriális

        //String n = "három";
        //for (n.length; ){

        //   System.out.println( n + " faktoriálisa: "+ (n.length("")));
        //}

        //int n =5;
       // n>=0;
         //n--;
        //System.out.println(n*n--);


        // 9. feladat: ABC


        /*String name = "abcdefghijklmnopqrstuvwxyz";
        int result = name.length();

        System.out.println(result); */

        /*int n = 2;
      char abc= new char[26];
      n>0; n++;
      char start = 'a';
      char second = (char) (start +1);
        System.out.println(second);

       for (int n = 0; n< abc.length ; n++){

       }
        int n = 2;
        char start = 'a';
        char second = (char) (start +1);
        char third = (char) (second +1);

        System.out.println(third);*/


        // int[] numbers = new int [];

        //Tömb szöveggé

        //int[] numbers = new int[];



        //Medvecsata

        /*int hp1 = 200;
        int ap1 = 30;
        int hp2 = 200;
        int ap2 = 20;

        //hp1-ap2
        //hp2-ap1
        //hp<= 0

        do {
            System.out.println(hp1 - ap2);
            System.out.println(hp2 - ap1);
        } while (hp1 <= 0 || hp2<= 0);
        {
            System.out.println("győztes: második medve");
            System.out.println("győztes: az első medve");
        }


        if (hp1 <= 0 && hp2<= 0){
            System.out.println("döntetlen");
        }else if (hp2<=0){
            System.out.println("győztes: Az első medve!");
        }else {
            System.out.println("győztes : A második medve!");
        }*/


        //Szökőév

       /* int year = 1800;

        if(year>1582 && year % 4==0){
           // if(year%400==0){
            System.out.println("szőkőév");
             }else{
            System.out.println("nem szökőév");
        }
    //}*/

        //Osztószámlálás

        /*int number= 10.;

        for (number>=0; number % Integer.MAX_VALUE== 0;){
            System.out.println("osztók száma: " + number);
        }*/


        /*int count = 0;
        int  number = Integer.MAX_VALUE;
        for (int i= 0; i < number ; i++){
            if ( number % (i+1)  == 0){
                count++;
            }
        }
        System.out.println("Osztok száma : " + count);*/


        //Elem csere

        /*char[] chars = new char['b','A', 'a'];

        System.out.println("{" + char[n-1] + + char[0] "}");*/



    }
}
