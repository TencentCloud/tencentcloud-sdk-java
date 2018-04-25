package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateRouteTableRequest  extends AbstractModel{


    /**
    * 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;
    

    /**
    * 路由表名称，最大长度不能超过60个字节。
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;
    

    /**
     * 获取待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @return VpcId 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @param VpcId 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);

    }
}

