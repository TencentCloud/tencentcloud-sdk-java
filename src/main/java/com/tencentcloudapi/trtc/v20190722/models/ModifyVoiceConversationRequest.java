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

public class ModifyVoiceConversationRequest extends AbstractModel {

    /**
    * <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>对话任务的唯一Id，在启动对话成功后会返回。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>需要保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
    */
    @SerializedName("SequenceNumber")
    @Expose
    private Long SequenceNumber;

    /**
    * <p>大模型配置。<strong>仅 <code>Cascade</code> 模式生效</strong>；<code>S2S</code> 模式报错。</p>
    */
    @SerializedName("LLMConfig")
    @Expose
    private VoiceConversationLLMConfig LLMConfig;

    /**
    * <p>端到端语音大模型配置。仅 <strong><code>S2S</code> 模式</strong>生效；<code>Cascade</code> 报错。</p>
    */
    @SerializedName("S2SConfig")
    @Expose
    private VoiceConversationS2SConfig S2SConfig;

    /**
    * <p>对话控制配置。<strong>仅 <code>Cascade</code> 模式生效</strong>。</p>
    */
    @SerializedName("DialogConfig")
    @Expose
    private VoiceConversationDialogConfig DialogConfig;

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
     * Get <p>对话任务的唯一Id，在启动对话成功后会返回。</p> 
     * @return TaskId <p>对话任务的唯一Id，在启动对话成功后会返回。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>对话任务的唯一Id，在启动对话成功后会返回。</p>
     * @param TaskId <p>对话任务的唯一Id，在启动对话成功后会返回。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>需要保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p> 
     * @return SequenceNumber <p>需要保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
     */
    public Long getSequenceNumber() {
        return this.SequenceNumber;
    }

    /**
     * Set <p>需要保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
     * @param SequenceNumber <p>需要保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
     */
    public void setSequenceNumber(Long SequenceNumber) {
        this.SequenceNumber = SequenceNumber;
    }

    /**
     * Get <p>大模型配置。<strong>仅 <code>Cascade</code> 模式生效</strong>；<code>S2S</code> 模式报错。</p> 
     * @return LLMConfig <p>大模型配置。<strong>仅 <code>Cascade</code> 模式生效</strong>；<code>S2S</code> 模式报错。</p>
     */
    public VoiceConversationLLMConfig getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set <p>大模型配置。<strong>仅 <code>Cascade</code> 模式生效</strong>；<code>S2S</code> 模式报错。</p>
     * @param LLMConfig <p>大模型配置。<strong>仅 <code>Cascade</code> 模式生效</strong>；<code>S2S</code> 模式报错。</p>
     */
    public void setLLMConfig(VoiceConversationLLMConfig LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get <p>端到端语音大模型配置。仅 <strong><code>S2S</code> 模式</strong>生效；<code>Cascade</code> 报错。</p> 
     * @return S2SConfig <p>端到端语音大模型配置。仅 <strong><code>S2S</code> 模式</strong>生效；<code>Cascade</code> 报错。</p>
     */
    public VoiceConversationS2SConfig getS2SConfig() {
        return this.S2SConfig;
    }

    /**
     * Set <p>端到端语音大模型配置。仅 <strong><code>S2S</code> 模式</strong>生效；<code>Cascade</code> 报错。</p>
     * @param S2SConfig <p>端到端语音大模型配置。仅 <strong><code>S2S</code> 模式</strong>生效；<code>Cascade</code> 报错。</p>
     */
    public void setS2SConfig(VoiceConversationS2SConfig S2SConfig) {
        this.S2SConfig = S2SConfig;
    }

    /**
     * Get <p>对话控制配置。<strong>仅 <code>Cascade</code> 模式生效</strong>。</p> 
     * @return DialogConfig <p>对话控制配置。<strong>仅 <code>Cascade</code> 模式生效</strong>。</p>
     */
    public VoiceConversationDialogConfig getDialogConfig() {
        return this.DialogConfig;
    }

    /**
     * Set <p>对话控制配置。<strong>仅 <code>Cascade</code> 模式生效</strong>。</p>
     * @param DialogConfig <p>对话控制配置。<strong>仅 <code>Cascade</code> 模式生效</strong>。</p>
     */
    public void setDialogConfig(VoiceConversationDialogConfig DialogConfig) {
        this.DialogConfig = DialogConfig;
    }

    public ModifyVoiceConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVoiceConversationRequest(ModifyVoiceConversationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SequenceNumber != null) {
            this.SequenceNumber = new Long(source.SequenceNumber);
        }
        if (source.LLMConfig != null) {
            this.LLMConfig = new VoiceConversationLLMConfig(source.LLMConfig);
        }
        if (source.S2SConfig != null) {
            this.S2SConfig = new VoiceConversationS2SConfig(source.S2SConfig);
        }
        if (source.DialogConfig != null) {
            this.DialogConfig = new VoiceConversationDialogConfig(source.DialogConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SequenceNumber", this.SequenceNumber);
        this.setParamObj(map, prefix + "LLMConfig.", this.LLMConfig);
        this.setParamObj(map, prefix + "S2SConfig.", this.S2SConfig);
        this.setParamObj(map, prefix + "DialogConfig.", this.DialogConfig);

    }
}

