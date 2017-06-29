package aero.sita.springIntegration.task.test.numberFileReaderService;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

import aero.sita.springIntegration.task.numberFileReaderService.ProcessFile;

public class ProcessFileTest {
	private ProcessFile processFile;
	/**
	 * Setting the resources ready
	 */
	@Before
	public void setUp() {
		processFile = new ProcessFile();
	}

	/**
	 * Tidying resources
	 */
	@After
	public void tearDown() {
		processFile = null;
	}


	 /* 
	  * Calculating total from file and setting the output.
	 */
	@Test
	public void calculateTotalFromFileValid() {
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("file_name", "abc.txt");
		MessageHeaders messageHeaders = new MessageHeaders(headers);
		Message<String> message = MessageBuilder.createMessage("2500\n2500\n1000", messageHeaders);
		String output = processFile.calculateTotal(message);
		assertEquals("Calculating Total ", "6000", output);
	}
	
}
