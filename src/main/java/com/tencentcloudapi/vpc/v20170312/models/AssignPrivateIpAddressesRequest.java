package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AssignPrivateIpAddressesRequest  extends AbstractModel{


    /**
    * 弹性网卡实例ID，例如：eni-m6dyj72l。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;
    

    /**
    * 指定的内网IP信息。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddresses;
    

    /**
    * 新申请的内网IP地址个数。
    */
    @SerializedName("SecondaryPrivateIpAddressCount")
    @Expose
    private Integer SecondaryPrivateIpAddressCount;
    

    /**
     * 获取弹性网卡实例ID，例如：eni-m6dyj72l。
     * @return NetworkInterfaceId 弹性网卡实例ID，例如：eni-m6dyj72l。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * 设置弹性网卡实例ID，例如：eni-m6dyj72l。
     * @param NetworkInterfaceId 弹性网卡实例ID，例如：eni-m6dyj72l。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * 获取指定的内网IP信息。
     * @return PrivateIpAddresses 指定的内网IP信息。
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * 设置指定的内网IP信息。
     * @param PrivateIpAddresses 指定的内网IP信息。
     */
    public void setPrivateIpAddresses(PrivateIpAddressSpecification [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * 获取新申请的内网IP地址个数。
     * @return SecondaryPrivateIpAddressCount 新申请的内网IP地址个数。
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return this.SecondaryPrivateIpAddressCount;
    }

    /**
     * 设置新申请的内网IP地址个数。
     * @param SecondaryPrivateIpAddressCount 新申请的内网IP地址个数。
     */
    public void setSecondaryPrivateIpAddressCount(Integer SecondaryPrivateIpAddressCount) {
        this.SecondaryPrivateIpAddressCount = SecondaryPrivateIpAddressCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArrayObj(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "SecondaryPrivateIpAddressCount", this.SecondaryPrivateIpAddressCount);

    }
}

