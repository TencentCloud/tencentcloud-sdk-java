package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyVpcAttributeRequest  extends AbstractModel{


    /**
    * VPC实例ID。形如：vpc-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpcIds和Filters。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;
    

    /**
    * 私有网络名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;
    

    /**
    * 是否开启组播。true: 开启, false: 关闭。
    */
    @SerializedName("EnableMulticast")
    @Expose
    private String EnableMulticast;
    

    /**
     * 获取VPC实例ID。形如：vpc-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpcIds和Filters。
     * @return VpcId VPC实例ID。形如：vpc-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpcIds和Filters。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC实例ID。形如：vpc-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpcIds和Filters。
     * @param VpcId VPC实例ID。形如：vpc-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpcIds和Filters。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取私有网络名称，可任意命名，但不得超过60个字符。
     * @return VpcName 私有网络名称，可任意命名，但不得超过60个字符。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置私有网络名称，可任意命名，但不得超过60个字符。
     * @param VpcName 私有网络名称，可任意命名，但不得超过60个字符。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取是否开启组播。true: 开启, false: 关闭。
     * @return EnableMulticast 是否开启组播。true: 开启, false: 关闭。
     */
    public String getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * 设置是否开启组播。true: 开启, false: 关闭。
     * @param EnableMulticast 是否开启组播。true: 开启, false: 关闭。
     */
    public void setEnableMulticast(String EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "EnableMulticast", this.EnableMulticast);

    }
}

