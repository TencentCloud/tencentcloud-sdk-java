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

public class VpnGateway  extends AbstractModel{

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
    * 网关实例类型：'IPSEC', 'SSL'。
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
    private Integer InternetMaxBandwidthOut;

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
     * 获取网关实例ID。
     * @return VpnGatewayId 网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * 设置网关实例ID。
     * @param VpnGatewayId 网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

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
     * 获取网关实例名称。
     * @return VpnGatewayName 网关实例名称。
     */
    public String getVpnGatewayName() {
        return this.VpnGatewayName;
    }

    /**
     * 设置网关实例名称。
     * @param VpnGatewayName 网关实例名称。
     */
    public void setVpnGatewayName(String VpnGatewayName) {
        this.VpnGatewayName = VpnGatewayName;
    }

    /**
     * 获取网关实例类型：'IPSEC', 'SSL'。
     * @return Type 网关实例类型：'IPSEC', 'SSL'。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置网关实例类型：'IPSEC', 'SSL'。
     * @param Type 网关实例类型：'IPSEC', 'SSL'。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取网关实例状态， 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中。
     * @return State 网关实例状态， 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中。
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置网关实例状态， 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中。
     * @param State 网关实例状态， 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取网关公网IP。
     * @return PublicIpAddress 网关公网IP。
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * 设置网关公网IP。
     * @param PublicIpAddress 网关公网IP。
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * 获取网关续费类型：'NOTIFY_AND_MANUAL_RENEW'：手动续费，'NOTIFY_AND_AUTO_RENEW'：自动续费，'NOT_NOTIFY_AND_NOT_RENEW'：到期不续费。
     * @return RenewFlag 网关续费类型：'NOTIFY_AND_MANUAL_RENEW'：手动续费，'NOTIFY_AND_AUTO_RENEW'：自动续费，'NOT_NOTIFY_AND_NOT_RENEW'：到期不续费。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * 设置网关续费类型：'NOTIFY_AND_MANUAL_RENEW'：手动续费，'NOTIFY_AND_AUTO_RENEW'：自动续费，'NOT_NOTIFY_AND_NOT_RENEW'：到期不续费。
     * @param RenewFlag 网关续费类型：'NOTIFY_AND_MANUAL_RENEW'：手动续费，'NOTIFY_AND_AUTO_RENEW'：自动续费，'NOT_NOTIFY_AND_NOT_RENEW'：到期不续费。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * 获取网关付费类型：POSTPAID_BY_HOUR：按小时后付费，PREPAID：包年包月预付费，
     * @return InstanceChargeType 网关付费类型：POSTPAID_BY_HOUR：按小时后付费，PREPAID：包年包月预付费，
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * 设置网关付费类型：POSTPAID_BY_HOUR：按小时后付费，PREPAID：包年包月预付费，
     * @param InstanceChargeType 网关付费类型：POSTPAID_BY_HOUR：按小时后付费，PREPAID：包年包月预付费，
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * 获取网关出带宽。
     * @return InternetMaxBandwidthOut 网关出带宽。
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * 设置网关出带宽。
     * @param InternetMaxBandwidthOut 网关出带宽。
     */
    public void setInternetMaxBandwidthOut(Integer InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
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
     * 获取预付费网关过期时间。
     * @return ExpiredTime 预付费网关过期时间。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * 设置预付费网关过期时间。
     * @param ExpiredTime 预付费网关过期时间。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * 获取公网IP是否被封堵。
     * @return IsAddressBlocked 公网IP是否被封堵。
     */
    public Boolean getIsAddressBlocked() {
        return this.IsAddressBlocked;
    }

    /**
     * 设置公网IP是否被封堵。
     * @param IsAddressBlocked 公网IP是否被封堵。
     */
    public void setIsAddressBlocked(Boolean IsAddressBlocked) {
        this.IsAddressBlocked = IsAddressBlocked;
    }

    /**
     * 获取计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。
     * @return NewPurchasePlan 计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。
     */
    public String getNewPurchasePlan() {
        return this.NewPurchasePlan;
    }

    /**
     * 设置计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。
     * @param NewPurchasePlan 计费模式变更，PREPAID_TO_POSTPAID：包年包月预付费到期转按小时后付费。
     */
    public void setNewPurchasePlan(String NewPurchasePlan) {
        this.NewPurchasePlan = NewPurchasePlan;
    }

    /**
     * 获取网关计费装，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。
     * @return RestrictState 网关计费装，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * 设置网关计费装，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。
     * @param RestrictState 网关计费装，PROTECTIVELY_ISOLATED：被安全隔离的实例，NORMAL：正常。
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * 获取可用区，如：ap-guangzhou-2
     * @return Zone 可用区，如：ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区，如：ap-guangzhou-2
     * @param Zone 可用区，如：ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

