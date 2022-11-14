package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //noinspection InstantiationOfUtilityClass
        new Main();
    }

    Main(){

        List<String> hello = Arrays.asList("hel lo_", "wor ld_", "bu t_", "i s_", "fu n ct io nal_", "c:");
        System.out.println("\nstring with spaces:");
        System.out.println(String.join("", hello));

        String result = hello.stream()
                .map(s -> s.replace(" ", ""))
                .collect(Collectors.joining());
        
        System.out.println("\nstring without spaces:");
        System.out.println(result);

    };
}
