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
package com.tencentcloudapi.tts.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTtsTaskRequest extends AbstractModel{

    /**
    * 合成语音的源文本，按UTF-8编码统一计算，最多支持10万字符
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 模型类型，1-默认模型。
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * 语速，范围：[-2，2]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li>如果需要更细化的语速，可以保留小数点后一位，例如0.5 1.1 1.8等。<br>
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * 项目id，用户自定义，默认为0。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 标准音色<li>10510000-智逍遥，旁对白阅读风格男声</li><li>1001-智瑜，情感女声</li><li>1002-智聆，通用女声</li><li>1003-智美，客服女声</li><li>1004-智云，通用男声</li><li>1005-智莉，通用女声</li><li>1007-智娜，客服女声</li><li>1008-智琪，客服女声</li><li>1009-智芸，知性女声</li><li>1010-智华，通用男声</li><li>1017-智蓉，情感女声</li><li>1018-智靖，情感男声</li><li>1050-WeJack，英文男声</li><li>1051-WeRose，英文女声</li>精品音色<br>精品音色拟真度更高，价格不同于标准音色，查看[购买指南](https://cloud.tencent.com/document/product/1073/34112)<br><li>100510000-智逍遥，旁对白阅读风格男声（精品）</li><li>101001-智瑜，情感女声（精品）</li><li>101002-智聆，通用女声（精品）</li><li>101003-智美，客服女声（精品）</li><li>101004-智云，通用男声（精品）</li><li>101005-智莉，通用女声（精品）</li><li>101006-智言，助手女声</li><li>101007-智娜，客服女声（精品）</li><li>101008-智琪，客服女声（精品）</li><li>101009-智芸，知性女声（精品）</li><li>101010-智华，通用男声（精品）</li><li>101011-智燕，新闻女声</li><li>101012-智丹，新闻女声</li><li>101013-智辉，新闻男声</li><li>101014-智宁，新闻男声</li><li>101015-智萌，男童声</li><li>101016-智甜，女童声</li><li>101017-智蓉，情感女声（精品）</li><li>101018-智靖，情感男声（精品）</li><li>101019-智彤，粤语女声</li><li>101050-WeJack，英文男声（精品）</li><li>101051-WeRose，英文女声（精品）</li>
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
    */
    @SerializedName("PrimaryLanguage")
    @Expose
    private Long PrimaryLanguage;

    /**
    * 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 返回音频格式，可取值：mp3（默认），wav，pcm
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。[回调说明](https://cloud.tencent.com/document/product/1073/55746)
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 旁白与对白文本解析，分别合成相应风格（仅适用于旁对白音色），默认 false
    */
    @SerializedName("VoiceoverDialogueSplit")
    @Expose
    private Boolean VoiceoverDialogueSplit;

    /**
     * Get 合成语音的源文本，按UTF-8编码统一计算，最多支持10万字符 
     * @return Text 合成语音的源文本，按UTF-8编码统一计算，最多支持10万字符
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 合成语音的源文本，按UTF-8编码统一计算，最多支持10万字符
     * @param Text 合成语音的源文本，按UTF-8编码统一计算，最多支持10万字符
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 模型类型，1-默认模型。 
     * @return ModelType 模型类型，1-默认模型。
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set 模型类型，1-默认模型。
     * @param ModelType 模型类型，1-默认模型。
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。 
     * @return Volume 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
     * @param Volume 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 语速，范围：[-2，2]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li>如果需要更细化的语速，可以保留小数点后一位，例如0.5 1.1 1.8等。<br> 
     * @return Speed 语速，范围：[-2，2]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li>如果需要更细化的语速，可以保留小数点后一位，例如0.5 1.1 1.8等。<br>
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set 语速，范围：[-2，2]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li>如果需要更细化的语速，可以保留小数点后一位，例如0.5 1.1 1.8等。<br>
     * @param Speed 语速，范围：[-2，2]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li>如果需要更细化的语速，可以保留小数点后一位，例如0.5 1.1 1.8等。<br>
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get 项目id，用户自定义，默认为0。 
     * @return ProjectId 项目id，用户自定义，默认为0。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id，用户自定义，默认为0。
     * @param ProjectId 项目id，用户自定义，默认为0。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 标准音色<li>10510000-智逍遥，旁对白阅读风格男声</li><li>1001-智瑜，情感女声</li><li>1002-智聆，通用女声</li><li>1003-智美，客服女声</li><li>1004-智云，通用男声</li><li>1005-智莉，通用女声</li><li>1007-智娜，客服女声</li><li>1008-智琪，客服女声</li><li>1009-智芸，知性女声</li><li>1010-智华，通用男声</li><li>1017-智蓉，情感女声</li><li>1018-智靖，情感男声</li><li>1050-WeJack，英文男声</li><li>1051-WeRose，英文女声</li>精品音色<br>精品音色拟真度更高，价格不同于标准音色，查看[购买指南](https://cloud.tencent.com/document/product/1073/34112)<br><li>100510000-智逍遥，旁对白阅读风格男声（精品）</li><li>101001-智瑜，情感女声（精品）</li><li>101002-智聆，通用女声（精品）</li><li>101003-智美，客服女声（精品）</li><li>101004-智云，通用男声（精品）</li><li>101005-智莉，通用女声（精品）</li><li>101006-智言，助手女声</li><li>101007-智娜，客服女声（精品）</li><li>101008-智琪，客服女声（精品）</li><li>101009-智芸，知性女声（精品）</li><li>101010-智华，通用男声（精品）</li><li>101011-智燕，新闻女声</li><li>101012-智丹，新闻女声</li><li>101013-智辉，新闻男声</li><li>101014-智宁，新闻男声</li><li>101015-智萌，男童声</li><li>101016-智甜，女童声</li><li>101017-智蓉，情感女声（精品）</li><li>101018-智靖，情感男声（精品）</li><li>101019-智彤，粤语女声</li><li>101050-WeJack，英文男声（精品）</li><li>101051-WeRose，英文女声（精品）</li> 
     * @return VoiceType 标准音色<li>10510000-智逍遥，旁对白阅读风格男声</li><li>1001-智瑜，情感女声</li><li>1002-智聆，通用女声</li><li>1003-智美，客服女声</li><li>1004-智云，通用男声</li><li>1005-智莉，通用女声</li><li>1007-智娜，客服女声</li><li>1008-智琪，客服女声</li><li>1009-智芸，知性女声</li><li>1010-智华，通用男声</li><li>1017-智蓉，情感女声</li><li>1018-智靖，情感男声</li><li>1050-WeJack，英文男声</li><li>1051-WeRose，英文女声</li>精品音色<br>精品音色拟真度更高，价格不同于标准音色，查看[购买指南](https://cloud.tencent.com/document/product/1073/34112)<br><li>100510000-智逍遥，旁对白阅读风格男声（精品）</li><li>101001-智瑜，情感女声（精品）</li><li>101002-智聆，通用女声（精品）</li><li>101003-智美，客服女声（精品）</li><li>101004-智云，通用男声（精品）</li><li>101005-智莉，通用女声（精品）</li><li>101006-智言，助手女声</li><li>101007-智娜，客服女声（精品）</li><li>101008-智琪，客服女声（精品）</li><li>101009-智芸，知性女声（精品）</li><li>101010-智华，通用男声（精品）</li><li>101011-智燕，新闻女声</li><li>101012-智丹，新闻女声</li><li>101013-智辉，新闻男声</li><li>101014-智宁，新闻男声</li><li>101015-智萌，男童声</li><li>101016-智甜，女童声</li><li>101017-智蓉，情感女声（精品）</li><li>101018-智靖，情感男声（精品）</li><li>101019-智彤，粤语女声</li><li>101050-WeJack，英文男声（精品）</li><li>101051-WeRose，英文女声（精品）</li>
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 标准音色<li>10510000-智逍遥，旁对白阅读风格男声</li><li>1001-智瑜，情感女声</li><li>1002-智聆，通用女声</li><li>1003-智美，客服女声</li><li>1004-智云，通用男声</li><li>1005-智莉，通用女声</li><li>1007-智娜，客服女声</li><li>1008-智琪，客服女声</li><li>1009-智芸，知性女声</li><li>1010-智华，通用男声</li><li>1017-智蓉，情感女声</li><li>1018-智靖，情感男声</li><li>1050-WeJack，英文男声</li><li>1051-WeRose，英文女声</li>精品音色<br>精品音色拟真度更高，价格不同于标准音色，查看[购买指南](https://cloud.tencent.com/document/product/1073/34112)<br><li>100510000-智逍遥，旁对白阅读风格男声（精品）</li><li>101001-智瑜，情感女声（精品）</li><li>101002-智聆，通用女声（精品）</li><li>101003-智美，客服女声（精品）</li><li>101004-智云，通用男声（精品）</li><li>101005-智莉，通用女声（精品）</li><li>101006-智言，助手女声</li><li>101007-智娜，客服女声（精品）</li><li>101008-智琪，客服女声（精品）</li><li>101009-智芸，知性女声（精品）</li><li>101010-智华，通用男声（精品）</li><li>101011-智燕，新闻女声</li><li>101012-智丹，新闻女声</li><li>101013-智辉，新闻男声</li><li>101014-智宁，新闻男声</li><li>101015-智萌，男童声</li><li>101016-智甜，女童声</li><li>101017-智蓉，情感女声（精品）</li><li>101018-智靖，情感男声（精品）</li><li>101019-智彤，粤语女声</li><li>101050-WeJack，英文男声（精品）</li><li>101051-WeRose，英文女声（精品）</li>
     * @param VoiceType 标准音色<li>10510000-智逍遥，旁对白阅读风格男声</li><li>1001-智瑜，情感女声</li><li>1002-智聆，通用女声</li><li>1003-智美，客服女声</li><li>1004-智云，通用男声</li><li>1005-智莉，通用女声</li><li>1007-智娜，客服女声</li><li>1008-智琪，客服女声</li><li>1009-智芸，知性女声</li><li>1010-智华，通用男声</li><li>1017-智蓉，情感女声</li><li>1018-智靖，情感男声</li><li>1050-WeJack，英文男声</li><li>1051-WeRose，英文女声</li>精品音色<br>精品音色拟真度更高，价格不同于标准音色，查看[购买指南](https://cloud.tencent.com/document/product/1073/34112)<br><li>100510000-智逍遥，旁对白阅读风格男声（精品）</li><li>101001-智瑜，情感女声（精品）</li><li>101002-智聆，通用女声（精品）</li><li>101003-智美，客服女声（精品）</li><li>101004-智云，通用男声（精品）</li><li>101005-智莉，通用女声（精品）</li><li>101006-智言，助手女声</li><li>101007-智娜，客服女声（精品）</li><li>101008-智琪，客服女声（精品）</li><li>101009-智芸，知性女声（精品）</li><li>101010-智华，通用男声（精品）</li><li>101011-智燕，新闻女声</li><li>101012-智丹，新闻女声</li><li>101013-智辉，新闻男声</li><li>101014-智宁，新闻男声</li><li>101015-智萌，男童声</li><li>101016-智甜，女童声</li><li>101017-智蓉，情感女声（精品）</li><li>101018-智靖，情感男声（精品）</li><li>101019-智彤，粤语女声</li><li>101050-WeJack，英文男声（精品）</li><li>101051-WeRose，英文女声（精品）</li>
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 主语言类型：<li>1-中文（默认）</li><li>2-英文</li> 
     * @return PrimaryLanguage 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
     */
    public Long getPrimaryLanguage() {
        return this.PrimaryLanguage;
    }

    /**
     * Set 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
     * @param PrimaryLanguage 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
     */
    public void setPrimaryLanguage(Long PrimaryLanguage) {
        this.PrimaryLanguage = PrimaryLanguage;
    }

    /**
     * Get 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li> 
     * @return SampleRate 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
     * @param SampleRate 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 返回音频格式，可取值：mp3（默认），wav，pcm 
     * @return Codec 返回音频格式，可取值：mp3（默认），wav，pcm
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 返回音频格式，可取值：mp3（默认），wav，pcm
     * @param Codec 返回音频格式，可取值：mp3（默认），wav，pcm
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。[回调说明](https://cloud.tencent.com/document/product/1073/55746) 
     * @return CallbackUrl 回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。[回调说明](https://cloud.tencent.com/document/product/1073/55746)
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。[回调说明](https://cloud.tencent.com/document/product/1073/55746)
     * @param CallbackUrl 回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。[回调说明](https://cloud.tencent.com/document/product/1073/55746)
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 旁白与对白文本解析，分别合成相应风格（仅适用于旁对白音色），默认 false 
     * @return VoiceoverDialogueSplit 旁白与对白文本解析，分别合成相应风格（仅适用于旁对白音色），默认 false
     */
    public Boolean getVoiceoverDialogueSplit() {
        return this.VoiceoverDialogueSplit;
    }

    /**
     * Set 旁白与对白文本解析，分别合成相应风格（仅适用于旁对白音色），默认 false
     * @param VoiceoverDialogueSplit 旁白与对白文本解析，分别合成相应风格（仅适用于旁对白音色），默认 false
     */
    public void setVoiceoverDialogueSplit(Boolean VoiceoverDialogueSplit) {
        this.VoiceoverDialogueSplit = VoiceoverDialogueSplit;
    }

    public CreateTtsTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTtsTaskRequest(CreateTtsTaskRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ModelType != null) {
            this.ModelType = new Long(source.ModelType);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
        if (source.PrimaryLanguage != null) {
            this.PrimaryLanguage = new Long(source.PrimaryLanguage);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.VoiceoverDialogueSplit != null) {
            this.VoiceoverDialogueSplit = new Boolean(source.VoiceoverDialogueSplit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "PrimaryLanguage", this.PrimaryLanguage);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "VoiceoverDialogueSplit", this.VoiceoverDialogueSplit);

    }
}

