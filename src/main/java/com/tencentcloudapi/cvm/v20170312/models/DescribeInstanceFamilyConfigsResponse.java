package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeInstanceFamilyConfigsResponse  extends AbstractModel{


    /**
    * 实例机型组配置的列表信息
    */
    @SerializedName("InstanceFamilyConfigSet")
    @Expose
    private InstanceFamilyConfig [] InstanceFamilyConfigSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取实例机型组配置的列表信息
     * @return InstanceFamilyConfigSet 实例机型组配置的列表信息
     */
    public InstanceFamilyConfig [] getInstanceFamilyConfigSet() {
        return this.InstanceFamilyConfigSet;
    }

    /**
     * 设置实例机型组配置的列表信息
     * @param InstanceFamilyConfigSet 实例机型组配置的列表信息
     */
    public void setInstanceFamilyConfigSet(InstanceFamilyConfig [] InstanceFamilyConfigSet) {
        this.InstanceFamilyConfigSet = InstanceFamilyConfigSet;
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
        this.setParamArrayObj(map, prefix + "InstanceFamilyConfigSet.", this.InstanceFamilyConfigSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

