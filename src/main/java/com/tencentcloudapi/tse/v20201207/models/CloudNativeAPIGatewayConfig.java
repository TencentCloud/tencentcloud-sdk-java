/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayConfig extends AbstractModel {

    /**
    * 控制台类型。
    */
    @SerializedName("ConsoleType")
    @Expose
    private String ConsoleType;

    /**
    * HTTP链接地址。
    */
    @SerializedName("HttpUrl")
    @Expose
    private String HttpUrl;

    /**
    * HTTPS链接地址。
    */
    @SerializedName("HttpsUrl")
    @Expose
    private String HttpsUrl;

    /**
    * 网络类型, Open|Internal。
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 管理员用户名。
    */
    @SerializedName("AdminUser")
    @Expose
    private String AdminUser;

    /**
    * 管理员密码。
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * 网络状态, Open|Closed|Updating
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 网络访问策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessControl")
    @Expose
    private NetworkAccessControl AccessControl;

    /**
    * 内网子网 ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 内网VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 负载均衡的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 负载均衡的规格类型
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * clb规格名称
    */
    @SerializedName("SlaName")
    @Expose
    private String SlaName;

    /**
    * clb vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 带宽
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 是否多可用区
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * 主可用区
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * 备可用区
    */
    @SerializedName("SlaveZoneId")
    @Expose
    private String SlaveZoneId;

    /**
    * 主可用区名称
    */
    @SerializedName("MasterZoneName")
    @Expose
    private String MasterZoneName;

    /**
    * 备可用区名称
    */
    @SerializedName("SlaveZoneName")
    @Expose
    private String SlaveZoneName;

    /**
    * 网络 id
    */
    @SerializedName("NetworkId")
    @Expose
    private String NetworkId;

    /**
    * 是否为新 ipv6 CLB
    */
    @SerializedName("IPV6FullChain")
    @Expose
    private Boolean IPV6FullChain;

    /**
    * 负载均衡个性化配置内容
    */
    @SerializedName("CustomizedConfigContent")
    @Expose
    private String CustomizedConfigContent;

    /**
     * Get 控制台类型。 
     * @return ConsoleType 控制台类型。
     */
    public String getConsoleType() {
        return this.ConsoleType;
    }

    /**
     * Set 控制台类型。
     * @param ConsoleType 控制台类型。
     */
    public void setConsoleType(String ConsoleType) {
        this.ConsoleType = ConsoleType;
    }

    /**
     * Get HTTP链接地址。 
     * @return HttpUrl HTTP链接地址。
     */
    public String getHttpUrl() {
        return this.HttpUrl;
    }

    /**
     * Set HTTP链接地址。
     * @param HttpUrl HTTP链接地址。
     */
    public void setHttpUrl(String HttpUrl) {
        this.HttpUrl = HttpUrl;
    }

    /**
     * Get HTTPS链接地址。 
     * @return HttpsUrl HTTPS链接地址。
     */
    public String getHttpsUrl() {
        return this.HttpsUrl;
    }

    /**
     * Set HTTPS链接地址。
     * @param HttpsUrl HTTPS链接地址。
     */
    public void setHttpsUrl(String HttpsUrl) {
        this.HttpsUrl = HttpsUrl;
    }

    /**
     * Get 网络类型, Open|Internal。 
     * @return NetType 网络类型, Open|Internal。
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型, Open|Internal。
     * @param NetType 网络类型, Open|Internal。
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 管理员用户名。 
     * @return AdminUser 管理员用户名。
     */
    public String getAdminUser() {
        return this.AdminUser;
    }

    /**
     * Set 管理员用户名。
     * @param AdminUser 管理员用户名。
     */
    public void setAdminUser(String AdminUser) {
        this.AdminUser = AdminUser;
    }

    /**
     * Get 管理员密码。 
     * @return AdminPassword 管理员密码。
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set 管理员密码。
     * @param AdminPassword 管理员密码。
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get 网络状态, Open|Closed|Updating 
     * @return Status 网络状态, Open|Closed|Updating
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 网络状态, Open|Closed|Updating
     * @param Status 网络状态, Open|Closed|Updating
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 网络访问策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessControl 网络访问策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkAccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set 网络访问策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessControl 网络访问策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessControl(NetworkAccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get 内网子网 ID 
     * @return SubnetId 内网子网 ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 内网子网 ID
     * @param SubnetId 内网子网 ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 内网VPC ID 
     * @return VpcId 内网VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 内网VPC ID
     * @param VpcId 内网VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 负载均衡的描述 
     * @return Description 负载均衡的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 负载均衡的描述
     * @param Description 负载均衡的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 负载均衡的规格类型 
     * @return SlaType 负载均衡的规格类型
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set 负载均衡的规格类型
     * @param SlaType 负载均衡的规格类型
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get clb规格名称 
     * @return SlaName clb规格名称
     */
    public String getSlaName() {
        return this.SlaName;
    }

    /**
     * Set clb规格名称
     * @param SlaName clb规格名称
     */
    public void setSlaName(String SlaName) {
        this.SlaName = SlaName;
    }

    /**
     * Get clb vip 
     * @return Vip clb vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set clb vip
     * @param Vip clb vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 带宽 
     * @return InternetMaxBandwidthOut 带宽
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 带宽
     * @param InternetMaxBandwidthOut 带宽
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 是否多可用区 
     * @return MultiZoneFlag 是否多可用区
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set 是否多可用区
     * @param MultiZoneFlag 是否多可用区
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get 主可用区 
     * @return MasterZoneId 主可用区
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set 主可用区
     * @param MasterZoneId 主可用区
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get 备可用区 
     * @return SlaveZoneId 备可用区
     */
    public String getSlaveZoneId() {
        return this.SlaveZoneId;
    }

    /**
     * Set 备可用区
     * @param SlaveZoneId 备可用区
     */
    public void setSlaveZoneId(String SlaveZoneId) {
        this.SlaveZoneId = SlaveZoneId;
    }

    /**
     * Get 主可用区名称 
     * @return MasterZoneName 主可用区名称
     */
    public String getMasterZoneName() {
        return this.MasterZoneName;
    }

    /**
     * Set 主可用区名称
     * @param MasterZoneName 主可用区名称
     */
    public void setMasterZoneName(String MasterZoneName) {
        this.MasterZoneName = MasterZoneName;
    }

    /**
     * Get 备可用区名称 
     * @return SlaveZoneName 备可用区名称
     */
    public String getSlaveZoneName() {
        return this.SlaveZoneName;
    }

    /**
     * Set 备可用区名称
     * @param SlaveZoneName 备可用区名称
     */
    public void setSlaveZoneName(String SlaveZoneName) {
        this.SlaveZoneName = SlaveZoneName;
    }

    /**
     * Get 网络 id 
     * @return NetworkId 网络 id
     */
    public String getNetworkId() {
        return this.NetworkId;
    }

    /**
     * Set 网络 id
     * @param NetworkId 网络 id
     */
    public void setNetworkId(String NetworkId) {
        this.NetworkId = NetworkId;
    }

    /**
     * Get 是否为新 ipv6 CLB 
     * @return IPV6FullChain 是否为新 ipv6 CLB
     */
    public Boolean getIPV6FullChain() {
        return this.IPV6FullChain;
    }

    /**
     * Set 是否为新 ipv6 CLB
     * @param IPV6FullChain 是否为新 ipv6 CLB
     */
    public void setIPV6FullChain(Boolean IPV6FullChain) {
        this.IPV6FullChain = IPV6FullChain;
    }

    /**
     * Get 负载均衡个性化配置内容 
     * @return CustomizedConfigContent 负载均衡个性化配置内容
     */
    public String getCustomizedConfigContent() {
        return this.CustomizedConfigContent;
    }

    /**
     * Set 负载均衡个性化配置内容
     * @param CustomizedConfigContent 负载均衡个性化配置内容
     */
    public void setCustomizedConfigContent(String CustomizedConfigContent) {
        this.CustomizedConfigContent = CustomizedConfigContent;
    }

    public CloudNativeAPIGatewayConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayConfig(CloudNativeAPIGatewayConfig source) {
        if (source.ConsoleType != null) {
            this.ConsoleType = new String(source.ConsoleType);
        }
        if (source.HttpUrl != null) {
            this.HttpUrl = new String(source.HttpUrl);
        }
        if (source.HttpsUrl != null) {
            this.HttpsUrl = new String(source.HttpsUrl);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.AdminUser != null) {
            this.AdminUser = new String(source.AdminUser);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AccessControl != null) {
            this.AccessControl = new NetworkAccessControl(source.AccessControl);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.SlaName != null) {
            this.SlaName = new String(source.SlaName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.MultiZoneFlag != null) {
            this.MultiZoneFlag = new Boolean(source.MultiZoneFlag);
        }
        if (source.MasterZoneId != null) {
            this.MasterZoneId = new String(source.MasterZoneId);
        }
        if (source.SlaveZoneId != null) {
            this.SlaveZoneId = new String(source.SlaveZoneId);
        }
        if (source.MasterZoneName != null) {
            this.MasterZoneName = new String(source.MasterZoneName);
        }
        if (source.SlaveZoneName != null) {
            this.SlaveZoneName = new String(source.SlaveZoneName);
        }
        if (source.NetworkId != null) {
            this.NetworkId = new String(source.NetworkId);
        }
        if (source.IPV6FullChain != null) {
            this.IPV6FullChain = new Boolean(source.IPV6FullChain);
        }
        if (source.CustomizedConfigContent != null) {
            this.CustomizedConfigContent = new String(source.CustomizedConfigContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsoleType", this.ConsoleType);
        this.setParamSimple(map, prefix + "HttpUrl", this.HttpUrl);
        this.setParamSimple(map, prefix + "HttpsUrl", this.HttpsUrl);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "AdminUser", this.AdminUser);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "SlaName", this.SlaName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "MultiZoneFlag", this.MultiZoneFlag);
        this.setParamSimple(map, prefix + "MasterZoneId", this.MasterZoneId);
        this.setParamSimple(map, prefix + "SlaveZoneId", this.SlaveZoneId);
        this.setParamSimple(map, prefix + "MasterZoneName", this.MasterZoneName);
        this.setParamSimple(map, prefix + "SlaveZoneName", this.SlaveZoneName);
        this.setParamSimple(map, prefix + "NetworkId", this.NetworkId);
        this.setParamSimple(map, prefix + "IPV6FullChain", this.IPV6FullChain);
        this.setParamSimple(map, prefix + "CustomizedConfigContent", this.CustomizedConfigContent);

    }
}

