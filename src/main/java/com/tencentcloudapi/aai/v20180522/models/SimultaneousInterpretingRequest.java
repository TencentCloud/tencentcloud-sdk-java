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

public class SimultaneousInterpretingRequest  extends AbstractModel{

    /**
    * 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。3：同传。
    */
    @SerializedName("SubServiceType")
    @Expose
    private Integer SubServiceType;

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
    private Integer DataLen;

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
    private Integer IsEnd;

    /**
    * 声音编码的格式1:pcm，4:speex，6:silk，默认为1。
    */
    @SerializedName("VoiceFormat")
    @Expose
    private Integer VoiceFormat;

    /**
    * 是否需要翻译结果，1表示需要翻译，0是不需要。
    */
    @SerializedName("OpenTranslate")
    @Expose
    private Integer OpenTranslate;

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
    private Integer Seq;

    /**
     * 获取腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     * @return ProjectId 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     * @param ProjectId 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。3：同传。
     * @return SubServiceType 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。3：同传。
     */
    public Integer getSubServiceType() {
        return this.SubServiceType;
    }

    /**
     * 设置子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。3：同传。
     * @param SubServiceType 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。3：同传。
     */
    public void setSubServiceType(Integer SubServiceType) {
        this.SubServiceType = SubServiceType;
    }

    /**
     * 获取识别引擎类型。8k_zh： 8k 中文会场模型；16k_zh：16k 中文会场模型，8k_en： 8k 英文会场模型；16k_en：16k 英文会场模型。当前仅支持16K。
     * @return RecEngineModelType 识别引擎类型。8k_zh： 8k 中文会场模型；16k_zh：16k 中文会场模型，8k_en： 8k 英文会场模型；16k_en：16k 英文会场模型。当前仅支持16K。
     */
    public String getRecEngineModelType() {
        return this.RecEngineModelType;
    }

    /**
     * 设置识别引擎类型。8k_zh： 8k 中文会场模型；16k_zh：16k 中文会场模型，8k_en： 8k 英文会场模型；16k_en：16k 英文会场模型。当前仅支持16K。
     * @param RecEngineModelType 识别引擎类型。8k_zh： 8k 中文会场模型；16k_zh：16k 中文会场模型，8k_en： 8k 英文会场模型；16k_en：16k 英文会场模型。当前仅支持16K。
     */
    public void setRecEngineModelType(String RecEngineModelType) {
        this.RecEngineModelType = RecEngineModelType;
    }

    /**
     * 获取语音数据，要base64编码。
     * @return Data 语音数据，要base64编码。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * 设置语音数据，要base64编码。
     * @param Data 语音数据，要base64编码。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * 获取数据长度。
     * @return DataLen 数据长度。
     */
    public Integer getDataLen() {
        return this.DataLen;
    }

    /**
     * 设置数据长度。
     * @param DataLen 数据长度。
     */
    public void setDataLen(Integer DataLen) {
        this.DataLen = DataLen;
    }

    /**
     * 获取声音id，标识一句话。
     * @return VoiceId 声音id，标识一句话。
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * 设置声音id，标识一句话。
     * @param VoiceId 声音id，标识一句话。
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * 获取是否是一句话的结束。
     * @return IsEnd 是否是一句话的结束。
     */
    public Integer getIsEnd() {
        return this.IsEnd;
    }

    /**
     * 设置是否是一句话的结束。
     * @param IsEnd 是否是一句话的结束。
     */
    public void setIsEnd(Integer IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * 获取声音编码的格式1:pcm，4:speex，6:silk，默认为1。
     * @return VoiceFormat 声音编码的格式1:pcm，4:speex，6:silk，默认为1。
     */
    public Integer getVoiceFormat() {
        return this.VoiceFormat;
    }

    /**
     * 设置声音编码的格式1:pcm，4:speex，6:silk，默认为1。
     * @param VoiceFormat 声音编码的格式1:pcm，4:speex，6:silk，默认为1。
     */
    public void setVoiceFormat(Integer VoiceFormat) {
        this.VoiceFormat = VoiceFormat;
    }

    /**
     * 获取是否需要翻译结果，1表示需要翻译，0是不需要。
     * @return OpenTranslate 是否需要翻译结果，1表示需要翻译，0是不需要。
     */
    public Integer getOpenTranslate() {
        return this.OpenTranslate;
    }

    /**
     * 设置是否需要翻译结果，1表示需要翻译，0是不需要。
     * @param OpenTranslate 是否需要翻译结果，1表示需要翻译，0是不需要。
     */
    public void setOpenTranslate(Integer OpenTranslate) {
        this.OpenTranslate = OpenTranslate;
    }

    /**
     * 获取如果需要翻译，表示源语言类型，可取值：zh，en。
     * @return SourceLanguage 如果需要翻译，表示源语言类型，可取值：zh，en。
     */
    public String getSourceLanguage() {
        return this.SourceLanguage;
    }

    /**
     * 设置如果需要翻译，表示源语言类型，可取值：zh，en。
     * @param SourceLanguage 如果需要翻译，表示源语言类型，可取值：zh，en。
     */
    public void setSourceLanguage(String SourceLanguage) {
        this.SourceLanguage = SourceLanguage;
    }

    /**
     * 获取如果需要翻译，表示目标语言类型，可取值：zh，en。
     * @return TargetLanguage 如果需要翻译，表示目标语言类型，可取值：zh，en。
     */
    public String getTargetLanguage() {
        return this.TargetLanguage;
    }

    /**
     * 设置如果需要翻译，表示目标语言类型，可取值：zh，en。
     * @param TargetLanguage 如果需要翻译，表示目标语言类型，可取值：zh，en。
     */
    public void setTargetLanguage(String TargetLanguage) {
        this.TargetLanguage = TargetLanguage;
    }

    /**
     * 获取表明当前语音分片的索引，从0开始
     * @return Seq 表明当前语音分片的索引，从0开始
     */
    public Integer getSeq() {
        return this.Seq;
    }

    /**
     * 设置表明当前语音分片的索引，从0开始
     * @param Seq 表明当前语音分片的索引，从0开始
     */
    public void setSeq(Integer Seq) {
        this.Seq = Seq;
    }

    /**
     * 内部实现，用户禁止调用
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

