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

public class DashManifestInfo extends AbstractModel {

    /**
    * 每个清单的总持续时间（以秒为单位）。[30, 3600]，类型：整数，默认值60。
    */
    @SerializedName("Windows")
    @Expose
    private Long Windows;

    /**
    * 播放器在缓冲区中保持的最小缓存时间（以秒为单位）。[2, 60]，类型：整数，默认值30。
    */
    @SerializedName("MinBufferTime")
    @Expose
    private Long MinBufferTime;

    /**
    * 播放器在请求更新清单之前应等待的最短时间（以秒为单位）。[2, 60]，类型：整数，默认值2。
    */
    @SerializedName("MinUpdatePeriod")
    @Expose
    private Long MinUpdatePeriod;

    /**
    * 播放器启播时距离最新直播时间点的时间，是一个回退量（以秒为单位）。[2, 60]，类型：整数，默认值10。
    */
    @SerializedName("SuggestedPresentationDelay")
    @Expose
    private Long SuggestedPresentationDelay;

    /**
     * Get 每个清单的总持续时间（以秒为单位）。[30, 3600]，类型：整数，默认值60。 
     * @return Windows 每个清单的总持续时间（以秒为单位）。[30, 3600]，类型：整数，默认值60。
     */
    public Long getWindows() {
        return this.Windows;
    }

    /**
     * Set 每个清单的总持续时间（以秒为单位）。[30, 3600]，类型：整数，默认值60。
     * @param Windows 每个清单的总持续时间（以秒为单位）。[30, 3600]，类型：整数，默认值60。
     */
    public void setWindows(Long Windows) {
        this.Windows = Windows;
    }

    /**
     * Get 播放器在缓冲区中保持的最小缓存时间（以秒为单位）。[2, 60]，类型：整数，默认值30。 
     * @return MinBufferTime 播放器在缓冲区中保持的最小缓存时间（以秒为单位）。[2, 60]，类型：整数，默认值30。
     */
    public Long getMinBufferTime() {
        return this.MinBufferTime;
    }

    /**
     * Set 播放器在缓冲区中保持的最小缓存时间（以秒为单位）。[2, 60]，类型：整数，默认值30。
     * @param MinBufferTime 播放器在缓冲区中保持的最小缓存时间（以秒为单位）。[2, 60]，类型：整数，默认值30。
     */
    public void setMinBufferTime(Long MinBufferTime) {
        this.MinBufferTime = MinBufferTime;
    }

    /**
     * Get 播放器在请求更新清单之前应等待的最短时间（以秒为单位）。[2, 60]，类型：整数，默认值2。 
     * @return MinUpdatePeriod 播放器在请求更新清单之前应等待的最短时间（以秒为单位）。[2, 60]，类型：整数，默认值2。
     */
    public Long getMinUpdatePeriod() {
        return this.MinUpdatePeriod;
    }

    /**
     * Set 播放器在请求更新清单之前应等待的最短时间（以秒为单位）。[2, 60]，类型：整数，默认值2。
     * @param MinUpdatePeriod 播放器在请求更新清单之前应等待的最短时间（以秒为单位）。[2, 60]，类型：整数，默认值2。
     */
    public void setMinUpdatePeriod(Long MinUpdatePeriod) {
        this.MinUpdatePeriod = MinUpdatePeriod;
    }

    /**
     * Get 播放器启播时距离最新直播时间点的时间，是一个回退量（以秒为单位）。[2, 60]，类型：整数，默认值10。 
     * @return SuggestedPresentationDelay 播放器启播时距离最新直播时间点的时间，是一个回退量（以秒为单位）。[2, 60]，类型：整数，默认值10。
     */
    public Long getSuggestedPresentationDelay() {
        return this.SuggestedPresentationDelay;
    }

    /**
     * Set 播放器启播时距离最新直播时间点的时间，是一个回退量（以秒为单位）。[2, 60]，类型：整数，默认值10。
     * @param SuggestedPresentationDelay 播放器启播时距离最新直播时间点的时间，是一个回退量（以秒为单位）。[2, 60]，类型：整数，默认值10。
     */
    public void setSuggestedPresentationDelay(Long SuggestedPresentationDelay) {
        this.SuggestedPresentationDelay = SuggestedPresentationDelay;
    }

    public DashManifestInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashManifestInfo(DashManifestInfo source) {
        if (source.Windows != null) {
            this.Windows = new Long(source.Windows);
        }
        if (source.MinBufferTime != null) {
            this.MinBufferTime = new Long(source.MinBufferTime);
        }
        if (source.MinUpdatePeriod != null) {
            this.MinUpdatePeriod = new Long(source.MinUpdatePeriod);
        }
        if (source.SuggestedPresentationDelay != null) {
            this.SuggestedPresentationDelay = new Long(source.SuggestedPresentationDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Windows", this.Windows);
        this.setParamSimple(map, prefix + "MinBufferTime", this.MinBufferTime);
        this.setParamSimple(map, prefix + "MinUpdatePeriod", this.MinUpdatePeriod);
        this.setParamSimple(map, prefix + "SuggestedPresentationDelay", this.SuggestedPresentationDelay);

    }
}

