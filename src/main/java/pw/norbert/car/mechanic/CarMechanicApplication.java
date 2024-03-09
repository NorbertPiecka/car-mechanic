package pw.norbert.car.mechanic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pw.norbert.car.mechanic.repository.NewsRepository;

@SpringBootApplication
public class CarMechanicApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarMechanicApplication.class, args);
    }

}
