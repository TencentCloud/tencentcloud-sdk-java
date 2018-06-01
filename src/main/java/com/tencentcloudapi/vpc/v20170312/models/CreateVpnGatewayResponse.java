package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateVpnGatewayResponse  extends AbstractModel{


    /**
    * VPN网关对象
    */
    @SerializedName("VpnGateway")
    @Expose
    private VpnGateway VpnGateway;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取VPN网关对象
     * @return VpnGateway VPN网关对象
     */
    public VpnGateway getVpnGateway() {
        return this.VpnGateway;
    }

    /**
     * 设置VPN网关对象
     * @param VpnGateway VPN网关对象
     */
    public void setVpnGateway(VpnGateway VpnGateway) {
        this.VpnGateway = VpnGateway;
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
        this.setParamObj(map, prefix + "VpnGateway.", this.VpnGateway);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

