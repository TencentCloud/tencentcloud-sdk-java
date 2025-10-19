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
    * 擦除类型
- subtitle 去字幕
- watermark 去水印
- privacy 隐私保护
    */
    @SerializedName("EraseType")
    @Expose
    private String EraseType;

    /**
    * 字幕擦除配置；
当EraseType值为：subtitle，此字段为必填参数
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private UpdateSmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * 水印擦除配置；
当EraseType值为：watermark，此字段为必填参数
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private UpdateSmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * 隐私保护配置；
当EraseType值为：privacy，此字段为必填参数
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private UpdateSmartErasePrivacyConfig ErasePrivacyConfig;

    /**
     * Get 擦除类型
- subtitle 去字幕
- watermark 去水印
- privacy 隐私保护 
     * @return EraseType 擦除类型
- subtitle 去字幕
- watermark 去水印
- privacy 隐私保护
     */
    public String getEraseType() {
        return this.EraseType;
    }

    /**
     * Set 擦除类型
- subtitle 去字幕
- watermark 去水印
- privacy 隐私保护
     * @param EraseType 擦除类型
- subtitle 去字幕
- watermark 去水印
- privacy 隐私保护
     */
    public void setEraseType(String EraseType) {
        this.EraseType = EraseType;
    }

    /**
     * Get 字幕擦除配置；
当EraseType值为：subtitle，此字段为必填参数 
     * @return EraseSubtitleConfig 字幕擦除配置；
当EraseType值为：subtitle，此字段为必填参数
     */
    public UpdateSmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set 字幕擦除配置；
当EraseType值为：subtitle，此字段为必填参数
     * @param EraseSubtitleConfig 字幕擦除配置；
当EraseType值为：subtitle，此字段为必填参数
     */
    public void setEraseSubtitleConfig(UpdateSmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get 水印擦除配置；
当EraseType值为：watermark，此字段为必填参数 
     * @return EraseWatermarkConfig 水印擦除配置；
当EraseType值为：watermark，此字段为必填参数
     */
    public UpdateSmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set 水印擦除配置；
当EraseType值为：watermark，此字段为必填参数
     * @param EraseWatermarkConfig 水印擦除配置；
当EraseType值为：watermark，此字段为必填参数
     */
    public void setEraseWatermarkConfig(UpdateSmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get 隐私保护配置；
当EraseType值为：privacy，此字段为必填参数 
     * @return ErasePrivacyConfig 隐私保护配置；
当EraseType值为：privacy，此字段为必填参数
     */
    public UpdateSmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set 隐私保护配置；
当EraseType值为：privacy，此字段为必填参数
     * @param ErasePrivacyConfig 隐私保护配置；
当EraseType值为：privacy，此字段为必填参数
     */
    public void setErasePrivacyConfig(UpdateSmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EraseType", this.EraseType);
        this.setParamObj(map, prefix + "EraseSubtitleConfig.", this.EraseSubtitleConfig);
        this.setParamObj(map, prefix + "EraseWatermarkConfig.", this.EraseWatermarkConfig);
        this.setParamObj(map, prefix + "ErasePrivacyConfig.", this.ErasePrivacyConfig);

    }
}

