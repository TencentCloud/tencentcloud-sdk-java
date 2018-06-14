package com.tencentcloudapi.cis.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeContainerInstancesResponse  extends AbstractModel{


    /**
    * 容器实例列表
    */
    @SerializedName("ContainerInstanceList")
    @Expose
    private ContainerInstance [] ContainerInstanceList;

    /**
    * 容器实例总数
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
     * 获取容器实例列表
     * @return ContainerInstanceList 容器实例列表
     */
    public ContainerInstance [] getContainerInstanceList() {
        return this.ContainerInstanceList;
    }

    /**
     * 设置容器实例列表
     * @param ContainerInstanceList 容器实例列表
     */
    public void setContainerInstanceList(ContainerInstance [] ContainerInstanceList) {
        this.ContainerInstanceList = ContainerInstanceList;
    }

    /**
     * 获取容器实例总数
     * @return TotalCount 容器实例总数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置容器实例总数
     * @param TotalCount 容器实例总数
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
        this.setParamArrayObj(map, prefix + "ContainerInstanceList.", this.ContainerInstanceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

