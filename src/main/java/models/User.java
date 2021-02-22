package models;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import utils.Config;

@Getter
@AllArgsConstructor
public class User {
    public String name;
    public String lastName;
    public String email;
    public String phone;
    public String company;

    public static User createRandomUser(Faker faker) {
        return new User(faker.name().firstName(), faker.name().lastName(), Config.testEmail,
                faker.phoneNumber().cellPhone(), faker.company().name());
    }
}
