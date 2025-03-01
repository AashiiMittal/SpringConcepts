package com.example.SpringConcepts.component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EmployeeBean {
    private int eid;
    private String ename;
    private DepartmentBean deptBean;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
    public EmployeeBean() {
        logger.trace("EmployeeBean instance created!");
    }
    @Autowired
    public void setDeptBean(DepartmentBean deptBean) {
        logger.trace("*** Autowiring by using @Autowired annotation on Setter ***");
        this.deptBean = deptBean;
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void showEmployeeDetails() {
        logger.info("Inside showEmployeeDetails()");
        logger.info("Employee Id: {}", eid);
        logger.info("Employee Name: {}", ename);
        if (deptBean.getDeptName() == null) {
            deptBean.setDeptName("Information Technology");  // Set only if not already set
        }
        logger.info("Department: {}", deptBean.getDeptName());
    }
}
