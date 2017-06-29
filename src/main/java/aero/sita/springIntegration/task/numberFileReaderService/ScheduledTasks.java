package aero.sita.springIntegration.task.numberFileReaderService;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * The Class ScheduledTasks.
 */
@Component
public class ScheduledTasks {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	/** The Constant dateFormat. */
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	/** The Constant configFile. */
	private static final String configFile = "spring-config.xml";

	/**
	 * Report current time.
	 */
	@Scheduled(fixedRate = 10000)
	public void reportCurrentTime() {
		try {
			log.info("The time is now {}", dateFormat.format(new Date()));
			log.debug("Loaded logging configurations");

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configFile);
			log.debug("Loaded spring context.");
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}