package com.tencentcloudapi.dc.v20180410.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateDirectConnectTunnelResponse  extends AbstractModel{


    /**
    * 专线通道ID
    */
    @SerializedName("DirectConnectTunnelIdSet")
    @Expose
    private String [] DirectConnectTunnelIdSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取专线通道ID
     * @return DirectConnectTunnelIdSet 专线通道ID
     */
    public String [] getDirectConnectTunnelIdSet() {
        return this.DirectConnectTunnelIdSet;
    }

    /**
     * 设置专线通道ID
     * @param DirectConnectTunnelIdSet 专线通道ID
     */
    public void setDirectConnectTunnelIdSet(String [] DirectConnectTunnelIdSet) {
        this.DirectConnectTunnelIdSet = DirectConnectTunnelIdSet;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DirectConnectTunnelIdSet.", this.DirectConnectTunnelIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

