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

public class SubmitTextToVideoJobRequest extends AbstractModel {

    /**
    * <p>正向文本提示词。不能超过2500个字符</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>模型名称。<br>v1.0：Kling-V1<br>v1.5：Kling-V1-5<br>v1.6：Kling-V1-6<br>v2.0：Kling-V2-Master<br>v2.1m：Kling-V2-1-master<br>v2.5：Kling-V2-5-Turbo<br>v2.6：Kling-V2-6<br>v3.0：kling-v3</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>负向文本提示词。不能超过2500个字符</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>生成视频时长，单位s。默认值为5。<br>枚举值：3，4，5，6，7，8，9，10，11，12，13，14，15不同模型支持时长不同<br>●模型v1.0、v1.6、v2.0、v2.1m、v2.5、v2.6：支持5、10<br>●模型v3.0：支持3～15s</p>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * <p>生成视频的模式；<br>枚举值：std，pro<br>●其中std：标准模式（标准），基础模式，性价比高<br>●其中pro：专家模式（高品质），高表现模式，生成视频质量更佳<br>不同模型版本、视频模式支持范围不同</p><p>●v1.6：std、pro。<br>●v1.0、v1.5：pro<br>●v2.0、v2.1m、v3.0：模型无需配置。<br>●v2.5：首尾帧情况下支持pro。<br>●v2.6：仅支持pro，选择v2.6模型时，默认自动生成高品质pro视频。</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>生成视频的自由度；值越大，模型自由度越小，与用户输入的提示词相关性越强。<br>取值范围：[0, 1]<br>v2.0、v2.5、v2.6 模型不支持当前参数<br>默认值：0.5。</p>
    */
    @SerializedName("CfgScale")
    @Expose
    private Float CfgScale;

    /**
    * <p>生成视频的画面纵横比（宽:高）<br>枚举值：16:9, 9:16, 1:1<br>默认值：16:9</p>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>生成视频时是否同时生成声音</p><ul><li>枚举值：on，off</li></ul><p>仅V2.6及后续版本模型支持当前参数，v2.6模型的std模式只能生成无声的视频</p>
    */
    @SerializedName("Sound")
    @Expose
    private String Sound;

    /**
    * <p>为生成视频添加标识的开关，默认为1。<br>1：添加标识。<br>0：不添加标识。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示，该视频是 AI 生成的视频。</p>
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * <p>标识内容设置。<br>默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
    * <p>是否生成多镜头视频</p><ul><li>当前参数为true时，prompt参数无效</li><li>当前参数为false时，shot_type参数及multi_prompt参数无效</li></ul>
    */
    @SerializedName("MultiShot")
    @Expose
    private Boolean MultiShot;

    /**
    * <p>分镜方式</p><p>枚举值：customize，intelligence<br>当MultiShot参数为true时，当前参数必填</p>
    */
    @SerializedName("ShotType")
    @Expose
    private String ShotType;

    /**
    * <p>各分镜提示词，可包含正向描述和负向描述</p><p>通过index、prompt、duration参数定义分镜序号及相应提示词和时长，其中：</p><ul><li>最多支持6个分镜，最小支持1个分镜</li><li>每个分镜相关内容的最大长度不超过512</li><li>每个分镜的时长不大于当前任务的总时长，不小于1</li><li>所有分镜的时长之和等于当前任务的总时长</li><li>当MultiShot参数为true且ShotType参数为customize时，当前参数不得为空<br>用key:value承载，如下：<pre><code> &quot;MultiPrompt&quot;:[              {                &quot;Index&quot;:int,              &quot;Prompt&quot;: &quot;string&quot;,              &quot;Duration&quot;: &quot;5&quot;            }  ]</code></pre></li></ul>
    */
    @SerializedName("MultiPrompt")
    @Expose
    private MultiPrompt [] MultiPrompt;

    /**
    * <p>控制摄像机运动的协议（如未指定，模型将根据输入的文本/图片进行智能匹配）</p>
    */
    @SerializedName("CameraControl")
    @Expose
    private CameraControl CameraControl;

    /**
    * <p>本次任务结果回调通知地址，如果配置，服务端会在任务状态发生变更时主动通知</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 
    */
    @SerializedName("ExternalTaskId")
    @Expose
    private String ExternalTaskId;

