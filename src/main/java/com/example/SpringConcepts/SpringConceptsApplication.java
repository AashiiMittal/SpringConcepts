package com.example.SpringConcepts;
import com.example.SpringConcepts.component.DemoBean;
import com.example.SpringConcepts.component.EmployeeBean;
import com.example.SpringConcepts.component.DepartmentBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		demoBean.showMessage();
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		DepartmentBean departmentBean = context.getBean(DepartmentBean.class);
		departmentBean.setDeptName("Software Engineering");
		logger.info("Calling showEmployeeDetails()...");
		employeeBean.showEmployeeDetails();
		logger.info("Calling showDepartmentDetails()...");
		departmentBean.showDepartmentDetails();

	}
}
