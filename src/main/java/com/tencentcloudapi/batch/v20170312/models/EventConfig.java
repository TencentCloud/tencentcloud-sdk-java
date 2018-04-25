package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class EventConfig  extends AbstractModel{


    /**
    * 事件类型
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;
    

    /**
    * 自定义键值对
    */
    @SerializedName("EventVars")
    @Expose
    private EventVar [] EventVars;
    

    /**
     * 获取事件类型
     * @return EventName 事件类型
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * 设置事件类型
     * @param EventName 事件类型
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * 获取自定义键值对
     * @return EventVars 自定义键值对
     */
    public EventVar [] getEventVars() {
        return this.EventVars;
    }

    /**
     * 设置自定义键值对
     * @param EventVars 自定义键值对
     */
    public void setEventVars(EventVar [] EventVars) {
        this.EventVars = EventVars;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamArrayObj(map, prefix + "EventVars.", this.EventVars);

    }
}

