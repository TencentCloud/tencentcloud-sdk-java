package com.tencentcloudapi.cis.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeContainerInstanceResponse  extends AbstractModel{


    /**
    * 容器实例详细信息
    */
    @SerializedName("ContainerInstance")
    @Expose
    private ContainerInstance ContainerInstance;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取容器实例详细信息
     * @return ContainerInstance 容器实例详细信息
     */
    public ContainerInstance getContainerInstance() {
        return this.ContainerInstance;
    }

    /**
     * 设置容器实例详细信息
     * @param ContainerInstance 容器实例详细信息
     */
    public void setContainerInstance(ContainerInstance ContainerInstance) {
        this.ContainerInstance = ContainerInstance;
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
        this.setParamObj(map, prefix + "ContainerInstance.", this.ContainerInstance);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

