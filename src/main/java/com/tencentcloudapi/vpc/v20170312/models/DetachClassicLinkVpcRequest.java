package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DetachClassicLinkVpcRequest  extends AbstractModel{


    /**
    * VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;
    

    /**
    * CVM实例ID查询。形如：ins-r8hr2upy。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;
    

    /**
     * 获取VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @return VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @param VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取CVM实例ID查询。形如：ins-r8hr2upy。
     * @return InstanceIds CVM实例ID查询。形如：ins-r8hr2upy。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置CVM实例ID查询。形如：ins-r8hr2upy。
     * @param InstanceIds CVM实例ID查询。形如：ins-r8hr2upy。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

