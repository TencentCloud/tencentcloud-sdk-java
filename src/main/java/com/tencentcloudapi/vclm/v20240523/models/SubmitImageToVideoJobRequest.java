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

public class SubmitImageToVideoJobRequest extends AbstractModel {

    /**
    * <p>模型名称。<br>v1.6：Kling-V1-6<br>v2.0：Kling-V2-Master<br>v2.1：Kling-V2-1<br>v2.5：Kling-V2-5-Turbo<br>v2.6：Kling-V2-6<br>V3.0：kling-v3</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>参考图像。</p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片文件大小不能超过10MB，图片分辨率不小于300*300px，图片宽高比要在1:2.5 ~ 2.5:1之间</li><li>Image 参数与 ImageTail 参数至少二选一，二者不能同时为空</li><li>图片格式支持.jpg / .jpeg / .png</li></ul>
    */
    @SerializedName("Image")
    @Expose
    private Image Image;

    /**
    * <p>参考尾帧图像。</p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片文件大小不能超过10MB，图片分辨率不小于300*300px，图片宽高比要在1:2.5 ~ 2.5:1之间</li><li>Image 参数与 ImageTail 参数至少二选一，二者不能同时为空</li><li>图片格式支持.jpg / .jpeg / .png</li><li>ImageTail参数、DynamicMasks/StaticMask参数、CameraControl参数三选一，不能同时使用</li></ul>
    */
    @SerializedName("ImageTail")
    @Expose
    private Image ImageTail;

    /**
    * <p>正向文本提示词。不能超过2500个字符</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>负向文本提示词。不能超过2500个字符</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>生成视频时长，单位s。默认值为5。<br>枚举值：3，4，5，6，7，8，9，10，11，12，13，14，15</p><p>不同模型支持时长不同</p><ul><li>模型v1.6、v2.0、v2.5、v2.6：支持5、10</li><li>模型v3.0：支持3～15s</li></ul>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * <p>生成视频的模式<br>枚举值：std，pro<br>其中std：标准模式（标准），基础模式，性价比高<br>其中pro：专家模式（高品质），高表现模式，生成视频质量更佳</p><p>不同模型版本、视频模式支持范围不同</p><ul><li>v1.6：首尾帧与仅首帧情况下只支持pro</li><li>v2.0、v3.0 ：无需配置</li><li>v2.1、v2.5、v2.6：首尾帧情况下只支持pro</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>生成视频的自由度；值越大，模型自由度越小，与用户输入的提示词相关性越强。<br>v2.0、v2.5、v2.6模型的不支持当前参数<br>取值范围：[0, 1]</p>
    */
    @SerializedName("CfgScale")
    @Expose
    private Float CfgScale;

    /**
    * <p>生成视频时是否同时生成声音<br>枚举值：on，off<br>不同模型版本、视频模式支持范围不同</p><ul><li>v2.6：有首尾帧的pro模式只能生成无声的视频</li></ul>
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
    * <p>是否生成多镜头视频</p><ul><li>当前参数为true时，Prompt参数无效，且不支持设定首尾帧生视频</li><li>当前参数为false时，ShotType参数及MultiPrompt参数无效</li></ul>
    */
    @SerializedName("MultiShot")
    @Expose
    private Boolean MultiShot;

    /**
    * <p>分镜方式</p><ul><li>枚举值：customize，intelligence</li><li>当MultiShot参数为true时，当前参数必填</li></ul>
    */
    @SerializedName("ShotType")
    @Expose
    private String ShotType;

    /**
    * <p>各分镜信息，如提示词、时长等<br>通过Index、Prompt、Duration参数定义分镜序号及相应提示词和时长，其中：</p><ul><li>最多支持6个分镜，最小支持1个分镜</li><li>每个分镜相关内容的最大长度不超过512</li><li>每个分镜的时长不大于当前任务的总时长，不小于1</li><li>所有分镜的时长之和等于当前任务的总时长</li></ul><p>用key:value承载，如下：<br>&quot;MultiPrompt&quot;:[<br>    {<br>      &quot;Index&quot;:int,<br>    &quot;Prompt&quot;: &quot;string&quot;,<br>    &quot;Duration&quot;: &quot;5&quot;<br>  },<br>  {<br>      &quot;Index&quot;:int,<br>    &quot;Prompt&quot;: &quot;string&quot;,<br>    &quot;Duration&quot;: &quot;5&quot;<br>  }<br>]</p><ul><li>当MultiShot参数为true且ShotType参数为customize时，当前参数不得为空</li></ul>
    */
    @SerializedName("MultiPrompt")
    @Expose
    private MultiPrompt [] MultiPrompt;

