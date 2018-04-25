package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class MigrateNetworkInterfaceRequest  extends AbstractModel{


    /**
    * 弹性网卡实例ID，例如：eni-m6dyj72l。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;
    

    /**
    * 弹性网卡当前绑定的CVM实例ID。形如：ins-r8hr2upy。
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;
    

    /**
    * 待迁移的目的CVM实例ID。
    */
    @SerializedName("DestinationInstanceId")
    @Expose
    private String DestinationInstanceId;
    

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
     * 获取弹性网卡当前绑定的CVM实例ID。形如：ins-r8hr2upy。
     * @return SourceInstanceId 弹性网卡当前绑定的CVM实例ID。形如：ins-r8hr2upy。
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * 设置弹性网卡当前绑定的CVM实例ID。形如：ins-r8hr2upy。
     * @param SourceInstanceId 弹性网卡当前绑定的CVM实例ID。形如：ins-r8hr2upy。
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    /**
     * 获取待迁移的目的CVM实例ID。
     * @return DestinationInstanceId 待迁移的目的CVM实例ID。
     */
    public String getDestinationInstanceId() {
        return this.DestinationInstanceId;
    }

    /**
     * 设置待迁移的目的CVM实例ID。
     * @param DestinationInstanceId 待迁移的目的CVM实例ID。
     */
    public void setDestinationInstanceId(String DestinationInstanceId) {
        this.DestinationInstanceId = DestinationInstanceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);
        this.setParamSimple(map, prefix + "DestinationInstanceId", this.DestinationInstanceId);

    }
}

