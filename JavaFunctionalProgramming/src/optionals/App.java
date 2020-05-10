package optionals;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        // isi ofNUllable dengan = null, maka cannot send akan di eksekusi
        Optional.ofNullable("sammidev@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("sending email to " + email),
                        () -> System.out.println("Cannot send email")
                );
    }
}
