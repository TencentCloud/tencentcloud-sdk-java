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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssemblyUsageDetail extends AbstractModel {

    /**
    * <p>频道id</p>
    */
    @SerializedName("ChannelID")
    @Expose
    private String ChannelID;

    /**
    * <p>日期</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>查询开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>持续时间</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>频道类型</p>
    */
    @SerializedName("ChannelTier")
    @Expose
    private String ChannelTier;

    /**
    * <p>频道名称</p>
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
     * Get <p>频道id</p> 
     * @return ChannelID <p>频道id</p>
     */
    public String getChannelID() {
        return this.ChannelID;
    }

    /**
     * Set <p>频道id</p>
     * @param ChannelID <p>频道id</p>
     */
    public void setChannelID(String ChannelID) {
        this.ChannelID = ChannelID;
    }

    /**
     * Get <p>日期</p> 
     * @return Date <p>日期</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>日期</p>
     * @param Date <p>日期</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>查询开始时间</p> 
     * @return StartTime <p>查询开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间</p>
     * @param StartTime <p>查询开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间</p> 
     * @return EndTime <p>查询结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间</p>
     * @param EndTime <p>查询结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>持续时间</p> 
     * @return Duration <p>持续时间</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>持续时间</p>
     * @param Duration <p>持续时间</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>频道类型</p> 
     * @return ChannelTier <p>频道类型</p>
     */
    public String getChannelTier() {
        return this.ChannelTier;
    }

    /**
     * Set <p>频道类型</p>
     * @param ChannelTier <p>频道类型</p>
     */
    public void setChannelTier(String ChannelTier) {
        this.ChannelTier = ChannelTier;
    }

    /**
     * Get <p>频道名称</p> 
     * @return ChannelName <p>频道名称</p>
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>频道名称</p>
     * @param ChannelName <p>频道名称</p>
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public AssemblyUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssemblyUsageDetail(AssemblyUsageDetail source) {
        if (source.ChannelID != null) {
            this.ChannelID = new String(source.ChannelID);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ChannelTier != null) {
            this.ChannelTier = new String(source.ChannelTier);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelID", this.ChannelID);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ChannelTier", this.ChannelTier);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);

    }
}

