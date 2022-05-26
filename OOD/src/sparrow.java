
public class sparrow extends Bird implements flyable{

    public sparrow(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    void move() {
        System.out.println("Sparrow is flapping its wings!!");
    }


    @Override
    public void fly() {
        System.out.println("fly away!");
    }
}


//Interface is a contract!