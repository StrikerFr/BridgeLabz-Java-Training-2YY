package Homework.Homework_04;

class EmployeeNode {
    int id;
    String name;
    String department;
    double salary;
    EmployeeNode next;

    public EmployeeNode(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.next = null;
    }
}

public class EmployeeManagement {
    static EmployeeNode head = null;

    public static void insertAtBeginning(int id, String name, String department, double salary) {
        EmployeeNode newNode = new EmployeeNode(id, name, department, salary);
        newNode.next = head;
        head = newNode;
    }

    public static void insertAtEnd(int id, String name, String department, double salary) {
        EmployeeNode newNode = new EmployeeNode(id, name, department, salary);
        if (head == null) {
            head = newNode;
            return;
        }
        EmployeeNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void insertAtPosition(int id, String name, String department, double salary, int pos) {
        if (pos <= 1 || head == null) {
            insertAtBeginning(id, name, department, salary);
            return;
        }
        EmployeeNode newNode = new EmployeeNode(id, name, department, salary);
        EmployeeNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void deleteById(int id) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.id == id) {
            head = head.next;
            System.out.println("Employee deleted with ID: " + id);
            return;
        }
        EmployeeNode temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Employee not found with ID: " + id);
        } else {
            temp.next = temp.next.next;
            System.out.println("Employee deleted with ID: " + id);
        }
    }

    public static void searchById(int id) {
        EmployeeNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Found: ID=" + temp.id + ", Name=" + temp.name + ", Dept=" + temp.department + ", Salary=" + temp.salary);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee not found with ID: " + id);
    }

    public static void searchByName(String name) {
        EmployeeNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found: ID=" + temp.id + ", Name=" + temp.name + ", Dept=" + temp.department + ", Salary=" + temp.salary);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee not found with Name: " + name);
    }

    public static void displayRecords() {
        if (head == null) {
            System.out.println("No records to display");
            return;
        }
        EmployeeNode temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Department: " + temp.department + ", Salary: " + temp.salary);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        insertAtEnd(101, "Alice", "HR", 50000);
        insertAtEnd(102, "Bob", "IT", 60000);
        insertAtBeginning(100, "Charlie", "Finance", 55000);
        insertAtPosition(103, "David", "Marketing", 52000, 3);

        System.out.println("All Employee Records:");
        displayRecords();

        System.out.println("\nSearch by ID 102:");
        searchById(102);

        System.out.println("\nSearch by Name David:");
        searchByName("David");

        System.out.println("\nDelete Employee with ID 101:");
        deleteById(101);

        System.out.println("\nAll Employee Records After Deletion:");
        displayRecords();
    }
}
