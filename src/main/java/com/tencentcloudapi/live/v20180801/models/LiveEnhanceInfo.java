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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveEnhanceInfo extends AbstractModel {

    /**
    * 域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 时间。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 计费时长，单位分钟。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 帧率。
    */
    @SerializedName("Fps")
    @Expose
    private String Fps;

    /**
    * 分辨率。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 增强服务类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 域名。 
     * @return Domain 域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名。
     * @param Domain 域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 时间。 
     * @return Time 时间。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间。
     * @param Time 时间。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 计费时长，单位分钟。 
     * @return Duration 计费时长，单位分钟。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 计费时长，单位分钟。
     * @param Duration 计费时长，单位分钟。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 帧率。 
     * @return Fps 帧率。
     */
    public String getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率。
     * @param Fps 帧率。
     */
    public void setFps(String Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 分辨率。 
     * @return Resolution 分辨率。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率。
     * @param Resolution 分辨率。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 增强服务类型。 
     * @return Type 增强服务类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 增强服务类型。
     * @param Type 增强服务类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public LiveEnhanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveEnhanceInfo(LiveEnhanceInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Fps != null) {
            this.Fps = new String(source.Fps);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

