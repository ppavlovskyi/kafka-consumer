package telran.java52;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import telran.java52.pulse.dto.PulseDto;

@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}
	
	
	@Bean
	Consumer<PulseDto> log(){
		return t->System.out.println("Result: "+t);
	}
	

}
