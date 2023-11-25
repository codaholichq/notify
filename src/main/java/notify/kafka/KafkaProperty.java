package notify.kafka;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("spring.kafka.consumer")
public class KafkaProperty {
    private String bootstrapServers;
}
