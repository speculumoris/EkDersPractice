package replit;

import java.util.*;

public class List01 {
    public static void main(String[] args) {
        /*
        Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

        Note: Upper and lower case letters, spaces and special characters will not be changed.

        Input :

        It is very nice to write code.

        Output :

        .edoc etirw ot ecin yrev si tI


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir cumle girinz");
        String cumle1="It is very nice to write code.";
        String cml[]=cumle1.split(" ");
        ArrayList<String> myList1 = new ArrayList<String>();

        String k="";


        for (String w:cml) {
            k="";
            for (int i = w.length()-1; i> -1; i--) {
                k+=w.charAt(i);

            }
            myList1.add(k);
        }
        System.out.println(myList1);
        List<String>newRverse=new ArrayList<>();

        for (String w:myList1) {
            for (int j = 0; j < 1; j++) {
                newRverse.add(j,w);
            }

        }
        System.out.println(newRverse);

        *******************************************************************

        Create a 10-element list. Swap the 8th element with the 3rd element.

        INPUT :
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        Output:

        [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]

        List<String> list1=new ArrayList<>();
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        for (String w : names) {
            list1.add(w);
        }
        String elemt1=list1.get(2);
        String elemt2=list1.get(7);
        list1.set(2,elemt2);
        list1.set(7,elemt1);
        System.out.println(list1);

         */
        /*
        Write a program that deletes the letters 'a' from the names in the list given as input.


         INPUT :
         list1={"Ali","Veli","Ayse","Fatma","Omer"}

         OUTPUT :

         [Veli,Omer]


        List<String>newa=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        for (String s : newa) {
            if (!s.toLowerCase().contains("a")){
                newa.remove(s);
            }

        }
        System.out.println(newa);

         */
        /*
        Write a program that accepts an integer as input and prints first 10 prime numbers greater than input
            Check numbers if they are even or not in a return method.

            Input : 5

            Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]

        List<String>prime=new ArrayList<>();
        int input=5;
        int sayi=6;
        List<Integer> list1=new ArrayList<>();
        int count=0;

        while ((sayi>input)&&(list1.size()!=10)){
            count=0;
            for (int i = 5; i >0 ; i--) {
                if (sayi%i==0){
                    count++;
                }
            }
            if (count==1){
                list1.add(sayi);
            }

            sayi++;
        }
        System.out.println(list1);

         */ /*
         write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array

                Input :{1,2,3,4,5,6}

                element:6

                Output : [1,2,3,4,5]

        List<Integer>re=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer>re1=new ArrayList<>();
        int spesific=6;
        for (Integer w : re) {

            if (w==spesific){
               break;
            }
            re1.add(w);
        }
        System.out.println(re1);
        */
        /*
        Write a java program which accept a sentence as parameter,
        than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
         Input :
            I love Java.
            Output:
            Reversed sentence : avaJ evol I.
            It is not a palindrome"

        String input = "I love Java";
        List<String> rvrs = new ArrayList<>();
        List<String> rvrs1 = new ArrayList<>();
        List<String> rvrs2 = new ArrayList<>();

        for (String w : input.split(" ")) {
            rvrs.add(w);
        }
        System.out.println(rvrs);
        String k = "";
        int r=0;
        for (String w : rvrs) {
            k = "";
            for (int i = w.length() - 1; i > -1; i--) {
                k += w.charAt(i);

            }
            rvrs1.add(r,k);
            r++;
        }
        System.out.println(rvrs1);
        for (String w : rvrs1) {
            for (int i = 0; i <1 ; i++) {
                rvrs2.add(i,w);
            }
        }
        System.out.println(rvrs2);
        if (rvrs.equals(rvrs2)){
            System.out.println("palindrome sayidir");
        }else  System.out.println("palindrome sayi degildir");


         */
        /*
         Write a Java program to get a String from user as input and find the maximum occurring character in that string.(Ignore case sensitivity).

        Input : Learning java is easy

        Output: maximum occurring character is : a
         */
        String str="Learning java is easy";
        List<String> arr=new ArrayList<>();
        for (String w:str.split("")) {
            arr.add(w);
        }
        Collections.sort(arr);
        int counter=0;
        int fazlalik=0;
        int cntr=0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i-1).equalsIgnoreCase(arr.get(i))){
                counter++;
                fazlalik=Math.max(fazlalik,counter);
            }else {
                counter=0;
            }
        }
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i-1).equalsIgnoreCase(arr.get(i))){
               cntr++;
               if (cntr==fazlalik){
                   System.out.println(arr.get(i-1));
               }
            }

        }


        //if (counter)






    }
}
