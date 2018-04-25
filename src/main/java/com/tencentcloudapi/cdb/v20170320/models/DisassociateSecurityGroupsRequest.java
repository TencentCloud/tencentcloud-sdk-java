package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DisassociateSecurityGroupsRequest  extends AbstractModel{


    /**
    * 安全组Id。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;
    

    /**
    * 实例ID列表，一个或者多个实例Id组成的数组。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;
    

    /**
     * 获取安全组Id。
     * @return SecurityGroupId 安全组Id。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * 设置安全组Id。
     * @param SecurityGroupId 安全组Id。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * 获取实例ID列表，一个或者多个实例Id组成的数组。
     * @return InstanceIds 实例ID列表，一个或者多个实例Id组成的数组。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置实例ID列表，一个或者多个实例Id组成的数组。
     * @param InstanceIds 实例ID列表，一个或者多个实例Id组成的数组。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

