package com.company;



public class Main {

    public static void main(String[] args)  {

        StringBuffer sb = new StringBuffer("Johny");
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity()); //SB class has capacity of +16 chars to the String passed

        sb.append("Ford");
        System.out.println(sb);


        sb.insert(5,"Word");//<offset of 2 starts at index#2 for example
        System.out.println(sb);

        //sb.reverse();
        //System.out.println(sb);

       /* sb.delete(0,5);  //starts at 0 ends at 5
        System.out.println(sb);
        */
        sb.deleteCharAt(3);
        System.out.println(sb);
    }

}