    /**
    * <p>参考主体列表</p><ul><li><p>基于主体库中主体的ID配置，用key:value承载，如下：</p><pre><code>  &quot;ElementList&quot;:[      {         &quot;ElementId&quot;:long    },    {         &quot;ElementId&quot;:long    }  ]</code></pre></li><li><p>最多支持3个参考主体</p></li><li><p>主体分为视频定制主体（简称：视频角色主体）和图片定制主体（简称：多图主体），适用范围不同，请注意区分</p></li><li><p>更多主体信息详见：可灵「主体库 3.0」使用指南</p></li></ul>
    */
    @SerializedName("ElementList")
    @Expose
    private Element [] ElementList;

    /**
    * <p>静态笔刷涂抹区域（用户通过运动笔刷涂抹的 mask 图片）<br>“运动笔刷”能力包含“动态笔刷 DynamicMasks”和“静态笔刷 StaticMask”两种<br>支持传入图片Base64编码或图片URL（确保可访问，格式要求同 Image 字段）<br>图片格式支持.jpg / .jpeg / .png<br>图片长宽比必须与输入图片相同（即Image字段），否则任务失败（failed）<br>StaticMask和 DynamicMasks.Mask这两张图片的分辨率必须一致，否则任务失败（failed）</p>
    */
    @SerializedName("StaticMask")
    @Expose
    private String StaticMask;

    /**
    * <p>动态笔刷配置列表<br>可配置多组（最多6组），每组包含“涂抹区域 Mask”与“运动轨迹 Trajectories”序列</p>
    */
    @SerializedName("DynamicMasks")
    @Expose
    private DynamicMask [] DynamicMasks;

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
    * <p>生成视频时所引用的音色的列表</p><p>一次视频生成任务至多引用2个音色<br>当VoiceList参数不为空且Prompt参数中引用音色ID时，视频生成任务按“有指定音色”计量计费<br>VoiceId参数值通过音色定制接口返回，也可使用系统预置音色，详见音色定制相关API；非对口型API的VoiceId<br>ElementList参数与VoiceList参数互斥，不能共存<br>v3模型不支持指定音色<br>用key:value承载，如下：<br>&quot;VoiceList&quot;:[<br>  {&quot;VoiceId&quot;:&quot;VoiceId_1&quot;},<br>  {&quot;VoiceId&quot;:&quot;VoiceId_2&quot;}<br>]</p>
    */
    @SerializedName("VoiceList")
    @Expose
    private Voice [] VoiceList;

    /**
     * Get <p>模型名称。<br>v1.6：Kling-V1-6<br>v2.0：Kling-V2-Master<br>v2.1：Kling-V2-1<br>v2.5：Kling-V2-5-Turbo<br>v2.6：Kling-V2-6<br>V3.0：kling-v3</p> 
     * @return Model <p>模型名称。<br>v1.6：Kling-V1-6<br>v2.0：Kling-V2-Master<br>v2.1：Kling-V2-1<br>v2.5：Kling-V2-5-Turbo<br>v2.6：Kling-V2-6<br>V3.0：kling-v3</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称。<br>v1.6：Kling-V1-6<br>v2.0：Kling-V2-Master<br>v2.1：Kling-V2-1<br>v2.5：Kling-V2-5-Turbo<br>v2.6：Kling-V2-6<br>V3.0：kling-v3</p>
     * @param Model <p>模型名称。<br>v1.6：Kling-V1-6<br>v2.0：Kling-V2-Master<br>v2.1：Kling-V2-1<br>v2.5：Kling-V2-5-Turbo<br>v2.6：Kling-V2-6<br>V3.0：kling-v3</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>参考图像。</p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片文件大小不能超过10MB，图片分辨率不小于300*300px，图片宽高比要在1:2.5 ~ 2.5:1之间</li><li>Image 参数与 ImageTail 参数至少二选一，二者不能同时为空</li><li>图片格式支持.jpg / .jpeg / .png</li></ul> 
     * @return Image <p>参考图像。</p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片文件大小不能超过10MB，图片分辨率不小于300*300px，图片宽高比要在1:2.5 ~ 2.5:1之间</li><li>Image 参数与 ImageTail 参数至少二选一，二者不能同时为空</li><li>图片格式支持.jpg / .jpeg / .png</li></ul>
     */
    public Image getImage() {
        return this.Image;
    }

