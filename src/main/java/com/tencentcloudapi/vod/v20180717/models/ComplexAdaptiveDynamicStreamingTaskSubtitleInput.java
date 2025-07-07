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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplexAdaptiveDynamicStreamingTaskSubtitleInput extends AbstractModel {

    /**
    * 字幕 ID。该字幕必须归属于自适应码流任务的输入主媒体。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 是否设置为自适应码流的默认字幕。取值：
<li>YES：设置为默认字幕；</li>
<li>NO：不设置为默认字幕（默认值）。</li>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
     * Get 字幕 ID。该字幕必须归属于自适应码流任务的输入主媒体。 
     * @return Id 字幕 ID。该字幕必须归属于自适应码流任务的输入主媒体。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 字幕 ID。该字幕必须归属于自适应码流任务的输入主媒体。
     * @param Id 字幕 ID。该字幕必须归属于自适应码流任务的输入主媒体。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 是否设置为自适应码流的默认字幕。取值：
<li>YES：设置为默认字幕；</li>
<li>NO：不设置为默认字幕（默认值）。</li> 
     * @return Default 是否设置为自适应码流的默认字幕。取值：
<li>YES：设置为默认字幕；</li>
<li>NO：不设置为默认字幕（默认值）。</li>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set 是否设置为自适应码流的默认字幕。取值：
<li>YES：设置为默认字幕；</li>
<li>NO：不设置为默认字幕（默认值）。</li>
     * @param Default 是否设置为自适应码流的默认字幕。取值：
<li>YES：设置为默认字幕；</li>
<li>NO：不设置为默认字幕（默认值）。</li>
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    public ComplexAdaptiveDynamicStreamingTaskSubtitleInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTaskSubtitleInput(ComplexAdaptiveDynamicStreamingTaskSubtitleInput source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Default", this.Default);

    }
}

