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
package com.tencentcloudapi.cdz.v20221123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudDedicatedZoneResourceStatisticsInfo extends AbstractModel {

    /**
    * 资源统计项名称
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 资源统计项单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 资源总量
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 已用资源
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * 已用资源占比
    */
    @SerializedName("UsageRate")
    @Expose
    private String UsageRate;

    /**
    * 剩余资源
    */
    @SerializedName("Remain")
    @Expose
    private String Remain;

    /**
    * 剩余资源占比
    */
    @SerializedName("RemainRate")
    @Expose
    private String RemainRate;

    /**
    * 本周一零点资源使用率
    */
    @SerializedName("ThisMondayUsageRate")
    @Expose
    private String ThisMondayUsageRate;

    /**
    * 本周资源增长比例
    */
    @SerializedName("ThisMondayUsageGrowthRate")
    @Expose
    private String ThisMondayUsageGrowthRate;

    /**
    * 上周资源增长比例
    */
    @SerializedName("LastMondayUsageGrowthRate")
    @Expose
    private String LastMondayUsageGrowthRate;

    /**
     * Get 资源统计项名称 
     * @return Item 资源统计项名称
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set 资源统计项名称
     * @param Item 资源统计项名称
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get 资源统计项单位 
     * @return Unit 资源统计项单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 资源统计项单位
     * @param Unit 资源统计项单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 资源总量 
     * @return Total 资源总量
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 资源总量
     * @param Total 资源总量
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 已用资源 
     * @return Usage 已用资源
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set 已用资源
     * @param Usage 已用资源
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 已用资源占比 
     * @return UsageRate 已用资源占比
     */
    public String getUsageRate() {
        return this.UsageRate;
    }

    /**
     * Set 已用资源占比
     * @param UsageRate 已用资源占比
     */
    public void setUsageRate(String UsageRate) {
        this.UsageRate = UsageRate;
    }

    /**
     * Get 剩余资源 
     * @return Remain 剩余资源
     */
    public String getRemain() {
        return this.Remain;
    }

    /**
     * Set 剩余资源
     * @param Remain 剩余资源
     */
    public void setRemain(String Remain) {
        this.Remain = Remain;
    }

    /**
     * Get 剩余资源占比 
     * @return RemainRate 剩余资源占比
     */
    public String getRemainRate() {
        return this.RemainRate;
    }

    /**
     * Set 剩余资源占比
     * @param RemainRate 剩余资源占比
     */
    public void setRemainRate(String RemainRate) {
        this.RemainRate = RemainRate;
    }

    /**
     * Get 本周一零点资源使用率 
     * @return ThisMondayUsageRate 本周一零点资源使用率
     */
    public String getThisMondayUsageRate() {
        return this.ThisMondayUsageRate;
    }

    /**
     * Set 本周一零点资源使用率
     * @param ThisMondayUsageRate 本周一零点资源使用率
     */
    public void setThisMondayUsageRate(String ThisMondayUsageRate) {
        this.ThisMondayUsageRate = ThisMondayUsageRate;
    }

    /**
     * Get 本周资源增长比例 
     * @return ThisMondayUsageGrowthRate 本周资源增长比例
     */
    public String getThisMondayUsageGrowthRate() {
        return this.ThisMondayUsageGrowthRate;
    }

    /**
     * Set 本周资源增长比例
     * @param ThisMondayUsageGrowthRate 本周资源增长比例
     */
    public void setThisMondayUsageGrowthRate(String ThisMondayUsageGrowthRate) {
        this.ThisMondayUsageGrowthRate = ThisMondayUsageGrowthRate;
    }

    /**
     * Get 上周资源增长比例 
     * @return LastMondayUsageGrowthRate 上周资源增长比例
     */
    public String getLastMondayUsageGrowthRate() {
        return this.LastMondayUsageGrowthRate;
    }

    /**
     * Set 上周资源增长比例
     * @param LastMondayUsageGrowthRate 上周资源增长比例
     */
    public void setLastMondayUsageGrowthRate(String LastMondayUsageGrowthRate) {
        this.LastMondayUsageGrowthRate = LastMondayUsageGrowthRate;
    }

    public CloudDedicatedZoneResourceStatisticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudDedicatedZoneResourceStatisticsInfo(CloudDedicatedZoneResourceStatisticsInfo source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.UsageRate != null) {
            this.UsageRate = new String(source.UsageRate);
        }
        if (source.Remain != null) {
            this.Remain = new String(source.Remain);
        }
        if (source.RemainRate != null) {
            this.RemainRate = new String(source.RemainRate);
        }
        if (source.ThisMondayUsageRate != null) {
            this.ThisMondayUsageRate = new String(source.ThisMondayUsageRate);
        }
        if (source.ThisMondayUsageGrowthRate != null) {
            this.ThisMondayUsageGrowthRate = new String(source.ThisMondayUsageGrowthRate);
        }
        if (source.LastMondayUsageGrowthRate != null) {
            this.LastMondayUsageGrowthRate = new String(source.LastMondayUsageGrowthRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "UsageRate", this.UsageRate);
        this.setParamSimple(map, prefix + "Remain", this.Remain);
        this.setParamSimple(map, prefix + "RemainRate", this.RemainRate);
        this.setParamSimple(map, prefix + "ThisMondayUsageRate", this.ThisMondayUsageRate);
        this.setParamSimple(map, prefix + "ThisMondayUsageGrowthRate", this.ThisMondayUsageGrowthRate);
        this.setParamSimple(map, prefix + "LastMondayUsageGrowthRate", this.LastMondayUsageGrowthRate);

    }
}

