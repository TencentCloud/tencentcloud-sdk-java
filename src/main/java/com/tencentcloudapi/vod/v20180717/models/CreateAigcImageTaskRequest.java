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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcImageTaskRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>模型名称。取值：</p><li>GG</li><li>SI</li><li>Qwen</li><li>Hunyuan</li><li>Vidu</li><li>Kling</li>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型版本。取值：</p><li>当 ModelName 是 GG，可选值为 2.5、3.0、3.1；</li><li>当 ModelName 是 Jimeng，可选值为 4.0；</li><li>当 ModelName 是 SI，可选值为 4.0、4.5、5.0-lite；</li><li>当 ModelName 是 Qwen，可选值为 0925；</li><li>当 ModelName 是 Hunyuan，可选值为 3.0；</li><li>当 ModelName 是 Vidu，可选值为 q2；</li><li>当 ModelName 是 Kling，可选值为 2.1、3.0、3.0-Omni；</li>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>AIGC 生图任务的输入图片的文件信息。各模型支持最大参考图数量：</p><ul><li>GG 2.5： 3张；</li><li>GG 3.0：14张；</li><li>GG 3.1：14张；</li><li>Kling 2.1：4张；</li><li>Kling 3.0：1张；</li><li>Kling 3.0-Omni：10张；</li><li>SI 4.0：14张；</li><li>SI 4.5：14张；</li><li>SI 5.0-lite：14张；</li><li>Vidu q2：7张；</li><li>Hunyuan 3.0：3张；</li><li>Qwen 0925：1张；</li><li>MJ v7：3张。</li></ul>
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcImageTaskInputFileInfo [] FileInfos;

    /**
    * <p>生成图片的提示词。当 FileInfos 为空时，此参数必填。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>要阻止模型生成图片的提示词。</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * <p>生图任务的输出媒体文件配置。</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcImageOutputConfig OutputConfig;

    /**
    * <p>输入的区域信息。可选值：</p><ul><li>Mainland：中国大陆；</li><li>Oversea：海外；</li><li>OverseaUSWest：海外-美西；</li></ul>
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * <p>保留字段，特殊用途时使用。</p><ul><li><p>Hunyuan 3.0</p><ul><li>支持自由设置分辨率宽高，宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024x1024 像素。示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728x1024\&quot;}&quot;}</code></li></ul></li><li><p>SI 系列</p><ul><li>支持自由设置分辨率宽高：<ul><li>SI 4.0：合法总像素范围 [1280x720=921600, 4096x4096=16777216]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728x1356\&quot;}&quot;}</code></li><li>SI 4.5：合法总像素范围 [2560x1440=3686400, 4096x4096=16777216]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;2560x1440\&quot;}&quot;}</code></li><li>SI 5.0-lite：合法总像素范围 [2560x1440=3686400, 3072x3072x1.1025=10404496]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;2560x1440\&quot;}&quot;}</code></li></ul></li><li>可用于开启输出多张图像，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;sequential_image_generation\&quot;:\&quot;auto\&quot;}&quot;}</code>。除此之外，还需要在<code>Prompt</code>中说明需要输出图片张数，如：输出3张图片。</li></ul></li><li><p>Qwen 0925</p><ul><li>支持自由设置分辨率宽高，合法总像素范围 [512x512=261632, 2048x2048=4194304]。示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728*1024\&quot;}&quot;}</code></li></ul></li></ul>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>模型名称。取值：</p><li>GG</li><li>SI</li><li>Qwen</li><li>Hunyuan</li><li>Vidu</li><li>Kling</li> 
     * @return ModelName <p>模型名称。取值：</p><li>GG</li><li>SI</li><li>Qwen</li><li>Hunyuan</li><li>Vidu</li><li>Kling</li>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称。取值：</p><li>GG</li><li>SI</li><li>Qwen</li><li>Hunyuan</li><li>Vidu</li><li>Kling</li>
     * @param ModelName <p>模型名称。取值：</p><li>GG</li><li>SI</li><li>Qwen</li><li>Hunyuan</li><li>Vidu</li><li>Kling</li>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型版本。取值：</p><li>当 ModelName 是 GG，可选值为 2.5、3.0、3.1；</li><li>当 ModelName 是 Jimeng，可选值为 4.0；</li><li>当 ModelName 是 SI，可选值为 4.0、4.5、5.0-lite；</li><li>当 ModelName 是 Qwen，可选值为 0925；</li><li>当 ModelName 是 Hunyuan，可选值为 3.0；</li><li>当 ModelName 是 Vidu，可选值为 q2；</li><li>当 ModelName 是 Kling，可选值为 2.1、3.0、3.0-Omni；</li> 
     * @return ModelVersion <p>模型版本。取值：</p><li>当 ModelName 是 GG，可选值为 2.5、3.0、3.1；</li><li>当 ModelName 是 Jimeng，可选值为 4.0；</li><li>当 ModelName 是 SI，可选值为 4.0、4.5、5.0-lite；</li><li>当 ModelName 是 Qwen，可选值为 0925；</li><li>当 ModelName 是 Hunyuan，可选值为 3.0；</li><li>当 ModelName 是 Vidu，可选值为 q2；</li><li>当 ModelName 是 Kling，可选值为 2.1、3.0、3.0-Omni；</li>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本。取值：</p><li>当 ModelName 是 GG，可选值为 2.5、3.0、3.1；</li><li>当 ModelName 是 Jimeng，可选值为 4.0；</li><li>当 ModelName 是 SI，可选值为 4.0、4.5、5.0-lite；</li><li>当 ModelName 是 Qwen，可选值为 0925；</li><li>当 ModelName 是 Hunyuan，可选值为 3.0；</li><li>当 ModelName 是 Vidu，可选值为 q2；</li><li>当 ModelName 是 Kling，可选值为 2.1、3.0、3.0-Omni；</li>
     * @param ModelVersion <p>模型版本。取值：</p><li>当 ModelName 是 GG，可选值为 2.5、3.0、3.1；</li><li>当 ModelName 是 Jimeng，可选值为 4.0；</li><li>当 ModelName 是 SI，可选值为 4.0、4.5、5.0-lite；</li><li>当 ModelName 是 Qwen，可选值为 0925；</li><li>当 ModelName 是 Hunyuan，可选值为 3.0；</li><li>当 ModelName 是 Vidu，可选值为 q2；</li><li>当 ModelName 是 Kling，可选值为 2.1、3.0、3.0-Omni；</li>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>AIGC 生图任务的输入图片的文件信息。各模型支持最大参考图数量：</p><ul><li>GG 2.5： 3张；</li><li>GG 3.0：14张；</li><li>GG 3.1：14张；</li><li>Kling 2.1：4张；</li><li>Kling 3.0：1张；</li><li>Kling 3.0-Omni：10张；</li><li>SI 4.0：14张；</li><li>SI 4.5：14张；</li><li>SI 5.0-lite：14张；</li><li>Vidu q2：7张；</li><li>Hunyuan 3.0：3张；</li><li>Qwen 0925：1张；</li><li>MJ v7：3张。</li></ul> 
     * @return FileInfos <p>AIGC 生图任务的输入图片的文件信息。各模型支持最大参考图数量：</p><ul><li>GG 2.5： 3张；</li><li>GG 3.0：14张；</li><li>GG 3.1：14张；</li><li>Kling 2.1：4张；</li><li>Kling 3.0：1张；</li><li>Kling 3.0-Omni：10张；</li><li>SI 4.0：14张；</li><li>SI 4.5：14张；</li><li>SI 5.0-lite：14张；</li><li>Vidu q2：7张；</li><li>Hunyuan 3.0：3张；</li><li>Qwen 0925：1张；</li><li>MJ v7：3张。</li></ul>
     */
    public AigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>AIGC 生图任务的输入图片的文件信息。各模型支持最大参考图数量：</p><ul><li>GG 2.5： 3张；</li><li>GG 3.0：14张；</li><li>GG 3.1：14张；</li><li>Kling 2.1：4张；</li><li>Kling 3.0：1张；</li><li>Kling 3.0-Omni：10张；</li><li>SI 4.0：14张；</li><li>SI 4.5：14张；</li><li>SI 5.0-lite：14张；</li><li>Vidu q2：7张；</li><li>Hunyuan 3.0：3张；</li><li>Qwen 0925：1张；</li><li>MJ v7：3张。</li></ul>
     * @param FileInfos <p>AIGC 生图任务的输入图片的文件信息。各模型支持最大参考图数量：</p><ul><li>GG 2.5： 3张；</li><li>GG 3.0：14张；</li><li>GG 3.1：14张；</li><li>Kling 2.1：4张；</li><li>Kling 3.0：1张；</li><li>Kling 3.0-Omni：10张；</li><li>SI 4.0：14张；</li><li>SI 4.5：14张；</li><li>SI 5.0-lite：14张；</li><li>Vidu q2：7张；</li><li>Hunyuan 3.0：3张；</li><li>Qwen 0925：1张；</li><li>MJ v7：3张。</li></ul>
     */
    public void setFileInfos(AigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>生成图片的提示词。当 FileInfos 为空时，此参数必填。</p> 
     * @return Prompt <p>生成图片的提示词。当 FileInfos 为空时，此参数必填。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>生成图片的提示词。当 FileInfos 为空时，此参数必填。</p>
     * @param Prompt <p>生成图片的提示词。当 FileInfos 为空时，此参数必填。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>要阻止模型生成图片的提示词。</p> 
     * @return NegativePrompt <p>要阻止模型生成图片的提示词。</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>要阻止模型生成图片的提示词。</p>
     * @param NegativePrompt <p>要阻止模型生成图片的提示词。</p>
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get <p>是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p> 
     * @return EnhancePrompt <p>是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set <p>是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     * @param EnhancePrompt <p>是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li></p>
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get <p>生图任务的输出媒体文件配置。</p> 
     * @return OutputConfig <p>生图任务的输出媒体文件配置。</p>
     */
    public AigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>生图任务的输出媒体文件配置。</p>
     * @param OutputConfig <p>生图任务的输出媒体文件配置。</p>
     */
    public void setOutputConfig(AigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get <p>输入的区域信息。可选值：</p><ul><li>Mainland：中国大陆；</li><li>Oversea：海外；</li><li>OverseaUSWest：海外-美西；</li></ul> 
     * @return InputRegion <p>输入的区域信息。可选值：</p><ul><li>Mainland：中国大陆；</li><li>Oversea：海外；</li><li>OverseaUSWest：海外-美西；</li></ul>
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set <p>输入的区域信息。可选值：</p><ul><li>Mainland：中国大陆；</li><li>Oversea：海外；</li><li>OverseaUSWest：海外-美西；</li></ul>
     * @param InputRegion <p>输入的区域信息。可选值：</p><ul><li>Mainland：中国大陆；</li><li>Oversea：海外；</li><li>OverseaUSWest：海外-美西；</li></ul>
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p> 
     * @return SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     * @param SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p> 
     * @return TasksPriority <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     * @param TasksPriority <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get <p>保留字段，特殊用途时使用。</p><ul><li><p>Hunyuan 3.0</p><ul><li>支持自由设置分辨率宽高，宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024x1024 像素。示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728x1024\&quot;}&quot;}</code></li></ul></li><li><p>SI 系列</p><ul><li>支持自由设置分辨率宽高：<ul><li>SI 4.0：合法总像素范围 [1280x720=921600, 4096x4096=16777216]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728x1356\&quot;}&quot;}</code></li><li>SI 4.5：合法总像素范围 [2560x1440=3686400, 4096x4096=16777216]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;2560x1440\&quot;}&quot;}</code></li><li>SI 5.0-lite：合法总像素范围 [2560x1440=3686400, 3072x3072x1.1025=10404496]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;2560x1440\&quot;}&quot;}</code></li></ul></li><li>可用于开启输出多张图像，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;sequential_image_generation\&quot;:\&quot;auto\&quot;}&quot;}</code>。除此之外，还需要在<code>Prompt</code>中说明需要输出图片张数，如：输出3张图片。</li></ul></li><li><p>Qwen 0925</p><ul><li>支持自由设置分辨率宽高，合法总像素范围 [512x512=261632, 2048x2048=4194304]。示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728*1024\&quot;}&quot;}</code></li></ul></li></ul> 
     * @return ExtInfo <p>保留字段，特殊用途时使用。</p><ul><li><p>Hunyuan 3.0</p><ul><li>支持自由设置分辨率宽高，宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024x1024 像素。示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728x1024\&quot;}&quot;}</code></li></ul></li><li><p>SI 系列</p><ul><li>支持自由设置分辨率宽高：<ul><li>SI 4.0：合法总像素范围 [1280x720=921600, 4096x4096=16777216]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728x1356\&quot;}&quot;}</code></li><li>SI 4.5：合法总像素范围 [2560x1440=3686400, 4096x4096=16777216]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;2560x1440\&quot;}&quot;}</code></li><li>SI 5.0-lite：合法总像素范围 [2560x1440=3686400, 3072x3072x1.1025=10404496]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;2560x1440\&quot;}&quot;}</code></li></ul></li><li>可用于开启输出多张图像，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;sequential_image_generation\&quot;:\&quot;auto\&quot;}&quot;}</code>。除此之外，还需要在<code>Prompt</code>中说明需要输出图片张数，如：输出3张图片。</li></ul></li><li><p>Qwen 0925</p><ul><li>支持自由设置分辨率宽高，合法总像素范围 [512x512=261632, 2048x2048=4194304]。示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728*1024\&quot;}&quot;}</code></li></ul></li></ul>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>保留字段，特殊用途时使用。</p><ul><li><p>Hunyuan 3.0</p><ul><li>支持自由设置分辨率宽高，宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024x1024 像素。示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728x1024\&quot;}&quot;}</code></li></ul></li><li><p>SI 系列</p><ul><li>支持自由设置分辨率宽高：<ul><li>SI 4.0：合法总像素范围 [1280x720=921600, 4096x4096=16777216]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728x1356\&quot;}&quot;}</code></li><li>SI 4.5：合法总像素范围 [2560x1440=3686400, 4096x4096=16777216]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;2560x1440\&quot;}&quot;}</code></li><li>SI 5.0-lite：合法总像素范围 [2560x1440=3686400, 3072x3072x1.1025=10404496]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;2560x1440\&quot;}&quot;}</code></li></ul></li><li>可用于开启输出多张图像，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;sequential_image_generation\&quot;:\&quot;auto\&quot;}&quot;}</code>。除此之外，还需要在<code>Prompt</code>中说明需要输出图片张数，如：输出3张图片。</li></ul></li><li><p>Qwen 0925</p><ul><li>支持自由设置分辨率宽高，合法总像素范围 [512x512=261632, 2048x2048=4194304]。示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728*1024\&quot;}&quot;}</code></li></ul></li></ul>
     * @param ExtInfo <p>保留字段，特殊用途时使用。</p><ul><li><p>Hunyuan 3.0</p><ul><li>支持自由设置分辨率宽高，宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024x1024 像素。示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728x1024\&quot;}&quot;}</code></li></ul></li><li><p>SI 系列</p><ul><li>支持自由设置分辨率宽高：<ul><li>SI 4.0：合法总像素范围 [1280x720=921600, 4096x4096=16777216]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728x1356\&quot;}&quot;}</code></li><li>SI 4.5：合法总像素范围 [2560x1440=3686400, 4096x4096=16777216]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;2560x1440\&quot;}&quot;}</code></li><li>SI 5.0-lite：合法总像素范围 [2560x1440=3686400, 3072x3072x1.1025=10404496]，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;2560x1440\&quot;}&quot;}</code></li></ul></li><li>可用于开启输出多张图像，示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;sequential_image_generation\&quot;:\&quot;auto\&quot;}&quot;}</code>。除此之外，还需要在<code>Prompt</code>中说明需要输出图片张数，如：输出3张图片。</li></ul></li><li><p>Qwen 0925</p><ul><li>支持自由设置分辨率宽高，合法总像素范围 [512x512=261632, 2048x2048=4194304]。示例：<code>{&quot;AdditionalParameters&quot;: &quot;{\&quot;size\&quot;:\&quot;728*1024\&quot;}&quot;}</code></li></ul></li></ul>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CreateAigcImageTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcImageTaskRequest(CreateAigcImageTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new AigcImageTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcImageTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new String(source.EnhancePrompt);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcImageOutputConfig(source.OutputConfig);
        }
        if (source.InputRegion != null) {
            this.InputRegion = new String(source.InputRegion);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

