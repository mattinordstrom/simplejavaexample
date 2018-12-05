package somepackage;

import somepackage.somesubpackage.TestClass;

/* This is a simple Java program. 
   FileName : "HelloWorld.java". */
class HelloWorld 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) 
    { 
        System.out.println("Hello, World"); 
        
        if(args.length > 0) {
            System.out.println(args[0]);
        }

        TestClass test = new TestClass();
        test.printSomeOtherMessage();

        TestClass.printYetAnotherMessage();
    } 
}