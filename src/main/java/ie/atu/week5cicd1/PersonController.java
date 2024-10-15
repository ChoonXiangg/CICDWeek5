package ie.atu.week5cicd1;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    List<Person> personList = new ArrayList<>();

    @PostMapping
    public List<Person> addPerson(@Valid @RequestBody Person person){
        personList.add(person);
        return personList;
    }
}
