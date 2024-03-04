package practiceTasks.StreamPractice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class State {
       private    List<String> cities = new ArrayList<>();

       public void addCity(String city){
           cities.add(city);
       }


       public List<String> getCities(){
           return this.cities;
       }


    public static void main(String[] args) {

           List<State> usa = new ArrayList<>();

           State FL = new State();
           FL.addCity("Miami");
           FL.addCity("Jacksonvile");
           FL.addCity("Tampa");
           FL.addCity("Sunny isles");
        System.out.println(FL);

           State CA = new State();
           CA.addCity("Los Angeles");
           CA.addCity("Santa Barbara");
           CA.addCity("San Diego");

           State NY = new State();
           NY.addCity("New York");
           NY.addCity("Buffalo");
           NY.addCity("New Jersey");

           usa.addAll(Arrays.asList(FL,CA,NY));
        System.out.println(usa);

     List<String> allCities =  usa.stream().flatMap(p -> p.cities.stream()).collect(Collectors.toList());

        System.out.println(allCities);
    }

}

/*
Suppose we have a State class that contains list of cities. Create a list
of States and print all the cities.
public class State {
private List<String> cities = new ArrayList<>();
public void addCity(String city){
cities.add(city);
}
public List<String> getCities(){
return this.cities;
}
}
 */