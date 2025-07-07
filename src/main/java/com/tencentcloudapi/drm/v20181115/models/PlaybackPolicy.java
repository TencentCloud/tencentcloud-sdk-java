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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlaybackPolicy extends AbstractModel {

    /**
    * 播放许可证的有效期
    */
    @SerializedName("LicenseDurationSeconds")
    @Expose
    private Long LicenseDurationSeconds;

    /**
    * 开始播放后，允许最长播放时间
    */
    @SerializedName("PlaybackDurationSeconds")
    @Expose
    private Long PlaybackDurationSeconds;

    /**
     * Get 播放许可证的有效期 
     * @return LicenseDurationSeconds 播放许可证的有效期
     */
    public Long getLicenseDurationSeconds() {
        return this.LicenseDurationSeconds;
    }

    /**
     * Set 播放许可证的有效期
     * @param LicenseDurationSeconds 播放许可证的有效期
     */
    public void setLicenseDurationSeconds(Long LicenseDurationSeconds) {
        this.LicenseDurationSeconds = LicenseDurationSeconds;
    }

    /**
     * Get 开始播放后，允许最长播放时间 
     * @return PlaybackDurationSeconds 开始播放后，允许最长播放时间
     */
    public Long getPlaybackDurationSeconds() {
        return this.PlaybackDurationSeconds;
    }

    /**
     * Set 开始播放后，允许最长播放时间
     * @param PlaybackDurationSeconds 开始播放后，允许最长播放时间
     */
    public void setPlaybackDurationSeconds(Long PlaybackDurationSeconds) {
        this.PlaybackDurationSeconds = PlaybackDurationSeconds;
    }

    public PlaybackPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlaybackPolicy(PlaybackPolicy source) {
        if (source.LicenseDurationSeconds != null) {
            this.LicenseDurationSeconds = new Long(source.LicenseDurationSeconds);
        }
        if (source.PlaybackDurationSeconds != null) {
            this.PlaybackDurationSeconds = new Long(source.PlaybackDurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseDurationSeconds", this.LicenseDurationSeconds);
        this.setParamSimple(map, prefix + "PlaybackDurationSeconds", this.PlaybackDurationSeconds);

    }
}

