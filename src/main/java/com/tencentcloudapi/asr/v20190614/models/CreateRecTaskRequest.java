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

public class CreateRecTaskRequest extends AbstractModel{

    /**
    * 引擎模型类型。
电话场景：
• 8k_en：电话 8k 英语；
• 8k_zh：电话 8k 中文普通话通用；
非电话场景：
• 16k_zh：16k 中文普通话通用；
• 16k_zh_video：16k 音视频领域；
• 16k_en：16k 英语；
• 16k_ca：16k 粤语；
• 16k_ja：16k 日语；
• 16k_zh_edu 中文教育；
• 16k_en_edu 英文教育；
• 16k_zh_medical  医疗；
• 16k_th 泰语；
• 16k_wuu-SH：16k 上海话方言；
• 16k_zh_dialect：多方言。
    */
    @SerializedName("EngineModelType")
    @Expose
    private String EngineModelType;

    /**
    * 识别声道数。1：单声道（非电话场景，直接选择单声道即可，忽略音频声道数）；2：双声道（仅支持8k_zh电话场景，双声道应分别对应通话双方）。注意：双声道的电话音频已物理分离说话人，无需再开启说话人分离功能。
    */
    @SerializedName("ChannelNum")
    @Expose
    private Long ChannelNum;

    /**
    * 识别结果返回形式。0： 识别结果文本(含分段时间戳)； 1：词级别粒度的[详细识别结果](https://cloud.tencent.com/document/api/1093/37824#SentenceDetail)(不含标点，含语速值)；2：词级别粒度的详细识别结果（包含标点、语速值）
    */
    @SerializedName("ResTextFormat")
    @Expose
    private Long ResTextFormat;

    /**
    * 语音数据来源。0：语音 URL；1：语音数据（post body）。
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 是否开启说话人分离，0：不开启，1：开启(仅支持8k_zh，16k_zh，16k_zh_video，单声道音频)，默认值为 0。
注意：8k电话场景建议使用双声道来区分通话双方，设置ChannelNum=2即可，不用开启说话人分离。
    */
    @SerializedName("SpeakerDiarization")
    @Expose
    private Long SpeakerDiarization;

    /**
    * 说话人分离人数（需配合开启说话人分离使用），取值范围：0-10，0代表自动分离（目前仅支持≤6个人），1-10代表指定说话人数分离。默认值为 0。
注：话者分离目前是beta版本，请根据您的需要谨慎使用
    */
    @SerializedName("SpeakerNumber")
    @Expose
    private Long SpeakerNumber;

    /**
    * 回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。回调格式&内容详见：[录音识别回调说明](https://cloud.tencent.com/document/product/1093/52632)
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 语音的URL地址，需要公网可下载。长度小于2048字节，当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写。注意：请确保录音文件时长在5个小时之内，否则可能识别失败。请保证文件的下载速度，否则可能下载失败。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 语音数据base64编码，当SourceType 值为1时必须填写，为0可不写。音频数据要小于5MB。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 数据长度，非必填（此数据长度为数据未进行base64编码时的数据长度）。
    */
    @SerializedName("DataLen")
    @Expose
    private Long DataLen;

    /**
    * 是否进行阿拉伯数字智能转换（目前支持中文普通话引擎）。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字，3: 打开数学相关数字转换。默认值为 1。
    */
    @SerializedName("ConvertNumMode")
    @Expose
    private Long ConvertNumMode;

    /**
    * 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0。
    */
    @SerializedName("FilterDirty")
    @Expose
    private Long FilterDirty;

    /**
    * 热词表id。如不设置该参数，自动生效默认热词表；如果设置了该参数，那么将生效对应的热词表。
    */
    @SerializedName("HotwordId")
    @Expose
    private String HotwordId;

    /**
    * 自学习模型 id。如不设置该参数，自动生效最后一次上线的自学习模型；如果设置了该参数，那么将生效对应的自学习模型。
    */
    @SerializedName("CustomizationId")
    @Expose
    private String CustomizationId;

    /**
    * 附加参数(该参数无意义，忽略即可)
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认值为 0。
    */
    @SerializedName("FilterPunc")
    @Expose
    private Long FilterPunc;

