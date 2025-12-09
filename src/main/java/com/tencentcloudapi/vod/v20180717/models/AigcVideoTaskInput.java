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

public class AigcVideoTaskInput extends AbstractModel {

    /**
    * 模型名称。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型版本。
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * AIGC生图任务输入文件信息。
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcVideoTaskInputFileInfo [] FileInfos;

    /**
    * 用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。
    */
    @SerializedName("LastFrameFileId")
    @Expose
    private String LastFrameFileId;

    /**
    * 生成视频的提示词。最大支持1000字符，当 FileInfos 为空时，此参数必填。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 要阻止模型生成视频的提示词。最大支持1000字符。
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * 是否自动优化提示词。开启时将自动优化传入的Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * 生成模式。取值有： <li>Standard：标准模式；</li> <li>Professional：高品质模式；</li> 
    */
    @SerializedName("GenerationMode")
    @Expose
    private String GenerationMode;

    /**
    * AIGC 生图输出结果文件输出。
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcVideoOutputConfig OutputConfig;

    /**
     * Get 模型名称。 
     * @return ModelName 模型名称。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称。
     * @param ModelName 模型名称。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 模型版本。 
     * @return ModelVersion 模型版本。
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 模型版本。
     * @param ModelVersion 模型版本。
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get AIGC生图任务输入文件信息。 
     * @return FileInfos AIGC生图任务输入文件信息。
     */
    public AigcVideoTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set AIGC生图任务输入文件信息。
     * @param FileInfos AIGC生图任务输入文件信息。
     */
    public void setFileInfos(AigcVideoTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get 用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。 
     * @return LastFrameFileId 用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。
     */
    public String getLastFrameFileId() {
        return this.LastFrameFileId;
    }

    /**
     * Set 用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。
     * @param LastFrameFileId 用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。
     */
    public void setLastFrameFileId(String LastFrameFileId) {
        this.LastFrameFileId = LastFrameFileId;
    }

    /**
     * Get 生成视频的提示词。最大支持1000字符，当 FileInfos 为空时，此参数必填。 
     * @return Prompt 生成视频的提示词。最大支持1000字符，当 FileInfos 为空时，此参数必填。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 生成视频的提示词。最大支持1000字符，当 FileInfos 为空时，此参数必填。
     * @param Prompt 生成视频的提示词。最大支持1000字符，当 FileInfos 为空时，此参数必填。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 要阻止模型生成视频的提示词。最大支持1000字符。 
     * @return NegativePrompt 要阻止模型生成视频的提示词。最大支持1000字符。
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set 要阻止模型生成视频的提示词。最大支持1000字符。
     * @param NegativePrompt 要阻止模型生成视频的提示词。最大支持1000字符。
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get 是否自动优化提示词。开启时将自动优化传入的Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li>  
     * @return EnhancePrompt 是否自动优化提示词。开启时将自动优化传入的Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set 是否自动优化提示词。开启时将自动优化传入的Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     * @param EnhancePrompt 是否自动优化提示词。开启时将自动优化传入的Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get 生成模式。取值有： <li>Standard：标准模式；</li> <li>Professional：高品质模式；</li>  
     * @return GenerationMode 生成模式。取值有： <li>Standard：标准模式；</li> <li>Professional：高品质模式；</li> 
     */
    public String getGenerationMode() {
        return this.GenerationMode;
    }

    /**
     * Set 生成模式。取值有： <li>Standard：标准模式；</li> <li>Professional：高品质模式；</li> 
     * @param GenerationMode 生成模式。取值有： <li>Standard：标准模式；</li> <li>Professional：高品质模式；</li> 
     */
    public void setGenerationMode(String GenerationMode) {
        this.GenerationMode = GenerationMode;
    }

    /**
     * Get AIGC 生图输出结果文件输出。 
     * @return OutputConfig AIGC 生图输出结果文件输出。
     */
    public AigcVideoOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set AIGC 生图输出结果文件输出。
     * @param OutputConfig AIGC 生图输出结果文件输出。
     */
    public void setOutputConfig(AigcVideoOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public AigcVideoTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskInput(AigcVideoTaskInput source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new AigcVideoTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcVideoTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.LastFrameFileId != null) {
            this.LastFrameFileId = new String(source.LastFrameFileId);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new String(source.EnhancePrompt);
        }
        if (source.GenerationMode != null) {
            this.GenerationMode = new String(source.GenerationMode);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcVideoOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "LastFrameFileId", this.LastFrameFileId);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamSimple(map, prefix + "GenerationMode", this.GenerationMode);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

