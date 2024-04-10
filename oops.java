class student{
    String name;
    int age;

    void setName(String n){
        name=n;
    }

    String getName(){
        return name;
    }
}

public class oops {

    public static void main(String[] args) {
        student aadith = new student();
        aadith.setName("Aadith Joseph");
        System.out.println(aadith.name);
    }
    

}
