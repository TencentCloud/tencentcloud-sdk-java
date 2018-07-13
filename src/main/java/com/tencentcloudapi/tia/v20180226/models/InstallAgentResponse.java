package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InstallAgentResponse  extends AbstractModel{


    /**
    * Agent版本, 用于私有集群的agent安装
    */
    @SerializedName("TiaVersion")
    @Expose
    private String TiaVersion;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取Agent版本, 用于私有集群的agent安装
     * @return TiaVersion Agent版本, 用于私有集群的agent安装
     */
    public String getTiaVersion() {
        return this.TiaVersion;
    }

    /**
     * 设置Agent版本, 用于私有集群的agent安装
     * @param TiaVersion Agent版本, 用于私有集群的agent安装
     */
    public void setTiaVersion(String TiaVersion) {
        this.TiaVersion = TiaVersion;
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
        this.setParamSimple(map, prefix + "TiaVersion", this.TiaVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

