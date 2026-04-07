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

public class PlaybackInfo extends AbstractModel {

    /**
    * <p>program持续时间，单位毫秒，直播有效。</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>program启动方式，直播只支持Absolute，点播还支持Relative。</p>
    */
    @SerializedName("TransitionType")
    @Expose
    private String TransitionType;

    /**
    * <p>unix时间戳，Absolute场景下program的开始执行时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>和所选program的插入顺序关系，分After和Before。</p>
    */
    @SerializedName("RelativePosition")
    @Expose
    private String RelativePosition;

    /**
    * <p>所选的插入参考program id。</p>
    */
    @SerializedName("RelativeProgramId")
    @Expose
    private String RelativeProgramId;

    /**
    * <p>垫片配置。</p>
    */
    @SerializedName("ClipRangeConf")
    @Expose
    private ClipRangeInfo ClipRangeConf;

    /**
    * <p>RelativeProgramName。</p>
    */
    @SerializedName("RelativeProgramName")
    @Expose
    private String RelativeProgramName;

    /**
     * Get <p>program持续时间，单位毫秒，直播有效。</p> 
     * @return Duration <p>program持续时间，单位毫秒，直播有效。</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>program持续时间，单位毫秒，直播有效。</p>
     * @param Duration <p>program持续时间，单位毫秒，直播有效。</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>program启动方式，直播只支持Absolute，点播还支持Relative。</p> 
     * @return TransitionType <p>program启动方式，直播只支持Absolute，点播还支持Relative。</p>
     */
    public String getTransitionType() {
        return this.TransitionType;
    }

    /**
     * Set <p>program启动方式，直播只支持Absolute，点播还支持Relative。</p>
     * @param TransitionType <p>program启动方式，直播只支持Absolute，点播还支持Relative。</p>
     */
    public void setTransitionType(String TransitionType) {
        this.TransitionType = TransitionType;
    }

    /**
     * Get <p>unix时间戳，Absolute场景下program的开始执行时间。</p> 
     * @return StartTime <p>unix时间戳，Absolute场景下program的开始执行时间。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>unix时间戳，Absolute场景下program的开始执行时间。</p>
     * @param StartTime <p>unix时间戳，Absolute场景下program的开始执行时间。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>和所选program的插入顺序关系，分After和Before。</p> 
     * @return RelativePosition <p>和所选program的插入顺序关系，分After和Before。</p>
     */
    public String getRelativePosition() {
        return this.RelativePosition;
    }

    /**
     * Set <p>和所选program的插入顺序关系，分After和Before。</p>
     * @param RelativePosition <p>和所选program的插入顺序关系，分After和Before。</p>
     */
    public void setRelativePosition(String RelativePosition) {
        this.RelativePosition = RelativePosition;
    }

    /**
     * Get <p>所选的插入参考program id。</p> 
     * @return RelativeProgramId <p>所选的插入参考program id。</p>
     */
    public String getRelativeProgramId() {
        return this.RelativeProgramId;
    }

    /**
     * Set <p>所选的插入参考program id。</p>
     * @param RelativeProgramId <p>所选的插入参考program id。</p>
     */
    public void setRelativeProgramId(String RelativeProgramId) {
        this.RelativeProgramId = RelativeProgramId;
    }

    /**
     * Get <p>垫片配置。</p> 
     * @return ClipRangeConf <p>垫片配置。</p>
     */
    public ClipRangeInfo getClipRangeConf() {
        return this.ClipRangeConf;
    }

    /**
     * Set <p>垫片配置。</p>
     * @param ClipRangeConf <p>垫片配置。</p>
     */
    public void setClipRangeConf(ClipRangeInfo ClipRangeConf) {
        this.ClipRangeConf = ClipRangeConf;
    }

    /**
     * Get <p>RelativeProgramName。</p> 
     * @return RelativeProgramName <p>RelativeProgramName。</p>
     */
    public String getRelativeProgramName() {
        return this.RelativeProgramName;
    }

    /**
     * Set <p>RelativeProgramName。</p>
     * @param RelativeProgramName <p>RelativeProgramName。</p>
     */
    public void setRelativeProgramName(String RelativeProgramName) {
        this.RelativeProgramName = RelativeProgramName;
    }

    public PlaybackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlaybackInfo(PlaybackInfo source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.TransitionType != null) {
            this.TransitionType = new String(source.TransitionType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.RelativePosition != null) {
            this.RelativePosition = new String(source.RelativePosition);
        }
        if (source.RelativeProgramId != null) {
            this.RelativeProgramId = new String(source.RelativeProgramId);
        }
        if (source.ClipRangeConf != null) {
            this.ClipRangeConf = new ClipRangeInfo(source.ClipRangeConf);
        }
        if (source.RelativeProgramName != null) {
            this.RelativeProgramName = new String(source.RelativeProgramName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "TransitionType", this.TransitionType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RelativePosition", this.RelativePosition);
        this.setParamSimple(map, prefix + "RelativeProgramId", this.RelativeProgramId);
        this.setParamObj(map, prefix + "ClipRangeConf.", this.ClipRangeConf);
        this.setParamSimple(map, prefix + "RelativeProgramName", this.RelativeProgramName);

    }
}

