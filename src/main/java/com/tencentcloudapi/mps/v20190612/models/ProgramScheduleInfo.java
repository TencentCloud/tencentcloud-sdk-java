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

public class ProgramScheduleInfo extends AbstractModel {

    /**
    * <p>program名称。</p>
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
    * <p>program id。</p>
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * <p>source类型。</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>source id。</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>source location的id。</p>
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * <p>开始时间戳。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>持续时长。</p>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get <p>program名称。</p> 
     * @return ProgramName <p>program名称。</p>
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set <p>program名称。</p>
     * @param ProgramName <p>program名称。</p>
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    /**
     * Get <p>program id。</p> 
     * @return ProgramId <p>program id。</p>
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set <p>program id。</p>
     * @param ProgramId <p>program id。</p>
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get <p>source类型。</p> 
     * @return SourceType <p>source类型。</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>source类型。</p>
     * @param SourceType <p>source类型。</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>source id。</p> 
     * @return SourceId <p>source id。</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>source id。</p>
     * @param SourceId <p>source id。</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>source location的id。</p> 
     * @return SourceLocationId <p>source location的id。</p>
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set <p>source location的id。</p>
     * @param SourceLocationId <p>source location的id。</p>
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get <p>开始时间戳。</p> 
     * @return StartTime <p>开始时间戳。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间戳。</p>
     * @param StartTime <p>开始时间戳。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>持续时长。</p> 
     * @return Duration <p>持续时长。</p>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>持续时长。</p>
     * @param Duration <p>持续时长。</p>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public ProgramScheduleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProgramScheduleInfo(ProgramScheduleInfo source) {
        if (source.ProgramName != null) {
            this.ProgramName = new String(source.ProgramName);
        }
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceLocationId != null) {
            this.SourceLocationId = new String(source.SourceLocationId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

