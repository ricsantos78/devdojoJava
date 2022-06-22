package academy.devdojo.maratonajava.javacore.ZZJcrud.domain;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Anime {
    Integer id;
    String name;
    int episodes;
    Producer producer;
}
