package coreconcept;

public class PrintStatements {

    static void main() throws Exception{

        String name = "Parth";

        System.out.println("println => Name: " + name); // print in new line

        System.out.printf("printf => Name: %s", name); // print with format

        System.out.print("Hello " + name); // print in same line

        System.out.write(("Never mind " + name).getBytes()); // same as print

        /**
         * What is System.out?
         * It’s a PrintStream object used to print output to console
         *
         * Why use printf?
         * For formatted output (clean logs, reports)
         */
    }
}
