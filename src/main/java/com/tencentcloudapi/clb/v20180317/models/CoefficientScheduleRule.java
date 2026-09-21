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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoefficientScheduleRule extends AbstractModel {

    /**
    * <p>1～7，表示周一至周日</p>
    */
    @SerializedName("Weekdays")
    @Expose
    private Long [] Weekdays;

    /**
    * <p>00:00～23:59，固定 UTC+8，窗口左闭</p><p>参数格式：HH:mm</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>大于 StartTime，最大 24:00，窗口右开；跨午夜拆分并调整星期</p><p>参数格式：HH:mm</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>有限非负数，建议最多 6 位小数；0 免费、0.5 半价、1 原价，可大于 1；倍率计算后的价格须在服务支持的数值范围内</p>
    */
    @SerializedName("Multiplier")
    @Expose
    private Float Multiplier;

    /**
     * Get <p>1～7，表示周一至周日</p> 
     * @return Weekdays <p>1～7，表示周一至周日</p>
     */
    public Long [] getWeekdays() {
        return this.Weekdays;
    }

    /**
     * Set <p>1～7，表示周一至周日</p>
     * @param Weekdays <p>1～7，表示周一至周日</p>
     */
    public void setWeekdays(Long [] Weekdays) {
        this.Weekdays = Weekdays;
    }

    /**
     * Get <p>00:00～23:59，固定 UTC+8，窗口左闭</p><p>参数格式：HH:mm</p> 
     * @return StartTime <p>00:00～23:59，固定 UTC+8，窗口左闭</p><p>参数格式：HH:mm</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>00:00～23:59，固定 UTC+8，窗口左闭</p><p>参数格式：HH:mm</p>
     * @param StartTime <p>00:00～23:59，固定 UTC+8，窗口左闭</p><p>参数格式：HH:mm</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>大于 StartTime，最大 24:00，窗口右开；跨午夜拆分并调整星期</p><p>参数格式：HH:mm</p> 
     * @return EndTime <p>大于 StartTime，最大 24:00，窗口右开；跨午夜拆分并调整星期</p><p>参数格式：HH:mm</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>大于 StartTime，最大 24:00，窗口右开；跨午夜拆分并调整星期</p><p>参数格式：HH:mm</p>
     * @param EndTime <p>大于 StartTime，最大 24:00，窗口右开；跨午夜拆分并调整星期</p><p>参数格式：HH:mm</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>有限非负数，建议最多 6 位小数；0 免费、0.5 半价、1 原价，可大于 1；倍率计算后的价格须在服务支持的数值范围内</p> 
     * @return Multiplier <p>有限非负数，建议最多 6 位小数；0 免费、0.5 半价、1 原价，可大于 1；倍率计算后的价格须在服务支持的数值范围内</p>
     */
    public Float getMultiplier() {
        return this.Multiplier;
    }

    /**
     * Set <p>有限非负数，建议最多 6 位小数；0 免费、0.5 半价、1 原价，可大于 1；倍率计算后的价格须在服务支持的数值范围内</p>
     * @param Multiplier <p>有限非负数，建议最多 6 位小数；0 免费、0.5 半价、1 原价，可大于 1；倍率计算后的价格须在服务支持的数值范围内</p>
     */
    public void setMultiplier(Float Multiplier) {
        this.Multiplier = Multiplier;
    }

    public CoefficientScheduleRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoefficientScheduleRule(CoefficientScheduleRule source) {
        if (source.Weekdays != null) {
            this.Weekdays = new Long[source.Weekdays.length];
            for (int i = 0; i < source.Weekdays.length; i++) {
                this.Weekdays[i] = new Long(source.Weekdays[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Multiplier != null) {
            this.Multiplier = new Float(source.Multiplier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Weekdays.", this.Weekdays);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Multiplier", this.Multiplier);

    }
}

