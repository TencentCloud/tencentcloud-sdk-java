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
    * <p>插入形式，可选值：</p><li>subtitle-stream：插入字幕轨道</li><li>close-caption-708：CEA-708字幕编码到SEI帧</li><li>close-caption-608：CEA-608字幕编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>字幕文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subtitle")
    @Expose
    private MediaInputInfo Subtitle;

    /**
    * <p>字幕名称    。<br>注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
    * <p>字幕语言，比如：eng</p>
    */
    @SerializedName("SubtitleLanguage")
    @Expose
    private String SubtitleLanguage;

    /**
    * <p>字幕输出格式。取值{&quot;WebVTT&quot;,&quot;TTML&quot;}。<br>默认值：&quot;WebVTT&quot;</p>
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * <p>默认字幕轨道。为true时指定当前字幕为默认字幕轨道，最多可指定1条默认字幕轨道。<br>默认值：false</p>
    */
    @SerializedName("DefaultTrack")
    @Expose
    private Boolean DefaultTrack;

    /**
     * Get <p>插入形式，可选值：</p><li>subtitle-stream：插入字幕轨道</li><li>close-caption-708：CEA-708字幕编码到SEI帧</li><li>close-caption-608：CEA-608字幕编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>插入形式，可选值：</p><li>subtitle-stream：插入字幕轨道</li><li>close-caption-708：CEA-708字幕编码到SEI帧</li><li>close-caption-608：CEA-608字幕编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>插入形式，可选值：</p><li>subtitle-stream：插入字幕轨道</li><li>close-caption-708：CEA-708字幕编码到SEI帧</li><li>close-caption-608：CEA-608字幕编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>插入形式，可选值：</p><li>subtitle-stream：插入字幕轨道</li><li>close-caption-708：CEA-708字幕编码到SEI帧</li><li>close-caption-608：CEA-608字幕编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>字幕文件。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subtitle <p>字幕文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInputInfo getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set <p>字幕文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subtitle <p>字幕文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitle(MediaInputInfo Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     * Get <p>字幕名称    。<br>注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleName <p>字幕名称    。<br>注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set <p>字幕名称    。<br>注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleName <p>字幕名称    。<br>注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    /**
     * Get <p>字幕语言，比如：eng</p> 
     * @return SubtitleLanguage <p>字幕语言，比如：eng</p>
     */
    public String getSubtitleLanguage() {
        return this.SubtitleLanguage;
    }

    /**
     * Set <p>字幕语言，比如：eng</p>
     * @param SubtitleLanguage <p>字幕语言，比如：eng</p>
     */
    public void setSubtitleLanguage(String SubtitleLanguage) {
        this.SubtitleLanguage = SubtitleLanguage;
    }

    /**
     * Get <p>字幕输出格式。取值{&quot;WebVTT&quot;,&quot;TTML&quot;}。<br>默认值：&quot;WebVTT&quot;</p> 
     * @return OutputFormat <p>字幕输出格式。取值{&quot;WebVTT&quot;,&quot;TTML&quot;}。<br>默认值：&quot;WebVTT&quot;</p>
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set <p>字幕输出格式。取值{&quot;WebVTT&quot;,&quot;TTML&quot;}。<br>默认值：&quot;WebVTT&quot;</p>
     * @param OutputFormat <p>字幕输出格式。取值{&quot;WebVTT&quot;,&quot;TTML&quot;}。<br>默认值：&quot;WebVTT&quot;</p>
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get <p>默认字幕轨道。为true时指定当前字幕为默认字幕轨道，最多可指定1条默认字幕轨道。<br>默认值：false</p> 
     * @return DefaultTrack <p>默认字幕轨道。为true时指定当前字幕为默认字幕轨道，最多可指定1条默认字幕轨道。<br>默认值：false</p>
     */
    public Boolean getDefaultTrack() {
        return this.DefaultTrack;
    }

    /**
     * Set <p>默认字幕轨道。为true时指定当前字幕为默认字幕轨道，最多可指定1条默认字幕轨道。<br>默认值：false</p>
     * @param DefaultTrack <p>默认字幕轨道。为true时指定当前字幕为默认字幕轨道，最多可指定1条默认字幕轨道。<br>默认值：false</p>
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
        if (source.SubtitleLanguage != null) {
            this.SubtitleLanguage = new String(source.SubtitleLanguage);
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
        this.setParamSimple(map, prefix + "SubtitleLanguage", this.SubtitleLanguage);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "DefaultTrack", this.DefaultTrack);

    }
}

