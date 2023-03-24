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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastPlayInfo extends AbstractModel{

    /**
    * 点播转直播项目运行状态，取值有：
<li> Working : 运行中；</li>
<li> Idle: 空闲状态。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前播放的输入源 Id。
    */
    @SerializedName("CurrentSourceId")
    @Expose
    private String CurrentSourceId;

    /**
    * 当前播放的输入源的播放位置，单位：秒。
    */
    @SerializedName("CurrentSourcePosition")
    @Expose
    private Float CurrentSourcePosition;

    /**
    * 当前播放的输入源时长，单位：秒。
    */
    @SerializedName("CurrentSourceDuration")
    @Expose
    private Float CurrentSourceDuration;

    /**
    * 输出源状态信息。
    */
    @SerializedName("DestinationStatusSet")
    @Expose
    private MediaCastDestinationStatus [] DestinationStatusSet;

    /**
    * 已经循环播放的次数。
    */
    @SerializedName("LoopCount")
    @Expose
    private Long LoopCount;

    /**
     * Get 点播转直播项目运行状态，取值有：
<li> Working : 运行中；</li>
<li> Idle: 空闲状态。</li> 
     * @return Status 点播转直播项目运行状态，取值有：
<li> Working : 运行中；</li>
<li> Idle: 空闲状态。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 点播转直播项目运行状态，取值有：
<li> Working : 运行中；</li>
<li> Idle: 空闲状态。</li>
     * @param Status 点播转直播项目运行状态，取值有：
<li> Working : 运行中；</li>
<li> Idle: 空闲状态。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前播放的输入源 Id。 
     * @return CurrentSourceId 当前播放的输入源 Id。
     */
    public String getCurrentSourceId() {
        return this.CurrentSourceId;
    }

    /**
     * Set 当前播放的输入源 Id。
     * @param CurrentSourceId 当前播放的输入源 Id。
     */
    public void setCurrentSourceId(String CurrentSourceId) {
        this.CurrentSourceId = CurrentSourceId;
    }

    /**
     * Get 当前播放的输入源的播放位置，单位：秒。 
     * @return CurrentSourcePosition 当前播放的输入源的播放位置，单位：秒。
     */
    public Float getCurrentSourcePosition() {
        return this.CurrentSourcePosition;
    }

    /**
     * Set 当前播放的输入源的播放位置，单位：秒。
     * @param CurrentSourcePosition 当前播放的输入源的播放位置，单位：秒。
     */
    public void setCurrentSourcePosition(Float CurrentSourcePosition) {
        this.CurrentSourcePosition = CurrentSourcePosition;
    }

    /**
     * Get 当前播放的输入源时长，单位：秒。 
     * @return CurrentSourceDuration 当前播放的输入源时长，单位：秒。
     */
    public Float getCurrentSourceDuration() {
        return this.CurrentSourceDuration;
    }

    /**
     * Set 当前播放的输入源时长，单位：秒。
     * @param CurrentSourceDuration 当前播放的输入源时长，单位：秒。
     */
    public void setCurrentSourceDuration(Float CurrentSourceDuration) {
        this.CurrentSourceDuration = CurrentSourceDuration;
    }

    /**
     * Get 输出源状态信息。 
     * @return DestinationStatusSet 输出源状态信息。
     */
    public MediaCastDestinationStatus [] getDestinationStatusSet() {
        return this.DestinationStatusSet;
    }

    /**
     * Set 输出源状态信息。
     * @param DestinationStatusSet 输出源状态信息。
     */
    public void setDestinationStatusSet(MediaCastDestinationStatus [] DestinationStatusSet) {
        this.DestinationStatusSet = DestinationStatusSet;
    }

    /**
     * Get 已经循环播放的次数。 
     * @return LoopCount 已经循环播放的次数。
     */
    public Long getLoopCount() {
        return this.LoopCount;
    }

    /**
     * Set 已经循环播放的次数。
     * @param LoopCount 已经循环播放的次数。
     */
    public void setLoopCount(Long LoopCount) {
        this.LoopCount = LoopCount;
    }

    public MediaCastPlayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastPlayInfo(MediaCastPlayInfo source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CurrentSourceId != null) {
            this.CurrentSourceId = new String(source.CurrentSourceId);
        }
        if (source.CurrentSourcePosition != null) {
            this.CurrentSourcePosition = new Float(source.CurrentSourcePosition);
        }
        if (source.CurrentSourceDuration != null) {
            this.CurrentSourceDuration = new Float(source.CurrentSourceDuration);
        }
        if (source.DestinationStatusSet != null) {
            this.DestinationStatusSet = new MediaCastDestinationStatus[source.DestinationStatusSet.length];
            for (int i = 0; i < source.DestinationStatusSet.length; i++) {
                this.DestinationStatusSet[i] = new MediaCastDestinationStatus(source.DestinationStatusSet[i]);
            }
        }
        if (source.LoopCount != null) {
            this.LoopCount = new Long(source.LoopCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CurrentSourceId", this.CurrentSourceId);
        this.setParamSimple(map, prefix + "CurrentSourcePosition", this.CurrentSourcePosition);
        this.setParamSimple(map, prefix + "CurrentSourceDuration", this.CurrentSourceDuration);
        this.setParamArrayObj(map, prefix + "DestinationStatusSet.", this.DestinationStatusSet);
        this.setParamSimple(map, prefix + "LoopCount", this.LoopCount);

    }
}

