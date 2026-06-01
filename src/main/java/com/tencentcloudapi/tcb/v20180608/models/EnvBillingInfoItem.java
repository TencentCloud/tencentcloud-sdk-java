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
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>tcb产品套餐ID，参考DescribePackages接口的返回值。</p>
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * <p>自动续费标记</p>
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Boolean IsAutoRenew;

    /**
    * <p>状态。包含以下取值：</p><li> 空字符串：初始化中</li><li> NORMAL：正常</li><li> ISOLATE：隔离</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>支付方式。包含以下取值：</p><li> PREPAYMENT：预付费</li><li> POSTPAID：后付费</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>隔离时间，最近一次隔离的时间</p>
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * <p>过期时间，套餐即将到期的时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>创建时间，第一次接入计费方案的时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间，计费信息最近一次更新的时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>true表示从未升级过付费版。</p>
    */
    @SerializedName("IsAlwaysFree")
    @Expose
    private Boolean IsAlwaysFree;

    /**
    * <p>付费渠道。</p><li> miniapp：小程序</li><li> qcloud：腾讯云</li>
    */
    @SerializedName("PaymentChannel")
    @Expose
    private String PaymentChannel;

    /**
    * <p>最新的订单信息</p>
    */
    @SerializedName("OrderInfo")
    @Expose
    private OrderInfo OrderInfo;

    /**
    * <p>免费配额信息。</p>
    */
    @SerializedName("FreeQuota")
    @Expose
    private String FreeQuota;

    /**
    * <p>是否开启 <code>超过套餐额度部分转按量付费</code></p>
    */
    @SerializedName("EnableOverrun")
    @Expose
    private Boolean EnableOverrun;

    /**
    * <p>环境套餐类型</p>
    */
    @SerializedName("ExtPackageType")
    @Expose
    private String ExtPackageType;

    /**
    * <p>是否付费期环境，可取值：yes/no。</p>
    */
    @SerializedName("EnvCharged")
    @Expose
    private String EnvCharged;

    /**
    * <p>是否已激活，可取值：yes/no。</p>
    */
    @SerializedName("EnvActivated")
    @Expose
    private String EnvActivated;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>tcb产品套餐ID，参考DescribePackages接口的返回值。</p> 
     * @return PackageId <p>tcb产品套餐ID，参考DescribePackages接口的返回值。</p>
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set <p>tcb产品套餐ID，参考DescribePackages接口的返回值。</p>
     * @param PackageId <p>tcb产品套餐ID，参考DescribePackages接口的返回值。</p>
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get <p>自动续费标记</p> 
     * @return IsAutoRenew <p>自动续费标记</p>
     */
    public Boolean getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set <p>自动续费标记</p>
     * @param IsAutoRenew <p>自动续费标记</p>
     */
    public void setIsAutoRenew(Boolean IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get <p>状态。包含以下取值：</p><li> 空字符串：初始化中</li><li> NORMAL：正常</li><li> ISOLATE：隔离</li> 
     * @return Status <p>状态。包含以下取值：</p><li> 空字符串：初始化中</li><li> NORMAL：正常</li><li> ISOLATE：隔离</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。包含以下取值：</p><li> 空字符串：初始化中</li><li> NORMAL：正常</li><li> ISOLATE：隔离</li>
     * @param Status <p>状态。包含以下取值：</p><li> 空字符串：初始化中</li><li> NORMAL：正常</li><li> ISOLATE：隔离</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>支付方式。包含以下取值：</p><li> PREPAYMENT：预付费</li><li> POSTPAID：后付费</li> 
     * @return PayMode <p>支付方式。包含以下取值：</p><li> PREPAYMENT：预付费</li><li> POSTPAID：后付费</li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>支付方式。包含以下取值：</p><li> PREPAYMENT：预付费</li><li> POSTPAID：后付费</li>
     * @param PayMode <p>支付方式。包含以下取值：</p><li> PREPAYMENT：预付费</li><li> POSTPAID：后付费</li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>隔离时间，最近一次隔离的时间</p> 
     * @return IsolatedTime <p>隔离时间，最近一次隔离的时间</p>
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set <p>隔离时间，最近一次隔离的时间</p>
     * @param IsolatedTime <p>隔离时间，最近一次隔离的时间</p>
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get <p>过期时间，套餐即将到期的时间</p> 
     * @return ExpireTime <p>过期时间，套餐即将到期的时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间，套餐即将到期的时间</p>
     * @param ExpireTime <p>过期时间，套餐即将到期的时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>创建时间，第一次接入计费方案的时间。</p> 
     * @return CreateTime <p>创建时间，第一次接入计费方案的时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，第一次接入计费方案的时间。</p>
     * @param CreateTime <p>创建时间，第一次接入计费方案的时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间，计费信息最近一次更新的时间。</p> 
     * @return UpdateTime <p>更新时间，计费信息最近一次更新的时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间，计费信息最近一次更新的时间。</p>
     * @param UpdateTime <p>更新时间，计费信息最近一次更新的时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>true表示从未升级过付费版。</p> 
     * @return IsAlwaysFree <p>true表示从未升级过付费版。</p>
     */
    public Boolean getIsAlwaysFree() {
        return this.IsAlwaysFree;
    }

    /**
     * Set <p>true表示从未升级过付费版。</p>
     * @param IsAlwaysFree <p>true表示从未升级过付费版。</p>
     */
    public void setIsAlwaysFree(Boolean IsAlwaysFree) {
        this.IsAlwaysFree = IsAlwaysFree;
    }

    /**
     * Get <p>付费渠道。</p><li> miniapp：小程序</li><li> qcloud：腾讯云</li> 
     * @return PaymentChannel <p>付费渠道。</p><li> miniapp：小程序</li><li> qcloud：腾讯云</li>
     */
    public String getPaymentChannel() {
        return this.PaymentChannel;
    }

    /**
     * Set <p>付费渠道。</p><li> miniapp：小程序</li><li> qcloud：腾讯云</li>
     * @param PaymentChannel <p>付费渠道。</p><li> miniapp：小程序</li><li> qcloud：腾讯云</li>
     */
    public void setPaymentChannel(String PaymentChannel) {
        this.PaymentChannel = PaymentChannel;
    }

    /**
     * Get <p>最新的订单信息</p> 
     * @return OrderInfo <p>最新的订单信息</p>
     */
    public OrderInfo getOrderInfo() {
        return this.OrderInfo;
    }

    /**
     * Set <p>最新的订单信息</p>
     * @param OrderInfo <p>最新的订单信息</p>
     */
    public void setOrderInfo(OrderInfo OrderInfo) {
        this.OrderInfo = OrderInfo;
    }

    /**
     * Get <p>免费配额信息。</p> 
     * @return FreeQuota <p>免费配额信息。</p>
     */
    public String getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set <p>免费配额信息。</p>
     * @param FreeQuota <p>免费配额信息。</p>
     */
    public void setFreeQuota(String FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get <p>是否开启 <code>超过套餐额度部分转按量付费</code></p> 
     * @return EnableOverrun <p>是否开启 <code>超过套餐额度部分转按量付费</code></p>
     */
    public Boolean getEnableOverrun() {
        return this.EnableOverrun;
    }

    /**
     * Set <p>是否开启 <code>超过套餐额度部分转按量付费</code></p>
     * @param EnableOverrun <p>是否开启 <code>超过套餐额度部分转按量付费</code></p>
     */
    public void setEnableOverrun(Boolean EnableOverrun) {
        this.EnableOverrun = EnableOverrun;
    }

    /**
     * Get <p>环境套餐类型</p> 
     * @return ExtPackageType <p>环境套餐类型</p>
     */
    public String getExtPackageType() {
        return this.ExtPackageType;
    }

    /**
     * Set <p>环境套餐类型</p>
     * @param ExtPackageType <p>环境套餐类型</p>
     */
    public void setExtPackageType(String ExtPackageType) {
        this.ExtPackageType = ExtPackageType;
    }

    /**
     * Get <p>是否付费期环境，可取值：yes/no。</p> 
     * @return EnvCharged <p>是否付费期环境，可取值：yes/no。</p>
     */
    public String getEnvCharged() {
        return this.EnvCharged;
    }

    /**
     * Set <p>是否付费期环境，可取值：yes/no。</p>
     * @param EnvCharged <p>是否付费期环境，可取值：yes/no。</p>
     */
    public void setEnvCharged(String EnvCharged) {
        this.EnvCharged = EnvCharged;
    }

    /**
     * Get <p>是否已激活，可取值：yes/no。</p> 
     * @return EnvActivated <p>是否已激活，可取值：yes/no。</p>
     */
    public String getEnvActivated() {
        return this.EnvActivated;
    }

    /**
     * Set <p>是否已激活，可取值：yes/no。</p>
     * @param EnvActivated <p>是否已激活，可取值：yes/no。</p>
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

