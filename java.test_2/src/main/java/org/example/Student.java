

package org.example;

public class Student {
    String name;
       int marksobtained;
    static String collegename="LPU";
    static final int Max_Marks=100;

    public  Student(String name,int marksobtained) {
        this.name=name;
        this.marksobtained=marksobtained;
    }

    public void printpercentage(){
        double Percentage=((double)marksobtained/Max_Marks) * 100;
        System.out.println("Name:"+name+
                           "\nCollege:"+collegename +
                           "\nMarks Obtained:"+marksobtained+
                           "\nPercentage: " +String.format("%.2f",Percentage)+"%");
    }
}

