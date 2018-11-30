package ExoMaven;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJavaToJson {

	@Test
	public void testAddress() {
		String json = "{\"rue\":\"de la Nouvelle france\",\"num\":140}";
		Address adr1 = new Address();
		ObjectMapper om = new ObjectMapper();
		try {
			assertEquals(json, om.writeValueAsString(adr1));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
