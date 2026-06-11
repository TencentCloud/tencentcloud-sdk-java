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

public class TTSParam extends AbstractModel {

    /**
    * <p>tts模型</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>tts语言，必须在TranslationParam 的TargetLang列表中。</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>需要TTS播报的主播用户，该主播用户必须在订阅白名单里并且不在订阅黑名单里。</p>
    */
    @SerializedName("TargetUser")
    @Expose
    private TranscriptionUserInfoParams TargetUser;

    /**
    * <p>TTS 音频回推到房间的机器人用户。</p>
    */
    @SerializedName("TTSRobotUser")
    @Expose
    private TranscriptionUserInfoParams TTSRobotUser;

    /**
    * <p>TTS的声音配置参数。</p>
    */
    @SerializedName("Voice")
    @Expose
    private TTSVoice Voice;

    /**
     * Get <p>tts模型</p> 
     * @return Model <p>tts模型</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>tts模型</p>
     * @param Model <p>tts模型</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>tts语言，必须在TranslationParam 的TargetLang列表中。</p> 
     * @return Language <p>tts语言，必须在TranslationParam 的TargetLang列表中。</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>tts语言，必须在TranslationParam 的TargetLang列表中。</p>
     * @param Language <p>tts语言，必须在TranslationParam 的TargetLang列表中。</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>需要TTS播报的主播用户，该主播用户必须在订阅白名单里并且不在订阅黑名单里。</p> 
     * @return TargetUser <p>需要TTS播报的主播用户，该主播用户必须在订阅白名单里并且不在订阅黑名单里。</p>
     */
    public TranscriptionUserInfoParams getTargetUser() {
        return this.TargetUser;
    }

    /**
     * Set <p>需要TTS播报的主播用户，该主播用户必须在订阅白名单里并且不在订阅黑名单里。</p>
     * @param TargetUser <p>需要TTS播报的主播用户，该主播用户必须在订阅白名单里并且不在订阅黑名单里。</p>
     */
    public void setTargetUser(TranscriptionUserInfoParams TargetUser) {
        this.TargetUser = TargetUser;
    }

    /**
     * Get <p>TTS 音频回推到房间的机器人用户。</p> 
     * @return TTSRobotUser <p>TTS 音频回推到房间的机器人用户。</p>
     */
    public TranscriptionUserInfoParams getTTSRobotUser() {
        return this.TTSRobotUser;
    }

    /**
     * Set <p>TTS 音频回推到房间的机器人用户。</p>
     * @param TTSRobotUser <p>TTS 音频回推到房间的机器人用户。</p>
     */
    public void setTTSRobotUser(TranscriptionUserInfoParams TTSRobotUser) {
        this.TTSRobotUser = TTSRobotUser;
    }

    /**
     * Get <p>TTS的声音配置参数。</p> 
     * @return Voice <p>TTS的声音配置参数。</p>
     */
    public TTSVoice getVoice() {
        return this.Voice;
    }

    /**
     * Set <p>TTS的声音配置参数。</p>
     * @param Voice <p>TTS的声音配置参数。</p>
     */
    public void setVoice(TTSVoice Voice) {
        this.Voice = Voice;
    }

    public TTSParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TTSParam(TTSParam source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.TargetUser != null) {
            this.TargetUser = new TranscriptionUserInfoParams(source.TargetUser);
        }
        if (source.TTSRobotUser != null) {
            this.TTSRobotUser = new TranscriptionUserInfoParams(source.TTSRobotUser);
        }
        if (source.Voice != null) {
            this.Voice = new TTSVoice(source.Voice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamObj(map, prefix + "TargetUser.", this.TargetUser);
        this.setParamObj(map, prefix + "TTSRobotUser.", this.TTSRobotUser);
        this.setParamObj(map, prefix + "Voice.", this.Voice);

    }
}

