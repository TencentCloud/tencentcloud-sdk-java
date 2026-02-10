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
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 模型名称。取值：
<li>GEM：Gemini；</li>
<li>Qwen：千问。</li>
<li>Hunyuan：混元。</li>
<li>Vidu：生数。</li>
<li>Kling：可灵。</li>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型版本。取值：
<li>当 ModelName 是 GEM，可选值为 2.5、3.0；</li>
<li>当 ModelName 是 Qwen，可选值为 0925；</li>
<li>当 ModelName 是 Hunyuan，可选值为 3.0；</li>
<li>当 ModelName 是 Vidu，可选值为 q2；</li>
<li>当 ModelName 是 Kling，可选值为 2.1；</li>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * AIGC 生图任务的输入图片的文件信息。默认只支持指定1个。下列模型可传多张参考图：
* GEM 2.5：0～3张图片；
* GEM 3.0：0～14张图片；
* Vidu q2：0～7张图片，图片支持 png、jpeg、jpg、webp格式，图片像素不能小于 128x128，且比例需要小于1:4或4:1；
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcImageTaskInputFileInfo [] FileInfos;

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
    * 生图任务的输出媒体文件配置。
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcImageOutputConfig OutputConfig;

    /**
    * 输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

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
     * Get 模型名称。取值：
<li>GEM：Gemini；</li>
<li>Qwen：千问。</li>
<li>Hunyuan：混元。</li>
<li>Vidu：生数。</li>
<li>Kling：可灵。</li> 
     * @return ModelName 模型名称。取值：
<li>GEM：Gemini；</li>
<li>Qwen：千问。</li>
<li>Hunyuan：混元。</li>
<li>Vidu：生数。</li>
<li>Kling：可灵。</li>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称。取值：
<li>GEM：Gemini；</li>
<li>Qwen：千问。</li>
<li>Hunyuan：混元。</li>
<li>Vidu：生数。</li>
<li>Kling：可灵。</li>
     * @param ModelName 模型名称。取值：
<li>GEM：Gemini；</li>
<li>Qwen：千问。</li>
<li>Hunyuan：混元。</li>
<li>Vidu：生数。</li>
<li>Kling：可灵。</li>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 模型版本。取值：
<li>当 ModelName 是 GEM，可选值为 2.5、3.0；</li>
<li>当 ModelName 是 Qwen，可选值为 0925；</li>
<li>当 ModelName 是 Hunyuan，可选值为 3.0；</li>
<li>当 ModelName 是 Vidu，可选值为 q2；</li>
<li>当 ModelName 是 Kling，可选值为 2.1；</li> 
     * @return ModelVersion 模型版本。取值：
<li>当 ModelName 是 GEM，可选值为 2.5、3.0；</li>
<li>当 ModelName 是 Qwen，可选值为 0925；</li>
<li>当 ModelName 是 Hunyuan，可选值为 3.0；</li>
<li>当 ModelName 是 Vidu，可选值为 q2；</li>
<li>当 ModelName 是 Kling，可选值为 2.1；</li>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 模型版本。取值：
<li>当 ModelName 是 GEM，可选值为 2.5、3.0；</li>
<li>当 ModelName 是 Qwen，可选值为 0925；</li>
<li>当 ModelName 是 Hunyuan，可选值为 3.0；</li>
<li>当 ModelName 是 Vidu，可选值为 q2；</li>
<li>当 ModelName 是 Kling，可选值为 2.1；</li>
     * @param ModelVersion 模型版本。取值：
<li>当 ModelName 是 GEM，可选值为 2.5、3.0；</li>
<li>当 ModelName 是 Qwen，可选值为 0925；</li>
<li>当 ModelName 是 Hunyuan，可选值为 3.0；</li>
<li>当 ModelName 是 Vidu，可选值为 q2；</li>
<li>当 ModelName 是 Kling，可选值为 2.1；</li>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get AIGC 生图任务的输入图片的文件信息。默认只支持指定1个。下列模型可传多张参考图：
* GEM 2.5：0～3张图片；
* GEM 3.0：0～14张图片；
* Vidu q2：0～7张图片，图片支持 png、jpeg、jpg、webp格式，图片像素不能小于 128x128，且比例需要小于1:4或4:1； 
     * @return FileInfos AIGC 生图任务的输入图片的文件信息。默认只支持指定1个。下列模型可传多张参考图：
* GEM 2.5：0～3张图片；
* GEM 3.0：0～14张图片；
* Vidu q2：0～7张图片，图片支持 png、jpeg、jpg、webp格式，图片像素不能小于 128x128，且比例需要小于1:4或4:1；
     */
    public AigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set AIGC 生图任务的输入图片的文件信息。默认只支持指定1个。下列模型可传多张参考图：
* GEM 2.5：0～3张图片；
* GEM 3.0：0～14张图片；
* Vidu q2：0～7张图片，图片支持 png、jpeg、jpg、webp格式，图片像素不能小于 128x128，且比例需要小于1:4或4:1；
     * @param FileInfos AIGC 生图任务的输入图片的文件信息。默认只支持指定1个。下列模型可传多张参考图：
* GEM 2.5：0～3张图片；
* GEM 3.0：0～14张图片；
* Vidu q2：0～7张图片，图片支持 png、jpeg、jpg、webp格式，图片像素不能小于 128x128，且比例需要小于1:4或4:1；
     */
    public void setFileInfos(AigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
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
     * Get 生图任务的输出媒体文件配置。 
     * @return OutputConfig 生图任务的输出媒体文件配置。
     */
    public AigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 生图任务的输出媒体文件配置。
     * @param OutputConfig 生图任务的输出媒体文件配置。
     */
    public void setOutputConfig(AigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get 输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。 
     * @return InputRegion 输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set 输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。
     * @param InputRegion 输入文件的区域信息。当文件url是国外地址时候，可选Oversea。默认Mainland。
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
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

