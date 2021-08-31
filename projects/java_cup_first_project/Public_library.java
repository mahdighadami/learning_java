import java.util.Scanner;
public class Public_library {
    public static void main(String[] args) {

        System.out.print("How many member are in your library?: ");
        Scanner scanner = new Scanner(System.in);
        int array_length = scanner.nextInt();

        String[] names = new String[array_length];
        short[] ages = new short[array_length];
        char[] sexes = new char[array_length];
        long[] members_id = new long[array_length];
        boolean[] bool_array = new boolean[array_length];
        int counter = 0;

        outer:  while (true){
            System.out.println("\t\t\tMENU");
            System.out.println("1.Add member\n2.Show member details\n3.Update member details\n4.Remove member");
            System.out.println("5.Exit");
            System.out.print("Enter selected number: ");
            short selection = scanner.nextShort();
            switch (selection){
                case 1:
                    System.out.println(create(counter, names, ages, sexes, members_id, bool_array));
                    counter += 1;
                    break;
                case 2:
                    System.out.print("Enter member ID: ");
                    long id_for_read = scanner.nextLong();
                    read(id_for_read, names, ages, sexes, bool_array);
                    break;
                case 3:
                    System.out.print("Enter member ID: ");
                    long id_for_update = scanner.nextLong();
                    update(id_for_update, names, ages, sexes, bool_array);
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    break outer;
                default:
                    System.out.println("Enter valid number!");

            }
        }
    }

    private static long create(int i, String[]names, short[]ages, char[]sexes, long[]members_id, boolean[]bool_array) {

        System.out.println("\t\tAdd new member");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        names[i] = name;

        System.out.print("Enter member age: ");
        short age = scanner.nextShort();
        ages[i] = age;

        System.out.print("Enter member sex(f or m): ");
        char sex = scanner.next().charAt(0);
        sexes[i] = sex;

        members_id[i] = i + 1;

        bool_array[i] = true;

        System.out.print("New member ID is: ");
        return members_id[i];

    }

    private static void read(long id, String[]names, short[]ages, char[]sexes, boolean[]bool_array) {

        System.out.println("\t\tShow member info");
        if (id < bool_array.length && bool_array[Math.toIntExact(id) - 1]) {
            System.out.println("ID: " + id);
            System.out.println("member name is: " + names[Math.toIntExact(id) - 1]);
            System.out.println("member age is: " + ages[Math.toIntExact(id) - 1]);
            System.out.println("member sex is: " + sexes[Math.toIntExact(id) - 1]);
        }else{
            System.out.println("This member is not exist!");
        }
    }

    private static void update(long id, String[]names, short[]ages, char[]sexes, boolean[]bool_array) {

        System.out.println("\t\tEdit member info");
        Scanner scanner = new Scanner(System.in);

        if (id < bool_array.length && bool_array[Math.toIntExact(id) - 1]) {

            System.out.println("ID: " + id);
            System.out.println("member name is: " + names[Math.toIntExact(id) - 1]);
            System.out.print("new member name: ");
            String name = scanner.nextLine();
            names[Math.toIntExact(id) - 1] = name;

            System.out.println("member age is: " + ages[Math.toIntExact(id) - 1]);
            System.out.print("new member age: ");
            short age = scanner.nextShort();
            ages[Math.toIntExact(id) - 1] = age;

            System.out.println("member sex is: " + sexes[Math.toIntExact(id) - 1]);
            System.out.print("new member sex(f or m): ");
            char sex = scanner.next().charAt(0);
            sexes[Math.toIntExact(id) - 1] = sex;

        }else{
            System.out.println("This member is not exist!");
        }
    }

    private static void delete() {
    }
}
