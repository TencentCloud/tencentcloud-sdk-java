package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InquiryPriceCreateDBInstancesResponse  extends AbstractModel{


    /**
    * 原始价格，单位：分
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Integer OriginalPrice;
    

    /**
    * 折后价格，单位：分
    */
    @SerializedName("Price")
    @Expose
    private Integer Price;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取原始价格，单位：分
     * @return OriginalPrice 原始价格，单位：分
     */
    public Integer getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * 设置原始价格，单位：分
     * @param OriginalPrice 原始价格，单位：分
     */
    public void setOriginalPrice(Integer OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * 获取折后价格，单位：分
     * @return Price 折后价格，单位：分
     */
    public Integer getPrice() {
        return this.Price;
    }

    /**
     * 设置折后价格，单位：分
     * @param Price 折后价格，单位：分
     */
    public void setPrice(Integer Price) {
        this.Price = Price;
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
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

