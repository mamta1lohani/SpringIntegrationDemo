package aero.sita.springIntegration.task.numberFileReaderService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NonNull;

/**
 * The Class ApplicationProperties.
 */
@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Data
public class ApplicationProperties {
	
	/**
	 * Instantiates a new application properties.
	 */
	ApplicationProperties() {
	}

	/** The data dir. */
	@NonNull
	@Value("${data_dir}")
	private String data_dir;

	/** The input dir. */
	@NonNull
	@Value("${input_dir}")
	private String input_dir;

	/** The output dir. */
	@NonNull
	@Value("${output_dir}")
	private String output_dir;

	/** The error dir. */
	@NonNull
	@Value("${error_dir}")
	private String error_dir;

	/** The processed dir. */
	@NonNull
	@Value("${processed_dir}")
	private String processed_dir;
}
