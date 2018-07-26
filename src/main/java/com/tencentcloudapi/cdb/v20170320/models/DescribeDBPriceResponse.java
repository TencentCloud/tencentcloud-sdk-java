package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBPriceResponse  extends AbstractModel{


    /**
    * 实例价格，单位：分（人民币）
    */
    @SerializedName("Price")
    @Expose
    private Integer Price;

    /**
    * 实例原价，单位：分（人民币）
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Integer OriginalPrice;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取实例价格，单位：分（人民币）
     * @return Price 实例价格，单位：分（人民币）
     */
    public Integer getPrice() {
        return this.Price;
    }

    /**
     * 设置实例价格，单位：分（人民币）
     * @param Price 实例价格，单位：分（人民币）
     */
    public void setPrice(Integer Price) {
        this.Price = Price;
    }

    /**
     * 获取实例原价，单位：分（人民币）
     * @return OriginalPrice 实例原价，单位：分（人民币）
     */
    public Integer getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * 设置实例原价，单位：分（人民币）
     * @param OriginalPrice 实例原价，单位：分（人民币）
     */
    public void setOriginalPrice(Integer OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

