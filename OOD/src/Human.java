public class Human {
    String name;
    String gender;
    int age;
    public Human(){

    }

    public void speak(String name){
        this.name = name;
        System.out.println("Today is a sunny day! " + name);
    }
}
