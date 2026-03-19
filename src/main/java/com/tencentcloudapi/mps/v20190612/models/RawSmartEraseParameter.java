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

public class RawSmartEraseParameter extends AbstractModel {

    /**
    * <p>擦除类型</p><ul><li>subtitle 去字幕</li><li>watermark 去水印</li><li>privacy 隐私保护</li></ul>
    */
    @SerializedName("EraseType")
    @Expose
    private String EraseType;

    /**
    * <p>字幕擦除配置；<br>当EraseType值为：subtitle，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private SmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * <p>水印擦除配置；<br>当EraseType值为：watermark，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private SmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * <p>隐私保护配置；<br>当EraseType值为：privacy，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private SmartErasePrivacyConfig ErasePrivacyConfig;

    /**
    * <p>擦除字幕压制模板id。</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * <p>压制配置，默认开启1, 把字幕压制回原字幕位置。</p>
    */
    @SerializedName("UseOriginalPos")
    @Expose
    private Long UseOriginalPos;

    /**
    * <p>压制配置，默认开启1, 开启后使用原字幕字号。</p>
    */
    @SerializedName("UseOriginalSize")
    @Expose
    private Long UseOriginalSize;

    /**
     * Get <p>擦除类型</p><ul><li>subtitle 去字幕</li><li>watermark 去水印</li><li>privacy 隐私保护</li></ul> 
     * @return EraseType <p>擦除类型</p><ul><li>subtitle 去字幕</li><li>watermark 去水印</li><li>privacy 隐私保护</li></ul>
     */
    public String getEraseType() {
        return this.EraseType;
    }

    /**
     * Set <p>擦除类型</p><ul><li>subtitle 去字幕</li><li>watermark 去水印</li><li>privacy 隐私保护</li></ul>
     * @param EraseType <p>擦除类型</p><ul><li>subtitle 去字幕</li><li>watermark 去水印</li><li>privacy 隐私保护</li></ul>
     */
    public void setEraseType(String EraseType) {
        this.EraseType = EraseType;
    }

    /**
     * Get <p>字幕擦除配置；<br>当EraseType值为：subtitle，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EraseSubtitleConfig <p>字幕擦除配置；<br>当EraseType值为：subtitle，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set <p>字幕擦除配置；<br>当EraseType值为：subtitle，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EraseSubtitleConfig <p>字幕擦除配置；<br>当EraseType值为：subtitle，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEraseSubtitleConfig(SmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get <p>水印擦除配置；<br>当EraseType值为：watermark，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EraseWatermarkConfig <p>水印擦除配置；<br>当EraseType值为：watermark，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set <p>水印擦除配置；<br>当EraseType值为：watermark，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EraseWatermarkConfig <p>水印擦除配置；<br>当EraseType值为：watermark，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEraseWatermarkConfig(SmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get <p>隐私保护配置；<br>当EraseType值为：privacy，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErasePrivacyConfig <p>隐私保护配置；<br>当EraseType值为：privacy，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set <p>隐私保护配置；<br>当EraseType值为：privacy，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErasePrivacyConfig <p>隐私保护配置；<br>当EraseType值为：privacy，此字段为必填参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErasePrivacyConfig(SmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    /**
     * Get <p>擦除字幕压制模板id。</p> 
     * @return SubtitleEmbedId <p>擦除字幕压制模板id。</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>擦除字幕压制模板id。</p>
     * @param SubtitleEmbedId <p>擦除字幕压制模板id。</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get <p>压制配置，默认开启1, 把字幕压制回原字幕位置。</p> 
     * @return UseOriginalPos <p>压制配置，默认开启1, 把字幕压制回原字幕位置。</p>
     */
    public Long getUseOriginalPos() {
        return this.UseOriginalPos;
    }

    /**
     * Set <p>压制配置，默认开启1, 把字幕压制回原字幕位置。</p>
     * @param UseOriginalPos <p>压制配置，默认开启1, 把字幕压制回原字幕位置。</p>
     */
    public void setUseOriginalPos(Long UseOriginalPos) {
        this.UseOriginalPos = UseOriginalPos;
    }

    /**
     * Get <p>压制配置，默认开启1, 开启后使用原字幕字号。</p> 
     * @return UseOriginalSize <p>压制配置，默认开启1, 开启后使用原字幕字号。</p>
     */
    public Long getUseOriginalSize() {
        return this.UseOriginalSize;
    }

    /**
     * Set <p>压制配置，默认开启1, 开启后使用原字幕字号。</p>
     * @param UseOriginalSize <p>压制配置，默认开启1, 开启后使用原字幕字号。</p>
     */
    public void setUseOriginalSize(Long UseOriginalSize) {
        this.UseOriginalSize = UseOriginalSize;
    }

    public RawSmartEraseParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawSmartEraseParameter(RawSmartEraseParameter source) {
        if (source.EraseType != null) {
            this.EraseType = new String(source.EraseType);
        }
        if (source.EraseSubtitleConfig != null) {
            this.EraseSubtitleConfig = new SmartEraseSubtitleConfig(source.EraseSubtitleConfig);
        }
        if (source.EraseWatermarkConfig != null) {
            this.EraseWatermarkConfig = new SmartEraseWatermarkConfig(source.EraseWatermarkConfig);
        }
        if (source.ErasePrivacyConfig != null) {
            this.ErasePrivacyConfig = new SmartErasePrivacyConfig(source.ErasePrivacyConfig);
        }
        if (source.SubtitleEmbedId != null) {
            this.SubtitleEmbedId = new Long(source.SubtitleEmbedId);
        }
        if (source.UseOriginalPos != null) {
            this.UseOriginalPos = new Long(source.UseOriginalPos);
        }
        if (source.UseOriginalSize != null) {
            this.UseOriginalSize = new Long(source.UseOriginalSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EraseType", this.EraseType);
        this.setParamObj(map, prefix + "EraseSubtitleConfig.", this.EraseSubtitleConfig);
        this.setParamObj(map, prefix + "EraseWatermarkConfig.", this.EraseWatermarkConfig);
        this.setParamObj(map, prefix + "ErasePrivacyConfig.", this.ErasePrivacyConfig);
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "UseOriginalPos", this.UseOriginalPos);
        this.setParamSimple(map, prefix + "UseOriginalSize", this.UseOriginalSize);

    }
}

