package ClassWorkArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtil {
    public static void main(String[] args) {
        //Одномерные массивы
        //№1
        /*int number = 2;
        int [] array = new int[10];
        for(int i = 0; i< array.length; i++){
            array[i] = number;
            number+=2;
        }
        StringBuilder builderLine = new StringBuilder();
        StringBuilder builderRow = new StringBuilder();
        for (int i = 0; i<array.length; i++){
            builderLine.append(array[i]+" ");
            builderRow.append(array[i]+"\n");
        }
        System.out.println(builderLine.toString());
        System.out.println(builderRow.toString());*/

        //#2
        /*int [] array2 = new int [50];
        int number=1;
        for (int i = 0; i<array2.length; i++){
            array2[i]=number;
            System.out.print(array2[i]+" ");
            number+=2;
        }
        System.out.println();
        for(int i = 49; i>=0; i--){
            System.out.print(array2[i]+" ");
        }*/

        //#3
        /*int[]array3 = new int[15];
        int count=0;
        for(int i = 0; i< array3.length; i++){
            array3[i] = (int)(Math.random()*100);
            System.out.print(array3[i]+" ");
            if(array3[i]%2==0)count++;
        }
        System.out.println("\n"+count);*/

        //#4
        /*int[]array4 = new int [20];
        for(int i = 0; i< array4.length; i++){
            array4[i] = (int)(Math.random()*21);
            System.out.print(array4[i]+" ");
        }
        System.out.println();
        for(int i = 0; i< array4.length; i++){
            if(i%2!=0)array4[i]=0;
            System.out.print(array4[i]+" ");
        }*/

        //№5
        /*int [] array5 = new int[5];
       int [] array6 = new int[5];
       StringBuilder stb1 = new StringBuilder();
       StringBuilder stb2 = new StringBuilder();
       int average1=0;
       int average2=0;
       for(int i = 0; i< array5.length; i++){
           array5[i] = (int)(Math.random()*16);
           average1+=array5[i];
           array6[i] = (int)(Math.random()*16);
           average2+=array6[i];
           stb1.append(array5[i]+" ");
           stb2.append(array6[i]+" ");
       }
        System.out.println();
        System.out.println(stb1);
        System.out.println(stb2);
        if(average1/5>average2/5) System.out.println("Arithmetic mean for array5 is bigger");
        else if (average1/5<average2/5) System.out.println("Arithmetic mean for array6 is bigger");
        else System.out.println("Arithmetic average is even");*/

        //6
        /*int[]array7=new int[4];
        for(int i = 0; i< array7.length; i++){
            array7[i] = (int)(Math.random()*11);
            System.out.print(array7[i]+" ");
        }
        if(array7[0]<array7[1] && array7[1]<array7[2] && array7[2]<array7[3])
            System.out.println("This array is a strictly increasing sequence");*/

        //7
        /*int[]array8 = new int[12];
        int max=0;
        for(int i = 0; i< array8.length; i++){
            array8[i]=(int)(Math.random()*16);
            if(array8[i]>max)max=array8[i];
        }
        int lastIndexOfMax=0;
        for(int i = 0; i< array8.length; i++){
             if(array8[i]==max)lastIndexOfMax=i;
        }
        System.out.println(Arrays.toString(array8));
        System.out.println(max+" "+lastIndexOfMax);*/

        //8 -> ??
        /*int[]array9=new int[10];
        int[]array10=new int[10];
        double[]array11=new double[10];
        StringBuilder stb9 = new StringBuilder();
        StringBuilder stb10 = new StringBuilder();
        StringBuilder stb11 = new StringBuilder();
        int intNumCount=0;
        for(int i = 0; i<array9.length; i++){
            array9[i]=(int)(Math.random()*10);
            array10[i]=(int)(Math.random()*10);
            try{array11[i]=array9[i]/array10[i];}
            catch (ArithmeticException e){
                e.getMessage();
            }
            stb9.append(array9[i]+" ");
            stb10.append(array10[i]+" ");
            stb11.append(array11[i]+" ");
            if(array11[i]%1==0) intNumCount++;

        }
        System.out.println(stb9);
        System.out.println(stb10);
        System.out.println(stb11);
        System.out.println(intNumCount);*/

        //9
        /*try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            System.out.println("Enter positive number");
            int userNumber = Integer.parseInt(reader.readLine());
            if(userNumber<=0) {
                System.out.println("Try again");
                }
            int[]array12 = new int[userNumber];
            for(int i = 0; i < array12.length; i++){
                array12[i]=(int)(Math.random()*16);
                System.out.print(array12[i]+" ");
            }
            int leftHalfSum=0;
            int rightHalfSum=0;
            for(int i = 0; i < array12.length; i++){
                    if(i< array12.length/2){
                leftHalfSum += array12[i];}
                if(i>=array12.length/2){
                    rightHalfSum+=array12[i];
                }
            }
            System.out.println();
            if (leftHalfSum>rightHalfSum)
            System.out.println("Left half of array is bigger");
            else if (leftHalfSum<rightHalfSum)
            System.out.println("Right half of array is bigger");
            else System.out.println("Left and right half of array is even");

        }
        catch (IOException e) {
            e.printStackTrace();
        }*/

        //10
        /*try(BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));){
            System.out.println("Enter number over 3");
            int n = Integer.parseInt(reader2.readLine());
            if(n<=3) System.out.println("Try again");
            int [] array13 = new int[n];
            List<Integer> list = new ArrayList();
            int countEvenNum=0;

            for(int i = 0; i< array13.length; i++){
                array13[i]=(int)(Math.random()*n);
                if(array13[i]%2==0) {
                    countEvenNum++;
                    list.add(array13[i]);}
                System.out.print(array13[i]+" ");
            }
            System.out.println();
            if(!list.isEmpty()) {
                int[]array14=new int[countEvenNum];
               for(int i = 0; i<countEvenNum; i++){
                   array14[i]= list.get(i);
                   System.out.print(array14[i]+" ");
               }
            }
        }
        catch(IOException e){
            e.getMessage();
        }*/

        //*******
        //Дополнительные задачи (одномерные массивы)

        //1
        /*int [] array15 = new int[10];
        List<Integer> list2 = new ArrayList();
        for(int i = 1; i< array15.length; i++) {
            array15[i]=i;
            if (array15[i] % 3 == 0) {
                list2.add(array15[i]);
            }
        }
        System.out.println(list2);
        int multRes=1;
        for(int i = 0;i<list2.size(); i++){
            multRes*= list2.get(i);
        }
        System.out.println(multRes);*/

        //2
        /*int [] array16 = new int[10];
        int oddNumCount=0;
        List<Integer> list3 = new ArrayList<>();
        for(int i = 0; i< array16.length; i++){
            array16[i]=i;
            if(i%2!=0){oddNumCount++;
            list3.add(array16[i]);
            }
        }
        int sum=0;
        for(int i = 0; i<list3.size(); i++){
            sum+= list3.get(i);
        }
        System.out.println(list3);
        System.out.println(sum/oddNumCount);*/

        //3
        /*int c = (int)(Math.random()*11);
        System.out.println(c);
        int numOverC=0;
        int[]array17 = new int[20];
        List<Integer> list3 = new ArrayList<>();
        for(int i = 0; i< array17.length; i++){
            array17[i]=(int)(Math.random()*21);
            if(array17[i]>c){
                list3.add(array17[i]);
                numOverC++;
            }
            System.out.print(array17[i]+" ");
        }
        System.out.println();
        int numOverCSum = 0;
        for(int i = 0; i<list3.size(); i++){
            numOverCSum+= list3.get(i);
        }

        System.out.println(list3);
        System.out.println(numOverCSum/numOverC);*/

        //4
        /*int [] arr1 = {-1,3,58,47,98,55,-37,-125,87,333};
        int min=arr1[0];
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i]%2!=0 && arr1[i]<min){
                min=arr1[i];
            }
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println(min);*/

        //5
        /*int[]arr2=new int[15];
        for(int i = 0; i< arr2.length; i++){
            arr2[i]= (int)(Math.random()*41);
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for(int i = 0; i< arr2.length; i++){
            if(i%2!=0){
            arr2[i]=0;}
            System.out.print(arr2[i]+" ");
        }*/

        //6
        /*int [] arr3 = {1,1,1,1,1};
        int countEqual=0;
        int sampleNum=arr3[0];
        for(int i = 0; i< arr3.length; i++){

            if(arr3[i]!=sampleNum) {
                System.out.println("Array elements aren't equal");
                break;}
            else countEqual++;
            if(countEqual== arr3.length) System.out.println("Array elements are equal");
        }*/

        //7
        /*try(BufferedReader numReader = new BufferedReader(new InputStreamReader(System.in));){
            int value = Integer.parseInt(numReader.readLine());
            int valueCount=0;
            int [] arr4 = new int[100];
            for(int i = 0; i<arr4.length; i++){
                arr4[i]=(int)(Math.random()*51);
                if(arr4[i]==value) valueCount++;
                System.out.print(arr4[i]+" ");
            }
            System.out.println();
            if(valueCount!=0) System.out.println("Number "+value+" repeats "+ valueCount+" times in arr4");
            else System.out.println("Arr4 does not include "+value);
        }
        catch(IOException e){
            e.getMessage();
        }*/

        //8 -->??
        /*int [] arr5 = new int[20];
        for(int i = 0; i< arr5.length; i++){
            arr5[i] = (int)(Math.random()*21);
        }
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));*/

        //9
        /*int[] arr6 = {23,45,-67,-9,0,8276,-3,23,78,-44};
        int min=arr6[0];
        for(int i = 0; i<arr6.length; i++){
            if(i%2==0 && arr6[i]<min) min = arr6[i];
            System.out.print(arr6[i]+" ");
        }
        System.out.println();
        System.out.println(min);*/

        //10
        /*int[]arr7={54,88,-77,212,-959,587,325,67,67};
        int maxElement = arr7[0];
        for(int i = 0; i< arr7.length; i++){
            if(arr7[i]>maxElement) maxElement=arr7[i];
            System.out.print(arr7[i]+" ");
        }
        System.out.println();
        System.out.println(maxElement);
        arr7[0]=maxElement;*/

        //******
        //Многомерные массивы
        //1
        /*try(BufferedReader readNumForArray = new BufferedReader(new InputStreamReader(System.in));){
          int arraySize = Integer.parseInt(readNumForArray.readLine());
          int[][]doubleArr1 = new int[arraySize][arraySize];
          for(int i = 0; i< doubleArr1.length; i++){
              for(int j = 0; j<doubleArr1[i].length; j++){
                  doubleArr1[i][j]=(int)(Math.random()*51);
                  System.out.printf("%d ",doubleArr1[i][j]);
              }
              System.out.println();
          }
          int sum=0;
          for(int i = 0; i<doubleArr1.length; i++){
              for(int j = 0; j < doubleArr1[i].length; j++){
                 if(i==j && doubleArr1[i][j]%2==0){
                 sum+=doubleArr1[i][j];
                 System.out.print(doubleArr1[i][j]+" ");
                 }
              }
          }
            System.out.println();
            System.out.println(sum);
        }
        catch (IOException e){
            e.getMessage();
        }*/

        //2
        /*try(BufferedReader readNumForArray = new BufferedReader(new InputStreamReader(System.in));){
            int arraySize = Integer.parseInt(readNumForArray.readLine());
            int[][]doubleArr1 = new int[arraySize][arraySize];
            for(int i = 0; i< doubleArr1.length; i++){
                for(int j = 0; j<doubleArr1[i].length; j++){
                    doubleArr1[i][j]=(int)(Math.random()*51);
                    System.out.printf("%d ",doubleArr1[i][j]);
                }
                System.out.println();
            }
            for(int i = 0; i<doubleArr1.length; i++){
                for(int j = 0; j < doubleArr1[i].length; j++){
                    if(j<=i && doubleArr1[i][j]%2!=0){
                        System.out.print(doubleArr1[i][j]+" ");
                    }
                }
            }
        }
        catch (IOException e){
            e.getMessage();
        }*/

        //3
        /*try(BufferedReader readNumForArray = new BufferedReader(new InputStreamReader(System.in));) {
            int arraySize = Integer.parseInt(readNumForArray.readLine());
            int[][] doubleArr1 = new int[arraySize][arraySize];
            for (int i = 0; i < doubleArr1.length; i++) {
                for (int j = 0; j < doubleArr1[i].length; j++) {
                    doubleArr1[i][j] = (int) (Math.random() * 51);
                    System.out.printf("%d ", doubleArr1[i][j]);
                }
                System.out.println();
            }
            int[] mainDiagonal = new int[arraySize];
            int[] secondaryDiagonal = new int[arraySize];

            for (int i = 0; i < doubleArr1.length; i++) {
                for (int j = 0; j < doubleArr1[i].length; j++) {
                    if (i == j) {
                        mainDiagonal[i] = doubleArr1[i][j];
                        System.out.print(mainDiagonal[i] + " ");
                    }
                }
            }
            System.out.println();
            for (int i = 0; i < doubleArr1.length; i++) {
                for (int j = 0; j < doubleArr1[i].length; j++) {
                     secondaryDiagonal[i] = doubleArr1[i][doubleArr1.length-1-i];
                }
                System.out.print(secondaryDiagonal[i] + " ");
            }
            System.out.println();
            int mainDmultiply=1;
            for(int i = 0; i< mainDiagonal.length; i++){
                mainDmultiply*=mainDiagonal[i];
            }
            System.out.println(mainDmultiply);
            int secondaryDmultiply=1;
            for(int i = 0; i< secondaryDiagonal.length; i++){
                secondaryDmultiply*=secondaryDiagonal[i];
            }
            System.out.println(secondaryDmultiply);
            if(mainDmultiply>secondaryDmultiply) System.out.println("Main diagonal elements product is bigger");
            else System.out.println("Secondary diagonal elements product is bigger");
        }
        catch (IOException e){
            e.getMessage();
        }*/

        //4 -->??
        /*try (BufferedReader readNumForArray = new BufferedReader(new InputStreamReader(System.in));) {
            int arraySize = Integer.parseInt(readNumForArray.readLine());
            int[][] doubleArr1 = new int[arraySize][arraySize];
            for (int i = 0; i < doubleArr1.length; i++) {
                for (int j = 0; j < doubleArr1[i].length; j++) {
                    doubleArr1[i][j] = (int) (Math.random() * 51);
                    System.out.printf("%d ", doubleArr1[i][j]);
                }
                System.out.println();
            }
            for (int i = 0; i < doubleArr1.length; i++) {
                for (int j = 0; j < doubleArr1[i].length; j++) {}

            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //5
        /*try (BufferedReader readNumForArray = new BufferedReader(new InputStreamReader(System.in));) {
            int arraySize = Integer.parseInt(readNumForArray.readLine());
            int[][] doubleArr1 = new int[arraySize][arraySize];
            for (int i = 0; i < doubleArr1.length; i++) {
                for (int j = 0; j < doubleArr1[i].length; j++) {
                    doubleArr1[i][j] = (int) (Math.random() * 51);
                    System.out.printf("%d ", doubleArr1[i][j]);
                }
                System.out.println();
            }
            int [][]  transposeArray = new int[arraySize][arraySize];
            for (int i = 0; i < doubleArr1.length; i++) {
                for (int j = 0; j < doubleArr1[i].length; j++) {
                    transposeArray[i][j] = doubleArr1[j][i];
                    System.out.print(transposeArray[i][j]+" ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}