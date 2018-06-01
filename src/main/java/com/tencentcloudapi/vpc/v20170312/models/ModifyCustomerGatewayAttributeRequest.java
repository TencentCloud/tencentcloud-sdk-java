package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyCustomerGatewayAttributeRequest  extends AbstractModel{


    /**
    * 对端网关ID，例如：cgw-2wqq41m9，可通过DescribeCustomerGateways接口查询对端网关。
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;
    

    /**
    * 对端网关名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("CustomerGatewayName")
    @Expose
    private String CustomerGatewayName;
    

    /**
     * 获取对端网关ID，例如：cgw-2wqq41m9，可通过DescribeCustomerGateways接口查询对端网关。
     * @return CustomerGatewayId 对端网关ID，例如：cgw-2wqq41m9，可通过DescribeCustomerGateways接口查询对端网关。
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * 设置对端网关ID，例如：cgw-2wqq41m9，可通过DescribeCustomerGateways接口查询对端网关。
     * @param CustomerGatewayId 对端网关ID，例如：cgw-2wqq41m9，可通过DescribeCustomerGateways接口查询对端网关。
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);
        this.setParamSimple(map, prefix + "CustomerGatewayName", this.CustomerGatewayName);

    }
}

