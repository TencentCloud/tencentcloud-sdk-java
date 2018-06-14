package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DefaultVpcSubnet  extends AbstractModel{


    /**
    * 默认VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 默认SubnetId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * 获取默认VpcId
     * @return VpcId 默认VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置默认VpcId
     * @param VpcId 默认VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取默认SubnetId
     * @return SubnetId 默认SubnetId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置默认SubnetId
     * @param SubnetId 默认SubnetId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

