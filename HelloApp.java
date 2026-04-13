public class HelloApp {
    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {
            StringBuilder names = new StringBuilder();
            boolean first = true;

            for (String n : args) {
                if (!first) {
                    names.append(", ");
                }
                names.append(n);
                first = false;
            }

            name = names.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}