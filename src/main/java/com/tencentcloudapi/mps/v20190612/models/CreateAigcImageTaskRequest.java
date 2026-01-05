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
    * 模型名称。
当前支持的模型列表：
Hunyuan,
GEM，
Qwen。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。

1. GEM， 可选[2.5,3.0]。
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 生成图片的描述。(注：最大支持1000字符)。当未传入参考图片时，此参数必填。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 用于描述您想要阻止模型生成的内容。 注意：部分模型支持。 例如： 顶部照明、明亮的色彩 人物、动物 多辆汽车、风。
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * 默认取值为False，模型会严格地遵循指令。如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private Boolean EnhancePrompt;

    /**
    * 用于传入参考的资源图片信息，默认支持传入一张图片。

支持多图输入的模型：
1. GEM，可支持最多3张图片输入作为资源图。

注意：
1. 推荐图片小于7M，各模型限制不同。
2. 图片格式支持：jpeg, png, webp。
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcImageInfo [] ImageInfos;

    /**
    * 用于传入模型要求的额外参数。
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcImageExtraParam ExtraParameters;

    /**
    * 文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * 接口操作者名称。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 模型名称。
当前支持的模型列表：
Hunyuan,
GEM，
Qwen。 
     * @return ModelName 模型名称。
当前支持的模型列表：
Hunyuan,
GEM，
Qwen。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称。
当前支持的模型列表：
Hunyuan,
GEM，
Qwen。
     * @param ModelName 模型名称。
当前支持的模型列表：
Hunyuan,
GEM，
Qwen。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。

1. GEM， 可选[2.5,3.0]。 
     * @return ModelVersion 指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。

1. GEM， 可选[2.5,3.0]。
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。

1. GEM， 可选[2.5,3.0]。
     * @param ModelVersion 指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。

1. GEM， 可选[2.5,3.0]。
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 生成图片的描述。(注：最大支持1000字符)。当未传入参考图片时，此参数必填。 
     * @return Prompt 生成图片的描述。(注：最大支持1000字符)。当未传入参考图片时，此参数必填。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 生成图片的描述。(注：最大支持1000字符)。当未传入参考图片时，此参数必填。
     * @param Prompt 生成图片的描述。(注：最大支持1000字符)。当未传入参考图片时，此参数必填。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 用于描述您想要阻止模型生成的内容。 注意：部分模型支持。 例如： 顶部照明、明亮的色彩 人物、动物 多辆汽车、风。 
     * @return NegativePrompt 用于描述您想要阻止模型生成的内容。 注意：部分模型支持。 例如： 顶部照明、明亮的色彩 人物、动物 多辆汽车、风。
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set 用于描述您想要阻止模型生成的内容。 注意：部分模型支持。 例如： 顶部照明、明亮的色彩 人物、动物 多辆汽车、风。
     * @param NegativePrompt 用于描述您想要阻止模型生成的内容。 注意：部分模型支持。 例如： 顶部照明、明亮的色彩 人物、动物 多辆汽车、风。
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get 默认取值为False，模型会严格地遵循指令。如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。 
     * @return EnhancePrompt 默认取值为False，模型会严格地遵循指令。如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。
     */
    public Boolean getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set 默认取值为False，模型会严格地遵循指令。如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。
     * @param EnhancePrompt 默认取值为False，模型会严格地遵循指令。如果需要更精细的prompt获得最佳效果，可将此参数设置为True，将自动优化传入的prompt，以提升生成质量。
     */
    public void setEnhancePrompt(Boolean EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get 用于传入参考的资源图片信息，默认支持传入一张图片。

支持多图输入的模型：
1. GEM，可支持最多3张图片输入作为资源图。

注意：
1. 推荐图片小于7M，各模型限制不同。
2. 图片格式支持：jpeg, png, webp。 
     * @return ImageInfos 用于传入参考的资源图片信息，默认支持传入一张图片。

支持多图输入的模型：
1. GEM，可支持最多3张图片输入作为资源图。

注意：
1. 推荐图片小于7M，各模型限制不同。
2. 图片格式支持：jpeg, png, webp。
     */
    public AigcImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set 用于传入参考的资源图片信息，默认支持传入一张图片。

支持多图输入的模型：
1. GEM，可支持最多3张图片输入作为资源图。

注意：
1. 推荐图片小于7M，各模型限制不同。
2. 图片格式支持：jpeg, png, webp。
     * @param ImageInfos 用于传入参考的资源图片信息，默认支持传入一张图片。

支持多图输入的模型：
1. GEM，可支持最多3张图片输入作为资源图。

注意：
1. 推荐图片小于7M，各模型限制不同。
2. 图片格式支持：jpeg, png, webp。
     */
    public void setImageInfos(AigcImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get 用于传入模型要求的额外参数。 
     * @return ExtraParameters 用于传入模型要求的额外参数。
     */
    public AigcImageExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set 用于传入模型要求的额外参数。
     * @param ExtraParameters 用于传入模型要求的额外参数。
     */
    public void setExtraParameters(AigcImageExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get 文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。 
     * @return StoreCosParam 文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set 文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。
     * @param StoreCosParam 文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get 接口操作者名称。 
     * @return Operator 接口操作者名称。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 接口操作者名称。
     * @param Operator 接口操作者名称。
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
        if (source.ExtraParameters != null) {
            this.ExtraParameters = new AigcImageExtraParam(source.ExtraParameters);
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
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

