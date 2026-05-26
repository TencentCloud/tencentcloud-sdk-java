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

public class InquireTWeSeeSubscriptionRenewPriceRequest extends AbstractModel {

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
    * 续费时长，单位：月，支持 1-60
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
     * Get 续费时长，单位：月，支持 1-60 
     * @return Period 续费时长，单位：月，支持 1-60
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 续费时长，单位：月，支持 1-60
     * @param Period 续费时长，单位：月，支持 1-60
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

    public InquireTWeSeeSubscriptionRenewPriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquireTWeSeeSubscriptionRenewPriceRequest(InquireTWeSeeSubscriptionRenewPriceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

