/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTtsTaskRequest extends AbstractModel {

    /**
    * <p>合成语音的源文本，按UTF-8编码统一计算，最多支持10万字符</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>音量大小，范围[-10，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。</p>
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * <p>语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。<br>参数值与实际语速转换，可参考<a href="https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz">代码示例</a></p>
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * <p>项目id，用户自定义，默认为0。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>模型类型，1-默认模型。</p>
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * <p>音色 ID，价格请参见<a href="https://cloud.tencent.com/document/product/1073/34112">购买指南</a>。完整的音色 ID 列表请参见<a href="https://cloud.tencent.com/document/product/1073/92668">音色列表</a>。</p>
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * <p>主语言类型：<li>1-中文（默认）</li><li>2-英文</li></p>
    */
    @SerializedName("PrimaryLanguage")
    @Expose
    private Long PrimaryLanguage;

    /**
    * <p>音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li></p>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>返回音频格式，可取值：mp3（默认），wav，pcm</p>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * <p>回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。<a href="https://cloud.tencent.com/document/product/1073/55746">回调说明</a></p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>是否开启时间戳功能，默认为false。</p>
    */
    @SerializedName("EnableSubtitle")
    @Expose
    private Boolean EnableSubtitle;

    /**
    * <p>旁白与对白文本解析，分别合成相应风格（仅适用于旁对白音色10510000、100510000），默认 false</p>
    */
    @SerializedName("VoiceoverDialogueSplit")
    @Expose
    private Boolean VoiceoverDialogueSplit;

    /**
    * <p>控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)、sajiao(撒娇)、disgusted(厌恶)、amaze(震惊)、peaceful(平静)、exciting(兴奋)、aojiao(傲娇)、jieshuo(解说)</p>
    */
    @SerializedName("EmotionCategory")
    @Expose
    private String EmotionCategory;

    /**
    * <p>控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效。</p>
    */
    @SerializedName("EmotionIntensity")
    @Expose
    private Long EmotionIntensity;

    /**
     * Get <p>合成语音的源文本，按UTF-8编码统一计算，最多支持10万字符</p> 
     * @return Text <p>合成语音的源文本，按UTF-8编码统一计算，最多支持10万字符</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>合成语音的源文本，按UTF-8编码统一计算，最多支持10万字符</p>
     * @param Text <p>合成语音的源文本，按UTF-8编码统一计算，最多支持10万字符</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>音量大小，范围[-10，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。</p> 
     * @return Volume <p>音量大小，范围[-10，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。</p>
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>音量大小，范围[-10，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。</p>
     * @param Volume <p>音量大小，范围[-10，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。</p>
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。<br>参数值与实际语速转换，可参考<a href="https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz">代码示例</a></p> 
     * @return Speed <p>语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。<br>参数值与实际语速转换，可参考<a href="https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz">代码示例</a></p>
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set <p>语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。<br>参数值与实际语速转换，可参考<a href="https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz">代码示例</a></p>
     * @param Speed <p>语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。<br>参数值与实际语速转换，可参考<a href="https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz">代码示例</a></p>
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get <p>项目id，用户自定义，默认为0。</p> 
     * @return ProjectId <p>项目id，用户自定义，默认为0。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id，用户自定义，默认为0。</p>
     * @param ProjectId <p>项目id，用户自定义，默认为0。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>模型类型，1-默认模型。</p> 
     * @return ModelType <p>模型类型，1-默认模型。</p>
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型，1-默认模型。</p>
     * @param ModelType <p>模型类型，1-默认模型。</p>
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>音色 ID，价格请参见<a href="https://cloud.tencent.com/document/product/1073/34112">购买指南</a>。完整的音色 ID 列表请参见<a href="https://cloud.tencent.com/document/product/1073/92668">音色列表</a>。</p> 
     * @return VoiceType <p>音色 ID，价格请参见<a href="https://cloud.tencent.com/document/product/1073/34112">购买指南</a>。完整的音色 ID 列表请参见<a href="https://cloud.tencent.com/document/product/1073/92668">音色列表</a>。</p>
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set <p>音色 ID，价格请参见<a href="https://cloud.tencent.com/document/product/1073/34112">购买指南</a>。完整的音色 ID 列表请参见<a href="https://cloud.tencent.com/document/product/1073/92668">音色列表</a>。</p>
     * @param VoiceType <p>音色 ID，价格请参见<a href="https://cloud.tencent.com/document/product/1073/34112">购买指南</a>。完整的音色 ID 列表请参见<a href="https://cloud.tencent.com/document/product/1073/92668">音色列表</a>。</p>
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get <p>主语言类型：<li>1-中文（默认）</li><li>2-英文</li></p> 
     * @return PrimaryLanguage <p>主语言类型：<li>1-中文（默认）</li><li>2-英文</li></p>
     */
    public Long getPrimaryLanguage() {
        return this.PrimaryLanguage;
    }

    /**
     * Set <p>主语言类型：<li>1-中文（默认）</li><li>2-英文</li></p>
     * @param PrimaryLanguage <p>主语言类型：<li>1-中文（默认）</li><li>2-英文</li></p>
     */
    public void setPrimaryLanguage(Long PrimaryLanguage) {
        this.PrimaryLanguage = PrimaryLanguage;
    }

    /**
     * Get <p>音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li></p> 
     * @return SampleRate <p>音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li></p>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li></p>
     * @param SampleRate <p>音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li></p>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>返回音频格式，可取值：mp3（默认），wav，pcm</p> 
     * @return Codec <p>返回音频格式，可取值：mp3（默认），wav，pcm</p>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>返回音频格式，可取值：mp3（默认），wav，pcm</p>
     * @param Codec <p>返回音频格式，可取值：mp3（默认），wav，pcm</p>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get <p>回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。<a href="https://cloud.tencent.com/document/product/1073/55746">回调说明</a></p> 
     * @return CallbackUrl <p>回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。<a href="https://cloud.tencent.com/document/product/1073/55746">回调说明</a></p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。<a href="https://cloud.tencent.com/document/product/1073/55746">回调说明</a></p>
     * @param CallbackUrl <p>回调 URL，用户自行搭建的用于接收识别结果的服务URL。如果用户使用轮询方式获取识别结果，则无需提交该参数。<a href="https://cloud.tencent.com/document/product/1073/55746">回调说明</a></p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>是否开启时间戳功能，默认为false。</p> 
     * @return EnableSubtitle <p>是否开启时间戳功能，默认为false。</p>
     */
    public Boolean getEnableSubtitle() {
        return this.EnableSubtitle;
    }

    /**
     * Set <p>是否开启时间戳功能，默认为false。</p>
     * @param EnableSubtitle <p>是否开启时间戳功能，默认为false。</p>
     */
    public void setEnableSubtitle(Boolean EnableSubtitle) {
        this.EnableSubtitle = EnableSubtitle;
    }

    /**
     * Get <p>旁白与对白文本解析，分别合成相应风格（仅适用于旁对白音色10510000、100510000），默认 false</p> 
     * @return VoiceoverDialogueSplit <p>旁白与对白文本解析，分别合成相应风格（仅适用于旁对白音色10510000、100510000），默认 false</p>
     */
    public Boolean getVoiceoverDialogueSplit() {
        return this.VoiceoverDialogueSplit;
    }

    /**
     * Set <p>旁白与对白文本解析，分别合成相应风格（仅适用于旁对白音色10510000、100510000），默认 false</p>
     * @param VoiceoverDialogueSplit <p>旁白与对白文本解析，分别合成相应风格（仅适用于旁对白音色10510000、100510000），默认 false</p>
     */
    public void setVoiceoverDialogueSplit(Boolean VoiceoverDialogueSplit) {
        this.VoiceoverDialogueSplit = VoiceoverDialogueSplit;
    }

    /**
     * Get <p>控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)、sajiao(撒娇)、disgusted(厌恶)、amaze(震惊)、peaceful(平静)、exciting(兴奋)、aojiao(傲娇)、jieshuo(解说)</p> 
     * @return EmotionCategory <p>控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)、sajiao(撒娇)、disgusted(厌恶)、amaze(震惊)、peaceful(平静)、exciting(兴奋)、aojiao(傲娇)、jieshuo(解说)</p>
     */
    public String getEmotionCategory() {
        return this.EmotionCategory;
    }

    /**
     * Set <p>控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)、sajiao(撒娇)、disgusted(厌恶)、amaze(震惊)、peaceful(平静)、exciting(兴奋)、aojiao(傲娇)、jieshuo(解说)</p>
     * @param EmotionCategory <p>控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)、sajiao(撒娇)、disgusted(厌恶)、amaze(震惊)、peaceful(平静)、exciting(兴奋)、aojiao(傲娇)、jieshuo(解说)</p>
     */
    public void setEmotionCategory(String EmotionCategory) {
        this.EmotionCategory = EmotionCategory;
    }

    /**
     * Get <p>控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效。</p> 
     * @return EmotionIntensity <p>控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效。</p>
     */
    public Long getEmotionIntensity() {
        return this.EmotionIntensity;
    }

    /**
     * Set <p>控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效。</p>
     * @param EmotionIntensity <p>控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效。</p>
     */
    public void setEmotionIntensity(Long EmotionIntensity) {
        this.EmotionIntensity = EmotionIntensity;
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
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ModelType != null) {
            this.ModelType = new Long(source.ModelType);
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
        if (source.EnableSubtitle != null) {
            this.EnableSubtitle = new Boolean(source.EnableSubtitle);
        }
        if (source.VoiceoverDialogueSplit != null) {
            this.VoiceoverDialogueSplit = new Boolean(source.VoiceoverDialogueSplit);
        }
        if (source.EmotionCategory != null) {
            this.EmotionCategory = new String(source.EmotionCategory);
        }
        if (source.EmotionIntensity != null) {
            this.EmotionIntensity = new Long(source.EmotionIntensity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "PrimaryLanguage", this.PrimaryLanguage);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "EnableSubtitle", this.EnableSubtitle);
        this.setParamSimple(map, prefix + "VoiceoverDialogueSplit", this.VoiceoverDialogueSplit);
        this.setParamSimple(map, prefix + "EmotionCategory", this.EmotionCategory);
        this.setParamSimple(map, prefix + "EmotionIntensity", this.EmotionIntensity);

    }
}

