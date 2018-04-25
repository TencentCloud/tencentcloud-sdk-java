package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InquiryPriceResetInstancesTypeResponse  extends AbstractModel{


    /**
    * 该参数表示调整成对应机型实例的价格。
    */
    @SerializedName("Price")
    @Expose
    private Price Price;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取该参数表示调整成对应机型实例的价格。
     * @return Price 该参数表示调整成对应机型实例的价格。
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * 设置该参数表示调整成对应机型实例的价格。
     * @param Price 该参数表示调整成对应机型实例的价格。
     */
    public void setPrice(Price Price) {
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
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