    /**
     * Get <p>正向文本提示词。不能超过2500个字符</p> 
     * @return Prompt <p>正向文本提示词。不能超过2500个字符</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>正向文本提示词。不能超过2500个字符</p>
     * @param Prompt <p>正向文本提示词。不能超过2500个字符</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>模型名称。<br>v1.0：Kling-V1<br>v1.5：Kling-V1-5<br>v1.6：Kling-V1-6<br>v2.0：Kling-V2-Master<br>v2.1m：Kling-V2-1-master<br>v2.5：Kling-V2-5-Turbo<br>v2.6：Kling-V2-6<br>v3.0：kling-v3</p> 
     * @return Model <p>模型名称。<br>v1.0：Kling-V1<br>v1.5：Kling-V1-5<br>v1.6：Kling-V1-6<br>v2.0：Kling-V2-Master<br>v2.1m：Kling-V2-1-master<br>v2.5：Kling-V2-5-Turbo<br>v2.6：Kling-V2-6<br>v3.0：kling-v3</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称。<br>v1.0：Kling-V1<br>v1.5：Kling-V1-5<br>v1.6：Kling-V1-6<br>v2.0：Kling-V2-Master<br>v2.1m：Kling-V2-1-master<br>v2.5：Kling-V2-5-Turbo<br>v2.6：Kling-V2-6<br>v3.0：kling-v3</p>
     * @param Model <p>模型名称。<br>v1.0：Kling-V1<br>v1.5：Kling-V1-5<br>v1.6：Kling-V1-6<br>v2.0：Kling-V2-Master<br>v2.1m：Kling-V2-1-master<br>v2.5：Kling-V2-5-Turbo<br>v2.6：Kling-V2-6<br>v3.0：kling-v3</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>负向文本提示词。不能超过2500个字符</p> 
     * @return NegativePrompt <p>负向文本提示词。不能超过2500个字符</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>负向文本提示词。不能超过2500个字符</p>
     * @param NegativePrompt <p>负向文本提示词。不能超过2500个字符</p>
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get <p>生成视频时长，单位s。默认值为5。<br>枚举值：3，4，5，6，7，8，9，10，11，12，13，14，15不同模型支持时长不同<br>●模型v1.0、v1.6、v2.0、v2.1m、v2.5、v2.6：支持5、10<br>●模型v3.0：支持3～15s</p> 
     * @return Duration <p>生成视频时长，单位s。默认值为5。<br>枚举值：3，4，5，6，7，8，9，10，11，12，13，14，15不同模型支持时长不同<br>●模型v1.0、v1.6、v2.0、v2.1m、v2.5、v2.6：支持5、10<br>●模型v3.0：支持3～15s</p>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>生成视频时长，单位s。默认值为5。<br>枚举值：3，4，5，6，7，8，9，10，11，12，13，14，15不同模型支持时长不同<br>●模型v1.0、v1.6、v2.0、v2.1m、v2.5、v2.6：支持5、10<br>●模型v3.0：支持3～15s</p>
     * @param Duration <p>生成视频时长，单位s。默认值为5。<br>枚举值：3，4，5，6，7，8，9，10，11，12，13，14，15不同模型支持时长不同<br>●模型v1.0、v1.6、v2.0、v2.1m、v2.5、v2.6：支持5、10<br>●模型v3.0：支持3～15s</p>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>生成视频的模式；<br>枚举值：std，pro<br>●其中std：标准模式（标准），基础模式，性价比高<br>●其中pro：专家模式（高品质），高表现模式，生成视频质量更佳<br>不同模型版本、视频模式支持范围不同</p><p>●v1.6：std、pro。<br>●v1.0、v1.5：pro<br>●v2.0、v2.1m、v3.0：模型无需配置。<br>●v2.5：首尾帧情况下支持pro。<br>●v2.6：仅支持pro，选择v2.6模型时，默认自动生成高品质pro视频。</p> 
     * @return Mode <p>生成视频的模式；<br>枚举值：std，pro<br>●其中std：标准模式（标准），基础模式，性价比高<br>●其中pro：专家模式（高品质），高表现模式，生成视频质量更佳<br>不同模型版本、视频模式支持范围不同</p><p>●v1.6：std、pro。<br>●v1.0、v1.5：pro<br>●v2.0、v2.1m、v3.0：模型无需配置。<br>●v2.5：首尾帧情况下支持pro。<br>●v2.6：仅支持pro，选择v2.6模型时，默认自动生成高品质pro视频。</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>生成视频的模式；<br>枚举值：std，pro<br>●其中std：标准模式（标准），基础模式，性价比高<br>●其中pro：专家模式（高品质），高表现模式，生成视频质量更佳<br>不同模型版本、视频模式支持范围不同</p><p>●v1.6：std、pro。<br>●v1.0、v1.5：pro<br>●v2.0、v2.1m、v3.0：模型无需配置。<br>●v2.5：首尾帧情况下支持pro。<br>●v2.6：仅支持pro，选择v2.6模型时，默认自动生成高品质pro视频。</p>
     * @param Mode <p>生成视频的模式；<br>枚举值：std，pro<br>●其中std：标准模式（标准），基础模式，性价比高<br>●其中pro：专家模式（高品质），高表现模式，生成视频质量更佳<br>不同模型版本、视频模式支持范围不同</p><p>●v1.6：std、pro。<br>●v1.0、v1.5：pro<br>●v2.0、v2.1m、v3.0：模型无需配置。<br>●v2.5：首尾帧情况下支持pro。<br>●v2.6：仅支持pro，选择v2.6模型时，默认自动生成高品质pro视频。</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>生成视频的自由度；值越大，模型自由度越小，与用户输入的提示词相关性越强。<br>取值范围：[0, 1]<br>v2.0、v2.5、v2.6 模型不支持当前参数<br>默认值：0.5。</p> 
     * @return CfgScale <p>生成视频的自由度；值越大，模型自由度越小，与用户输入的提示词相关性越强。<br>取值范围：[0, 1]<br>v2.0、v2.5、v2.6 模型不支持当前参数<br>默认值：0.5。</p>
     */
    public Float getCfgScale() {
        return this.CfgScale;
    }

