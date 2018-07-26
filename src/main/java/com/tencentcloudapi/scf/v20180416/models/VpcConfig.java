package com.tencentcloudapi.scf.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class VpcConfig  extends AbstractModel{


    /**
    * 私有网络 的 id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网的 id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * 获取私有网络 的 id
     * @return VpcId 私有网络 的 id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络 的 id
     * @param VpcId 私有网络 的 id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网的 id
     * @return SubnetId 子网的 id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网的 id
     * @param SubnetId 子网的 id
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

