package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeOrdersResponse  extends AbstractModel{


    /**
    * 返回的订单数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer [] TotalCount;

    /**
    * 订单信息列表。
    */
    @SerializedName("Deals")
    @Expose
    private Deal [] Deals;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取返回的订单数量。
     * @return TotalCount 返回的订单数量。
     */
    public Integer [] getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置返回的订单数量。
     * @param TotalCount 返回的订单数量。
     */
    public void setTotalCount(Integer [] TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取订单信息列表。
     * @return Deals 订单信息列表。
     */
    public Deal [] getDeals() {
        return this.Deals;
    }

    /**
     * 设置订单信息列表。
     * @param Deals 订单信息列表。
     */
    public void setDeals(Deal [] Deals) {
        this.Deals = Deals;
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
        this.setParamArraySimple(map, prefix + "TotalCount.", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Deals.", this.Deals);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

