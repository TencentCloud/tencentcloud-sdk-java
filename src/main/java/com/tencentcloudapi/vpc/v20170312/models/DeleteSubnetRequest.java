package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteSubnetRequest  extends AbstractModel{


    /**
    * 子网实例ID。可通过DescribeSubnets接口返回值中的SubnetId获取。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * 获取子网实例ID。可通过DescribeSubnets接口返回值中的SubnetId获取。
     * @return SubnetId 子网实例ID。可通过DescribeSubnets接口返回值中的SubnetId获取。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网实例ID。可通过DescribeSubnets接口返回值中的SubnetId获取。
     * @param SubnetId 子网实例ID。可通过DescribeSubnets接口返回值中的SubnetId获取。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

