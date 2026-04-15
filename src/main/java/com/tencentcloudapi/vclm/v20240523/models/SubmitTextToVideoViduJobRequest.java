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

public class SubmitTextToVideoViduJobRequest extends AbstractModel {

    /**
    * <p>文本提示词<br>生成视频的文本描述。<br>注：字符长度不能超过 2000 个字符</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>模型名称，可选值，默认viduq2</p><ul><li>viduq2：最新模型</li><li>viduq3-turbo：对比viduq3-pro，生成速度更快</li><li>viduq3-pro：高效生成优质音视频内容，让视频内容更生动、更形象、更立体，效果更好</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>视频时长参数，默认值依据模型而定：</p><ul><li>viduq3-pro、viduq3-turbo: 默认5秒，可选：1-16</li><li>viduq2 : 默认5秒，可选：1-10</li></ul>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>是否为生成的视频添加背景音乐。<br>默认：false，可选值 true 、false<br>传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。</p><ul><li>BGM不限制时长，系统根据视频时长自动适配</li><li>BGM参数在q2模型的duration为 9秒 或 10秒 时不生效；该参数在q3系列模型中不生效</li></ul>
    */
    @SerializedName("Bgm")
    @Expose
    private Boolean Bgm;

    /**
    * <p>比例<br>默认 16:9，可选值如下：16:9、9:16、4:3、3:4、1:1</p>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>分辨率参数，默认值依据模型和视频时长而定：</p><ul><li>viduq3-pro、viduq3-turbo(1-16秒)：默认 720p，可选：540p、720p、1080p</li><li>viduq2(1-10秒)：默认 720p，可选：540p、720p、1080p</li></ul>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>风格<br>默认 general，可选值：general、anime<br>general：通用风格，可以通过提示词来控制风格<br>anime：动漫风格，仅在动漫风格表现突出，可以通过不同的动漫风格提示词来控制<br>注：使用q2、q3系列模型时该参数不生效</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * <p>运动幅度<br>默认 auto，可选值：auto、small、medium、large<br>注：使用q2、q3系列模型时该参数不生效</p>
    */
    @SerializedName("MovementAmplitude")
    @Expose
    private String MovementAmplitude;

    /**
    * <p>是否使用音视频直出能力，默认为true，枚举值为：</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音画同步，输出声音的视频（包括台词和音效）<br>注1：仅q3系列模型支持该参数</li></ul>
    */
    @SerializedName("Audio")
    @Expose
    private Boolean Audio;

    /**
    * <p>元数据标识，json格式字符串，透传字段，您可以 自定义格式 或使用 示例格式 ，示例如下：<br>{<br>&quot;Label&quot;: &quot;your_label&quot;,<br>&quot;ContentProducer&quot;: &quot;your_content_producer&quot;,<br>&quot;ContentPropagator&quot;: &quot;your_content_propagator&quot;,<br>&quot;ProduceID&quot;: &quot;your_product_id&quot;,<br>&quot;PropagateID&quot;: &quot;your_propagate_id&quot;,<br>&quot;ReservedCode1&quot;: &quot;your_reserved_code1&quot;,<br>&quot;ReservedCode2&quot;: &quot;your_reserved_code2&quot;<br>}<br>该参数为空时，默认使用vidu生成的元数据标识</p>
    */
    @SerializedName("MetaData")
    @Expose
    private String MetaData;

