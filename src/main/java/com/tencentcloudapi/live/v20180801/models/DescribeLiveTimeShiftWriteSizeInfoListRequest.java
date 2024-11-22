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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveTimeShiftWriteSizeInfoListRequest extends AbstractModel {

    /**
    * 起始时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
支持最近六个月的查询，查询开始和结束时间跨度不支持超过31天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
支持最近六个月的查询，查询开始和结束时间跨度不支持超过31天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 域名。
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
    * 维度
Area地区、Domain 域名、StorageDays 时移天数
    */
    @SerializedName("Dimensions")
    @Expose
    private String [] Dimensions;

    /**
    * 时移天数。
    */
    @SerializedName("StorageDays")
    @Expose
    private Long [] StorageDays;

    /**
    * 时间跨度（分钟）
默认5，可选 5、60或者1440。
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
    * 区域
可选Mainland、Oversea。
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
     * Get 起始时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
支持最近六个月的查询，查询开始和结束时间跨度不支持超过31天。 
     * @return StartTime 起始时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
支持最近六个月的查询，查询开始和结束时间跨度不支持超过31天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
支持最近六个月的查询，查询开始和结束时间跨度不支持超过31天。
     * @param StartTime 起始时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
支持最近六个月的查询，查询开始和结束时间跨度不支持超过31天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
支持最近六个月的查询，查询开始和结束时间跨度不支持超过31天。 
     * @return EndTime 结束时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
支持最近六个月的查询，查询开始和结束时间跨度不支持超过31天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
支持最近六个月的查询，查询开始和结束时间跨度不支持超过31天。
     * @param EndTime 结束时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
支持最近六个月的查询，查询开始和结束时间跨度不支持超过31天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 域名。 
     * @return DomainNames 域名。
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 域名。
     * @param DomainNames 域名。
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get 维度
Area地区、Domain 域名、StorageDays 时移天数 
     * @return Dimensions 维度
Area地区、Domain 域名、StorageDays 时移天数
     */
    public String [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 维度
Area地区、Domain 域名、StorageDays 时移天数
     * @param Dimensions 维度
Area地区、Domain 域名、StorageDays 时移天数
     */
    public void setDimensions(String [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 时移天数。 
     * @return StorageDays 时移天数。
     */
    public Long [] getStorageDays() {
        return this.StorageDays;
    }

    /**
     * Set 时移天数。
     * @param StorageDays 时移天数。
     */
    public void setStorageDays(Long [] StorageDays) {
        this.StorageDays = StorageDays;
    }

    /**
     * Get 时间跨度（分钟）
默认5，可选 5、60或者1440。 
     * @return Granularity 时间跨度（分钟）
默认5，可选 5、60或者1440。
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 时间跨度（分钟）
默认5，可选 5、60或者1440。
     * @param Granularity 时间跨度（分钟）
默认5，可选 5、60或者1440。
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get 区域
可选Mainland、Oversea。 
     * @return MainlandOrOversea 区域
可选Mainland、Oversea。
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set 区域
可选Mainland、Oversea。
     * @param MainlandOrOversea 区域
可选Mainland、Oversea。
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    public DescribeLiveTimeShiftWriteSizeInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTimeShiftWriteSizeInfoListRequest(DescribeLiveTimeShiftWriteSizeInfoListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new String(source.Dimensions[i]);
            }
        }
        if (source.StorageDays != null) {
            this.StorageDays = new Long[source.StorageDays.length];
            for (int i = 0; i < source.StorageDays.length; i++) {
                this.StorageDays[i] = new Long(source.StorageDays[i]);
            }
        }
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
        if (source.MainlandOrOversea != null) {
            this.MainlandOrOversea = new String(source.MainlandOrOversea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);
        this.setParamArraySimple(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamArraySimple(map, prefix + "StorageDays.", this.StorageDays);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);

    }
}

