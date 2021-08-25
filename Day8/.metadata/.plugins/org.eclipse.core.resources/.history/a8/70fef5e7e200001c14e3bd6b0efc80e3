package com.telstra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	
	
	
	// Topic is created
	// Ensure that ZooKeeper, Kafka server is running
	private static final String KAFKA_TOPIC = "TelstraTopic";
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	private Player createStartPlayer(){
		Player player = new Player();
		player.setName("Aisha");
		player.setAlias("Star");
		player.setMaxSpeed(24);
		player.setTeam("Telstra 5G");
		
		return player;
		
	}
	
	@PostMapping("/publish")
	public String publishToKafka()
	{
		Player startplayer = createStartPlayer();
		try{
		kafkaTemplate.send(KAFKA_TOPIC,startplayer);
		}catch (Exception e) {
		  return "Can't Publish";
		}
		return "The data is "+startplayer.toString()+" is succesfully published to kafka";
	}
	
	//Listener / Consumer
	@KafkaListener(id="hey",topics=KAFKA_TOPIC)
	public void listenToTopicData(Player player) {
		System.out.println(player.toString());
	}

}
