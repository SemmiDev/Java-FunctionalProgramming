package com.belajar2;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
   public static void main(String[] args) {
       // normal java func
    Customer sam = new Customer("Sam","3287489");
       greetCustomer(sam);

       // consumer functinal interface
       greetConsumerCustomer.accept(sam);
       greetConsumerCustomerV2.accept(sam,true);
       greetConsumerCustomerV2.accept(sam,false);

   }

   static BiConsumer<Customer,Boolean> greetConsumerCustomerV2 = (customer, showPhoneNumber) ->
           System.out.println("Hello, " + customer.custumerName +
                   ", thanks for registering phone number : " +
                   (showPhoneNumber ? customer.customerPhoneNumber : "***********"));

   static Consumer<Customer> greetConsumerCustomer = customer ->
           System.out.println("Hello, " + customer.custumerName +
                   ", thanks for registering phone number : " +
                   customer.customerPhoneNumber);


   static void greetCustomer(Customer customer){
       System.out.println("Hello, " + customer.custumerName +
               ", thanks for registering phone number : " +
               customer.customerPhoneNumber);
   }

   static class Customer{
       private final String custumerName;
       private final String customerPhoneNumber;

       // constructor
       Customer(String custumerName, String customerPhoneNumber) {
           this.custumerName = custumerName;
           this.customerPhoneNumber = customerPhoneNumber;
       }
   }
}
