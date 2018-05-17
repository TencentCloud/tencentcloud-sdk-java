package com.tencentcloudapi.es.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeInstancesResponse  extends AbstractModel{


    /**
    * 返回的实例个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;
    

    /**
    * 实例详细信息列表
    */
    @SerializedName("InstanceList")
    @Expose
    private InstanceInfo [] InstanceList;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取返回的实例个数
     * @return TotalCount 返回的实例个数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置返回的实例个数
     * @param TotalCount 返回的实例个数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取实例详细信息列表
     * @return InstanceList 实例详细信息列表
     */
    public InstanceInfo [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * 设置实例详细信息列表
     * @param InstanceList 实例详细信息列表
     */
    public void setInstanceList(InstanceInfo [] InstanceList) {
        this.InstanceList = InstanceList;
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
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

