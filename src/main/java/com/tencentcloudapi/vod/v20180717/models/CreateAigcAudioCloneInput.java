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

public class CreateAigcAudioCloneInput extends AbstractModel {

    /**
    * <p>原音频文件，模型将以此参数中传入的音频音色为示例对音色进行复刻。</p>
    */
    @SerializedName("AudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo AudioFileInfo;

    /**
    * <p>自定义的声音ID。</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>复刻试听参数。</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>音色复刻示例音频。</p>
    */
    @SerializedName("PromptAudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo PromptAudioFileInfo;

    /**
    * <p>示例音频对应的文本内容。</p>
    */
    @SerializedName("PromptText")
    @Expose
    private String PromptText;

    /**
    * <p>透传参数。</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
     * Get <p>原音频文件，模型将以此参数中传入的音频音色为示例对音色进行复刻。</p> 
     * @return AudioFileInfo <p>原音频文件，模型将以此参数中传入的音频音色为示例对音色进行复刻。</p>
     */
    public AigcAudioCloneInputFileInfo getAudioFileInfo() {
        return this.AudioFileInfo;
    }

    /**
     * Set <p>原音频文件，模型将以此参数中传入的音频音色为示例对音色进行复刻。</p>
     * @param AudioFileInfo <p>原音频文件，模型将以此参数中传入的音频音色为示例对音色进行复刻。</p>
     */
    public void setAudioFileInfo(AigcAudioCloneInputFileInfo AudioFileInfo) {
        this.AudioFileInfo = AudioFileInfo;
    }

    /**
     * Get <p>自定义的声音ID。</p> 
     * @return VoiceId <p>自定义的声音ID。</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>自定义的声音ID。</p>
     * @param VoiceId <p>自定义的声音ID。</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>复刻试听参数。</p> 
     * @return Text <p>复刻试听参数。</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>复刻试听参数。</p>
     * @param Text <p>复刻试听参数。</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>音色复刻示例音频。</p> 
     * @return PromptAudioFileInfo <p>音色复刻示例音频。</p>
     */
    public AigcAudioCloneInputFileInfo getPromptAudioFileInfo() {
        return this.PromptAudioFileInfo;
    }

    /**
     * Set <p>音色复刻示例音频。</p>
     * @param PromptAudioFileInfo <p>音色复刻示例音频。</p>
     */
    public void setPromptAudioFileInfo(AigcAudioCloneInputFileInfo PromptAudioFileInfo) {
        this.PromptAudioFileInfo = PromptAudioFileInfo;
    }

    /**
     * Get <p>示例音频对应的文本内容。</p> 
     * @return PromptText <p>示例音频对应的文本内容。</p>
     */
    public String getPromptText() {
        return this.PromptText;
    }

    /**
     * Set <p>示例音频对应的文本内容。</p>
     * @param PromptText <p>示例音频对应的文本内容。</p>
     */
    public void setPromptText(String PromptText) {
        this.PromptText = PromptText;
    }

    /**
     * Get <p>透传参数。</p> 
     * @return Payload <p>透传参数。</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>透传参数。</p>
     * @param Payload <p>透传参数。</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    public CreateAigcAudioCloneInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioCloneInput(CreateAigcAudioCloneInput source) {
        if (source.AudioFileInfo != null) {
            this.AudioFileInfo = new AigcAudioCloneInputFileInfo(source.AudioFileInfo);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.PromptAudioFileInfo != null) {
            this.PromptAudioFileInfo = new AigcAudioCloneInputFileInfo(source.PromptAudioFileInfo);
        }
        if (source.PromptText != null) {
            this.PromptText = new String(source.PromptText);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AudioFileInfo.", this.AudioFileInfo);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "PromptAudioFileInfo.", this.PromptAudioFileInfo);
        this.setParamSimple(map, prefix + "PromptText", this.PromptText);
        this.setParamSimple(map, prefix + "Payload", this.Payload);

    }
}

