package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class PublishMsgRequest  extends AbstractModel{


    /**
    * Topic
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;
    

    /**
    * 消息内容
    */
    @SerializedName("Message")
    @Expose
    private String Message;
    

    /**
    * Qos
    */
    @SerializedName("Qos")
    @Expose
    private Integer Qos;
    

    /**
     * 获取Topic
     * @return Topic Topic
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * 设置Topic
     * @param Topic Topic
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * 获取消息内容
     * @return Message 消息内容
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置消息内容
     * @param Message 消息内容
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取Qos
     * @return Qos Qos
     */
    public Integer getQos() {
        return this.Qos;
    }

    /**
     * 设置Qos
     * @param Qos Qos
     */
    public void setQos(Integer Qos) {
        this.Qos = Qos;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Qos", this.Qos);

    }
}

