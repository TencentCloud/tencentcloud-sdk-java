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

public class CreateAigcVideoTaskRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 模型名称。取值：<li>Hailuo：海螺；</li><li>Kling：可灵；</li><li> Jimeng：即梦；</li><li>Vidu；</li><li>GV：Google Veo；</li><li>OS：OpenAI Sora；</li><li>Hunyuan：混元；</li><li>Mingmou：明眸；</li>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型版本。取值：<li>当 ModelName 是 Hailuo，可选值为 02、2.3、2.3-fast；</li><li>当 ModelName 是 Kling，可选值为 1.6、2.0、2.1、2.5、O1；</li><li>当 ModelName 是 Jimeng，可选值为 3.0pro；</li><li>当 ModelName 是 Vidu，可选值为 q2、q2-pro、q2-turbo；</li><li>当 ModelName 是 GV，可选值为 3.1、3.1-Fast；</li><li>当 ModelName 是 OS，可选值为 2.0；</li><li>当 ModelName 是 Hunyuan，可选值为 1.5；</li><li>当 ModelName 是 Mingmou，可选值为 1.0；</li>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * AIGC 生视频任务的输入图片的文件信息。说明
1. 当 ModelName 是 GV 时，最大长度为 3；其他情况下最大长度为1。
2. 当 ModelName 是 GV 时，并且长度大于1时，则不能再指定 LastFrameFileId 参数。
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcVideoTaskInputFileInfo [] FileInfos;

    /**
    * 用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。说明：
1. 只支持模型 GV 、Kling、Vidu，其他模型暂不支持。当 ModelName 为 GV 时，如果指定该参数，则需同时指定 FileInfos 作为待生成视频的首帧。当 ModelName 为 Kling 、ModelVersion 为 2.1 并且指定输出分辨率 Resolution 为 1080P 时，才能指定该参数。当 ModelName 为 Vidu、ModelVersion 为 q2-pro、q2-turbo 时，才能指定该参数。
2. 图片大小需小于5M。
3. 图片格式的取值为：jpeg，jpg, png, webp。
    */
    @SerializedName("LastFrameFileId")
    @Expose
    private String LastFrameFileId;

    /**
    * 用于作为尾帧画面来生成视频的媒体文件 URL。说明：
1. 只支持模型 GV 、Kling、Vidu，其他模型暂不支持。当 ModelName 为 GV 时，如果指定该参数，则需同时指定 FileInfos 作为待生成视频的首帧。当 ModelName 为 Kling 、ModelVersion 为 2.1 并且指定输出分辨率 Resolution 为 1080P 时，才能指定该参数。当 ModelName 为 Vidu、ModelVersion 为 q2-pro、q2-turbo 时，才能指定该参数。
2. 图片大小需小于5M。
3. 3. 图片格式的取值为：jpeg，jpg, png, webp。
    */
    @SerializedName("LastFrameUrl")
    @Expose
    private String LastFrameUrl;

    /**
    * 生成图片的提示词。当 FileInfos 为空时，此参数必填。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 要阻止模型生成图片的提示词。
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * 是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * 生视频任务的输出媒体文件配置。
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcVideoOutputConfig OutputConfig;

    /**
    * 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 保留字段，特殊用途时使用。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 模型名称。取值：<li>Hailuo：海螺；</li><li>Kling：可灵；</li><li> Jimeng：即梦；</li><li>Vidu；</li><li>GV：Google Veo；</li><li>OS：OpenAI Sora；</li><li>Hunyuan：混元；</li><li>Mingmou：明眸；</li> 
     * @return ModelName 模型名称。取值：<li>Hailuo：海螺；</li><li>Kling：可灵；</li><li> Jimeng：即梦；</li><li>Vidu；</li><li>GV：Google Veo；</li><li>OS：OpenAI Sora；</li><li>Hunyuan：混元；</li><li>Mingmou：明眸；</li>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称。取值：<li>Hailuo：海螺；</li><li>Kling：可灵；</li><li> Jimeng：即梦；</li><li>Vidu；</li><li>GV：Google Veo；</li><li>OS：OpenAI Sora；</li><li>Hunyuan：混元；</li><li>Mingmou：明眸；</li>
     * @param ModelName 模型名称。取值：<li>Hailuo：海螺；</li><li>Kling：可灵；</li><li> Jimeng：即梦；</li><li>Vidu；</li><li>GV：Google Veo；</li><li>OS：OpenAI Sora；</li><li>Hunyuan：混元；</li><li>Mingmou：明眸；</li>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 模型版本。取值：<li>当 ModelName 是 Hailuo，可选值为 02、2.3、2.3-fast；</li><li>当 ModelName 是 Kling，可选值为 1.6、2.0、2.1、2.5、O1；</li><li>当 ModelName 是 Jimeng，可选值为 3.0pro；</li><li>当 ModelName 是 Vidu，可选值为 q2、q2-pro、q2-turbo；</li><li>当 ModelName 是 GV，可选值为 3.1、3.1-Fast；</li><li>当 ModelName 是 OS，可选值为 2.0；</li><li>当 ModelName 是 Hunyuan，可选值为 1.5；</li><li>当 ModelName 是 Mingmou，可选值为 1.0；</li> 
     * @return ModelVersion 模型版本。取值：<li>当 ModelName 是 Hailuo，可选值为 02、2.3、2.3-fast；</li><li>当 ModelName 是 Kling，可选值为 1.6、2.0、2.1、2.5、O1；</li><li>当 ModelName 是 Jimeng，可选值为 3.0pro；</li><li>当 ModelName 是 Vidu，可选值为 q2、q2-pro、q2-turbo；</li><li>当 ModelName 是 GV，可选值为 3.1、3.1-Fast；</li><li>当 ModelName 是 OS，可选值为 2.0；</li><li>当 ModelName 是 Hunyuan，可选值为 1.5；</li><li>当 ModelName 是 Mingmou，可选值为 1.0；</li>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 模型版本。取值：<li>当 ModelName 是 Hailuo，可选值为 02、2.3、2.3-fast；</li><li>当 ModelName 是 Kling，可选值为 1.6、2.0、2.1、2.5、O1；</li><li>当 ModelName 是 Jimeng，可选值为 3.0pro；</li><li>当 ModelName 是 Vidu，可选值为 q2、q2-pro、q2-turbo；</li><li>当 ModelName 是 GV，可选值为 3.1、3.1-Fast；</li><li>当 ModelName 是 OS，可选值为 2.0；</li><li>当 ModelName 是 Hunyuan，可选值为 1.5；</li><li>当 ModelName 是 Mingmou，可选值为 1.0；</li>
     * @param ModelVersion 模型版本。取值：<li>当 ModelName 是 Hailuo，可选值为 02、2.3、2.3-fast；</li><li>当 ModelName 是 Kling，可选值为 1.6、2.0、2.1、2.5、O1；</li><li>当 ModelName 是 Jimeng，可选值为 3.0pro；</li><li>当 ModelName 是 Vidu，可选值为 q2、q2-pro、q2-turbo；</li><li>当 ModelName 是 GV，可选值为 3.1、3.1-Fast；</li><li>当 ModelName 是 OS，可选值为 2.0；</li><li>当 ModelName 是 Hunyuan，可选值为 1.5；</li><li>当 ModelName 是 Mingmou，可选值为 1.0；</li>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get AIGC 生视频任务的输入图片的文件信息。说明
1. 当 ModelName 是 GV 时，最大长度为 3；其他情况下最大长度为1。
2. 当 ModelName 是 GV 时，并且长度大于1时，则不能再指定 LastFrameFileId 参数。 
     * @return FileInfos AIGC 生视频任务的输入图片的文件信息。说明
1. 当 ModelName 是 GV 时，最大长度为 3；其他情况下最大长度为1。
2. 当 ModelName 是 GV 时，并且长度大于1时，则不能再指定 LastFrameFileId 参数。
     */
    public AigcVideoTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set AIGC 生视频任务的输入图片的文件信息。说明
