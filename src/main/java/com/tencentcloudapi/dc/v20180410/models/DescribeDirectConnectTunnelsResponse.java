package com.tencentcloudapi.dc.v20180410.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDirectConnectTunnelsResponse  extends AbstractModel{


    /**
    * 专线通道列表
    */
    @SerializedName("DirectConnectTunnelSet")
    @Expose
    private DirectConnectTunnel [] DirectConnectTunnelSet;

    /**
    * 符合专线通道数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取专线通道列表
     * @return DirectConnectTunnelSet 专线通道列表
     */
    public DirectConnectTunnel [] getDirectConnectTunnelSet() {
        return this.DirectConnectTunnelSet;
    }

    /**
     * 设置专线通道列表
     * @param DirectConnectTunnelSet 专线通道列表
     */
    public void setDirectConnectTunnelSet(DirectConnectTunnel [] DirectConnectTunnelSet) {
        this.DirectConnectTunnelSet = DirectConnectTunnelSet;
    }

    /**
     * 获取符合专线通道数量。
     * @return TotalCount 符合专线通道数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合专线通道数量。
     * @param TotalCount 符合专线通道数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
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
        this.setParamArrayObj(map, prefix + "DirectConnectTunnelSet.", this.DirectConnectTunnelSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

