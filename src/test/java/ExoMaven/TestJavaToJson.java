package ExoMaven;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJavaToJson {

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
			assertEquals(json1, om.writeValueAsString(adr1));
			assertNotEquals(jsonFalse1, om.writeValueAsString(adr1));
			assertNotEquals(jsonFalse2, om.writeValueAsString(adr1));
			assertEquals(json2, om.writeValueAsString(adr2));
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPersonne() {
		String json = "{\"rue\":\"de la Nouvelle france\",\"num\":140}";
		Address adr1 = new Address();
		ObjectMapper om = new ObjectMapper();
	}

}
