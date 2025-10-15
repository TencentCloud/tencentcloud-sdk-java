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

public class VoiceCloneRequest extends AbstractModel {

    /**
    * TRTC的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 声音克隆的名称, 只允许使用数字、字母、下划线，不能超过36位
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * 声音克隆的参考音频，必须为16k单声道的wav的base64字符串， 长度在5秒～12秒之间
    */
    @SerializedName("PromptAudio")
    @Expose
    private String PromptAudio;

    /**
    * TTS的API密钥
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * 声音克隆的参考文本，为参考音频对应的文字。
    */
    @SerializedName("PromptText")
    @Expose
    private String PromptText;

    /**
     * Get TRTC的SdkAppId 
     * @return SdkAppId TRTC的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的SdkAppId
     * @param SdkAppId TRTC的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 声音克隆的名称, 只允许使用数字、字母、下划线，不能超过36位 
     * @return VoiceName 声音克隆的名称, 只允许使用数字、字母、下划线，不能超过36位
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set 声音克隆的名称, 只允许使用数字、字母、下划线，不能超过36位
     * @param VoiceName 声音克隆的名称, 只允许使用数字、字母、下划线，不能超过36位
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get 声音克隆的参考音频，必须为16k单声道的wav的base64字符串， 长度在5秒～12秒之间 
     * @return PromptAudio 声音克隆的参考音频，必须为16k单声道的wav的base64字符串， 长度在5秒～12秒之间
     */
    public String getPromptAudio() {
        return this.PromptAudio;
    }

    /**
     * Set 声音克隆的参考音频，必须为16k单声道的wav的base64字符串， 长度在5秒～12秒之间
     * @param PromptAudio 声音克隆的参考音频，必须为16k单声道的wav的base64字符串， 长度在5秒～12秒之间
     */
    public void setPromptAudio(String PromptAudio) {
        this.PromptAudio = PromptAudio;
    }

    /**
     * Get TTS的API密钥 
     * @return APIKey TTS的API密钥
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set TTS的API密钥
     * @param APIKey TTS的API密钥
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get 声音克隆的参考文本，为参考音频对应的文字。 
     * @return PromptText 声音克隆的参考文本，为参考音频对应的文字。
     */
    public String getPromptText() {
        return this.PromptText;
    }

    /**
     * Set 声音克隆的参考文本，为参考音频对应的文字。
     * @param PromptText 声音克隆的参考文本，为参考音频对应的文字。
     */
    public void setPromptText(String PromptText) {
        this.PromptText = PromptText;
    }

    public VoiceCloneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceCloneRequest(VoiceCloneRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.PromptAudio != null) {
            this.PromptAudio = new String(source.PromptAudio);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.PromptText != null) {
            this.PromptText = new String(source.PromptText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "PromptAudio", this.PromptAudio);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "PromptText", this.PromptText);

    }
}

