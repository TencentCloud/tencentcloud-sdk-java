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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTWeSeeSubscriptionRequest extends AbstractModel {

    /**
    * <p>产品 ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>算法类型</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解</li></ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>套餐规格</p><p>枚举值：</p><ul><li>BASIC： 包年包月基础版</li><li>ADVANCED： 包年包月高级版</li></ul>
    */
    @SerializedName("ServiceTier")
    @Expose
    private String ServiceTier;

    /**
    * <p>订阅购买时长，单位：月，支持 1-60</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>通道 ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * <p>自定义订单 ID</p>
    */
    @SerializedName("CustomOrderId")
    @Expose
    private String CustomOrderId;

    /**
    * <p>续费标识。可选值：</p><ul><li><code>NOTIFY_AND_MANUAL_RENEW</code>：到期前通知并手动续费（默认）</li><li><code>NOTIFY_AND_AUTO_RENEW</code>：到期前通知并自动续费</li><li><code>DISABLE_NOTIFY_AND_MANUAL_RENEW</code>：不通知且手动续费</li></ul>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get <p>产品 ID</p> 
     * @return ProductId <p>产品 ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品 ID</p>
     * @param ProductId <p>产品 ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>算法类型</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解</li></ul> 
     * @return ServiceType <p>算法类型</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解</li></ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>算法类型</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解</li></ul>
     * @param ServiceType <p>算法类型</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解</li></ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>套餐规格</p><p>枚举值：</p><ul><li>BASIC： 包年包月基础版</li><li>ADVANCED： 包年包月高级版</li></ul> 
     * @return ServiceTier <p>套餐规格</p><p>枚举值：</p><ul><li>BASIC： 包年包月基础版</li><li>ADVANCED： 包年包月高级版</li></ul>
     */
    public String getServiceTier() {
        return this.ServiceTier;
    }

    /**
     * Set <p>套餐规格</p><p>枚举值：</p><ul><li>BASIC： 包年包月基础版</li><li>ADVANCED： 包年包月高级版</li></ul>
     * @param ServiceTier <p>套餐规格</p><p>枚举值：</p><ul><li>BASIC： 包年包月基础版</li><li>ADVANCED： 包年包月高级版</li></ul>
     */
    public void setServiceTier(String ServiceTier) {
        this.ServiceTier = ServiceTier;
    }

    /**
     * Get <p>订阅购买时长，单位：月，支持 1-60</p> 
     * @return Period <p>订阅购买时长，单位：月，支持 1-60</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>订阅购买时长，单位：月，支持 1-60</p>
     * @param Period <p>订阅购买时长，单位：月，支持 1-60</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>通道 ID</p> 
     * @return ChannelId <p>通道 ID</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道 ID</p>
     * @param ChannelId <p>通道 ID</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>自定义订单 ID</p> 
     * @return CustomOrderId <p>自定义订单 ID</p>
     */
    public String getCustomOrderId() {
        return this.CustomOrderId;
    }

    /**
     * Set <p>自定义订单 ID</p>
     * @param CustomOrderId <p>自定义订单 ID</p>
     */
    public void setCustomOrderId(String CustomOrderId) {
        this.CustomOrderId = CustomOrderId;
    }

    /**
     * Get <p>续费标识。可选值：</p><ul><li><code>NOTIFY_AND_MANUAL_RENEW</code>：到期前通知并手动续费（默认）</li><li><code>NOTIFY_AND_AUTO_RENEW</code>：到期前通知并自动续费</li><li><code>DISABLE_NOTIFY_AND_MANUAL_RENEW</code>：不通知且手动续费</li></ul> 
     * @return RenewFlag <p>续费标识。可选值：</p><ul><li><code>NOTIFY_AND_MANUAL_RENEW</code>：到期前通知并手动续费（默认）</li><li><code>NOTIFY_AND_AUTO_RENEW</code>：到期前通知并自动续费</li><li><code>DISABLE_NOTIFY_AND_MANUAL_RENEW</code>：不通知且手动续费</li></ul>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标识。可选值：</p><ul><li><code>NOTIFY_AND_MANUAL_RENEW</code>：到期前通知并手动续费（默认）</li><li><code>NOTIFY_AND_AUTO_RENEW</code>：到期前通知并自动续费</li><li><code>DISABLE_NOTIFY_AND_MANUAL_RENEW</code>：不通知且手动续费</li></ul>
     * @param RenewFlag <p>续费标识。可选值：</p><ul><li><code>NOTIFY_AND_MANUAL_RENEW</code>：到期前通知并手动续费（默认）</li><li><code>NOTIFY_AND_AUTO_RENEW</code>：到期前通知并自动续费</li><li><code>DISABLE_NOTIFY_AND_MANUAL_RENEW</code>：不通知且手动续费</li></ul>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public CreateTWeSeeSubscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTWeSeeSubscriptionRequest(CreateTWeSeeSubscriptionRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServiceTier != null) {
            this.ServiceTier = new String(source.ServiceTier);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.CustomOrderId != null) {
            this.CustomOrderId = new String(source.CustomOrderId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServiceTier", this.ServiceTier);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "CustomOrderId", this.CustomOrderId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

