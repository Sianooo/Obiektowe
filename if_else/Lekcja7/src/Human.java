public class Human {

    int age;
    String gender;
    String name;

    public Human(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
    public boolean emeryt()
    {
        if("Men".equals(gender))
        {
            return (age >=67);
        }
        else if ("Women".equals(gender))
        {
            return (age >=65);
        }
        System.out.println("Theres no gender like that");
        return false;
    }

    public void daneOsobowe()
    {
        System.out.println(" Name  "+name+ " Jest emerytem: "+this.emeryt());
    }

}
