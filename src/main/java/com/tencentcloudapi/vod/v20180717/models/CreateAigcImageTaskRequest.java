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
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>模型名称。取值：</p><li>GEM：Gemini；</li><li>Qwen：千问。</li><li>Hunyuan：混元。</li><li>Vidu：生数。</li><li>Kling：可灵。</li>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型版本。取值：<li>当 ModelName 是 GEM，可选值为 2.5；</li><li>当 ModelName 是 Qwen，可选值为 0925；</li><li>当 ModelName 是 Hunyuan，可选值为 3.0；</li><li>当 ModelName 是 Vidu，可选值为 q2；</li><li>当 ModelName 是 Kling，可选值为 2.1；</li></p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>AIGC 生图任务的输入图片的文件信息。默认只支持指定1个。下列模型可传多张参考图：<li>GEM 2.5：0～3张图片；</li><li>Vidu q2：0～7张图片，图片支持 png、jpeg、jpg、webp格式，图片像素不能小于 128x128，且比例需要小于1:4或4:1；</li></p>
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
    * <p>输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。</p>
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
    * <p>保留字段，特殊用途时使用。</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>模型名称。取值：</p><li>GEM：Gemini；</li><li>Qwen：千问。</li><li>Hunyuan：混元。</li><li>Vidu：生数。</li><li>Kling：可灵。</li> 
     * @return ModelName <p>模型名称。取值：</p><li>GEM：Gemini；</li><li>Qwen：千问。</li><li>Hunyuan：混元。</li><li>Vidu：生数。</li><li>Kling：可灵。</li>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称。取值：</p><li>GEM：Gemini；</li><li>Qwen：千问。</li><li>Hunyuan：混元。</li><li>Vidu：生数。</li><li>Kling：可灵。</li>
     * @param ModelName <p>模型名称。取值：</p><li>GEM：Gemini；</li><li>Qwen：千问。</li><li>Hunyuan：混元。</li><li>Vidu：生数。</li><li>Kling：可灵。</li>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型版本。取值：<li>当 ModelName 是 GEM，可选值为 2.5；</li><li>当 ModelName 是 Qwen，可选值为 0925；</li><li>当 ModelName 是 Hunyuan，可选值为 3.0；</li><li>当 ModelName 是 Vidu，可选值为 q2；</li><li>当 ModelName 是 Kling，可选值为 2.1；</li></p> 
     * @return ModelVersion <p>模型版本。取值：<li>当 ModelName 是 GEM，可选值为 2.5；</li><li>当 ModelName 是 Qwen，可选值为 0925；</li><li>当 ModelName 是 Hunyuan，可选值为 3.0；</li><li>当 ModelName 是 Vidu，可选值为 q2；</li><li>当 ModelName 是 Kling，可选值为 2.1；</li></p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本。取值：<li>当 ModelName 是 GEM，可选值为 2.5；</li><li>当 ModelName 是 Qwen，可选值为 0925；</li><li>当 ModelName 是 Hunyuan，可选值为 3.0；</li><li>当 ModelName 是 Vidu，可选值为 q2；</li><li>当 ModelName 是 Kling，可选值为 2.1；</li></p>
     * @param ModelVersion <p>模型版本。取值：<li>当 ModelName 是 GEM，可选值为 2.5；</li><li>当 ModelName 是 Qwen，可选值为 0925；</li><li>当 ModelName 是 Hunyuan，可选值为 3.0；</li><li>当 ModelName 是 Vidu，可选值为 q2；</li><li>当 ModelName 是 Kling，可选值为 2.1；</li></p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>AIGC 生图任务的输入图片的文件信息。默认只支持指定1个。下列模型可传多张参考图：<li>GEM 2.5：0～3张图片；</li><li>Vidu q2：0～7张图片，图片支持 png、jpeg、jpg、webp格式，图片像素不能小于 128x128，且比例需要小于1:4或4:1；</li></p> 
     * @return FileInfos <p>AIGC 生图任务的输入图片的文件信息。默认只支持指定1个。下列模型可传多张参考图：<li>GEM 2.5：0～3张图片；</li><li>Vidu q2：0～7张图片，图片支持 png、jpeg、jpg、webp格式，图片像素不能小于 128x128，且比例需要小于1:4或4:1；</li></p>
     */
    public AigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>AIGC 生图任务的输入图片的文件信息。默认只支持指定1个。下列模型可传多张参考图：<li>GEM 2.5：0～3张图片；</li><li>Vidu q2：0～7张图片，图片支持 png、jpeg、jpg、webp格式，图片像素不能小于 128x128，且比例需要小于1:4或4:1；</li></p>
     * @param FileInfos <p>AIGC 生图任务的输入图片的文件信息。默认只支持指定1个。下列模型可传多张参考图：<li>GEM 2.5：0～3张图片；</li><li>Vidu q2：0～7张图片，图片支持 png、jpeg、jpg、webp格式，图片像素不能小于 128x128，且比例需要小于1:4或4:1；</li></p>
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
     * Get <p>输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。</p> 
     * @return InputRegion <p>输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。</p>
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set <p>输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。</p>
     * @param InputRegion <p>输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。</p>
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
     * Get <p>保留字段，特殊用途时使用。</p> 
     * @return ExtInfo <p>保留字段，特殊用途时使用。</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>保留字段，特殊用途时使用。</p>
     * @param ExtInfo <p>保留字段，特殊用途时使用。</p>
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

