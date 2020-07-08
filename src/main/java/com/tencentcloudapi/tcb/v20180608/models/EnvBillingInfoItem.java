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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvBillingInfoItem extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * tcb产品套餐ID，参考DescribePackages接口的返回值。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 自动续费标记
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Boolean IsAutoRenew;

    /**
    * 状态。包含以下取值：
<li> 空字符串：初始化中</li>
<li> NORMAL：正常</li>
<li> ISOLATE：隔离</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 支付方式。包含以下取值：
<li> PREPAYMENT：预付费</li>
<li> POSTPAID：后付费</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 隔离时间，最近一次隔离的时间
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * 过期时间，套餐即将到期的时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 创建时间，第一次接入计费方案的时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间，计费信息最近一次更新的时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * true表示从未升级过付费版。
    */
    @SerializedName("IsAlwaysFree")
    @Expose
    private Boolean IsAlwaysFree;

    /**
    * 付费渠道。
<li> miniapp：小程序</li>
<li> qcloud：腾讯云</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentChannel")
    @Expose
    private String PaymentChannel;

    /**
    * 最新的订单信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderInfo")
    @Expose
    private OrderInfo OrderInfo;

    /**
    * 免费配额信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreeQuota")
    @Expose
    private String FreeQuota;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get tcb产品套餐ID，参考DescribePackages接口的返回值。 
     * @return PackageId tcb产品套餐ID，参考DescribePackages接口的返回值。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set tcb产品套餐ID，参考DescribePackages接口的返回值。
     * @param PackageId tcb产品套餐ID，参考DescribePackages接口的返回值。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 自动续费标记 
     * @return IsAutoRenew 自动续费标记
     */
    public Boolean getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set 自动续费标记
     * @param IsAutoRenew 自动续费标记
     */
    public void setIsAutoRenew(Boolean IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get 状态。包含以下取值：
<li> 空字符串：初始化中</li>
<li> NORMAL：正常</li>
<li> ISOLATE：隔离</li> 
     * @return Status 状态。包含以下取值：
<li> 空字符串：初始化中</li>
<li> NORMAL：正常</li>
<li> ISOLATE：隔离</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。包含以下取值：
<li> 空字符串：初始化中</li>
<li> NORMAL：正常</li>
<li> ISOLATE：隔离</li>
     * @param Status 状态。包含以下取值：
<li> 空字符串：初始化中</li>
<li> NORMAL：正常</li>
<li> ISOLATE：隔离</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 支付方式。包含以下取值：
<li> PREPAYMENT：预付费</li>
<li> POSTPAID：后付费</li> 
     * @return PayMode 支付方式。包含以下取值：
<li> PREPAYMENT：预付费</li>
<li> POSTPAID：后付费</li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 支付方式。包含以下取值：
<li> PREPAYMENT：预付费</li>
<li> POSTPAID：后付费</li>
     * @param PayMode 支付方式。包含以下取值：
<li> PREPAYMENT：预付费</li>
<li> POSTPAID：后付费</li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 隔离时间，最近一次隔离的时间 
     * @return IsolatedTime 隔离时间，最近一次隔离的时间
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 隔离时间，最近一次隔离的时间
     * @param IsolatedTime 隔离时间，最近一次隔离的时间
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get 过期时间，套餐即将到期的时间 
     * @return ExpireTime 过期时间，套餐即将到期的时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，套餐即将到期的时间
     * @param ExpireTime 过期时间，套餐即将到期的时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 创建时间，第一次接入计费方案的时间。 
     * @return CreateTime 创建时间，第一次接入计费方案的时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，第一次接入计费方案的时间。
     * @param CreateTime 创建时间，第一次接入计费方案的时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，计费信息最近一次更新的时间。 
     * @return UpdateTime 更新时间，计费信息最近一次更新的时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，计费信息最近一次更新的时间。
     * @param UpdateTime 更新时间，计费信息最近一次更新的时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get true表示从未升级过付费版。 
     * @return IsAlwaysFree true表示从未升级过付费版。
     */
    public Boolean getIsAlwaysFree() {
        return this.IsAlwaysFree;
    }

    /**
     * Set true表示从未升级过付费版。
     * @param IsAlwaysFree true表示从未升级过付费版。
     */
    public void setIsAlwaysFree(Boolean IsAlwaysFree) {
        this.IsAlwaysFree = IsAlwaysFree;
    }

    /**
     * Get 付费渠道。
<li> miniapp：小程序</li>
<li> qcloud：腾讯云</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentChannel 付费渠道。
<li> miniapp：小程序</li>
<li> qcloud：腾讯云</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentChannel() {
        return this.PaymentChannel;
    }

    /**
     * Set 付费渠道。
<li> miniapp：小程序</li>
<li> qcloud：腾讯云</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentChannel 付费渠道。
<li> miniapp：小程序</li>
<li> qcloud：腾讯云</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentChannel(String PaymentChannel) {
        this.PaymentChannel = PaymentChannel;
    }

    /**
     * Get 最新的订单信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderInfo 最新的订单信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrderInfo getOrderInfo() {
        return this.OrderInfo;
    }

    /**
     * Set 最新的订单信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderInfo 最新的订单信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderInfo(OrderInfo OrderInfo) {
        this.OrderInfo = OrderInfo;
    }

    /**
     * Get 免费配额信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreeQuota 免费配额信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set 免费配额信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreeQuota 免费配额信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreeQuota(String FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "IsAutoRenew", this.IsAutoRenew);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsAlwaysFree", this.IsAlwaysFree);
        this.setParamSimple(map, prefix + "PaymentChannel", this.PaymentChannel);
        this.setParamObj(map, prefix + "OrderInfo.", this.OrderInfo);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);

    }
}

