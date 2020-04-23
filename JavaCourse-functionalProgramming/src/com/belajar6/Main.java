package com.belajar6;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("https://chat.whatsapp.com/JAoJSKFsnslGiecjm9j71x")
                .ifPresentOrElse(email -> System.out.println("Join :  " + email),
                        () -> System.out.println("oh"));
    }
}
