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

public class CreateSmartEraseTemplateRequest extends AbstractModel {

    /**
    * 智能擦除模板名称长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * 智能擦除模板描述信息长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 字幕擦除配置，EraseType取subtitle时必填且仅此时生效。
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private SmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * 水印擦除配置，EraseType取watermark时必填且仅此时生效。
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private SmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * 隐私保护配置，EraseType取privacy时必填且仅此时生效。
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private SmartErasePrivacyConfig ErasePrivacyConfig;

    /**
     * Get 智能擦除模板名称长度限制：64 个字符。 
     * @return Name 智能擦除模板名称长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 智能擦除模板名称长度限制：64 个字符。
     * @param Name 智能擦除模板名称长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

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
     * Get 智能擦除模板描述信息长度限制：256 个字符。 
     * @return Comment 智能擦除模板描述信息长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 智能擦除模板描述信息长度限制：256 个字符。
     * @param Comment 智能擦除模板描述信息长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 字幕擦除配置，EraseType取subtitle时必填且仅此时生效。 
     * @return EraseSubtitleConfig 字幕擦除配置，EraseType取subtitle时必填且仅此时生效。
     */
    public SmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set 字幕擦除配置，EraseType取subtitle时必填且仅此时生效。
     * @param EraseSubtitleConfig 字幕擦除配置，EraseType取subtitle时必填且仅此时生效。
     */
    public void setEraseSubtitleConfig(SmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get 水印擦除配置，EraseType取watermark时必填且仅此时生效。 
     * @return EraseWatermarkConfig 水印擦除配置，EraseType取watermark时必填且仅此时生效。
     */
    public SmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set 水印擦除配置，EraseType取watermark时必填且仅此时生效。
     * @param EraseWatermarkConfig 水印擦除配置，EraseType取watermark时必填且仅此时生效。
     */
    public void setEraseWatermarkConfig(SmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get 隐私保护配置，EraseType取privacy时必填且仅此时生效。 
     * @return ErasePrivacyConfig 隐私保护配置，EraseType取privacy时必填且仅此时生效。
     */
    public SmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set 隐私保护配置，EraseType取privacy时必填且仅此时生效。
     * @param ErasePrivacyConfig 隐私保护配置，EraseType取privacy时必填且仅此时生效。
     */
    public void setErasePrivacyConfig(SmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    public CreateSmartEraseTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSmartEraseTemplateRequest(CreateSmartEraseTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EraseType != null) {
            this.EraseType = new String(source.EraseType);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EraseType", this.EraseType);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "EraseSubtitleConfig.", this.EraseSubtitleConfig);
        this.setParamObj(map, prefix + "EraseWatermarkConfig.", this.EraseWatermarkConfig);
        this.setParamObj(map, prefix + "ErasePrivacyConfig.", this.ErasePrivacyConfig);

    }
}

