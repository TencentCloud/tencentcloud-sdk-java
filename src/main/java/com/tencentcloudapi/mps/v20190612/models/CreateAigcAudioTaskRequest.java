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

public class CreateAigcAudioTaskRequest extends AbstractModel {

    /**
    * <p>模型名称。生音乐当前支持的模型: GL、MiniMaxMusic。</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。<br>模型GL支持的版本号：2.0、3.0-clip、3.0-pro。<br>模型MinimaxMusic支持的版本号：2.0、2.5、2.6。</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>指定场景生音频。音乐: music。</p>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>参考视频信息。仅部分模型支持。</p>
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
    * <p>输出音频格式，默认不填。mp3、wav。</p>
    */
    @SerializedName("OutputAudioFormat")
    @Expose
    private String OutputAudioFormat;

    /**
    * <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * <p>用于传入要求的额外参数。</p>
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcAudioExtraParam ExtraParameters;

    /**
    * <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例MinimaxMusic模型传入歌词时：<br>{"lyric":{"小马在快乐奔跑，花儿在开放"}}</p>
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * <p>接口操作者名称。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>模型名称。生音乐当前支持的模型: GL、MiniMaxMusic。</p> 
     * @return ModelName <p>模型名称。生音乐当前支持的模型: GL、MiniMaxMusic。</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称。生音乐当前支持的模型: GL、MiniMaxMusic。</p>
     * @param ModelName <p>模型名称。生音乐当前支持的模型: GL、MiniMaxMusic。</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。<br>模型GL支持的版本号：2.0、3.0-clip、3.0-pro。<br>模型MinimaxMusic支持的版本号：2.0、2.5、2.6。</p> 
     * @return ModelVersion <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。<br>模型GL支持的版本号：2.0、3.0-clip、3.0-pro。<br>模型MinimaxMusic支持的版本号：2.0、2.5、2.6。</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。<br>模型GL支持的版本号：2.0、3.0-clip、3.0-pro。<br>模型MinimaxMusic支持的版本号：2.0、2.5、2.6。</p>
     * @param ModelVersion <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。<br>模型GL支持的版本号：2.0、3.0-clip、3.0-pro。<br>模型MinimaxMusic支持的版本号：2.0、2.5、2.6。</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>指定场景生音频。音乐: music。</p> 
     * @return SceneType <p>指定场景生音频。音乐: music。</p>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>指定场景生音频。音乐: music。</p>
     * @param SceneType <p>指定场景生音频。音乐: music。</p>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。</p> 
     * @return Prompt <p>生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。</p>
     * @param Prompt <p>生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>参考视频信息。仅部分模型支持。</p> 
     * @return VideoInfos <p>参考视频信息。仅部分模型支持。</p>
     */
    public AigcAudioReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set <p>参考视频信息。仅部分模型支持。</p>
     * @param VideoInfos <p>参考视频信息。仅部分模型支持。</p>
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
     * Get <p>输出音频格式，默认不填。mp3、wav。</p> 
     * @return OutputAudioFormat <p>输出音频格式，默认不填。mp3、wav。</p>
     */
    public String getOutputAudioFormat() {
        return this.OutputAudioFormat;
    }

    /**
     * Set <p>输出音频格式，默认不填。mp3、wav。</p>
     * @param OutputAudioFormat <p>输出音频格式，默认不填。mp3、wav。</p>
     */
    public void setOutputAudioFormat(String OutputAudioFormat) {
        this.OutputAudioFormat = OutputAudioFormat;
    }

    /**
     * Get <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p> 
     * @return StoreCosParam <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     * @param StoreCosParam <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get <p>用于传入要求的额外参数。</p> 
     * @return ExtraParameters <p>用于传入要求的额外参数。</p>
     */
    public AigcAudioExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set <p>用于传入要求的额外参数。</p>
     * @param ExtraParameters <p>用于传入要求的额外参数。</p>
     */
    public void setExtraParameters(AigcAudioExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例MinimaxMusic模型传入歌词时：<br>{"lyric":{"小马在快乐奔跑，花儿在开放"}}</p> 
     * @return AdditionalParameters <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例MinimaxMusic模型传入歌词时：<br>{"lyric":{"小马在快乐奔跑，花儿在开放"}}</p>
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例MinimaxMusic模型传入歌词时：<br>{"lyric":{"小马在快乐奔跑，花儿在开放"}}</p>
     * @param AdditionalParameters <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。<br>示例MinimaxMusic模型传入歌词时：<br>{"lyric":{"小马在快乐奔跑，花儿在开放"}}</p>
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get <p>接口操作者名称。</p> 
     * @return Operator <p>接口操作者名称。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>接口操作者名称。</p>
     * @param Operator <p>接口操作者名称。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public CreateAigcAudioTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioTaskRequest(CreateAigcAudioTaskRequest source) {
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
        if (source.OutputAudioFormat != null) {
            this.OutputAudioFormat = new String(source.OutputAudioFormat);
        }
        if (source.StoreCosParam != null) {
            this.StoreCosParam = new AigcStoreCosParam(source.StoreCosParam);
        }
        if (source.ExtraParameters != null) {
            this.ExtraParameters = new AigcAudioExtraParam(source.ExtraParameters);
        }
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamArrayObj(map, prefix + "AudioInfos.", this.AudioInfos);
        this.setParamSimple(map, prefix + "OutputAudioFormat", this.OutputAudioFormat);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

