package com.tencentcloudapi.partners.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeAgentClientsResponse  extends AbstractModel{


    /**
    * 代客列表
    */
    @SerializedName("AgentClientSet")
    @Expose
    private AgentClientElem [] AgentClientSet;
    

    /**
    * 符合条件的代客总数
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
     * 获取代客列表
     * @return AgentClientSet 代客列表
     */
    public AgentClientElem [] getAgentClientSet() {
        return this.AgentClientSet;
    }

    /**
     * 设置代客列表
     * @param AgentClientSet 代客列表
     */
    public void setAgentClientSet(AgentClientElem [] AgentClientSet) {
        this.AgentClientSet = AgentClientSet;
    }

    /**
     * 获取符合条件的代客总数
     * @return TotalCount 符合条件的代客总数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合条件的代客总数
     * @param TotalCount 符合条件的代客总数
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
        this.setParamArrayObj(map, prefix + "AgentClientSet.", this.AgentClientSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

