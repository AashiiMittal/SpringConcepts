package com.example.SpringConcepts.component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
public class DepartmentBean {
    private static final Logger logger = LoggerFactory.getLogger(DepartmentBean.class);
    private String deptName;
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public void showDepartmentDetails() {
        logger.info("Department Name: {}", deptName);
    }
}
