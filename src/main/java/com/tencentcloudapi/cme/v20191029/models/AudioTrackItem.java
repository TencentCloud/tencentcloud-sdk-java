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
    * 音频媒体来源类型，取值有：
<ul>
<li>VOD ：素材来源于云点播文件 ；</li>
<li>CME ：视频来源于制作云媒体文件 ；</li>
<li>EXTERNAL ：视频来源于媒资绑定，如果媒体不是存储在腾讯云点播中或者云创中，都需要使用媒资绑定。</li>
</ul>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 音频媒体，可取值为：
<ul>
<li>当 SourceType 为 VOD 时，参数填云点播 FileId ；</li>
<li>当 SourceType 为 CME 时，参数填多媒体创作引擎媒体 Id；</li>
<li>当 SourceType 为 EXTERNAL 时，目前仅支持外部媒体 URL(如`https://www.example.com/a.mp3`)，参数填写规则请参见注意事项。</li>
</ul>

注意：
<li>当 SourceType 为 EXTERNAL 并且媒体 URL Scheme 为 `https` 时(如：`https://www.example.com/a.mp3`)，参数为：`1000000:www.example.com/a.mp3`。</li>
<li>当 SourceType 为 EXTERNAL 并且媒体 URL Scheme 为 `http` 时(如：`http://www.example.com/b.mp3`)，参数为：`1000001:www.example.com/b.mp3`。</li>
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * 音频片段取自媒体文件的起始时间，单位为秒。0 表示从媒体开始位置截取。默认为0。
    */
    @SerializedName("SourceMediaStartTime")
    @Expose
    private Float SourceMediaStartTime;

    /**
    * 音频片段的时长，单位为秒。默认和媒体本身长度一致，表示截取全部媒体。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
     * Get 音频媒体来源类型，取值有：
<ul>
<li>VOD ：素材来源于云点播文件 ；</li>
<li>CME ：视频来源于制作云媒体文件 ；</li>
<li>EXTERNAL ：视频来源于媒资绑定，如果媒体不是存储在腾讯云点播中或者云创中，都需要使用媒资绑定。</li>
</ul> 
     * @return SourceType 音频媒体来源类型，取值有：
<ul>
<li>VOD ：素材来源于云点播文件 ；</li>
<li>CME ：视频来源于制作云媒体文件 ；</li>
<li>EXTERNAL ：视频来源于媒资绑定，如果媒体不是存储在腾讯云点播中或者云创中，都需要使用媒资绑定。</li>
</ul>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 音频媒体来源类型，取值有：
<ul>
<li>VOD ：素材来源于云点播文件 ；</li>
<li>CME ：视频来源于制作云媒体文件 ；</li>
<li>EXTERNAL ：视频来源于媒资绑定，如果媒体不是存储在腾讯云点播中或者云创中，都需要使用媒资绑定。</li>
</ul>
     * @param SourceType 音频媒体来源类型，取值有：
<ul>
<li>VOD ：素材来源于云点播文件 ；</li>
<li>CME ：视频来源于制作云媒体文件 ；</li>
<li>EXTERNAL ：视频来源于媒资绑定，如果媒体不是存储在腾讯云点播中或者云创中，都需要使用媒资绑定。</li>
</ul>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 音频媒体，可取值为：
<ul>
<li>当 SourceType 为 VOD 时，参数填云点播 FileId ；</li>
<li>当 SourceType 为 CME 时，参数填多媒体创作引擎媒体 Id；</li>
<li>当 SourceType 为 EXTERNAL 时，目前仅支持外部媒体 URL(如`https://www.example.com/a.mp3`)，参数填写规则请参见注意事项。</li>
</ul>

注意：
<li>当 SourceType 为 EXTERNAL 并且媒体 URL Scheme 为 `https` 时(如：`https://www.example.com/a.mp3`)，参数为：`1000000:www.example.com/a.mp3`。</li>
<li>当 SourceType 为 EXTERNAL 并且媒体 URL Scheme 为 `http` 时(如：`http://www.example.com/b.mp3`)，参数为：`1000001:www.example.com/b.mp3`。</li> 
     * @return SourceMedia 音频媒体，可取值为：
<ul>
<li>当 SourceType 为 VOD 时，参数填云点播 FileId ；</li>
<li>当 SourceType 为 CME 时，参数填多媒体创作引擎媒体 Id；</li>
<li>当 SourceType 为 EXTERNAL 时，目前仅支持外部媒体 URL(如`https://www.example.com/a.mp3`)，参数填写规则请参见注意事项。</li>
</ul>

注意：
<li>当 SourceType 为 EXTERNAL 并且媒体 URL Scheme 为 `https` 时(如：`https://www.example.com/a.mp3`)，参数为：`1000000:www.example.com/a.mp3`。</li>
<li>当 SourceType 为 EXTERNAL 并且媒体 URL Scheme 为 `http` 时(如：`http://www.example.com/b.mp3`)，参数为：`1000001:www.example.com/b.mp3`。</li>
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set 音频媒体，可取值为：
<ul>
<li>当 SourceType 为 VOD 时，参数填云点播 FileId ；</li>
<li>当 SourceType 为 CME 时，参数填多媒体创作引擎媒体 Id；</li>
<li>当 SourceType 为 EXTERNAL 时，目前仅支持外部媒体 URL(如`https://www.example.com/a.mp3`)，参数填写规则请参见注意事项。</li>
</ul>

注意：
<li>当 SourceType 为 EXTERNAL 并且媒体 URL Scheme 为 `https` 时(如：`https://www.example.com/a.mp3`)，参数为：`1000000:www.example.com/a.mp3`。</li>
<li>当 SourceType 为 EXTERNAL 并且媒体 URL Scheme 为 `http` 时(如：`http://www.example.com/b.mp3`)，参数为：`1000001:www.example.com/b.mp3`。</li>
     * @param SourceMedia 音频媒体，可取值为：
<ul>
<li>当 SourceType 为 VOD 时，参数填云点播 FileId ；</li>
<li>当 SourceType 为 CME 时，参数填多媒体创作引擎媒体 Id；</li>
<li>当 SourceType 为 EXTERNAL 时，目前仅支持外部媒体 URL(如`https://www.example.com/a.mp3`)，参数填写规则请参见注意事项。</li>
</ul>

注意：
<li>当 SourceType 为 EXTERNAL 并且媒体 URL Scheme 为 `https` 时(如：`https://www.example.com/a.mp3`)，参数为：`1000000:www.example.com/a.mp3`。</li>
<li>当 SourceType 为 EXTERNAL 并且媒体 URL Scheme 为 `http` 时(如：`http://www.example.com/b.mp3`)，参数为：`1000001:www.example.com/b.mp3`。</li>
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get 音频片段取自媒体文件的起始时间，单位为秒。0 表示从媒体开始位置截取。默认为0。 
     * @return SourceMediaStartTime 音频片段取自媒体文件的起始时间，单位为秒。0 表示从媒体开始位置截取。默认为0。
     */
    public Float getSourceMediaStartTime() {
        return this.SourceMediaStartTime;
    }

    /**
     * Set 音频片段取自媒体文件的起始时间，单位为秒。0 表示从媒体开始位置截取。默认为0。
     * @param SourceMediaStartTime 音频片段取自媒体文件的起始时间，单位为秒。0 表示从媒体开始位置截取。默认为0。
     */
    public void setSourceMediaStartTime(Float SourceMediaStartTime) {
        this.SourceMediaStartTime = SourceMediaStartTime;
    }

    /**
     * Get 音频片段的时长，单位为秒。默认和媒体本身长度一致，表示截取全部媒体。 
     * @return Duration 音频片段的时长，单位为秒。默认和媒体本身长度一致，表示截取全部媒体。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 音频片段的时长，单位为秒。默认和媒体本身长度一致，表示截取全部媒体。
     * @param Duration 音频片段的时长，单位为秒。默认和媒体本身长度一致，表示截取全部媒体。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    public AudioTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTrackItem(AudioTrackItem source) {
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceMedia != null) {
            this.SourceMedia = new String(source.SourceMedia);
        }
        if (source.SourceMediaStartTime != null) {
            this.SourceMediaStartTime = new Float(source.SourceMediaStartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
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

