package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeResourceInstancesResponse  extends AbstractModel{


    /**
    * 符合要求的资源数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 符合要求的资源数组
    */
    @SerializedName("ResourceSet")
    @Expose
    private ResourceInfo [] ResourceSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取符合要求的资源数量
     * @return TotalCount 符合要求的资源数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合要求的资源数量
     * @param TotalCount 符合要求的资源数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取符合要求的资源数组
     * @return ResourceSet 符合要求的资源数组
     */
    public ResourceInfo [] getResourceSet() {
        return this.ResourceSet;
    }

    /**
     * 设置符合要求的资源数组
     * @param ResourceSet 符合要求的资源数组
     */
    public void setResourceSet(ResourceInfo [] ResourceSet) {
        this.ResourceSet = ResourceSet;
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
        this.setParamArrayObj(map, prefix + "ResourceSet.", this.ResourceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

