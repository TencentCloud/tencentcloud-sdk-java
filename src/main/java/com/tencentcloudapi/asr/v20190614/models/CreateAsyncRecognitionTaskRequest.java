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

public class CreateAsyncRecognitionTaskRequest extends AbstractModel{

    /**
    * 引擎模型类型。
• 16k_zh：16k 中文普通话通用；
• 16k_zh_video：16k 音视频领域；
• 16k_en：16k 英语；
• 16k_ca：16k 粤语；
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 语音流地址，支持rtmp、hls、rtsp等流媒体协议，以及各类基于http协议的直播流
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 支持HTTP和HTTPS协议，用于接收识别结果，您需要自行搭建公网可调用的服务。回调格式&内容详见：[语音流异步识别回调说明](https://github.com/yunjianfei/qcloud-documents/blob/master/product/%E5%A4%A7%E6%95%B0%E6%8D%AE%E4%B8%8EAI/%E8%AF%AD%E9%9F%B3%E8%AF%86%E5%88%AB/%E8%AF%AD%E9%9F%B3%E8%AF%86%E5%88%AB%20API%202017/%E8%AF%AD%E9%9F%B3%E6%B5%81%E5%BC%82%E6%AD%A5%E8%AF%86%E5%88%AB%E5%9B%9E%E8%B0%83%E8%AF%B4%E6%98%8E.md)
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 用于生成回调通知中的签名
    */
    @SerializedName("SignToken")
    @Expose
    private String SignToken;

    /**
    * 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0
    */
    @SerializedName("FilterDirty")
    @Expose
    private Long FilterDirty;

    /**
    * 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0
    */
    @SerializedName("FilterModal")
    @Expose
    private Long FilterModal;

    /**
    * 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认为0
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
    * 是否显示词级别时间戳。0：不显示；1：显示，不包含标点时间戳，2：显示，包含标点时间戳。默认为0
    */
    @SerializedName("WordInfo")
    @Expose
    private Long WordInfo;

    /**
    * 热词id。用于调用对应的热词表，如果在调用语音识别服务时，不进行单独的热词id设置，自动生效默认热词；如果进行了单独的热词id设置，那么将生效单独设置的热词id。
    */
    @SerializedName("HotwordId")
    @Expose
    private String HotwordId;

    /**
     * Get 引擎模型类型。
• 16k_zh：16k 中文普通话通用；
• 16k_zh_video：16k 音视频领域；
• 16k_en：16k 英语；
• 16k_ca：16k 粤语； 
     * @return EngineType 引擎模型类型。
• 16k_zh：16k 中文普通话通用；
• 16k_zh_video：16k 音视频领域；
• 16k_en：16k 英语；
• 16k_ca：16k 粤语；
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 引擎模型类型。
• 16k_zh：16k 中文普通话通用；
• 16k_zh_video：16k 音视频领域；
• 16k_en：16k 英语；
• 16k_ca：16k 粤语；
     * @param EngineType 引擎模型类型。
• 16k_zh：16k 中文普通话通用；
• 16k_zh_video：16k 音视频领域；
• 16k_en：16k 英语；
• 16k_ca：16k 粤语；
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 语音流地址，支持rtmp、hls、rtsp等流媒体协议，以及各类基于http协议的直播流 
     * @return Url 语音流地址，支持rtmp、hls、rtsp等流媒体协议，以及各类基于http协议的直播流
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 语音流地址，支持rtmp、hls、rtsp等流媒体协议，以及各类基于http协议的直播流
     * @param Url 语音流地址，支持rtmp、hls、rtsp等流媒体协议，以及各类基于http协议的直播流
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 支持HTTP和HTTPS协议，用于接收识别结果，您需要自行搭建公网可调用的服务。回调格式&内容详见：[语音流异步识别回调说明](https://github.com/yunjianfei/qcloud-documents/blob/master/product/%E5%A4%A7%E6%95%B0%E6%8D%AE%E4%B8%8EAI/%E8%AF%AD%E9%9F%B3%E8%AF%86%E5%88%AB/%E8%AF%AD%E9%9F%B3%E8%AF%86%E5%88%AB%20API%202017/%E8%AF%AD%E9%9F%B3%E6%B5%81%E5%BC%82%E6%AD%A5%E8%AF%86%E5%88%AB%E5%9B%9E%E8%B0%83%E8%AF%B4%E6%98%8E.md) 
     * @return CallbackUrl 支持HTTP和HTTPS协议，用于接收识别结果，您需要自行搭建公网可调用的服务。回调格式&内容详见：[语音流异步识别回调说明](https://github.com/yunjianfei/qcloud-documents/blob/master/product/%E5%A4%A7%E6%95%B0%E6%8D%AE%E4%B8%8EAI/%E8%AF%AD%E9%9F%B3%E8%AF%86%E5%88%AB/%E8%AF%AD%E9%9F%B3%E8%AF%86%E5%88%AB%20API%202017/%E8%AF%AD%E9%9F%B3%E6%B5%81%E5%BC%82%E6%AD%A5%E8%AF%86%E5%88%AB%E5%9B%9E%E8%B0%83%E8%AF%B4%E6%98%8E.md)
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 支持HTTP和HTTPS协议，用于接收识别结果，您需要自行搭建公网可调用的服务。回调格式&内容详见：[语音流异步识别回调说明](https://github.com/yunjianfei/qcloud-documents/blob/master/product/%E5%A4%A7%E6%95%B0%E6%8D%AE%E4%B8%8EAI/%E8%AF%AD%E9%9F%B3%E8%AF%86%E5%88%AB/%E8%AF%AD%E9%9F%B3%E8%AF%86%E5%88%AB%20API%202017/%E8%AF%AD%E9%9F%B3%E6%B5%81%E5%BC%82%E6%AD%A5%E8%AF%86%E5%88%AB%E5%9B%9E%E8%B0%83%E8%AF%B4%E6%98%8E.md)
     * @param CallbackUrl 支持HTTP和HTTPS协议，用于接收识别结果，您需要自行搭建公网可调用的服务。回调格式&内容详见：[语音流异步识别回调说明](https://github.com/yunjianfei/qcloud-documents/blob/master/product/%E5%A4%A7%E6%95%B0%E6%8D%AE%E4%B8%8EAI/%E8%AF%AD%E9%9F%B3%E8%AF%86%E5%88%AB/%E8%AF%AD%E9%9F%B3%E8%AF%86%E5%88%AB%20API%202017/%E8%AF%AD%E9%9F%B3%E6%B5%81%E5%BC%82%E6%AD%A5%E8%AF%86%E5%88%AB%E5%9B%9E%E8%B0%83%E8%AF%B4%E6%98%8E.md)
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 用于生成回调通知中的签名 
     * @return SignToken 用于生成回调通知中的签名
     */
    public String getSignToken() {
        return this.SignToken;
    }

