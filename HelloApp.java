public class HelloApp {
    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {
            StringBuilder names = new StringBuilder();

            for (String n : args) {
                names.append(n).append(", ");
            }

            // remove last ", "
            if (names.length() > 0) {
                name = names.substring(0, names.length() - 2);
            }
        }

        System.out.println("Hello, " + name + "!");
    }
}