    /**
     * Set <p>参考图像。</p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片文件大小不能超过10MB，图片分辨率不小于300*300px，图片宽高比要在1:2.5 ~ 2.5:1之间</li><li>Image 参数与 ImageTail 参数至少二选一，二者不能同时为空</li><li>图片格式支持.jpg / .jpeg / .png</li></ul>
     * @param Image <p>参考图像。</p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片文件大小不能超过10MB，图片分辨率不小于300*300px，图片宽高比要在1:2.5 ~ 2.5:1之间</li><li>Image 参数与 ImageTail 参数至少二选一，二者不能同时为空</li><li>图片格式支持.jpg / .jpeg / .png</li></ul>
     */
    public void setImage(Image Image) {
        this.Image = Image;
    }

    /**
     * Get <p>参考尾帧图像。</p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片文件大小不能超过10MB，图片分辨率不小于300*300px，图片宽高比要在1:2.5 ~ 2.5:1之间</li><li>Image 参数与 ImageTail 参数至少二选一，二者不能同时为空</li><li>图片格式支持.jpg / .jpeg / .png</li><li>ImageTail参数、DynamicMasks/StaticMask参数、CameraControl参数三选一，不能同时使用</li></ul> 
     * @return ImageTail <p>参考尾帧图像。</p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片文件大小不能超过10MB，图片分辨率不小于300*300px，图片宽高比要在1:2.5 ~ 2.5:1之间</li><li>Image 参数与 ImageTail 参数至少二选一，二者不能同时为空</li><li>图片格式支持.jpg / .jpeg / .png</li><li>ImageTail参数、DynamicMasks/StaticMask参数、CameraControl参数三选一，不能同时使用</li></ul>
     */
    public Image getImageTail() {
        return this.ImageTail;
    }

