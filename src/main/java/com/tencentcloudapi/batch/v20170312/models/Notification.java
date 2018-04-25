package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Notification  extends AbstractModel{


    /**
    * CMQ主题名字，要求主题名有效且关联订阅
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;
    

    /**
    * 事件配置
    */
    @SerializedName("EventConfigs")
    @Expose
    private EventConfig [] EventConfigs;
    

    /**
     * 获取CMQ主题名字，要求主题名有效且关联订阅
     * @return TopicName CMQ主题名字，要求主题名有效且关联订阅
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * 设置CMQ主题名字，要求主题名有效且关联订阅
     * @param TopicName CMQ主题名字，要求主题名有效且关联订阅
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * 获取事件配置
     * @return EventConfigs 事件配置
     */
    public EventConfig [] getEventConfigs() {
        return this.EventConfigs;
    }

    /**
     * 设置事件配置
     * @param EventConfigs 事件配置
     */
    public void setEventConfigs(EventConfig [] EventConfigs) {
        this.EventConfigs = EventConfigs;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArrayObj(map, prefix + "EventConfigs.", this.EventConfigs);

    }
}

