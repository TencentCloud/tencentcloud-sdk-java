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

public class OverrideEraseParameter extends AbstractModel {

    /**
    * <p>擦除类型</p><ul><li>subtitle 去字幕</li><li>watermark 去水印</li><li>privacy 隐私保护</li></ul>
    */
    @SerializedName("EraseType")
    @Expose
    private String EraseType;

    /**
    * <p>字幕擦除配置；<br>当EraseType值为：subtitle，此字段为必填参数</p>
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private UpdateSmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * <p>水印擦除配置；<br>当EraseType值为：watermark，此字段为必填参数</p>
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private UpdateSmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * <p>隐私保护配置；<br>当EraseType值为：privacy，此字段为必填参数</p>
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private UpdateSmartErasePrivacyConfig ErasePrivacyConfig;

    /**
    * <p>擦除压制字幕模板id。</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

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
     * @return EraseSubtitleConfig <p>字幕擦除配置；<br>当EraseType值为：subtitle，此字段为必填参数</p>
     */
    public UpdateSmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set <p>字幕擦除配置；<br>当EraseType值为：subtitle，此字段为必填参数</p>
     * @param EraseSubtitleConfig <p>字幕擦除配置；<br>当EraseType值为：subtitle，此字段为必填参数</p>
     */
    public void setEraseSubtitleConfig(UpdateSmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get <p>水印擦除配置；<br>当EraseType值为：watermark，此字段为必填参数</p> 
     * @return EraseWatermarkConfig <p>水印擦除配置；<br>当EraseType值为：watermark，此字段为必填参数</p>
     */
    public UpdateSmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set <p>水印擦除配置；<br>当EraseType值为：watermark，此字段为必填参数</p>
     * @param EraseWatermarkConfig <p>水印擦除配置；<br>当EraseType值为：watermark，此字段为必填参数</p>
     */
    public void setEraseWatermarkConfig(UpdateSmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get <p>隐私保护配置；<br>当EraseType值为：privacy，此字段为必填参数</p> 
     * @return ErasePrivacyConfig <p>隐私保护配置；<br>当EraseType值为：privacy，此字段为必填参数</p>
     */
    public UpdateSmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set <p>隐私保护配置；<br>当EraseType值为：privacy，此字段为必填参数</p>
     * @param ErasePrivacyConfig <p>隐私保护配置；<br>当EraseType值为：privacy，此字段为必填参数</p>
     */
    public void setErasePrivacyConfig(UpdateSmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    /**
     * Get <p>擦除压制字幕模板id。</p> 
     * @return SubtitleEmbedId <p>擦除压制字幕模板id。</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>擦除压制字幕模板id。</p>
     * @param SubtitleEmbedId <p>擦除压制字幕模板id。</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    public OverrideEraseParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverrideEraseParameter(OverrideEraseParameter source) {
        if (source.EraseType != null) {
            this.EraseType = new String(source.EraseType);
        }
        if (source.EraseSubtitleConfig != null) {
            this.EraseSubtitleConfig = new UpdateSmartEraseSubtitleConfig(source.EraseSubtitleConfig);
        }
        if (source.EraseWatermarkConfig != null) {
            this.EraseWatermarkConfig = new UpdateSmartEraseWatermarkConfig(source.EraseWatermarkConfig);
        }
        if (source.ErasePrivacyConfig != null) {
            this.ErasePrivacyConfig = new UpdateSmartErasePrivacyConfig(source.ErasePrivacyConfig);
        }
        if (source.SubtitleEmbedId != null) {
            this.SubtitleEmbedId = new Long(source.SubtitleEmbedId);
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

    }
}