    /**
     * Set <p>参考尾帧图像。</p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片文件大小不能超过10MB，图片分辨率不小于300*300px，图片宽高比要在1:2.5 ~ 2.5:1之间</li><li>Image 参数与 ImageTail 参数至少二选一，二者不能同时为空</li><li>图片格式支持.jpg / .jpeg / .png</li><li>ImageTail参数、DynamicMasks/StaticMask参数、CameraControl参数三选一，不能同时使用</li></ul>
     * @param ImageTail <p>参考尾帧图像。</p><ul><li>支持传入图片Base64编码或图片URL（确保可访问）</li><li>图片文件大小不能超过10MB，图片分辨率不小于300*300px，图片宽高比要在1:2.5 ~ 2.5:1之间</li><li>Image 参数与 ImageTail 参数至少二选一，二者不能同时为空</li><li>图片格式支持.jpg / .jpeg / .png</li><li>ImageTail参数、DynamicMasks/StaticMask参数、CameraControl参数三选一，不能同时使用</li></ul>
     */
    public void setImageTail(Image ImageTail) {
        this.ImageTail = ImageTail;
    }

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
     * Get <p>生成视频时长，单位s。默认值为5。<br>枚举值：3，4，5，6，7，8，9，10，11，12，13，14，15</p><p>不同模型支持时长不同</p><ul><li>模型v1.6、v2.0、v2.5、v2.6：支持5、10</li><li>模型v3.0：支持3～15s</li></ul> 
     * @return Duration <p>生成视频时长，单位s。默认值为5。<br>枚举值：3，4，5，6，7，8，9，10，11，12，13，14，15</p><p>不同模型支持时长不同</p><ul><li>模型v1.6、v2.0、v2.5、v2.6：支持5、10</li><li>模型v3.0：支持3～15s</li></ul>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>生成视频时长，单位s。默认值为5。<br>枚举值：3，4，5，6，7，8，9，10，11，12，13，14，15</p><p>不同模型支持时长不同</p><ul><li>模型v1.6、v2.0、v2.5、v2.6：支持5、10</li><li>模型v3.0：支持3～15s</li></ul>
     * @param Duration <p>生成视频时长，单位s。默认值为5。<br>枚举值：3，4，5，6，7，8，9，10，11，12，13，14，15</p><p>不同模型支持时长不同</p><ul><li>模型v1.6、v2.0、v2.5、v2.6：支持5、10</li><li>模型v3.0：支持3～15s</li></ul>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>生成视频的模式<br>枚举值：std，pro<br>其中std：标准模式（标准），基础模式，性价比高<br>其中pro：专家模式（高品质），高表现模式，生成视频质量更佳</p><p>不同模型版本、视频模式支持范围不同</p><ul><li>v1.6：首尾帧与仅首帧情况下只支持pro</li><li>v2.0、v3.0 ：无需配置</li><li>v2.1、v2.5、v2.6：首尾帧情况下只支持pro</li></ul> 
     * @return Mode <p>生成视频的模式<br>枚举值：std，pro<br>其中std：标准模式（标准），基础模式，性价比高<br>其中pro：专家模式（高品质），高表现模式，生成视频质量更佳</p><p>不同模型版本、视频模式支持范围不同</p><ul><li>v1.6：首尾帧与仅首帧情况下只支持pro</li><li>v2.0、v3.0 ：无需配置</li><li>v2.1、v2.5、v2.6：首尾帧情况下只支持pro</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>生成视频的模式<br>枚举值：std，pro<br>其中std：标准模式（标准），基础模式，性价比高<br>其中pro：专家模式（高品质），高表现模式，生成视频质量更佳</p><p>不同模型版本、视频模式支持范围不同</p><ul><li>v1.6：首尾帧与仅首帧情况下只支持pro</li><li>v2.0、v3.0 ：无需配置</li><li>v2.1、v2.5、v2.6：首尾帧情况下只支持pro</li></ul>
     * @param Mode <p>生成视频的模式<br>枚举值：std，pro<br>其中std：标准模式（标准），基础模式，性价比高<br>其中pro：专家模式（高品质），高表现模式，生成视频质量更佳</p><p>不同模型版本、视频模式支持范围不同</p><ul><li>v1.6：首尾帧与仅首帧情况下只支持pro</li><li>v2.0、v3.0 ：无需配置</li><li>v2.1、v2.5、v2.6：首尾帧情况下只支持pro</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>生成视频的自由度；值越大，模型自由度越小，与用户输入的提示词相关性越强。<br>v2.0、v2.5、v2.6模型的不支持当前参数<br>取值范围：[0, 1]</p> 
     * @return CfgScale <p>生成视频的自由度；值越大，模型自由度越小，与用户输入的提示词相关性越强。<br>v2.0、v2.5、v2.6模型的不支持当前参数<br>取值范围：[0, 1]</p>
     */
    public Float getCfgScale() {
        return this.CfgScale;
    }

    /**
     * Set <p>生成视频的自由度；值越大，模型自由度越小，与用户输入的提示词相关性越强。<br>v2.0、v2.5、v2.6模型的不支持当前参数<br>取值范围：[0, 1]</p>
     * @param CfgScale <p>生成视频的自由度；值越大，模型自由度越小，与用户输入的提示词相关性越强。<br>v2.0、v2.5、v2.6模型的不支持当前参数<br>取值范围：[0, 1]</p>
     */
    public void setCfgScale(Float CfgScale) {
        this.CfgScale = CfgScale;
    }

    /**
     * Get <p>生成视频时是否同时生成声音<br>枚举值：on，off<br>不同模型版本、视频模式支持范围不同</p><ul><li>v2.6：有首尾帧的pro模式只能生成无声的视频</li></ul> 
     * @return Sound <p>生成视频时是否同时生成声音<br>枚举值：on，off<br>不同模型版本、视频模式支持范围不同</p><ul><li>v2.6：有首尾帧的pro模式只能生成无声的视频</li></ul>
     */
    public String getSound() {
        return this.Sound;
    }

    /**
     * Set <p>生成视频时是否同时生成声音<br>枚举值：on，off<br>不同模型版本、视频模式支持范围不同</p><ul><li>v2.6：有首尾帧的pro模式只能生成无声的视频</li></ul>
     * @param Sound <p>生成视频时是否同时生成声音<br>枚举值：on，off<br>不同模型版本、视频模式支持范围不同</p><ul><li>v2.6：有首尾帧的pro模式只能生成无声的视频</li></ul>
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
     * Get <p>是否生成多镜头视频</p><ul><li>当前参数为true时，Prompt参数无效，且不支持设定首尾帧生视频</li><li>当前参数为false时，ShotType参数及MultiPrompt参数无效</li></ul> 
     * @return MultiShot <p>是否生成多镜头视频</p><ul><li>当前参数为true时，Prompt参数无效，且不支持设定首尾帧生视频</li><li>当前参数为false时，ShotType参数及MultiPrompt参数无效</li></ul>
     */
    public Boolean getMultiShot() {
        return this.MultiShot;
    }

