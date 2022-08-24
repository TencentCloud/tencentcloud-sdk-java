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

public class SubtitleFormatsOperation extends AbstractModel{

    /**
    * 操作类型，取值范围：
<li>add：添加 Formats 指定的格式列表；</li>
<li>delete：删除 Formats 指定的格式列表；<l/i>
<li>reset：将已配置的格式列表重置为  Formats 指定的格式列表。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字幕格式列表，取值范围：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
    */
    @SerializedName("Formats")
    @Expose
    private String [] Formats;

    /**
     * Get 操作类型，取值范围：
<li>add：添加 Formats 指定的格式列表；</li>
<li>delete：删除 Formats 指定的格式列表；<l/i>
<li>reset：将已配置的格式列表重置为  Formats 指定的格式列表。</li> 
     * @return Type 操作类型，取值范围：
<li>add：添加 Formats 指定的格式列表；</li>
<li>delete：删除 Formats 指定的格式列表；<l/i>
<li>reset：将已配置的格式列表重置为  Formats 指定的格式列表。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 操作类型，取值范围：
<li>add：添加 Formats 指定的格式列表；</li>
<li>delete：删除 Formats 指定的格式列表；<l/i>
<li>reset：将已配置的格式列表重置为  Formats 指定的格式列表。</li>
     * @param Type 操作类型，取值范围：
<li>add：添加 Formats 指定的格式列表；</li>
<li>delete：删除 Formats 指定的格式列表；<l/i>
<li>reset：将已配置的格式列表重置为  Formats 指定的格式列表。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字幕格式列表，取值范围：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li> 
     * @return Formats 字幕格式列表，取值范围：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
     */
    public String [] getFormats() {
        return this.Formats;
    }

    /**
     * Set 字幕格式列表，取值范围：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
     * @param Formats 字幕格式列表，取值范围：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
     */
    public void setFormats(String [] Formats) {
        this.Formats = Formats;
    }

    public SubtitleFormatsOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleFormatsOperation(SubtitleFormatsOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Formats != null) {
            this.Formats = new String[source.Formats.length];
            for (int i = 0; i < source.Formats.length; i++) {
                this.Formats[i] = new String(source.Formats[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Formats.", this.Formats);

    }
}

