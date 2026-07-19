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

public class DocToVideoInput extends AbstractModel {

    /**
    * <p>用于生成视频的文档链接。</p><p>支持的文档类型：pdf、pptx、docx、png、jpg<br>文档数量限制：3个<br>文档大小限制：10MB<br>文档页数限制：100页</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String [] FileUrl;

    /**
    * <p>用于生成视频的prompt信息。</p><p>prompt长度限制：2000字符。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>文档生成视频模型名称</p><p>默认值：Wand</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>文档生成视频模型版本号</p><p>默认值：1.0</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>生成视频的宽高比。</p><p>枚举值：</p><ul><li>16:9： 16:9</li><li>9:16： 9:16</li><li>1:1： 1:1</li></ul><p>默认值：16:9</p>
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * <p>生成视频的语言。</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>ru： 俄语</li><li>fr： 法语</li><li>es： 西班牙语</li><li>de： 德语</li></ul><p>默认值：zh</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>生成视频的时长参考。</p><p>非准确的视频时长，仅供大模型参考生成。</p><p>取值范围：[15, 1200]</p><p>单位：秒</p>
    */
    @SerializedName("ReferenceDuration")
    @Expose
    private Long ReferenceDuration;

    /**
    * <p>是否开启AI配音功能。</p><p>默认值：false</p>
    */
    @SerializedName("EnableTTS")
    @Expose
    private Boolean EnableTTS;