    /**
     * Set <p>生成视频的自由度；值越大，模型自由度越小，与用户输入的提示词相关性越强。<br>取值范围：[0, 1]<br>v2.0、v2.5、v2.6 模型不支持当前参数<br>默认值：0.5。</p>
     * @param CfgScale <p>生成视频的自由度；值越大，模型自由度越小，与用户输入的提示词相关性越强。<br>取值范围：[0, 1]<br>v2.0、v2.5、v2.6 模型不支持当前参数<br>默认值：0.5。</p>
     */
    public void setCfgScale(Float CfgScale) {
        this.CfgScale = CfgScale;
    }

    /**
     * Get <p>生成视频的画面纵横比（宽:高）<br>枚举值：16:9, 9:16, 1:1<br>默认值：16:9</p> 
     * @return AspectRatio <p>生成视频的画面纵横比（宽:高）<br>枚举值：16:9, 9:16, 1:1<br>默认值：16:9</p>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>生成视频的画面纵横比（宽:高）<br>枚举值：16:9, 9:16, 1:1<br>默认值：16:9</p>
     * @param AspectRatio <p>生成视频的画面纵横比（宽:高）<br>枚举值：16:9, 9:16, 1:1<br>默认值：16:9</p>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>生成视频时是否同时生成声音</p><ul><li>枚举值：on，off</li></ul><p>仅V2.6及后续版本模型支持当前参数，v2.6模型的std模式只能生成无声的视频</p> 
     * @return Sound <p>生成视频时是否同时生成声音</p><ul><li>枚举值：on，off</li></ul><p>仅V2.6及后续版本模型支持当前参数，v2.6模型的std模式只能生成无声的视频</p>
     */
    public String getSound() {
        return this.Sound;
    }

    /**
     * Set <p>生成视频时是否同时生成声音</p><ul><li>枚举值：on，off</li></ul><p>仅V2.6及后续版本模型支持当前参数，v2.6模型的std模式只能生成无声的视频</p>
     * @param Sound <p>生成视频时是否同时生成声音</p><ul><li>枚举值：on，off</li></ul><p>仅V2.6及后续版本模型支持当前参数，v2.6模型的std模式只能生成无声的视频</p>
     */
    public void setSound(String Sound) {
        this.Sound = Sound;
    }

