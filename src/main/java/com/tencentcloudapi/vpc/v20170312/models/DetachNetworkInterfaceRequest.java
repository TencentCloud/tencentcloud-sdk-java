package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DetachNetworkInterfaceRequest  extends AbstractModel{


    /**
    * 弹性网卡实例ID，例如：eni-m6dyj72l。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * CVM实例ID。形如：ins-r8hr2upy。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
     * 获取CVM实例ID。形如：ins-r8hr2upy。
     * @return InstanceId CVM实例ID。形如：ins-r8hr2upy。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置CVM实例ID。形如：ins-r8hr2upy。
     * @param InstanceId CVM实例ID。形如：ins-r8hr2upy。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

