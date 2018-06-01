package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ReplaceRouteTableAssociationRequest  extends AbstractModel{


    /**
    * 子网实例ID，例如：subnet-3x5lf5q0。可通过DescribeSubnets接口查询。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;
    

    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;
    

    /**
     * 获取子网实例ID，例如：subnet-3x5lf5q0。可通过DescribeSubnets接口查询。
     * @return SubnetId 子网实例ID，例如：subnet-3x5lf5q0。可通过DescribeSubnets接口查询。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网实例ID，例如：subnet-3x5lf5q0。可通过DescribeSubnets接口查询。
     * @param SubnetId 子网实例ID，例如：subnet-3x5lf5q0。可通过DescribeSubnets接口查询。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);

    }
}