    /**
     * Get <p>为生成视频添加标识的开关，默认为1。<br>1：添加标识。<br>0：不添加标识。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示，该视频是 AI 生成的视频。</p> 
     * @return LogoAdd <p>为生成视频添加标识的开关，默认为1。<br>1：添加标识。<br>0：不添加标识。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示，该视频是 AI 生成的视频。</p>
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>为生成视频添加标识的开关，默认为1。<br>1：添加标识。<br>0：不添加标识。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示，该视频是 AI 生成的视频。</p>
     * @param LogoAdd <p>为生成视频添加标识的开关，默认为1。<br>1：添加标识。<br>0：不添加标识。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示，该视频是 AI 生成的视频。</p>
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get <p>标识内容设置。<br>默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p> 
     * @return LogoParam <p>标识内容设置。<br>默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set <p>标识内容设置。<br>默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     * @param LogoParam <p>标识内容设置。<br>默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    /**
     * Get <p>是否生成多镜头视频</p><ul><li>当前参数为true时，prompt参数无效</li><li>当前参数为false时，shot_type参数及multi_prompt参数无效</li></ul> 
     * @return MultiShot <p>是否生成多镜头视频</p><ul><li>当前参数为true时，prompt参数无效</li><li>当前参数为false时，shot_type参数及multi_prompt参数无效</li></ul>
     */
    public Boolean getMultiShot() {
        return this.MultiShot;
    }

    /**
     * Set <p>是否生成多镜头视频</p><ul><li>当前参数为true时，prompt参数无效</li><li>当前参数为false时，shot_type参数及multi_prompt参数无效</li></ul>
     * @param MultiShot <p>是否生成多镜头视频</p><ul><li>当前参数为true时，prompt参数无效</li><li>当前参数为false时，shot_type参数及multi_prompt参数无效</li></ul>
     */
    public void setMultiShot(Boolean MultiShot) {
        this.MultiShot = MultiShot;
    }

    /**
     * Get <p>分镜方式</p><p>枚举值：customize，intelligence<br>当MultiShot参数为true时，当前参数必填</p> 
     * @return ShotType <p>分镜方式</p><p>枚举值：customize，intelligence<br>当MultiShot参数为true时，当前参数必填</p>
     */
    public String getShotType() {
        return this.ShotType;
    }

    /**
     * Set <p>分镜方式</p><p>枚举值：customize，intelligence<br>当MultiShot参数为true时，当前参数必填</p>
     * @param ShotType <p>分镜方式</p><p>枚举值：customize，intelligence<br>当MultiShot参数为true时，当前参数必填</p>
     */
    public void setShotType(String ShotType) {
        this.ShotType = ShotType;
    }

    /**
     * Get <p>各分镜提示词，可包含正向描述和负向描述</p><p>通过index、prompt、duration参数定义分镜序号及相应提示词和时长，其中：</p><ul><li>最多支持6个分镜，最小支持1个分镜</li><li>每个分镜相关内容的最大长度不超过512</li><li>每个分镜的时长不大于当前任务的总时长，不小于1</li><li>所有分镜的时长之和等于当前任务的总时长</li><li>当MultiShot参数为true且ShotType参数为customize时，当前参数不得为空<br>用key:value承载，如下：<pre><code> &quot;MultiPrompt&quot;:[              {                &quot;Index&quot;:int,              &quot;Prompt&quot;: &quot;string&quot;,              &quot;Duration&quot;: &quot;5&quot;            }  ]</code></pre></li></ul> 
     * @return MultiPrompt <p>各分镜提示词，可包含正向描述和负向描述</p><p>通过index、prompt、duration参数定义分镜序号及相应提示词和时长，其中：</p><ul><li>最多支持6个分镜，最小支持1个分镜</li><li>每个分镜相关内容的最大长度不超过512</li><li>每个分镜的时长不大于当前任务的总时长，不小于1</li><li>所有分镜的时长之和等于当前任务的总时长</li><li>当MultiShot参数为true且ShotType参数为customize时，当前参数不得为空<br>用key:value承载，如下：<pre><code> &quot;MultiPrompt&quot;:[              {                &quot;Index&quot;:int,              &quot;Prompt&quot;: &quot;string&quot;,              &quot;Duration&quot;: &quot;5&quot;            }  ]</code></pre></li></ul>
     */
    public MultiPrompt [] getMultiPrompt() {
        return this.MultiPrompt;
    }

