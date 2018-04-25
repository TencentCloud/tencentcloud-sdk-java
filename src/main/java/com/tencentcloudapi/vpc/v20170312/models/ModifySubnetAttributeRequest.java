package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifySubnetAttributeRequest  extends AbstractModel{


    /**
    * 子网实例ID。形如：subnet-pxir56ns。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;
    

    /**
    * 子网名称，最大长度不能超过60个字节。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;
    

    /**
    * 子网是否开启广播。
    */
    @SerializedName("EnableBroadcast")
    @Expose
    private String EnableBroadcast;
    

    /**
     * 获取子网实例ID。形如：subnet-pxir56ns。
     * @return SubnetId 子网实例ID。形如：subnet-pxir56ns。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网实例ID。形如：subnet-pxir56ns。
     * @param SubnetId 子网实例ID。形如：subnet-pxir56ns。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取子网名称，最大长度不能超过60个字节。
     * @return SubnetName 子网名称，最大长度不能超过60个字节。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * 设置子网名称，最大长度不能超过60个字节。
     * @param SubnetName 子网名称，最大长度不能超过60个字节。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * 获取子网是否开启广播。
     * @return EnableBroadcast 子网是否开启广播。
     */
    public String getEnableBroadcast() {
        return this.EnableBroadcast;
    }

    /**
     * 设置子网是否开启广播。
     * @param EnableBroadcast 子网是否开启广播。
     */
    public void setEnableBroadcast(String EnableBroadcast) {
        this.EnableBroadcast = EnableBroadcast;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "EnableBroadcast", this.EnableBroadcast);

    }
}

