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

public class CreateAigcAudioTaskRequest extends AbstractModel {

    /**
    * <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>模型名称。</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>指定场景，目前支持sfx（音效）、music（音乐）。</p>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>生成音频的描述</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>参考视频信息</p>
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcAudioReferenceVideoInfo [] VideoInfos;

    /**
    * <p>传入参考音频信息。</p><p>比如传入音频生成音乐时需要传入。</p>
    */
    @SerializedName("AudioInfos")
    @Expose
    private AigcAudioReferenceAudioInfo [] AudioInfos;

    /**
    * <p>输出参数</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcAudioOutputConfig OutputConfig;

    /**
    * <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例：<br>{"camera_control":{"type":"simple"}}</p>
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
     * Get <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p> 
     * @return SubAppId <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
     * @param SubAppId <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>模型名称。</p> 
     * @return ModelName <p>模型名称。</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称。</p>
     * @param ModelName <p>模型名称。</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p> 
     * @return ModelVersion <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p>
     * @param ModelVersion <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>指定场景，目前支持sfx（音效）、music（音乐）。</p> 
     * @return SceneType <p>指定场景，目前支持sfx（音效）、music（音乐）。</p>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>指定场景，目前支持sfx（音效）、music（音乐）。</p>
     * @param SceneType <p>指定场景，目前支持sfx（音效）、music（音乐）。</p>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>生成音频的描述</p> 
     * @return Prompt <p>生成音频的描述</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>生成音频的描述</p>
     * @param Prompt <p>生成音频的描述</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>参考视频信息</p> 
     * @return VideoInfos <p>参考视频信息</p>
     */
    public AigcAudioReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set <p>参考视频信息</p>
     * @param VideoInfos <p>参考视频信息</p>
     */
    public void setVideoInfos(AigcAudioReferenceVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get <p>传入参考音频信息。</p><p>比如传入音频生成音乐时需要传入。</p> 
     * @return AudioInfos <p>传入参考音频信息。</p><p>比如传入音频生成音乐时需要传入。</p>
     */
    public AigcAudioReferenceAudioInfo [] getAudioInfos() {
        return this.AudioInfos;
    }

    /**
     * Set <p>传入参考音频信息。</p><p>比如传入音频生成音乐时需要传入。</p>
     * @param AudioInfos <p>传入参考音频信息。</p><p>比如传入音频生成音乐时需要传入。</p>
     */
    public void setAudioInfos(AigcAudioReferenceAudioInfo [] AudioInfos) {
        this.AudioInfos = AudioInfos;
    }

    /**
     * Get <p>输出参数</p> 
     * @return OutputConfig <p>输出参数</p>
     */
    public AigcAudioOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>输出参数</p>
     * @param OutputConfig <p>输出参数</p>
     */
    public void setOutputConfig(AigcAudioOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例：<br>{"camera_control":{"type":"simple"}}</p> 
     * @return AdditionalParameters <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例：<br>{"camera_control":{"type":"simple"}}</p>
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例：<br>{"camera_control":{"type":"simple"}}</p>
     * @param AdditionalParameters <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例：<br>{"camera_control":{"type":"simple"}}</p>
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    public CreateAigcAudioTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioTaskRequest(CreateAigcAudioTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new AigcAudioReferenceVideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new AigcAudioReferenceVideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.AudioInfos != null) {
            this.AudioInfos = new AigcAudioReferenceAudioInfo[source.AudioInfos.length];
            for (int i = 0; i < source.AudioInfos.length; i++) {
                this.AudioInfos[i] = new AigcAudioReferenceAudioInfo(source.AudioInfos[i]);
            }
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcAudioOutputConfig(source.OutputConfig);
        }
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamArrayObj(map, prefix + "AudioInfos.", this.AudioInfos);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);

    }
}

