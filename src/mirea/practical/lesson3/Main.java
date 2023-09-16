package mirea.practical.lesson3;
import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Shop();
        arrayMathRandom();
        arrayRandom();
    }

    public static void arrayMathRandom(){
        double[] array = new double[10];
        System.out.println("Random array: ");
        for(int i = 0; i < array.length; i++){
            array[i] = Math.random();
            System.out.print(array[i] + " ");;
        }
        System.out.println("\nSorted array: ");
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");;
        }
    }

    public static void arrayRandom(){
        Random rnd = new Random();
        double[] array = new double[10];
        System.out.println("Random array: ");
        for(int i = 0; i < array.length; i++){
            array[i] = rnd.nextDouble();
            System.out.print(array[i] + " ");;
        }
        System.out.println("\nSorted array: ");
        Arrays.sort(array);
        for (double v : array) {
            System.out.print(v + " ");
        }
    }

    public static void Shop(){
        HashMap<String, Double> assortment = new HashMap<String, Double>();
        assortment.put("Computer", 150000.0);
        assortment.put("Laptop", 80000.0);
        assortment.put("Iphone", 83000.5);
        assortment.put("Samsung", 55000.0);
        assortment.put("Huawei", 15000.1);
        System.out.print("Our assortment includes: ");
        for(String i : assortment.keySet()){
            System.out.print(i + " ");
        }
        System.out.println("\nWhat do you choose?");
        String choose = in.next();
        if(!(assortment.containsKey(choose)))
        {
            System.out.println("Sorry, there is no such product, come back next time");
            return;
        }
        System.out.printf("You choosed %s. What currency will you pay in?(rubles, dollars, euro)\n", choose);
        String currency = in.next();
        double money;
        if(currency.equalsIgnoreCase("rubles")){
            money = assortment.get(choose);
        }
        else if(currency.equalsIgnoreCase("dollars")){
            money = assortment.get(choose) / 96.51;
        }
        else if(currency.equalsIgnoreCase("euro")){
            money = assortment.get(choose) / 103.53;
        }
        else{
            System.out.println("It's a joke? Get out of here");
            return;
        }
        System.out.printf("You choosed %s and you have to pay %.2f %s", choose, money, currency);
    }
}
