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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlaybackPolicy  extends AbstractModel{

    /**
    * 播放许可证的有效期
    */
    @SerializedName("LicenseDurationSeconds")
    @Expose
    private Integer LicenseDurationSeconds;

    /**
    * 开始播放后，允许最长播放时间
    */
    @SerializedName("PlaybackDurationSeconds")
    @Expose
    private Integer PlaybackDurationSeconds;

    /**
     * 获取播放许可证的有效期
     * @return LicenseDurationSeconds 播放许可证的有效期
     */
    public Integer getLicenseDurationSeconds() {
        return this.LicenseDurationSeconds;
    }

    /**
     * 设置播放许可证的有效期
     * @param LicenseDurationSeconds 播放许可证的有效期
     */
    public void setLicenseDurationSeconds(Integer LicenseDurationSeconds) {
        this.LicenseDurationSeconds = LicenseDurationSeconds;
    }

    /**
     * 获取开始播放后，允许最长播放时间
     * @return PlaybackDurationSeconds 开始播放后，允许最长播放时间
     */
    public Integer getPlaybackDurationSeconds() {
        return this.PlaybackDurationSeconds;
    }

    /**
     * 设置开始播放后，允许最长播放时间
     * @param PlaybackDurationSeconds 开始播放后，允许最长播放时间
     */
    public void setPlaybackDurationSeconds(Integer PlaybackDurationSeconds) {
        this.PlaybackDurationSeconds = PlaybackDurationSeconds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseDurationSeconds", this.LicenseDurationSeconds);
        this.setParamSimple(map, prefix + "PlaybackDurationSeconds", this.PlaybackDurationSeconds);

    }
}

