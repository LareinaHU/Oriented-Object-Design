public class chicken extends Bird implements flyable{
    public chicken(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void fly() {
        System.out.println("not able to fly!");
    }
}
