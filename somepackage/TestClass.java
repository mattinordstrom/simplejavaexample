package somepackage;

public class TestClass
{
    private String message = "Test hello";

    public void printSomeOtherMessage ()
    {
       System.out.println(message); 
    }

    public static void printYetAnotherMessage ()
    {
        String anotherMessage = "Another Test hello";
        System.out.println("Yay! " + anotherMessage); 
    }
}