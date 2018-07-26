package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeShieldPlanInstanceResponse  extends AbstractModel{


    /**
    * 绑定资源信息
    */
    @SerializedName("BindInfo")
    @Expose
    private BindInfo BindInfo;

    /**
    * 加固策略信息
    */
    @SerializedName("ShieldPlanInfo")
    @Expose
    private ShieldPlanInfo ShieldPlanInfo;

    /**
    * 加固资源信息
    */
    @SerializedName("ResourceServiceInfo")
    @Expose
    private ResourceServiceInfo ResourceServiceInfo;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取绑定资源信息
     * @return BindInfo 绑定资源信息
     */
    public BindInfo getBindInfo() {
        return this.BindInfo;
    }

    /**
     * 设置绑定资源信息
     * @param BindInfo 绑定资源信息
     */
    public void setBindInfo(BindInfo BindInfo) {
        this.BindInfo = BindInfo;
    }

    /**
     * 获取加固策略信息
     * @return ShieldPlanInfo 加固策略信息
     */
    public ShieldPlanInfo getShieldPlanInfo() {
        return this.ShieldPlanInfo;
    }

    /**
     * 设置加固策略信息
     * @param ShieldPlanInfo 加固策略信息
     */
    public void setShieldPlanInfo(ShieldPlanInfo ShieldPlanInfo) {
        this.ShieldPlanInfo = ShieldPlanInfo;
    }

    /**
     * 获取加固资源信息
     * @return ResourceServiceInfo 加固资源信息
     */
    public ResourceServiceInfo getResourceServiceInfo() {
        return this.ResourceServiceInfo;
    }

    /**
     * 设置加固资源信息
     * @param ResourceServiceInfo 加固资源信息
     */
    public void setResourceServiceInfo(ResourceServiceInfo ResourceServiceInfo) {
        this.ResourceServiceInfo = ResourceServiceInfo;
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
        this.setParamObj(map, prefix + "BindInfo.", this.BindInfo);
        this.setParamObj(map, prefix + "ShieldPlanInfo.", this.ShieldPlanInfo);
        this.setParamObj(map, prefix + "ResourceServiceInfo.", this.ResourceServiceInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

