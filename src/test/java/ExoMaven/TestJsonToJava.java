package ExoMaven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJsonToJava {
	
	@Test
	public void testAddress() {
		String json1 = "{\"rue\":\"rue de la Nouvelle france\",\"num\":140}";
		String json2 = "{\"rue\":\"avenue de paris\",\"num\":12}";
		String jsonFalse1 = "{\"rue\":\"de la Nouvelle france\",\"num\":140}";
		String jsonFalse2 = "{\"rue\":\"rue de la Nouvelle france\",\"num\":139}";
		Address adr1 = new Address("rue de la Nouvelle france", 140);
		Address adr2 = new Address("avenue de paris", 12);
		ObjectMapper om = new ObjectMapper();
		try {
			assertEquals(adr1, om.readValue(json1, Address.class));
			assertNotEquals(adr1, om.readValue(jsonFalse1, Address.class));
			assertNotEquals(adr1, om.readValue(jsonFalse2, Address.class));
			assertEquals(adr2, om.readValue(json2, Address.class));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testPersonne() {
		String json1 = "{\"adr\":{\"rue\":\"rue de la Nouvelle france\",\"num\":140},\"name\":\"Napoléon\",\"age\":0}";
		String jsonFalse1 = "{\"adr\":{\"rue\":\"rue de la Nouvelle france\",\"num\":140},\"name\":\"Napléon\",\"age\":0}";
		String jsonFalse2 = "{\"adr\":{\"rue\":\"rue de la Nuvelle france\",\"num\":140},\"name\":\"Napoléon\",\"age\":0}";
		String jsonFalse3 = "{\"adr\":{\"rue\":\"rue de la Nuvelle france\",\"num\":140},\"name\":\"Napoléon\",\"age\":1}";
		String json2 = "{\"adr\":{\"rue\":\"avenue de paris\",\"num\":12},\"name\":\"Gertrude\",\"age\":12}";
		Address adr1 = new Address("rue de la Nouvelle france", 140);
		Address adr2 = new Address("avenue de paris", 12);
		Personne pers1 = new Personne(adr1,"Napoléon", 0);
		Personne pers2 = new Personne(adr2,"Gertrude", 12);
		ObjectMapper om = new ObjectMapper();

		try {
			assertEquals(pers1, om.readValue(json1, Personne.class));
			assertEquals(pers2, om.readValue(json2, Personne.class));
			assertNotEquals(pers1, om.readValue(jsonFalse1, Personne.class));
			assertNotEquals(pers1, om.readValue(jsonFalse2, Personne.class));
			assertNotEquals(pers1, om.readValue(jsonFalse3, Personne.class));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
