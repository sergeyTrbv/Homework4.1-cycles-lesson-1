public class Main {
    public static void main(String[] args) {


        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");


          for (int i = 1; i <= 10;  i++) {
          System.out.println( i );
          };

        System.out.println("Задание 2");

        for (int i = 10; i >-1; i--){
            System.out.println(i);
        }

        System.out.println("Задание 3");

        for (int i = 0; i < 18; i+=2){
            System.out.println(i);
        }

        System.out.println("Задание 4");

        for (int i = 10; i > -11; i--){
            System.out.println(i);
        }

        System.out.println("Домашнее задание 2 \nЗадание 1");

        for (int i = 1904; i<2096; i = i + 4){
            System.out.println(i + " является високосным");
        }

        System.out.println("Задание 2");

        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }

        System.out.println("Задание 3");

        for (int i = 1; i <= 512; i = i * 2 ){
            System.out.println(i);
        }

        System.out.println("домашнее задание 3 \nЗадание 1");

        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("месяц " + i + " сумма накоплений равна " + total);
        }
            System.out.println(total);

        System.out.println("Задание 2");

        int salary1 = 29000;
        int bank = 0;
        for ( int i = 0; i < 12; i++){
            bank = bank + (bank/100) ;
            bank = bank + salary1;
            System.out.println("месяц " + i + " сумма накоплений равна " + bank);
        }
    }
}