    /**
     * Set <p>是否生成多镜头视频</p><ul><li>当前参数为true时，Prompt参数无效，且不支持设定首尾帧生视频</li><li>当前参数为false时，ShotType参数及MultiPrompt参数无效</li></ul>
     * @param MultiShot <p>是否生成多镜头视频</p><ul><li>当前参数为true时，Prompt参数无效，且不支持设定首尾帧生视频</li><li>当前参数为false时，ShotType参数及MultiPrompt参数无效</li></ul>
     */
    public void setMultiShot(Boolean MultiShot) {
        this.MultiShot = MultiShot;
    }

    /**
     * Get <p>分镜方式</p><ul><li>枚举值：customize，intelligence</li><li>当MultiShot参数为true时，当前参数必填</li></ul> 
     * @return ShotType <p>分镜方式</p><ul><li>枚举值：customize，intelligence</li><li>当MultiShot参数为true时，当前参数必填</li></ul>
     */
    public String getShotType() {
        return this.ShotType;
    }

    /**
     * Set <p>分镜方式</p><ul><li>枚举值：customize，intelligence</li><li>当MultiShot参数为true时，当前参数必填</li></ul>
     * @param ShotType <p>分镜方式</p><ul><li>枚举值：customize，intelligence</li><li>当MultiShot参数为true时，当前参数必填</li></ul>
     */
    public void setShotType(String ShotType) {
        this.ShotType = ShotType;
    }

    /**
     * Get <p>各分镜信息，如提示词、时长等<br>通过Index、Prompt、Duration参数定义分镜序号及相应提示词和时长，其中：</p><ul><li>最多支持6个分镜，最小支持1个分镜</li><li>每个分镜相关内容的最大长度不超过512</li><li>每个分镜的时长不大于当前任务的总时长，不小于1</li><li>所有分镜的时长之和等于当前任务的总时长</li></ul><p>用key:value承载，如下：<br>&quot;MultiPrompt&quot;:[<br>    {<br>      &quot;Index&quot;:int,<br>    &quot;Prompt&quot;: &quot;string&quot;,<br>    &quot;Duration&quot;: &quot;5&quot;<br>  },<br>  {<br>      &quot;Index&quot;:int,<br>    &quot;Prompt&quot;: &quot;string&quot;,<br>    &quot;Duration&quot;: &quot;5&quot;<br>  }<br>]</p><ul><li>当MultiShot参数为true且ShotType参数为customize时，当前参数不得为空</li></ul> 
     * @return MultiPrompt <p>各分镜信息，如提示词、时长等<br>通过Index、Prompt、Duration参数定义分镜序号及相应提示词和时长，其中：</p><ul><li>最多支持6个分镜，最小支持1个分镜</li><li>每个分镜相关内容的最大长度不超过512</li><li>每个分镜的时长不大于当前任务的总时长，不小于1</li><li>所有分镜的时长之和等于当前任务的总时长</li></ul><p>用key:value承载，如下：<br>&quot;MultiPrompt&quot;:[<br>    {<br>      &quot;Index&quot;:int,<br>    &quot;Prompt&quot;: &quot;string&quot;,<br>    &quot;Duration&quot;: &quot;5&quot;<br>  },<br>  {<br>      &quot;Index&quot;:int,<br>    &quot;Prompt&quot;: &quot;string&quot;,<br>    &quot;Duration&quot;: &quot;5&quot;<br>  }<br>]</p><ul><li>当MultiShot参数为true且ShotType参数为customize时，当前参数不得为空</li></ul>
     */
    public MultiPrompt [] getMultiPrompt() {
        return this.MultiPrompt;
    }

