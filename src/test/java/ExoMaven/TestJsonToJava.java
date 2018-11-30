package ExoMaven;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.example.exoMaven1.ExoMaven1ApplicationTests.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJsonToJava {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void jsonToJava() {
		String json = "{\"name\":\"moi\", \"address\":{}}";
		ObjectMapper om = new ObjectMapper();
		try {
			Personne p = om.readValue(json, Personne.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Assert.assertEquals(expected, actual);
	}

}
