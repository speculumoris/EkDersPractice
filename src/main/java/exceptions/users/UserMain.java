package exceptions.users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

    static Scanner scan=new Scanner(System.in);
    static List<UserPojo> userList=new ArrayList<>();
    public static void main(String[] args) {
        do {
            System.out.println("lutfen user bilgilerini giriniz" +
                    "cikmak icin 1'e basiniz");

            System.out.println("user ismini giriniz");
            String name = scan.nextLine();
            if (name.equals("1")){
                System.out.println("cikisiniz yapiliyor");
                break;
            }
            String passWord="";
            try {
                System.out.println("password giriniz");
                passWord = scan.nextLine();
                if (passWord.length()<6){
                    throw  new RuntimeException();
                }
            } catch (Exception e) {
                System.err.println("password 6 harften uzun olmalı");
                System.out.println("lutfen tekrar giriniz");
                passWord= scan.nextLine();
            }

            UserPojo userPojo=new UserPojo(name,passWord);
            userList.add(userPojo);

        }while (true);

        System.out.println(userList);






    }
}
