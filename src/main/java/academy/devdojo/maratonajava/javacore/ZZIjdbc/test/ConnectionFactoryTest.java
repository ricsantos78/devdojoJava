package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("MadHouse").build();
//        ProducerService.save(producer);
//        ProducerService.delete(8);
 //       Producer producerToUpdate = Producer.builder().id(3).name("STUDIO DEEN").build();

//        List<Producer> producers = ProducerService.findByName("Mad");
        //List<Producer> producers = ProducerService.findAll();
        //.info("Producers found '{}' ",producers);

//        ProducerService.showTypeScrollWorking();

//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers found '{}' ",producers);
        ProducerService.findByNameAndDelete("A-1 pictures");
    }
}