    /**
    * <p>Callback 协议<br>需要您在创建任务时主动设置 callback_url，请求方法为 POST，当视频生成任务完成时，将向此地址发送包含任务最新状态的回调请求。回调请求内容结构与查询任务API的返回体一致<br>回调返回的&quot;status&quot;包括以下状态：</p><ul><li>success 任务完成（如发送失败，回调三次）</li><li>failed 任务失败（如发送失败，回调三次）</li></ul>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>透传参数 不做任何处理，仅数据传输 注：最多 1048576个字符</p>
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
     * Get <p>文本提示词<br>生成视频的文本描述。<br>注：字符长度不能超过 2000 个字符</p> 
     * @return Prompt <p>文本提示词<br>生成视频的文本描述。<br>注：字符长度不能超过 2000 个字符</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>文本提示词<br>生成视频的文本描述。<br>注：字符长度不能超过 2000 个字符</p>
     * @param Prompt <p>文本提示词<br>生成视频的文本描述。<br>注：字符长度不能超过 2000 个字符</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>模型名称，可选值，默认viduq2</p><ul><li>viduq2：最新模型</li><li>viduq3-turbo：对比viduq3-pro，生成速度更快</li><li>viduq3-pro：高效生成优质音视频内容，让视频内容更生动、更形象、更立体，效果更好</li></ul> 
     * @return Model <p>模型名称，可选值，默认viduq2</p><ul><li>viduq2：最新模型</li><li>viduq3-turbo：对比viduq3-pro，生成速度更快</li><li>viduq3-pro：高效生成优质音视频内容，让视频内容更生动、更形象、更立体，效果更好</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称，可选值，默认viduq2</p><ul><li>viduq2：最新模型</li><li>viduq3-turbo：对比viduq3-pro，生成速度更快</li><li>viduq3-pro：高效生成优质音视频内容，让视频内容更生动、更形象、更立体，效果更好</li></ul>
     * @param Model <p>模型名称，可选值，默认viduq2</p><ul><li>viduq2：最新模型</li><li>viduq3-turbo：对比viduq3-pro，生成速度更快</li><li>viduq3-pro：高效生成优质音视频内容，让视频内容更生动、更形象、更立体，效果更好</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>视频时长参数，默认值依据模型而定：</p><ul><li>viduq3-pro、viduq3-turbo: 默认5秒，可选：1-16</li><li>viduq2 : 默认5秒，可选：1-10</li></ul> 
     * @return Duration <p>视频时长参数，默认值依据模型而定：</p><ul><li>viduq3-pro、viduq3-turbo: 默认5秒，可选：1-16</li><li>viduq2 : 默认5秒，可选：1-10</li></ul>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>视频时长参数，默认值依据模型而定：</p><ul><li>viduq3-pro、viduq3-turbo: 默认5秒，可选：1-16</li><li>viduq2 : 默认5秒，可选：1-10</li></ul>
     * @param Duration <p>视频时长参数，默认值依据模型而定：</p><ul><li>viduq3-pro、viduq3-turbo: 默认5秒，可选：1-16</li><li>viduq2 : 默认5秒，可选：1-10</li></ul>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>是否为生成的视频添加背景音乐。<br>默认：false，可选值 true 、false<br>传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。</p><ul><li>BGM不限制时长，系统根据视频时长自动适配</li><li>BGM参数在q2模型的duration为 9秒 或 10秒 时不生效；该参数在q3系列模型中不生效</li></ul> 
     * @return Bgm <p>是否为生成的视频添加背景音乐。<br>默认：false，可选值 true 、false<br>传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。</p><ul><li>BGM不限制时长，系统根据视频时长自动适配</li><li>BGM参数在q2模型的duration为 9秒 或 10秒 时不生效；该参数在q3系列模型中不生效</li></ul>
     */
    public Boolean getBgm() {
        return this.Bgm;
    }

    /**
     * Set <p>是否为生成的视频添加背景音乐。<br>默认：false，可选值 true 、false<br>传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。</p><ul><li>BGM不限制时长，系统根据视频时长自动适配</li><li>BGM参数在q2模型的duration为 9秒 或 10秒 时不生效；该参数在q3系列模型中不生效</li></ul>
     * @param Bgm <p>是否为生成的视频添加背景音乐。<br>默认：false，可选值 true 、false<br>传 true 时系统将从预设 BGM 库中自动挑选合适的音乐并添加；不传或为 false 则不添加 BGM。</p><ul><li>BGM不限制时长，系统根据视频时长自动适配</li><li>BGM参数在q2模型的duration为 9秒 或 10秒 时不生效；该参数在q3系列模型中不生效</li></ul>
     */
    public void setBgm(Boolean Bgm) {
        this.Bgm = Bgm;
    }

