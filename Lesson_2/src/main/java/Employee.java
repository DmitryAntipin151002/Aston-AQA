import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String fullName;
    private String post;
    private int age;
    private String email;
    private double salary;
    private String phoneNumber;

    public void printInfo() {
        System.out.println("Full name: " + fullName + "\nPost: " + post + "\nAge: " + age + "\nemail: " + email +
                "\nSalary: $" + salary + "\nPhone number: " + phoneNumber);
    }
}
