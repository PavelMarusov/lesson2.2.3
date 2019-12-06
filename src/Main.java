public class Main {

    public static void main(String[] args) {
        User user = new User();
        for (int g = 0; ; g++) {
            user.setAge();
            try {
                user.setName();
            } catch (IllegalNameLengthException e) {
                e.printStackTrace();
            }

        }



    }
}