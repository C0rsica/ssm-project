package top.yangluotong.kafka;

import top.yangluotong.annotation.Unsafe;

import java.util.Properties;
import java.util.Random;

@Unsafe(value = "1",name = "2")
public class NativeProductor {
    public static void main(String[] args) {
        String topic = "test";
        long events = 100;
        Random rand = new Random();

        Properties props = new Properties();
        props.put("metadata.broker.list", "localhost:9092");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("request.required.acks", "1");

//        ProducerConfig config = new ProducerConfig(props);




        /*Producer<String, String> producer = new Producer<>(config);

        for (long nEvents = 0; nEvents < events; nEvents++) {
            String msg = "NativeMessage-" + rand.nextInt();
            KeyedMessage<String, String> data = new KeyedMessage<String, String>(topic, nEvents + "", msg);
            producer.send(data);
        }
        producer.close();*/
    }
}
