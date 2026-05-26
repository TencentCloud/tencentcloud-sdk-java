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

public class DescribeTWeSeeTaskStatisticsRequest extends AbstractModel {

    /**
    * 算法类型。可选值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 套餐规格。可选值：

- `POSTPAID`：后付费（适用于视频理解、图片理解）
- `BASIC`：包年包月基础版（适用于视频理解）
    */
    @SerializedName("ServiceTier")
    @Expose
    private String ServiceTier;

    /**
    * 起始时间 UNIX 时间戳，单位：秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间 UNIX 时间戳，单位：秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 数据点间隔，单位：秒；-1 表示汇总，只返回 1 个数据点
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
     * Get 算法类型。可选值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解 
     * @return ServiceType 算法类型。可选值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 算法类型。可选值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
     * @param ServiceType 算法类型。可选值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 套餐规格。可选值：

- `POSTPAID`：后付费（适用于视频理解、图片理解）
- `BASIC`：包年包月基础版（适用于视频理解） 
     * @return ServiceTier 套餐规格。可选值：

- `POSTPAID`：后付费（适用于视频理解、图片理解）
- `BASIC`：包年包月基础版（适用于视频理解）
     */
    public String getServiceTier() {
        return this.ServiceTier;
    }

    /**
     * Set 套餐规格。可选值：

- `POSTPAID`：后付费（适用于视频理解、图片理解）
- `BASIC`：包年包月基础版（适用于视频理解）
     * @param ServiceTier 套餐规格。可选值：

- `POSTPAID`：后付费（适用于视频理解、图片理解）
- `BASIC`：包年包月基础版（适用于视频理解）
     */
    public void setServiceTier(String ServiceTier) {
        this.ServiceTier = ServiceTier;
    }

    /**
     * Get 起始时间 UNIX 时间戳，单位：秒 
     * @return StartTime 起始时间 UNIX 时间戳，单位：秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间 UNIX 时间戳，单位：秒
     * @param StartTime 起始时间 UNIX 时间戳，单位：秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 UNIX 时间戳，单位：秒 
     * @return EndTime 结束时间 UNIX 时间戳，单位：秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间 UNIX 时间戳，单位：秒
     * @param EndTime 结束时间 UNIX 时间戳，单位：秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 数据点间隔，单位：秒；-1 表示汇总，只返回 1 个数据点 
     * @return Interval 数据点间隔，单位：秒；-1 表示汇总，只返回 1 个数据点
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 数据点间隔，单位：秒；-1 表示汇总，只返回 1 个数据点
     * @param Interval 数据点间隔，单位：秒；-1 表示汇总，只返回 1 个数据点
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    public DescribeTWeSeeTaskStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTWeSeeTaskStatisticsRequest(DescribeTWeSeeTaskStatisticsRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServiceTier != null) {
            this.ServiceTier = new String(source.ServiceTier);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServiceTier", this.ServiceTier);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

