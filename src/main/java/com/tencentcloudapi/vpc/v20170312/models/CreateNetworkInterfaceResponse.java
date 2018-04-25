package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateNetworkInterfaceResponse  extends AbstractModel{


    /**
    * 弹性网卡实例。
    */
    @SerializedName("NetworkInterface")
    @Expose
    private NetworkInterface NetworkInterface;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取弹性网卡实例。
     * @return NetworkInterface 弹性网卡实例。
     */
    public NetworkInterface getNetworkInterface() {
        return this.NetworkInterface;
    }

    /**
     * 设置弹性网卡实例。
     * @param NetworkInterface 弹性网卡实例。
     */
    public void setNetworkInterface(NetworkInterface NetworkInterface) {
        this.NetworkInterface = NetworkInterface;
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
        this.setParamObj(map, prefix + "NetworkInterface.", this.NetworkInterface);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

