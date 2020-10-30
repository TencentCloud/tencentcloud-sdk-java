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

public class AudioTrackItem extends AbstractModel{

    /**
    * 音频素材来源类型。取值有：
<ul>
<li>VOD ：素材来源 VOD 。</li>
<li>CME ：视频来源 CME 。</li>
</ul>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 音频片段的媒体素材来源，可以是：
<li>VOD 的媒体文件 ID 。</li>
<li>CME 的素材 ID 。</li>
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
    */
    @SerializedName("SourceMediaStartTime")
    @Expose
    private Float SourceMediaStartTime;

    /**
    * 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
     * Get 音频素材来源类型。取值有：
<ul>
<li>VOD ：素材来源 VOD 。</li>
<li>CME ：视频来源 CME 。</li>
</ul> 
     * @return SourceType 音频素材来源类型。取值有：
<ul>
<li>VOD ：素材来源 VOD 。</li>
<li>CME ：视频来源 CME 。</li>
</ul>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 音频素材来源类型。取值有：
<ul>
<li>VOD ：素材来源 VOD 。</li>
<li>CME ：视频来源 CME 。</li>
</ul>
     * @param SourceType 音频素材来源类型。取值有：
<ul>
<li>VOD ：素材来源 VOD 。</li>
<li>CME ：视频来源 CME 。</li>
</ul>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 音频片段的媒体素材来源，可以是：
<li>VOD 的媒体文件 ID 。</li>
<li>CME 的素材 ID 。</li> 
     * @return SourceMedia 音频片段的媒体素材来源，可以是：
<li>VOD 的媒体文件 ID 。</li>
<li>CME 的素材 ID 。</li>
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set 音频片段的媒体素材来源，可以是：
<li>VOD 的媒体文件 ID 。</li>
<li>CME 的素材 ID 。</li>
     * @param SourceMedia 音频片段的媒体素材来源，可以是：
<li>VOD 的媒体文件 ID 。</li>
<li>CME 的素材 ID 。</li>
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。 
     * @return SourceMediaStartTime 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
     */
    public Float getSourceMediaStartTime() {
        return this.SourceMediaStartTime;
    }

    /**
     * Set 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
     * @param SourceMediaStartTime 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
     */
    public void setSourceMediaStartTime(Float SourceMediaStartTime) {
        this.SourceMediaStartTime = SourceMediaStartTime;
    }

    /**
     * Get 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。 
     * @return Duration 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
     * @param Duration 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceMedia", this.SourceMedia);
        this.setParamSimple(map, prefix + "SourceMediaStartTime", this.SourceMediaStartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

