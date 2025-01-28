package com.example;

import java.lang.Math;
/**
* this is a defaut Class constructor
*/

public class Greeter {

        public String nom = "Alice";
        public int age = 30;
 
  /**
  * this in contructor
  */
 
  public Greeter() {
   // contructeur par défaut
  }

 public void doSomeThing() {
   // do no thing yet !
  System.out.print("Bonjour, je suis moi");
  }

   public void doSomeThing2() {
   // do no thing yet !
      System.out.print("Bonjour, je suis moi");
  }
    public void doSomeThing3() {
   // do no thing yet !
       System.out.print("Bonjour, je suis moi");
  }
 /**
 * @param someone name of a person
 * @return greeting string
 */
  public final String greet(final String someone) {
   return String.format("Hello World again, %s!", someone);
   
 }
}
