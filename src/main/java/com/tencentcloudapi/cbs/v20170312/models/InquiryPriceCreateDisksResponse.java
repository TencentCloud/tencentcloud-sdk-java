package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InquiryPriceCreateDisksResponse  extends AbstractModel{


    /**
    * 描述了新购云盘的价格。
    */
    @SerializedName("DiskPrice")
    @Expose
    private Price DiskPrice;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取描述了新购云盘的价格。
     * @return DiskPrice 描述了新购云盘的价格。
     */
    public Price getDiskPrice() {
        return this.DiskPrice;
    }

    /**
     * 设置描述了新购云盘的价格。
     * @param DiskPrice 描述了新购云盘的价格。
     */
    public void setDiskPrice(Price DiskPrice) {
        this.DiskPrice = DiskPrice;
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
        this.setParamObj(map, prefix + "DiskPrice.", this.DiskPrice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

