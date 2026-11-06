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

public class VoiceConversationDialogConfig extends AbstractModel {

    /**
    * <p>打断模式。</p><p>枚举值：</p><ul><li>0： 自动打断（ASR 出文本打断 TTS，配合InterruptSpeechDuration 使用，默认）</li><li>1： 手动打断（仅服务端/客户端接口 Interrupt 命令打断）</li><li>2： 关键词打断</li></ul>
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * <p>自动打断的最小用户语音持续时长（毫秒），默认 200</p><p>单位：毫秒</p>
    */
    @SerializedName("InterruptSpeechDuration")
    @Expose
    private Long InterruptSpeechDuration;

    /**
    * <p>预设的关键词，关键词打断，适用于需要用户明确表达意图才能打断的场景。最多支持128个关键词，InterruptMode 为2时生效，</p>
    */
    @SerializedName("InterruptKeywords")
    @Expose
    private String [] InterruptKeywords;

    /**
    * <p>用户静音多久后 Bot 主动追问，范围 0~300，0 表示关闭（默认）。</p><p>单位：秒</p>
    */
    @SerializedName("SilenceFollowUp")
    @Expose
    private Long SilenceFollowUp;

    /**
    * <p>主动追问的文本。</p>
    */
    @SerializedName("SilenceFollowUpText")
    @Expose
    private String SilenceFollowUpText;

    /**
    * <p>主播首次进房主动播报的欢迎语，主播退房后再次进房也会播报。</p>
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
     * Get <p>打断模式。</p><p>枚举值：</p><ul><li>0： 自动打断（ASR 出文本打断 TTS，配合InterruptSpeechDuration 使用，默认）</li><li>1： 手动打断（仅服务端/客户端接口 Interrupt 命令打断）</li><li>2： 关键词打断</li></ul> 
     * @return InterruptMode <p>打断模式。</p><p>枚举值：</p><ul><li>0： 自动打断（ASR 出文本打断 TTS，配合InterruptSpeechDuration 使用，默认）</li><li>1： 手动打断（仅服务端/客户端接口 Interrupt 命令打断）</li><li>2： 关键词打断</li></ul>
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set <p>打断模式。</p><p>枚举值：</p><ul><li>0： 自动打断（ASR 出文本打断 TTS，配合InterruptSpeechDuration 使用，默认）</li><li>1： 手动打断（仅服务端/客户端接口 Interrupt 命令打断）</li><li>2： 关键词打断</li></ul>
     * @param InterruptMode <p>打断模式。</p><p>枚举值：</p><ul><li>0： 自动打断（ASR 出文本打断 TTS，配合InterruptSpeechDuration 使用，默认）</li><li>1： 手动打断（仅服务端/客户端接口 Interrupt 命令打断）</li><li>2： 关键词打断</li></ul>
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get <p>自动打断的最小用户语音持续时长（毫秒），默认 200</p><p>单位：毫秒</p> 
     * @return InterruptSpeechDuration <p>自动打断的最小用户语音持续时长（毫秒），默认 200</p><p>单位：毫秒</p>
     */
    public Long getInterruptSpeechDuration() {
        return this.InterruptSpeechDuration;
    }

    /**
     * Set <p>自动打断的最小用户语音持续时长（毫秒），默认 200</p><p>单位：毫秒</p>
     * @param InterruptSpeechDuration <p>自动打断的最小用户语音持续时长（毫秒），默认 200</p><p>单位：毫秒</p>
     */
    public void setInterruptSpeechDuration(Long InterruptSpeechDuration) {
        this.InterruptSpeechDuration = InterruptSpeechDuration;
    }

    /**
     * Get <p>预设的关键词，关键词打断，适用于需要用户明确表达意图才能打断的场景。最多支持128个关键词，InterruptMode 为2时生效，</p> 
     * @return InterruptKeywords <p>预设的关键词，关键词打断，适用于需要用户明确表达意图才能打断的场景。最多支持128个关键词，InterruptMode 为2时生效，</p>
     */
    public String [] getInterruptKeywords() {
        return this.InterruptKeywords;
    }