1. 当 ModelName 是 GV 时，最大长度为 3；其他情况下最大长度为1。
2. 当 ModelName 是 GV 时，并且长度大于1时，则不能再指定 LastFrameFileId 参数。
     * @param FileInfos AIGC 生视频任务的输入图片的文件信息。说明
1. 当 ModelName 是 GV 时，最大长度为 3；其他情况下最大长度为1。
2. 当 ModelName 是 GV 时，并且长度大于1时，则不能再指定 LastFrameFileId 参数。
     */
    public void setFileInfos(AigcVideoTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get 用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。说明：
1. 只支持模型 GV 、Kling、Vidu，其他模型暂不支持。当 ModelName 为 GV 时，如果指定该参数，则需同时指定 FileInfos 作为待生成视频的首帧。当 ModelName 为 Kling 、ModelVersion 为 2.1 并且指定输出分辨率 Resolution 为 1080P 时，才能指定该参数。当 ModelName 为 Vidu、ModelVersion 为 q2-pro、q2-turbo 时，才能指定该参数。
2. 图片大小需小于5M。
3. 图片格式的取值为：jpeg，jpg, png, webp。 
     * @return LastFrameFileId 用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。说明：
1. 只支持模型 GV 、Kling、Vidu，其他模型暂不支持。当 ModelName 为 GV 时，如果指定该参数，则需同时指定 FileInfos 作为待生成视频的首帧。当 ModelName 为 Kling 、ModelVersion 为 2.1 并且指定输出分辨率 Resolution 为 1080P 时，才能指定该参数。当 ModelName 为 Vidu、ModelVersion 为 q2-pro、q2-turbo 时，才能指定该参数。
2. 图片大小需小于5M。
3. 图片格式的取值为：jpeg，jpg, png, webp。
     */
    public String getLastFrameFileId() {
        return this.LastFrameFileId;
    }

    /**
     * Set 用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。说明：
1. 只支持模型 GV 、Kling、Vidu，其他模型暂不支持。当 ModelName 为 GV 时，如果指定该参数，则需同时指定 FileInfos 作为待生成视频的首帧。当 ModelName 为 Kling 、ModelVersion 为 2.1 并且指定输出分辨率 Resolution 为 1080P 时，才能指定该参数。当 ModelName 为 Vidu、ModelVersion 为 q2-pro、q2-turbo 时，才能指定该参数。
2. 图片大小需小于5M。
3. 图片格式的取值为：jpeg，jpg, png, webp。
     * @param LastFrameFileId 用于作为尾帧画面来生成视频的媒体文件 ID。该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。说明：
1. 只支持模型 GV 、Kling、Vidu，其他模型暂不支持。当 ModelName 为 GV 时，如果指定该参数，则需同时指定 FileInfos 作为待生成视频的首帧。当 ModelName 为 Kling 、ModelVersion 为 2.1 并且指定输出分辨率 Resolution 为 1080P 时，才能指定该参数。当 ModelName 为 Vidu、ModelVersion 为 q2-pro、q2-turbo 时，才能指定该参数。
2. 图片大小需小于5M。
3. 图片格式的取值为：jpeg，jpg, png, webp。
     */
    public void setLastFrameFileId(String LastFrameFileId) {
        this.LastFrameFileId = LastFrameFileId;
    }

    /**
     * Get 用于作为尾帧画面来生成视频的媒体文件 URL。说明：
1. 只支持模型 GV 、Kling、Vidu，其他模型暂不支持。当 ModelName 为 GV 时，如果指定该参数，则需同时指定 FileInfos 作为待生成视频的首帧。当 ModelName 为 Kling 、ModelVersion 为 2.1 并且指定输出分辨率 Resolution 为 1080P 时，才能指定该参数。当 ModelName 为 Vidu、ModelVersion 为 q2-pro、q2-turbo 时，才能指定该参数。
2. 图片大小需小于5M。
3. 3. 图片格式的取值为：jpeg，jpg, png, webp。 
     * @return LastFrameUrl 用于作为尾帧画面来生成视频的媒体文件 URL。说明：
1. 只支持模型 GV 、Kling、Vidu，其他模型暂不支持。当 ModelName 为 GV 时，如果指定该参数，则需同时指定 FileInfos 作为待生成视频的首帧。当 ModelName 为 Kling 、ModelVersion 为 2.1 并且指定输出分辨率 Resolution 为 1080P 时，才能指定该参数。当 ModelName 为 Vidu、ModelVersion 为 q2-pro、q2-turbo 时，才能指定该参数。
2. 图片大小需小于5M。
3. 3. 图片格式的取值为：jpeg，jpg, png, webp。
     */
    public String getLastFrameUrl() {
        return this.LastFrameUrl;
    }

    /**
     * Set 用于作为尾帧画面来生成视频的媒体文件 URL。说明：
1. 只支持模型 GV 、Kling、Vidu，其他模型暂不支持。当 ModelName 为 GV 时，如果指定该参数，则需同时指定 FileInfos 作为待生成视频的首帧。当 ModelName 为 Kling 、ModelVersion 为 2.1 并且指定输出分辨率 Resolution 为 1080P 时，才能指定该参数。当 ModelName 为 Vidu、ModelVersion 为 q2-pro、q2-turbo 时，才能指定该参数。
2. 图片大小需小于5M。
3. 3. 图片格式的取值为：jpeg，jpg, png, webp。
     * @param LastFrameUrl 用于作为尾帧画面来生成视频的媒体文件 URL。说明：
1. 只支持模型 GV 、Kling、Vidu，其他模型暂不支持。当 ModelName 为 GV 时，如果指定该参数，则需同时指定 FileInfos 作为待生成视频的首帧。当 ModelName 为 Kling 、ModelVersion 为 2.1 并且指定输出分辨率 Resolution 为 1080P 时，才能指定该参数。当 ModelName 为 Vidu、ModelVersion 为 q2-pro、q2-turbo 时，才能指定该参数。
2. 图片大小需小于5M。
3. 3. 图片格式的取值为：jpeg，jpg, png, webp。
     */
    public void setLastFrameUrl(String LastFrameUrl) {
        this.LastFrameUrl = LastFrameUrl;
    }

    /**
     * Get 生成图片的提示词。当 FileInfos 为空时，此参数必填。 
     * @return Prompt 生成图片的提示词。当 FileInfos 为空时，此参数必填。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 生成图片的提示词。当 FileInfos 为空时，此参数必填。
     * @param Prompt 生成图片的提示词。当 FileInfos 为空时，此参数必填。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 要阻止模型生成图片的提示词。 
     * @return NegativePrompt 要阻止模型生成图片的提示词。
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set 要阻止模型生成图片的提示词。
     * @param NegativePrompt 要阻止模型生成图片的提示词。
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get 是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li>  
     * @return EnhancePrompt 是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set 是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     * @param EnhancePrompt 是否自动优化提示词。开启时将自动优化传入的 Prompt，以提升生成质量。取值有： <li>Enabled：开启；</li> <li>Disabled：关闭；</li> 
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get 生视频任务的输出媒体文件配置。 
     * @return OutputConfig 生视频任务的输出媒体文件配置。
     */
    public AigcVideoOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 生视频任务的输出媒体文件配置。
     * @param OutputConfig 生视频任务的输出媒体文件配置。
     */
    public void setOutputConfig(AigcVideoOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。 
     * @return SessionId 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。 
     * @return SessionContext 来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。
     * @param SessionContext 来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。 
     * @return TasksPriority 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     * @param TasksPriority 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get 保留字段，特殊用途时使用。 
     * @return ExtInfo 保留字段，特殊用途时使用。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 保留字段，特殊用途时使用。
     * @param ExtInfo 保留字段，特殊用途时使用。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CreateAigcVideoTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcVideoTaskRequest(CreateAigcVideoTaskRequest source) {
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
            this.FileInfos = new AigcVideoTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcVideoTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.LastFrameFileId != null) {
            this.LastFrameFileId = new String(source.LastFrameFileId);
        }
        if (source.LastFrameUrl != null) {
            this.LastFrameUrl = new String(source.LastFrameUrl);
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
            this.OutputConfig = new AigcVideoOutputConfig(source.OutputConfig);
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
        this.setParamSimple(map, prefix + "LastFrameFileId", this.LastFrameFileId);
        this.setParamSimple(map, prefix + "LastFrameUrl", this.LastFrameUrl);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

