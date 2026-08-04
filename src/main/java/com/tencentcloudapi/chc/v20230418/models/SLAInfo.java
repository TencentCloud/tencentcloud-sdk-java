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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SLAInfo extends AbstractModel {

    /**
    * <p>SLA 状态</p><p>枚举值：</p><ul><li>InSLA： SLA 内</li><li>Overdue： 已超时</li><li>Completed： 已完成</li></ul>
    */
    @SerializedName("SLAStatus")
    @Expose
    private String SLAStatus;

    /**
    * <p>到期时间</p>
    */
    @SerializedName("DueTime")
    @Expose
    private String DueTime;

    /**
    * <p>剩余时长</p><p>单位：小时</p>
    */
    @SerializedName("RemainingHours")
    @Expose
    private Float RemainingHours;

    /**
    * <p>超时时长</p><p>单位：小时</p>
    */
    @SerializedName("OverdueHours")
    @Expose
    private Float OverdueHours;

    /**
    * <p>SLA 工作日天数</p><p>单位：天</p>
    */
    @SerializedName("SLADays")
    @Expose
    private Long SLADays;

    /**
     * Get <p>SLA 状态</p><p>枚举值：</p><ul><li>InSLA： SLA 内</li><li>Overdue： 已超时</li><li>Completed： 已完成</li></ul> 
     * @return SLAStatus <p>SLA 状态</p><p>枚举值：</p><ul><li>InSLA： SLA 内</li><li>Overdue： 已超时</li><li>Completed： 已完成</li></ul>
     */
    public String getSLAStatus() {
        return this.SLAStatus;
    }

    /**
     * Set <p>SLA 状态</p><p>枚举值：</p><ul><li>InSLA： SLA 内</li><li>Overdue： 已超时</li><li>Completed： 已完成</li></ul>
     * @param SLAStatus <p>SLA 状态</p><p>枚举值：</p><ul><li>InSLA： SLA 内</li><li>Overdue： 已超时</li><li>Completed： 已完成</li></ul>
     */
    public void setSLAStatus(String SLAStatus) {
        this.SLAStatus = SLAStatus;
    }

    /**
     * Get <p>到期时间</p> 
     * @return DueTime <p>到期时间</p>
     */
    public String getDueTime() {
        return this.DueTime;
    }

    /**
     * Set <p>到期时间</p>
     * @param DueTime <p>到期时间</p>
     */
    public void setDueTime(String DueTime) {
        this.DueTime = DueTime;
    }

    /**
     * Get <p>剩余时长</p><p>单位：小时</p> 
     * @return RemainingHours <p>剩余时长</p><p>单位：小时</p>
     */
    public Float getRemainingHours() {
        return this.RemainingHours;
    }

    /**
     * Set <p>剩余时长</p><p>单位：小时</p>
     * @param RemainingHours <p>剩余时长</p><p>单位：小时</p>
     */
    public void setRemainingHours(Float RemainingHours) {
        this.RemainingHours = RemainingHours;
    }

    /**
     * Get <p>超时时长</p><p>单位：小时</p> 
     * @return OverdueHours <p>超时时长</p><p>单位：小时</p>
     */
    public Float getOverdueHours() {
        return this.OverdueHours;
    }

    /**
     * Set <p>超时时长</p><p>单位：小时</p>
     * @param OverdueHours <p>超时时长</p><p>单位：小时</p>
     */
    public void setOverdueHours(Float OverdueHours) {
        this.OverdueHours = OverdueHours;
    }

    /**
     * Get <p>SLA 工作日天数</p><p>单位：天</p> 
     * @return SLADays <p>SLA 工作日天数</p><p>单位：天</p>
     */
    public Long getSLADays() {
        return this.SLADays;
    }

    /**
     * Set <p>SLA 工作日天数</p><p>单位：天</p>
     * @param SLADays <p>SLA 工作日天数</p><p>单位：天</p>
     */
    public void setSLADays(Long SLADays) {
        this.SLADays = SLADays;
    }

    public SLAInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SLAInfo(SLAInfo source) {
        if (source.SLAStatus != null) {
            this.SLAStatus = new String(source.SLAStatus);
        }
        if (source.DueTime != null) {
            this.DueTime = new String(source.DueTime);
        }
        if (source.RemainingHours != null) {
            this.RemainingHours = new Float(source.RemainingHours);
        }
        if (source.OverdueHours != null) {
            this.OverdueHours = new Float(source.OverdueHours);
        }
        if (source.SLADays != null) {
            this.SLADays = new Long(source.SLADays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SLAStatus", this.SLAStatus);
        this.setParamSimple(map, prefix + "DueTime", this.DueTime);
        this.setParamSimple(map, prefix + "RemainingHours", this.RemainingHours);
        this.setParamSimple(map, prefix + "OverdueHours", this.OverdueHours);
        this.setParamSimple(map, prefix + "SLADays", this.SLADays);

    }
}

