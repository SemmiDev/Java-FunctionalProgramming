package pattern;

import java.time.LocalDate;

import static pattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Sam",
                "sammidev@gmil.com",
                "+6282387325971",
                LocalDate.of( 2001,10,20)
        );

//  System.out.println(new CustomerValidationService().isValid(customer));
    ValidationResult result =  isEmailValid()
            .and(isPhoneNumberValid())
            .and(isAdult())
            .apply(customer);

        System.out.println(result);
        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
