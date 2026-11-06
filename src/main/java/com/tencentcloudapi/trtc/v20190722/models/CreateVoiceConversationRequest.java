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

public class CreateVoiceConversationRequest extends AbstractModel {

    /**
    * <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#roomid">RoomId</a>，对话的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>房间信息RoomType，必须和对话的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p><p>枚举值：</p><ul><li>0： 数字房间号</li><li>1： 字符串房间号</li></ul><p>默认值：0</p>
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * <p>对话机器人相关配置。</p>
    */
    @SerializedName("AgentConfig")
    @Expose
    private VoiceConversationConfig AgentConfig;

    /**
    * <p>对话链路模式：<code>Cascade</code>（默认，三段式）/ <code>S2S</code>（端到端语音大模型）。</p><p>枚举值：</p><ul><li>Cascade： 默认，三段式</li><li>S2S： 端到端语音大模型</li></ul><p>默认值：Cascade</p>
    */
    @SerializedName("ConversationMode")
    @Expose
    private String ConversationMode;

    /**
    * <p>端到端语音大模型配置。<strong>仅 <code>S2S</code> 模式必填</strong>；<code>Cascade</code> 模式忽略。</p>
    */
    @SerializedName("S2SConfig")
    @Expose
    private VoiceConversationS2SConfig S2SConfig;

    /**
    * <p>语音识别配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
    */
    @SerializedName("STTConfig")
    @Expose
    private VoiceConversationSTTConfig STTConfig;

    /**
    * <p>大模型配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
    */
    @SerializedName("LLMConfig")
    @Expose
    private VoiceConversationLLMConfig LLMConfig;

    /**
    * <p>语音合成配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
    */
    @SerializedName("TTSConfig")
    @Expose
    private VoiceConversationTTSConfig TTSConfig;

    /**
    * <p>对话控制配置，<code>S2S</code> 模式不支持填写该参数。</p>
    */
    @SerializedName("DialogConfig")
    @Expose
    private VoiceConversationDialogConfig DialogConfig;

    /**
    * <p>视觉理解配置，<code>S2S</code> 模式不支持填写该参数。</p>
    */
    @SerializedName("VisionConfig")
    @Expose
    private VoiceConversationVisionConfig VisionConfig;

    /**
     * Get <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p> 
     * @return SdkAppId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p>
     * @param SdkAppId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#roomid">RoomId</a>，对话的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。</p> 
     * @return RoomId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#roomid">RoomId</a>，对话的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#roomid">RoomId</a>，对话的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。</p>
     * @param RoomId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#roomid">RoomId</a>，对话的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>房间信息RoomType，必须和对话的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p><p>枚举值：</p><ul><li>0： 数字房间号</li><li>1： 字符串房间号</li></ul><p>默认值：0</p> 
     * @return RoomIdType <p>房间信息RoomType，必须和对话的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p><p>枚举值：</p><ul><li>0： 数字房间号</li><li>1： 字符串房间号</li></ul><p>默认值：0</p>
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set <p>房间信息RoomType，必须和对话的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p><p>枚举值：</p><ul><li>0： 数字房间号</li><li>1： 字符串房间号</li></ul><p>默认值：0</p>
     * @param RoomIdType <p>房间信息RoomType，必须和对话的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p><p>枚举值：</p><ul><li>0： 数字房间号</li><li>1： 字符串房间号</li></ul><p>默认值：0</p>
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get <p>对话机器人相关配置。</p> 
     * @return AgentConfig <p>对话机器人相关配置。</p>
     */
    public VoiceConversationConfig getAgentConfig() {
        return this.AgentConfig;
    }

    /**
     * Set <p>对话机器人相关配置。</p>
     * @param AgentConfig <p>对话机器人相关配置。</p>
     */
    public void setAgentConfig(VoiceConversationConfig AgentConfig) {
        this.AgentConfig = AgentConfig;
    }

    /**
     * Get <p>对话链路模式：<code>Cascade</code>（默认，三段式）/ <code>S2S</code>（端到端语音大模型）。</p><p>枚举值：</p><ul><li>Cascade： 默认，三段式</li><li>S2S： 端到端语音大模型</li></ul><p>默认值：Cascade</p> 
     * @return ConversationMode <p>对话链路模式：<code>Cascade</code>（默认，三段式）/ <code>S2S</code>（端到端语音大模型）。</p><p>枚举值：</p><ul><li>Cascade： 默认，三段式</li><li>S2S： 端到端语音大模型</li></ul><p>默认值：Cascade</p>
     */
    public String getConversationMode() {
        return this.ConversationMode;
    }

    /**
     * Set <p>对话链路模式：<code>Cascade</code>（默认，三段式）/ <code>S2S</code>（端到端语音大模型）。</p><p>枚举值：</p><ul><li>Cascade： 默认，三段式</li><li>S2S： 端到端语音大模型</li></ul><p>默认值：Cascade</p>
     * @param ConversationMode <p>对话链路模式：<code>Cascade</code>（默认，三段式）/ <code>S2S</code>（端到端语音大模型）。</p><p>枚举值：</p><ul><li>Cascade： 默认，三段式</li><li>S2S： 端到端语音大模型</li></ul><p>默认值：Cascade</p>
     */
    public void setConversationMode(String ConversationMode) {
        this.ConversationMode = ConversationMode;
    }

