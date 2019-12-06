public class IllegalNameLengthException extends Exception  {
    String name;



    public IllegalNameLengthException(String message, String name) {
        super(message);
        this.name = name;
    }
    public String getName() {
        return name;
    }
}




