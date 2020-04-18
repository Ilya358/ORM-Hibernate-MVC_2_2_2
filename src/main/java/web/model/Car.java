package web.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Car {

    private String name;

    private String model;

    private int series;

    public Car(){}

    public Car(String name, String model, int series) {
        this.name = name;
        this.model = model;
        this.series = series;
    }
}
