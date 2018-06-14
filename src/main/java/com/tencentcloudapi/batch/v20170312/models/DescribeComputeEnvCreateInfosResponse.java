package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeComputeEnvCreateInfosResponse  extends AbstractModel{


    /**
    * 计算环境数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 计算环境创建信息列表
    */
    @SerializedName("ComputeEnvCreateInfoSet")
    @Expose
    private ComputeEnvCreateInfo [] ComputeEnvCreateInfoSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取计算环境数量
     * @return TotalCount 计算环境数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置计算环境数量
     * @param TotalCount 计算环境数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取计算环境创建信息列表
     * @return ComputeEnvCreateInfoSet 计算环境创建信息列表
     */
    public ComputeEnvCreateInfo [] getComputeEnvCreateInfoSet() {
        return this.ComputeEnvCreateInfoSet;
    }

    /**
     * 设置计算环境创建信息列表
     * @param ComputeEnvCreateInfoSet 计算环境创建信息列表
     */
    public void setComputeEnvCreateInfoSet(ComputeEnvCreateInfo [] ComputeEnvCreateInfoSet) {
        this.ComputeEnvCreateInfoSet = ComputeEnvCreateInfoSet;
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
        this.setParamArrayObj(map, prefix + "ComputeEnvCreateInfoSet.", this.ComputeEnvCreateInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

