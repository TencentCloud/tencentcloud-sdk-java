package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class MigratePrivateIpAddressRequest  extends AbstractModel{


    /**
    * 当内网IP绑定的弹性网卡实例ID，例如：eni-m6dyj72l。
    */
    @SerializedName("SourceNetworkInterfaceId")
    @Expose
    private String SourceNetworkInterfaceId;
    

    /**
    * 待迁移的目的弹性网卡实例ID。
    */
    @SerializedName("DestinationNetworkInterfaceId")
    @Expose
    private String DestinationNetworkInterfaceId;
    

    /**
    * 迁移的内网IP地址，例如：10.0.0.6。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;
    

    /**
     * 获取当内网IP绑定的弹性网卡实例ID，例如：eni-m6dyj72l。
     * @return SourceNetworkInterfaceId 当内网IP绑定的弹性网卡实例ID，例如：eni-m6dyj72l。
     */
    public String getSourceNetworkInterfaceId() {
        return this.SourceNetworkInterfaceId;
    }

    /**
     * 设置当内网IP绑定的弹性网卡实例ID，例如：eni-m6dyj72l。
     * @param SourceNetworkInterfaceId 当内网IP绑定的弹性网卡实例ID，例如：eni-m6dyj72l。
     */
    public void setSourceNetworkInterfaceId(String SourceNetworkInterfaceId) {
        this.SourceNetworkInterfaceId = SourceNetworkInterfaceId;
    }

    /**
     * 获取待迁移的目的弹性网卡实例ID。
     * @return DestinationNetworkInterfaceId 待迁移的目的弹性网卡实例ID。
     */
    public String getDestinationNetworkInterfaceId() {
        return this.DestinationNetworkInterfaceId;
    }

    /**
     * 设置待迁移的目的弹性网卡实例ID。
     * @param DestinationNetworkInterfaceId 待迁移的目的弹性网卡实例ID。
     */
    public void setDestinationNetworkInterfaceId(String DestinationNetworkInterfaceId) {
        this.DestinationNetworkInterfaceId = DestinationNetworkInterfaceId;
    }

    /**
     * 获取迁移的内网IP地址，例如：10.0.0.6。
     * @return PrivateIpAddress 迁移的内网IP地址，例如：10.0.0.6。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * 设置迁移的内网IP地址，例如：10.0.0.6。
     * @param PrivateIpAddress 迁移的内网IP地址，例如：10.0.0.6。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceNetworkInterfaceId", this.SourceNetworkInterfaceId);
        this.setParamSimple(map, prefix + "DestinationNetworkInterfaceId", this.DestinationNetworkInterfaceId);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);

    }
}

