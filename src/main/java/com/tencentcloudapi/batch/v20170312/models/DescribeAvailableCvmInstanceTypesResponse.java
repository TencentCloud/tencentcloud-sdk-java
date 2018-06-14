package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeAvailableCvmInstanceTypesResponse  extends AbstractModel{


    /**
    * 机型配置数组
    */
    @SerializedName("InstanceTypeConfigSet")
    @Expose
    private InstanceTypeConfig [] InstanceTypeConfigSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取机型配置数组
     * @return InstanceTypeConfigSet 机型配置数组
     */
    public InstanceTypeConfig [] getInstanceTypeConfigSet() {
        return this.InstanceTypeConfigSet;
    }

    /**
     * 设置机型配置数组
     * @param InstanceTypeConfigSet 机型配置数组
     */
    public void setInstanceTypeConfigSet(InstanceTypeConfig [] InstanceTypeConfigSet) {
        this.InstanceTypeConfigSet = InstanceTypeConfigSet;
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
        this.setParamArrayObj(map, prefix + "InstanceTypeConfigSet.", this.InstanceTypeConfigSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

