package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RouteTableAssociation  extends AbstractModel{


    /**
    * 子网实例ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;
    

    /**
    * 路由表实例ID。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;
    

    /**
     * 获取子网实例ID。
     * @return SubnetId 子网实例ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网实例ID。
     * @param SubnetId 子网实例ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取路由表实例ID。
     * @return RouteTableId 路由表实例ID。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * 设置路由表实例ID。
     * @param RouteTableId 路由表实例ID。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);

    }
}

