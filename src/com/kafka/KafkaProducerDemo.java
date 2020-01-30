/*
 * package com.kafka;
 */
/*import java.util.Properties;
import org.apache.kafka.clients.producer.{KafkaProducer,ProducerRecord};

public class KafkaProducerDemo{
  public static void main(args[] String)
  {
    val props:Properties = new Properties()
  props.put("bootstrap.servers","192.168.0.6:9092")
  props.put("key.serializer",
         "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer",
         "org.apache.kafka.common.serialization.StringSerializer")
  props.put("acks","all")
  val producer = new KafkaProducer[String, String](props)
  //val topic = "testTopic"
  try {
    var i:Int=1;
    while(true) { 
      
      val record = new ProducerRecord[String, String](topic, i.toString, "Testing Kafka " + i)
      val metadata = producer.send(record)
      /*printf(s"sent record(key=%s value=%s) " +
        "meta(partition=%d, offset=%d)\n",
        record.key(), record.value(), 
        metadata.get().partition(),
        metadata.get().offset()) */
       /* i=i+1;
    }
  }catch{
    case e:Exception => e.printStackTrace()
  }finally {
    producer.close()
  }
}
     

}

*/