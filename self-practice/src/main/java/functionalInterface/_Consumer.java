package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        //Normal Java Function
        Customer maria = new Customer("Maria","99999");
        greetCustomer(maria);
        greetCustomerConsumerV2(maria,false);

        //Consumer Functional Interface
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria,false);


    }

    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer,showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    " ,thanks for registering phone number " + (showPhoneNumber? customer.customerNumber : "********"));
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    " ,thanks for registering phone number " + customer.customerNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                " ,thanks for registering phone number " + customer.customerNumber);
    }

    static void greetCustomerConsumerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName +
                " ,thanks for registering phone number " + (showPhoneNumber? customer.customerNumber : "********"));
    }
    static class Customer {
        private final String customerName;
        private final String customerNumber;


        Customer(String customerName, String customerNumber) {
            this.customerName = customerName;
            this.customerNumber = customerNumber;
        }
    }
}
