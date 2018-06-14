package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ActionTimer  extends AbstractModel{


    /**
    * 定时器名称，目前仅支持销毁一个值：TerminateInstances。
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;

    /**
    * 执行时间，格式形如：2018-5-29 11:26:40,执行时间必须大于当前时间5分钟。
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * 扩展数据
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
     * 获取定时器名称，目前仅支持销毁一个值：TerminateInstances。
     * @return TimerAction 定时器名称，目前仅支持销毁一个值：TerminateInstances。
     */
    public String getTimerAction() {
        return this.TimerAction;
    }

    /**
     * 设置定时器名称，目前仅支持销毁一个值：TerminateInstances。
     * @param TimerAction 定时器名称，目前仅支持销毁一个值：TerminateInstances。
     */
    public void setTimerAction(String TimerAction) {
        this.TimerAction = TimerAction;
    }

    /**
     * 获取执行时间，格式形如：2018-5-29 11:26:40,执行时间必须大于当前时间5分钟。
     * @return ActionTime 执行时间，格式形如：2018-5-29 11:26:40,执行时间必须大于当前时间5分钟。
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * 设置执行时间，格式形如：2018-5-29 11:26:40,执行时间必须大于当前时间5分钟。
     * @param ActionTime 执行时间，格式形如：2018-5-29 11:26:40,执行时间必须大于当前时间5分钟。
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * 获取扩展数据
     * @return Externals 扩展数据
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * 设置扩展数据
     * @param Externals 扩展数据
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerAction", this.TimerAction);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);
        this.setParamObj(map, prefix + "Externals.", this.Externals);

    }
}

