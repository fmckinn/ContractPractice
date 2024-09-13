public class Student
{
    private String name;
    private int age;
    private String email;

    public Student(String name, int age, String email)
    {
        this.name = name;
        this.age = age;
        this.email = email;
    }

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
