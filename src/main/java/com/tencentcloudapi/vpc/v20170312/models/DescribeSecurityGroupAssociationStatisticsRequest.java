package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeSecurityGroupAssociationStatisticsRequest  extends AbstractModel{


    /**
    * 安全实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;
    

    /**
     * 获取安全实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     * @return SecurityGroupIds 安全实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * 设置安全实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     * @param SecurityGroupIds 安全实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

