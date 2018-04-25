package com.tencentcloudapi.partners.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeAgentBillsResponse  extends AbstractModel{


    /**
    * 符合查询条件列表总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;
    

    /**
    * 业务明细列表
    */
    @SerializedName("AgentBillSet")
    @Expose
    private AgentBillElem [] AgentBillSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取符合查询条件列表总数量
     * @return TotalCount 符合查询条件列表总数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合查询条件列表总数量
     * @param TotalCount 符合查询条件列表总数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取业务明细列表
     * @return AgentBillSet 业务明细列表
     */
    public AgentBillElem [] getAgentBillSet() {
        return this.AgentBillSet;
    }

    /**
     * 设置业务明细列表
     * @param AgentBillSet 业务明细列表
     */
    public void setAgentBillSet(AgentBillElem [] AgentBillSet) {
        this.AgentBillSet = AgentBillSet;
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
        this.setParamArrayObj(map, prefix + "AgentBillSet.", this.AgentBillSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

