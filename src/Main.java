import ru.synergy.Car;
import ru.synergy.Cat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

         //Arrays
/*

      Cat[]  cats = new Cat[3];
      cats[0]=new Cat("Tomas");
      cats[1]=new Cat("Begemot");
      cats[2]=new Cat("Fillip");

     // cats[1]=null;

        System.out.println(Arrays.toString(cats));
*/


              //Arraylist
        /*ArrayList<Cat> catsList = new ArrayList<>();
         for (Cat cat:cats){
             catsList.add(cat);
         }
           catsList.add( new Cat("Begemot2"));

         catsList.remove(1);
         Cat cat = catsList.get(0);
        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2,cat);
        catsList.set(2,new Cat("меня сюда вставили"));

        catsList.removeAll(Arrays.asList(cat,catsList.get(3)));

        System.out.println(catsList.toString());

        System.out.println(catsList.size());
*/

        // LinkedList

     /*   String str1= new String("Hello World!");
        String str2= new String("my name is Anna");
        String str3= new String("I love is java");

        LinkedList<String> AnnaBio = new LinkedList<>();
        AnnaBio.add(str1);
        AnnaBio.add(str2);
        AnnaBio.add(str3);

        System.out.println(AnnaBio);
        AnnaBio.remove(1);
        System.out.println(AnnaBio);
*/

       //LinkedList on practice

        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari spider");
        Car bugatti = new Car("Veyron");
        Car mercedes = new Car("Benz");

        cars.addAll(Arrays.asList(ferrari,bugatti,mercedes));


        System.out.println(cars);

        cars.addFirst(new Car("Ford"));
        cars.addLast(new Car("Feat"));
        System.out.println(cars.pollFirst());
        System.out.println(cars);



    }
}