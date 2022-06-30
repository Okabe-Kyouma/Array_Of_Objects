package com.Sharad;

import java.util.ArrayList;

public class HeightOfStudents {

    private int height;

    private int num;

    private int AverageHeight;

    public int sum = 0;

    public HeightOfStudents(int height){
         this.height = height;
    }

    public HeightOfStudents(){}

    public double getHeight() {

        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSum(ArrayList<HeightOfStudents> arr){

        for(HeightOfStudents value : arr){
            sum += value.height;
        }

        return sum/num;

    }

}


