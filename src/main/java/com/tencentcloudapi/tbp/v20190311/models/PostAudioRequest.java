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

public class PostAudioRequest  extends AbstractModel{

    /**
    * 机器人标识
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 语音识别引擎类型,{8k_0、16k_0、16k_en}
    */
    @SerializedName("EngineModelType")
    @Expose
    private String EngineModelType;

    /**
    * 输入音频文件编码格式。1：wav(pcm)；4：speex(sp)；6：silk
    */
    @SerializedName("AsrVoiceFormat")
    @Expose
    private Long AsrVoiceFormat;

    /**
    * asr请求Id。长度为16位的字符串，同一句话VoiceId保持一致
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 语音分片序列号。同一句话必须从0开始，依次递增
    */
    @SerializedName("Seq")
    @Expose
    private Long Seq;

    /**
    * 是否为尾包。传递最后一个语音分片时为true，其他为false
    */
    @SerializedName("IsEnd")
    @Expose
    private Boolean IsEnd;

    /**
    * 待识别音频字节流
    */
    @SerializedName("WaveData")
    @Expose
    private String WaveData;

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
    * 识别返回文本编码格式	0：UTF-8（默认）；1：GB2312；2：GBK；3：BIG5
    */
    @SerializedName("ResultTextFormat")
    @Expose
    private Long ResultTextFormat;

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
     * 获取语音识别引擎类型,{8k_0、16k_0、16k_en}
     * @return EngineModelType 语音识别引擎类型,{8k_0、16k_0、16k_en}
     */
    public String getEngineModelType() {
        return this.EngineModelType;
    }

    /**
     * 设置语音识别引擎类型,{8k_0、16k_0、16k_en}
     * @param EngineModelType 语音识别引擎类型,{8k_0、16k_0、16k_en}
     */
    public void setEngineModelType(String EngineModelType) {
        this.EngineModelType = EngineModelType;
    }

    /**
     * 获取输入音频文件编码格式。1：wav(pcm)；4：speex(sp)；6：silk
     * @return AsrVoiceFormat 输入音频文件编码格式。1：wav(pcm)；4：speex(sp)；6：silk
     */
    public Long getAsrVoiceFormat() {
        return this.AsrVoiceFormat;
    }

    /**
     * 设置输入音频文件编码格式。1：wav(pcm)；4：speex(sp)；6：silk
     * @param AsrVoiceFormat 输入音频文件编码格式。1：wav(pcm)；4：speex(sp)；6：silk
     */
    public void setAsrVoiceFormat(Long AsrVoiceFormat) {
        this.AsrVoiceFormat = AsrVoiceFormat;
    }

    /**
     * 获取asr请求Id。长度为16位的字符串，同一句话VoiceId保持一致
     * @return VoiceId asr请求Id。长度为16位的字符串，同一句话VoiceId保持一致
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * 设置asr请求Id。长度为16位的字符串，同一句话VoiceId保持一致
     * @param VoiceId asr请求Id。长度为16位的字符串，同一句话VoiceId保持一致
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * 获取语音分片序列号。同一句话必须从0开始，依次递增
     * @return Seq 语音分片序列号。同一句话必须从0开始，依次递增
     */
    public Long getSeq() {
        return this.Seq;
    }

    /**
     * 设置语音分片序列号。同一句话必须从0开始，依次递增
     * @param Seq 语音分片序列号。同一句话必须从0开始，依次递增
     */
    public void setSeq(Long Seq) {
        this.Seq = Seq;
    }

    /**
     * 获取是否为尾包。传递最后一个语音分片时为true，其他为false
     * @return IsEnd 是否为尾包。传递最后一个语音分片时为true，其他为false
     */
    public Boolean getIsEnd() {
        return this.IsEnd;
    }

    /**
     * 设置是否为尾包。传递最后一个语音分片时为true，其他为false
     * @param IsEnd 是否为尾包。传递最后一个语音分片时为true，其他为false
     */
    public void setIsEnd(Boolean IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * 获取待识别音频字节流
     * @return WaveData 待识别音频字节流
     */
    public String getWaveData() {
        return this.WaveData;
    }

    /**
     * 设置待识别音频字节流
     * @param WaveData 待识别音频字节流
     */
    public void setWaveData(String WaveData) {
        this.WaveData = WaveData;
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
     * 获取识别返回文本编码格式	0：UTF-8（默认）；1：GB2312；2：GBK；3：BIG5
     * @return ResultTextFormat 识别返回文本编码格式	0：UTF-8（默认）；1：GB2312；2：GBK；3：BIG5
     */
    public Long getResultTextFormat() {
        return this.ResultTextFormat;
    }

    /**
     * 设置识别返回文本编码格式	0：UTF-8（默认）；1：GB2312；2：GBK；3：BIG5
     * @param ResultTextFormat 识别返回文本编码格式	0：UTF-8（默认）；1：GB2312；2：GBK；3：BIG5
     */
    public void setResultTextFormat(Long ResultTextFormat) {
        this.ResultTextFormat = ResultTextFormat;
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
        this.setParamSimple(map, prefix + "EngineModelType", this.EngineModelType);
        this.setParamSimple(map, prefix + "AsrVoiceFormat", this.AsrVoiceFormat);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "WaveData", this.WaveData);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "BotVersion", this.BotVersion);
        this.setParamSimple(map, prefix + "ResultTextFormat", this.ResultTextFormat);
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

