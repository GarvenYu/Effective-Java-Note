package com.effective.java.designpattern.filterchain;

/**
 * @author freesia <yukaibo@bytedance.com>
 * @date 2020-07-18 16:40
 **/
public class LeaveRequest {

    private Integer leaveDays;

    public LeaveRequest(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }

    public Integer getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }
}
