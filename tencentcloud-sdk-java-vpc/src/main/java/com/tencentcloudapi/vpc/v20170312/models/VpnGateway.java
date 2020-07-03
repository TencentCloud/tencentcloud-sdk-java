/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpnGateway extends AbstractModel{

    /**
    * 网关实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网关实例名称。
    */
    @SerializedName("VpnGatewayName")
    @Expose
    private String VpnGatewayName;

    /**
    * 网关实例类型：'IPSEC', 'SSL','CCN'。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 网关实例状态， 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 网关公网IP。
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * 网关续费类型：'NOTIFY_AND_MANUAL_RENEW'：手动续费，'NOTIFY_AND_AUTO_RENEW'：自动续费，'NOT_NOTIFY_AND_NOT_RENEW'：到期不续费。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 网关付费类型：POSTPAID_BY_HOUR：按小时后付费，PREPAID：包年包月预付费，
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 网关出带宽。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 预付费网关过期时间。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 公网IP是否被封堵。
    */
    @SerializedName("IsAddressBlocked")
    @Expose
    private Boolean IsAddressBlocked;

    /**
    * 计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。
    */
    @SerializedName("NewPurchasePlan")
    @Expose
    private String NewPurchasePlan;

    /**
    * 网关计费装，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * 可用区，如：ap-guangzhou-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 网关带宽配额信息
    */
    @SerializedName("VpnGatewayQuotaSet")
    @Expose
    private VpnGatewayQuota [] VpnGatewayQuotaSet;

    /**
    * 网关实例版本信息
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Type值为CCN时，该值表示云联网实例ID
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
     * Get 网关实例ID。 
     * @return VpnGatewayId 网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set 网关实例ID。
     * @param VpnGatewayId 网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网关实例名称。 
     * @return VpnGatewayName 网关实例名称。
     */
    public String getVpnGatewayName() {
        return this.VpnGatewayName;
    }

    /**
     * Set 网关实例名称。
     * @param VpnGatewayName 网关实例名称。
     */
    public void setVpnGatewayName(String VpnGatewayName) {
        this.VpnGatewayName = VpnGatewayName;
    }

    /**
     * Get 网关实例类型：'IPSEC', 'SSL','CCN'。 
     * @return Type 网关实例类型：'IPSEC', 'SSL','CCN'。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 网关实例类型：'IPSEC', 'SSL','CCN'。
     * @param Type 网关实例类型：'IPSEC', 'SSL','CCN'。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 网关实例状态， 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中。 
     * @return State 网关实例状态， 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 网关实例状态， 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中。
     * @param State 网关实例状态， 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 网关公网IP。 
     * @return PublicIpAddress 网关公网IP。
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set 网关公网IP。
     * @param PublicIpAddress 网关公网IP。
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get 网关续费类型：'NOTIFY_AND_MANUAL_RENEW'：手动续费，'NOTIFY_AND_AUTO_RENEW'：自动续费，'NOT_NOTIFY_AND_NOT_RENEW'：到期不续费。 
     * @return RenewFlag 网关续费类型：'NOTIFY_AND_MANUAL_RENEW'：手动续费，'NOTIFY_AND_AUTO_RENEW'：自动续费，'NOT_NOTIFY_AND_NOT_RENEW'：到期不续费。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 网关续费类型：'NOTIFY_AND_MANUAL_RENEW'：手动续费，'NOTIFY_AND_AUTO_RENEW'：自动续费，'NOT_NOTIFY_AND_NOT_RENEW'：到期不续费。
     * @param RenewFlag 网关续费类型：'NOTIFY_AND_MANUAL_RENEW'：手动续费，'NOTIFY_AND_AUTO_RENEW'：自动续费，'NOT_NOTIFY_AND_NOT_RENEW'：到期不续费。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 网关付费类型：POSTPAID_BY_HOUR：按小时后付费，PREPAID：包年包月预付费， 
     * @return InstanceChargeType 网关付费类型：POSTPAID_BY_HOUR：按小时后付费，PREPAID：包年包月预付费，
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 网关付费类型：POSTPAID_BY_HOUR：按小时后付费，PREPAID：包年包月预付费，
     * @param InstanceChargeType 网关付费类型：POSTPAID_BY_HOUR：按小时后付费，PREPAID：包年包月预付费，
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 网关出带宽。 
     * @return InternetMaxBandwidthOut 网关出带宽。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 网关出带宽。
     * @param InternetMaxBandwidthOut 网关出带宽。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 预付费网关过期时间。 
     * @return ExpiredTime 预付费网关过期时间。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 预付费网关过期时间。
     * @param ExpiredTime 预付费网关过期时间。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 公网IP是否被封堵。 
     * @return IsAddressBlocked 公网IP是否被封堵。
     */
    public Boolean getIsAddressBlocked() {
        return this.IsAddressBlocked;
    }

    /**
     * Set 公网IP是否被封堵。
     * @param IsAddressBlocked 公网IP是否被封堵。
     */
    public void setIsAddressBlocked(Boolean IsAddressBlocked) {
        this.IsAddressBlocked = IsAddressBlocked;
    }

    /**
     * Get 计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。 
     * @return NewPurchasePlan 计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。
     */
    public String getNewPurchasePlan() {
        return this.NewPurchasePlan;
    }

    /**
     * Set 计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。
     * @param NewPurchasePlan 计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。
     */
    public void setNewPurchasePlan(String NewPurchasePlan) {
        this.NewPurchasePlan = NewPurchasePlan;
    }

    /**
     * Get 网关计费装，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。 
     * @return RestrictState 网关计费装，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set 网关计费装，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。
     * @param RestrictState 网关计费装，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * Get 可用区，如：ap-guangzhou-2 
     * @return Zone 可用区，如：ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区，如：ap-guangzhou-2
     * @param Zone 可用区，如：ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 网关带宽配额信息 
     * @return VpnGatewayQuotaSet 网关带宽配额信息
     */
    public VpnGatewayQuota [] getVpnGatewayQuotaSet() {
        return this.VpnGatewayQuotaSet;
    }

    /**
     * Set 网关带宽配额信息
     * @param VpnGatewayQuotaSet 网关带宽配额信息
     */
    public void setVpnGatewayQuotaSet(VpnGatewayQuota [] VpnGatewayQuotaSet) {
        this.VpnGatewayQuotaSet = VpnGatewayQuotaSet;
    }

    /**
     * Get 网关实例版本信息 
     * @return Version 网关实例版本信息
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 网关实例版本信息
     * @param Version 网关实例版本信息
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Type值为CCN时，该值表示云联网实例ID 
     * @return NetworkInstanceId Type值为CCN时，该值表示云联网实例ID
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set Type值为CCN时，该值表示云联网实例ID
     * @param NetworkInstanceId Type值为CCN时，该值表示云联网实例ID
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
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

    }
}

