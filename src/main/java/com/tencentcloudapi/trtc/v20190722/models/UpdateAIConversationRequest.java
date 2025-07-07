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

public class UpdateAIConversationRequest extends AbstractModel {

    /**
    * 唯一标识一个任务
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 不填写则不进行更新，机器人的欢迎语
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
    * 不填写则不进行更新。智能打断模式，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * 不填写则不进行更新。InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断
    */
    @SerializedName("InterruptSpeechDuration")
    @Expose
    private Long InterruptSpeechDuration;

    /**
    * 不填写则不进行更新，LLM配置，详情见StartAIConversation接口
    */
    @SerializedName("LLMConfig")
    @Expose
    private String LLMConfig;

    /**
    * 不填写则不进行更新，TTS配置，详情见StartAIConversation接口
    */
    @SerializedName("TTSConfig")
    @Expose
    private String TTSConfig;

    /**
     * Get 唯一标识一个任务 
     * @return TaskId 唯一标识一个任务
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 唯一标识一个任务
     * @param TaskId 唯一标识一个任务
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 不填写则不进行更新，机器人的欢迎语 
     * @return WelcomeMessage 不填写则不进行更新，机器人的欢迎语
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set 不填写则不进行更新，机器人的欢迎语
     * @param WelcomeMessage 不填写则不进行更新，机器人的欢迎语
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    /**
     * Get 不填写则不进行更新。智能打断模式，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断 
     * @return InterruptMode 不填写则不进行更新。智能打断模式，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set 不填写则不进行更新。智能打断模式，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
     * @param InterruptMode 不填写则不进行更新。智能打断模式，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get 不填写则不进行更新。InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断 
     * @return InterruptSpeechDuration 不填写则不进行更新。InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断
     */
    public Long getInterruptSpeechDuration() {
        return this.InterruptSpeechDuration;
    }

    /**
     * Set 不填写则不进行更新。InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断
     * @param InterruptSpeechDuration 不填写则不进行更新。InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断
     */
    public void setInterruptSpeechDuration(Long InterruptSpeechDuration) {
        this.InterruptSpeechDuration = InterruptSpeechDuration;
    }

    /**
     * Get 不填写则不进行更新，LLM配置，详情见StartAIConversation接口 
     * @return LLMConfig 不填写则不进行更新，LLM配置，详情见StartAIConversation接口
     */
    public String getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set 不填写则不进行更新，LLM配置，详情见StartAIConversation接口
     * @param LLMConfig 不填写则不进行更新，LLM配置，详情见StartAIConversation接口
     */
    public void setLLMConfig(String LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get 不填写则不进行更新，TTS配置，详情见StartAIConversation接口 
     * @return TTSConfig 不填写则不进行更新，TTS配置，详情见StartAIConversation接口
     */
    public String getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set 不填写则不进行更新，TTS配置，详情见StartAIConversation接口
     * @param TTSConfig 不填写则不进行更新，TTS配置，详情见StartAIConversation接口
     */
    public void setTTSConfig(String TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    public UpdateAIConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAIConversationRequest(UpdateAIConversationRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
        if (source.InterruptMode != null) {
            this.InterruptMode = new Long(source.InterruptMode);
        }
        if (source.InterruptSpeechDuration != null) {
            this.InterruptSpeechDuration = new Long(source.InterruptSpeechDuration);
        }
        if (source.LLMConfig != null) {
            this.LLMConfig = new String(source.LLMConfig);
        }
        if (source.TTSConfig != null) {
            this.TTSConfig = new String(source.TTSConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamSimple(map, prefix + "InterruptSpeechDuration", this.InterruptSpeechDuration);
        this.setParamSimple(map, prefix + "LLMConfig", this.LLMConfig);
        this.setParamSimple(map, prefix + "TTSConfig", this.TTSConfig);

    }
}

