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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitImageToVideoViduJobRequest extends AbstractModel {

    /**
    * <p>上传单张图时【首帧生视频】：</p><p>模型将以此参数中传入的图片为首帧画面来生成视频。<br>注1：支持传入图片 Base64 编码或图片URL（确保可访问）；<br>注2：支持上传1 张图；<br>注3：图片支持 png、jpeg、jpg、webp格式；<br>注4：图片比例需要小于 1:4 或者 4:1 ；<br>注5：图片大小不超过50M。</p><p>上传两张图时【首尾帧生视频】：<br>上传的第一张图片视作首帧图，第二张图片视作尾帧图，模型将以此参数中传入的图片来生成视频<br>注1: 首尾帧两张输入图的分辨率需相近，首帧图的分辨率/尾帧图的分辨率要在0.8～1.25之间。且图片比例需要小于1:4或者4:1；<br>注2: 支持传入图片 Base64 编码或图片URL（确保可访问）；<br>注3: 图片支持 png、jpeg、jpg、webp格式；<br>注4: 图片大小不超过50M；</p>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * <p>模型名称，可选值，默认值viduq2-turbo</p><ul><li>viduq2-pro：新模型，效果好，细节丰富</li><li>viduq2-turbo：新模型，效果好，生成快</li><li>viduq3-turbo：对比viduq3-pro，生成速度更快</li><li>viduq3-pro：高效生成优质音视频内容，让视频内容更生动、更形象、更立体，效果更好</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>文本提示词<br>生成视频的文本描述。<br>注1：字符长度不能超过 2000 个字符<br>注2：若使用is_rec推荐提示词参数，模型将不考虑此参数所输入的提示词</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>是否使用推荐提示词，默认关闭<br>-true：是，由系统自动推荐提示词，并使用提示词内容生成视频，推荐提示词数量=1<br>-false：否，根据输入的prompt生成视频<br>注意：启用推荐提示词后，每个任务多消耗1积分</p>
    */
    @SerializedName("IsRec")
    @Expose
    private Boolean IsRec;

    /**
    * <p>【首帧生视频】</p><p>是否使用音视频直出能力，默认关闭，枚举值为：</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音视频直出，输出带台词以及背景音的视频<br>注1：该参数为true时，voice_id参数才生效<br>注2：该参数为true时，仅q3模型支持错峰<br>注3：当model 为q3-pro或q3-turbo 时，该参数默认值为true</li></ul><p>【首尾帧生视频】</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音画同步，输出声音的视频（包括台词和音效）<br>注1：仅q3系列模型支持该参数</li></ul>
    */
    @SerializedName("Audio")
    @Expose
    private Boolean Audio;

    /**
    * <p>音色id<br>用来决定视频中的声音音色，为空时系统会自动推荐，可选枚举值参考列表：新音色列表<br>暂不支持声音复刻功能</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>视频时长参数：<br>【首帧生视频】：<br>viduq3-pro、viduq3-turboxa0默认为 5，可选：1 - 16<br>viduq2-pro、viduq2-turboxa0默认为 5，可选：1 - 10</p><p>【首尾帧生视频】：<br>viduq3-proxa0、viduq3-turbo默认为 5，可选：1 - 16<br>viduq2-pro、viduq2-turboxa0默认为 5，可选：1 - 8</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>分辨率参数<br>【首帧生视频】：</p><ul><li>viduq3-pro 、viduq3-turbo 1-16秒：默认 720p，可选：540p、720p、1080p</li><li>viduq2-pro、viduq2-turbo 1-10秒：默认 720p，可选：720p、1080p<br>示例值：720p</li></ul><p>【首尾帧生视频】：<br>-xa0viduq3-proxa0、viduq3-turbo1-16秒：默认 720p，可选：540p、720p、1080p<br>-xa0viduq2-proxa0、xa0viduq2-turbo1-8秒：默认 720p，可选：540p、720p、1080p</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>运动幅度<br>默认 auto，可选值：auto、small、medium、large<br>注：q2、q3系列模型改参数不生效</p>
    */
    @SerializedName("MovementAmplitude")
    @Expose
    private String MovementAmplitude;

    /**
    * <p>bgm</p>
    */
    @SerializedName("Bgm")
    @Expose
    private Boolean Bgm;

    /**
    * <p>音频类型，audio为true时必填，默认为all<br>注：该参数目前仅支持q2、q1、2.0系列模型的音频拆分</p><p>枚举值：</p><ul><li>all： 音效+人声</li><li>speech_only： 仅人声</li><li>sound_effect_only： 仅音效</li></ul>
    */
    @SerializedName("AudioType")
    @Expose
    private String AudioType;

    /**
    * <p>元数据标识，json格式字符串，透传字段，您可以 自定义格式 或使用 示例格式 ，示例如下：<br>{<br>&quot;Label&quot;: &quot;your_label&quot;,<br>&quot;ContentProducer&quot;: &quot;your_content_producer&quot;,<br>&quot;ContentPropagator&quot;: &quot;your_content_propagator&quot;,<br>&quot;ProduceID&quot;: &quot;your_product_id&quot;,<br>&quot;PropagateID&quot;: &quot;your_propagate_id&quot;,<br>&quot;ReservedCode1&quot;: &quot;your_reserved_code1&quot;,<br>&quot;ReservedCode2&quot;: &quot;your_reserved_code2&quot;<br>}<br>该参数为空时，默认使用vidu生成的元数据标识</p>
    */
    @SerializedName("MetaData")
    @Expose
    private String MetaData;

    /**
    * <p>Callback 协议<br>需要您在创建任务时主动设置 callback_url，请求方法为 POST，当视频生成完成时，将向此地址发送包含任务最新状态的回调请求。回调请求内容结构与查询任务API的返回体一致<br>回调返回的&quot;status&quot;包括以下状态：</p><ul><li>success 任务完成（如发送失败，回调三次）</li><li>failed 任务失败（如发送失败，回调三次）</li></ul>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>透传参数<br>不做任何处理，仅数据传输<br>注：最多 1048576个字符</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>错峰模式，默认为：false，可选值：</p><ul><li>true：错峰生成视频；</li><li>false：即时生成视频；<br>注1：错峰模式消耗的积分更低<br>注2：错峰模式下提交的任务，会在48小时内生成，未能完成的任务会被自动取消，并返还该任务的积分</li></ul>
    */
    @SerializedName("OffPeak")
    @Expose
    private Boolean OffPeak;

    /**
    * <p>为生成结果图添加显式水印标识的开关，默认为1。<br>1：添加。<br>0：不添加。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。<br>示例值：1</p>
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * <p>标识内容设置。<br>默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
     * Get <p>上传单张图时【首帧生视频】：</p><p>模型将以此参数中传入的图片为首帧画面来生成视频。<br>注1：支持传入图片 Base64 编码或图片URL（确保可访问）；<br>注2：支持上传1 张图；<br>注3：图片支持 png、jpeg、jpg、webp格式；<br>注4：图片比例需要小于 1:4 或者 4:1 ；<br>注5：图片大小不超过50M。</p><p>上传两张图时【首尾帧生视频】：<br>上传的第一张图片视作首帧图，第二张图片视作尾帧图，模型将以此参数中传入的图片来生成视频<br>注1: 首尾帧两张输入图的分辨率需相近，首帧图的分辨率/尾帧图的分辨率要在0.8～1.25之间。且图片比例需要小于1:4或者4:1；<br>注2: 支持传入图片 Base64 编码或图片URL（确保可访问）；<br>注3: 图片支持 png、jpeg、jpg、webp格式；<br>注4: 图片大小不超过50M；</p> 
     * @return Images <p>上传单张图时【首帧生视频】：</p><p>模型将以此参数中传入的图片为首帧画面来生成视频。<br>注1：支持传入图片 Base64 编码或图片URL（确保可访问）；<br>注2：支持上传1 张图；<br>注3：图片支持 png、jpeg、jpg、webp格式；<br>注4：图片比例需要小于 1:4 或者 4:1 ；<br>注5：图片大小不超过50M。</p><p>上传两张图时【首尾帧生视频】：<br>上传的第一张图片视作首帧图，第二张图片视作尾帧图，模型将以此参数中传入的图片来生成视频<br>注1: 首尾帧两张输入图的分辨率需相近，首帧图的分辨率/尾帧图的分辨率要在0.8～1.25之间。且图片比例需要小于1:4或者4:1；<br>注2: 支持传入图片 Base64 编码或图片URL（确保可访问）；<br>注3: 图片支持 png、jpeg、jpg、webp格式；<br>注4: 图片大小不超过50M；</p>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>上传单张图时【首帧生视频】：</p><p>模型将以此参数中传入的图片为首帧画面来生成视频。<br>注1：支持传入图片 Base64 编码或图片URL（确保可访问）；<br>注2：支持上传1 张图；<br>注3：图片支持 png、jpeg、jpg、webp格式；<br>注4：图片比例需要小于 1:4 或者 4:1 ；<br>注5：图片大小不超过50M。</p><p>上传两张图时【首尾帧生视频】：<br>上传的第一张图片视作首帧图，第二张图片视作尾帧图，模型将以此参数中传入的图片来生成视频<br>注1: 首尾帧两张输入图的分辨率需相近，首帧图的分辨率/尾帧图的分辨率要在0.8～1.25之间。且图片比例需要小于1:4或者4:1；<br>注2: 支持传入图片 Base64 编码或图片URL（确保可访问）；<br>注3: 图片支持 png、jpeg、jpg、webp格式；<br>注4: 图片大小不超过50M；</p>
     * @param Images <p>上传单张图时【首帧生视频】：</p><p>模型将以此参数中传入的图片为首帧画面来生成视频。<br>注1：支持传入图片 Base64 编码或图片URL（确保可访问）；<br>注2：支持上传1 张图；<br>注3：图片支持 png、jpeg、jpg、webp格式；<br>注4：图片比例需要小于 1:4 或者 4:1 ；<br>注5：图片大小不超过50M。</p><p>上传两张图时【首尾帧生视频】：<br>上传的第一张图片视作首帧图，第二张图片视作尾帧图，模型将以此参数中传入的图片来生成视频<br>注1: 首尾帧两张输入图的分辨率需相近，首帧图的分辨率/尾帧图的分辨率要在0.8～1.25之间。且图片比例需要小于1:4或者4:1；<br>注2: 支持传入图片 Base64 编码或图片URL（确保可访问）；<br>注3: 图片支持 png、jpeg、jpg、webp格式；<br>注4: 图片大小不超过50M；</p>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>模型名称，可选值，默认值viduq2-turbo</p><ul><li>viduq2-pro：新模型，效果好，细节丰富</li><li>viduq2-turbo：新模型，效果好，生成快</li><li>viduq3-turbo：对比viduq3-pro，生成速度更快</li><li>viduq3-pro：高效生成优质音视频内容，让视频内容更生动、更形象、更立体，效果更好</li></ul> 
     * @return Model <p>模型名称，可选值，默认值viduq2-turbo</p><ul><li>viduq2-pro：新模型，效果好，细节丰富</li><li>viduq2-turbo：新模型，效果好，生成快</li><li>viduq3-turbo：对比viduq3-pro，生成速度更快</li><li>viduq3-pro：高效生成优质音视频内容，让视频内容更生动、更形象、更立体，效果更好</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称，可选值，默认值viduq2-turbo</p><ul><li>viduq2-pro：新模型，效果好，细节丰富</li><li>viduq2-turbo：新模型，效果好，生成快</li><li>viduq3-turbo：对比viduq3-pro，生成速度更快</li><li>viduq3-pro：高效生成优质音视频内容，让视频内容更生动、更形象、更立体，效果更好</li></ul>
     * @param Model <p>模型名称，可选值，默认值viduq2-turbo</p><ul><li>viduq2-pro：新模型，效果好，细节丰富</li><li>viduq2-turbo：新模型，效果好，生成快</li><li>viduq3-turbo：对比viduq3-pro，生成速度更快</li><li>viduq3-pro：高效生成优质音视频内容，让视频内容更生动、更形象、更立体，效果更好</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>文本提示词<br>生成视频的文本描述。<br>注1：字符长度不能超过 2000 个字符<br>注2：若使用is_rec推荐提示词参数，模型将不考虑此参数所输入的提示词</p> 
     * @return Prompt <p>文本提示词<br>生成视频的文本描述。<br>注1：字符长度不能超过 2000 个字符<br>注2：若使用is_rec推荐提示词参数，模型将不考虑此参数所输入的提示词</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>文本提示词<br>生成视频的文本描述。<br>注1：字符长度不能超过 2000 个字符<br>注2：若使用is_rec推荐提示词参数，模型将不考虑此参数所输入的提示词</p>
     * @param Prompt <p>文本提示词<br>生成视频的文本描述。<br>注1：字符长度不能超过 2000 个字符<br>注2：若使用is_rec推荐提示词参数，模型将不考虑此参数所输入的提示词</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>是否使用推荐提示词，默认关闭<br>-true：是，由系统自动推荐提示词，并使用提示词内容生成视频，推荐提示词数量=1<br>-false：否，根据输入的prompt生成视频<br>注意：启用推荐提示词后，每个任务多消耗1积分</p> 
     * @return IsRec <p>是否使用推荐提示词，默认关闭<br>-true：是，由系统自动推荐提示词，并使用提示词内容生成视频，推荐提示词数量=1<br>-false：否，根据输入的prompt生成视频<br>注意：启用推荐提示词后，每个任务多消耗1积分</p>
     */
    public Boolean getIsRec() {
        return this.IsRec;
    }

    /**
     * Set <p>是否使用推荐提示词，默认关闭<br>-true：是，由系统自动推荐提示词，并使用提示词内容生成视频，推荐提示词数量=1<br>-false：否，根据输入的prompt生成视频<br>注意：启用推荐提示词后，每个任务多消耗1积分</p>
     * @param IsRec <p>是否使用推荐提示词，默认关闭<br>-true：是，由系统自动推荐提示词，并使用提示词内容生成视频，推荐提示词数量=1<br>-false：否，根据输入的prompt生成视频<br>注意：启用推荐提示词后，每个任务多消耗1积分</p>
     */
    public void setIsRec(Boolean IsRec) {
        this.IsRec = IsRec;
    }

    /**
     * Get <p>【首帧生视频】</p><p>是否使用音视频直出能力，默认关闭，枚举值为：</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音视频直出，输出带台词以及背景音的视频<br>注1：该参数为true时，voice_id参数才生效<br>注2：该参数为true时，仅q3模型支持错峰<br>注3：当model 为q3-pro或q3-turbo 时，该参数默认值为true</li></ul><p>【首尾帧生视频】</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音画同步，输出声音的视频（包括台词和音效）<br>注1：仅q3系列模型支持该参数</li></ul> 
     * @return Audio <p>【首帧生视频】</p><p>是否使用音视频直出能力，默认关闭，枚举值为：</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音视频直出，输出带台词以及背景音的视频<br>注1：该参数为true时，voice_id参数才生效<br>注2：该参数为true时，仅q3模型支持错峰<br>注3：当model 为q3-pro或q3-turbo 时，该参数默认值为true</li></ul><p>【首尾帧生视频】</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音画同步，输出声音的视频（包括台词和音效）<br>注1：仅q3系列模型支持该参数</li></ul>
     */
    public Boolean getAudio() {
        return this.Audio;
    }

    /**
     * Set <p>【首帧生视频】</p><p>是否使用音视频直出能力，默认关闭，枚举值为：</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音视频直出，输出带台词以及背景音的视频<br>注1：该参数为true时，voice_id参数才生效<br>注2：该参数为true时，仅q3模型支持错峰<br>注3：当model 为q3-pro或q3-turbo 时，该参数默认值为true</li></ul><p>【首尾帧生视频】</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音画同步，输出声音的视频（包括台词和音效）<br>注1：仅q3系列模型支持该参数</li></ul>
     * @param Audio <p>【首帧生视频】</p><p>是否使用音视频直出能力，默认关闭，枚举值为：</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音视频直出，输出带台词以及背景音的视频<br>注1：该参数为true时，voice_id参数才生效<br>注2：该参数为true时，仅q3模型支持错峰<br>注3：当model 为q3-pro或q3-turbo 时，该参数默认值为true</li></ul><p>【首尾帧生视频】</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音画同步，输出声音的视频（包括台词和音效）<br>注1：仅q3系列模型支持该参数</li></ul>
     */
    public void setAudio(Boolean Audio) {
        this.Audio = Audio;
    }

    /**
     * Get <p>音色id<br>用来决定视频中的声音音色，为空时系统会自动推荐，可选枚举值参考列表：新音色列表<br>暂不支持声音复刻功能</p> 
     * @return VoiceId <p>音色id<br>用来决定视频中的声音音色，为空时系统会自动推荐，可选枚举值参考列表：新音色列表<br>暂不支持声音复刻功能</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色id<br>用来决定视频中的声音音色，为空时系统会自动推荐，可选枚举值参考列表：新音色列表<br>暂不支持声音复刻功能</p>
     * @param VoiceId <p>音色id<br>用来决定视频中的声音音色，为空时系统会自动推荐，可选枚举值参考列表：新音色列表<br>暂不支持声音复刻功能</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>视频时长参数：<br>【首帧生视频】：<br>viduq3-pro、viduq3-turboxa0默认为 5，可选：1 - 16<br>viduq2-pro、viduq2-turboxa0默认为 5，可选：1 - 10</p><p>【首尾帧生视频】：<br>viduq3-proxa0、viduq3-turbo默认为 5，可选：1 - 16<br>viduq2-pro、viduq2-turboxa0默认为 5，可选：1 - 8</p> 
     * @return Duration <p>视频时长参数：<br>【首帧生视频】：<br>viduq3-pro、viduq3-turboxa0默认为 5，可选：1 - 16<br>viduq2-pro、viduq2-turboxa0默认为 5，可选：1 - 10</p><p>【首尾帧生视频】：<br>viduq3-proxa0、viduq3-turbo默认为 5，可选：1 - 16<br>viduq2-pro、viduq2-turboxa0默认为 5，可选：1 - 8</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>视频时长参数：<br>【首帧生视频】：<br>viduq3-pro、viduq3-turboxa0默认为 5，可选：1 - 16<br>viduq2-pro、viduq2-turboxa0默认为 5，可选：1 - 10</p><p>【首尾帧生视频】：<br>viduq3-proxa0、viduq3-turbo默认为 5，可选：1 - 16<br>viduq2-pro、viduq2-turboxa0默认为 5，可选：1 - 8</p>
     * @param Duration <p>视频时长参数：<br>【首帧生视频】：<br>viduq3-pro、viduq3-turboxa0默认为 5，可选：1 - 16<br>viduq2-pro、viduq2-turboxa0默认为 5，可选：1 - 10</p><p>【首尾帧生视频】：<br>viduq3-proxa0、viduq3-turbo默认为 5，可选：1 - 16<br>viduq2-pro、viduq2-turboxa0默认为 5，可选：1 - 8</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>分辨率参数<br>【首帧生视频】：</p><ul><li>viduq3-pro 、viduq3-turbo 1-16秒：默认 720p，可选：540p、720p、1080p</li><li>viduq2-pro、viduq2-turbo 1-10秒：默认 720p，可选：720p、1080p<br>示例值：720p</li></ul><p>【首尾帧生视频】：<br>-xa0viduq3-proxa0、viduq3-turbo1-16秒：默认 720p，可选：540p、720p、1080p<br>-xa0viduq2-proxa0、xa0viduq2-turbo1-8秒：默认 720p，可选：540p、720p、1080p</p> 
     * @return Resolution <p>分辨率参数<br>【首帧生视频】：</p><ul><li>viduq3-pro 、viduq3-turbo 1-16秒：默认 720p，可选：540p、720p、1080p</li><li>viduq2-pro、viduq2-turbo 1-10秒：默认 720p，可选：720p、1080p<br>示例值：720p</li></ul><p>【首尾帧生视频】：<br>-xa0viduq3-proxa0、viduq3-turbo1-16秒：默认 720p，可选：540p、720p、1080p<br>-xa0viduq2-proxa0、xa0viduq2-turbo1-8秒：默认 720p，可选：540p、720p、1080p</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>分辨率参数<br>【首帧生视频】：</p><ul><li>viduq3-pro 、viduq3-turbo 1-16秒：默认 720p，可选：540p、720p、1080p</li><li>viduq2-pro、viduq2-turbo 1-10秒：默认 720p，可选：720p、1080p<br>示例值：720p</li></ul><p>【首尾帧生视频】：<br>-xa0viduq3-proxa0、viduq3-turbo1-16秒：默认 720p，可选：540p、720p、1080p<br>-xa0viduq2-proxa0、xa0viduq2-turbo1-8秒：默认 720p，可选：540p、720p、1080p</p>
     * @param Resolution <p>分辨率参数<br>【首帧生视频】：</p><ul><li>viduq3-pro 、viduq3-turbo 1-16秒：默认 720p，可选：540p、720p、1080p</li><li>viduq2-pro、viduq2-turbo 1-10秒：默认 720p，可选：720p、1080p<br>示例值：720p</li></ul><p>【首尾帧生视频】：<br>-xa0viduq3-proxa0、viduq3-turbo1-16秒：默认 720p，可选：540p、720p、1080p<br>-xa0viduq2-proxa0、xa0viduq2-turbo1-8秒：默认 720p，可选：540p、720p、1080p</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>运动幅度<br>默认 auto，可选值：auto、small、medium、large<br>注：q2、q3系列模型改参数不生效</p> 
     * @return MovementAmplitude <p>运动幅度<br>默认 auto，可选值：auto、small、medium、large<br>注：q2、q3系列模型改参数不生效</p>
     */
    public String getMovementAmplitude() {
        return this.MovementAmplitude;
    }

    /**
     * Set <p>运动幅度<br>默认 auto，可选值：auto、small、medium、large<br>注：q2、q3系列模型改参数不生效</p>
     * @param MovementAmplitude <p>运动幅度<br>默认 auto，可选值：auto、small、medium、large<br>注：q2、q3系列模型改参数不生效</p>
     */
    public void setMovementAmplitude(String MovementAmplitude) {
        this.MovementAmplitude = MovementAmplitude;
    }

    /**
     * Get <p>bgm</p> 
     * @return Bgm <p>bgm</p>
     */
    public Boolean getBgm() {
        return this.Bgm;
    }

    /**
     * Set <p>bgm</p>
     * @param Bgm <p>bgm</p>
     */
    public void setBgm(Boolean Bgm) {
        this.Bgm = Bgm;
    }

    /**
     * Get <p>音频类型，audio为true时必填，默认为all<br>注：该参数目前仅支持q2、q1、2.0系列模型的音频拆分</p><p>枚举值：</p><ul><li>all： 音效+人声</li><li>speech_only： 仅人声</li><li>sound_effect_only： 仅音效</li></ul> 
     * @return AudioType <p>音频类型，audio为true时必填，默认为all<br>注：该参数目前仅支持q2、q1、2.0系列模型的音频拆分</p><p>枚举值：</p><ul><li>all： 音效+人声</li><li>speech_only： 仅人声</li><li>sound_effect_only： 仅音效</li></ul>
     */
    public String getAudioType() {
        return this.AudioType;
    }

    /**
     * Set <p>音频类型，audio为true时必填，默认为all<br>注：该参数目前仅支持q2、q1、2.0系列模型的音频拆分</p><p>枚举值：</p><ul><li>all： 音效+人声</li><li>speech_only： 仅人声</li><li>sound_effect_only： 仅音效</li></ul>
     * @param AudioType <p>音频类型，audio为true时必填，默认为all<br>注：该参数目前仅支持q2、q1、2.0系列模型的音频拆分</p><p>枚举值：</p><ul><li>all： 音效+人声</li><li>speech_only： 仅人声</li><li>sound_effect_only： 仅音效</li></ul>
     */
    public void setAudioType(String AudioType) {
        this.AudioType = AudioType;
    }

    /**
     * Get <p>元数据标识，json格式字符串，透传字段，您可以 自定义格式 或使用 示例格式 ，示例如下：<br>{<br>&quot;Label&quot;: &quot;your_label&quot;,<br>&quot;ContentProducer&quot;: &quot;your_content_producer&quot;,<br>&quot;ContentPropagator&quot;: &quot;your_content_propagator&quot;,<br>&quot;ProduceID&quot;: &quot;your_product_id&quot;,<br>&quot;PropagateID&quot;: &quot;your_propagate_id&quot;,<br>&quot;ReservedCode1&quot;: &quot;your_reserved_code1&quot;,<br>&quot;ReservedCode2&quot;: &quot;your_reserved_code2&quot;<br>}<br>该参数为空时，默认使用vidu生成的元数据标识</p> 
     * @return MetaData <p>元数据标识，json格式字符串，透传字段，您可以 自定义格式 或使用 示例格式 ，示例如下：<br>{<br>&quot;Label&quot;: &quot;your_label&quot;,<br>&quot;ContentProducer&quot;: &quot;your_content_producer&quot;,<br>&quot;ContentPropagator&quot;: &quot;your_content_propagator&quot;,<br>&quot;ProduceID&quot;: &quot;your_product_id&quot;,<br>&quot;PropagateID&quot;: &quot;your_propagate_id&quot;,<br>&quot;ReservedCode1&quot;: &quot;your_reserved_code1&quot;,<br>&quot;ReservedCode2&quot;: &quot;your_reserved_code2&quot;<br>}<br>该参数为空时，默认使用vidu生成的元数据标识</p>
     */
    public String getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>元数据标识，json格式字符串，透传字段，您可以 自定义格式 或使用 示例格式 ，示例如下：<br>{<br>&quot;Label&quot;: &quot;your_label&quot;,<br>&quot;ContentProducer&quot;: &quot;your_content_producer&quot;,<br>&quot;ContentPropagator&quot;: &quot;your_content_propagator&quot;,<br>&quot;ProduceID&quot;: &quot;your_product_id&quot;,<br>&quot;PropagateID&quot;: &quot;your_propagate_id&quot;,<br>&quot;ReservedCode1&quot;: &quot;your_reserved_code1&quot;,<br>&quot;ReservedCode2&quot;: &quot;your_reserved_code2&quot;<br>}<br>该参数为空时，默认使用vidu生成的元数据标识</p>
     * @param MetaData <p>元数据标识，json格式字符串，透传字段，您可以 自定义格式 或使用 示例格式 ，示例如下：<br>{<br>&quot;Label&quot;: &quot;your_label&quot;,<br>&quot;ContentProducer&quot;: &quot;your_content_producer&quot;,<br>&quot;ContentPropagator&quot;: &quot;your_content_propagator&quot;,<br>&quot;ProduceID&quot;: &quot;your_product_id&quot;,<br>&quot;PropagateID&quot;: &quot;your_propagate_id&quot;,<br>&quot;ReservedCode1&quot;: &quot;your_reserved_code1&quot;,<br>&quot;ReservedCode2&quot;: &quot;your_reserved_code2&quot;<br>}<br>该参数为空时，默认使用vidu生成的元数据标识</p>
     */
    public void setMetaData(String MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get <p>Callback 协议<br>需要您在创建任务时主动设置 callback_url，请求方法为 POST，当视频生成完成时，将向此地址发送包含任务最新状态的回调请求。回调请求内容结构与查询任务API的返回体一致<br>回调返回的&quot;status&quot;包括以下状态：</p><ul><li>success 任务完成（如发送失败，回调三次）</li><li>failed 任务失败（如发送失败，回调三次）</li></ul> 
     * @return CallbackUrl <p>Callback 协议<br>需要您在创建任务时主动设置 callback_url，请求方法为 POST，当视频生成完成时，将向此地址发送包含任务最新状态的回调请求。回调请求内容结构与查询任务API的返回体一致<br>回调返回的&quot;status&quot;包括以下状态：</p><ul><li>success 任务完成（如发送失败，回调三次）</li><li>failed 任务失败（如发送失败，回调三次）</li></ul>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>Callback 协议<br>需要您在创建任务时主动设置 callback_url，请求方法为 POST，当视频生成完成时，将向此地址发送包含任务最新状态的回调请求。回调请求内容结构与查询任务API的返回体一致<br>回调返回的&quot;status&quot;包括以下状态：</p><ul><li>success 任务完成（如发送失败，回调三次）</li><li>failed 任务失败（如发送失败，回调三次）</li></ul>
     * @param CallbackUrl <p>Callback 协议<br>需要您在创建任务时主动设置 callback_url，请求方法为 POST，当视频生成完成时，将向此地址发送包含任务最新状态的回调请求。回调请求内容结构与查询任务API的返回体一致<br>回调返回的&quot;status&quot;包括以下状态：</p><ul><li>success 任务完成（如发送失败，回调三次）</li><li>failed 任务失败（如发送失败，回调三次）</li></ul>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>透传参数<br>不做任何处理，仅数据传输<br>注：最多 1048576个字符</p> 
     * @return Payload <p>透传参数<br>不做任何处理，仅数据传输<br>注：最多 1048576个字符</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>透传参数<br>不做任何处理，仅数据传输<br>注：最多 1048576个字符</p>
     * @param Payload <p>透传参数<br>不做任何处理，仅数据传输<br>注：最多 1048576个字符</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>错峰模式，默认为：false，可选值：</p><ul><li>true：错峰生成视频；</li><li>false：即时生成视频；<br>注1：错峰模式消耗的积分更低<br>注2：错峰模式下提交的任务，会在48小时内生成，未能完成的任务会被自动取消，并返还该任务的积分</li></ul> 
     * @return OffPeak <p>错峰模式，默认为：false，可选值：</p><ul><li>true：错峰生成视频；</li><li>false：即时生成视频；<br>注1：错峰模式消耗的积分更低<br>注2：错峰模式下提交的任务，会在48小时内生成，未能完成的任务会被自动取消，并返还该任务的积分</li></ul>
     */
    public Boolean getOffPeak() {
        return this.OffPeak;
    }

    /**
     * Set <p>错峰模式，默认为：false，可选值：</p><ul><li>true：错峰生成视频；</li><li>false：即时生成视频；<br>注1：错峰模式消耗的积分更低<br>注2：错峰模式下提交的任务，会在48小时内生成，未能完成的任务会被自动取消，并返还该任务的积分</li></ul>
     * @param OffPeak <p>错峰模式，默认为：false，可选值：</p><ul><li>true：错峰生成视频；</li><li>false：即时生成视频；<br>注1：错峰模式消耗的积分更低<br>注2：错峰模式下提交的任务，会在48小时内生成，未能完成的任务会被自动取消，并返还该任务的积分</li></ul>
     */
    public void setOffPeak(Boolean OffPeak) {
        this.OffPeak = OffPeak;
    }

    /**
     * Get <p>为生成结果图添加显式水印标识的开关，默认为1。<br>1：添加。<br>0：不添加。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。<br>示例值：1</p> 
     * @return LogoAdd <p>为生成结果图添加显式水印标识的开关，默认为1。<br>1：添加。<br>0：不添加。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。<br>示例值：1</p>
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>为生成结果图添加显式水印标识的开关，默认为1。<br>1：添加。<br>0：不添加。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。<br>示例值：1</p>
     * @param LogoAdd <p>为生成结果图添加显式水印标识的开关，默认为1。<br>1：添加。<br>0：不添加。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。<br>示例值：1</p>
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get <p>标识内容设置。<br>默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p> 
     * @return LogoParam <p>标识内容设置。<br>默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set <p>标识内容设置。<br>默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     * @param LogoParam <p>标识内容设置。<br>默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    public SubmitImageToVideoViduJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitImageToVideoViduJobRequest(SubmitImageToVideoViduJobRequest source) {
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.IsRec != null) {
            this.IsRec = new Boolean(source.IsRec);
        }
        if (source.Audio != null) {
            this.Audio = new Boolean(source.Audio);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.MovementAmplitude != null) {
            this.MovementAmplitude = new String(source.MovementAmplitude);
        }
        if (source.Bgm != null) {
            this.Bgm = new Boolean(source.Bgm);
        }
        if (source.AudioType != null) {
            this.AudioType = new String(source.AudioType);
        }
        if (source.MetaData != null) {
            this.MetaData = new String(source.MetaData);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.OffPeak != null) {
            this.OffPeak = new Boolean(source.OffPeak);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "IsRec", this.IsRec);
        this.setParamSimple(map, prefix + "Audio", this.Audio);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MovementAmplitude", this.MovementAmplitude);
        this.setParamSimple(map, prefix + "Bgm", this.Bgm);
        this.setParamSimple(map, prefix + "AudioType", this.AudioType);
        this.setParamSimple(map, prefix + "MetaData", this.MetaData);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "OffPeak", this.OffPeak);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

