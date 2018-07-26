package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Vpc  extends AbstractModel{


    /**
    * Vpc名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC实例ID，例如：vpc-azd4dt1c。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC的cidr，只能为10.0.0.0/16，172.16.0.0/12，192.168.0.0/16这三个内网网段内。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 是否默认VPC。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 是否开启组播。
    */
    @SerializedName("EnableMulticast")
    @Expose
    private Boolean EnableMulticast;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * DNS列表
    */
    @SerializedName("DnsServerSet")
    @Expose
    private String [] DnsServerSet;

    /**
    * DHCP域名选项值
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * DHCP选项集ID
    */
    @SerializedName("DhcpOptionsId")
    @Expose
    private String DhcpOptionsId;

    /**
     * 获取Vpc名称。
     * @return VpcName Vpc名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置Vpc名称。
     * @param VpcName Vpc名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取VPC实例ID，例如：vpc-azd4dt1c。
     * @return VpcId VPC实例ID，例如：vpc-azd4dt1c。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC实例ID，例如：vpc-azd4dt1c。
     * @param VpcId VPC实例ID，例如：vpc-azd4dt1c。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取VPC的cidr，只能为10.0.0.0/16，172.16.0.0/12，192.168.0.0/16这三个内网网段内。
     * @return CidrBlock VPC的cidr，只能为10.0.0.0/16，172.16.0.0/12，192.168.0.0/16这三个内网网段内。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置VPC的cidr，只能为10.0.0.0/16，172.16.0.0/12，192.168.0.0/16这三个内网网段内。
     * @param CidrBlock VPC的cidr，只能为10.0.0.0/16，172.16.0.0/12，192.168.0.0/16这三个内网网段内。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 获取是否默认VPC。
     * @return IsDefault 是否默认VPC。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * 设置是否默认VPC。
     * @param IsDefault 是否默认VPC。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * 获取是否开启组播。
     * @return EnableMulticast 是否开启组播。
     */
    public Boolean getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * 设置是否开启组播。
     * @param EnableMulticast 是否开启组播。
     */
    public void setEnableMulticast(Boolean EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
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
     * 获取DNS列表
     * @return DnsServerSet DNS列表
     */
    public String [] getDnsServerSet() {
        return this.DnsServerSet;
    }

    /**
     * 设置DNS列表
     * @param DnsServerSet DNS列表
     */
    public void setDnsServerSet(String [] DnsServerSet) {
        this.DnsServerSet = DnsServerSet;
    }

    /**
     * 获取DHCP域名选项值
     * @return DomainName DHCP域名选项值
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * 设置DHCP域名选项值
     * @param DomainName DHCP域名选项值
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * 获取DHCP选项集ID
     * @return DhcpOptionsId DHCP选项集ID
     */
    public String getDhcpOptionsId() {
        return this.DhcpOptionsId;
    }

    /**
     * 设置DHCP选项集ID
     * @param DhcpOptionsId DHCP选项集ID
     */
    public void setDhcpOptionsId(String DhcpOptionsId) {
        this.DhcpOptionsId = DhcpOptionsId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "EnableMulticast", this.EnableMulticast);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArraySimple(map, prefix + "DnsServerSet.", this.DnsServerSet);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DhcpOptionsId", this.DhcpOptionsId);

    }
}

