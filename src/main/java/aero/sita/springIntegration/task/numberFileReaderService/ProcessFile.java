package aero.sita.springIntegration.task.numberFileReaderService;

import org.springframework.messaging.Message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ProcessFile.
 */
public class ProcessFile {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(ProcessFile.class);

	/**
	 * Calculate total.
	 *
	 * @param message the message
	 * @return the string
	 */
	public String calculateTotal(Message<?> message) {
		String fileName = (String) message.getHeaders().get("file_name");
		String content = message.getPayload().toString();
		long total = 0;
		log.debug("{}: calculating total", fileName);
		for (String val : content.split("\n")) {
			total += Long.valueOf(val.trim());
		}
		log.info("{}:{} DONE", fileName, total);
		return String.valueOf(total);
	}
}
