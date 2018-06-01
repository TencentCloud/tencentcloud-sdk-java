package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DownloadCustomerGatewayConfigurationResponse  extends AbstractModel{


    /**
    * XML格式配置信息。
    */
    @SerializedName("CustomerGatewayConfiguration")
    @Expose
    private String CustomerGatewayConfiguration;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取XML格式配置信息。
     * @return CustomerGatewayConfiguration XML格式配置信息。
     */
    public String getCustomerGatewayConfiguration() {
        return this.CustomerGatewayConfiguration;
    }

    /**
     * 设置XML格式配置信息。
     * @param CustomerGatewayConfiguration XML格式配置信息。
     */
    public void setCustomerGatewayConfiguration(String CustomerGatewayConfiguration) {
        this.CustomerGatewayConfiguration = CustomerGatewayConfiguration;
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
        this.setParamSimple(map, prefix + "CustomerGatewayConfiguration", this.CustomerGatewayConfiguration);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

