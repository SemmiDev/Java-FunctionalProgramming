package com.belajar3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your username     : ");
        String userIn = input.nextLine();
        System.out.print("Input your phone number : ");
        String userPn = input.nextLine();

        // number validation
        if(isPhoneNumberValid(userPn) && isUsernameValid.test(userIn)){
            if(containsNUmber9.test(userPn)){
                dataAdmin(userIn,userPn);
            }else{
                System.out.println("not success");
            }
        }else {
            System.out.println("not success");
            System.exit(0);
        }
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("08") && phoneNumber.length() == 10;
    }
    static Predicate<String> isUsernameValid = username ->
            username.startsWith("sam") && username.length() == 8;
    static Predicate<String> containsNUmber9 = phoneNumber ->
            phoneNumber.contains("9");

    static void dataAdmin(String usernameBase, String passwordBase){
        final String baseUsername = "sammidev";
        final String basePassword = "0823873259";

        if(usernameBase.equals(baseUsername) && passwordBase.equals(basePassword)){
            System.out.println("success");
        }else{
            System.out.println("not success");
        }
    }
}