    /**
     * Set <p>各分镜提示词，可包含正向描述和负向描述</p><p>通过index、prompt、duration参数定义分镜序号及相应提示词和时长，其中：</p><ul><li>最多支持6个分镜，最小支持1个分镜</li><li>每个分镜相关内容的最大长度不超过512</li><li>每个分镜的时长不大于当前任务的总时长，不小于1</li><li>所有分镜的时长之和等于当前任务的总时长</li><li>当MultiShot参数为true且ShotType参数为customize时，当前参数不得为空<br>用key:value承载，如下：<pre><code> &quot;MultiPrompt&quot;:[              {                &quot;Index&quot;:int,              &quot;Prompt&quot;: &quot;string&quot;,              &quot;Duration&quot;: &quot;5&quot;            }  ]</code></pre></li></ul>
     * @param MultiPrompt <p>各分镜提示词，可包含正向描述和负向描述</p><p>通过index、prompt、duration参数定义分镜序号及相应提示词和时长，其中：</p><ul><li>最多支持6个分镜，最小支持1个分镜</li><li>每个分镜相关内容的最大长度不超过512</li><li>每个分镜的时长不大于当前任务的总时长，不小于1</li><li>所有分镜的时长之和等于当前任务的总时长</li><li>当MultiShot参数为true且ShotType参数为customize时，当前参数不得为空<br>用key:value承载，如下：<pre><code> &quot;MultiPrompt&quot;:[              {                &quot;Index&quot;:int,              &quot;Prompt&quot;: &quot;string&quot;,              &quot;Duration&quot;: &quot;5&quot;            }  ]</code></pre></li></ul>
     */
    public void setMultiPrompt(MultiPrompt [] MultiPrompt) {
        this.MultiPrompt = MultiPrompt;
    }

    /**
     * Get <p>控制摄像机运动的协议（如未指定，模型将根据输入的文本/图片进行智能匹配）</p> 
     * @return CameraControl <p>控制摄像机运动的协议（如未指定，模型将根据输入的文本/图片进行智能匹配）</p>
     */
    public CameraControl getCameraControl() {
        return this.CameraControl;
    }

    /**
     * Set <p>控制摄像机运动的协议（如未指定，模型将根据输入的文本/图片进行智能匹配）</p>
     * @param CameraControl <p>控制摄像机运动的协议（如未指定，模型将根据输入的文本/图片进行智能匹配）</p>
     */
    public void setCameraControl(CameraControl CameraControl) {
        this.CameraControl = CameraControl;
    }

    /**
     * Get <p>本次任务结果回调通知地址，如果配置，服务端会在任务状态发生变更时主动通知</p> 
     * @return CallbackUrl <p>本次任务结果回调通知地址，如果配置，服务端会在任务状态发生变更时主动通知</p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>本次任务结果回调通知地址，如果配置，服务端会在任务状态发生变更时主动通知</p>
     * @param CallbackUrl <p>本次任务结果回调通知地址，如果配置，服务端会在任务状态发生变更时主动通知</p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get  
     * @return ExternalTaskId 
     */
    public String getExternalTaskId() {
        return this.ExternalTaskId;
    }

    /**
     * Set 
     * @param ExternalTaskId 
     */
    public void setExternalTaskId(String ExternalTaskId) {
        this.ExternalTaskId = ExternalTaskId;
    }

    public SubmitTextToVideoJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTextToVideoJobRequest(SubmitTextToVideoJobRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.CfgScale != null) {
            this.CfgScale = new Float(source.CfgScale);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Sound != null) {
            this.Sound = new String(source.Sound);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
        if (source.MultiShot != null) {
            this.MultiShot = new Boolean(source.MultiShot);
        }
        if (source.ShotType != null) {
            this.ShotType = new String(source.ShotType);
        }
        if (source.MultiPrompt != null) {
            this.MultiPrompt = new MultiPrompt[source.MultiPrompt.length];
            for (int i = 0; i < source.MultiPrompt.length; i++) {
                this.MultiPrompt[i] = new MultiPrompt(source.MultiPrompt[i]);
            }
        }
        if (source.CameraControl != null) {
            this.CameraControl = new CameraControl(source.CameraControl);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ExternalTaskId != null) {
            this.ExternalTaskId = new String(source.ExternalTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "CfgScale", this.CfgScale);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Sound", this.Sound);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);
        this.setParamSimple(map, prefix + "MultiShot", this.MultiShot);
        this.setParamSimple(map, prefix + "ShotType", this.ShotType);
        this.setParamArrayObj(map, prefix + "MultiPrompt.", this.MultiPrompt);
        this.setParamObj(map, prefix + "CameraControl.", this.CameraControl);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "ExternalTaskId", this.ExternalTaskId);

    }
}

