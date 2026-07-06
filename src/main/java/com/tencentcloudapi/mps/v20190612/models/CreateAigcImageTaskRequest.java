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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcImageTaskRequest extends AbstractModel {

    /**
    * <p>模型名称。<br>当前支持的模型列表：<br>Hunyuan，<br>Qwen，<br>Vidu，<br>Kling，<br>MJ。</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p><ol><li>Hunyuan，可选 [3.0]。</li><li>Vidu，可选 [q2]。</li><li>Kling，可选 [2.1、O1、3.0、3.0-Omni]。</li><li>Qwen，可选 [0925]。</li><li>MJ，可选 [v7]</li></ol>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>场景化生图使用，仅部分模型支持。</p><p>枚举值：</p><ul><li>3d_panorama： 全景图。仅Hunyuan支持。</li></ul>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>生成图片的描述。当未传入参考图片时，此参数必填。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>用于描述您想要阻止模型生成的内容。 注意：部分模型支持。</p><p>例如：顶部照明、明亮的色彩、人物、动物、多辆汽车、风。</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>默认取值为False，模型会严格地遵循指令。<br>如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。</p>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private Boolean EnhancePrompt;

    /**
    * <p>用于传入参考的资源图片信息，默认支持传入一张图片。</p><p>支持多图输入的模型：</p><ol><li>Kling 2.1，可支持最多 4 张图片输入作为资源图。</li><li>Kling 3.0-Omni，可支持最多 10 张图片输入作为资源图。</li><li>Kling O1，可支持最多 10 张图片输入作为资源图。</li><li>Vidu q2，可支持最多 7 张图片输入作为资源图。</li><li>Hunyuan 3.0，可支持最多 3 张图片输入作为资源图。</li><li>MJ v7，可支持最多 3 张图片输入作为资源图。</li></ol><p>注意：</p><ol><li>推荐图片小于7M，各模型限制不同。</li><li>图片格式支持：jpeg, png, webp。</li></ol>
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcImageInfo [] ImageInfos;

    /**
    * <p>指定图片输出张数。目前默认支持输出 1 张。</p>
    */
    @SerializedName("OutputImageCount")
    @Expose
    private Long OutputImageCount;

    /**
    * <p>用于传入模型要求的额外参数。</p>
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcImageExtraParam ExtraParameters;

    /**
    * <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。 </p><ol><li>Hunyuan 3.0，支持自由设置分辨率宽高，宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024x1024 像素。</li><li>Qwen 0925，支持自由设置分辨率宽高，合法总像素范围 [512x512=261632, 2048x2048=4194304]。</li></ol><p>示例： {"size":"1024x1024"}。</p>
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * <p>接口操作者名称。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>模型名称。<br>当前支持的模型列表：<br>Hunyuan，<br>Qwen，<br>Vidu，<br>Kling，<br>MJ。</p> 
     * @return ModelName <p>模型名称。<br>当前支持的模型列表：<br>Hunyuan，<br>Qwen，<br>Vidu，<br>Kling，<br>MJ。</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称。<br>当前支持的模型列表：<br>Hunyuan，<br>Qwen，<br>Vidu，<br>Kling，<br>MJ。</p>
     * @param ModelName <p>模型名称。<br>当前支持的模型列表：<br>Hunyuan，<br>Qwen，<br>Vidu，<br>Kling，<br>MJ。</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p><ol><li>Hunyuan，可选 [3.0]。</li><li>Vidu，可选 [q2]。</li><li>Kling，可选 [2.1、O1、3.0、3.0-Omni]。</li><li>Qwen，可选 [0925]。</li><li>MJ，可选 [v7]</li></ol> 
     * @return ModelVersion <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p><ol><li>Hunyuan，可选 [3.0]。</li><li>Vidu，可选 [q2]。</li><li>Kling，可选 [2.1、O1、3.0、3.0-Omni]。</li><li>Qwen，可选 [0925]。</li><li>MJ，可选 [v7]</li></ol>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p><ol><li>Hunyuan，可选 [3.0]。</li><li>Vidu，可选 [q2]。</li><li>Kling，可选 [2.1、O1、3.0、3.0-Omni]。</li><li>Qwen，可选 [0925]。</li><li>MJ，可选 [v7]</li></ol>
     * @param ModelVersion <p>指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。</p><ol><li>Hunyuan，可选 [3.0]。</li><li>Vidu，可选 [q2]。</li><li>Kling，可选 [2.1、O1、3.0、3.0-Omni]。</li><li>Qwen，可选 [0925]。</li><li>MJ，可选 [v7]</li></ol>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>场景化生图使用，仅部分模型支持。</p><p>枚举值：</p><ul><li>3d_panorama： 全景图。仅Hunyuan支持。</li></ul> 
     * @return SceneType <p>场景化生图使用，仅部分模型支持。</p><p>枚举值：</p><ul><li>3d_panorama： 全景图。仅Hunyuan支持。</li></ul>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>场景化生图使用，仅部分模型支持。</p><p>枚举值：</p><ul><li>3d_panorama： 全景图。仅Hunyuan支持。</li></ul>
     * @param SceneType <p>场景化生图使用，仅部分模型支持。</p><p>枚举值：</p><ul><li>3d_panorama： 全景图。仅Hunyuan支持。</li></ul>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>生成图片的描述。当未传入参考图片时，此参数必填。</p> 
     * @return Prompt <p>生成图片的描述。当未传入参考图片时，此参数必填。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>生成图片的描述。当未传入参考图片时，此参数必填。</p>
     * @param Prompt <p>生成图片的描述。当未传入参考图片时，此参数必填。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>用于描述您想要阻止模型生成的内容。 注意：部分模型支持。</p><p>例如：顶部照明、明亮的色彩、人物、动物、多辆汽车、风。</p> 
     * @return NegativePrompt <p>用于描述您想要阻止模型生成的内容。 注意：部分模型支持。</p><p>例如：顶部照明、明亮的色彩、人物、动物、多辆汽车、风。</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>用于描述您想要阻止模型生成的内容。 注意：部分模型支持。</p><p>例如：顶部照明、明亮的色彩、人物、动物、多辆汽车、风。</p>
     * @param NegativePrompt <p>用于描述您想要阻止模型生成的内容。 注意：部分模型支持。</p><p>例如：顶部照明、明亮的色彩、人物、动物、多辆汽车、风。</p>
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get <p>默认取值为False，模型会严格地遵循指令。<br>如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。</p> 
     * @return EnhancePrompt <p>默认取值为False，模型会严格地遵循指令。<br>如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。</p>
     */
    public Boolean getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set <p>默认取值为False，模型会严格地遵循指令。<br>如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。</p>
     * @param EnhancePrompt <p>默认取值为False，模型会严格地遵循指令。<br>如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。</p>
     */
    public void setEnhancePrompt(Boolean EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get <p>用于传入参考的资源图片信息，默认支持传入一张图片。</p><p>支持多图输入的模型：</p><ol><li>Kling 2.1，可支持最多 4 张图片输入作为资源图。</li><li>Kling 3.0-Omni，可支持最多 10 张图片输入作为资源图。</li><li>Kling O1，可支持最多 10 张图片输入作为资源图。</li><li>Vidu q2，可支持最多 7 张图片输入作为资源图。</li><li>Hunyuan 3.0，可支持最多 3 张图片输入作为资源图。</li><li>MJ v7，可支持最多 3 张图片输入作为资源图。</li></ol><p>注意：</p><ol><li>推荐图片小于7M，各模型限制不同。</li><li>图片格式支持：jpeg, png, webp。</li></ol> 
     * @return ImageInfos <p>用于传入参考的资源图片信息，默认支持传入一张图片。</p><p>支持多图输入的模型：</p><ol><li>Kling 2.1，可支持最多 4 张图片输入作为资源图。</li><li>Kling 3.0-Omni，可支持最多 10 张图片输入作为资源图。</li><li>Kling O1，可支持最多 10 张图片输入作为资源图。</li><li>Vidu q2，可支持最多 7 张图片输入作为资源图。</li><li>Hunyuan 3.0，可支持最多 3 张图片输入作为资源图。</li><li>MJ v7，可支持最多 3 张图片输入作为资源图。</li></ol><p>注意：</p><ol><li>推荐图片小于7M，各模型限制不同。</li><li>图片格式支持：jpeg, png, webp。</li></ol>
     */
    public AigcImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set <p>用于传入参考的资源图片信息，默认支持传入一张图片。</p><p>支持多图输入的模型：</p><ol><li>Kling 2.1，可支持最多 4 张图片输入作为资源图。</li><li>Kling 3.0-Omni，可支持最多 10 张图片输入作为资源图。</li><li>Kling O1，可支持最多 10 张图片输入作为资源图。</li><li>Vidu q2，可支持最多 7 张图片输入作为资源图。</li><li>Hunyuan 3.0，可支持最多 3 张图片输入作为资源图。</li><li>MJ v7，可支持最多 3 张图片输入作为资源图。</li></ol><p>注意：</p><ol><li>推荐图片小于7M，各模型限制不同。</li><li>图片格式支持：jpeg, png, webp。</li></ol>
     * @param ImageInfos <p>用于传入参考的资源图片信息，默认支持传入一张图片。</p><p>支持多图输入的模型：</p><ol><li>Kling 2.1，可支持最多 4 张图片输入作为资源图。</li><li>Kling 3.0-Omni，可支持最多 10 张图片输入作为资源图。</li><li>Kling O1，可支持最多 10 张图片输入作为资源图。</li><li>Vidu q2，可支持最多 7 张图片输入作为资源图。</li><li>Hunyuan 3.0，可支持最多 3 张图片输入作为资源图。</li><li>MJ v7，可支持最多 3 张图片输入作为资源图。</li></ol><p>注意：</p><ol><li>推荐图片小于7M，各模型限制不同。</li><li>图片格式支持：jpeg, png, webp。</li></ol>
     */
    public void setImageInfos(AigcImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get <p>指定图片输出张数。目前默认支持输出 1 张。</p> 
     * @return OutputImageCount <p>指定图片输出张数。目前默认支持输出 1 张。</p>
     */
    public Long getOutputImageCount() {
        return this.OutputImageCount;
    }

    /**
     * Set <p>指定图片输出张数。目前默认支持输出 1 张。</p>
     * @param OutputImageCount <p>指定图片输出张数。目前默认支持输出 1 张。</p>
     */
    public void setOutputImageCount(Long OutputImageCount) {
        this.OutputImageCount = OutputImageCount;
    }

    /**
     * Get <p>用于传入模型要求的额外参数。</p> 
     * @return ExtraParameters <p>用于传入模型要求的额外参数。</p>
     */
    public AigcImageExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set <p>用于传入模型要求的额外参数。</p>
     * @param ExtraParameters <p>用于传入模型要求的额外参数。</p>
     */
    public void setExtraParameters(AigcImageExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。 </p><ol><li>Hunyuan 3.0，支持自由设置分辨率宽高，宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024x1024 像素。</li><li>Qwen 0925，支持自由设置分辨率宽高，合法总像素范围 [512x512=261632, 2048x2048=4194304]。</li></ol><p>示例： {"size":"1024x1024"}。</p> 
     * @return AdditionalParameters <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。 </p><ol><li>Hunyuan 3.0，支持自由设置分辨率宽高，宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024x1024 像素。</li><li>Qwen 0925，支持自由设置分辨率宽高，合法总像素范围 [512x512=261632, 2048x2048=4194304]。</li></ol><p>示例： {"size":"1024x1024"}。</p>
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。 </p><ol><li>Hunyuan 3.0，支持自由设置分辨率宽高，宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024x1024 像素。</li><li>Qwen 0925，支持自由设置分辨率宽高，合法总像素范围 [512x512=261632, 2048x2048=4194304]。</li></ol><p>示例： {"size":"1024x1024"}。</p>
     * @param AdditionalParameters <p>用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。 </p><ol><li>Hunyuan 3.0，支持自由设置分辨率宽高，宽、高均在 [512, 2048] 像素范围内，宽高乘积 ≤ 1024x1024 像素。</li><li>Qwen 0925，支持自由设置分辨率宽高，合法总像素范围 [512x512=261632, 2048x2048=4194304]。</li></ol><p>示例： {"size":"1024x1024"}。</p>
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p> 
     * @return StoreCosParam <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     * @param StoreCosParam <p>文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。</p>
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get <p>接口操作者名称。</p> 
     * @return Operator <p>接口操作者名称。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>接口操作者名称。</p>
     * @param Operator <p>接口操作者名称。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public CreateAigcImageTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcImageTaskRequest(CreateAigcImageTaskRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new Boolean(source.EnhancePrompt);
        }
        if (source.ImageInfos != null) {
            this.ImageInfos = new AigcImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new AigcImageInfo(source.ImageInfos[i]);
            }
        }
        if (source.OutputImageCount != null) {
            this.OutputImageCount = new Long(source.OutputImageCount);
        }
        if (source.ExtraParameters != null) {
            this.ExtraParameters = new AigcImageExtraParam(source.ExtraParameters);
        }
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
        }
        if (source.StoreCosParam != null) {
            this.StoreCosParam = new AigcStoreCosParam(source.StoreCosParam);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamSimple(map, prefix + "OutputImageCount", this.OutputImageCount);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

