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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentenceRecognitionRequest extends AbstractModel{

    /**
    * 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 子服务类型。2： 一句话识别。
    */
    @SerializedName("SubServiceType")
    @Expose
    private Long SubServiceType;

    /**
    * 引擎模型类型。
8k_zh：电话 8k 中文普通话通用；
16k_zh：16k 中文普通话通用；
16k_en：16k 英语；
16k_ca：16k 粤语。
    */
    @SerializedName("EngSerViceType")
    @Expose
    private String EngSerViceType;

    /**
    * 语音数据来源。0：语音 URL；1：语音数据（post body）。
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 识别音频的音频格式。mp3、wav。
    */
    @SerializedName("VoiceFormat")
    @Expose
    private String VoiceFormat;

    /**
    * 用户端对此任务的唯一标识，用户自助生成，用于用户查找识别结果。
    */
    @SerializedName("UsrAudioKey")
    @Expose
    private String UsrAudioKey;

    /**
    * 语音 URL，公网可下载。当 SourceType 值为 0（语音 URL上传） 时须填写该字段，为 1 时不填；URL 的长度大于 0，小于 2048，需进行urlencode编码。音频时间长度要小于60s。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 语音数据，当SourceType 值为1（本地语音数据上传）时必须填写，当SourceType 值为0（语音 URL上传）可不写。要使用base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频数据要小于600KB。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 数据长度，单位为字节。当 SourceType 值为1（本地语音数据上传）时必须填写，当 SourceType 值为0（语音 URL上传）可不写（此数据长度为数据未进行base64编码时的数据长度）。
    */
    @SerializedName("DataLen")
    @Expose
    private Long DataLen;

    /**
    * 热词id。用于调用对应的热词表，如果在调用语音识别服务时，不进行单独的热词id设置，自动生效默认热词；如果进行了单独的热词id设置，那么将生效单独设置的热词id。
    */
    @SerializedName("HotwordId")
    @Expose
    private String HotwordId;

    /**
    * 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。
    */
    @SerializedName("FilterDirty")
    @Expose
    private Long FilterDirty;

    /**
    * 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。
    */
    @SerializedName("FilterModal")
    @Expose
    private Long FilterModal;

    /**
    * 是否过滤句末的句号（目前支持中文普通话引擎）。0：不过滤句末的句号；1：过滤句末的句号。
    */
    @SerializedName("FilterPunc")
    @Expose
    private Long FilterPunc;

    /**
    * 是否进行阿拉伯数字智能转换。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字。默认值为1
    */
    @SerializedName("ConvertNumMode")
    @Expose
    private Long ConvertNumMode;

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
     * Get 子服务类型。2： 一句话识别。 
     * @return SubServiceType 子服务类型。2： 一句话识别。
     */
    public Long getSubServiceType() {
        return this.SubServiceType;
    }

    /**
     * Set 子服务类型。2： 一句话识别。
     * @param SubServiceType 子服务类型。2： 一句话识别。
     */
    public void setSubServiceType(Long SubServiceType) {
        this.SubServiceType = SubServiceType;
    }

    /**
     * Get 引擎模型类型。
8k_zh：电话 8k 中文普通话通用；
16k_zh：16k 中文普通话通用；
16k_en：16k 英语；
16k_ca：16k 粤语。 
     * @return EngSerViceType 引擎模型类型。
8k_zh：电话 8k 中文普通话通用；
16k_zh：16k 中文普通话通用；
16k_en：16k 英语；
16k_ca：16k 粤语。
     */
    public String getEngSerViceType() {
        return this.EngSerViceType;
    }

    /**
     * Set 引擎模型类型。
8k_zh：电话 8k 中文普通话通用；
16k_zh：16k 中文普通话通用；
16k_en：16k 英语；
16k_ca：16k 粤语。
     * @param EngSerViceType 引擎模型类型。
8k_zh：电话 8k 中文普通话通用；
16k_zh：16k 中文普通话通用；
16k_en：16k 英语；
16k_ca：16k 粤语。
     */
    public void setEngSerViceType(String EngSerViceType) {
        this.EngSerViceType = EngSerViceType;
    }

    /**
     * Get 语音数据来源。0：语音 URL；1：语音数据（post body）。 
     * @return SourceType 语音数据来源。0：语音 URL；1：语音数据（post body）。
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 语音数据来源。0：语音 URL；1：语音数据（post body）。
     * @param SourceType 语音数据来源。0：语音 URL；1：语音数据（post body）。
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 识别音频的音频格式。mp3、wav。 
     * @return VoiceFormat 识别音频的音频格式。mp3、wav。
     */
    public String getVoiceFormat() {
        return this.VoiceFormat;
    }

    /**
     * Set 识别音频的音频格式。mp3、wav。
     * @param VoiceFormat 识别音频的音频格式。mp3、wav。
     */
    public void setVoiceFormat(String VoiceFormat) {
        this.VoiceFormat = VoiceFormat;
    }

    /**
     * Get 用户端对此任务的唯一标识，用户自助生成，用于用户查找识别结果。 
     * @return UsrAudioKey 用户端对此任务的唯一标识，用户自助生成，用于用户查找识别结果。
     */
    public String getUsrAudioKey() {
        return this.UsrAudioKey;
    }

    /**
     * Set 用户端对此任务的唯一标识，用户自助生成，用于用户查找识别结果。
     * @param UsrAudioKey 用户端对此任务的唯一标识，用户自助生成，用于用户查找识别结果。
     */
    public void setUsrAudioKey(String UsrAudioKey) {
        this.UsrAudioKey = UsrAudioKey;
    }

    /**
     * Get 语音 URL，公网可下载。当 SourceType 值为 0（语音 URL上传） 时须填写该字段，为 1 时不填；URL 的长度大于 0，小于 2048，需进行urlencode编码。音频时间长度要小于60s。 
     * @return Url 语音 URL，公网可下载。当 SourceType 值为 0（语音 URL上传） 时须填写该字段，为 1 时不填；URL 的长度大于 0，小于 2048，需进行urlencode编码。音频时间长度要小于60s。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 语音 URL，公网可下载。当 SourceType 值为 0（语音 URL上传） 时须填写该字段，为 1 时不填；URL 的长度大于 0，小于 2048，需进行urlencode编码。音频时间长度要小于60s。
     * @param Url 语音 URL，公网可下载。当 SourceType 值为 0（语音 URL上传） 时须填写该字段，为 1 时不填；URL 的长度大于 0，小于 2048，需进行urlencode编码。音频时间长度要小于60s。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 语音数据，当SourceType 值为1（本地语音数据上传）时必须填写，当SourceType 值为0（语音 URL上传）可不写。要使用base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频数据要小于600KB。 
     * @return Data 语音数据，当SourceType 值为1（本地语音数据上传）时必须填写，当SourceType 值为0（语音 URL上传）可不写。要使用base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频数据要小于600KB。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 语音数据，当SourceType 值为1（本地语音数据上传）时必须填写，当SourceType 值为0（语音 URL上传）可不写。要使用base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频数据要小于600KB。
     * @param Data 语音数据，当SourceType 值为1（本地语音数据上传）时必须填写，当SourceType 值为0（语音 URL上传）可不写。要使用base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频数据要小于600KB。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 数据长度，单位为字节。当 SourceType 值为1（本地语音数据上传）时必须填写，当 SourceType 值为0（语音 URL上传）可不写（此数据长度为数据未进行base64编码时的数据长度）。 
     * @return DataLen 数据长度，单位为字节。当 SourceType 值为1（本地语音数据上传）时必须填写，当 SourceType 值为0（语音 URL上传）可不写（此数据长度为数据未进行base64编码时的数据长度）。
     */
    public Long getDataLen() {
        return this.DataLen;
    }

    /**
     * Set 数据长度，单位为字节。当 SourceType 值为1（本地语音数据上传）时必须填写，当 SourceType 值为0（语音 URL上传）可不写（此数据长度为数据未进行base64编码时的数据长度）。
     * @param DataLen 数据长度，单位为字节。当 SourceType 值为1（本地语音数据上传）时必须填写，当 SourceType 值为0（语音 URL上传）可不写（此数据长度为数据未进行base64编码时的数据长度）。
     */
    public void setDataLen(Long DataLen) {
        this.DataLen = DataLen;
    }

    /**
     * Get 热词id。用于调用对应的热词表，如果在调用语音识别服务时，不进行单独的热词id设置，自动生效默认热词；如果进行了单独的热词id设置，那么将生效单独设置的热词id。 
     * @return HotwordId 热词id。用于调用对应的热词表，如果在调用语音识别服务时，不进行单独的热词id设置，自动生效默认热词；如果进行了单独的热词id设置，那么将生效单独设置的热词id。
     */
    public String getHotwordId() {
        return this.HotwordId;
    }

    /**
     * Set 热词id。用于调用对应的热词表，如果在调用语音识别服务时，不进行单独的热词id设置，自动生效默认热词；如果进行了单独的热词id设置，那么将生效单独设置的热词id。
     * @param HotwordId 热词id。用于调用对应的热词表，如果在调用语音识别服务时，不进行单独的热词id设置，自动生效默认热词；如果进行了单独的热词id设置，那么将生效单独设置的热词id。
     */
    public void setHotwordId(String HotwordId) {
        this.HotwordId = HotwordId;
    }

    /**
     * Get 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。 
     * @return FilterDirty 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。
     */
    public Long getFilterDirty() {
        return this.FilterDirty;
    }

    /**
     * Set 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。
     * @param FilterDirty 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。
     */
    public void setFilterDirty(Long FilterDirty) {
        this.FilterDirty = FilterDirty;
    }

    /**
     * Get 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。 
     * @return FilterModal 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。
     */
    public Long getFilterModal() {
        return this.FilterModal;
    }

    /**
     * Set 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。
     * @param FilterModal 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。
     */
    public void setFilterModal(Long FilterModal) {
        this.FilterModal = FilterModal;
    }

    /**
     * Get 是否过滤句末的句号（目前支持中文普通话引擎）。0：不过滤句末的句号；1：过滤句末的句号。 
     * @return FilterPunc 是否过滤句末的句号（目前支持中文普通话引擎）。0：不过滤句末的句号；1：过滤句末的句号。
     */
    public Long getFilterPunc() {
        return this.FilterPunc;
    }

    /**
     * Set 是否过滤句末的句号（目前支持中文普通话引擎）。0：不过滤句末的句号；1：过滤句末的句号。
     * @param FilterPunc 是否过滤句末的句号（目前支持中文普通话引擎）。0：不过滤句末的句号；1：过滤句末的句号。
     */
    public void setFilterPunc(Long FilterPunc) {
        this.FilterPunc = FilterPunc;
    }

    /**
     * Get 是否进行阿拉伯数字智能转换。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字。默认值为1 
     * @return ConvertNumMode 是否进行阿拉伯数字智能转换。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字。默认值为1
     */
    public Long getConvertNumMode() {
        return this.ConvertNumMode;
    }

    /**
     * Set 是否进行阿拉伯数字智能转换。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字。默认值为1
     * @param ConvertNumMode 是否进行阿拉伯数字智能转换。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字。默认值为1
     */
    public void setConvertNumMode(Long ConvertNumMode) {
        this.ConvertNumMode = ConvertNumMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SubServiceType", this.SubServiceType);
        this.setParamSimple(map, prefix + "EngSerViceType", this.EngSerViceType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "VoiceFormat", this.VoiceFormat);
        this.setParamSimple(map, prefix + "UsrAudioKey", this.UsrAudioKey);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "DataLen", this.DataLen);
        this.setParamSimple(map, prefix + "HotwordId", this.HotwordId);
        this.setParamSimple(map, prefix + "FilterDirty", this.FilterDirty);
        this.setParamSimple(map, prefix + "FilterModal", this.FilterModal);
        this.setParamSimple(map, prefix + "FilterPunc", this.FilterPunc);
        this.setParamSimple(map, prefix + "ConvertNumMode", this.ConvertNumMode);

    }
}

