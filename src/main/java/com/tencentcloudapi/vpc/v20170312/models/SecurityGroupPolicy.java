package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SecurityGroupPolicy  extends AbstractModel{


    /**
    * 安全组规则索引号。
    */
    @SerializedName("PolicyIndex")
    @Expose
    private Integer PolicyIndex;

    /**
    * 协议, 取值: TCP,UDP, ICMP。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口(all, 离散port,  range)。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
    */
    @SerializedName("ServiceTemplate")
    @Expose
    private String [] ServiceTemplate;

    /**
    * 网段或IP(互斥)。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 已绑定安全组的网段或IP。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * IP地址ID或者ID地址组ID。
    */
    @SerializedName("AddressTemplate")
    @Expose
    private String AddressTemplate;

    /**
    * ACCEPT 或 DROP。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 安全组规则描述。
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
     * 获取安全组规则索引号。
     * @return PolicyIndex 安全组规则索引号。
     */
    public Integer getPolicyIndex() {
        return this.PolicyIndex;
    }

    /**
     * 设置安全组规则索引号。
     * @param PolicyIndex 安全组规则索引号。
     */
    public void setPolicyIndex(Integer PolicyIndex) {
        this.PolicyIndex = PolicyIndex;
    }

    /**
     * 获取协议, 取值: TCP,UDP, ICMP。
     * @return Protocol 协议, 取值: TCP,UDP, ICMP。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置协议, 取值: TCP,UDP, ICMP。
     * @param Protocol 协议, 取值: TCP,UDP, ICMP。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取端口(all, 离散port,  range)。
     * @return Port 端口(all, 离散port,  range)。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * 设置端口(all, 离散port,  range)。
     * @param Port 端口(all, 离散port,  range)。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * 获取协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     * @return ServiceTemplate 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     */
    public String [] getServiceTemplate() {
        return this.ServiceTemplate;
    }

    /**
     * 设置协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     * @param ServiceTemplate 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     */
    public void setServiceTemplate(String [] ServiceTemplate) {
        this.ServiceTemplate = ServiceTemplate;
    }

    /**
     * 获取网段或IP(互斥)。
     * @return CidrBlock 网段或IP(互斥)。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置网段或IP(互斥)。
     * @param CidrBlock 网段或IP(互斥)。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 获取已绑定安全组的网段或IP。
     * @return SecurityGroupId 已绑定安全组的网段或IP。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * 设置已绑定安全组的网段或IP。
     * @param SecurityGroupId 已绑定安全组的网段或IP。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * 获取IP地址ID或者ID地址组ID。
     * @return AddressTemplate IP地址ID或者ID地址组ID。
     */
    public String getAddressTemplate() {
        return this.AddressTemplate;
    }

    /**
     * 设置IP地址ID或者ID地址组ID。
     * @param AddressTemplate IP地址ID或者ID地址组ID。
     */
    public void setAddressTemplate(String AddressTemplate) {
        this.AddressTemplate = AddressTemplate;
    }

    /**
     * 获取ACCEPT 或 DROP。
     * @return Action ACCEPT 或 DROP。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * 设置ACCEPT 或 DROP。
     * @param Action ACCEPT 或 DROP。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * 获取安全组规则描述。
     * @return PolicyDescription 安全组规则描述。
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * 设置安全组规则描述。
     * @param PolicyDescription 安全组规则描述。
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyIndex", this.PolicyIndex);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArraySimple(map, prefix + "ServiceTemplate.", this.ServiceTemplate);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "AddressTemplate", this.AddressTemplate);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);

    }
}

