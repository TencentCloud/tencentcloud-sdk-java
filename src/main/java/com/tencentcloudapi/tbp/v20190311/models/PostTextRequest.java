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
package com.tencentcloudapi.tbp.v20190311.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostTextRequest  extends AbstractModel{

    /**
    * 机器人标识
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 请求的文本
    */
    @SerializedName("InputText")
    @Expose
    private String InputText;

    /**
    * 子账户id，每个终端对应一个
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 机器人版本号。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
    */
    @SerializedName("BotVersion")
    @Expose
    private String BotVersion;

    /**
    * 透传字段，传递给后台
    */
    @SerializedName("SessionAttributes")
    @Expose
    private String SessionAttributes;

    /**
    * 是否将机器人回答合成音频并返回url
    */
    @SerializedName("NeedTts")
    @Expose
    private Boolean NeedTts;

    /**
    * 音量大小，范围：[0，10]。默认值为0，代表正常音量
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 语速，范围：[-2，2]。0代表1.0倍
    */
    @SerializedName("Speed")
    @Expose
    private Long Speed;

    /**
    * 音色,{0：女声,1:男声}
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * 返回音频的采样率{8k,16k}。默认16k
    */
    @SerializedName("SampleRate")
    @Expose
    private String SampleRate;

    /**
    * 机器人环境{dev:测试;release:线上}。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
    */
    @SerializedName("BotEnv")
    @Expose
    private String BotEnv;

    /**
    * TTS合成音频格式，{0：wav}。该字段在当前版本仅支持取值为0。
    */
    @SerializedName("TtsVoiceFormat")
    @Expose
    private Long TtsVoiceFormat;

    /**
     * 获取机器人标识
     * @return BotId 机器人标识
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * 设置机器人标识
     * @param BotId 机器人标识
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * 获取请求的文本
     * @return InputText 请求的文本
     */
    public String getInputText() {
        return this.InputText;
    }

    /**
     * 设置请求的文本
     * @param InputText 请求的文本
     */
    public void setInputText(String InputText) {
        this.InputText = InputText;
    }

    /**
     * 获取子账户id，每个终端对应一个
     * @return UserId 子账户id，每个终端对应一个
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * 设置子账户id，每个终端对应一个
     * @param UserId 子账户id，每个终端对应一个
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * 获取机器人版本号。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     * @return BotVersion 机器人版本号。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     */
    public String getBotVersion() {
        return this.BotVersion;
    }

    /**
     * 设置机器人版本号。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     * @param BotVersion 机器人版本号。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     */
    public void setBotVersion(String BotVersion) {
        this.BotVersion = BotVersion;
    }

    /**
     * 获取透传字段，传递给后台
     * @return SessionAttributes 透传字段，传递给后台
     */
    public String getSessionAttributes() {
        return this.SessionAttributes;
    }

    /**
     * 设置透传字段，传递给后台
     * @param SessionAttributes 透传字段，传递给后台
     */
    public void setSessionAttributes(String SessionAttributes) {
        this.SessionAttributes = SessionAttributes;
    }

    /**
     * 获取是否将机器人回答合成音频并返回url
     * @return NeedTts 是否将机器人回答合成音频并返回url
     */
    public Boolean getNeedTts() {
        return this.NeedTts;
    }

    /**
     * 设置是否将机器人回答合成音频并返回url
     * @param NeedTts 是否将机器人回答合成音频并返回url
     */
    public void setNeedTts(Boolean NeedTts) {
        this.NeedTts = NeedTts;
    }

    /**
     * 获取音量大小，范围：[0，10]。默认值为0，代表正常音量
     * @return Volume 音量大小，范围：[0，10]。默认值为0，代表正常音量
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * 设置音量大小，范围：[0，10]。默认值为0，代表正常音量
     * @param Volume 音量大小，范围：[0，10]。默认值为0，代表正常音量
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取语速，范围：[-2，2]。0代表1.0倍
     * @return Speed 语速，范围：[-2，2]。0代表1.0倍
     */
    public Long getSpeed() {
        return this.Speed;
    }

    /**
     * 设置语速，范围：[-2，2]。0代表1.0倍
     * @param Speed 语速，范围：[-2，2]。0代表1.0倍
     */
    public void setSpeed(Long Speed) {
        this.Speed = Speed;
    }

    /**
     * 获取音色,{0：女声,1:男声}
     * @return VoiceType 音色,{0：女声,1:男声}
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * 设置音色,{0：女声,1:男声}
     * @param VoiceType 音色,{0：女声,1:男声}
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * 获取返回音频的采样率{8k,16k}。默认16k
     * @return SampleRate 返回音频的采样率{8k,16k}。默认16k
     */
    public String getSampleRate() {
        return this.SampleRate;
    }

    /**
     * 设置返回音频的采样率{8k,16k}。默认16k
     * @param SampleRate 返回音频的采样率{8k,16k}。默认16k
     */
    public void setSampleRate(String SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * 获取机器人环境{dev:测试;release:线上}。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     * @return BotEnv 机器人环境{dev:测试;release:线上}。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     */
    public String getBotEnv() {
        return this.BotEnv;
    }

    /**
     * 设置机器人环境{dev:测试;release:线上}。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     * @param BotEnv 机器人环境{dev:测试;release:线上}。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     */
    public void setBotEnv(String BotEnv) {
        this.BotEnv = BotEnv;
    }

    /**
     * 获取TTS合成音频格式，{0：wav}。该字段在当前版本仅支持取值为0。
     * @return TtsVoiceFormat TTS合成音频格式，{0：wav}。该字段在当前版本仅支持取值为0。
     */
    public Long getTtsVoiceFormat() {
        return this.TtsVoiceFormat;
    }

    /**
     * 设置TTS合成音频格式，{0：wav}。该字段在当前版本仅支持取值为0。
     * @param TtsVoiceFormat TTS合成音频格式，{0：wav}。该字段在当前版本仅支持取值为0。
     */
    public void setTtsVoiceFormat(Long TtsVoiceFormat) {
        this.TtsVoiceFormat = TtsVoiceFormat;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "InputText", this.InputText);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "BotVersion", this.BotVersion);
        this.setParamSimple(map, prefix + "SessionAttributes", this.SessionAttributes);
        this.setParamSimple(map, prefix + "NeedTts", this.NeedTts);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "BotEnv", this.BotEnv);
        this.setParamSimple(map, prefix + "TtsVoiceFormat", this.TtsVoiceFormat);

    }
}

