package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeOrdersResponse  extends AbstractModel{


    /**
    * 订单数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 订单数组
    */
    @SerializedName("Deals")
    @Expose
    private PgDeal [] Deals;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取订单数量
     * @return TotalCount 订单数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置订单数量
     * @param TotalCount 订单数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取订单数组
     * @return Deals 订单数组
     */
    public PgDeal [] getDeals() {
        return this.Deals;
    }

    /**
     * 设置订单数组
     * @param Deals 订单数组
     */
    public void setDeals(PgDeal [] Deals) {
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Deals.", this.Deals);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

