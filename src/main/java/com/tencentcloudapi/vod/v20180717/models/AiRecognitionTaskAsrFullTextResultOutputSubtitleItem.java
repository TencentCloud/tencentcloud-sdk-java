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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskAsrFullTextResultOutputSubtitleItem extends AbstractModel {

    /**
    * 媒资字幕 ID，用于媒资字幕管理，仅当 Format 为 vtt 时有效。
<font color=red>注意：</font>2024-11-01T10:00:00Z 之前的任务返回此字段无效。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 媒资字幕名字，用于播放器展示，仅当 Format 为 vtt 时有效。
<font color=red>注意：</font>2024-11-01T10:00:00Z 之前的任务返回此字段无效。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字幕语言。
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 字幕文件格式，取值范围：
<li>vtt：WebVTT 字幕文件；</li>
<li>srt：SRT 字幕文件。</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 字幕文件 Url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 媒资字幕 ID，用于媒资字幕管理，仅当 Format 为 vtt 时有效。
<font color=red>注意：</font>2024-11-01T10:00:00Z 之前的任务返回此字段无效。 
     * @return Id 媒资字幕 ID，用于媒资字幕管理，仅当 Format 为 vtt 时有效。
<font color=red>注意：</font>2024-11-01T10:00:00Z 之前的任务返回此字段无效。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 媒资字幕 ID，用于媒资字幕管理，仅当 Format 为 vtt 时有效。
<font color=red>注意：</font>2024-11-01T10:00:00Z 之前的任务返回此字段无效。
     * @param Id 媒资字幕 ID，用于媒资字幕管理，仅当 Format 为 vtt 时有效。
<font color=red>注意：</font>2024-11-01T10:00:00Z 之前的任务返回此字段无效。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 媒资字幕名字，用于播放器展示，仅当 Format 为 vtt 时有效。
<font color=red>注意：</font>2024-11-01T10:00:00Z 之前的任务返回此字段无效。 
     * @return Name 媒资字幕名字，用于播放器展示，仅当 Format 为 vtt 时有效。
<font color=red>注意：</font>2024-11-01T10:00:00Z 之前的任务返回此字段无效。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒资字幕名字，用于播放器展示，仅当 Format 为 vtt 时有效。
<font color=red>注意：</font>2024-11-01T10:00:00Z 之前的任务返回此字段无效。
     * @param Name 媒资字幕名字，用于播放器展示，仅当 Format 为 vtt 时有效。
<font color=red>注意：</font>2024-11-01T10:00:00Z 之前的任务返回此字段无效。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字幕语言。 
     * @return Language 字幕语言。
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 字幕语言。
     * @param Language 字幕语言。
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 字幕文件格式，取值范围：
<li>vtt：WebVTT 字幕文件；</li>
<li>srt：SRT 字幕文件。</li> 
     * @return Format 字幕文件格式，取值范围：
<li>vtt：WebVTT 字幕文件；</li>
<li>srt：SRT 字幕文件。</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 字幕文件格式，取值范围：
<li>vtt：WebVTT 字幕文件；</li>
<li>srt：SRT 字幕文件。</li>
     * @param Format 字幕文件格式，取值范围：
<li>vtt：WebVTT 字幕文件；</li>
<li>srt：SRT 字幕文件。</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 字幕文件 Url。 
     * @return Url 字幕文件 Url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 字幕文件 Url。
     * @param Url 字幕文件 Url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public AiRecognitionTaskAsrFullTextResultOutputSubtitleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskAsrFullTextResultOutputSubtitleItem(AiRecognitionTaskAsrFullTextResultOutputSubtitleItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

