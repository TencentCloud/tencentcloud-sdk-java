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

public class ModifySmartEraseTemplateRequest extends AbstractModel {

    /**
    * <p>智能擦除模板唯一标识</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>智能擦除模板名称长度限制：64 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>智能擦除模板描述信息长度限制：256 个字符。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>擦除类型</p><ul><li>subtitle 去字幕</li><li>watermark 去水印</li><li>privacy 隐私保护</li></ul>
    */
    @SerializedName("EraseType")
    @Expose
    private String EraseType;

    /**
    * <p>字幕擦除配置，EraseType取subtitle或者EraseType不填，对应模板原EraseType为subtitle时生效。</p>
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private SmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * <p>水印擦除配置，EraseType取watermark或者EraseType不填，对应模板原EraseType为watermark时生效。</p>
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private SmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * <p>隐私保护配置，EraseType取privacy或者EraseType不填，对应模板原EraseType为privacy时生效。</p>
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private SmartErasePrivacyConfig ErasePrivacyConfig;

    /**
     * Get <p>智能擦除模板唯一标识</p> 
     * @return Definition <p>智能擦除模板唯一标识</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>智能擦除模板唯一标识</p>
     * @param Definition <p>智能擦除模板唯一标识</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>智能擦除模板名称长度限制：64 个字符。</p> 
     * @return Name <p>智能擦除模板名称长度限制：64 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>智能擦除模板名称长度限制：64 个字符。</p>
     * @param Name <p>智能擦除模板名称长度限制：64 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>智能擦除模板描述信息长度限制：256 个字符。</p> 
     * @return Comment <p>智能擦除模板描述信息长度限制：256 个字符。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>智能擦除模板描述信息长度限制：256 个字符。</p>
     * @param Comment <p>智能擦除模板描述信息长度限制：256 个字符。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

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
     * Get <p>字幕擦除配置，EraseType取subtitle或者EraseType不填，对应模板原EraseType为subtitle时生效。</p> 
     * @return EraseSubtitleConfig <p>字幕擦除配置，EraseType取subtitle或者EraseType不填，对应模板原EraseType为subtitle时生效。</p>
     */
    public SmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set <p>字幕擦除配置，EraseType取subtitle或者EraseType不填，对应模板原EraseType为subtitle时生效。</p>
     * @param EraseSubtitleConfig <p>字幕擦除配置，EraseType取subtitle或者EraseType不填，对应模板原EraseType为subtitle时生效。</p>
     */
    public void setEraseSubtitleConfig(SmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get <p>水印擦除配置，EraseType取watermark或者EraseType不填，对应模板原EraseType为watermark时生效。</p> 
     * @return EraseWatermarkConfig <p>水印擦除配置，EraseType取watermark或者EraseType不填，对应模板原EraseType为watermark时生效。</p>
     */
    public SmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set <p>水印擦除配置，EraseType取watermark或者EraseType不填，对应模板原EraseType为watermark时生效。</p>
     * @param EraseWatermarkConfig <p>水印擦除配置，EraseType取watermark或者EraseType不填，对应模板原EraseType为watermark时生效。</p>
     */
    public void setEraseWatermarkConfig(SmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get <p>隐私保护配置，EraseType取privacy或者EraseType不填，对应模板原EraseType为privacy时生效。</p> 
     * @return ErasePrivacyConfig <p>隐私保护配置，EraseType取privacy或者EraseType不填，对应模板原EraseType为privacy时生效。</p>
     */
    public SmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set <p>隐私保护配置，EraseType取privacy或者EraseType不填，对应模板原EraseType为privacy时生效。</p>
     * @param ErasePrivacyConfig <p>隐私保护配置，EraseType取privacy或者EraseType不填，对应模板原EraseType为privacy时生效。</p>
     */
    public void setErasePrivacyConfig(SmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    public ModifySmartEraseTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySmartEraseTemplateRequest(ModifySmartEraseTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "EraseType", this.EraseType);
        this.setParamObj(map, prefix + "EraseSubtitleConfig.", this.EraseSubtitleConfig);
        this.setParamObj(map, prefix + "EraseWatermarkConfig.", this.EraseWatermarkConfig);
        this.setParamObj(map, prefix + "ErasePrivacyConfig.", this.ErasePrivacyConfig);

    }
}

