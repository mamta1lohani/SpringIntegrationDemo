/**
 * 
 */
package aero.sita.springIntegration.task.numberFileReaderService;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.util.Random;

//import org.apache.log4j.Logger;

/**
 * The Class FileProcessor.
 *
 * @author mamta.lohani
 */
public class FileProcessor {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(FileProcessor.class);
	
	/** The Constant dateFormat. */
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	/** The random. */
	private Random random = new Random();

	/**
	 * Instantiates a new file processor.
	 */
	public FileProcessor() {

		// TODO Auto-generated constructor stub

		log.info("{} FileProcessor started", dateFormat.format(new Date()));
	}

	/**
	 * Process.
	 *
	 * @param file the file
	 * @return the file
	 * @throws Exception the exception
	 */
	public File process(File file) throws Exception {
		Thread.sleep(random.nextInt(10) * 500);
		log.info("Processing File: " + file);
		return file;
	}

}
