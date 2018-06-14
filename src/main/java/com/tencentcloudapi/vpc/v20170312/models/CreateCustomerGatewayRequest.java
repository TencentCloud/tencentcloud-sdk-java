package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateCustomerGatewayRequest  extends AbstractModel{


    /**
    * 对端网关名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("CustomerGatewayName")
    @Expose
    private String CustomerGatewayName;

    /**
    * 对端网关公网IP。
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
     * 获取对端网关名称，可任意命名，但不得超过60个字符。
     * @return CustomerGatewayName 对端网关名称，可任意命名，但不得超过60个字符。
     */
    public String getCustomerGatewayName() {
        return this.CustomerGatewayName;
    }

    /**
     * 设置对端网关名称，可任意命名，但不得超过60个字符。
     * @param CustomerGatewayName 对端网关名称，可任意命名，但不得超过60个字符。
     */
    public void setCustomerGatewayName(String CustomerGatewayName) {
        this.CustomerGatewayName = CustomerGatewayName;
    }

    /**
     * 获取对端网关公网IP。
     * @return IpAddress 对端网关公网IP。
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * 设置对端网关公网IP。
     * @param IpAddress 对端网关公网IP。
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerGatewayName", this.CustomerGatewayName);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);

    }
}

