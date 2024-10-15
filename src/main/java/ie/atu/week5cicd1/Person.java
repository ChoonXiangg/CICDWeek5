package ie.atu.week5cicd1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private String title;
    private int employeeId;
    private int age;
    private String email;
    private String position;
    private String department;
}
