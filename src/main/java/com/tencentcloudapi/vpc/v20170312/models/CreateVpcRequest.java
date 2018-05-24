package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateVpcRequest  extends AbstractModel{


    /**
    * vpc名称，最大长度不能超过60个字节。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;
    

    /**
    * vpc的cidr，只能为10.0.0.0/16，172.16.0.0/12，192.168.0.0/16这三个内网网段内。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;
    

    /**
    * 是否开启组播。true: 开启, false: 不开启。
    */
    @SerializedName("EnableMulticast")
    @Expose
    private String EnableMulticast;
    

    /**
    * DNS地址，最多支持4个
    */
    @SerializedName("DnsServers")
    @Expose
    private String [] DnsServers;
    

    /**
    * 域名
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;
    

    /**
     * 获取vpc名称，最大长度不能超过60个字节。
     * @return VpcName vpc名称，最大长度不能超过60个字节。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置vpc名称，最大长度不能超过60个字节。
     * @param VpcName vpc名称，最大长度不能超过60个字节。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取vpc的cidr，只能为10.0.0.0/16，172.16.0.0/12，192.168.0.0/16这三个内网网段内。
     * @return CidrBlock vpc的cidr，只能为10.0.0.0/16，172.16.0.0/12，192.168.0.0/16这三个内网网段内。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置vpc的cidr，只能为10.0.0.0/16，172.16.0.0/12，192.168.0.0/16这三个内网网段内。
     * @param CidrBlock vpc的cidr，只能为10.0.0.0/16，172.16.0.0/12，192.168.0.0/16这三个内网网段内。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 获取是否开启组播。true: 开启, false: 不开启。
     * @return EnableMulticast 是否开启组播。true: 开启, false: 不开启。
     */
    public String getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * 设置是否开启组播。true: 开启, false: 不开启。
     * @param EnableMulticast 是否开启组播。true: 开启, false: 不开启。
     */
    public void setEnableMulticast(String EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
    }

    /**
     * 获取DNS地址，最多支持4个
     * @return DnsServers DNS地址，最多支持4个
     */
    public String [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * 设置DNS地址，最多支持4个
     * @param DnsServers DNS地址，最多支持4个
     */
    public void setDnsServers(String [] DnsServers) {
        this.DnsServers = DnsServers;
    }

    /**
     * 获取域名
     * @return DomainName 域名
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * 设置域名
     * @param DomainName 域名
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "EnableMulticast", this.EnableMulticast);
        this.setParamArraySimple(map, prefix + "DnsServers.", this.DnsServers);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);

    }
}

