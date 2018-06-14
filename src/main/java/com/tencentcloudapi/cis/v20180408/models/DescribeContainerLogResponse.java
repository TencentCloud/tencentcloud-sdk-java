package com.tencentcloudapi.cis.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeContainerLogResponse  extends AbstractModel{


    /**
    * 容器日志数组
    */
    @SerializedName("ContainerLogList")
    @Expose
    private ContainerLog [] ContainerLogList;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取容器日志数组
     * @return ContainerLogList 容器日志数组
     */
    public ContainerLog [] getContainerLogList() {
        return this.ContainerLogList;
    }

    /**
     * 设置容器日志数组
     * @param ContainerLogList 容器日志数组
     */
    public void setContainerLogList(ContainerLog [] ContainerLogList) {
        this.ContainerLogList = ContainerLogList;
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
        this.setParamArrayObj(map, prefix + "ContainerLogList.", this.ContainerLogList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

