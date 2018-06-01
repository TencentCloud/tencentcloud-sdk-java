package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ResetRoutesRequest  extends AbstractModel{


    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;
    

    /**
    * 路由表名称，最大长度不能超过60个字节。
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;
    

    /**
    * 路由策略。
    */
    @SerializedName("Routes")
    @Expose
    private Route [] Routes;
    

    /**
     * 获取路由表实例ID，例如：rtb-azd4dt1c。
     * @return RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * 设置路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * 获取路由表名称，最大长度不能超过60个字节。
     * @return RouteTableName 路由表名称，最大长度不能超过60个字节。
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * 设置路由表名称，最大长度不能超过60个字节。
     * @param RouteTableName 路由表名称，最大长度不能超过60个字节。
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * 获取路由策略。
     * @return Routes 路由策略。
     */
    public Route [] getRoutes() {
        return this.Routes;
    }

    /**
     * 设置路由策略。
     * @param Routes 路由策略。
     */
    public void setRoutes(Route [] Routes) {
        this.Routes = Routes;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);

    }
}

