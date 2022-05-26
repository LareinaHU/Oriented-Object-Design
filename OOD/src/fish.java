public class fish extends Animals {

    public fish(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    void move() {
        System.out.println("Fish is swimming!");
    }
}
