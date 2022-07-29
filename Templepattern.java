package com.company;

public class Templepattern {

    public static void main(String args[]){
        int i=1,j=1;
        for( i=1;i<=14;i++){
            for(j=1;j<=14;j++){
                if(i==1 || i==14  || j==1 || (i==2 && j!=7) || (i==3 && j!=6 && j!=7 && j!=8 ) || (i==4 && j!=5 && j!=6 && j!=7 && j!=8 && j!=9 )   || j==14)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
