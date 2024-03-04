package practiceTasks.StreamPractice.Task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");


        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );

        //1. Find all transactions in the year 2011 and sort them by value(small to high)

        transactions.stream().filter(p->p.getYear()==2011).sorted(Comparator.comparing(p->p.getValue())).forEach(p-> System.out.println(p));

        //2. What are all the unique cities where the traders work?

        transactions.stream().map(p->p.getTrader().getCity()).distinct().collect(Collectors.toList()).forEach(p-> System.out.println(p));

        System.out.println("//  3. Find all traders from Cambridge and sort them by name.");

        transactions.stream().filter(p-> p.getTrader().getCity().equals("Cambridge")).sorted(Comparator.comparing(p->p.getTrader().getName())).forEach(p-> System.out.println(p));

        System.out.println("4. Return a string of all traders’ names sorted alphabetically.\n");

        transactions.stream().map(p->p.getTrader().getName()).sorted().forEach(p-> System.out.println(p));

        System.out.println("5. Are any traders based in Milan?\n");
        boolean milan = transactions.stream().anyMatch(p->p.getTrader().getCity().equals("Milan"));
        System.out.println(milan);

        System.out.println("Print the values of all transactions from the traders living in Cambridge.");

        transactions.stream().filter(p->p.getTrader().getCity().equals("Cambridge")).map(p-> p.getValue()).forEach(p-> System.out.println(p));

        System.out.println("7. What is the highest value of all the transactions?\n");
     int mx =    transactions.stream().max(Comparator.comparing(p->p.getValue())).get().getValue();
        System.out.println(mx);

        System.out.println("8. Find the transaction with the smallest valu");

        int min = transactions.stream().min(Comparator.comparing(p->p.getValue())).get().getValue();
    }
}



/*
1. Find all transactions in the year 2011 and sort them by value(small to high)
2. What are all the unique cities where the traders work?
3. Find all traders from Cambridge and sort them by name.
4. Return a string of all traders’ names sorted alphabetically.
5. Are any traders based in Milan?
6. Print the values of all transactions from the traders living in Cambridge.
7. What is the highest value of all the transactions?
8. Find the transaction with the smallest value.
 */