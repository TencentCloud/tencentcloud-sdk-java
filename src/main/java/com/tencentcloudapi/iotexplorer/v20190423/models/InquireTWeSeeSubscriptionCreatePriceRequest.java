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

public class InquireTWeSeeSubscriptionCreatePriceRequest extends AbstractModel {

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

    public InquireTWeSeeSubscriptionCreatePriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquireTWeSeeSubscriptionCreatePriceRequest(InquireTWeSeeSubscriptionCreatePriceRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServiceTier != null) {
            this.ServiceTier = new String(source.ServiceTier);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServiceTier", this.ServiceTier);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

