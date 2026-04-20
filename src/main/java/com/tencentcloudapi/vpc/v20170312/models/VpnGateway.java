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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpnGateway extends AbstractModel {

    /**
    * <p>网关实例ID。</p>
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * <p>VPC实例ID。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>网关实例名称。</p>
    */
    @SerializedName("VpnGatewayName")
    @Expose
    private String VpnGatewayName;

    /**
    * <p>网关实例类型</p><p>枚举值：</p><ul><li>IPSEC： IPSEC VPC类型VPN</li><li>SSL： SSL VPC类型VPN</li><li>CCN： IPSEC CCN类型VPN</li><li>SSL_CCN： SSL CCN类型VPN</li></ul><p>默认值：IPSEC</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>网关实例状态。</p><p>枚举值：</p><ul><li>PENDING： 生产中</li><li>PENDING_ERROR： 生产失败</li><li>DELETING： 删除中</li><li>DELETING_ERROR： 生产失败</li><li>AVAILABLE： 运行中</li></ul>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>网关公网IP。</p>
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * <p>网关续费类型：&#39;NOTIFY_AND_MANUAL_RENEW&#39;：手动续费，&#39;NOTIFY_AND_AUTO_RENEW&#39;：自动续费，&#39;NOT_NOTIFY_AND_NOT_RENEW&#39;：到期不续费。</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>网关付费类型：POSTPAID_BY_HOUR：按量计费，PREPAID：包年包月预付费。</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>网关出带宽</p><p>单位：Mbps</p>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>预付费网关过期时间。</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>公网IP是否被封堵。</p>
    */
    @SerializedName("IsAddressBlocked")
    @Expose
    private Boolean IsAddressBlocked;

    /**
    * <p>计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。</p>
    */
    @SerializedName("NewPurchasePlan")
    @Expose
    private String NewPurchasePlan;

    /**
    * <p>网关计费状态，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。</p>
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * <p>可用区，如：ap-guangzhou-2。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>网关带宽配额信息。</p>
    */
    @SerializedName("VpnGatewayQuotaSet")
    @Expose
    private VpnGatewayQuota [] VpnGatewayQuotaSet;

    /**
    * <p>网关实例版本信息。</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Type值为CCN/SSL_CCN时，该值表示云联网实例ID。</p>
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * <p>CDC 实例ID。</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>SSL-VPN 客户端连接数。</p>
    */
    @SerializedName("MaxConnection")
    @Expose
    private Long MaxConnection;

    /**
    * <p>Bgp ASN</p>
    */
    @SerializedName("BgpAsn")
    @Expose
    private Long BgpAsn;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get <p>网关实例ID。</p> 
     * @return VpnGatewayId <p>网关实例ID。</p>
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set <p>网关实例ID。</p>
     * @param VpnGatewayId <p>网关实例ID。</p>
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get <p>VPC实例ID。</p> 
     * @return VpcId <p>VPC实例ID。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC实例ID。</p>
     * @param VpcId <p>VPC实例ID。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>网关实例名称。</p> 
     * @return VpnGatewayName <p>网关实例名称。</p>
     */
    public String getVpnGatewayName() {
        return this.VpnGatewayName;
    }

    /**
     * Set <p>网关实例名称。</p>
     * @param VpnGatewayName <p>网关实例名称。</p>
     */
    public void setVpnGatewayName(String VpnGatewayName) {
        this.VpnGatewayName = VpnGatewayName;
    }

    /**
     * Get <p>网关实例类型</p><p>枚举值：</p><ul><li>IPSEC： IPSEC VPC类型VPN</li><li>SSL： SSL VPC类型VPN</li><li>CCN： IPSEC CCN类型VPN</li><li>SSL_CCN： SSL CCN类型VPN</li></ul><p>默认值：IPSEC</p> 
     * @return Type <p>网关实例类型</p><p>枚举值：</p><ul><li>IPSEC： IPSEC VPC类型VPN</li><li>SSL： SSL VPC类型VPN</li><li>CCN： IPSEC CCN类型VPN</li><li>SSL_CCN： SSL CCN类型VPN</li></ul><p>默认值：IPSEC</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>网关实例类型</p><p>枚举值：</p><ul><li>IPSEC： IPSEC VPC类型VPN</li><li>SSL： SSL VPC类型VPN</li><li>CCN： IPSEC CCN类型VPN</li><li>SSL_CCN： SSL CCN类型VPN</li></ul><p>默认值：IPSEC</p>
     * @param Type <p>网关实例类型</p><p>枚举值：</p><ul><li>IPSEC： IPSEC VPC类型VPN</li><li>SSL： SSL VPC类型VPN</li><li>CCN： IPSEC CCN类型VPN</li><li>SSL_CCN： SSL CCN类型VPN</li></ul><p>默认值：IPSEC</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>网关实例状态。</p><p>枚举值：</p><ul><li>PENDING： 生产中</li><li>PENDING_ERROR： 生产失败</li><li>DELETING： 删除中</li><li>DELETING_ERROR： 生产失败</li><li>AVAILABLE： 运行中</li></ul> 
     * @return State <p>网关实例状态。</p><p>枚举值：</p><ul><li>PENDING： 生产中</li><li>PENDING_ERROR： 生产失败</li><li>DELETING： 删除中</li><li>DELETING_ERROR： 生产失败</li><li>AVAILABLE： 运行中</li></ul>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>网关实例状态。</p><p>枚举值：</p><ul><li>PENDING： 生产中</li><li>PENDING_ERROR： 生产失败</li><li>DELETING： 删除中</li><li>DELETING_ERROR： 生产失败</li><li>AVAILABLE： 运行中</li></ul>
     * @param State <p>网关实例状态。</p><p>枚举值：</p><ul><li>PENDING： 生产中</li><li>PENDING_ERROR： 生产失败</li><li>DELETING： 删除中</li><li>DELETING_ERROR： 生产失败</li><li>AVAILABLE： 运行中</li></ul>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>网关公网IP。</p> 
     * @return PublicIpAddress <p>网关公网IP。</p>
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set <p>网关公网IP。</p>
     * @param PublicIpAddress <p>网关公网IP。</p>
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get <p>网关续费类型：&#39;NOTIFY_AND_MANUAL_RENEW&#39;：手动续费，&#39;NOTIFY_AND_AUTO_RENEW&#39;：自动续费，&#39;NOT_NOTIFY_AND_NOT_RENEW&#39;：到期不续费。</p> 
     * @return RenewFlag <p>网关续费类型：&#39;NOTIFY_AND_MANUAL_RENEW&#39;：手动续费，&#39;NOTIFY_AND_AUTO_RENEW&#39;：自动续费，&#39;NOT_NOTIFY_AND_NOT_RENEW&#39;：到期不续费。</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>网关续费类型：&#39;NOTIFY_AND_MANUAL_RENEW&#39;：手动续费，&#39;NOTIFY_AND_AUTO_RENEW&#39;：自动续费，&#39;NOT_NOTIFY_AND_NOT_RENEW&#39;：到期不续费。</p>
     * @param RenewFlag <p>网关续费类型：&#39;NOTIFY_AND_MANUAL_RENEW&#39;：手动续费，&#39;NOTIFY_AND_AUTO_RENEW&#39;：自动续费，&#39;NOT_NOTIFY_AND_NOT_RENEW&#39;：到期不续费。</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>网关付费类型：POSTPAID_BY_HOUR：按量计费，PREPAID：包年包月预付费。</p> 
     * @return InstanceChargeType <p>网关付费类型：POSTPAID_BY_HOUR：按量计费，PREPAID：包年包月预付费。</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>网关付费类型：POSTPAID_BY_HOUR：按量计费，PREPAID：包年包月预付费。</p>
     * @param InstanceChargeType <p>网关付费类型：POSTPAID_BY_HOUR：按量计费，PREPAID：包年包月预付费。</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>网关出带宽</p><p>单位：Mbps</p> 
     * @return InternetMaxBandwidthOut <p>网关出带宽</p><p>单位：Mbps</p>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set <p>网关出带宽</p><p>单位：Mbps</p>
     * @param InternetMaxBandwidthOut <p>网关出带宽</p><p>单位：Mbps</p>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedTime <p>创建时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedTime <p>创建时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>预付费网关过期时间。</p> 
     * @return ExpiredTime <p>预付费网关过期时间。</p>
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>预付费网关过期时间。</p>
     * @param ExpiredTime <p>预付费网关过期时间。</p>
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>公网IP是否被封堵。</p> 
     * @return IsAddressBlocked <p>公网IP是否被封堵。</p>
     */
    public Boolean getIsAddressBlocked() {
        return this.IsAddressBlocked;
    }

    /**
     * Set <p>公网IP是否被封堵。</p>
     * @param IsAddressBlocked <p>公网IP是否被封堵。</p>
     */
    public void setIsAddressBlocked(Boolean IsAddressBlocked) {
        this.IsAddressBlocked = IsAddressBlocked;
    }

    /**
     * Get <p>计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。</p> 
     * @return NewPurchasePlan <p>计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。</p>
     */
    public String getNewPurchasePlan() {
        return this.NewPurchasePlan;
    }

    /**
     * Set <p>计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。</p>
     * @param NewPurchasePlan <p>计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。</p>
     */
    public void setNewPurchasePlan(String NewPurchasePlan) {
        this.NewPurchasePlan = NewPurchasePlan;
    }

    /**
     * Get <p>网关计费状态，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。</p> 
     * @return RestrictState <p>网关计费状态，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。</p>
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set <p>网关计费状态，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。</p>
     * @param RestrictState <p>网关计费状态，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。</p>
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * Get <p>可用区，如：ap-guangzhou-2。</p> 
     * @return Zone <p>可用区，如：ap-guangzhou-2。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区，如：ap-guangzhou-2。</p>
     * @param Zone <p>可用区，如：ap-guangzhou-2。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>网关带宽配额信息。</p> 
     * @return VpnGatewayQuotaSet <p>网关带宽配额信息。</p>
     */
    public VpnGatewayQuota [] getVpnGatewayQuotaSet() {
        return this.VpnGatewayQuotaSet;
    }

    /**
     * Set <p>网关带宽配额信息。</p>
     * @param VpnGatewayQuotaSet <p>网关带宽配额信息。</p>
     */
    public void setVpnGatewayQuotaSet(VpnGatewayQuota [] VpnGatewayQuotaSet) {
        this.VpnGatewayQuotaSet = VpnGatewayQuotaSet;
    }

    /**
     * Get <p>网关实例版本信息。</p> 
     * @return Version <p>网关实例版本信息。</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>网关实例版本信息。</p>
     * @param Version <p>网关实例版本信息。</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Type值为CCN/SSL_CCN时，该值表示云联网实例ID。</p> 
     * @return NetworkInstanceId <p>Type值为CCN/SSL_CCN时，该值表示云联网实例ID。</p>
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set <p>Type值为CCN/SSL_CCN时，该值表示云联网实例ID。</p>
     * @param NetworkInstanceId <p>Type值为CCN/SSL_CCN时，该值表示云联网实例ID。</p>
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get <p>CDC 实例ID。</p> 
     * @return CdcId <p>CDC 实例ID。</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>CDC 实例ID。</p>
     * @param CdcId <p>CDC 实例ID。</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>SSL-VPN 客户端连接数。</p> 
     * @return MaxConnection <p>SSL-VPN 客户端连接数。</p>
     */
    public Long getMaxConnection() {
        return this.MaxConnection;
    }

    /**
     * Set <p>SSL-VPN 客户端连接数。</p>
     * @param MaxConnection <p>SSL-VPN 客户端连接数。</p>
     */
    public void setMaxConnection(Long MaxConnection) {
        this.MaxConnection = MaxConnection;
    }

    /**
     * Get <p>Bgp ASN</p> 
     * @return BgpAsn <p>Bgp ASN</p>
     */
    public Long getBgpAsn() {
        return this.BgpAsn;
    }

    /**
     * Set <p>Bgp ASN</p>
     * @param BgpAsn <p>Bgp ASN</p>
     */
    public void setBgpAsn(Long BgpAsn) {
        this.BgpAsn = BgpAsn;
    }

    /**
     * Get <p>标签列表</p> 
     * @return TagSet <p>标签列表</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签列表</p>
     * @param TagSet <p>标签列表</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public VpnGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpnGateway(VpnGateway source) {
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpnGatewayName != null) {
            this.VpnGatewayName = new String(source.VpnGatewayName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.PublicIpAddress != null) {
            this.PublicIpAddress = new String(source.PublicIpAddress);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.IsAddressBlocked != null) {
            this.IsAddressBlocked = new Boolean(source.IsAddressBlocked);
        }
        if (source.NewPurchasePlan != null) {
            this.NewPurchasePlan = new String(source.NewPurchasePlan);
        }
        if (source.RestrictState != null) {
            this.RestrictState = new String(source.RestrictState);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpnGatewayQuotaSet != null) {
            this.VpnGatewayQuotaSet = new VpnGatewayQuota[source.VpnGatewayQuotaSet.length];
            for (int i = 0; i < source.VpnGatewayQuotaSet.length; i++) {
                this.VpnGatewayQuotaSet[i] = new VpnGatewayQuota(source.VpnGatewayQuotaSet[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.MaxConnection != null) {
            this.MaxConnection = new Long(source.MaxConnection);
        }
        if (source.BgpAsn != null) {
            this.BgpAsn = new Long(source.BgpAsn);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpnGatewayName", this.VpnGatewayName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "IsAddressBlocked", this.IsAddressBlocked);
        this.setParamSimple(map, prefix + "NewPurchasePlan", this.NewPurchasePlan);
        this.setParamSimple(map, prefix + "RestrictState", this.RestrictState);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "VpnGatewayQuotaSet.", this.VpnGatewayQuotaSet);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "MaxConnection", this.MaxConnection);
        this.setParamSimple(map, prefix + "BgpAsn", this.BgpAsn);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

