package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RuleQuery  extends AbstractModel{


    /**
    * 字段
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Topic
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 过滤规则
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
     * 获取字段
     * @return Field 字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * 设置字段
     * @param Field 字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

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
     * 获取过滤规则
     * @return Condition 过滤规则
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * 设置过滤规则
     * @param Condition 过滤规则
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Condition", this.Condition);

    }
}

