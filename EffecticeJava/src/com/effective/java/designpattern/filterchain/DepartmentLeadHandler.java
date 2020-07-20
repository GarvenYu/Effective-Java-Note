package com.effective.java.designpattern.filterchain;

/**
 * @author freesia <yukaibo@bytedance.com>
 * @date 2020-07-18 16:45
 * 部门ld审批
 **/
public class DepartmentLeadHandler extends AbstractHandler{
    @Override
    public Boolean process(LeaveRequest request) {
        return 5 <= request.getLeaveDays() && request.getLeaveDays()<= 10;
    }
}
