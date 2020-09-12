package com.company;


public class Main {

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        int[] odd = new int[5];
        int[] even = new int[5];
        int i=0;
        int j =0;

        for(int a: number){
            if(a %2 == 0){
                even[i]=a;
                i++;
            }else{
                odd[j]=a;
                j++;
            }
        }
        for(int x : even){
            System.out.println(x);
        }System.out.println(" ");
        for(int y :odd){
            System.out.println(y);
        }
    }
}
