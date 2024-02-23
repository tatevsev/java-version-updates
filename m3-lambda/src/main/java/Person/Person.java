package Person;
 import lombok.AllArgsConstructor;
 import lombok.Getter;
 import lombok.Setter;
 import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@ToString

public class Person {
   private String name;
   private int age;
   private Gender gender;

}
