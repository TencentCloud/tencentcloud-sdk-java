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

public class TextToVoiceRequest extends AbstractModel{

    /**
    * 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * 语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后 2 位，例如0.5 1.1 1.8等。<br>参数值与实际语速转换，可参考[代码示例](https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz)
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
    * 模型类型，1-默认模型。
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * 音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见[购买指南](https://cloud.tencent.com/document/product/1073/34112)。完整的音色 ID 列表请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)。
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * 主语言类型：<li>1-中文（默认）</li><li>2-英文</li><li>3-日文</li>
    */
    @SerializedName("PrimaryLanguage")
    @Expose
    private Long PrimaryLanguage;

    /**
    * 音频采样率：
<li>24000：24k（部分音色支持，请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)）</li>
<li>16000：16k（默认）</li>
<li>8000：8k</li>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 返回音频格式，可取值：wav（默认），mp3，pcm
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 是否开启时间戳功能，默认为false。
    */
    @SerializedName("EnableSubtitle")
    @Expose
    private Boolean EnableSubtitle;

    /**
    * 断句敏感阈值，默认值为：0，取值范围：[0,1,2]。该值越大越不容易断句，模型会更倾向于仅按照标点符号断句。此参数建议不要随意调整，可能会影响合成效果。
    */
    @SerializedName("SegmentRate")
    @Expose
    private Long SegmentRate;

    /**
    * 控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)、撒娇(sajiao)、厌恶(disgusted)、震惊(amaze)、平静(peaceful)、兴奋(exciting)、傲娇(aojiao)、解说(jieshuo)
    */
    @SerializedName("EmotionCategory")
    @Expose
    private String EmotionCategory;

    /**
    * 控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效；
    */
    @SerializedName("EmotionIntensity")
    @Expose
    private Long EmotionIntensity;

    /**
     * Get 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。 
     * @return Text 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
     * @param Text 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。 
     * @return SessionId 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
     * @param SessionId 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。 
     * @return Volume 音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set 音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
     * @param Volume 音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后 2 位，例如0.5 1.1 1.8等。<br>参数值与实际语速转换，可参考[代码示例](https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz) 
     * @return Speed 语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后 2 位，例如0.5 1.1 1.8等。<br>参数值与实际语速转换，可参考[代码示例](https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz)
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set 语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后 2 位，例如0.5 1.1 1.8等。<br>参数值与实际语速转换，可参考[代码示例](https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz)
     * @param Speed 语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后 2 位，例如0.5 1.1 1.8等。<br>参数值与实际语速转换，可参考[代码示例](https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz)
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
     * Get 音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见[购买指南](https://cloud.tencent.com/document/product/1073/34112)。完整的音色 ID 列表请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)。 
     * @return VoiceType 音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见[购买指南](https://cloud.tencent.com/document/product/1073/34112)。完整的音色 ID 列表请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)。
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见[购买指南](https://cloud.tencent.com/document/product/1073/34112)。完整的音色 ID 列表请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)。
     * @param VoiceType 音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见[购买指南](https://cloud.tencent.com/document/product/1073/34112)。完整的音色 ID 列表请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)。
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 主语言类型：<li>1-中文（默认）</li><li>2-英文</li><li>3-日文</li> 
     * @return PrimaryLanguage 主语言类型：<li>1-中文（默认）</li><li>2-英文</li><li>3-日文</li>
     */
    public Long getPrimaryLanguage() {
        return this.PrimaryLanguage;
    }

    /**
     * Set 主语言类型：<li>1-中文（默认）</li><li>2-英文</li><li>3-日文</li>
     * @param PrimaryLanguage 主语言类型：<li>1-中文（默认）</li><li>2-英文</li><li>3-日文</li>
     */
    public void setPrimaryLanguage(Long PrimaryLanguage) {
        this.PrimaryLanguage = PrimaryLanguage;
    }