    /**
     * Set <p>预设的关键词，关键词打断，适用于需要用户明确表达意图才能打断的场景。最多支持128个关键词，InterruptMode 为2时生效，</p>
     * @param InterruptKeywords <p>预设的关键词，关键词打断，适用于需要用户明确表达意图才能打断的场景。最多支持128个关键词，InterruptMode 为2时生效，</p>
     */
    public void setInterruptKeywords(String [] InterruptKeywords) {
        this.InterruptKeywords = InterruptKeywords;
    }

    /**
     * Get <p>用户静音多久后 Bot 主动追问，范围 0~300，0 表示关闭（默认）。</p><p>单位：秒</p> 
     * @return SilenceFollowUp <p>用户静音多久后 Bot 主动追问，范围 0~300，0 表示关闭（默认）。</p><p>单位：秒</p>
     */
    public Long getSilenceFollowUp() {
        return this.SilenceFollowUp;
    }

    /**
     * Set <p>用户静音多久后 Bot 主动追问，范围 0~300，0 表示关闭（默认）。</p><p>单位：秒</p>
     * @param SilenceFollowUp <p>用户静音多久后 Bot 主动追问，范围 0~300，0 表示关闭（默认）。</p><p>单位：秒</p>
     */
    public void setSilenceFollowUp(Long SilenceFollowUp) {
        this.SilenceFollowUp = SilenceFollowUp;
    }

    /**
     * Get <p>主动追问的文本。</p> 
     * @return SilenceFollowUpText <p>主动追问的文本。</p>
     */
    public String getSilenceFollowUpText() {
        return this.SilenceFollowUpText;
    }

    /**
     * Set <p>主动追问的文本。</p>
     * @param SilenceFollowUpText <p>主动追问的文本。</p>
     */
    public void setSilenceFollowUpText(String SilenceFollowUpText) {
        this.SilenceFollowUpText = SilenceFollowUpText;
    }

    /**
     * Get <p>主播首次进房主动播报的欢迎语，主播退房后再次进房也会播报。</p> 
     * @return WelcomeMessage <p>主播首次进房主动播报的欢迎语，主播退房后再次进房也会播报。</p>
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set <p>主播首次进房主动播报的欢迎语，主播退房后再次进房也会播报。</p>
     * @param WelcomeMessage <p>主播首次进房主动播报的欢迎语，主播退房后再次进房也会播报。</p>
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    public VoiceConversationDialogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationDialogConfig(VoiceConversationDialogConfig source) {
        if (source.InterruptMode != null) {
            this.InterruptMode = new Long(source.InterruptMode);
        }
        if (source.InterruptSpeechDuration != null) {
            this.InterruptSpeechDuration = new Long(source.InterruptSpeechDuration);
        }
        if (source.InterruptKeywords != null) {
            this.InterruptKeywords = new String[source.InterruptKeywords.length];
            for (int i = 0; i < source.InterruptKeywords.length; i++) {
                this.InterruptKeywords[i] = new String(source.InterruptKeywords[i]);
            }
        }
        if (source.SilenceFollowUp != null) {
            this.SilenceFollowUp = new Long(source.SilenceFollowUp);
        }
        if (source.SilenceFollowUpText != null) {
            this.SilenceFollowUpText = new String(source.SilenceFollowUpText);
        }
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamSimple(map, prefix + "InterruptSpeechDuration", this.InterruptSpeechDuration);
        this.setParamArraySimple(map, prefix + "InterruptKeywords.", this.InterruptKeywords);
        this.setParamSimple(map, prefix + "SilenceFollowUp", this.SilenceFollowUp);
        this.setParamSimple(map, prefix + "SilenceFollowUpText", this.SilenceFollowUpText);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);

    }
}

