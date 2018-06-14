package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeVpnGatewaysRequest  extends AbstractModel{


    /**
    * VPN网关实例ID。形如：vpngw-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpnGatewayIds和Filters。
    */
    @SerializedName("VpnGatewayIds")
    @Expose
    private String [] VpnGatewayIds;

    /**
    * 过滤器对象属性
    */
    @SerializedName("Filters")
    @Expose
    private FilterObject [] Filters;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 请求对象个数
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取VPN网关实例ID。形如：vpngw-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpnGatewayIds和Filters。
     * @return VpnGatewayIds VPN网关实例ID。形如：vpngw-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpnGatewayIds和Filters。
     */
    public String [] getVpnGatewayIds() {
        return this.VpnGatewayIds;
    }

    /**
     * 设置VPN网关实例ID。形如：vpngw-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpnGatewayIds和Filters。
     * @param VpnGatewayIds VPN网关实例ID。形如：vpngw-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpnGatewayIds和Filters。
     */
    public void setVpnGatewayIds(String [] VpnGatewayIds) {
        this.VpnGatewayIds = VpnGatewayIds;
    }

    /**
     * 获取过滤器对象属性
     * @return Filters 过滤器对象属性
     */
    public FilterObject [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤器对象属性
     * @param Filters 过滤器对象属性
     */
    public void setFilters(FilterObject [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取请求对象个数
     * @return Limit 请求对象个数
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置请求对象个数
     * @param Limit 请求对象个数
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpnGatewayIds.", this.VpnGatewayIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

