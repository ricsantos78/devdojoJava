package academy.devdojo.maratonajava.javacore.ZZIjdbc.domain;

import java.util.Objects;

public class Producer {
    private Integer id;
    private String name;


    public static final class producerBuilder {
        private Integer id;
        private String name;

        private producerBuilder() {
        }

        public static producerBuilder builder() {
            return new producerBuilder();
        }

        public producerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public producerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Producer build() {
            Producer producer = new Producer();
            producer.name = this.name;
            producer.id = this.id;
            return producer;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "producer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
