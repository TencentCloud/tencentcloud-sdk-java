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
package com.tencentcloudapi.aai.v20180522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimultaneousInterpretingRequest extends AbstractModel{

    /**
    * 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。3：同传。
    */
    @SerializedName("SubServiceType")
    @Expose
    private Long SubServiceType;

    /**
    * 识别引擎类型。8k_zh： 8k 中文会场模型；16k_zh：16k 中文会场模型，8k_en： 8k 英文会场模型；16k_en：16k 英文会场模型。当前仅支持16K。
    */
    @SerializedName("RecEngineModelType")
    @Expose
    private String RecEngineModelType;

    /**
    * 语音数据，要base64编码。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 数据长度。
    */
    @SerializedName("DataLen")
    @Expose
    private Long DataLen;

    /**
    * 声音id，标识一句话。
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 是否是一句话的结束。
    */
    @SerializedName("IsEnd")
    @Expose
    private Long IsEnd;

    /**
    * 声音编码的格式1:pcm，4:speex，6:silk，默认为1。
    */
    @SerializedName("VoiceFormat")
    @Expose
    private Long VoiceFormat;

    /**
    * 是否需要翻译结果，1表示需要翻译，0是不需要。
    */
    @SerializedName("OpenTranslate")
    @Expose
    private Long OpenTranslate;

    /**
    * 如果需要翻译，表示源语言类型，可取值：zh，en。
    */
    @SerializedName("SourceLanguage")
    @Expose
    private String SourceLanguage;

    /**
    * 如果需要翻译，表示目标语言类型，可取值：zh，en。
    */
    @SerializedName("TargetLanguage")
    @Expose
    private String TargetLanguage;

    /**
    * 表明当前语音分片的索引，从0开始
    */
    @SerializedName("Seq")
    @Expose
    private Long Seq;

    /**
     * Get 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。 
     * @return ProjectId 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     * @param ProjectId 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。3：同传。 
     * @return SubServiceType 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。3：同传。
     */
    public Long getSubServiceType() {
        return this.SubServiceType;
    }

    /**
     * Set 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。3：同传。
     * @param SubServiceType 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。3：同传。
     */
    public void setSubServiceType(Long SubServiceType) {
        this.SubServiceType = SubServiceType;
    }

    /**
     * Get 识别引擎类型。8k_zh： 8k 中文会场模型；16k_zh：16k 中文会场模型，8k_en： 8k 英文会场模型；16k_en：16k 英文会场模型。当前仅支持16K。 
     * @return RecEngineModelType 识别引擎类型。8k_zh： 8k 中文会场模型；16k_zh：16k 中文会场模型，8k_en： 8k 英文会场模型；16k_en：16k 英文会场模型。当前仅支持16K。
     */
    public String getRecEngineModelType() {
        return this.RecEngineModelType;
    }

    /**
     * Set 识别引擎类型。8k_zh： 8k 中文会场模型；16k_zh：16k 中文会场模型，8k_en： 8k 英文会场模型；16k_en：16k 英文会场模型。当前仅支持16K。
     * @param RecEngineModelType 识别引擎类型。8k_zh： 8k 中文会场模型；16k_zh：16k 中文会场模型，8k_en： 8k 英文会场模型；16k_en：16k 英文会场模型。当前仅支持16K。
     */
    public void setRecEngineModelType(String RecEngineModelType) {
        this.RecEngineModelType = RecEngineModelType;
    }

    /**
     * Get 语音数据，要base64编码。 
     * @return Data 语音数据，要base64编码。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 语音数据，要base64编码。
     * @param Data 语音数据，要base64编码。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 数据长度。 
     * @return DataLen 数据长度。
     */
    public Long getDataLen() {
        return this.DataLen;
    }

    /**
     * Set 数据长度。
     * @param DataLen 数据长度。
     */
    public void setDataLen(Long DataLen) {
        this.DataLen = DataLen;
    }

    /**
     * Get 声音id，标识一句话。 
     * @return VoiceId 声音id，标识一句话。
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set 声音id，标识一句话。
     * @param VoiceId 声音id，标识一句话。
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get 是否是一句话的结束。 
     * @return IsEnd 是否是一句话的结束。
     */
    public Long getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set 是否是一句话的结束。
     * @param IsEnd 是否是一句话的结束。
     */
    public void setIsEnd(Long IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * Get 声音编码的格式1:pcm，4:speex，6:silk，默认为1。 
     * @return VoiceFormat 声音编码的格式1:pcm，4:speex，6:silk，默认为1。
     */
    public Long getVoiceFormat() {
        return this.VoiceFormat;
    }

    /**
     * Set 声音编码的格式1:pcm，4:speex，6:silk，默认为1。
     * @param VoiceFormat 声音编码的格式1:pcm，4:speex，6:silk，默认为1。
     */
    public void setVoiceFormat(Long VoiceFormat) {
        this.VoiceFormat = VoiceFormat;
    }

    /**
     * Get 是否需要翻译结果，1表示需要翻译，0是不需要。 
     * @return OpenTranslate 是否需要翻译结果，1表示需要翻译，0是不需要。
     */
    public Long getOpenTranslate() {
        return this.OpenTranslate;
    }

    /**
     * Set 是否需要翻译结果，1表示需要翻译，0是不需要。
     * @param OpenTranslate 是否需要翻译结果，1表示需要翻译，0是不需要。
     */
    public void setOpenTranslate(Long OpenTranslate) {
        this.OpenTranslate = OpenTranslate;
    }

    /**
     * Get 如果需要翻译，表示源语言类型，可取值：zh，en。 
     * @return SourceLanguage 如果需要翻译，表示源语言类型，可取值：zh，en。
     */
    public String getSourceLanguage() {
        return this.SourceLanguage;
    }

    /**
     * Set 如果需要翻译，表示源语言类型，可取值：zh，en。
     * @param SourceLanguage 如果需要翻译，表示源语言类型，可取值：zh，en。
     */
    public void setSourceLanguage(String SourceLanguage) {
        this.SourceLanguage = SourceLanguage;
    }

    /**
     * Get 如果需要翻译，表示目标语言类型，可取值：zh，en。 
     * @return TargetLanguage 如果需要翻译，表示目标语言类型，可取值：zh，en。
     */
    public String getTargetLanguage() {
        return this.TargetLanguage;
    }

    /**
     * Set 如果需要翻译，表示目标语言类型，可取值：zh，en。
     * @param TargetLanguage 如果需要翻译，表示目标语言类型，可取值：zh，en。
     */
    public void setTargetLanguage(String TargetLanguage) {
        this.TargetLanguage = TargetLanguage;
    }

    /**
     * Get 表明当前语音分片的索引，从0开始 
     * @return Seq 表明当前语音分片的索引，从0开始
     */
    public Long getSeq() {
        return this.Seq;
    }

    /**
     * Set 表明当前语音分片的索引，从0开始
     * @param Seq 表明当前语音分片的索引，从0开始
     */
    public void setSeq(Long Seq) {
        this.Seq = Seq;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SubServiceType", this.SubServiceType);
        this.setParamSimple(map, prefix + "RecEngineModelType", this.RecEngineModelType);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "DataLen", this.DataLen);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "VoiceFormat", this.VoiceFormat);
        this.setParamSimple(map, prefix + "OpenTranslate", this.OpenTranslate);
        this.setParamSimple(map, prefix + "SourceLanguage", this.SourceLanguage);
        this.setParamSimple(map, prefix + "TargetLanguage", this.TargetLanguage);
        this.setParamSimple(map, prefix + "Seq", this.Seq);

    }
}

