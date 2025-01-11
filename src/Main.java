import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Samandar", "Babakhanov", "Manager", 344565.00);
        Employee employee2 = new Employee("Adil", "Yerlik", "Developer", 66454.00);
        student student1 = new student("Sardar", "Khassanov", 3.32);
        student student2 = new student("Umar", "Usmanov", 3.12);

        List<Person> people = new ArrayList<>();
        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person person : persons) {
            System.out.println(person + " earns " + String.format("%.2f", person.getPaymentAmount()) + " tenge");
        }
    }
}