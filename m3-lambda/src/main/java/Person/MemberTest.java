package Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("Mike",35,Gender.MALE);
        Person p2 = new Person("Ozzy",25,Gender.MALE);
        Person p3 = new Person("Tom",15,Gender.MALE);
        Person p4 = new Person("Ally",45,Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1,p2,p3,p4);

        CheckMember checkMember = p -> p.getGender() == Gender.MALE && p.getAge() >=18 && p.getAge()<=25;

        print(personList,checkMember);




    }

    private static void print(List<Person> personList, CheckMember checkMember){

        List<Person> result = new ArrayList<>();

        for (Person person : personList) {
            if(checkMember.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }
}

/*
Suppose that you are creating a social networking application. You want to
create a feature that enables an administrator to perform any kind of action,
such as sending a message, on members of the social networking application
that satisfy certain criteria.

Criteria : Send message to Male Members whose age is between 18 and 25
 */