package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeHostsResponse  extends AbstractModel{


    /**
    * 符合查询条件的cdh实例总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;
    

    /**
    * cdh实例详细信息列表
    */
    @SerializedName("HostSet")
    @Expose
    private HostItem [] HostSet;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取符合查询条件的cdh实例总数
     * @return TotalCount 符合查询条件的cdh实例总数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合查询条件的cdh实例总数
     * @param TotalCount 符合查询条件的cdh实例总数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取cdh实例详细信息列表
     * @return HostSet cdh实例详细信息列表
     */
    public HostItem [] getHostSet() {
        return this.HostSet;
    }

    /**
     * 设置cdh实例详细信息列表
     * @param HostSet cdh实例详细信息列表
     */
    public void setHostSet(HostItem [] HostSet) {
        this.HostSet = HostSet;
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
        this.setParamArrayObj(map, prefix + "HostSet.", this.HostSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

