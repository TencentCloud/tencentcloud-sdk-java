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
    * 产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 算法类型。可选值：

- `VID_COMP`：视频理解
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 套餐规格。可选值：

- `BASIC`：包年包月基础版（适用于视频理解）
    */
    @SerializedName("ServiceTier")
    @Expose
    private String ServiceTier;

    /**
    * 订阅购买时长，单位：月，支持 1-60
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 通道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 自定义订单 ID
    */
    @SerializedName("CustomOrderId")
    @Expose
    private String CustomOrderId;

    /**
    * 续费标识。可选值：
- `NOTIFY_AND_MANUAL_RENEW`：到期前通知并手动续费（默认）
- `NOTIFY_AND_AUTO_RENEW`：到期前通知并自动续费
- `DISABLE_NOTIFY_AND_MANUAL_RENEW`：不通知且手动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get 产品 ID 
     * @return ProductId 产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID
     * @param ProductId 产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 算法类型。可选值：

- `VID_COMP`：视频理解 
     * @return ServiceType 算法类型。可选值：

- `VID_COMP`：视频理解
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 算法类型。可选值：

- `VID_COMP`：视频理解
     * @param ServiceType 算法类型。可选值：

- `VID_COMP`：视频理解
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 套餐规格。可选值：

- `BASIC`：包年包月基础版（适用于视频理解） 
     * @return ServiceTier 套餐规格。可选值：

- `BASIC`：包年包月基础版（适用于视频理解）
     */
    public String getServiceTier() {
        return this.ServiceTier;
    }

    /**
     * Set 套餐规格。可选值：

- `BASIC`：包年包月基础版（适用于视频理解）
     * @param ServiceTier 套餐规格。可选值：

- `BASIC`：包年包月基础版（适用于视频理解）
     */
    public void setServiceTier(String ServiceTier) {
        this.ServiceTier = ServiceTier;
    }

    /**
     * Get 订阅购买时长，单位：月，支持 1-60 
     * @return Period 订阅购买时长，单位：月，支持 1-60
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 订阅购买时长，单位：月，支持 1-60
     * @param Period 订阅购买时长，单位：月，支持 1-60
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 通道 ID 
     * @return ChannelId 通道 ID
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID
     * @param ChannelId 通道 ID
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 自定义订单 ID 
     * @return CustomOrderId 自定义订单 ID
     */
    public String getCustomOrderId() {
        return this.CustomOrderId;
    }

    /**
     * Set 自定义订单 ID
     * @param CustomOrderId 自定义订单 ID
     */
    public void setCustomOrderId(String CustomOrderId) {
        this.CustomOrderId = CustomOrderId;
    }

    /**
     * Get 续费标识。可选值：
- `NOTIFY_AND_MANUAL_RENEW`：到期前通知并手动续费（默认）
- `NOTIFY_AND_AUTO_RENEW`：到期前通知并自动续费
- `DISABLE_NOTIFY_AND_MANUAL_RENEW`：不通知且手动续费 
     * @return RenewFlag 续费标识。可选值：
- `NOTIFY_AND_MANUAL_RENEW`：到期前通知并手动续费（默认）
- `NOTIFY_AND_AUTO_RENEW`：到期前通知并自动续费
- `DISABLE_NOTIFY_AND_MANUAL_RENEW`：不通知且手动续费
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标识。可选值：
- `NOTIFY_AND_MANUAL_RENEW`：到期前通知并手动续费（默认）
- `NOTIFY_AND_AUTO_RENEW`：到期前通知并自动续费
- `DISABLE_NOTIFY_AND_MANUAL_RENEW`：不通知且手动续费
     * @param RenewFlag 续费标识。可选值：
- `NOTIFY_AND_MANUAL_RENEW`：到期前通知并手动续费（默认）
- `NOTIFY_AND_AUTO_RENEW`：到期前通知并自动续费
- `DISABLE_NOTIFY_AND_MANUAL_RENEW`：不通知且手动续费
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