    /**
     * Set <p>各分镜信息，如提示词、时长等<br>通过Index、Prompt、Duration参数定义分镜序号及相应提示词和时长，其中：</p><ul><li>最多支持6个分镜，最小支持1个分镜</li><li>每个分镜相关内容的最大长度不超过512</li><li>每个分镜的时长不大于当前任务的总时长，不小于1</li><li>所有分镜的时长之和等于当前任务的总时长</li></ul><p>用key:value承载，如下：<br>&quot;MultiPrompt&quot;:[<br>    {<br>      &quot;Index&quot;:int,<br>    &quot;Prompt&quot;: &quot;string&quot;,<br>    &quot;Duration&quot;: &quot;5&quot;<br>  },<br>  {<br>      &quot;Index&quot;:int,<br>    &quot;Prompt&quot;: &quot;string&quot;,<br>    &quot;Duration&quot;: &quot;5&quot;<br>  }<br>]</p><ul><li>当MultiShot参数为true且ShotType参数为customize时，当前参数不得为空</li></ul>
     * @param MultiPrompt <p>各分镜信息，如提示词、时长等<br>通过Index、Prompt、Duration参数定义分镜序号及相应提示词和时长，其中：</p><ul><li>最多支持6个分镜，最小支持1个分镜</li><li>每个分镜相关内容的最大长度不超过512</li><li>每个分镜的时长不大于当前任务的总时长，不小于1</li><li>所有分镜的时长之和等于当前任务的总时长</li></ul><p>用key:value承载，如下：<br>&quot;MultiPrompt&quot;:[<br>    {<br>      &quot;Index&quot;:int,<br>    &quot;Prompt&quot;: &quot;string&quot;,<br>    &quot;Duration&quot;: &quot;5&quot;<br>  },<br>  {<br>      &quot;Index&quot;:int,<br>    &quot;Prompt&quot;: &quot;string&quot;,<br>    &quot;Duration&quot;: &quot;5&quot;<br>  }<br>]</p><ul><li>当MultiShot参数为true且ShotType参数为customize时，当前参数不得为空</li></ul>
     */
    public void setMultiPrompt(MultiPrompt [] MultiPrompt) {
        this.MultiPrompt = MultiPrompt;
    }

    /**
     * Get <p>参考主体列表</p><ul><li><p>基于主体库中主体的ID配置，用key:value承载，如下：</p><pre><code>  &quot;ElementList&quot;:[      {         &quot;ElementId&quot;:long    },    {         &quot;ElementId&quot;:long    }  ]</code></pre></li><li><p>最多支持3个参考主体</p></li><li><p>主体分为视频定制主体（简称：视频角色主体）和图片定制主体（简称：多图主体），适用范围不同，请注意区分</p></li><li><p>更多主体信息详见：可灵「主体库 3.0」使用指南</p></li></ul> 
     * @return ElementList <p>参考主体列表</p><ul><li><p>基于主体库中主体的ID配置，用key:value承载，如下：</p><pre><code>  &quot;ElementList&quot;:[      {         &quot;ElementId&quot;:long    },    {         &quot;ElementId&quot;:long    }  ]</code></pre></li><li><p>最多支持3个参考主体</p></li><li><p>主体分为视频定制主体（简称：视频角色主体）和图片定制主体（简称：多图主体），适用范围不同，请注意区分</p></li><li><p>更多主体信息详见：可灵「主体库 3.0」使用指南</p></li></ul>
     */
    public Element [] getElementList() {
        return this.ElementList;
    }

    /**
     * Set <p>参考主体列表</p><ul><li><p>基于主体库中主体的ID配置，用key:value承载，如下：</p><pre><code>  &quot;ElementList&quot;:[      {         &quot;ElementId&quot;:long    },    {         &quot;ElementId&quot;:long    }  ]</code></pre></li><li><p>最多支持3个参考主体</p></li><li><p>主体分为视频定制主体（简称：视频角色主体）和图片定制主体（简称：多图主体），适用范围不同，请注意区分</p></li><li><p>更多主体信息详见：可灵「主体库 3.0」使用指南</p></li></ul>
     * @param ElementList <p>参考主体列表</p><ul><li><p>基于主体库中主体的ID配置，用key:value承载，如下：</p><pre><code>  &quot;ElementList&quot;:[      {         &quot;ElementId&quot;:long    },    {         &quot;ElementId&quot;:long    }  ]</code></pre></li><li><p>最多支持3个参考主体</p></li><li><p>主体分为视频定制主体（简称：视频角色主体）和图片定制主体（简称：多图主体），适用范围不同，请注意区分</p></li><li><p>更多主体信息详见：可灵「主体库 3.0」使用指南</p></li></ul>
     */
    public void setElementList(Element [] ElementList) {
        this.ElementList = ElementList;
    }

