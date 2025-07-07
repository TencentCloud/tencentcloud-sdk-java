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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvBillingInfoItem extends AbstractModel {

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
    */
    @SerializedName("PaymentChannel")
    @Expose
    private String PaymentChannel;

    /**
    * 最新的订单信息
    */
    @SerializedName("OrderInfo")
    @Expose
    private OrderInfo OrderInfo;

    /**
    * 免费配额信息。
    */
    @SerializedName("FreeQuota")
    @Expose
    private String FreeQuota;

    /**
    * 是否开启 `超过套餐额度部分转按量付费`
    */
    @SerializedName("EnableOverrun")
    @Expose
    private Boolean EnableOverrun;

    /**
    * 环境套餐类型
    */
    @SerializedName("ExtPackageType")
    @Expose
    private String ExtPackageType;

    /**
    * 是否付费期环境，可取值：yes/no。
    */
    @SerializedName("EnvCharged")
    @Expose
    private String EnvCharged;

    /**
    * 是否已激活，可取值：yes/no。
    */
    @SerializedName("EnvActivated")
    @Expose
    private String EnvActivated;

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
     * @return PaymentChannel 付费渠道。
<li> miniapp：小程序</li>
<li> qcloud：腾讯云</li>
     */
    public String getPaymentChannel() {
        return this.PaymentChannel;
    }

    /**
     * Set 付费渠道。
<li> miniapp：小程序</li>
<li> qcloud：腾讯云</li>
     * @param PaymentChannel 付费渠道。
<li> miniapp：小程序</li>
<li> qcloud：腾讯云</li>
     */
    public void setPaymentChannel(String PaymentChannel) {
        this.PaymentChannel = PaymentChannel;
    }

    /**
     * Get 最新的订单信息 
     * @return OrderInfo 最新的订单信息
     */
    public OrderInfo getOrderInfo() {
        return this.OrderInfo;
    }

    /**
     * Set 最新的订单信息
     * @param OrderInfo 最新的订单信息
     */
    public void setOrderInfo(OrderInfo OrderInfo) {
        this.OrderInfo = OrderInfo;
    }

    /**
     * Get 免费配额信息。 
     * @return FreeQuota 免费配额信息。
     */
    public String getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set 免费配额信息。
     * @param FreeQuota 免费配额信息。
     */
    public void setFreeQuota(String FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get 是否开启 `超过套餐额度部分转按量付费` 
     * @return EnableOverrun 是否开启 `超过套餐额度部分转按量付费`
     */
    public Boolean getEnableOverrun() {
        return this.EnableOverrun;
    }

    /**
     * Set 是否开启 `超过套餐额度部分转按量付费`
     * @param EnableOverrun 是否开启 `超过套餐额度部分转按量付费`
     */
    public void setEnableOverrun(Boolean EnableOverrun) {
        this.EnableOverrun = EnableOverrun;
    }

    /**
     * Get 环境套餐类型 
     * @return ExtPackageType 环境套餐类型
     */
    public String getExtPackageType() {
        return this.ExtPackageType;
    }

    /**
     * Set 环境套餐类型
     * @param ExtPackageType 环境套餐类型
     */
    public void setExtPackageType(String ExtPackageType) {
        this.ExtPackageType = ExtPackageType;
    }

    /**
     * Get 是否付费期环境，可取值：yes/no。 
     * @return EnvCharged 是否付费期环境，可取值：yes/no。
     */
    public String getEnvCharged() {
        return this.EnvCharged;
    }

    /**
     * Set 是否付费期环境，可取值：yes/no。
     * @param EnvCharged 是否付费期环境，可取值：yes/no。
     */
    public void setEnvCharged(String EnvCharged) {
        this.EnvCharged = EnvCharged;
    }

    /**
     * Get 是否已激活，可取值：yes/no。 
     * @return EnvActivated 是否已激活，可取值：yes/no。
     */
    public String getEnvActivated() {
        return this.EnvActivated;
    }

    /**
     * Set 是否已激活，可取值：yes/no。
     * @param EnvActivated 是否已激活，可取值：yes/no。
     */
    public void setEnvActivated(String EnvActivated) {
        this.EnvActivated = EnvActivated;
    }

    public EnvBillingInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvBillingInfoItem(EnvBillingInfoItem source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.IsAutoRenew != null) {
            this.IsAutoRenew = new Boolean(source.IsAutoRenew);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsAlwaysFree != null) {
            this.IsAlwaysFree = new Boolean(source.IsAlwaysFree);
        }
        if (source.PaymentChannel != null) {
            this.PaymentChannel = new String(source.PaymentChannel);
        }
        if (source.OrderInfo != null) {
            this.OrderInfo = new OrderInfo(source.OrderInfo);
        }
        if (source.FreeQuota != null) {
            this.FreeQuota = new String(source.FreeQuota);
        }
        if (source.EnableOverrun != null) {
            this.EnableOverrun = new Boolean(source.EnableOverrun);
        }
        if (source.ExtPackageType != null) {
            this.ExtPackageType = new String(source.ExtPackageType);
        }
        if (source.EnvCharged != null) {
            this.EnvCharged = new String(source.EnvCharged);
        }
        if (source.EnvActivated != null) {
            this.EnvActivated = new String(source.EnvActivated);
        }
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
        this.setParamSimple(map, prefix + "EnableOverrun", this.EnableOverrun);
        this.setParamSimple(map, prefix + "ExtPackageType", this.ExtPackageType);
        this.setParamSimple(map, prefix + "EnvCharged", this.EnvCharged);
        this.setParamSimple(map, prefix + "EnvActivated", this.EnvActivated);

    }
}

