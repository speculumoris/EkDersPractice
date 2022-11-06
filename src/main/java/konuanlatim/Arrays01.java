package konuanlatim;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1)Ayni data tipinde coklu datayi depolamak icin java nin olusturdugu yapilar vardir.
        bu yapilardan birisi de "Array"lerdir.

        * Arrays icindeki tum variable’lar ayni data type’inde olmalidir
         */


        //2) Bir Array nasil declare edilir?
        int[] arr1;
        int arr[] = new int[6];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        System.out.println(Arrays.toString(arr));

        int arr2[] = {3, 5, 1, 7};

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //Binary Search ==> bir elemanin Arrayde var olup olmadigini kontrol etmek icin kullaniriz
        //1) Array'i sort etmeli baska.
        // 2) Aradigimiz elemanin indexini verir.

        int arr3[] = {2, 3, 7, 1, 2, 11};
        Arrays.sort(arr3);
        int a = 2;

        int idx = Arrays.binarySearch(arr3, a);
        System.out.println(idx);//-7
        //binarySearch Method'u aradiginiz eleman Array'de yoksa "-a" seklinde bir negatif sayi alirsiniz

        //bu sayinin "-" negatif isaretinin anlami bu eleman Array de yok demektir."a" nin anlami olsaydi kacinci sirada olurdu demektir.
        //                                                                            (indexe bakilmaz kacinci eleman olduguna bakilir

        //binarySearch methodu tekrarlayan elemanlar icin kullanilmaz.
        //Sort methodunu tekrarlayan elemanlar icin kullaniyorduk.

        //Multidimensional Arrays: Bir AAray'in elemanlari da Array ise buna multidimensional Array denir.
        // olusturuken istedigimiz katman sayisi kadar "[]" ekleriz.

        int arr4[][] = new int[2][3];

        arr4[0][0] = 0;
        arr4[0][1] = 2;
        arr4[0][2] = 3;

        arr4[1][0] = 1;
        arr4[1][1] = 2;
        arr4[1][2] = 3;

        System.out.println(Arrays.toString(arr4[1]));//outer Array'in elemanlarini yazdiirir.

        System.out.println(arr4[0][1]);

        //Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin toplamini ekrana yazdiran bir program yaziniz.
        // (Zor soru) arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

        int art1[][] = {{1, 2}, {3, 4, 5}, {6, 7}};
        int art2[][] = {{7, 8, 9}, {10, 11}, {12, 1}};

        int outerKısaIdx = Math.min(art1.length, art2.length);

        int toplam = 0;
        for (int i = 0; i < outerKısaIdx; i++) {
            int innerKisa = Math.min(art1[i].length, art2[i].length);
            for (int j = 0; j < innerKisa; j++) {
                toplam = art1[i][j] + art2[i][j];
                System.out.print(toplam + " ");
            }

        }

        System.out.println();
        // nums = [1,2,3,4,5,6,7], k = 3 output=[5,6,7,1,2,3,4]
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        int nums1[] = new int[nums.length];

        System.out.println(tekrarla(nums,nums1,k));
    }

    private static String tekrarla(int[] nums, int[] nums1, int k) {

        int counter=k;
            for (int i = 0; i < nums.length; i++) {
               nums1[k]=nums[i];

               if (k==6){
                   k=-1;
               }
               k++;
               if (counter==k){
                   break;
               }
            }

        return Arrays.toString(nums1);
        }
}



