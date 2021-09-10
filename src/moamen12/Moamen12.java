/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moamen12;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Mo'men Hacker
 */
public class Moamen12 {

    public static void main(String[] args) {
        
        Circle s = new Circle(20);
        System.out.print(s.getArea());
         
        
        Scanner input = new Scanner(System.in);
        int arr [] = {5,6,9,4,3,10,8,25,13,12};
        Arrays.sort(arr);
        for(int i=0 ; i< arr.length ; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        String line = "";
        List<Person> list = new ArrayList<>();
        while (true){
             line = input.nextLine();
             if(line.equals("0"))break;
             String [] strs = line.split(",");
             Person p = new Person(strs[0],Integer.parseInt(strs[1]));
             list.add(p);
        }

        for(Person p : list){
            System.out.print(p.getName() + " ");
            System.out.println(p.getAge());
        }

    }

}
