package aduhay;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class dcmko {
	public static void main(String[] args) {
		 ArrayList<String> names = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("1. Input a name");
	            System.out.println("2. Sort the list");
	            System.out.println("3. Find if a name exists in the list");
	            System.out.println("4. Find how many students with a given name exists");
	            System.out.println("5. Print names");
	            System.out.println("6. Exit");
	            System.out.print("==> ");
	            int choice = Integer.parseInt(scanner.nextLine());
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter name: ");
	                    String name = scanner.nextLine();
	                    names.add(name);
	                    System.out.println("Name added successfully");
	                    break;
	                case 2:
	                    names.sort(Comparator.naturalOrder());
	                    System.out.println("Names sorted successfully");
	                    break;
	                case 3:
	                    System.out.print("Enter name: ");
	                    String nameToSearch = scanner.nextLine();
	                    if (names.contains(nameToSearch)) {
	                        System.out.println("Name exists");
	                    } else {
	                        System.out.println("Name doesn't exist");
	                    }

	                    break;
	                case 4:
	                    int count = 0;
	                    System.out.print("Enter name to search the count for: ");
	                    String nameToSearch2 = scanner.nextLine();
	                    for (String n: names) {
	                        if (n.equals(nameToSearch2)) {
	                            count++;
	                        }
	                    }
	                    System.out.println(nameToSearch2 + " found " + count + " times.");

	                    break;
	                case 5:
	                    for (String n: names) {
	                        System.out.print(n + ". ");
	                    }
	                    System.out.println();

	                    break;
	                case 6:
	                    System.out.println("Bye!");
	                    System.exit(0); 
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }

	}

}
