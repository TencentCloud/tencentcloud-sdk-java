package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateCustomerGatewayResponse  extends AbstractModel{


    /**
    * 对端网关对象
    */
    @SerializedName("CustomerGateway")
    @Expose
    private CustomerGateway CustomerGateway;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取对端网关对象
     * @return CustomerGateway 对端网关对象
     */
    public CustomerGateway getCustomerGateway() {
        return this.CustomerGateway;
    }

    /**
     * 设置对端网关对象
     * @param CustomerGateway 对端网关对象
     */
    public void setCustomerGateway(CustomerGateway CustomerGateway) {
        this.CustomerGateway = CustomerGateway;
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
        this.setParamObj(map, prefix + "CustomerGateway.", this.CustomerGateway);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

