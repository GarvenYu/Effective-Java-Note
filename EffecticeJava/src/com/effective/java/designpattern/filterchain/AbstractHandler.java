package com.effective.java.designpattern.filterchain;

/**
 * @author freesia <yukaibo@bytedance.com>
 * @date 2020-07-18 16:37
 * 抽象类
 **/
public abstract class AbstractHandler {
    // 下一处理器
    private AbstractHandler nextHandler;

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * @author <yukaibo@bytedance.com>
     * @description 处理请假审批逻辑
     * @date 2020-07-20 10:18
     * @param [request]
     * @return java.lang.Boolean
     **/
    public abstract Boolean process(LeaveRequest request);
}