    /**
     * Get <p>比例<br>默认 16:9，可选值如下：16:9、9:16、4:3、3:4、1:1</p> 
     * @return AspectRatio <p>比例<br>默认 16:9，可选值如下：16:9、9:16、4:3、3:4、1:1</p>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>比例<br>默认 16:9，可选值如下：16:9、9:16、4:3、3:4、1:1</p>
     * @param AspectRatio <p>比例<br>默认 16:9，可选值如下：16:9、9:16、4:3、3:4、1:1</p>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>分辨率参数，默认值依据模型和视频时长而定：</p><ul><li>viduq3-pro、viduq3-turbo(1-16秒)：默认 720p，可选：540p、720p、1080p</li><li>viduq2(1-10秒)：默认 720p，可选：540p、720p、1080p</li></ul> 
     * @return Resolution <p>分辨率参数，默认值依据模型和视频时长而定：</p><ul><li>viduq3-pro、viduq3-turbo(1-16秒)：默认 720p，可选：540p、720p、1080p</li><li>viduq2(1-10秒)：默认 720p，可选：540p、720p、1080p</li></ul>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>分辨率参数，默认值依据模型和视频时长而定：</p><ul><li>viduq3-pro、viduq3-turbo(1-16秒)：默认 720p，可选：540p、720p、1080p</li><li>viduq2(1-10秒)：默认 720p，可选：540p、720p、1080p</li></ul>
     * @param Resolution <p>分辨率参数，默认值依据模型和视频时长而定：</p><ul><li>viduq3-pro、viduq3-turbo(1-16秒)：默认 720p，可选：540p、720p、1080p</li><li>viduq2(1-10秒)：默认 720p，可选：540p、720p、1080p</li></ul>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>风格<br>默认 general，可选值：general、anime<br>general：通用风格，可以通过提示词来控制风格<br>anime：动漫风格，仅在动漫风格表现突出，可以通过不同的动漫风格提示词来控制<br>注：使用q2、q3系列模型时该参数不生效</p> 
     * @return Style <p>风格<br>默认 general，可选值：general、anime<br>general：通用风格，可以通过提示词来控制风格<br>anime：动漫风格，仅在动漫风格表现突出，可以通过不同的动漫风格提示词来控制<br>注：使用q2、q3系列模型时该参数不生效</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>风格<br>默认 general，可选值：general、anime<br>general：通用风格，可以通过提示词来控制风格<br>anime：动漫风格，仅在动漫风格表现突出，可以通过不同的动漫风格提示词来控制<br>注：使用q2、q3系列模型时该参数不生效</p>
     * @param Style <p>风格<br>默认 general，可选值：general、anime<br>general：通用风格，可以通过提示词来控制风格<br>anime：动漫风格，仅在动漫风格表现突出，可以通过不同的动漫风格提示词来控制<br>注：使用q2、q3系列模型时该参数不生效</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get <p>运动幅度<br>默认 auto，可选值：auto、small、medium、large<br>注：使用q2、q3系列模型时该参数不生效</p> 
     * @return MovementAmplitude <p>运动幅度<br>默认 auto，可选值：auto、small、medium、large<br>注：使用q2、q3系列模型时该参数不生效</p>
     */
    public String getMovementAmplitude() {
        return this.MovementAmplitude;
    }

    /**
     * Set <p>运动幅度<br>默认 auto，可选值：auto、small、medium、large<br>注：使用q2、q3系列模型时该参数不生效</p>
     * @param MovementAmplitude <p>运动幅度<br>默认 auto，可选值：auto、small、medium、large<br>注：使用q2、q3系列模型时该参数不生效</p>
     */
    public void setMovementAmplitude(String MovementAmplitude) {
        this.MovementAmplitude = MovementAmplitude;
    }

