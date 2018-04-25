package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeSecurityGroupPoliciesRequest  extends AbstractModel{


    /**
    * 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;
    

    /**
     * 获取安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     * @return SecurityGroupId 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * 设置安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     * @param SecurityGroupId 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);

    }
}

