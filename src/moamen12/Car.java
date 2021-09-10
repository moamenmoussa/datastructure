/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moamen12;

/**
 *
 * @author Mo'men Hacker
 */


public abstract class Car {
        public abstract void getFuel ();
        static int createdObjects = 0;
        public int getCreatedObjects ()
        {
            return createdObjects;
        }
        public Car (){
            createdObjects++;
        }
}

 class BMW extends Car {

     public void getFuel ()
     {
         System.out.println("get fuel from BMW");
     };
}

class Ford extends Car {
    public void getFuel ()
    {
        System.out.println("get fuel from ford");
    };
}

class Chevrolet extends Car {
    public void getFuel ()
    {
        System.out.println("get fuel from Chevrolet");
    };
}