    /**
     * Set 用于生成回调通知中的签名
     * @param SignToken 用于生成回调通知中的签名
     */
    public void setSignToken(String SignToken) {
        this.SignToken = SignToken;
    }

    /**
     * Get 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0 
     * @return FilterDirty 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0
     */
    public Long getFilterDirty() {
        return this.FilterDirty;
    }

    /**
     * Set 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0
     * @param FilterDirty 是否过滤脏词（目前支持中文普通话引擎）。0：不过滤脏词；1：过滤脏词；2：将脏词替换为 * 。默认值为 0
     */
    public void setFilterDirty(Long FilterDirty) {
        this.FilterDirty = FilterDirty;
    }

    /**
     * Get 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0 
     * @return FilterModal 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0
     */
    public Long getFilterModal() {
        return this.FilterModal;
    }

    /**
     * Set 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0
     * @param FilterModal 是否过语气词（目前支持中文普通话引擎）。0：不过滤语气词；1：部分过滤；2：严格过滤 。默认值为 0
     */
    public void setFilterModal(Long FilterModal) {
        this.FilterModal = FilterModal;
    }

    /**
     * Get 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认为0 
     * @return FilterPunc 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认为0
     */
    public Long getFilterPunc() {
        return this.FilterPunc;
    }

    /**
     * Set 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认为0
     * @param FilterPunc 是否过滤标点符号（目前支持中文普通话引擎）。 0：不过滤，1：过滤句末标点，2：过滤所有标点。默认为0
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
     * Get 是否显示词级别时间戳。0：不显示；1：显示，不包含标点时间戳，2：显示，包含标点时间戳。默认为0 
     * @return WordInfo 是否显示词级别时间戳。0：不显示；1：显示，不包含标点时间戳，2：显示，包含标点时间戳。默认为0
     */
    public Long getWordInfo() {
        return this.WordInfo;
    }

    /**
     * Set 是否显示词级别时间戳。0：不显示；1：显示，不包含标点时间戳，2：显示，包含标点时间戳。默认为0
     * @param WordInfo 是否显示词级别时间戳。0：不显示；1：显示，不包含标点时间戳，2：显示，包含标点时间戳。默认为0
     */
    public void setWordInfo(Long WordInfo) {
        this.WordInfo = WordInfo;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "SignToken", this.SignToken);
        this.setParamSimple(map, prefix + "FilterDirty", this.FilterDirty);
        this.setParamSimple(map, prefix + "FilterModal", this.FilterModal);
        this.setParamSimple(map, prefix + "FilterPunc", this.FilterPunc);
        this.setParamSimple(map, prefix + "ConvertNumMode", this.ConvertNumMode);
        this.setParamSimple(map, prefix + "WordInfo", this.WordInfo);
        this.setParamSimple(map, prefix + "HotwordId", this.HotwordId);

    }
}

