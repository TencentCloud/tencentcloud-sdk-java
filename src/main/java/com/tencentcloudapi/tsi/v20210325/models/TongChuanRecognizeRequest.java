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
package com.tencentcloudapi.tsi.v20210325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TongChuanRecognizeRequest extends AbstractModel {

    /**
    * 一段完整的语音对应一个SessionUuid
    */
    @SerializedName("SessionUuid")
    @Expose
    private String SessionUuid;

    /**
    * 音频中的语言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 翻译目标语言类型，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 语音编码类型，1-pcm
    */
    @SerializedName("AudioFormat")
    @Expose
    private Long AudioFormat;

    /**
    * 语音分片的序号，从0开始
    */
    @SerializedName("Seq")
    @Expose
    private Long Seq;

    /**
    * 语音开始的时间戳
    */
    @SerializedName("Utc")
    @Expose
    private Long Utc;

    /**
    * 是否最后一片语音分片，0-否，1-是
    */
    @SerializedName("IsEnd")
    @Expose
    private Long IsEnd;

    /**
    * 翻译时机，0-不翻译 2-句子实时翻译
    */
    @SerializedName("TranslateTime")
    @Expose
    private Long TranslateTime;

    /**
    * 语音分片内容进行 Base64 编码后的字符串。音频内容需包含有效并可识别的文本信息。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 一段完整的语音对应一个SessionUuid 
     * @return SessionUuid 一段完整的语音对应一个SessionUuid
     */
    public String getSessionUuid() {
        return this.SessionUuid;
    }

    /**
     * Set 一段完整的语音对应一个SessionUuid
     * @param SessionUuid 一段完整的语音对应一个SessionUuid
     */
    public void setSessionUuid(String SessionUuid) {
        this.SessionUuid = SessionUuid;
    }

    /**
     * Get 音频中的语言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li> 
     * @return Source 音频中的语言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 音频中的语言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @param Source 音频中的语言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 翻译目标语言类型，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li> 
     * @return Target 翻译目标语言类型，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 翻译目标语言类型，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @param Target 翻译目标语言类型，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 语音编码类型，1-pcm 
     * @return AudioFormat 语音编码类型，1-pcm
     */
    public Long getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set 语音编码类型，1-pcm
     * @param AudioFormat 语音编码类型，1-pcm
     */
    public void setAudioFormat(Long AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get 语音分片的序号，从0开始 
     * @return Seq 语音分片的序号，从0开始
     */
    public Long getSeq() {
        return this.Seq;
    }

    /**
     * Set 语音分片的序号，从0开始
     * @param Seq 语音分片的序号，从0开始
     */
    public void setSeq(Long Seq) {
        this.Seq = Seq;
    }

    /**
     * Get 语音开始的时间戳 
     * @return Utc 语音开始的时间戳
     */
    public Long getUtc() {
        return this.Utc;
    }

    /**
     * Set 语音开始的时间戳
     * @param Utc 语音开始的时间戳
     */
    public void setUtc(Long Utc) {
        this.Utc = Utc;
    }

    /**
     * Get 是否最后一片语音分片，0-否，1-是 
     * @return IsEnd 是否最后一片语音分片，0-否，1-是
     */
    public Long getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set 是否最后一片语音分片，0-否，1-是
     * @param IsEnd 是否最后一片语音分片，0-否，1-是
     */
    public void setIsEnd(Long IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * Get 翻译时机，0-不翻译 2-句子实时翻译 
     * @return TranslateTime 翻译时机，0-不翻译 2-句子实时翻译
     */
    public Long getTranslateTime() {
        return this.TranslateTime;
    }

    /**
     * Set 翻译时机，0-不翻译 2-句子实时翻译
     * @param TranslateTime 翻译时机，0-不翻译 2-句子实时翻译
     */
    public void setTranslateTime(Long TranslateTime) {
        this.TranslateTime = TranslateTime;
    }

    /**
     * Get 语音分片内容进行 Base64 编码后的字符串。音频内容需包含有效并可识别的文本信息。 
     * @return Data 语音分片内容进行 Base64 编码后的字符串。音频内容需包含有效并可识别的文本信息。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 语音分片内容进行 Base64 编码后的字符串。音频内容需包含有效并可识别的文本信息。
     * @param Data 语音分片内容进行 Base64 编码后的字符串。音频内容需包含有效并可识别的文本信息。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public TongChuanRecognizeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TongChuanRecognizeRequest(TongChuanRecognizeRequest source) {
        if (source.SessionUuid != null) {
            this.SessionUuid = new String(source.SessionUuid);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.AudioFormat != null) {
            this.AudioFormat = new Long(source.AudioFormat);
        }
        if (source.Seq != null) {
            this.Seq = new Long(source.Seq);
        }
        if (source.Utc != null) {
            this.Utc = new Long(source.Utc);
        }
        if (source.IsEnd != null) {
            this.IsEnd = new Long(source.IsEnd);
        }
        if (source.TranslateTime != null) {
            this.TranslateTime = new Long(source.TranslateTime);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionUuid", this.SessionUuid);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "AudioFormat", this.AudioFormat);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "Utc", this.Utc);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "TranslateTime", this.TranslateTime);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

