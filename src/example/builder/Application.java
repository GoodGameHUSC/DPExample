package example.builder;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        People.Builder peopleBuilder = new People.Builder();
        People person =  peopleBuilder.setName("Hung")
        .setDateOfBirth(new Date(1998, 6, 21))
        .setGender(true)
        .setGovermentId("190920320")
        .get();
        
        System.out.println(person.getName());
        System.out.println(person.getDob());
    }

}
