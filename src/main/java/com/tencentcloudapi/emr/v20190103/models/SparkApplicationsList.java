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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparkApplicationsList extends AbstractModel {

    /**
    * 应用id
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 持续时间
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 核数*秒
    */
    @SerializedName("CoreSeconds")
    @Expose
    private Long CoreSeconds;

    /**
    * 内存MB*秒
    */
    @SerializedName("MemorySeconds")
    @Expose
    private String MemorySeconds;

    /**
    * 洞察结果
    */
    @SerializedName("Insight")
    @Expose
    private String Insight;

    /**
     * Get 应用id 
     * @return ID 应用id
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 应用id
     * @param ID 应用id
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 应用名称 
     * @return Name 应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称
     * @param Name 应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户 
     * @return User 用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户
     * @param User 用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 持续时间 
     * @return Duration 持续时间
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 持续时间
     * @param Duration 持续时间
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 状态 
     * @return State 状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
     * @param State 状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 类型 
     * @return ApplicationType 类型
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 类型
     * @param ApplicationType 类型
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 核数*秒 
     * @return CoreSeconds 核数*秒
     */
    public Long getCoreSeconds() {
        return this.CoreSeconds;
    }

    /**
     * Set 核数*秒
     * @param CoreSeconds 核数*秒
     */
    public void setCoreSeconds(Long CoreSeconds) {
        this.CoreSeconds = CoreSeconds;
    }

    /**
     * Get 内存MB*秒 
     * @return MemorySeconds 内存MB*秒
     */
    public String getMemorySeconds() {
        return this.MemorySeconds;
    }

    /**
     * Set 内存MB*秒
     * @param MemorySeconds 内存MB*秒
     */
    public void setMemorySeconds(String MemorySeconds) {
        this.MemorySeconds = MemorySeconds;
    }

    /**
     * Get 洞察结果 
     * @return Insight 洞察结果
     */
    public String getInsight() {
        return this.Insight;
    }

    /**
     * Set 洞察结果
     * @param Insight 洞察结果
     */
    public void setInsight(String Insight) {
        this.Insight = Insight;
    }

    public SparkApplicationsList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkApplicationsList(SparkApplicationsList source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.CoreSeconds != null) {
            this.CoreSeconds = new Long(source.CoreSeconds);
        }
        if (source.MemorySeconds != null) {
            this.MemorySeconds = new String(source.MemorySeconds);
        }
        if (source.Insight != null) {
            this.Insight = new String(source.Insight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "CoreSeconds", this.CoreSeconds);
        this.setParamSimple(map, prefix + "MemorySeconds", this.MemorySeconds);
        this.setParamSimple(map, prefix + "Insight", this.Insight);

    }
}