    /**
    * 是否过滤语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0。
    */
    @SerializedName("FilterModal")
    @Expose
    private Long FilterModal;

    /**
     * Get 引擎模型类型。
电话场景：
• 8k_en：电话 8k 英语；
• 8k_zh：电话 8k 中文普通话通用；
非电话场景：
• 16k_zh：16k 中文普通话通用；
• 16k_zh_video：16k 音视频领域；
• 16k_en：16k 英语；
• 16k_ca：16k 粤语；
• 16k_ja：16k 日语；
• 16k_zh_edu 中文教育；
• 16k_en_edu 英文教育；
• 16k_zh_medical  医疗；
• 16k_th 泰语；
• 16k_wuu-SH：16k 上海话方言；
• 16k_zh_dialect：多方言。 
     * @return EngineModelType 引擎模型类型。
电话场景：
• 8k_en：电话 8k 英语；
• 8k_zh：电话 8k 中文普通话通用；
非电话场景：
• 16k_zh：16k 中文普通话通用；
• 16k_zh_video：16k 音视频领域；
• 16k_en：16k 英语；
• 16k_ca：16k 粤语；
• 16k_ja：16k 日语；
• 16k_zh_edu 中文教育；
• 16k_en_edu 英文教育；
• 16k_zh_medical  医疗；
• 16k_th 泰语；
• 16k_wuu-SH：16k 上海话方言；
• 16k_zh_dialect：多方言。
     */
    public String getEngineModelType() {
        return this.EngineModelType;
    }

    /**
     * Set 引擎模型类型。
电话场景：
• 8k_en：电话 8k 英语；
• 8k_zh：电话 8k 中文普通话通用；
非电话场景：
• 16k_zh：16k 中文普通话通用；
• 16k_zh_video：16k 音视频领域；
• 16k_en：16k 英语；
• 16k_ca：16k 粤语；
• 16k_ja：16k 日语；
• 16k_zh_edu 中文教育；
• 16k_en_edu 英文教育；
• 16k_zh_medical  医疗；
• 16k_th 泰语；
• 16k_wuu-SH：16k 上海话方言；
• 16k_zh_dialect：多方言。
     * @param EngineModelType 引擎模型类型。
电话场景：
• 8k_en：电话 8k 英语；
• 8k_zh：电话 8k 中文普通话通用；
非电话场景：
• 16k_zh：16k 中文普通话通用；
• 16k_zh_video：16k 音视频领域；
• 16k_en：16k 英语；
• 16k_ca：16k 粤语；
• 16k_ja：16k 日语；
• 16k_zh_edu 中文教育；
• 16k_en_edu 英文教育；
• 16k_zh_medical  医疗；
• 16k_th 泰语；
• 16k_wuu-SH：16k 上海话方言；
• 16k_zh_dialect：多方言。
     */
    public void setEngineModelType(String EngineModelType) {
        this.EngineModelType = EngineModelType;
    }

    /**
     * Get 识别声道数。1：单声道（非电话场景，直接选择单声道即可，忽略音频声道数）；2：双声道（仅支持8k_zh电话场景，双声道应分别对应通话双方）。注意：双声道的电话音频已物理分离说话人，无需再开启说话人分离功能。 
     * @return ChannelNum 识别声道数。1：单声道（非电话场景，直接选择单声道即可，忽略音频声道数）；2：双声道（仅支持8k_zh电话场景，双声道应分别对应通话双方）。注意：双声道的电话音频已物理分离说话人，无需再开启说话人分离功能。
     */
    public Long getChannelNum() {
        return this.ChannelNum;
    }

    /**
     * Set 识别声道数。1：单声道（非电话场景，直接选择单声道即可，忽略音频声道数）；2：双声道（仅支持8k_zh电话场景，双声道应分别对应通话双方）。注意：双声道的电话音频已物理分离说话人，无需再开启说话人分离功能。
     * @param ChannelNum 识别声道数。1：单声道（非电话场景，直接选择单声道即可，忽略音频声道数）；2：双声道（仅支持8k_zh电话场景，双声道应分别对应通话双方）。注意：双声道的电话音频已物理分离说话人，无需再开启说话人分离功能。
     */
    public void setChannelNum(Long ChannelNum) {
        this.ChannelNum = ChannelNum;
    }

