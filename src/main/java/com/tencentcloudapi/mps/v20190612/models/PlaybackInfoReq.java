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

public class PlaybackInfoReq extends AbstractModel {

    /**
    * program启动方式，直播只支持Absolute，点播还支持Relative。PlaybackMode类型为Linear的VOD支持Absolute和Relative。PlaybackMode类型为Loop的VOD只支持Relative
    */
    @SerializedName("TransitionType")
    @Expose
    private String TransitionType;

    /**
    * unix时间戳，absolute场景下program的开始执行时间。最多大于当前90天（7776000）。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * program持续时间，单位毫秒，直播有效。支持600000-86400000。默认600000。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 和所选program的插入顺序关系，分After和Before。
    */
    @SerializedName("RelativePosition")
    @Expose
    private String RelativePosition;

    /**
    * 所选的插入参考program id。
    */
    @SerializedName("RelativeProgramId")
    @Expose
    private String RelativeProgramId;

    /**
    * 垫片配置。
    */
    @SerializedName("ClipRangeConf")
    @Expose
    private ClipRangeInfo ClipRangeConf;

    /**
     * Get program启动方式，直播只支持Absolute，点播还支持Relative。PlaybackMode类型为Linear的VOD支持Absolute和Relative。PlaybackMode类型为Loop的VOD只支持Relative 
     * @return TransitionType program启动方式，直播只支持Absolute，点播还支持Relative。PlaybackMode类型为Linear的VOD支持Absolute和Relative。PlaybackMode类型为Loop的VOD只支持Relative
     */
    public String getTransitionType() {
        return this.TransitionType;
    }

    /**
     * Set program启动方式，直播只支持Absolute，点播还支持Relative。PlaybackMode类型为Linear的VOD支持Absolute和Relative。PlaybackMode类型为Loop的VOD只支持Relative
     * @param TransitionType program启动方式，直播只支持Absolute，点播还支持Relative。PlaybackMode类型为Linear的VOD支持Absolute和Relative。PlaybackMode类型为Loop的VOD只支持Relative
     */
    public void setTransitionType(String TransitionType) {
        this.TransitionType = TransitionType;
    }

    /**
     * Get unix时间戳，absolute场景下program的开始执行时间。最多大于当前90天（7776000）。 
     * @return StartTime unix时间戳，absolute场景下program的开始执行时间。最多大于当前90天（7776000）。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set unix时间戳，absolute场景下program的开始执行时间。最多大于当前90天（7776000）。
     * @param StartTime unix时间戳，absolute场景下program的开始执行时间。最多大于当前90天（7776000）。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get program持续时间，单位毫秒，直播有效。支持600000-86400000。默认600000。 
     * @return Duration program持续时间，单位毫秒，直播有效。支持600000-86400000。默认600000。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set program持续时间，单位毫秒，直播有效。支持600000-86400000。默认600000。
     * @param Duration program持续时间，单位毫秒，直播有效。支持600000-86400000。默认600000。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 和所选program的插入顺序关系，分After和Before。 
     * @return RelativePosition 和所选program的插入顺序关系，分After和Before。
     */
    public String getRelativePosition() {
        return this.RelativePosition;
    }

    /**
     * Set 和所选program的插入顺序关系，分After和Before。
     * @param RelativePosition 和所选program的插入顺序关系，分After和Before。
     */
    public void setRelativePosition(String RelativePosition) {
        this.RelativePosition = RelativePosition;
    }

    /**
     * Get 所选的插入参考program id。 
     * @return RelativeProgramId 所选的插入参考program id。
     */
    public String getRelativeProgramId() {
        return this.RelativeProgramId;
    }

    /**
     * Set 所选的插入参考program id。
     * @param RelativeProgramId 所选的插入参考program id。
     */
    public void setRelativeProgramId(String RelativeProgramId) {
        this.RelativeProgramId = RelativeProgramId;
    }

    /**
     * Get 垫片配置。 
     * @return ClipRangeConf 垫片配置。
     */
    public ClipRangeInfo getClipRangeConf() {
        return this.ClipRangeConf;
    }

    /**
     * Set 垫片配置。
     * @param ClipRangeConf 垫片配置。
     */
    public void setClipRangeConf(ClipRangeInfo ClipRangeConf) {
        this.ClipRangeConf = ClipRangeConf;
    }

    public PlaybackInfoReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlaybackInfoReq(PlaybackInfoReq source) {
        if (source.TransitionType != null) {
            this.TransitionType = new String(source.TransitionType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransitionType", this.TransitionType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RelativePosition", this.RelativePosition);
        this.setParamSimple(map, prefix + "RelativeProgramId", this.RelativeProgramId);
        this.setParamObj(map, prefix + "ClipRangeConf.", this.ClipRangeConf);

    }
}

