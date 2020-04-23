package com.belajar4;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(name.get());
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:7634/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = ()
            -> "jdbc://localhost:7634/users";

    static Supplier<List<String>> name = ()
            -> List.of("jdbc://localhost:7634/users",
                "jdbc://localhost:7634/users",
                "jdbc://localhost:7834/users",
                "jdbc://localhost:3433/users"
            );
}
