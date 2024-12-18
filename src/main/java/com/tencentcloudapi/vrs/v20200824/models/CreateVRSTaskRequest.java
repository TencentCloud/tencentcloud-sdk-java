/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * 唯一请求 ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 音色名称
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * 音色性别:

1-male

2-female
    */
    @SerializedName("VoiceGender")
    @Expose
    private Long VoiceGender;

    /**
    * 语言类型：

1-中文
    */
    @SerializedName("VoiceLanguage")
    @Expose
    private Long VoiceLanguage;

    /**
    * 音频ID集合。（一句话声音复刻仅需填写一个音质检测接口返回的AudioId）
    */
    @SerializedName("AudioIdList")
    @Expose
    private String [] AudioIdList;

    /**
    * 音频采样率：

16000：16k
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 音频格式，音频类型(wav,mp3,aac,m4a)
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 回调 URL，用户自行搭建的用于接收结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。（注意：回调方式目前仅支持轻量版声音复刻）
回调采用POST请求方式，Content-Type为application/json，回调数据格式如下:{"TaskId":"xxxxxxxxxxxxxx","Status":2,"StatusStr":"success","VoiceType":xxxxx,"ErrorMsg":""}
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 模型类型 1:在线 2:离线  默认为1
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * 复刻类型。
0 - 轻量版声音复刻（默认）；
5 - 一句话声音复刻。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 校验音频ID。（仅基础版声音复刻使用）
    */
    @SerializedName("VPRAudioId")
    @Expose
    private String VPRAudioId;

    /**
     * Get 唯一请求 ID 
     * @return SessionId 唯一请求 ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 唯一请求 ID
     * @param SessionId 唯一请求 ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 音色名称 
     * @return VoiceName 音色名称
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set 音色名称
     * @param VoiceName 音色名称
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get 音色性别:

1-male

2-female 
     * @return VoiceGender 音色性别:

1-male

2-female
     */
    public Long getVoiceGender() {
        return this.VoiceGender;
    }

    /**
     * Set 音色性别:

1-male

2-female
     * @param VoiceGender 音色性别:

1-male

2-female
     */
    public void setVoiceGender(Long VoiceGender) {
        this.VoiceGender = VoiceGender;
    }

    /**
     * Get 语言类型：

1-中文 
     * @return VoiceLanguage 语言类型：

1-中文
     */
    public Long getVoiceLanguage() {
        return this.VoiceLanguage;
    }

    /**
     * Set 语言类型：

1-中文
     * @param VoiceLanguage 语言类型：

1-中文
     */
    public void setVoiceLanguage(Long VoiceLanguage) {
        this.VoiceLanguage = VoiceLanguage;
    }

    /**
     * Get 音频ID集合。（一句话声音复刻仅需填写一个音质检测接口返回的AudioId） 
     * @return AudioIdList 音频ID集合。（一句话声音复刻仅需填写一个音质检测接口返回的AudioId）
     */
    public String [] getAudioIdList() {
        return this.AudioIdList;
    }

    /**
     * Set 音频ID集合。（一句话声音复刻仅需填写一个音质检测接口返回的AudioId）
     * @param AudioIdList 音频ID集合。（一句话声音复刻仅需填写一个音质检测接口返回的AudioId）
     */
    public void setAudioIdList(String [] AudioIdList) {
        this.AudioIdList = AudioIdList;
    }

    /**
     * Get 音频采样率：

16000：16k 
     * @return SampleRate 音频采样率：

16000：16k
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频采样率：

16000：16k
     * @param SampleRate 音频采样率：

16000：16k
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 音频格式，音频类型(wav,mp3,aac,m4a) 
     * @return Codec 音频格式，音频类型(wav,mp3,aac,m4a)
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 音频格式，音频类型(wav,mp3,aac,m4a)
     * @param Codec 音频格式，音频类型(wav,mp3,aac,m4a)
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 回调 URL，用户自行搭建的用于接收结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。（注意：回调方式目前仅支持轻量版声音复刻）
回调采用POST请求方式，Content-Type为application/json，回调数据格式如下:{"TaskId":"xxxxxxxxxxxxxx","Status":2,"StatusStr":"success","VoiceType":xxxxx,"ErrorMsg":""} 
     * @return CallbackUrl 回调 URL，用户自行搭建的用于接收结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。（注意：回调方式目前仅支持轻量版声音复刻）
回调采用POST请求方式，Content-Type为application/json，回调数据格式如下:{"TaskId":"xxxxxxxxxxxxxx","Status":2,"StatusStr":"success","VoiceType":xxxxx,"ErrorMsg":""}
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调 URL，用户自行搭建的用于接收结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。（注意：回调方式目前仅支持轻量版声音复刻）
回调采用POST请求方式，Content-Type为application/json，回调数据格式如下:{"TaskId":"xxxxxxxxxxxxxx","Status":2,"StatusStr":"success","VoiceType":xxxxx,"ErrorMsg":""}
     * @param CallbackUrl 回调 URL，用户自行搭建的用于接收结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。（注意：回调方式目前仅支持轻量版声音复刻）
回调采用POST请求方式，Content-Type为application/json，回调数据格式如下:{"TaskId":"xxxxxxxxxxxxxx","Status":2,"StatusStr":"success","VoiceType":xxxxx,"ErrorMsg":""}
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 模型类型 1:在线 2:离线  默认为1 
     * @return ModelType 模型类型 1:在线 2:离线  默认为1
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set 模型类型 1:在线 2:离线  默认为1
     * @param ModelType 模型类型 1:在线 2:离线  默认为1
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 复刻类型。
0 - 轻量版声音复刻（默认）；
5 - 一句话声音复刻。 
     * @return TaskType 复刻类型。
0 - 轻量版声音复刻（默认）；
5 - 一句话声音复刻。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 复刻类型。
0 - 轻量版声音复刻（默认）；
5 - 一句话声音复刻。
     * @param TaskType 复刻类型。
0 - 轻量版声音复刻（默认）；
5 - 一句话声音复刻。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 校验音频ID。（仅基础版声音复刻使用） 
     * @return VPRAudioId 校验音频ID。（仅基础版声音复刻使用）
     */
    public String getVPRAudioId() {
        return this.VPRAudioId;
    }

    /**
     * Set 校验音频ID。（仅基础版声音复刻使用）
     * @param VPRAudioId 校验音频ID。（仅基础版声音复刻使用）
     */
    public void setVPRAudioId(String VPRAudioId) {
        this.VPRAudioId = VPRAudioId;
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

    }
}

