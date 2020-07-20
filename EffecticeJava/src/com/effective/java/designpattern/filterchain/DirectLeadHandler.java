package com.effective.java.designpattern.filterchain;

/**
 * @author freesia <yukaibo@bytedance.com>
 * @date 2020-07-18 16:43
 * 直属上级审批
 **/
public class DirectLeadHandler extends AbstractHandler{

    @Override
    public Boolean process(LeaveRequest request) {
        if(request.getLeaveDays() < 5){
            return true;
        }
        return this.getNextHandler().process(request);
    }
}
