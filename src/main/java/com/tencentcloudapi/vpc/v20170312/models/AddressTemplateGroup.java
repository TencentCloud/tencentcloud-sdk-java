package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AddressTemplateGroup  extends AbstractModel{


    /**
    * IP地址模板集合名称。
    */
    @SerializedName("AddressTemplateGroupName")
    @Expose
    private String AddressTemplateGroupName;
    

    /**
    * IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
    */
    @SerializedName("AddressTemplateGroupId")
    @Expose
    private String AddressTemplateGroupId;
    

    /**
    * IP地址模板ID。
    */
    @SerializedName("AddressTemplateIdSet")
    @Expose
    private String [] AddressTemplateIdSet;
    

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;
    

    /**
     * 获取IP地址模板集合名称。
     * @return AddressTemplateGroupName IP地址模板集合名称。
     */
    public String getAddressTemplateGroupName() {
        return this.AddressTemplateGroupName;
    }

    /**
     * 设置IP地址模板集合名称。
     * @param AddressTemplateGroupName IP地址模板集合名称。
     */
    public void setAddressTemplateGroupName(String AddressTemplateGroupName) {
        this.AddressTemplateGroupName = AddressTemplateGroupName;
    }

    /**
     * 获取IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
     * @return AddressTemplateGroupId IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
     */
    public String getAddressTemplateGroupId() {
        return this.AddressTemplateGroupId;
    }

    /**
     * 设置IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
     * @param AddressTemplateGroupId IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
     */
    public void setAddressTemplateGroupId(String AddressTemplateGroupId) {
        this.AddressTemplateGroupId = AddressTemplateGroupId;
    }

    /**
     * 获取IP地址模板ID。
     * @return AddressTemplateIdSet IP地址模板ID。
     */
    public String [] getAddressTemplateIdSet() {
        return this.AddressTemplateIdSet;
    }

    /**
     * 设置IP地址模板ID。
     * @param AddressTemplateIdSet IP地址模板ID。
     */
    public void setAddressTemplateIdSet(String [] AddressTemplateIdSet) {
        this.AddressTemplateIdSet = AddressTemplateIdSet;
    }

    /**
     * 获取创建时间。
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupName", this.AddressTemplateGroupName);
        this.setParamSimple(map, prefix + "AddressTemplateGroupId", this.AddressTemplateGroupId);
        this.setParamArraySimple(map, prefix + "AddressTemplateIdSet.", this.AddressTemplateIdSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