    /**
    * <p>音色ID。仅开启AI配音功能时有效。</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
     * Get <p>用于生成视频的文档链接。</p><p>支持的文档类型：pdf、pptx、docx、png、jpg<br>文档数量限制：3个<br>文档大小限制：10MB<br>文档页数限制：100页</p> 
     * @return FileUrl <p>用于生成视频的文档链接。</p><p>支持的文档类型：pdf、pptx、docx、png、jpg<br>文档数量限制：3个<br>文档大小限制：10MB<br>文档页数限制：100页</p>
     */
    public String [] getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>用于生成视频的文档链接。</p><p>支持的文档类型：pdf、pptx、docx、png、jpg<br>文档数量限制：3个<br>文档大小限制：10MB<br>文档页数限制：100页</p>
     * @param FileUrl <p>用于生成视频的文档链接。</p><p>支持的文档类型：pdf、pptx、docx、png、jpg<br>文档数量限制：3个<br>文档大小限制：10MB<br>文档页数限制：100页</p>
     */
    public void setFileUrl(String [] FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>用于生成视频的prompt信息。</p><p>prompt长度限制：2000字符。</p> 
     * @return Prompt <p>用于生成视频的prompt信息。</p><p>prompt长度限制：2000字符。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>用于生成视频的prompt信息。</p><p>prompt长度限制：2000字符。</p>
     * @param Prompt <p>用于生成视频的prompt信息。</p><p>prompt长度限制：2000字符。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>文档生成视频模型名称</p><p>默认值：Wand</p> 
     * @return ModelName <p>文档生成视频模型名称</p><p>默认值：Wand</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>文档生成视频模型名称</p><p>默认值：Wand</p>
     * @param ModelName <p>文档生成视频模型名称</p><p>默认值：Wand</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>文档生成视频模型版本号</p><p>默认值：1.0</p> 
     * @return ModelVersion <p>文档生成视频模型版本号</p><p>默认值：1.0</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>文档生成视频模型版本号</p><p>默认值：1.0</p>
     * @param ModelVersion <p>文档生成视频模型版本号</p><p>默认值：1.0</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>生成视频的宽高比。</p><p>枚举值：</p><ul><li>16:9： 16:9</li><li>9:16： 9:16</li><li>1:1： 1:1</li></ul><p>默认值：16:9</p> 
     * @return Ratio <p>生成视频的宽高比。</p><p>枚举值：</p><ul><li>16:9： 16:9</li><li>9:16： 9:16</li><li>1:1： 1:1</li></ul><p>默认值：16:9</p>
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>生成视频的宽高比。</p><p>枚举值：</p><ul><li>16:9： 16:9</li><li>9:16： 9:16</li><li>1:1： 1:1</li></ul><p>默认值：16:9</p>
     * @param Ratio <p>生成视频的宽高比。</p><p>枚举值：</p><ul><li>16:9： 16:9</li><li>9:16： 9:16</li><li>1:1： 1:1</li></ul><p>默认值：16:9</p>
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get <p>生成视频的语言。</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>ru： 俄语</li><li>fr： 法语</li><li>es： 西班牙语</li><li>de： 德语</li></ul><p>默认值：zh</p> 
     * @return Language <p>生成视频的语言。</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>ru： 俄语</li><li>fr： 法语</li><li>es： 西班牙语</li><li>de： 德语</li></ul><p>默认值：zh</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>生成视频的语言。</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>ru： 俄语</li><li>fr： 法语</li><li>es： 西班牙语</li><li>de： 德语</li></ul><p>默认值：zh</p>
     * @param Language <p>生成视频的语言。</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>ru： 俄语</li><li>fr： 法语</li><li>es： 西班牙语</li><li>de： 德语</li></ul><p>默认值：zh</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>生成视频的时长参考。</p><p>非准确的视频时长，仅供大模型参考生成。</p><p>取值范围：[15, 1200]</p><p>单位：秒</p> 
     * @return ReferenceDuration <p>生成视频的时长参考。</p><p>非准确的视频时长，仅供大模型参考生成。</p><p>取值范围：[15, 1200]</p><p>单位：秒</p>
     */
    public Long getReferenceDuration() {
        return this.ReferenceDuration;
    }

    /**
     * Set <p>生成视频的时长参考。</p><p>非准确的视频时长，仅供大模型参考生成。</p><p>取值范围：[15, 1200]</p><p>单位：秒</p>
     * @param ReferenceDuration <p>生成视频的时长参考。</p><p>非准确的视频时长，仅供大模型参考生成。</p><p>取值范围：[15, 1200]</p><p>单位：秒</p>
     */
    public void setReferenceDuration(Long ReferenceDuration) {
        this.ReferenceDuration = ReferenceDuration;
    }

    /**
     * Get <p>是否开启AI配音功能。</p><p>默认值：false</p> 
     * @return EnableTTS <p>是否开启AI配音功能。</p><p>默认值：false</p>
     */
    public Boolean getEnableTTS() {
        return this.EnableTTS;
    }

    /**
     * Set <p>是否开启AI配音功能。</p><p>默认值：false</p>
     * @param EnableTTS <p>是否开启AI配音功能。</p><p>默认值：false</p>
     */
    public void setEnableTTS(Boolean EnableTTS) {
        this.EnableTTS = EnableTTS;
    }

    /**
     * Get <p>音色ID。仅开启AI配音功能时有效。</p> 
     * @return VoiceId <p>音色ID。仅开启AI配音功能时有效。</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色ID。仅开启AI配音功能时有效。</p>
     * @param VoiceId <p>音色ID。仅开启AI配音功能时有效。</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    public DocToVideoInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocToVideoInput(DocToVideoInput source) {
        if (source.FileUrl != null) {
            this.FileUrl = new String[source.FileUrl.length];
            for (int i = 0; i < source.FileUrl.length; i++) {
                this.FileUrl[i] = new String(source.FileUrl[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.ReferenceDuration != null) {
            this.ReferenceDuration = new Long(source.ReferenceDuration);
        }
        if (source.EnableTTS != null) {
            this.EnableTTS = new Boolean(source.EnableTTS);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileUrl.", this.FileUrl);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "ReferenceDuration", this.ReferenceDuration);
        this.setParamSimple(map, prefix + "EnableTTS", this.EnableTTS);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);

    }
}