    /**
     * Get 识别结果返回形式。0： 识别结果文本(含分段时间戳)； 1：词级别粒度的[详细识别结果](https://cloud.tencent.com/document/api/1093/37824#SentenceDetail)(不含标点，含语速值)；2：词级别粒度的详细识别结果（包含标点、语速值） 
     * @return ResTextFormat 识别结果返回形式。0： 识别结果文本(含分段时间戳)； 1：词级别粒度的[详细识别结果](https://cloud.tencent.com/document/api/1093/37824#SentenceDetail)(不含标点，含语速值)；2：词级别粒度的详细识别结果（包含标点、语速值）
     */
    public Long getResTextFormat() {
        return this.ResTextFormat;
    }

    /**
     * Set 识别结果返回形式。0： 识别结果文本(含分段时间戳)； 1：词级别粒度的[详细识别结果](https://cloud.tencent.com/document/api/1093/37824#SentenceDetail)(不含标点，含语速值)；2：词级别粒度的详细识别结果（包含标点、语速值）
     * @param ResTextFormat 识别结果返回形式。0： 识别结果文本(含分段时间戳)； 1：词级别粒度的[详细识别结果](https://cloud.tencent.com/document/api/1093/37824#SentenceDetail)(不含标点，含语速值)；2：词级别粒度的详细识别结果（包含标点、语速值）
     */
    public void setResTextFormat(Long ResTextFormat) {
        this.ResTextFormat = ResTextFormat;
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
     * Get 是否开启说话人分离，0：不开启，1：开启(仅支持8k_zh，16k_zh，16k_zh_video，单声道音频)，默认值为 0。
注意：8k电话场景建议使用双声道来区分通话双方，设置ChannelNum=2即可，不用开启说话人分离。 
     * @return SpeakerDiarization 是否开启说话人分离，0：不开启，1：开启(仅支持8k_zh，16k_zh，16k_zh_video，单声道音频)，默认值为 0。
注意：8k电话场景建议使用双声道来区分通话双方，设置ChannelNum=2即可，不用开启说话人分离。
     */
    public Long getSpeakerDiarization() {
        return this.SpeakerDiarization;
    }

    /**
     * Set 是否开启说话人分离，0：不开启，1：开启(仅支持8k_zh，16k_zh，16k_zh_video，单声道音频)，默认值为 0。
注意：8k电话场景建议使用双声道来区分通话双方，设置ChannelNum=2即可，不用开启说话人分离。
     * @param SpeakerDiarization 是否开启说话人分离，0：不开启，1：开启(仅支持8k_zh，16k_zh，16k_zh_video，单声道音频)，默认值为 0。
注意：8k电话场景建议使用双声道来区分通话双方，设置ChannelNum=2即可，不用开启说话人分离。
     */
    public void setSpeakerDiarization(Long SpeakerDiarization) {
        this.SpeakerDiarization = SpeakerDiarization;
    }

    /**
     * Get 说话人分离人数（需配合开启说话人分离使用），取值范围：0-10，0代表自动分离（目前仅支持≤6个人），1-10代表指定说话人数分离。默认值为 0。
注：话者分离目前是beta版本，请根据您的需要谨慎使用 
     * @return SpeakerNumber 说话人分离人数（需配合开启说话人分离使用），取值范围：0-10，0代表自动分离（目前仅支持≤6个人），1-10代表指定说话人数分离。默认值为 0。
注：话者分离目前是beta版本，请根据您的需要谨慎使用
     */
    public Long getSpeakerNumber() {
        return this.SpeakerNumber;
    }

    /**
     * Set 说话人分离人数（需配合开启说话人分离使用），取值范围：0-10，0代表自动分离（目前仅支持≤6个人），1-10代表指定说话人数分离。默认值为 0。
注：话者分离目前是beta版本，请根据您的需要谨慎使用
     * @param SpeakerNumber 说话人分离人数（需配合开启说话人分离使用），取值范围：0-10，0代表自动分离（目前仅支持≤6个人），1-10代表指定说话人数分离。默认值为 0。
注：话者分离目前是beta版本，请根据您的需要谨慎使用
     */
    public void setSpeakerNumber(Long SpeakerNumber) {
        this.SpeakerNumber = SpeakerNumber;
    }

    /**
     * Get 回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。回调格式&内容详见：[录音识别回调说明](https://cloud.tencent.com/document/product/1093/52632) 
     * @return CallbackUrl 回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。回调格式&内容详见：[录音识别回调说明](https://cloud.tencent.com/document/product/1093/52632)
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。回调格式&内容详见：[录音识别回调说明](https://cloud.tencent.com/document/product/1093/52632)
     * @param CallbackUrl 回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。回调格式&内容详见：[录音识别回调说明](https://cloud.tencent.com/document/product/1093/52632)
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 语音的URL地址，需要公网可下载。长度小于2048字节，当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写。注意：请确保录音文件时长在5个小时之内，否则可能识别失败。请保证文件的下载速度，否则可能下载失败。 
     * @return Url 语音的URL地址，需要公网可下载。长度小于2048字节，当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写。注意：请确保录音文件时长在5个小时之内，否则可能识别失败。请保证文件的下载速度，否则可能下载失败。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 语音的URL地址，需要公网可下载。长度小于2048字节，当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写。注意：请确保录音文件时长在5个小时之内，否则可能识别失败。请保证文件的下载速度，否则可能下载失败。
     * @param Url 语音的URL地址，需要公网可下载。长度小于2048字节，当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写。注意：请确保录音文件时长在5个小时之内，否则可能识别失败。请保证文件的下载速度，否则可能下载失败。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 语音数据base64编码，当SourceType 值为1时必须填写，为0可不写。音频数据要小于5MB。 
     * @return Data 语音数据base64编码，当SourceType 值为1时必须填写，为0可不写。音频数据要小于5MB。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 语音数据base64编码，当SourceType 值为1时必须填写，为0可不写。音频数据要小于5MB。
     * @param Data 语音数据base64编码，当SourceType 值为1时必须填写，为0可不写。音频数据要小于5MB。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 数据长度，非必填（此数据长度为数据未进行base64编码时的数据长度）。 
     * @return DataLen 数据长度，非必填（此数据长度为数据未进行base64编码时的数据长度）。
     */
    public Long getDataLen() {
        return this.DataLen;
    }

    /**
     * Set 数据长度，非必填（此数据长度为数据未进行base64编码时的数据长度）。
     * @param DataLen 数据长度，非必填（此数据长度为数据未进行base64编码时的数据长度）。
     */
    public void setDataLen(Long DataLen) {
        this.DataLen = DataLen;
    }

    /**
     * Get 是否进行阿拉伯数字智能转换（目前支持中文普通话引擎）。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字，3: 打开数学相关数字转换。默认值为 1。 
     * @return ConvertNumMode 是否进行阿拉伯数字智能转换（目前支持中文普通话引擎）。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字，3: 打开数学相关数字转换。默认值为 1。
     */
    public Long getConvertNumMode() {
        return this.ConvertNumMode;
    }

    /**
     * Set 是否进行阿拉伯数字智能转换（目前支持中文普通话引擎）。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字，3: 打开数学相关数字转换。默认值为 1。
     * @param ConvertNumMode 是否进行阿拉伯数字智能转换（目前支持中文普通话引擎）。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字，3: 打开数学相关数字转换。默认值为 1。
     */
    public void setConvertNumMode(Long ConvertNumMode) {
        this.ConvertNumMode = ConvertNumMode;
    }

    /**
     * Get 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0。 
     * @return FilterDirty 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0。
     */
    public Long getFilterDirty() {
        return this.FilterDirty;
    }

    /**
     * Set 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0。
     * @param FilterDirty 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0。
     */
    public void setFilterDirty(Long FilterDirty) {
        this.FilterDirty = FilterDirty;
    }

    /**
     * Get 热词表id。如不设置该参数，自动生效默认热词表；如果设置了该参数，那么将生效对应的热词表。 
     * @return HotwordId 热词表id。如不设置该参数，自动生效默认热词表；如果设置了该参数，那么将生效对应的热词表。
     */
    public String getHotwordId() {
        return this.HotwordId;
    }

    /**
     * Set 热词表id。如不设置该参数，自动生效默认热词表；如果设置了该参数，那么将生效对应的热词表。
     * @param HotwordId 热词表id。如不设置该参数，自动生效默认热词表；如果设置了该参数，那么将生效对应的热词表。
     */
    public void setHotwordId(String HotwordId) {
        this.HotwordId = HotwordId;
    }

    /**
     * Get 自学习模型 id。如不设置该参数，自动生效最后一次上线的自学习模型；如果设置了该参数，那么将生效对应的自学习模型。 
     * @return CustomizationId 自学习模型 id。如不设置该参数，自动生效最后一次上线的自学习模型；如果设置了该参数，那么将生效对应的自学习模型。
     */
    public String getCustomizationId() {
        return this.CustomizationId;
    }

    /**
     * Set 自学习模型 id。如不设置该参数，自动生效最后一次上线的自学习模型；如果设置了该参数，那么将生效对应的自学习模型。
     * @param CustomizationId 自学习模型 id。如不设置该参数，自动生效最后一次上线的自学习模型；如果设置了该参数，那么将生效对应的自学习模型。
     */
    public void setCustomizationId(String CustomizationId) {
        this.CustomizationId = CustomizationId;
    }

    /**
     * Get 附加参数(该参数无意义，忽略即可) 
     * @return Extra 附加参数(该参数无意义，忽略即可)
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 附加参数(该参数无意义，忽略即可)
     * @param Extra 附加参数(该参数无意义，忽略即可)
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认值为 0。 
     * @return FilterPunc 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认值为 0。
     */
    public Long getFilterPunc() {
        return this.FilterPunc;
    }

    /**
     * Set 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认值为 0。
     * @param FilterPunc 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认值为 0。
     */
    public void setFilterPunc(Long FilterPunc) {
        this.FilterPunc = FilterPunc;
    }

    /**
     * Get 是否过滤语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0。 
     * @return FilterModal 是否过滤语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0。
     */
    public Long getFilterModal() {
        return this.FilterModal;
    }

    /**
     * Set 是否过滤语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0。
     * @param FilterModal 是否过滤语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0。
     */
    public void setFilterModal(Long FilterModal) {
        this.FilterModal = FilterModal;
    }

    public CreateRecTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecTaskRequest(CreateRecTaskRequest source) {
        if (source.EngineModelType != null) {
            this.EngineModelType = new String(source.EngineModelType);
        }
        if (source.ChannelNum != null) {
            this.ChannelNum = new Long(source.ChannelNum);
        }
        if (source.ResTextFormat != null) {
            this.ResTextFormat = new Long(source.ResTextFormat);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.SpeakerDiarization != null) {
            this.SpeakerDiarization = new Long(source.SpeakerDiarization);
        }
        if (source.SpeakerNumber != null) {
            this.SpeakerNumber = new Long(source.SpeakerNumber);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.DataLen != null) {
            this.DataLen = new Long(source.DataLen);
        }
        if (source.ConvertNumMode != null) {
            this.ConvertNumMode = new Long(source.ConvertNumMode);
        }
        if (source.FilterDirty != null) {
            this.FilterDirty = new Long(source.FilterDirty);
        }
        if (source.HotwordId != null) {
            this.HotwordId = new String(source.HotwordId);
        }
        if (source.CustomizationId != null) {
            this.CustomizationId = new String(source.CustomizationId);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.FilterPunc != null) {
            this.FilterPunc = new Long(source.FilterPunc);
        }
        if (source.FilterModal != null) {
            this.FilterModal = new Long(source.FilterModal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineModelType", this.EngineModelType);
        this.setParamSimple(map, prefix + "ChannelNum", this.ChannelNum);
        this.setParamSimple(map, prefix + "ResTextFormat", this.ResTextFormat);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SpeakerDiarization", this.SpeakerDiarization);
        this.setParamSimple(map, prefix + "SpeakerNumber", this.SpeakerNumber);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "DataLen", this.DataLen);
        this.setParamSimple(map, prefix + "ConvertNumMode", this.ConvertNumMode);
        this.setParamSimple(map, prefix + "FilterDirty", this.FilterDirty);
        this.setParamSimple(map, prefix + "HotwordId", this.HotwordId);
        this.setParamSimple(map, prefix + "CustomizationId", this.CustomizationId);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "FilterPunc", this.FilterPunc);
        this.setParamSimple(map, prefix + "FilterModal", this.FilterModal);

    }
}

