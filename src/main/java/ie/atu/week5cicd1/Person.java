package ie.atu.week5cicd1;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Size(min = 1, max = 100, message = "Value must be between 1 and 100")
    private String name;
    @Size(min = 1, max = 100, message = "Value must be between 1 and 100")
    private String title;
    @PositiveOrZero(message = "Value must be positive or zero")
    private int employeeId;
    @Min(value = 18, message = "Value must be greater than 18")
    private int age;
    @Email(message = "Value must be an email")
    private String email;
    @Size(min = 1, max = 100, message = "Value must be between 1 and 100")
    private String position;
    @Size(min = 1, max = 100, message = "Value must be between 1 and 100")
    private String department;
}
