package com.kafka;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.codehaus.jackson.map.ObjectMapper;

import kafka.server.ProduceMetadata;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;
public class JSONPayloadMainClass {

	public static void main(String[] args) {
		int i=0;
		Date objDate = new Date();
		Properties props = new Properties();
		props.put("bootstrap.servers","192.168.0.6:9092");
		  props.put("key.serializer",
		         "org.apache.kafka.common.serialization.StringSerializer");
		  props.put("value.serializer",
		         "org.apache.kafka.common.serialization.StringSerializer");
		  props.put("acks","all");
		  KafkaProducer<String,String> producer = new KafkaProducer<String, String>(props);
		  String topic = "testTopic";
		while(true)
		{
		JSONData js = new JSONData(i,i*2,i*3,i*4,objDate);
		
		ObjectMapper mapperObj = new ObjectMapper();
        
        try {
        	String jsonStr = mapperObj.writeValueAsString(js);
            System.out.println(jsonStr);
            ProducerRecord<String, String> record =
            		new ProducerRecord(topic,Integer.toString(i),jsonStr);
            	    //  ProduceMetadata metadata = (ProduceMetadata) 
            	    		  producer.send(record);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        i++;
        //producer.close();
		}
		
	}

}
