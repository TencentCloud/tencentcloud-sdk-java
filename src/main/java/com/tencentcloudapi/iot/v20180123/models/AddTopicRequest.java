package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AddTopicRequest  extends AbstractModel{


    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;
    

    /**
    * Topic名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;
    

    /**
     * 获取产品Id
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取Topic名称
     * @return TopicName Topic名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * 设置Topic名称
     * @param TopicName Topic名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

