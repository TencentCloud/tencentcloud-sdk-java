package com.tencentcloudapi.partners.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeRebateInfosResponse  extends AbstractModel{


    /**
    * 返佣信息列表
    */
    @SerializedName("RebateInfoSet")
    @Expose
    private RebateInfoElem [] RebateInfoSet;

    /**
    * 符合查询条件返佣信息数目
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取返佣信息列表
     * @return RebateInfoSet 返佣信息列表
     */
    public RebateInfoElem [] getRebateInfoSet() {
        return this.RebateInfoSet;
    }

    /**
     * 设置返佣信息列表
     * @param RebateInfoSet 返佣信息列表
     */
    public void setRebateInfoSet(RebateInfoElem [] RebateInfoSet) {
        this.RebateInfoSet = RebateInfoSet;
    }

    /**
     * 获取符合查询条件返佣信息数目
     * @return TotalCount 符合查询条件返佣信息数目
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合查询条件返佣信息数目
     * @param TotalCount 符合查询条件返佣信息数目
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
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
        this.setParamArrayObj(map, prefix + "RebateInfoSet.", this.RebateInfoSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

