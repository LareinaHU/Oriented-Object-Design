public class Bird extends Animals{
    String name;

    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    void move() {
        System.out.println("Bird is moving!");
    }

//    public void fly(){
//        System.out.println("flying! ");
//    }
}
