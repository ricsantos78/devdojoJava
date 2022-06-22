package academy.devdojo.maratonajava.javacore.ZZJcrud.domain;

import lombok.Builder;
import lombok.Value;

//Builder
// Value transforma a classe em imutavel
@Value
@Builder
public class Producer {
    Integer id;
    String name;

}
