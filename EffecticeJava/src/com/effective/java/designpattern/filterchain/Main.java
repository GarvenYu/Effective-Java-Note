package com.effective.java.designpattern.filterchain;

/**
 * @author freesia <yukaibo@bytedance.com>
 * @date 2020-07-18 16:47
 **/
public class Main {
    public static void main(String[] args){
        LeaveRequest request = new LeaveRequest(11);

        AbstractHandler directLead = new DirectLeadHandler();
        AbstractHandler departmentHandler = new DepartmentLeadHandler();
        directLead.setNextHandler(departmentHandler);
        System.out.println("if leave request can be approved: " + directLead.process(request));
    }
}
