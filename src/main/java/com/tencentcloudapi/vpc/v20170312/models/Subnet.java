package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Subnet  extends AbstractModel{


    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;
    

    /**
    * 子网实例ID，例如：subnet-bthucmmy。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;
    

    /**
    * 子网名称。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;
    

    /**
    * 子网的CIDR。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;
    

    /**
    * 是否默认子网。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;
    

    /**
    * 是否开启广播。
    */
    @SerializedName("EnableBroadcast")
    @Expose
    private Boolean EnableBroadcast;
    

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;
    

    /**
    * 路由表实例ID，例如：rtb-l2h8d7c2。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;
    

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;
    

    /**
    * 可用IP数。
    */
    @SerializedName("AvailableIpAddressCount")
    @Expose
    private Integer AvailableIpAddressCount;
    

    /**
     * 获取VPC实例ID。
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网实例ID，例如：subnet-bthucmmy。
     * @return SubnetId 子网实例ID，例如：subnet-bthucmmy。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网实例ID，例如：subnet-bthucmmy。
     * @param SubnetId 子网实例ID，例如：subnet-bthucmmy。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取子网名称。
     * @return SubnetName 子网名称。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * 设置子网名称。
     * @param SubnetName 子网名称。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * 获取子网的CIDR。
     * @return CidrBlock 子网的CIDR。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置子网的CIDR。
     * @param CidrBlock 子网的CIDR。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 获取是否默认子网。
     * @return IsDefault 是否默认子网。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * 设置是否默认子网。
     * @param IsDefault 是否默认子网。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * 获取是否开启广播。
     * @return EnableBroadcast 是否开启广播。
     */
    public Boolean getEnableBroadcast() {
        return this.EnableBroadcast;
    }

    /**
     * 设置是否开启广播。
     * @param EnableBroadcast 是否开启广播。
     */
    public void setEnableBroadcast(Boolean EnableBroadcast) {
        this.EnableBroadcast = EnableBroadcast;
    }

    /**
     * 获取可用区。
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取路由表实例ID，例如：rtb-l2h8d7c2。
     * @return RouteTableId 路由表实例ID，例如：rtb-l2h8d7c2。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * 设置路由表实例ID，例如：rtb-l2h8d7c2。
     * @param RouteTableId 路由表实例ID，例如：rtb-l2h8d7c2。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * 获取创建时间。
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取可用IP数。
     * @return AvailableIpAddressCount 可用IP数。
     */
    public Integer getAvailableIpAddressCount() {
        return this.AvailableIpAddressCount;
    }

    /**
     * 设置可用IP数。
     * @param AvailableIpAddressCount 可用IP数。
     */
    public void setAvailableIpAddressCount(Integer AvailableIpAddressCount) {
        this.AvailableIpAddressCount = AvailableIpAddressCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "EnableBroadcast", this.EnableBroadcast);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "AvailableIpAddressCount", this.AvailableIpAddressCount);

    }
}

