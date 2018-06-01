package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InquiryPriceResetVpnGatewayInternetMaxBandwidthRequest  extends AbstractModel{


    /**
    * VPN网关实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;
    

    /**
    * 公网带宽设置。可选带宽规格：5, 10, 20, 50, 100；单位：Mbps。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Integer InternetMaxBandwidthOut;
    

    /**
     * 获取VPN网关实例ID。
     * @return VpnGatewayId VPN网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * 设置VPN网关实例ID。
     * @param VpnGatewayId VPN网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * 获取公网带宽设置。可选带宽规格：5, 10, 20, 50, 100；单位：Mbps。
     * @return InternetMaxBandwidthOut 公网带宽设置。可选带宽规格：5, 10, 20, 50, 100；单位：Mbps。
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * 设置公网带宽设置。可选带宽规格：5, 10, 20, 50, 100；单位：Mbps。
     * @param InternetMaxBandwidthOut 公网带宽设置。可选带宽规格：5, 10, 20, 50, 100；单位：Mbps。
     */
    public void setInternetMaxBandwidthOut(Integer InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);

    }
}

