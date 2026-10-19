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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeUsageDetail extends AbstractModel {

    /**
    * <p>防护IP数</p><p>默认值：0</p>
    */
    @SerializedName("PublicIpUsed")
    @Expose
    private Long PublicIpUsed;

    /**
    * <p>防护实例数</p><p>默认值：0</p>
    */
    @SerializedName("InstanceUsed")
    @Expose
    private Long InstanceUsed;

    /**
    * <p>统计日期</p>
    */
    @SerializedName("StatDate")
    @Expose
    private String StatDate;

    /**
    * <p>处理流量</p>
    */
    @SerializedName("TodayTrafficGB")
    @Expose
    private Float TodayTrafficGB;

    /**
    * <p>防护天数</p>
    */
    @SerializedName("ProtectDays")
    @Expose
    private Long ProtectDays;

    /**
     * Get <p>防护IP数</p><p>默认值：0</p> 
     * @return PublicIpUsed <p>防护IP数</p><p>默认值：0</p>
     */
    public Long getPublicIpUsed() {
        return this.PublicIpUsed;
    }

    /**
     * Set <p>防护IP数</p><p>默认值：0</p>
     * @param PublicIpUsed <p>防护IP数</p><p>默认值：0</p>
     */
    public void setPublicIpUsed(Long PublicIpUsed) {
        this.PublicIpUsed = PublicIpUsed;
    }

    /**
     * Get <p>防护实例数</p><p>默认值：0</p> 
     * @return InstanceUsed <p>防护实例数</p><p>默认值：0</p>
     */
    public Long getInstanceUsed() {
        return this.InstanceUsed;
    }

    /**
     * Set <p>防护实例数</p><p>默认值：0</p>
     * @param InstanceUsed <p>防护实例数</p><p>默认值：0</p>
     */
    public void setInstanceUsed(Long InstanceUsed) {
        this.InstanceUsed = InstanceUsed;
    }

    /**
     * Get <p>统计日期</p> 
     * @return StatDate <p>统计日期</p>
     */
    public String getStatDate() {
        return this.StatDate;
    }

    /**
     * Set <p>统计日期</p>
     * @param StatDate <p>统计日期</p>
     */
    public void setStatDate(String StatDate) {
        this.StatDate = StatDate;
    }

    /**
     * Get <p>处理流量</p> 
     * @return TodayTrafficGB <p>处理流量</p>
     */
    public Float getTodayTrafficGB() {
        return this.TodayTrafficGB;
    }

    /**
     * Set <p>处理流量</p>
     * @param TodayTrafficGB <p>处理流量</p>
     */
    public void setTodayTrafficGB(Float TodayTrafficGB) {
        this.TodayTrafficGB = TodayTrafficGB;
    }

    /**
     * Get <p>防护天数</p> 
     * @return ProtectDays <p>防护天数</p>
     */
    public Long getProtectDays() {
        return this.ProtectDays;
    }

    /**
     * Set <p>防护天数</p>
     * @param ProtectDays <p>防护天数</p>
     */
    public void setProtectDays(Long ProtectDays) {
        this.ProtectDays = ProtectDays;
    }

    public VolumeUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeUsageDetail(VolumeUsageDetail source) {
        if (source.PublicIpUsed != null) {
            this.PublicIpUsed = new Long(source.PublicIpUsed);
        }
        if (source.InstanceUsed != null) {
            this.InstanceUsed = new Long(source.InstanceUsed);
        }
        if (source.StatDate != null) {
            this.StatDate = new String(source.StatDate);
        }
        if (source.TodayTrafficGB != null) {
            this.TodayTrafficGB = new Float(source.TodayTrafficGB);
        }
        if (source.ProtectDays != null) {
            this.ProtectDays = new Long(source.ProtectDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicIpUsed", this.PublicIpUsed);
        this.setParamSimple(map, prefix + "InstanceUsed", this.InstanceUsed);
        this.setParamSimple(map, prefix + "StatDate", this.StatDate);
        this.setParamSimple(map, prefix + "TodayTrafficGB", this.TodayTrafficGB);
        this.setParamSimple(map, prefix + "ProtectDays", this.ProtectDays);

    }
}