    /**
     * Get <p>静态笔刷涂抹区域（用户通过运动笔刷涂抹的 mask 图片）<br>“运动笔刷”能力包含“动态笔刷 DynamicMasks”和“静态笔刷 StaticMask”两种<br>支持传入图片Base64编码或图片URL（确保可访问，格式要求同 Image 字段）<br>图片格式支持.jpg / .jpeg / .png<br>图片长宽比必须与输入图片相同（即Image字段），否则任务失败（failed）<br>StaticMask和 DynamicMasks.Mask这两张图片的分辨率必须一致，否则任务失败（failed）</p> 
     * @return StaticMask <p>静态笔刷涂抹区域（用户通过运动笔刷涂抹的 mask 图片）<br>“运动笔刷”能力包含“动态笔刷 DynamicMasks”和“静态笔刷 StaticMask”两种<br>支持传入图片Base64编码或图片URL（确保可访问，格式要求同 Image 字段）<br>图片格式支持.jpg / .jpeg / .png<br>图片长宽比必须与输入图片相同（即Image字段），否则任务失败（failed）<br>StaticMask和 DynamicMasks.Mask这两张图片的分辨率必须一致，否则任务失败（failed）</p>
     */
    public String getStaticMask() {
        return this.StaticMask;
    }

    /**
     * Set <p>静态笔刷涂抹区域（用户通过运动笔刷涂抹的 mask 图片）<br>“运动笔刷”能力包含“动态笔刷 DynamicMasks”和“静态笔刷 StaticMask”两种<br>支持传入图片Base64编码或图片URL（确保可访问，格式要求同 Image 字段）<br>图片格式支持.jpg / .jpeg / .png<br>图片长宽比必须与输入图片相同（即Image字段），否则任务失败（failed）<br>StaticMask和 DynamicMasks.Mask这两张图片的分辨率必须一致，否则任务失败（failed）</p>
     * @param StaticMask <p>静态笔刷涂抹区域（用户通过运动笔刷涂抹的 mask 图片）<br>“运动笔刷”能力包含“动态笔刷 DynamicMasks”和“静态笔刷 StaticMask”两种<br>支持传入图片Base64编码或图片URL（确保可访问，格式要求同 Image 字段）<br>图片格式支持.jpg / .jpeg / .png<br>图片长宽比必须与输入图片相同（即Image字段），否则任务失败（failed）<br>StaticMask和 DynamicMasks.Mask这两张图片的分辨率必须一致，否则任务失败（failed）</p>
     */
    public void setStaticMask(String StaticMask) {
        this.StaticMask = StaticMask;
    }

    /**
     * Get <p>动态笔刷配置列表<br>可配置多组（最多6组），每组包含“涂抹区域 Mask”与“运动轨迹 Trajectories”序列</p> 
     * @return DynamicMasks <p>动态笔刷配置列表<br>可配置多组（最多6组），每组包含“涂抹区域 Mask”与“运动轨迹 Trajectories”序列</p>
     */
    public DynamicMask [] getDynamicMasks() {
        return this.DynamicMasks;
    }

