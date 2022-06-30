package com.Sharad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        ArrayList<HeightOfStudents> arr = new ArrayList<>();


        HeightOfStudents hn = new HeightOfStudents();

        System.out.println("Enter number of students!");

        hn.setNum(input.nextInt());
          int sum = 0;
        for(int a =0;a< hn.getNum();a++){
            System.out.println("Enter height of Student number "+ (a+1));
              arr.add(new HeightOfStudents(input.nextInt()));
        }

        System.out.println("Average height of "+hn.getNum() + " Students is: "+hn.getSum(arr)+" cm");





    }

}