package com.tencentcloudapi.dc.v20180410.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AcceptDirectConnectTunnelRequest  extends AbstractModel{


    /**
    * 物理专线拥有者接受共享专线通道申请
    */
    @SerializedName("DirectConnectTunnelId")
    @Expose
    private String DirectConnectTunnelId;

    /**
     * 获取物理专线拥有者接受共享专线通道申请
     * @return DirectConnectTunnelId 物理专线拥有者接受共享专线通道申请
     */
    public String getDirectConnectTunnelId() {
        return this.DirectConnectTunnelId;
    }

    /**
     * 设置物理专线拥有者接受共享专线通道申请
     * @param DirectConnectTunnelId 物理专线拥有者接受共享专线通道申请
     */
    public void setDirectConnectTunnelId(String DirectConnectTunnelId) {
        this.DirectConnectTunnelId = DirectConnectTunnelId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectTunnelId", this.DirectConnectTunnelId);

    }
}

