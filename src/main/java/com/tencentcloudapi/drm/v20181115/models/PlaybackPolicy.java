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
    * <p>播放许可证的有效期</p><p>单位：秒</p>
    */
    @SerializedName("LicenseDurationSeconds")
    @Expose
    private Long LicenseDurationSeconds;

    /**
    * <p>开始播放后，允许最长播放时间</p><p>单位：秒</p>
    */
    @SerializedName("PlaybackDurationSeconds")
    @Expose
    private Long PlaybackDurationSeconds;

    /**
    * <p>是否允许下发离线license</p><p>默认值：false</p><p>widevine方案，<br>当CanPersistent为true时，根据license request中请求的是online还是offline license自动匹配下发。<br>当CanPersistent为false时，只下发online license。</p><p>fairplay方案。<br>当CanPersistent为true时，只下发offline license。<br>当CanPersistent为false时，只下发online license。</p>
    */
    @SerializedName("CanPersistent")
    @Expose
    private Boolean CanPersistent;

    /**
     * Get <p>播放许可证的有效期</p><p>单位：秒</p> 
     * @return LicenseDurationSeconds <p>播放许可证的有效期</p><p>单位：秒</p>
     */
    public Long getLicenseDurationSeconds() {
        return this.LicenseDurationSeconds;
    }

    /**
     * Set <p>播放许可证的有效期</p><p>单位：秒</p>
     * @param LicenseDurationSeconds <p>播放许可证的有效期</p><p>单位：秒</p>
     */
    public void setLicenseDurationSeconds(Long LicenseDurationSeconds) {
        this.LicenseDurationSeconds = LicenseDurationSeconds;
    }

    /**
     * Get <p>开始播放后，允许最长播放时间</p><p>单位：秒</p> 
     * @return PlaybackDurationSeconds <p>开始播放后，允许最长播放时间</p><p>单位：秒</p>
     */
    public Long getPlaybackDurationSeconds() {
        return this.PlaybackDurationSeconds;
    }

    /**
     * Set <p>开始播放后，允许最长播放时间</p><p>单位：秒</p>
     * @param PlaybackDurationSeconds <p>开始播放后，允许最长播放时间</p><p>单位：秒</p>
     */
    public void setPlaybackDurationSeconds(Long PlaybackDurationSeconds) {
        this.PlaybackDurationSeconds = PlaybackDurationSeconds;
    }

    /**
     * Get <p>是否允许下发离线license</p><p>默认值：false</p><p>widevine方案，<br>当CanPersistent为true时，根据license request中请求的是online还是offline license自动匹配下发。<br>当CanPersistent为false时，只下发online license。</p><p>fairplay方案。<br>当CanPersistent为true时，只下发offline license。<br>当CanPersistent为false时，只下发online license。</p> 
     * @return CanPersistent <p>是否允许下发离线license</p><p>默认值：false</p><p>widevine方案，<br>当CanPersistent为true时，根据license request中请求的是online还是offline license自动匹配下发。<br>当CanPersistent为false时，只下发online license。</p><p>fairplay方案。<br>当CanPersistent为true时，只下发offline license。<br>当CanPersistent为false时，只下发online license。</p>
     */
    public Boolean getCanPersistent() {
        return this.CanPersistent;
    }

    /**
     * Set <p>是否允许下发离线license</p><p>默认值：false</p><p>widevine方案，<br>当CanPersistent为true时，根据license request中请求的是online还是offline license自动匹配下发。<br>当CanPersistent为false时，只下发online license。</p><p>fairplay方案。<br>当CanPersistent为true时，只下发offline license。<br>当CanPersistent为false时，只下发online license。</p>
     * @param CanPersistent <p>是否允许下发离线license</p><p>默认值：false</p><p>widevine方案，<br>当CanPersistent为true时，根据license request中请求的是online还是offline license自动匹配下发。<br>当CanPersistent为false时，只下发online license。</p><p>fairplay方案。<br>当CanPersistent为true时，只下发offline license。<br>当CanPersistent为false时，只下发online license。</p>
     */
    public void setCanPersistent(Boolean CanPersistent) {
        this.CanPersistent = CanPersistent;
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
        if (source.CanPersistent != null) {
            this.CanPersistent = new Boolean(source.CanPersistent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseDurationSeconds", this.LicenseDurationSeconds);
        this.setParamSimple(map, prefix + "PlaybackDurationSeconds", this.PlaybackDurationSeconds);
        this.setParamSimple(map, prefix + "CanPersistent", this.CanPersistent);

    }
}

