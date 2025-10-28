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

public class StreamSelector extends AbstractModel {

    /**
    * 选择类型: PID | TRACK
    */
    @SerializedName("SelectorType")
    @Expose
    private String SelectorType;

    /**
    * 根据 PID 配置选择器
    */
    @SerializedName("PidSelector")
    @Expose
    private PidSelector PidSelector;

    /**
    * 根据 Track 配置选择器
    */
    @SerializedName("TrackSelector")
    @Expose
    private TrackSelector TrackSelector;

    /**
     * Get 选择类型: PID | TRACK 
     * @return SelectorType 选择类型: PID | TRACK
     */
    public String getSelectorType() {
        return this.SelectorType;
    }

    /**
     * Set 选择类型: PID | TRACK
     * @param SelectorType 选择类型: PID | TRACK
     */
    public void setSelectorType(String SelectorType) {
        this.SelectorType = SelectorType;
    }

    /**
     * Get 根据 PID 配置选择器 
     * @return PidSelector 根据 PID 配置选择器
     */
    public PidSelector getPidSelector() {
        return this.PidSelector;
    }

    /**
     * Set 根据 PID 配置选择器
     * @param PidSelector 根据 PID 配置选择器
     */
    public void setPidSelector(PidSelector PidSelector) {
        this.PidSelector = PidSelector;
    }

    /**
     * Get 根据 Track 配置选择器 
     * @return TrackSelector 根据 Track 配置选择器
     */
    public TrackSelector getTrackSelector() {
        return this.TrackSelector;
    }

    /**
     * Set 根据 Track 配置选择器
     * @param TrackSelector 根据 Track 配置选择器
     */
    public void setTrackSelector(TrackSelector TrackSelector) {
        this.TrackSelector = TrackSelector;
    }

    public StreamSelector() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamSelector(StreamSelector source) {
        if (source.SelectorType != null) {
            this.SelectorType = new String(source.SelectorType);
        }
        if (source.PidSelector != null) {
            this.PidSelector = new PidSelector(source.PidSelector);
        }
        if (source.TrackSelector != null) {
            this.TrackSelector = new TrackSelector(source.TrackSelector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SelectorType", this.SelectorType);
        this.setParamObj(map, prefix + "PidSelector.", this.PidSelector);
        this.setParamObj(map, prefix + "TrackSelector.", this.TrackSelector);

    }
}

