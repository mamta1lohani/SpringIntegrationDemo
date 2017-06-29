package aero.sita.springIntegration.task.test.numberFileReaderService;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import aero.sita.springIntegration.task.numberFileReaderService.ProcessedFileNameGenerator;


public class ProcessedFileNameGeneratorTest {

	private ProcessedFileNameGenerator generator;
	
	/**
	 * Setup the required resources.
	 */
	@Before
	public void setUp(){
		generator = new ProcessedFileNameGenerator();
		generator.setExtension("PROCESSED");
	}
	
	/**
	 * Tidying up resources
	 */
	@After
	public void tearDown(){
		generator = null;
	}
	
	/**
	 * Test to verify the file name after the generator process.
	 */
	@Test
	public void fileNameVerify(){
		Message<String> message = MessageBuilder.withPayload("Sample").setHeader("file_name", "XYZ.txt").build();		
		String generatedFileName = generator.generateFileName(message);
		Assert.assertEquals("The generated file name is wrong ", "XYZ.txt.PROCESSED", generatedFileName);
	}
}