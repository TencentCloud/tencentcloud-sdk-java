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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartAIConversationRequest extends AbstractModel {

    /**
    * TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和开启转录任务的房间使用的SdkAppId相同。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，表示开启对话任务的房间号。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 机器人参数
    */
    @SerializedName("AgentConfig")
    @Expose
    private AgentConfig AgentConfig;

    /**
    * 调用方传入的唯一Id，可用于客户侧防止重复发起任务以及可以通过该字段查询任务状态。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * 语音识别配置。
    */
    @SerializedName("STTConfig")
    @Expose
    private STTConfig STTConfig;

    /**
    * 必填参数，LLM配置。需符合openai规范，为JSON字符串，示例如下：<pre> { <br> &emsp;  "LLMType": "大模型类型",  // String 必填，如："openai" <br> &emsp;  "Model": "您的模型名称", // String 必填，指定使用的模型<br>    "APIKey": "您的LLM API密钥", // String 必填 <br> &emsp;  "APIUrl": "https://api.xxx.com/chat/completions", // String 必填，LLM API访问的URL<br> &emsp;  "History": 10, // Integer 选填，设置 LLM 的上下文轮次，默认值为0，最大值50<br> &emsp;  "HistoryMode": 1, // Integer 选填，1表示LLM上下文中的内容会和播放音频做同步，没有播放的音频对应的文本不会出现在上下文中。0表示不会做同步，默认值为0<br> &emsp;  "Streaming": true // Boolean 非必填，指定是否使用流式传输<br> &emsp;} </pre>
    */
    @SerializedName("LLMConfig")
    @Expose
    private String LLMConfig;

    /**
    * 必填参数，TTS配置，详见 [TTS配置说明](https://cloud.tencent.com/document/product/647/115414 )， 为JSON字符串: TRTC TTS的配置如下：```{  "TTSType": "flow",  // 【必填】固定为此值  "VoiceId": "v-female-R2s4N9qJ", // 【必填】精品音色 ID /克隆音色 ID, 可选择不同音色, ID 库参考下方音色列表  "Model": "flow_01_turbo", // 【必填】当前默认的 TTS 模型版本（对应 Flash 版本）  "Speed": 1.0,    //【可选】调节语速 范围 [0.5-2.0],默认 1.0; 取值越大，语速越快  "Volume": 1.0,   // 【可选】调节音量 [0, 10] 默认值 1.0; 取值越大，音量越高  "Pitch": 0,   // 【可选】调节语调 [-12,12],默认值为 0,其中 0 为原音色输出。  "Language": "zh" //【可选】建议填写，目前支持填写中文：zh 英文：en 粤语方言：yue; 参数参考：(ISO 639-1) }```
    */
    @SerializedName("TTSConfig")
    @Expose
    private String TTSConfig;

    /**
    * 数字人配置，为JSON字符串。**数字人配置需要提工单加白后才能使用**
    */
    @SerializedName("AvatarConfig")
    @Expose
    private String AvatarConfig;

    /**
    * 实验性参数,联系后台使用
    */
    @SerializedName("ExperimentalParams")
    @Expose
    private String ExperimentalParams;

    /**
     * Get TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和开启转录任务的房间使用的SdkAppId相同。 
     * @return SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和开启转录任务的房间使用的SdkAppId相同。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和开启转录任务的房间使用的SdkAppId相同。
     * @param SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和开启转录任务的房间使用的SdkAppId相同。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，表示开启对话任务的房间号。 
     * @return RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，表示开启对话任务的房间号。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，表示开启对话任务的房间号。
     * @param RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，表示开启对话任务的房间号。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 机器人参数 
     * @return AgentConfig 机器人参数
     */
    public AgentConfig getAgentConfig() {
        return this.AgentConfig;
    }

    /**
     * Set 机器人参数
     * @param AgentConfig 机器人参数
     */
    public void setAgentConfig(AgentConfig AgentConfig) {
        this.AgentConfig = AgentConfig;
    }

    /**
     * Get 调用方传入的唯一Id，可用于客户侧防止重复发起任务以及可以通过该字段查询任务状态。 
     * @return SessionId 调用方传入的唯一Id，可用于客户侧防止重复发起任务以及可以通过该字段查询任务状态。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 调用方传入的唯一Id，可用于客户侧防止重复发起任务以及可以通过该字段查询任务状态。
     * @param SessionId 调用方传入的唯一Id，可用于客户侧防止重复发起任务以及可以通过该字段查询任务状态。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。 
     * @return RoomIdType TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。
     * @param RoomIdType TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get 语音识别配置。 
     * @return STTConfig 语音识别配置。
     */
    public STTConfig getSTTConfig() {
        return this.STTConfig;
    }

    /**
     * Set 语音识别配置。
     * @param STTConfig 语音识别配置。
     */
    public void setSTTConfig(STTConfig STTConfig) {
        this.STTConfig = STTConfig;
    }

    /**
     * Get 必填参数，LLM配置。需符合openai规范，为JSON字符串，示例如下：<pre> { <br> &emsp;  "LLMType": "大模型类型",  // String 必填，如："openai" <br> &emsp;  "Model": "您的模型名称", // String 必填，指定使用的模型<br>    "APIKey": "您的LLM API密钥", // String 必填 <br> &emsp;  "APIUrl": "https://api.xxx.com/chat/completions", // String 必填，LLM API访问的URL<br> &emsp;  "History": 10, // Integer 选填，设置 LLM 的上下文轮次，默认值为0，最大值50<br> &emsp;  "HistoryMode": 1, // Integer 选填，1表示LLM上下文中的内容会和播放音频做同步，没有播放的音频对应的文本不会出现在上下文中。0表示不会做同步，默认值为0<br> &emsp;  "Streaming": true // Boolean 非必填，指定是否使用流式传输<br> &emsp;} </pre> 
     * @return LLMConfig 必填参数，LLM配置。需符合openai规范，为JSON字符串，示例如下：<pre> { <br> &emsp;  "LLMType": "大模型类型",  // String 必填，如："openai" <br> &emsp;  "Model": "您的模型名称", // String 必填，指定使用的模型<br>    "APIKey": "您的LLM API密钥", // String 必填 <br> &emsp;  "APIUrl": "https://api.xxx.com/chat/completions", // String 必填，LLM API访问的URL<br> &emsp;  "History": 10, // Integer 选填，设置 LLM 的上下文轮次，默认值为0，最大值50<br> &emsp;  "HistoryMode": 1, // Integer 选填，1表示LLM上下文中的内容会和播放音频做同步，没有播放的音频对应的文本不会出现在上下文中。0表示不会做同步，默认值为0<br> &emsp;  "Streaming": true // Boolean 非必填，指定是否使用流式传输<br> &emsp;} </pre>
     */
    public String getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set 必填参数，LLM配置。需符合openai规范，为JSON字符串，示例如下：<pre> { <br> &emsp;  "LLMType": "大模型类型",  // String 必填，如："openai" <br> &emsp;  "Model": "您的模型名称", // String 必填，指定使用的模型<br>    "APIKey": "您的LLM API密钥", // String 必填 <br> &emsp;  "APIUrl": "https://api.xxx.com/chat/completions", // String 必填，LLM API访问的URL<br> &emsp;  "History": 10, // Integer 选填，设置 LLM 的上下文轮次，默认值为0，最大值50<br> &emsp;  "HistoryMode": 1, // Integer 选填，1表示LLM上下文中的内容会和播放音频做同步，没有播放的音频对应的文本不会出现在上下文中。0表示不会做同步，默认值为0<br> &emsp;  "Streaming": true // Boolean 非必填，指定是否使用流式传输<br> &emsp;} </pre>
     * @param LLMConfig 必填参数，LLM配置。需符合openai规范，为JSON字符串，示例如下：<pre> { <br> &emsp;  "LLMType": "大模型类型",  // String 必填，如："openai" <br> &emsp;  "Model": "您的模型名称", // String 必填，指定使用的模型<br>    "APIKey": "您的LLM API密钥", // String 必填 <br> &emsp;  "APIUrl": "https://api.xxx.com/chat/completions", // String 必填，LLM API访问的URL<br> &emsp;  "History": 10, // Integer 选填，设置 LLM 的上下文轮次，默认值为0，最大值50<br> &emsp;  "HistoryMode": 1, // Integer 选填，1表示LLM上下文中的内容会和播放音频做同步，没有播放的音频对应的文本不会出现在上下文中。0表示不会做同步，默认值为0<br> &emsp;  "Streaming": true // Boolean 非必填，指定是否使用流式传输<br> &emsp;} </pre>
     */
    public void setLLMConfig(String LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get 必填参数，TTS配置，详见 [TTS配置说明](https://cloud.tencent.com/document/product/647/115414 )， 为JSON字符串: TRTC TTS的配置如下：```{  "TTSType": "flow",  // 【必填】固定为此值  "VoiceId": "v-female-R2s4N9qJ", // 【必填】精品音色 ID /克隆音色 ID, 可选择不同音色, ID 库参考下方音色列表  "Model": "flow_01_turbo", // 【必填】当前默认的 TTS 模型版本（对应 Flash 版本）  "Speed": 1.0,    //【可选】调节语速 范围 [0.5-2.0],默认 1.0; 取值越大，语速越快  "Volume": 1.0,   // 【可选】调节音量 [0, 10] 默认值 1.0; 取值越大，音量越高  "Pitch": 0,   // 【可选】调节语调 [-12,12],默认值为 0,其中 0 为原音色输出。  "Language": "zh" //【可选】建议填写，目前支持填写中文：zh 英文：en 粤语方言：yue; 参数参考：(ISO 639-1) }``` 
     * @return TTSConfig 必填参数，TTS配置，详见 [TTS配置说明](https://cloud.tencent.com/document/product/647/115414 )， 为JSON字符串: TRTC TTS的配置如下：```{  "TTSType": "flow",  // 【必填】固定为此值  "VoiceId": "v-female-R2s4N9qJ", // 【必填】精品音色 ID /克隆音色 ID, 可选择不同音色, ID 库参考下方音色列表  "Model": "flow_01_turbo", // 【必填】当前默认的 TTS 模型版本（对应 Flash 版本）  "Speed": 1.0,    //【可选】调节语速 范围 [0.5-2.0],默认 1.0; 取值越大，语速越快  "Volume": 1.0,   // 【可选】调节音量 [0, 10] 默认值 1.0; 取值越大，音量越高  "Pitch": 0,   // 【可选】调节语调 [-12,12],默认值为 0,其中 0 为原音色输出。  "Language": "zh" //【可选】建议填写，目前支持填写中文：zh 英文：en 粤语方言：yue; 参数参考：(ISO 639-1) }```
     */
    public String getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set 必填参数，TTS配置，详见 [TTS配置说明](https://cloud.tencent.com/document/product/647/115414 )， 为JSON字符串: TRTC TTS的配置如下：```{  "TTSType": "flow",  // 【必填】固定为此值  "VoiceId": "v-female-R2s4N9qJ", // 【必填】精品音色 ID /克隆音色 ID, 可选择不同音色, ID 库参考下方音色列表  "Model": "flow_01_turbo", // 【必填】当前默认的 TTS 模型版本（对应 Flash 版本）  "Speed": 1.0,    //【可选】调节语速 范围 [0.5-2.0],默认 1.0; 取值越大，语速越快  "Volume": 1.0,   // 【可选】调节音量 [0, 10] 默认值 1.0; 取值越大，音量越高  "Pitch": 0,   // 【可选】调节语调 [-12,12],默认值为 0,其中 0 为原音色输出。  "Language": "zh" //【可选】建议填写，目前支持填写中文：zh 英文：en 粤语方言：yue; 参数参考：(ISO 639-1) }```
     * @param TTSConfig 必填参数，TTS配置，详见 [TTS配置说明](https://cloud.tencent.com/document/product/647/115414 )， 为JSON字符串: TRTC TTS的配置如下：```{  "TTSType": "flow",  // 【必填】固定为此值  "VoiceId": "v-female-R2s4N9qJ", // 【必填】精品音色 ID /克隆音色 ID, 可选择不同音色, ID 库参考下方音色列表  "Model": "flow_01_turbo", // 【必填】当前默认的 TTS 模型版本（对应 Flash 版本）  "Speed": 1.0,    //【可选】调节语速 范围 [0.5-2.0],默认 1.0; 取值越大，语速越快  "Volume": 1.0,   // 【可选】调节音量 [0, 10] 默认值 1.0; 取值越大，音量越高  "Pitch": 0,   // 【可选】调节语调 [-12,12],默认值为 0,其中 0 为原音色输出。  "Language": "zh" //【可选】建议填写，目前支持填写中文：zh 英文：en 粤语方言：yue; 参数参考：(ISO 639-1) }```
     */
    public void setTTSConfig(String TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    /**
     * Get 数字人配置，为JSON字符串。**数字人配置需要提工单加白后才能使用** 
     * @return AvatarConfig 数字人配置，为JSON字符串。**数字人配置需要提工单加白后才能使用**
     */
    public String getAvatarConfig() {
        return this.AvatarConfig;
    }

    /**
     * Set 数字人配置，为JSON字符串。**数字人配置需要提工单加白后才能使用**
     * @param AvatarConfig 数字人配置，为JSON字符串。**数字人配置需要提工单加白后才能使用**
     */
    public void setAvatarConfig(String AvatarConfig) {
        this.AvatarConfig = AvatarConfig;
    }

    /**
     * Get 实验性参数,联系后台使用 
     * @return ExperimentalParams 实验性参数,联系后台使用
     */
    public String getExperimentalParams() {
        return this.ExperimentalParams;
    }

    /**
     * Set 实验性参数,联系后台使用
     * @param ExperimentalParams 实验性参数,联系后台使用
     */
    public void setExperimentalParams(String ExperimentalParams) {
        this.ExperimentalParams = ExperimentalParams;
    }

    public StartAIConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartAIConversationRequest(StartAIConversationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.AgentConfig != null) {
            this.AgentConfig = new AgentConfig(source.AgentConfig);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.STTConfig != null) {
            this.STTConfig = new STTConfig(source.STTConfig);
        }
        if (source.LLMConfig != null) {
            this.LLMConfig = new String(source.LLMConfig);
        }
        if (source.TTSConfig != null) {
            this.TTSConfig = new String(source.TTSConfig);
        }
        if (source.AvatarConfig != null) {
            this.AvatarConfig = new String(source.AvatarConfig);
        }
        if (source.ExperimentalParams != null) {
            this.ExperimentalParams = new String(source.ExperimentalParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamObj(map, prefix + "AgentConfig.", this.AgentConfig);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "STTConfig.", this.STTConfig);
        this.setParamSimple(map, prefix + "LLMConfig", this.LLMConfig);
        this.setParamSimple(map, prefix + "TTSConfig", this.TTSConfig);
        this.setParamSimple(map, prefix + "AvatarConfig", this.AvatarConfig);
        this.setParamSimple(map, prefix + "ExperimentalParams", this.ExperimentalParams);

    }
}

