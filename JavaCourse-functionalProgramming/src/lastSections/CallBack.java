package lastSections;

import java.util.function.Consumer;

public class CallBack {
    // cara pertama
    public static void main(String[] args) {
        hello("sam","dev",value -> {
            System.out.println("no last name provided fo " + value);
        });

        // cara kedua
        hello2("sam",
                "dev",
                () -> {System.out.println("no last name provided for");
        });
    }
    // cara pertama
    static void hello(String firstname, String lastname, Consumer<String> callback){
        System.out.println(firstname);
        if(lastname != null){
            System.out.println(lastname);
        }else{
            callback.accept(firstname);
        }
    }
    // cara kedua
    static void hello2(String firstname, String lastname, Runnable callback){
        System.out.println(firstname);
        if(lastname != null){
            System.out.println(lastname);
        }else{
            callback.run();
        }
    }


}
