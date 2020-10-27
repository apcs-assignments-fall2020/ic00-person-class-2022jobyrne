public class Person 
{

    public String firstName;
    public String lastName;
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void doSomething() 
    {
        System.out.println("I am watching netflix");
    }        
    public String toString()
    {
        return (firstName + " " + lastName);
    }
}













