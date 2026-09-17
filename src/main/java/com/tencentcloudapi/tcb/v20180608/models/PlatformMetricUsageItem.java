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

public class PlatformMetricUsageItem extends AbstractModel {

    /**
    * <p>指标名称</p>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>原始资源类型</p><p>枚举值：</p><ul><li>COS： 对象存储</li></ul>
    */
    @SerializedName("OriginalResourceType")
    @Expose
    private String OriginalResourceType;

    /**
    * <p>原始指标</p>
    */
    @SerializedName("OriginalMetricName")
    @Expose
    private String OriginalMetricName;

    /**
    * <p>资源用量</p>
    */
    @SerializedName("UsageValue")
    @Expose
    private Long UsageValue;

    /**
    * <p>资源用量单位</p>
    */
    @SerializedName("UsageUnit")
    @Expose
    private String UsageUnit;

    /**
    * <p>资源点</p>
    */
    @SerializedName("Credits")
    @Expose
    private Long Credits;

    /**
    * <p>用量按日明细列表</p>
    */
    @SerializedName("DailyUsageList")
    @Expose
    private DailyUsageList [] DailyUsageList;

    /**
     * Get <p>指标名称</p> 
     * @return MetricName <p>指标名称</p>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>指标名称</p>
     * @param MetricName <p>指标名称</p>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>原始资源类型</p><p>枚举值：</p><ul><li>COS： 对象存储</li></ul> 
     * @return OriginalResourceType <p>原始资源类型</p><p>枚举值：</p><ul><li>COS： 对象存储</li></ul>
     */
    public String getOriginalResourceType() {
        return this.OriginalResourceType;
    }

    /**
     * Set <p>原始资源类型</p><p>枚举值：</p><ul><li>COS： 对象存储</li></ul>
     * @param OriginalResourceType <p>原始资源类型</p><p>枚举值：</p><ul><li>COS： 对象存储</li></ul>
     */
    public void setOriginalResourceType(String OriginalResourceType) {
        this.OriginalResourceType = OriginalResourceType;
    }

    /**
     * Get <p>原始指标</p> 
     * @return OriginalMetricName <p>原始指标</p>
     */
    public String getOriginalMetricName() {
        return this.OriginalMetricName;
    }

    /**
     * Set <p>原始指标</p>
     * @param OriginalMetricName <p>原始指标</p>
     */
    public void setOriginalMetricName(String OriginalMetricName) {
        this.OriginalMetricName = OriginalMetricName;
    }

    /**
     * Get <p>资源用量</p> 
     * @return UsageValue <p>资源用量</p>
     */
    public Long getUsageValue() {
        return this.UsageValue;
    }

    /**
     * Set <p>资源用量</p>
     * @param UsageValue <p>资源用量</p>
     */
    public void setUsageValue(Long UsageValue) {
        this.UsageValue = UsageValue;
    }

    /**
     * Get <p>资源用量单位</p> 
     * @return UsageUnit <p>资源用量单位</p>
     */
    public String getUsageUnit() {
        return this.UsageUnit;
    }

    /**
     * Set <p>资源用量单位</p>
     * @param UsageUnit <p>资源用量单位</p>
     */
    public void setUsageUnit(String UsageUnit) {
        this.UsageUnit = UsageUnit;
    }

    /**
     * Get <p>资源点</p> 
     * @return Credits <p>资源点</p>
     */
    public Long getCredits() {
        return this.Credits;
    }

    /**
     * Set <p>资源点</p>
     * @param Credits <p>资源点</p>
     */
    public void setCredits(Long Credits) {
        this.Credits = Credits;
    }

    /**
     * Get <p>用量按日明细列表</p> 
     * @return DailyUsageList <p>用量按日明细列表</p>
     */
    public DailyUsageList [] getDailyUsageList() {
        return this.DailyUsageList;
    }

    /**
     * Set <p>用量按日明细列表</p>
     * @param DailyUsageList <p>用量按日明细列表</p>
     */
    public void setDailyUsageList(DailyUsageList [] DailyUsageList) {
        this.DailyUsageList = DailyUsageList;
    }

    public PlatformMetricUsageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlatformMetricUsageItem(PlatformMetricUsageItem source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.OriginalResourceType != null) {
            this.OriginalResourceType = new String(source.OriginalResourceType);
        }
        if (source.OriginalMetricName != null) {
            this.OriginalMetricName = new String(source.OriginalMetricName);
        }
        if (source.UsageValue != null) {
            this.UsageValue = new Long(source.UsageValue);
        }
        if (source.UsageUnit != null) {
            this.UsageUnit = new String(source.UsageUnit);
        }
        if (source.Credits != null) {
            this.Credits = new Long(source.Credits);
        }
        if (source.DailyUsageList != null) {
            this.DailyUsageList = new DailyUsageList[source.DailyUsageList.length];
            for (int i = 0; i < source.DailyUsageList.length; i++) {
                this.DailyUsageList[i] = new DailyUsageList(source.DailyUsageList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "OriginalResourceType", this.OriginalResourceType);
        this.setParamSimple(map, prefix + "OriginalMetricName", this.OriginalMetricName);
        this.setParamSimple(map, prefix + "UsageValue", this.UsageValue);
        this.setParamSimple(map, prefix + "UsageUnit", this.UsageUnit);
        this.setParamSimple(map, prefix + "Credits", this.Credits);
        this.setParamArrayObj(map, prefix + "DailyUsageList.", this.DailyUsageList);

    }
}

