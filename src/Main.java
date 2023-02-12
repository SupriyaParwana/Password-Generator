import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.util.Collections;
public class Main {
    static String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};
   static String cap[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","Z"};
   static String numb[] = {"1","2","3","4","5","6","7","8","9","0"};
   static String spec[]={" ","!","\"","#","$","%","^","&","*","(",")","_","-","=","+"};
   static Scanner input =  new Scanner(System.in);

    public static void Default(){

        int n= input.nextInt();
        int x=0;
        while(x<n) {
            ArrayList<String> arr1 = new ArrayList<>();
            int i = 0;
            int j = 0;
            while (i < 4) {
                Random random = new Random();
                int index1 = random.nextInt(alpha.length);
                int index2 = random.nextInt(cap.length);
                int index3 = random.nextInt(numb.length);
                int index4 = random.nextInt(spec.length);
                arr1.add(j, alpha[index1]);
                arr1.add(j, cap[index2]);
                arr1.add(j, numb[index3]);
                arr1.add(j, spec[index4]);
                i += 1;
                j += 1;
             }
              Collections.shuffle(arr1);
             StringBuffer sb = new StringBuffer();
              for (int s = 0; s < arr1.size(); s++) {
                sb.append(arr1.get(s));
              }
            String str = sb.toString();
            System.out.println(str);
                  x+=1;
        }
    }

    public static void Advance(){

        System.out.println("How many Alpha Characters :");
        int n1 = input.nextInt();
        System.out.println("How many Cap Character :");
        int n2 = input.nextInt();
        System.out.println("How many num Characters :");
        int n3 = input.nextInt();
        System.out.println("How many special Characters :");
        int n4 = input.nextInt();
        System.out.println("How many passwords you want: ");
        int n5 = input.nextInt();
           int z=0;
          while(z<n5) {
            ArrayList<String> arr2 = new ArrayList<>();

            int i = 0;
            int q = 0;
            while (i < n1) {

                Random random = new Random();
                int index1 = random.nextInt(alpha.length);
                arr2.add(q, alpha[index1]);
                i += 1;
                q += 1;
            }
            int j = 0;
            while (j < n2) {
                Random random = new Random();
                int index2 = random.nextInt(cap.length);
                arr2.add(q, cap[index2]);
                j += 1;
                q += 1;
            }
            int k = 0;
            while (k < n3) {
                Random random = new Random();
                int index3 = random.nextInt(numb.length);
                arr2.add(q, numb[index3]);
                k += 1;
                q += 1;
            }
            int l = 0;
            while (l < n4) {
                Random random = new Random();
                int index4 = random.nextInt(spec.length);
                arr2.add(q, spec[index4]);
                l += 1;
                q += 1;
            }
            Collections.shuffle(arr2);
            StringBuffer sb = new StringBuffer();
            for (int s = 0; s < arr2.size(); s++) {
                sb.append(arr2.get(s));
            }
            String str = sb.toString();
            System.out.println(str);
            z+=1;
        }
    }
    public static void main(String[] args) {
        System.out.print("***Password Generator*** \n" +
                " 1)Default(16 Letters) \n" +
                " 2)Advance \n" +
                " 3)Custom Words \n >>>" );
        Scanner input = new Scanner(System.in);
        int menu = -1;
        while(menu>4 || menu<0){
            menu = input.nextInt();
            if(menu==1){
                Main obj = new Main();
                obj.Default();
            }
            else if(menu == 2){
                Main obj1 = new Main();
                  obj1.Advance();
            }
        }
    }
}