    /**
     * Get 音频采样率：
<li>24000：24k（部分音色支持，请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)）</li>
<li>16000：16k（默认）</li>
<li>8000：8k</li> 
     * @return SampleRate 音频采样率：
<li>24000：24k（部分音色支持，请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)）</li>
<li>16000：16k（默认）</li>
<li>8000：8k</li>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频采样率：
<li>24000：24k（部分音色支持，请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)）</li>
<li>16000：16k（默认）</li>
<li>8000：8k</li>
     * @param SampleRate 音频采样率：
<li>24000：24k（部分音色支持，请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)）</li>
<li>16000：16k（默认）</li>
<li>8000：8k</li>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 返回音频格式，可取值：wav（默认），mp3，pcm 
     * @return Codec 返回音频格式，可取值：wav（默认），mp3，pcm
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 返回音频格式，可取值：wav（默认），mp3，pcm
     * @param Codec 返回音频格式，可取值：wav（默认），mp3，pcm
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 是否开启时间戳功能，默认为false。 
     * @return EnableSubtitle 是否开启时间戳功能，默认为false。
     */
    public Boolean getEnableSubtitle() {
        return this.EnableSubtitle;
    }

    /**
     * Set 是否开启时间戳功能，默认为false。
     * @param EnableSubtitle 是否开启时间戳功能，默认为false。
     */
    public void setEnableSubtitle(Boolean EnableSubtitle) {
        this.EnableSubtitle = EnableSubtitle;
    }

    /**
     * Get 断句敏感阈值，默认值为：0，取值范围：[0,1,2]。该值越大越不容易断句，模型会更倾向于仅按照标点符号断句。此参数建议不要随意调整，可能会影响合成效果。 
     * @return SegmentRate 断句敏感阈值，默认值为：0，取值范围：[0,1,2]。该值越大越不容易断句，模型会更倾向于仅按照标点符号断句。此参数建议不要随意调整，可能会影响合成效果。
     */
    public Long getSegmentRate() {
        return this.SegmentRate;
    }

    /**
     * Set 断句敏感阈值，默认值为：0，取值范围：[0,1,2]。该值越大越不容易断句，模型会更倾向于仅按照标点符号断句。此参数建议不要随意调整，可能会影响合成效果。
     * @param SegmentRate 断句敏感阈值，默认值为：0，取值范围：[0,1,2]。该值越大越不容易断句，模型会更倾向于仅按照标点符号断句。此参数建议不要随意调整，可能会影响合成效果。
     */
    public void setSegmentRate(Long SegmentRate) {
        this.SegmentRate = SegmentRate;
    }

    /**
     * Get 控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)、撒娇(sajiao)、厌恶(disgusted)、震惊(amaze)、平静(peaceful)、兴奋(exciting)、傲娇(aojiao)、解说(jieshuo) 
     * @return EmotionCategory 控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)、撒娇(sajiao)、厌恶(disgusted)、震惊(amaze)、平静(peaceful)、兴奋(exciting)、傲娇(aojiao)、解说(jieshuo)
     */
    public String getEmotionCategory() {
        return this.EmotionCategory;
    }

    /**
     * Set 控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)、撒娇(sajiao)、厌恶(disgusted)、震惊(amaze)、平静(peaceful)、兴奋(exciting)、傲娇(aojiao)、解说(jieshuo)
     * @param EmotionCategory 控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)、撒娇(sajiao)、厌恶(disgusted)、震惊(amaze)、平静(peaceful)、兴奋(exciting)、傲娇(aojiao)、解说(jieshuo)
     */
    public void setEmotionCategory(String EmotionCategory) {
        this.EmotionCategory = EmotionCategory;
    }

    /**
     * Get 控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效； 
     * @return EmotionIntensity 控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效；
     */
    public Long getEmotionIntensity() {
        return this.EmotionIntensity;
    }

    /**
     * Set 控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效；
     * @param EmotionIntensity 控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效；
     */
    public void setEmotionIntensity(Long EmotionIntensity) {
        this.EmotionIntensity = EmotionIntensity;
    }

    public TextToVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToVoiceRequest(TextToVoiceRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
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
        if (source.EnableSubtitle != null) {
            this.EnableSubtitle = new Boolean(source.EnableSubtitle);
        }
        if (source.SegmentRate != null) {
            this.SegmentRate = new Long(source.SegmentRate);
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
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "PrimaryLanguage", this.PrimaryLanguage);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "EnableSubtitle", this.EnableSubtitle);
        this.setParamSimple(map, prefix + "SegmentRate", this.SegmentRate);
        this.setParamSimple(map, prefix + "EmotionCategory", this.EmotionCategory);
        this.setParamSimple(map, prefix + "EmotionIntensity", this.EmotionIntensity);

    }
}

