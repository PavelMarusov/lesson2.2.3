import java.util.Scanner;

public class User {

    public String name;
    public int age;


    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName() throws IllegalNameLengthException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.length() > 20) {
            throw new IllegalNameLengthException("Имя слишком длинное", name);

        }
        this.name=name;

    }
    public void setAge() throws IllegalAgeException{
        Scanner scanner = new Scanner(System.in);
        int age=scanner.nextInt();
        if (age<1||age>100){
            throw new IllegalAgeException("Слишком большой возраст",age);}
        this.age=age;
    }

}
