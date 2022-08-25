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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskAsrFullTextResultOutputSubtitleItem extends AbstractModel{

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
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

