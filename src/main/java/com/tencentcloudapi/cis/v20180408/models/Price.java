package com.tencentcloudapi.cis.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Price  extends AbstractModel{


    /**
    * 原价，单位：元
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 折扣价，单位：元
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
     * 获取原价，单位：元
     * @return DiscountPrice 原价，单位：元
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * 设置原价，单位：元
     * @param DiscountPrice 原价，单位：元
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * 获取折扣价，单位：元
     * @return OriginalPrice 折扣价，单位：元
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * 设置折扣价，单位：元
     * @param OriginalPrice 折扣价，单位：元
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);

    }
}

