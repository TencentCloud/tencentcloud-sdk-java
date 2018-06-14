package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteTopicRequest  extends AbstractModel{


    /**
    * TopicId
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
     * 获取TopicId
     * @return TopicId TopicId
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * 设置TopicId
     * @param TopicId TopicId
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);

    }
}

