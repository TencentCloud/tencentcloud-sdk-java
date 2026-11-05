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
package com.tencentcloudapi.vrs.v20200824.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVRSTaskRequest extends AbstractModel {

    /**
    * <p>唯一请求 ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>音色名称</p>
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * <p>音色性别:</p><p>1-male</p><p>2-female</p>
    */
    @SerializedName("VoiceGender")
    @Expose
    private Long VoiceGender;

    /**
    * <p>语言类型：</p><p>1-中文</p>
    */
    @SerializedName("VoiceLanguage")
    @Expose
    private Long VoiceLanguage;

    /**
    * <p>音频ID集合。（一句话声音复刻仅需填写一个音质检测接口返回的AudioId）</p>
    */
    @SerializedName("AudioIdList")
    @Expose
    private String [] AudioIdList;

    /**
    * <p>音频采样率：</p><p>16000：16k</p>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>音频格式，音频类型(wav,mp3,aac,m4a)</p>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * <p>回调 URL，用户自行搭建的用于接收结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。（注意：回调方式暂不支持一句话版声音复刻）<br>回调采用POST请求方式，Content-Type为application/json，回调数据格式如下:{&quot;TaskId&quot;:&quot;xxxxxxxxxxxxxx&quot;,&quot;Status&quot;:2,&quot;StatusStr&quot;:&quot;success&quot;,&quot;VoiceType&quot;:xxxxx,&quot;ErrorMsg&quot;:&quot;&quot;}</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>模型类型 1:在线 2:离线  默认为1</p>
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * <p>复刻类型。<br>5 - 一句话声音复刻。</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>校验音频ID。（仅基础版声音复刻使用）</p>
    */
    @SerializedName("VPRAudioId")
    @Expose
    private String VPRAudioId;

    /**
    * <p>是否开启语音增强，0 - 关闭，1 - 开启 。默认关闭<br>语音增强仅适用于一句话复刻场景</p>
    */
    @SerializedName("EnableVoiceEnhance")
    @Expose
    private Long EnableVoiceEnhance;

    /**
    * <p>模型引擎，可选值：</p><ul><li><p>WXZL（默认）</p></li><li><p>YTLX_V2（新版）</p></li></ul><p>示例：YTLX_V2</p>
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
     * Get <p>唯一请求 ID</p> 
     * @return SessionId <p>唯一请求 ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>唯一请求 ID</p>
     * @param SessionId <p>唯一请求 ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>音色名称</p> 
     * @return VoiceName <p>音色名称</p>
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set <p>音色名称</p>
     * @param VoiceName <p>音色名称</p>
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get <p>音色性别:</p><p>1-male</p><p>2-female</p> 
     * @return VoiceGender <p>音色性别:</p><p>1-male</p><p>2-female</p>
     */
    public Long getVoiceGender() {
        return this.VoiceGender;
    }

    /**
     * Set <p>音色性别:</p><p>1-male</p><p>2-female</p>
     * @param VoiceGender <p>音色性别:</p><p>1-male</p><p>2-female</p>
     */
    public void setVoiceGender(Long VoiceGender) {
        this.VoiceGender = VoiceGender;
    }

    /**
     * Get <p>语言类型：</p><p>1-中文</p> 
     * @return VoiceLanguage <p>语言类型：</p><p>1-中文</p>
     */
    public Long getVoiceLanguage() {
        return this.VoiceLanguage;
    }

    /**
     * Set <p>语言类型：</p><p>1-中文</p>
     * @param VoiceLanguage <p>语言类型：</p><p>1-中文</p>
     */
    public void setVoiceLanguage(Long VoiceLanguage) {
        this.VoiceLanguage = VoiceLanguage;
    }

    /**
     * Get <p>音频ID集合。（一句话声音复刻仅需填写一个音质检测接口返回的AudioId）</p> 
     * @return AudioIdList <p>音频ID集合。（一句话声音复刻仅需填写一个音质检测接口返回的AudioId）</p>
     */
    public String [] getAudioIdList() {
        return this.AudioIdList;
    }

    /**
     * Set <p>音频ID集合。（一句话声音复刻仅需填写一个音质检测接口返回的AudioId）</p>
     * @param AudioIdList <p>音频ID集合。（一句话声音复刻仅需填写一个音质检测接口返回的AudioId）</p>
     */
    public void setAudioIdList(String [] AudioIdList) {
        this.AudioIdList = AudioIdList;
    }

    /**
     * Get <p>音频采样率：</p><p>16000：16k</p> 
     * @return SampleRate <p>音频采样率：</p><p>16000：16k</p>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>音频采样率：</p><p>16000：16k</p>
     * @param SampleRate <p>音频采样率：</p><p>16000：16k</p>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>音频格式，音频类型(wav,mp3,aac,m4a)</p> 
     * @return Codec <p>音频格式，音频类型(wav,mp3,aac,m4a)</p>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>音频格式，音频类型(wav,mp3,aac,m4a)</p>
     * @param Codec <p>音频格式，音频类型(wav,mp3,aac,m4a)</p>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get <p>回调 URL，用户自行搭建的用于接收结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。（注意：回调方式暂不支持一句话版声音复刻）<br>回调采用POST请求方式，Content-Type为application/json，回调数据格式如下:{&quot;TaskId&quot;:&quot;xxxxxxxxxxxxxx&quot;,&quot;Status&quot;:2,&quot;StatusStr&quot;:&quot;success&quot;,&quot;VoiceType&quot;:xxxxx,&quot;ErrorMsg&quot;:&quot;&quot;}</p> 
     * @return CallbackUrl <p>回调 URL，用户自行搭建的用于接收结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。（注意：回调方式暂不支持一句话版声音复刻）<br>回调采用POST请求方式，Content-Type为application/json，回调数据格式如下:{&quot;TaskId&quot;:&quot;xxxxxxxxxxxxxx&quot;,&quot;Status&quot;:2,&quot;StatusStr&quot;:&quot;success&quot;,&quot;VoiceType&quot;:xxxxx,&quot;ErrorMsg&quot;:&quot;&quot;}</p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>回调 URL，用户自行搭建的用于接收结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。（注意：回调方式暂不支持一句话版声音复刻）<br>回调采用POST请求方式，Content-Type为application/json，回调数据格式如下:{&quot;TaskId&quot;:&quot;xxxxxxxxxxxxxx&quot;,&quot;Status&quot;:2,&quot;StatusStr&quot;:&quot;success&quot;,&quot;VoiceType&quot;:xxxxx,&quot;ErrorMsg&quot;:&quot;&quot;}</p>
     * @param CallbackUrl <p>回调 URL，用户自行搭建的用于接收结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。（注意：回调方式暂不支持一句话版声音复刻）<br>回调采用POST请求方式，Content-Type为application/json，回调数据格式如下:{&quot;TaskId&quot;:&quot;xxxxxxxxxxxxxx&quot;,&quot;Status&quot;:2,&quot;StatusStr&quot;:&quot;success&quot;,&quot;VoiceType&quot;:xxxxx,&quot;ErrorMsg&quot;:&quot;&quot;}</p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>模型类型 1:在线 2:离线  默认为1</p> 
     * @return ModelType <p>模型类型 1:在线 2:离线  默认为1</p>
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型 1:在线 2:离线  默认为1</p>
     * @param ModelType <p>模型类型 1:在线 2:离线  默认为1</p>
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>复刻类型。<br>5 - 一句话声音复刻。</p> 
     * @return TaskType <p>复刻类型。<br>5 - 一句话声音复刻。</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>复刻类型。<br>5 - 一句话声音复刻。</p>
     * @param TaskType <p>复刻类型。<br>5 - 一句话声音复刻。</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>校验音频ID。（仅基础版声音复刻使用）</p> 
     * @return VPRAudioId <p>校验音频ID。（仅基础版声音复刻使用）</p>
     */
    public String getVPRAudioId() {
        return this.VPRAudioId;
    }

    /**
     * Set <p>校验音频ID。（仅基础版声音复刻使用）</p>
     * @param VPRAudioId <p>校验音频ID。（仅基础版声音复刻使用）</p>
     */
    public void setVPRAudioId(String VPRAudioId) {
        this.VPRAudioId = VPRAudioId;
    }

    /**
     * Get <p>是否开启语音增强，0 - 关闭，1 - 开启 。默认关闭<br>语音增强仅适用于一句话复刻场景</p> 
     * @return EnableVoiceEnhance <p>是否开启语音增强，0 - 关闭，1 - 开启 。默认关闭<br>语音增强仅适用于一句话复刻场景</p>
     */
    public Long getEnableVoiceEnhance() {
        return this.EnableVoiceEnhance;
    }

    /**
     * Set <p>是否开启语音增强，0 - 关闭，1 - 开启 。默认关闭<br>语音增强仅适用于一句话复刻场景</p>
     * @param EnableVoiceEnhance <p>是否开启语音增强，0 - 关闭，1 - 开启 。默认关闭<br>语音增强仅适用于一句话复刻场景</p>
     */
    public void setEnableVoiceEnhance(Long EnableVoiceEnhance) {
        this.EnableVoiceEnhance = EnableVoiceEnhance;
    }

    /**
     * Get <p>模型引擎，可选值：</p><ul><li><p>WXZL（默认）</p></li><li><p>YTLX_V2（新版）</p></li></ul><p>示例：YTLX_V2</p> 
     * @return EngineType <p>模型引擎，可选值：</p><ul><li><p>WXZL（默认）</p></li><li><p>YTLX_V2（新版）</p></li></ul><p>示例：YTLX_V2</p>
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set <p>模型引擎，可选值：</p><ul><li><p>WXZL（默认）</p></li><li><p>YTLX_V2（新版）</p></li></ul><p>示例：YTLX_V2</p>
     * @param EngineType <p>模型引擎，可选值：</p><ul><li><p>WXZL（默认）</p></li><li><p>YTLX_V2（新版）</p></li></ul><p>示例：YTLX_V2</p>
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public CreateVRSTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVRSTaskRequest(CreateVRSTaskRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.VoiceGender != null) {
            this.VoiceGender = new Long(source.VoiceGender);
        }
        if (source.VoiceLanguage != null) {
            this.VoiceLanguage = new Long(source.VoiceLanguage);
        }
        if (source.AudioIdList != null) {
            this.AudioIdList = new String[source.AudioIdList.length];
            for (int i = 0; i < source.AudioIdList.length; i++) {
                this.AudioIdList[i] = new String(source.AudioIdList[i]);
            }
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ModelType != null) {
            this.ModelType = new Long(source.ModelType);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.VPRAudioId != null) {
            this.VPRAudioId = new String(source.VPRAudioId);
        }
        if (source.EnableVoiceEnhance != null) {
            this.EnableVoiceEnhance = new Long(source.EnableVoiceEnhance);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "VoiceGender", this.VoiceGender);
        this.setParamSimple(map, prefix + "VoiceLanguage", this.VoiceLanguage);
        this.setParamArraySimple(map, prefix + "AudioIdList.", this.AudioIdList);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "VPRAudioId", this.VPRAudioId);
        this.setParamSimple(map, prefix + "EnableVoiceEnhance", this.EnableVoiceEnhance);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

