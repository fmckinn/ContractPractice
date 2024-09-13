public class Student
{
    private String name;
    private int age;
    private String email;

    /**
     * Parameterized constructor for students. Takes in 3 parameters.
     * 
     * @param name The name of the student, a string
     * @param age The age of the student, an int
     * @param email The email of the student, as a string, and contains the @ sign
     * 
     * @pre name != null AND name != "" AND 0 < age < 100 AND [email contains '@']
     * AND email != null
     * 
     * @post this.name = name & this.age = age AND this.email = email
     */

    public Student(String name, int age, String email)
    {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    /**
     * standard getter for name.
     * @return name, as a string
     * 
     * @pre none
     * 
     * @post getName = name AND name = #name AND age = #age AND email = #email
     */

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getEmail()
    {
        return email;
    }

    public void setName(String aName)
    {
        this.name = aName;
    }

    public void setAge(int anAge)
    {
        this.age = anAge;
    }

    public void setEmail(String anEmail)
    {
        this.email = anEmail;
    }


    /**
     * Prints student information where is variable is printed to its own line.
     * @param aStudent The student to print the information of
     * @pre aStudent != null
     * @post [prints the student information by calling the getters for aStudent's instance variables.
     * Prints each to their own line using println.]
     */

    public static void printStudentInformation(Student aStudent)
    {
        System.out.println("Name: " + aStudent.getName());
        System.out.println("Age: " + aStudent.getAge());
        System.out.println("Email: " + aStudent.getEmail());
    }

    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if(obj instanceof Student other)
            return this.name.equals(other.name) && this.age == other.age && this.email.equals(other.email);
        else
            return false;
    }


}