    /**
     * Get <p>是否使用音视频直出能力，默认为true，枚举值为：</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音画同步，输出声音的视频（包括台词和音效）<br>注1：仅q3系列模型支持该参数</li></ul> 
     * @return Audio <p>是否使用音视频直出能力，默认为true，枚举值为：</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音画同步，输出声音的视频（包括台词和音效）<br>注1：仅q3系列模型支持该参数</li></ul>
     */
    public Boolean getAudio() {
        return this.Audio;
    }

    /**
     * Set <p>是否使用音视频直出能力，默认为true，枚举值为：</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音画同步，输出声音的视频（包括台词和音效）<br>注1：仅q3系列模型支持该参数</li></ul>
     * @param Audio <p>是否使用音视频直出能力，默认为true，枚举值为：</p><ul><li>false：不需要音视频直出，输出静音视频</li><li>true：需要音画同步，输出声音的视频（包括台词和音效）<br>注1：仅q3系列模型支持该参数</li></ul>
     */
    public void setAudio(Boolean Audio) {
        this.Audio = Audio;
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
     * Get <p>Callback 协议<br>需要您在创建任务时主动设置 callback_url，请求方法为 POST，当视频生成任务完成时，将向此地址发送包含任务最新状态的回调请求。回调请求内容结构与查询任务API的返回体一致<br>回调返回的&quot;status&quot;包括以下状态：</p><ul><li>success 任务完成（如发送失败，回调三次）</li><li>failed 任务失败（如发送失败，回调三次）</li></ul> 
     * @return CallbackUrl <p>Callback 协议<br>需要您在创建任务时主动设置 callback_url，请求方法为 POST，当视频生成任务完成时，将向此地址发送包含任务最新状态的回调请求。回调请求内容结构与查询任务API的返回体一致<br>回调返回的&quot;status&quot;包括以下状态：</p><ul><li>success 任务完成（如发送失败，回调三次）</li><li>failed 任务失败（如发送失败，回调三次）</li></ul>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>Callback 协议<br>需要您在创建任务时主动设置 callback_url，请求方法为 POST，当视频生成任务完成时，将向此地址发送包含任务最新状态的回调请求。回调请求内容结构与查询任务API的返回体一致<br>回调返回的&quot;status&quot;包括以下状态：</p><ul><li>success 任务完成（如发送失败，回调三次）</li><li>failed 任务失败（如发送失败，回调三次）</li></ul>
     * @param CallbackUrl <p>Callback 协议<br>需要您在创建任务时主动设置 callback_url，请求方法为 POST，当视频生成任务完成时，将向此地址发送包含任务最新状态的回调请求。回调请求内容结构与查询任务API的返回体一致<br>回调返回的&quot;status&quot;包括以下状态：</p><ul><li>success 任务完成（如发送失败，回调三次）</li><li>failed 任务失败（如发送失败，回调三次）</li></ul>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>透传参数 不做任何处理，仅数据传输 注：最多 1048576个字符</p> 
     * @return Payload <p>透传参数 不做任何处理，仅数据传输 注：最多 1048576个字符</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>透传参数 不做任何处理，仅数据传输 注：最多 1048576个字符</p>
     * @param Payload <p>透传参数 不做任何处理，仅数据传输 注：最多 1048576个字符</p>
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

    public SubmitTextToVideoViduJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTextToVideoViduJobRequest(SubmitTextToVideoViduJobRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Bgm != null) {
            this.Bgm = new Boolean(source.Bgm);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.MovementAmplitude != null) {
            this.MovementAmplitude = new String(source.MovementAmplitude);
        }
        if (source.Audio != null) {
            this.Audio = new Boolean(source.Audio);
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
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Bgm", this.Bgm);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamSimple(map, prefix + "MovementAmplitude", this.MovementAmplitude);
        this.setParamSimple(map, prefix + "Audio", this.Audio);
        this.setParamSimple(map, prefix + "MetaData", this.MetaData);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "OffPeak", this.OffPeak);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

