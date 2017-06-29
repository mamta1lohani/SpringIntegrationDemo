package aero.sita.springIntegration.task.test.numberFileReaderService;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

import aero.sita.springIntegration.task.numberFileReaderService.InputFileValidator;
import static org.junit.Assert.*;

public class InputFileValidatorTest {

	private InputFileValidator inputFileValidator;
	/**
	 * Setting the resources ready
	 */
	@Before
	public void setUp() {
		inputFileValidator = new InputFileValidator();
	}

	/**
	 * Tidying resources
	 */
	@After
	public void tearDown() {
		inputFileValidator = null;
	}

	/**
	 * Test to check whether a file contains valid or invalid payload.
	 */
	@Test
	public void checkValidInvalidFileChannel() {
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("file_name", "abc.txt");
		MessageHeaders messageHeaders = new MessageHeaders(headers);
		Message<String> message = MessageBuilder.createMessage("1234\n123a\n32", messageHeaders);
		String output = inputFileValidator.validateFile(message);
		assertEquals("Output is wrong ", "invalidFileChannel", output);
	}
}