    /**
     * Get <p>端到端语音大模型配置。<strong>仅 <code>S2S</code> 模式必填</strong>；<code>Cascade</code> 模式忽略。</p> 
     * @return S2SConfig <p>端到端语音大模型配置。<strong>仅 <code>S2S</code> 模式必填</strong>；<code>Cascade</code> 模式忽略。</p>
     */
    public VoiceConversationS2SConfig getS2SConfig() {
        return this.S2SConfig;
    }

    /**
     * Set <p>端到端语音大模型配置。<strong>仅 <code>S2S</code> 模式必填</strong>；<code>Cascade</code> 模式忽略。</p>
     * @param S2SConfig <p>端到端语音大模型配置。<strong>仅 <code>S2S</code> 模式必填</strong>；<code>Cascade</code> 模式忽略。</p>
     */
    public void setS2SConfig(VoiceConversationS2SConfig S2SConfig) {
        this.S2SConfig = S2SConfig;
    }

    /**
     * Get <p>语音识别配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p> 
     * @return STTConfig <p>语音识别配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
     */
    public VoiceConversationSTTConfig getSTTConfig() {
        return this.STTConfig;
    }

    /**
     * Set <p>语音识别配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
     * @param STTConfig <p>语音识别配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
     */
    public void setSTTConfig(VoiceConversationSTTConfig STTConfig) {
        this.STTConfig = STTConfig;
    }

    /**
     * Get <p>大模型配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p> 
     * @return LLMConfig <p>大模型配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
     */
    public VoiceConversationLLMConfig getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set <p>大模型配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
     * @param LLMConfig <p>大模型配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
     */
    public void setLLMConfig(VoiceConversationLLMConfig LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get <p>语音合成配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p> 
     * @return TTSConfig <p>语音合成配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
     */
    public VoiceConversationTTSConfig getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set <p>语音合成配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
     * @param TTSConfig <p>语音合成配置。<strong>仅 <code>Cascade</code> 模式必填</strong>；<code>S2S</code> 模式忽略。</p>
     */
    public void setTTSConfig(VoiceConversationTTSConfig TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    /**
     * Get <p>对话控制配置，<code>S2S</code> 模式不支持填写该参数。</p> 
     * @return DialogConfig <p>对话控制配置，<code>S2S</code> 模式不支持填写该参数。</p>
     */
    public VoiceConversationDialogConfig getDialogConfig() {
        return this.DialogConfig;
    }

    /**
     * Set <p>对话控制配置，<code>S2S</code> 模式不支持填写该参数。</p>
     * @param DialogConfig <p>对话控制配置，<code>S2S</code> 模式不支持填写该参数。</p>
     */
    public void setDialogConfig(VoiceConversationDialogConfig DialogConfig) {
        this.DialogConfig = DialogConfig;
    }

    /**
     * Get <p>视觉理解配置，<code>S2S</code> 模式不支持填写该参数。</p> 
     * @return VisionConfig <p>视觉理解配置，<code>S2S</code> 模式不支持填写该参数。</p>
     */
    public VoiceConversationVisionConfig getVisionConfig() {
        return this.VisionConfig;
    }

    /**
     * Set <p>视觉理解配置，<code>S2S</code> 模式不支持填写该参数。</p>
     * @param VisionConfig <p>视觉理解配置，<code>S2S</code> 模式不支持填写该参数。</p>
     */
    public void setVisionConfig(VoiceConversationVisionConfig VisionConfig) {
        this.VisionConfig = VisionConfig;
    }

    public CreateVoiceConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVoiceConversationRequest(CreateVoiceConversationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.AgentConfig != null) {
            this.AgentConfig = new VoiceConversationConfig(source.AgentConfig);
        }
        if (source.ConversationMode != null) {
            this.ConversationMode = new String(source.ConversationMode);
        }
        if (source.S2SConfig != null) {
            this.S2SConfig = new VoiceConversationS2SConfig(source.S2SConfig);
        }
        if (source.STTConfig != null) {
            this.STTConfig = new VoiceConversationSTTConfig(source.STTConfig);
        }
        if (source.LLMConfig != null) {
            this.LLMConfig = new VoiceConversationLLMConfig(source.LLMConfig);
        }
        if (source.TTSConfig != null) {
            this.TTSConfig = new VoiceConversationTTSConfig(source.TTSConfig);
        }
        if (source.DialogConfig != null) {
            this.DialogConfig = new VoiceConversationDialogConfig(source.DialogConfig);
        }
        if (source.VisionConfig != null) {
            this.VisionConfig = new VoiceConversationVisionConfig(source.VisionConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "AgentConfig.", this.AgentConfig);
        this.setParamSimple(map, prefix + "ConversationMode", this.ConversationMode);
        this.setParamObj(map, prefix + "S2SConfig.", this.S2SConfig);
        this.setParamObj(map, prefix + "STTConfig.", this.STTConfig);
        this.setParamObj(map, prefix + "LLMConfig.", this.LLMConfig);
        this.setParamObj(map, prefix + "TTSConfig.", this.TTSConfig);
        this.setParamObj(map, prefix + "DialogConfig.", this.DialogConfig);
        this.setParamObj(map, prefix + "VisionConfig.", this.VisionConfig);

    }
}

