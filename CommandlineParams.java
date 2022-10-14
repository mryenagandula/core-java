public class CommandlineParams {
    public CommandlineParams() {
        System.out.println("CommandlineParams.CommandlineParams()");
    }

    public static void main(String[] args) {
        if (args.length > 0 && args.length == 3) {
            int id = Integer.parseInt(args[0]);
            String name = String.valueOf(args[1]);
            double fee = Double.parseDouble(args[2]);
            System.out.println("Student Details: ");
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            System.out.println("Student Fee: " + fee);
        } else {
            System.out.println("Please give 3 arguments");
        }
    }
}
