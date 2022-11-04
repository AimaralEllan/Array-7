import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //ARRAY - МАССИВ-КОПТУК []
        //МАССИВ БИР ТИПТЕГИ МААЛЫМАТТАРДЫ КАМТЫГАН КУТУЧА
        /*int number1=1;
        int number2=2;
        int number3=3;*/

        /*int[] number={3,4,5,656}; //5 линиянын оордуна бир линия.Созсуз турдо баары бир тирте болуусу зарыл
        char[] symbols={'a','b','g','t'};
        String[] words={"Java", "Java2","Java3","Java4"};
        boolean[] boo={true,false};*/

        /*String cat="Sary Baatyr"; //Переменный бир эле маанини камтыйт
        String[] cats={"Sary baatyr","Murka","Casper","Sara","Tom"};*/ //Длина масства 5
        //Массив бир типтеги коп маанисни камтыйт.Мышыктын аттары элементтер

        //Массивдин тузулушу
        /*int[] variant1={5,6,7,8};
        int[] variant2=new int[]{3,4,5,6,7}; //Одно и то же вариант1 и вариант2
        int[] variant3=new int[3];
        variant3[0]=5;
        variant3[1]=6;
        variant3[2]=7;*/

        /*String[] words=new String[3];
        words[0]="Aimaral";
        words[1]="Amanda";
        words[2]="Ainazik";
        System.out.println(words[2]);*/

        //Кантип массивдин размерин чыгарса болот
        // int[] num={1,2,3,4,5};
        //System.out.println(num.length); //Размерин билуу(ичинде канча маани бар) учун колдонобуз
        //Бир индекстеги маанини чыгаруу
        //System.out.println(num[1]);

        //Массивдин баардык маанилерин чыгаруу
        //int[] array={1,2,3,4,5,6,7,8,9,10};
        //for (int i = 0; i < array.length; i++) {
          //  System.out.println(array[i]);
       //
        /* int a=0;
        while (a<array.length){
            System.out.println(array[a]);
            a++;
        }*/
        //System.out.println(Arrays.toString(array));
        /*String[] words={"Aimaral","ainazik","amanda"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }*/
        // Массивди рандом сандар менент толтуруу
        Random random=new Random();
        /*int[] a=new int[15];
        for (int i = 0; i < a.length; i++) {
            int randomNum=random.nextInt(1,15);
            a[i]=randomNum; // индекс барабар рандом санга
            System.out.println(a[i]);
        }*/

        /*int[] a=new int[10];
        int sum=0; //karzina
        for (int i = 0; i < a.length; i++) {
            //int randomNumber=random.nextInt();
            a[i]=random.nextInt(1,20);
            System.out.printf("%d ",a[i]);
            sum=sum+a[i]; //%dkelgen san biri birine koshulat

        }
        System.out.printf("  = %d",sum/a.length);*/



    }
}