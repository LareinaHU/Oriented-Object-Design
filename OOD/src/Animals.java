public abstract class Animals {
    String name;
    int age;
    String gender;

    public Animals(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    abstract void move();
}

