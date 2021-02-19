// import goes here
// this program is designed to be a refference on how to code.
// when you need to download things they go here

/*Public and private are key words. 
public is for script that is or can be consumed by the public while private does not. 
you can have one public class in a whole program but multiple private classes.
*/

public class MyProgramingnotesA009
                     // Alpha 0.0.9



/*line 8 is the class header and acts as a box for this application.
The *class* discribes the box
like a variable but better? 

the brace below me should always be under *private class "MyProgramingnotes"**/
   {

   public static void main(String[] args)
   /* line 17 is a method header and articulates the method beinging used 
   Static - a way to save memory as well as not need to declaring or instantiationg the class
   Void - this statement means that the main methiod terminates at its end. in that sense nothing is returned the application.
   main - this is the name of the main method in its braces are the method you want to use
   */
   
   //by this point you should have at least one level of indentation
      {
   // this next line should also have an indent.
//   System.out.println("Hello, World");
      // this is a statement - you end it an ";"
      // every statement ends with ";"   
// System.out.print("Programing is fun");
      /* *System.out.print* does not equal System.out.println
         println is a print funtion with an <ENTER> button press at its completion
         if two *System.out.print* are next to eachother their output will be on the same line
         if *System.out.print* comes before *System.out.println* they will output to the same line
      
      */
      /*
            // there are some cool short cuts to *System.out.print("hi")
               // \n - new line - puts a break at \n
                  System.out.println("\ncoding \nis \ncool");
               // \t - new horisontal - adds a tab block to the text
                  System.out.println("\\there are some cool little \t addons that make coding less difficult\\");
               // \b - "shruggs"
                  System.out.println("\b Shruggs");
               // \r - "shruggs"
                  System.out.println("\r Shruggs");
               
               
               // \\ - backslash - prints a backslash
                  System.out.println("\\Shruggs\\");
               
               // \' - single quote - prints a single qoute
                  System.out.println("\'Shruggs\'");
               
               // - double quote - prints a double qoute
                  System.out.println("\"Hello world\"");
        */       
            /* there are some useful things here
               \\ puts one \in the text
               \' puts ' in the text
               \" puts an " in the text   
            */
            /*
            // section - 2.3 and 2.4- variables, literals, and primitive data types
               System.out.println("variables have a multitude of uses. Of which there are several");
               System.out.println("you can declare a variable by typing Variable.Type_VariableName");
               System.out.println("And you can define its value by typing Variable.Name = Some.Value \nor \n by declaring it at the same time by saying"
                                   + "Variable.Type_VariableName = Some.Value");
                  
                  // there are 8 variable types in java
                     // the variable, boolean, is a variable which only has true or false setting.
                        boolean boolTrue = true;
                        boolean boolFalse = false;
                        System.out.println(" A boolean can only store one bit of data. True or false. If true it will print " + boolTrue + " and if false it will print " + boolFalse);
                    
                     // the variables, byte - long, are integers which means that they can't = the value of a rational number who isn't already a integer
                        byte Byte1 = -128;
                        byte Byte2 = 127;
                        System.out.println("A byte is a variable that is a integer in the range of[" + Byte1 + "," + Byte2 + "]");
                        
                        short Short = 32767;
                        System.out.println("A short is a variable whose value is an integer whose magnitude less than" + Short);
                        
                        int integer = 2000000000;
                        System.out.println("A int is a variable whose value is an integer with a magnitude less than" + integer);
                        
                        long Long = 90000000;
                        System.out.println("A long is a variable whose value is an integer with a magnitude less than 9*10^21" + Long);
                           
                        // Notes :
                           // you can not put "," in number variables
                           // "3" or '3' will give you an error message
                           // "3" is considered a string
                        
                     // the variables, float and double, are real(technically rational) numbers which means that can cover almost all numbers on the numberline \\
               
                        float Float = 340000000;
                        System.out.println("A float is a variable whose value is a real number with a magnitude less than 3.4*10^38");
                        
                        double Double = 1.7000000000000000000000000000000000000000000;
                        System.out.println("A double is a variable whose value is an integer with a magnitude less than 1.7*10^308");
                        // Notes :
                           // you can not put "," in number variables
                           // "3" or '3' will give you an error message
                           // "3" is considered a string
                     
                     // the variablles, char, is a variables that is  composed of letters. char is one single letter and String is a "string" of letters,
                                   
                        char Char = 'a';
                        System.out.println("A Char is a variable whose value is a single letter");
                        
                        String myNameIsString = "Hello my name is String";
                        System.out.println("A String is a variable whose value is any combination of letters like such " + myNameIsString);
               
                            // String variables can accept numbers if they are coded as "3" but not as 3
                            // 3 will give you an error message            
            */
            
            /*
            // section - 2.5 - 
               System.out.println("unary, binary, and ternary are three types of opperators that are accepted by the common nomenclature.");
               //urnary   
                  System.out.println("\t unary are single opperators like addition '+' and they are ");
                  
                        // Addition - there are several fuctions that '+' holds
                           System.out.print("\t\t addition allows you to find or output the sum of two variables or values");
                           System.out.print("\n\t\t for instance if you would like to find the sum of two variables whose values are both numbers \n you can write"
                                            + "System.out.print( number.Variable.1 + number.Variable.2) and the output will be known      "
                                            + ""
                                            + "");
                                 // rember that specific data types have numarical bounds and if you exceed them in any way in either magnitude error will occur            
                                            
                           System.out.print(" ");
                           
                           double sum;
                           double addend1 = 4;
                           int addend2 = 3;
                           
                              System.out.print("");
                              
                              //
                              //
                           
                           String word1;
                           String word2;
                           
                              System.out.print(" ");
                              System.out.print(" ");
                              
                              //
                              sum = Math.pow(addend1,4.0);
                              System.out.print(sum);
                      
                   */   
                      /*                          
                        // multiplication
                           
                           System.out.print("\t\t addition allows you to find or output the sum of two variables or values");
                           System.out.print("\t\t ");
                           System.out.print(" ");
                        
                        // division
                           
                           System.out.print("\t\t addition allows you to find or output the sum of two variables or values");
                           System.out.print("\t\t ");
                           System.out.print(" ");
                        
                        // modulus
                           
                           System.out.print("\t\t addition allows you to find or output the sum of two variables or values");
                           System.out.print("\t\t ");
                           System.out.print(" ");
                        */
                        
                        /*
                        // interations with variables
                           
                           System.out.print(" there are some interesting or advantagous interactions that can be had with some of our operators");
             
                              // addition
                              System.out.print(" we can use the + operator to combine sentences or string literals like this" 
                                               +"");

                           */
               /*
                        // order of operations 
                           
                           System.out.print("\t\t addition allows you to find or output the sum of two variables or values");
                           System.out.print("\t\t ");
                           System.out.print(" ");
               
               
               // binary
                  System.out.println("\t");
               //ternary
                  System.out.println("\t");
                  System.out.println("\t");
               

            */
            
            
            // section - 2.7 - 
            // section - 2.8 -
            
            
            
            
             
            // section - 2.9 - The String Class    
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            // section - 2.10 - 
            // section - 2.11 - 
            // section - 2.12 - 
            // section - 2.14-0.1 - 
            // section - 2.14 - 
            // section - 2.15 - 
                       

      // Unit 2 Class coolness
         // section - 1 - The *String* Class  
       
         // section - 2 - The *Math* Class
         // section - 3 - The *Robot* Class











    
      }
      /*
   public static void main(String[] args)
      {
      System.out.println("hello, World");
      }
      */
      
      
}   