package com.example.SpringConcepts;
import com.example.SpringConcepts.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger =LoggerFactory.getLogger(SpringConceptsApplication.class);
	public static void main(String[] args) {
		logger.trace("TRACE: Application starting...");
		logger.debug("DEBUG: Welcome to Spring Concept Demo");
		logger.info("INFO: Starting the application...");
		try {
			ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
			DemoBean demoBean = context.getBean(DemoBean.class);
			logger.debug("DEBUG: Checking Context: {}", demoBean);
			logger.info("INFO: DemoBean successfully retrieved.");
			logger.warn("WARNING: This is just a test warning log.");
			logger.error("ERROR: No errors, but demonstrating logging!");
		} catch (Exception e) {
			logger.error("ERROR: Exception occurred while starting application", e);
		}
    }
}
