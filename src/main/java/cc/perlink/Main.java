package cc.perlink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)

public class Main {
    public static void main(String[] args) {
        System.out.println("""
         ========================================================================
                 ________  ___       ________  ________    \s
                |\\   __  \\|\\  \\     |\\   __  \\|\\   ____\\   \s
                \\ \\  \\|\\ /\\ \\  \\    \\ \\  \\|\\  \\ \\  \\___|   \s
                 \\ \\   __  \\ \\  \\    \\ \\  \\\\\\  \\ \\  \\  ___ \s
                  \\ \\  \\|\\  \\ \\  \\____\\ \\  \\\\\\  \\ \\  \\|\\  \\\s
                   \\ \\_______\\ \\_______\\ \\_______\\ \\_______\\
                    \\|_______|\\|_______|\\|_______|\\|_______|         
 
         ========================================================================
                """);
        SpringApplication.run(Main.class, args);
    }
}