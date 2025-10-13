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

public class AddOnSubtitle extends AbstractModel {

    /**
    * 插入形式，可选值：
<li>subtitle-stream：插入字幕轨道</li>
<li>close-caption-708：CEA-708字幕编码到SEI帧</li>
<li>close-caption-608：CEA-608字幕编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subtitle")
    @Expose
    private MediaInputInfo Subtitle;

    /**
    * 字幕名称	。
注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
    * 字幕输出格式。取值{"WebVTT","TTML"}。
默认值："WebVTT"
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * 默认字幕轨道。为true时指定当前字幕为默认字幕轨道，最多可指定1条默认字幕轨道。
默认值：false
    */
    @SerializedName("DefaultTrack")
    @Expose
    private Boolean DefaultTrack;

    /**
     * Get 插入形式，可选值：
<li>subtitle-stream：插入字幕轨道</li>
<li>close-caption-708：CEA-708字幕编码到SEI帧</li>
<li>close-caption-608：CEA-608字幕编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 插入形式，可选值：
<li>subtitle-stream：插入字幕轨道</li>
<li>close-caption-708：CEA-708字幕编码到SEI帧</li>
<li>close-caption-608：CEA-608字幕编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 插入形式，可选值：
<li>subtitle-stream：插入字幕轨道</li>
<li>close-caption-708：CEA-708字幕编码到SEI帧</li>
<li>close-caption-608：CEA-608字幕编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 插入形式，可选值：
<li>subtitle-stream：插入字幕轨道</li>
<li>close-caption-708：CEA-708字幕编码到SEI帧</li>
<li>close-caption-608：CEA-608字幕编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字幕文件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subtitle 字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInputInfo getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set 字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subtitle 字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitle(MediaInputInfo Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     * Get 字幕名称	。
注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleName 字幕名称	。
注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set 字幕名称	。
注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleName 字幕名称	。
注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    /**
     * Get 字幕输出格式。取值{"WebVTT","TTML"}。
默认值："WebVTT" 
     * @return OutputFormat 字幕输出格式。取值{"WebVTT","TTML"}。
默认值："WebVTT"
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set 字幕输出格式。取值{"WebVTT","TTML"}。
默认值："WebVTT"
     * @param OutputFormat 字幕输出格式。取值{"WebVTT","TTML"}。
默认值："WebVTT"
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get 默认字幕轨道。为true时指定当前字幕为默认字幕轨道，最多可指定1条默认字幕轨道。
默认值：false 
     * @return DefaultTrack 默认字幕轨道。为true时指定当前字幕为默认字幕轨道，最多可指定1条默认字幕轨道。
默认值：false
     */
    public Boolean getDefaultTrack() {
        return this.DefaultTrack;
    }

    /**
     * Set 默认字幕轨道。为true时指定当前字幕为默认字幕轨道，最多可指定1条默认字幕轨道。
默认值：false
     * @param DefaultTrack 默认字幕轨道。为true时指定当前字幕为默认字幕轨道，最多可指定1条默认字幕轨道。
默认值：false
     */
    public void setDefaultTrack(Boolean DefaultTrack) {
        this.DefaultTrack = DefaultTrack;
    }

    public AddOnSubtitle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOnSubtitle(AddOnSubtitle source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new MediaInputInfo(source.Subtitle);
        }
        if (source.SubtitleName != null) {
            this.SubtitleName = new String(source.SubtitleName);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.DefaultTrack != null) {
            this.DefaultTrack = new Boolean(source.DefaultTrack);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Subtitle.", this.Subtitle);
        this.setParamSimple(map, prefix + "SubtitleName", this.SubtitleName);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "DefaultTrack", this.DefaultTrack);

    }
}

