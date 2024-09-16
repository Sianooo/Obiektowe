enum Animal {
    CAT(5),
    DOG("Burek", 7);


private String name="x";
private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}