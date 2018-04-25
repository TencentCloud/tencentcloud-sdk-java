package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ActionTimer  extends AbstractModel{


    /**
    * 定时器
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;
    

    /**
    * 执行时间
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
     * 获取定时器
     * @return TimerAction 定时器
     */
    public String getTimerAction() {
        return this.TimerAction;
    }

    /**
     * 设置定时器
     * @param TimerAction 定时器
     */
    public void setTimerAction(String TimerAction) {
        this.TimerAction = TimerAction;
    }

    /**
     * 获取执行时间
     * @return ActionTime 执行时间
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * 设置执行时间
     * @param ActionTime 执行时间
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

