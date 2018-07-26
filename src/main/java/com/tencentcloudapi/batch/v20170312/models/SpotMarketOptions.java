package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SpotMarketOptions  extends AbstractModel{


    /**
    * 竞价出价
    */
    @SerializedName("MaxPrice")
    @Expose
    private String MaxPrice;

    /**
    * 竞价请求类型，当前仅支持类型：one-time
    */
    @SerializedName("SpotInstanceType")
    @Expose
    private String SpotInstanceType;

    /**
     * 获取竞价出价
     * @return MaxPrice 竞价出价
     */
    public String getMaxPrice() {
        return this.MaxPrice;
    }

    /**
     * 设置竞价出价
     * @param MaxPrice 竞价出价
     */
    public void setMaxPrice(String MaxPrice) {
        this.MaxPrice = MaxPrice;
    }

    /**
     * 获取竞价请求类型，当前仅支持类型：one-time
     * @return SpotInstanceType 竞价请求类型，当前仅支持类型：one-time
     */
    public String getSpotInstanceType() {
        return this.SpotInstanceType;
    }

    /**
     * 设置竞价请求类型，当前仅支持类型：one-time
     * @param SpotInstanceType 竞价请求类型，当前仅支持类型：one-time
     */
    public void setSpotInstanceType(String SpotInstanceType) {
        this.SpotInstanceType = SpotInstanceType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxPrice", this.MaxPrice);
        this.setParamSimple(map, prefix + "SpotInstanceType", this.SpotInstanceType);

    }
}

