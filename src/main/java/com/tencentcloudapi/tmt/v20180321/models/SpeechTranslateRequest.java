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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeechTranslateRequest extends AbstractModel{

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
    * pcm : 146   speex : 16779154   mp3 : 83886080
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
    * 是否最后一片语音分片，0-否，1-是
    */
    @SerializedName("IsEnd")
    @Expose
    private Long IsEnd;

    /**
    * 语音分片内容进行 Base64 编码后的字符串。音频内容需包含有效并可识别的文本信息。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 识别模式，该参数已废弃
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 该参数已废弃
    */
    @SerializedName("TransType")
    @Expose
    private Long TransType;

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
     * Get pcm : 146   speex : 16779154   mp3 : 83886080 
     * @return AudioFormat pcm : 146   speex : 16779154   mp3 : 83886080
     */
    public Long getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set pcm : 146   speex : 16779154   mp3 : 83886080
     * @param AudioFormat pcm : 146   speex : 16779154   mp3 : 83886080
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

    /**
     * Get 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0 
     * @return ProjectId 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     * @param ProjectId 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 识别模式，该参数已废弃 
     * @return Mode 识别模式，该参数已废弃
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 识别模式，该参数已废弃
     * @param Mode 识别模式，该参数已废弃
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 该参数已废弃 
     * @return TransType 该参数已废弃
     */
    public Long getTransType() {
        return this.TransType;
    }

    /**
     * Set 该参数已废弃
     * @param TransType 该参数已废弃
     */
    public void setTransType(Long TransType) {
        this.TransType = TransType;
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
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "TransType", this.TransType);

    }
}