    /**
     * Set <p>动态笔刷配置列表<br>可配置多组（最多6组），每组包含“涂抹区域 Mask”与“运动轨迹 Trajectories”序列</p>
     * @param DynamicMasks <p>动态笔刷配置列表<br>可配置多组（最多6组），每组包含“涂抹区域 Mask”与“运动轨迹 Trajectories”序列</p>
     */
    public void setDynamicMasks(DynamicMask [] DynamicMasks) {
        this.DynamicMasks = DynamicMasks;
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
     * Get <p>生成视频时所引用的音色的列表</p><p>一次视频生成任务至多引用2个音色<br>当VoiceList参数不为空且Prompt参数中引用音色ID时，视频生成任务按“有指定音色”计量计费<br>VoiceId参数值通过音色定制接口返回，也可使用系统预置音色，详见音色定制相关API；非对口型API的VoiceId<br>ElementList参数与VoiceList参数互斥，不能共存<br>v3模型不支持指定音色<br>用key:value承载，如下：<br>&quot;VoiceList&quot;:[<br>  {&quot;VoiceId&quot;:&quot;VoiceId_1&quot;},<br>  {&quot;VoiceId&quot;:&quot;VoiceId_2&quot;}<br>]</p> 
     * @return VoiceList <p>生成视频时所引用的音色的列表</p><p>一次视频生成任务至多引用2个音色<br>当VoiceList参数不为空且Prompt参数中引用音色ID时，视频生成任务按“有指定音色”计量计费<br>VoiceId参数值通过音色定制接口返回，也可使用系统预置音色，详见音色定制相关API；非对口型API的VoiceId<br>ElementList参数与VoiceList参数互斥，不能共存<br>v3模型不支持指定音色<br>用key:value承载，如下：<br>&quot;VoiceList&quot;:[<br>  {&quot;VoiceId&quot;:&quot;VoiceId_1&quot;},<br>  {&quot;VoiceId&quot;:&quot;VoiceId_2&quot;}<br>]</p>
     */
    public Voice [] getVoiceList() {
        return this.VoiceList;
    }

    /**
     * Set <p>生成视频时所引用的音色的列表</p><p>一次视频生成任务至多引用2个音色<br>当VoiceList参数不为空且Prompt参数中引用音色ID时，视频生成任务按“有指定音色”计量计费<br>VoiceId参数值通过音色定制接口返回，也可使用系统预置音色，详见音色定制相关API；非对口型API的VoiceId<br>ElementList参数与VoiceList参数互斥，不能共存<br>v3模型不支持指定音色<br>用key:value承载，如下：<br>&quot;VoiceList&quot;:[<br>  {&quot;VoiceId&quot;:&quot;VoiceId_1&quot;},<br>  {&quot;VoiceId&quot;:&quot;VoiceId_2&quot;}<br>]</p>
     * @param VoiceList <p>生成视频时所引用的音色的列表</p><p>一次视频生成任务至多引用2个音色<br>当VoiceList参数不为空且Prompt参数中引用音色ID时，视频生成任务按“有指定音色”计量计费<br>VoiceId参数值通过音色定制接口返回，也可使用系统预置音色，详见音色定制相关API；非对口型API的VoiceId<br>ElementList参数与VoiceList参数互斥，不能共存<br>v3模型不支持指定音色<br>用key:value承载，如下：<br>&quot;VoiceList&quot;:[<br>  {&quot;VoiceId&quot;:&quot;VoiceId_1&quot;},<br>  {&quot;VoiceId&quot;:&quot;VoiceId_2&quot;}<br>]</p>
     */
    public void setVoiceList(Voice [] VoiceList) {
        this.VoiceList = VoiceList;
    }

    public SubmitImageToVideoJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitImageToVideoJobRequest(SubmitImageToVideoJobRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Image != null) {
            this.Image = new Image(source.Image);
        }
        if (source.ImageTail != null) {
            this.ImageTail = new Image(source.ImageTail);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
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
        if (source.ElementList != null) {
            this.ElementList = new Element[source.ElementList.length];
            for (int i = 0; i < source.ElementList.length; i++) {
                this.ElementList[i] = new Element(source.ElementList[i]);
            }
        }
        if (source.StaticMask != null) {
            this.StaticMask = new String(source.StaticMask);
        }
        if (source.DynamicMasks != null) {
            this.DynamicMasks = new DynamicMask[source.DynamicMasks.length];
            for (int i = 0; i < source.DynamicMasks.length; i++) {
                this.DynamicMasks[i] = new DynamicMask(source.DynamicMasks[i]);
            }
        }
        if (source.CameraControl != null) {
            this.CameraControl = new CameraControl(source.CameraControl);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.VoiceList != null) {
            this.VoiceList = new Voice[source.VoiceList.length];
            for (int i = 0; i < source.VoiceList.length; i++) {
                this.VoiceList[i] = new Voice(source.VoiceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamObj(map, prefix + "ImageTail.", this.ImageTail);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "CfgScale", this.CfgScale);
        this.setParamSimple(map, prefix + "Sound", this.Sound);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);
        this.setParamSimple(map, prefix + "MultiShot", this.MultiShot);
        this.setParamSimple(map, prefix + "ShotType", this.ShotType);
        this.setParamArrayObj(map, prefix + "MultiPrompt.", this.MultiPrompt);
        this.setParamArrayObj(map, prefix + "ElementList.", this.ElementList);
        this.setParamSimple(map, prefix + "StaticMask", this.StaticMask);
        this.setParamArrayObj(map, prefix + "DynamicMasks.", this.DynamicMasks);
        this.setParamObj(map, prefix + "CameraControl.", this.CameraControl);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamArrayObj(map, prefix + "VoiceList.", this.VoiceList);

    }
}

