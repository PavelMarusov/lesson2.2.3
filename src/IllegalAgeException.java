public class IllegalAgeException extends   RuntimeException {
    int age;

    public IllegalAgeException(String message, int age) {
        super(message);
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
