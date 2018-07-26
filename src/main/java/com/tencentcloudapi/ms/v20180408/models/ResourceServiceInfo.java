package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ResourceServiceInfo  extends AbstractModel{


    /**
    * 创建时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Integer CreateTime;

    /**
    * 到期时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Integer ExpireTime;

    /**
    * 资源名称，如应用加固，源码混淆
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * 获取创建时间戳
     * @return CreateTime 创建时间戳
     */
    public Integer getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间戳
     * @param CreateTime 创建时间戳
     */
    public void setCreateTime(Integer CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取到期时间戳
     * @return ExpireTime 到期时间戳
     */
    public Integer getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * 设置到期时间戳
     * @param ExpireTime 到期时间戳
     */
    public void setExpireTime(Integer ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * 获取资源名称，如应用加固，源码混淆
     * @return ResourceName 资源名称，如应用加固，源码混淆
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * 设置资源名称，如应用加固，源码混淆
     * @param ResourceName 资源名称，如应用加固，源码混淆
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

