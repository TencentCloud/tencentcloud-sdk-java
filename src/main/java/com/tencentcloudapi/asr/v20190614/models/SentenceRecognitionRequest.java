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
    * 引擎模型类型。
电话场景：
• 8k_zh：中文电话通用；
• 8k_en：英文电话通用；

非电话场景：
• 16k_zh：中文通用；
• 16k_zh-PY：中英粤;
• 16k_zh_medical：中文医疗；
• 16k_en：英语；
• 16k_yue：粤语；
• 16k_ja：日语；
• 16k_ko：韩语；
• 16k_vi：越南语；
• 16k_ms：马来语；
• 16k_id：印度尼西亚语；
• 16k_fil：菲律宾语；
• 16k_th：泰语；
• 16k_pt：葡萄牙语；
• 16k_tr：土耳其语；
• 16k_ar：阿拉伯语；
• 16k_es：西班牙语；
• 16k_zh_dialect：多方言，支持23种方言（上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话）；
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
    * 识别音频的音频格式，支持wav、pcm、ogg-opus、speex、silk、mp3、m4a、aac、amr。
    */
    @SerializedName("VoiceFormat")
    @Expose
    private String VoiceFormat;

    /**
    * 腾讯云项目 ID，废弃参数，填写0即可。
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
    * 语音的URL地址，需要公网环境浏览器可下载。当 SourceType 值为 0时须填写该字段，为 1 时不填。音频时长不能超过60s，音频文件大小不能超过3MB。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 废弃参数，填写任意字符串即可。
    */
    @SerializedName("UsrAudioKey")
    @Expose
    private String UsrAudioKey;

    /**
    * 语音数据，当SourceType 值为1（本地语音数据上传）时必须填写，当SourceType 值为0（语音 URL上传）可不写。要使用base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频时长不能超过60s，音频文件大小不能超过3MB（Base64后）。
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
    * 是否显示词级别时间戳。0：不显示；1：显示，不包含标点时间戳，2：显示，包含标点时间戳。默认值为 0。
    */
    @SerializedName("WordInfo")
    @Expose
    private Long WordInfo;

    /**
    * 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0。
    */
    @SerializedName("FilterDirty")
    @Expose
    private Long FilterDirty;

    /**
    * 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0。
    */
    @SerializedName("FilterModal")
    @Expose
    private Long FilterModal;

    /**
    * 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认值为 0。
    */
    @SerializedName("FilterPunc")
    @Expose
    private Long FilterPunc;

    /**
    * 是否进行阿拉伯数字智能转换。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字。默认值为1。
    */
    @SerializedName("ConvertNumMode")
    @Expose
    private Long ConvertNumMode;

    /**
    * 热词id。用于调用对应的热词表，如果在调用语音识别服务时，不进行单独的热词id设置，自动生效默认热词；如果进行了单独的热词id设置，那么将生效单独设置的热词id。
    */
    @SerializedName("HotwordId")
    @Expose
    private String HotwordId;

    /**
    * 自学习模型 id。如设置了该参数，将生效对应的自学习模型。
    */
    @SerializedName("CustomizationId")
    @Expose
    private String CustomizationId;

    /**
    * 热词增强功能。1:开启后（仅支持8k_zh,16k_zh），将开启同音替换功能，同音字、词在热词中配置。举例：热词配置“蜜制”并开启增强功能后，与“蜜制”同拼音（mizhi）的“秘制”的识别结果会被强制替换成“蜜制”。因此建议客户根据自己的实际情况开启该功能。
    */
    @SerializedName("ReinforceHotword")
    @Expose
    private Long ReinforceHotword;

    /**
    * 临时热词表，该参数用于提升热词识别准确率。
单个热词规则："热词|权重"，不超过30个字符（最多10个汉字），权重1-10；
临时热词表限制：多个热词用英文逗号分割，最多128个热词，参数示例："腾讯云|10,语音识别|5,ASR|10"；
参数 hotword_list 与 hotword_id 区别：
hotword_id：需要先在控制台或接口创建热词表，获得对应hotword_id传入参数来使用热词功能；
hotword_list：每次请求时直接传入临时热词表来使用热词功能，云端不保留临时热词表；
注意：如果同时传入了 hotword_id 和 hotword_list，会优先使用 hotword_list。
    */
    @SerializedName("HotwordList")
    @Expose
    private String HotwordList;

    /**
    * 支持pcm格式的8k音频在与引擎采样率不匹配的情况下升采样到16k后识别，能有效提升识别准确率。仅支持：8000。如：传入 8000 ，则pcm音频采样率为8k，当引擎选用16k_zh， 那么该8k采样率的pcm音频可以在16k_zh引擎下正常识别。 注：此参数仅适用于pcm格式音频，不传入值将维持默认状态，即默认调用的引擎采样率等于pcm音频采样率。
    */
    @SerializedName("InputSampleRate")
    @Expose
    private Long InputSampleRate;

    /**
     * Get 引擎模型类型。
电话场景：
• 8k_zh：中文电话通用；
• 8k_en：英文电话通用；

非电话场景：
• 16k_zh：中文通用；
• 16k_zh-PY：中英粤;
• 16k_zh_medical：中文医疗；
• 16k_en：英语；
• 16k_yue：粤语；
• 16k_ja：日语；
• 16k_ko：韩语；
• 16k_vi：越南语；
• 16k_ms：马来语；
• 16k_id：印度尼西亚语；
• 16k_fil：菲律宾语；
• 16k_th：泰语；
• 16k_pt：葡萄牙语；
• 16k_tr：土耳其语；
• 16k_ar：阿拉伯语；
• 16k_es：西班牙语；
• 16k_zh_dialect：多方言，支持23种方言（上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话）； 
     * @return EngSerViceType 引擎模型类型。
电话场景：
• 8k_zh：中文电话通用；
• 8k_en：英文电话通用；

非电话场景：
• 16k_zh：中文通用；
• 16k_zh-PY：中英粤;
• 16k_zh_medical：中文医疗；
• 16k_en：英语；
• 16k_yue：粤语；
• 16k_ja：日语；
• 16k_ko：韩语；
• 16k_vi：越南语；
• 16k_ms：马来语；
• 16k_id：印度尼西亚语；
• 16k_fil：菲律宾语；
• 16k_th：泰语；
• 16k_pt：葡萄牙语；
• 16k_tr：土耳其语；
• 16k_ar：阿拉伯语；
• 16k_es：西班牙语；
• 16k_zh_dialect：多方言，支持23种方言（上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话）；
     */
    public String getEngSerViceType() {
        return this.EngSerViceType;
    }

    /**
     * Set 引擎模型类型。
电话场景：
• 8k_zh：中文电话通用；
• 8k_en：英文电话通用；

非电话场景：
• 16k_zh：中文通用；
• 16k_zh-PY：中英粤;
• 16k_zh_medical：中文医疗；
• 16k_en：英语；
• 16k_yue：粤语；
• 16k_ja：日语；
• 16k_ko：韩语；
• 16k_vi：越南语；
• 16k_ms：马来语；
• 16k_id：印度尼西亚语；
• 16k_fil：菲律宾语；
• 16k_th：泰语；
• 16k_pt：葡萄牙语；
• 16k_tr：土耳其语；
• 16k_ar：阿拉伯语；
• 16k_es：西班牙语；
• 16k_zh_dialect：多方言，支持23种方言（上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话）；
     * @param EngSerViceType 引擎模型类型。
电话场景：
• 8k_zh：中文电话通用；
• 8k_en：英文电话通用；

非电话场景：
• 16k_zh：中文通用；
• 16k_zh-PY：中英粤;
• 16k_zh_medical：中文医疗；
• 16k_en：英语；
• 16k_yue：粤语；
• 16k_ja：日语；
• 16k_ko：韩语；
• 16k_vi：越南语；
• 16k_ms：马来语；
• 16k_id：印度尼西亚语；
• 16k_fil：菲律宾语；
• 16k_th：泰语；
• 16k_pt：葡萄牙语；
• 16k_tr：土耳其语；
• 16k_ar：阿拉伯语；
• 16k_es：西班牙语；
• 16k_zh_dialect：多方言，支持23种方言（上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话）；
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
     * Get 识别音频的音频格式，支持wav、pcm、ogg-opus、speex、silk、mp3、m4a、aac、amr。 
     * @return VoiceFormat 识别音频的音频格式，支持wav、pcm、ogg-opus、speex、silk、mp3、m4a、aac、amr。
     */
    public String getVoiceFormat() {
        return this.VoiceFormat;
    }

    /**
     * Set 识别音频的音频格式，支持wav、pcm、ogg-opus、speex、silk、mp3、m4a、aac、amr。
     * @param VoiceFormat 识别音频的音频格式，支持wav、pcm、ogg-opus、speex、silk、mp3、m4a、aac、amr。
     */
    public void setVoiceFormat(String VoiceFormat) {
        this.VoiceFormat = VoiceFormat;
    }

    /**
     * Get 腾讯云项目 ID，废弃参数，填写0即可。 
     * @return ProjectId 腾讯云项目 ID，废弃参数，填写0即可。
     * @deprecated
     */
    @Deprecated
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 腾讯云项目 ID，废弃参数，填写0即可。
     * @param ProjectId 腾讯云项目 ID，废弃参数，填写0即可。
     * @deprecated
     */
    @Deprecated
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 子服务类型。2： 一句话识别。 
     * @return SubServiceType 子服务类型。2： 一句话识别。
     * @deprecated
     */
    @Deprecated
    public Long getSubServiceType() {
        return this.SubServiceType;
    }

    /**
     * Set 子服务类型。2： 一句话识别。
     * @param SubServiceType 子服务类型。2： 一句话识别。
     * @deprecated
     */
    @Deprecated
    public void setSubServiceType(Long SubServiceType) {
        this.SubServiceType = SubServiceType;
    }

    /**
     * Get 语音的URL地址，需要公网环境浏览器可下载。当 SourceType 值为 0时须填写该字段，为 1 时不填。音频时长不能超过60s，音频文件大小不能超过3MB。 
     * @return Url 语音的URL地址，需要公网环境浏览器可下载。当 SourceType 值为 0时须填写该字段，为 1 时不填。音频时长不能超过60s，音频文件大小不能超过3MB。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 语音的URL地址，需要公网环境浏览器可下载。当 SourceType 值为 0时须填写该字段，为 1 时不填。音频时长不能超过60s，音频文件大小不能超过3MB。
     * @param Url 语音的URL地址，需要公网环境浏览器可下载。当 SourceType 值为 0时须填写该字段，为 1 时不填。音频时长不能超过60s，音频文件大小不能超过3MB。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 废弃参数，填写任意字符串即可。 
     * @return UsrAudioKey 废弃参数，填写任意字符串即可。
     * @deprecated
     */
    @Deprecated
    public String getUsrAudioKey() {
        return this.UsrAudioKey;
    }

    /**
     * Set 废弃参数，填写任意字符串即可。
     * @param UsrAudioKey 废弃参数，填写任意字符串即可。
     * @deprecated
     */
    @Deprecated
    public void setUsrAudioKey(String UsrAudioKey) {
        this.UsrAudioKey = UsrAudioKey;
    }

    /**
     * Get 语音数据，当SourceType 值为1（本地语音数据上传）时必须填写，当SourceType 值为0（语音 URL上传）可不写。要使用base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频时长不能超过60s，音频文件大小不能超过3MB（Base64后）。 
     * @return Data 语音数据，当SourceType 值为1（本地语音数据上传）时必须填写，当SourceType 值为0（语音 URL上传）可不写。要使用base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频时长不能超过60s，音频文件大小不能超过3MB（Base64后）。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 语音数据，当SourceType 值为1（本地语音数据上传）时必须填写，当SourceType 值为0（语音 URL上传）可不写。要使用base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频时长不能超过60s，音频文件大小不能超过3MB（Base64后）。
     * @param Data 语音数据，当SourceType 值为1（本地语音数据上传）时必须填写，当SourceType 值为0（语音 URL上传）可不写。要使用base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频时长不能超过60s，音频文件大小不能超过3MB（Base64后）。
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
     * Get 是否显示词级别时间戳。0：不显示；1：显示，不包含标点时间戳，2：显示，包含标点时间戳。默认值为 0。 
     * @return WordInfo 是否显示词级别时间戳。0：不显示；1：显示，不包含标点时间戳，2：显示，包含标点时间戳。默认值为 0。
     */
    public Long getWordInfo() {
        return this.WordInfo;
    }

    /**
     * Set 是否显示词级别时间戳。0：不显示；1：显示，不包含标点时间戳，2：显示，包含标点时间戳。默认值为 0。
     * @param WordInfo 是否显示词级别时间戳。0：不显示；1：显示，不包含标点时间戳，2：显示，包含标点时间戳。默认值为 0。
     */
    public void setWordInfo(Long WordInfo) {
        this.WordInfo = WordInfo;
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
     * Get 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0。 
     * @return FilterModal 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0。
     */
    public Long getFilterModal() {
        return this.FilterModal;
    }

    /**
     * Set 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0。
     * @param FilterModal 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0。
     */
    public void setFilterModal(Long FilterModal) {
        this.FilterModal = FilterModal;
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
     * Get 是否进行阿拉伯数字智能转换。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字。默认值为1。 
     * @return ConvertNumMode 是否进行阿拉伯数字智能转换。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字。默认值为1。
     */
    public Long getConvertNumMode() {
        return this.ConvertNumMode;
    }

    /**
     * Set 是否进行阿拉伯数字智能转换。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字。默认值为1。
     * @param ConvertNumMode 是否进行阿拉伯数字智能转换。0：不转换，直接输出中文数字，1：根据场景智能转换为阿拉伯数字。默认值为1。
     */
    public void setConvertNumMode(Long ConvertNumMode) {
        this.ConvertNumMode = ConvertNumMode;
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
     * Get 自学习模型 id。如设置了该参数，将生效对应的自学习模型。 
     * @return CustomizationId 自学习模型 id。如设置了该参数，将生效对应的自学习模型。
     */
    public String getCustomizationId() {
        return this.CustomizationId;
    }

    /**
     * Set 自学习模型 id。如设置了该参数，将生效对应的自学习模型。
     * @param CustomizationId 自学习模型 id。如设置了该参数，将生效对应的自学习模型。
     */
    public void setCustomizationId(String CustomizationId) {
        this.CustomizationId = CustomizationId;
    }

    /**
     * Get 热词增强功能。1:开启后（仅支持8k_zh,16k_zh），将开启同音替换功能，同音字、词在热词中配置。举例：热词配置“蜜制”并开启增强功能后，与“蜜制”同拼音（mizhi）的“秘制”的识别结果会被强制替换成“蜜制”。因此建议客户根据自己的实际情况开启该功能。 
     * @return ReinforceHotword 热词增强功能。1:开启后（仅支持8k_zh,16k_zh），将开启同音替换功能，同音字、词在热词中配置。举例：热词配置“蜜制”并开启增强功能后，与“蜜制”同拼音（mizhi）的“秘制”的识别结果会被强制替换成“蜜制”。因此建议客户根据自己的实际情况开启该功能。
     */
    public Long getReinforceHotword() {
        return this.ReinforceHotword;
    }

    /**
     * Set 热词增强功能。1:开启后（仅支持8k_zh,16k_zh），将开启同音替换功能，同音字、词在热词中配置。举例：热词配置“蜜制”并开启增强功能后，与“蜜制”同拼音（mizhi）的“秘制”的识别结果会被强制替换成“蜜制”。因此建议客户根据自己的实际情况开启该功能。
     * @param ReinforceHotword 热词增强功能。1:开启后（仅支持8k_zh,16k_zh），将开启同音替换功能，同音字、词在热词中配置。举例：热词配置“蜜制”并开启增强功能后，与“蜜制”同拼音（mizhi）的“秘制”的识别结果会被强制替换成“蜜制”。因此建议客户根据自己的实际情况开启该功能。
     */
    public void setReinforceHotword(Long ReinforceHotword) {
        this.ReinforceHotword = ReinforceHotword;
    }

    /**
     * Get 临时热词表，该参数用于提升热词识别准确率。
单个热词规则："热词|权重"，不超过30个字符（最多10个汉字），权重1-10；
临时热词表限制：多个热词用英文逗号分割，最多128个热词，参数示例："腾讯云|10,语音识别|5,ASR|10"；
参数 hotword_list 与 hotword_id 区别：
hotword_id：需要先在控制台或接口创建热词表，获得对应hotword_id传入参数来使用热词功能；
hotword_list：每次请求时直接传入临时热词表来使用热词功能，云端不保留临时热词表；
注意：如果同时传入了 hotword_id 和 hotword_list，会优先使用 hotword_list。 
     * @return HotwordList 临时热词表，该参数用于提升热词识别准确率。
单个热词规则："热词|权重"，不超过30个字符（最多10个汉字），权重1-10；
临时热词表限制：多个热词用英文逗号分割，最多128个热词，参数示例："腾讯云|10,语音识别|5,ASR|10"；
参数 hotword_list 与 hotword_id 区别：
hotword_id：需要先在控制台或接口创建热词表，获得对应hotword_id传入参数来使用热词功能；
hotword_list：每次请求时直接传入临时热词表来使用热词功能，云端不保留临时热词表；
注意：如果同时传入了 hotword_id 和 hotword_list，会优先使用 hotword_list。
     */
    public String getHotwordList() {
        return this.HotwordList;
    }

    /**
     * Set 临时热词表，该参数用于提升热词识别准确率。
单个热词规则："热词|权重"，不超过30个字符（最多10个汉字），权重1-10；
临时热词表限制：多个热词用英文逗号分割，最多128个热词，参数示例："腾讯云|10,语音识别|5,ASR|10"；
参数 hotword_list 与 hotword_id 区别：
hotword_id：需要先在控制台或接口创建热词表，获得对应hotword_id传入参数来使用热词功能；
hotword_list：每次请求时直接传入临时热词表来使用热词功能，云端不保留临时热词表；
注意：如果同时传入了 hotword_id 和 hotword_list，会优先使用 hotword_list。
     * @param HotwordList 临时热词表，该参数用于提升热词识别准确率。
单个热词规则："热词|权重"，不超过30个字符（最多10个汉字），权重1-10；
临时热词表限制：多个热词用英文逗号分割，最多128个热词，参数示例："腾讯云|10,语音识别|5,ASR|10"；
参数 hotword_list 与 hotword_id 区别：
hotword_id：需要先在控制台或接口创建热词表，获得对应hotword_id传入参数来使用热词功能；
hotword_list：每次请求时直接传入临时热词表来使用热词功能，云端不保留临时热词表；
注意：如果同时传入了 hotword_id 和 hotword_list，会优先使用 hotword_list。
     */
    public void setHotwordList(String HotwordList) {
        this.HotwordList = HotwordList;
    }

    /**
     * Get 支持pcm格式的8k音频在与引擎采样率不匹配的情况下升采样到16k后识别，能有效提升识别准确率。仅支持：8000。如：传入 8000 ，则pcm音频采样率为8k，当引擎选用16k_zh， 那么该8k采样率的pcm音频可以在16k_zh引擎下正常识别。 注：此参数仅适用于pcm格式音频，不传入值将维持默认状态，即默认调用的引擎采样率等于pcm音频采样率。 
     * @return InputSampleRate 支持pcm格式的8k音频在与引擎采样率不匹配的情况下升采样到16k后识别，能有效提升识别准确率。仅支持：8000。如：传入 8000 ，则pcm音频采样率为8k，当引擎选用16k_zh， 那么该8k采样率的pcm音频可以在16k_zh引擎下正常识别。 注：此参数仅适用于pcm格式音频，不传入值将维持默认状态，即默认调用的引擎采样率等于pcm音频采样率。
     */
    public Long getInputSampleRate() {
        return this.InputSampleRate;
    }

    /**
     * Set 支持pcm格式的8k音频在与引擎采样率不匹配的情况下升采样到16k后识别，能有效提升识别准确率。仅支持：8000。如：传入 8000 ，则pcm音频采样率为8k，当引擎选用16k_zh， 那么该8k采样率的pcm音频可以在16k_zh引擎下正常识别。 注：此参数仅适用于pcm格式音频，不传入值将维持默认状态，即默认调用的引擎采样率等于pcm音频采样率。
     * @param InputSampleRate 支持pcm格式的8k音频在与引擎采样率不匹配的情况下升采样到16k后识别，能有效提升识别准确率。仅支持：8000。如：传入 8000 ，则pcm音频采样率为8k，当引擎选用16k_zh， 那么该8k采样率的pcm音频可以在16k_zh引擎下正常识别。 注：此参数仅适用于pcm格式音频，不传入值将维持默认状态，即默认调用的引擎采样率等于pcm音频采样率。
     */
    public void setInputSampleRate(Long InputSampleRate) {
        this.InputSampleRate = InputSampleRate;
    }

    public SentenceRecognitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentenceRecognitionRequest(SentenceRecognitionRequest source) {
        if (source.EngSerViceType != null) {
            this.EngSerViceType = new String(source.EngSerViceType);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.VoiceFormat != null) {
            this.VoiceFormat = new String(source.VoiceFormat);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.SubServiceType != null) {
            this.SubServiceType = new Long(source.SubServiceType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.UsrAudioKey != null) {
            this.UsrAudioKey = new String(source.UsrAudioKey);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.DataLen != null) {
            this.DataLen = new Long(source.DataLen);
        }
        if (source.WordInfo != null) {
            this.WordInfo = new Long(source.WordInfo);
        }
        if (source.FilterDirty != null) {
            this.FilterDirty = new Long(source.FilterDirty);
        }
        if (source.FilterModal != null) {
            this.FilterModal = new Long(source.FilterModal);
        }
        if (source.FilterPunc != null) {
            this.FilterPunc = new Long(source.FilterPunc);
        }
        if (source.ConvertNumMode != null) {
            this.ConvertNumMode = new Long(source.ConvertNumMode);
        }
        if (source.HotwordId != null) {
            this.HotwordId = new String(source.HotwordId);
        }
        if (source.CustomizationId != null) {
            this.CustomizationId = new String(source.CustomizationId);
        }
        if (source.ReinforceHotword != null) {
            this.ReinforceHotword = new Long(source.ReinforceHotword);
        }
        if (source.HotwordList != null) {
            this.HotwordList = new String(source.HotwordList);
        }
        if (source.InputSampleRate != null) {
            this.InputSampleRate = new Long(source.InputSampleRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngSerViceType", this.EngSerViceType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "VoiceFormat", this.VoiceFormat);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SubServiceType", this.SubServiceType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "UsrAudioKey", this.UsrAudioKey);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "DataLen", this.DataLen);
        this.setParamSimple(map, prefix + "WordInfo", this.WordInfo);
        this.setParamSimple(map, prefix + "FilterDirty", this.FilterDirty);
        this.setParamSimple(map, prefix + "FilterModal", this.FilterModal);
        this.setParamSimple(map, prefix + "FilterPunc", this.FilterPunc);
        this.setParamSimple(map, prefix + "ConvertNumMode", this.ConvertNumMode);
        this.setParamSimple(map, prefix + "HotwordId", this.HotwordId);
        this.setParamSimple(map, prefix + "CustomizationId", this.CustomizationId);
        this.setParamSimple(map, prefix + "ReinforceHotword", this.ReinforceHotword);
        this.setParamSimple(map, prefix + "HotwordList", this.HotwordList);
        this.setParamSimple(map, prefix + "InputSampleRate", this.InputSampleRate);

    }
}

