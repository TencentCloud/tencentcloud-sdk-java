package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateVpnConnectionResponse  extends AbstractModel{


    /**
    * 通道实例对象。
    */
    @SerializedName("VpnConnection")
    @Expose
    private VpnConnection VpnConnection;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取通道实例对象。
     * @return VpnConnection 通道实例对象。
     */
    public VpnConnection getVpnConnection() {
        return this.VpnConnection;
    }

    /**
     * 设置通道实例对象。
     * @param VpnConnection 通道实例对象。
     */
    public void setVpnConnection(VpnConnection VpnConnection) {
        this.VpnConnection = VpnConnection;
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
        this.setParamObj(map, prefix + "VpnConnection.", this.VpnConnection);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

