package aero.sita.springIntegration.task.numberFileReaderService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

import org.springframework.integration.file.FileNameGenerator;

/**
 * The Class ProcessedFileNameGenerator.
 */
public class ProcessedFileNameGenerator implements FileNameGenerator {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(ProcessedFileNameGenerator.class);

	/** The extension. */
	public String extension;

	/**
	 * Gets the extension.
	 *
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * Sets the extension.
	 *
	 * @param extension the new extension
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * Method to update the filename by FileWritingMessageHandler.
	 *
	 * @param message the message
	 * @return the updated file name
	 */
	public String generateFileName(Message<?> message) {
		String fileName = message.getHeaders().get("file_name").toString();
		String processedName = fileName + "." + extension;// ".processed";
		log.info("{}:{} ", fileName, processedName);
		return processedName;
	}
}
