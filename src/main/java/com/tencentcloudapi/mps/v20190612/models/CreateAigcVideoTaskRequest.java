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

public class CreateAigcVideoTaskRequest extends AbstractModel {

    /**
    * 模型名称。
当前支持的模型列表:
Hunyuan,
Hailuo，
Kling，
Vidu，
OS，
GV。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。
1. Hailuo， 可选[02、2.3]。
2. Kling，可选[2.0、2.1、2.5、O1、2.6]。
3. Vidu,可选[q2、q2-pro、q2-turbo]。
4. GV, 可选[3.1]。
5. OS，可选[2.0]。
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 用于描述您想要阻止模型生成的内容。
注意：部分模型支持。
例如：
顶部照明、明亮的色彩
人物、动物
多辆汽车、风。
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
    * 用于指导视频生成的图片 URL。该URL需外网可访问。
注意：
1. 推荐图片大小不超过10M，不同模型大小限制不相同。
2. 支持的图片格式：jpeg、png。
3. 使用OS模型时，需输入图片尺寸为: 1280x720、720x1280。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 模型将以此参数传入的图片作为尾帧画面来生成视频。
支持此参数的模型：
1. GV，传入尾帧图片时，必须同时传入ImageUrl作为首帧。
2. Kling， 在Resolution:1080P的情况下 2.1版本支持首尾帧。
3. Vidu, q2-pro, q2-turbo 支持首尾帧。

注意：
1. 推荐图片大小不超过10M，各模型限制不同。
2. 支持的图片格式：jpeg、png。
    */
    @SerializedName("LastImageUrl")
    @Expose
    private String LastImageUrl;

    /**
    * 最多包含三张素材资源图片的列表，用于描述模型在生成视频时要使用的资源图片。

支持多图输入的模型：
1. GV，使用多图输入时，不可使用ImageUrl和LastImageUrl。
2. Vidu，支持多图参考生视频。q2模型1-7张图片，可通过ImageInfos里面的ReferenceType作为主体id来传入。

注意：
1. 图片大小不超过10M。
2. 支持的图片格式：jpeg、png。
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcVideoReferenceImageInfo [] ImageInfos;

    /**
    * 生成视频的时长。
注意：
1. Kling支持 5、10秒。默认: 5秒。
2. Hailuo的std模式可支持6、10秒，其他仅6秒。默认：6秒。
3. Vidu支持1-10秒。
4. GV支持 8秒。 默认：8秒。
5. OS支持4、8、12秒。 默认：8秒。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 用于传入要求的额外参数。
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcVideoExtraParam ExtraParameters;

    /**
    * 文件结果指定存储Cos桶信息。 注意：需开通Cos，创建并授权MPS_QcsRole角色。
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * 用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。
示例：
{\"camera_control\":{\"type\":\"simple\"}}
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * 接口操作者名称。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 模型名称。
当前支持的模型列表:
Hunyuan,
Hailuo，
Kling，
Vidu，
OS，
GV。 
     * @return ModelName 模型名称。
当前支持的模型列表:
Hunyuan,
Hailuo，
Kling，
Vidu，
OS，
GV。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称。
当前支持的模型列表:
Hunyuan,
Hailuo，
Kling，
Vidu，
OS，
GV。
     * @param ModelName 模型名称。
当前支持的模型列表:
Hunyuan,
Hailuo，
Kling，
Vidu，
OS，
GV。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。
1. Hailuo， 可选[02、2.3]。
2. Kling，可选[2.0、2.1、2.5、O1、2.6]。
3. Vidu,可选[q2、q2-pro、q2-turbo]。
4. GV, 可选[3.1]。
5. OS，可选[2.0]。 
     * @return ModelVersion 指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。
1. Hailuo， 可选[02、2.3]。
2. Kling，可选[2.0、2.1、2.5、O1、2.6]。
3. Vidu,可选[q2、q2-pro、q2-turbo]。
4. GV, 可选[3.1]。
5. OS，可选[2.0]。
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。
1. Hailuo， 可选[02、2.3]。
2. Kling，可选[2.0、2.1、2.5、O1、2.6]。
3. Vidu,可选[q2、q2-pro、q2-turbo]。
4. GV, 可选[3.1]。
5. OS，可选[2.0]。
     * @param ModelVersion 指定模型特定版本号。默认使用系统当前所支持的模型稳定版本。
1. Hailuo， 可选[02、2.3]。
2. Kling，可选[2.0、2.1、2.5、O1、2.6]。
3. Vidu,可选[q2、q2-pro、q2-turbo]。
4. GV, 可选[3.1]。
5. OS，可选[2.0]。
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。 
     * @return Prompt 生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。
     * @param Prompt 生成视频的描述。(注：最大支持2000字符)。当未传入图片时，此参数必填。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 用于描述您想要阻止模型生成的内容。
注意：部分模型支持。
例如：
顶部照明、明亮的色彩
人物、动物
多辆汽车、风。 
     * @return NegativePrompt 用于描述您想要阻止模型生成的内容。
注意：部分模型支持。
例如：
顶部照明、明亮的色彩
人物、动物
多辆汽车、风。
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set 用于描述您想要阻止模型生成的内容。
注意：部分模型支持。
例如：
顶部照明、明亮的色彩
人物、动物
多辆汽车、风。
     * @param NegativePrompt 用于描述您想要阻止模型生成的内容。
注意：部分模型支持。
例如：
顶部照明、明亮的色彩
人物、动物
多辆汽车、风。
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
     * Get 用于指导视频生成的图片 URL。该URL需外网可访问。
注意：
1. 推荐图片大小不超过10M，不同模型大小限制不相同。
2. 支持的图片格式：jpeg、png。
3. 使用OS模型时，需输入图片尺寸为: 1280x720、720x1280。 
     * @return ImageUrl 用于指导视频生成的图片 URL。该URL需外网可访问。
注意：
1. 推荐图片大小不超过10M，不同模型大小限制不相同。
2. 支持的图片格式：jpeg、png。
3. 使用OS模型时，需输入图片尺寸为: 1280x720、720x1280。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 用于指导视频生成的图片 URL。该URL需外网可访问。
注意：
1. 推荐图片大小不超过10M，不同模型大小限制不相同。
2. 支持的图片格式：jpeg、png。
3. 使用OS模型时，需输入图片尺寸为: 1280x720、720x1280。
     * @param ImageUrl 用于指导视频生成的图片 URL。该URL需外网可访问。
注意：
1. 推荐图片大小不超过10M，不同模型大小限制不相同。
2. 支持的图片格式：jpeg、png。
3. 使用OS模型时，需输入图片尺寸为: 1280x720、720x1280。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 模型将以此参数传入的图片作为尾帧画面来生成视频。
支持此参数的模型：
1. GV，传入尾帧图片时，必须同时传入ImageUrl作为首帧。
2. Kling， 在Resolution:1080P的情况下 2.1版本支持首尾帧。
3. Vidu, q2-pro, q2-turbo 支持首尾帧。

注意：
1. 推荐图片大小不超过10M，各模型限制不同。
2. 支持的图片格式：jpeg、png。 
     * @return LastImageUrl 模型将以此参数传入的图片作为尾帧画面来生成视频。
支持此参数的模型：
1. GV，传入尾帧图片时，必须同时传入ImageUrl作为首帧。
2. Kling， 在Resolution:1080P的情况下 2.1版本支持首尾帧。
3. Vidu, q2-pro, q2-turbo 支持首尾帧。

注意：
1. 推荐图片大小不超过10M，各模型限制不同。
2. 支持的图片格式：jpeg、png。
     */
    public String getLastImageUrl() {
        return this.LastImageUrl;
    }

    /**
     * Set 模型将以此参数传入的图片作为尾帧画面来生成视频。
支持此参数的模型：
1. GV，传入尾帧图片时，必须同时传入ImageUrl作为首帧。
2. Kling， 在Resolution:1080P的情况下 2.1版本支持首尾帧。
3. Vidu, q2-pro, q2-turbo 支持首尾帧。

注意：
1. 推荐图片大小不超过10M，各模型限制不同。
2. 支持的图片格式：jpeg、png。
     * @param LastImageUrl 模型将以此参数传入的图片作为尾帧画面来生成视频。
支持此参数的模型：
1. GV，传入尾帧图片时，必须同时传入ImageUrl作为首帧。
2. Kling， 在Resolution:1080P的情况下 2.1版本支持首尾帧。
3. Vidu, q2-pro, q2-turbo 支持首尾帧。

注意：
1. 推荐图片大小不超过10M，各模型限制不同。
2. 支持的图片格式：jpeg、png。
     */
    public void setLastImageUrl(String LastImageUrl) {
        this.LastImageUrl = LastImageUrl;
    }

    /**
     * Get 最多包含三张素材资源图片的列表，用于描述模型在生成视频时要使用的资源图片。

支持多图输入的模型：
1. GV，使用多图输入时，不可使用ImageUrl和LastImageUrl。
2. Vidu，支持多图参考生视频。q2模型1-7张图片，可通过ImageInfos里面的ReferenceType作为主体id来传入。

注意：
1. 图片大小不超过10M。
2. 支持的图片格式：jpeg、png。 
     * @return ImageInfos 最多包含三张素材资源图片的列表，用于描述模型在生成视频时要使用的资源图片。

支持多图输入的模型：
1. GV，使用多图输入时，不可使用ImageUrl和LastImageUrl。
2. Vidu，支持多图参考生视频。q2模型1-7张图片，可通过ImageInfos里面的ReferenceType作为主体id来传入。

注意：
1. 图片大小不超过10M。
2. 支持的图片格式：jpeg、png。
     */
    public AigcVideoReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set 最多包含三张素材资源图片的列表，用于描述模型在生成视频时要使用的资源图片。

支持多图输入的模型：
1. GV，使用多图输入时，不可使用ImageUrl和LastImageUrl。
2. Vidu，支持多图参考生视频。q2模型1-7张图片，可通过ImageInfos里面的ReferenceType作为主体id来传入。

注意：
1. 图片大小不超过10M。
2. 支持的图片格式：jpeg、png。
     * @param ImageInfos 最多包含三张素材资源图片的列表，用于描述模型在生成视频时要使用的资源图片。

支持多图输入的模型：
1. GV，使用多图输入时，不可使用ImageUrl和LastImageUrl。
2. Vidu，支持多图参考生视频。q2模型1-7张图片，可通过ImageInfos里面的ReferenceType作为主体id来传入。

注意：
1. 图片大小不超过10M。
2. 支持的图片格式：jpeg、png。
     */
    public void setImageInfos(AigcVideoReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get 生成视频的时长。
注意：
1. Kling支持 5、10秒。默认: 5秒。
2. Hailuo的std模式可支持6、10秒，其他仅6秒。默认：6秒。
3. Vidu支持1-10秒。
4. GV支持 8秒。 默认：8秒。
5. OS支持4、8、12秒。 默认：8秒。 
     * @return Duration 生成视频的时长。
注意：
1. Kling支持 5、10秒。默认: 5秒。
2. Hailuo的std模式可支持6、10秒，其他仅6秒。默认：6秒。
3. Vidu支持1-10秒。
4. GV支持 8秒。 默认：8秒。
5. OS支持4、8、12秒。 默认：8秒。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 生成视频的时长。
注意：
1. Kling支持 5、10秒。默认: 5秒。
2. Hailuo的std模式可支持6、10秒，其他仅6秒。默认：6秒。
3. Vidu支持1-10秒。
4. GV支持 8秒。 默认：8秒。
5. OS支持4、8、12秒。 默认：8秒。
     * @param Duration 生成视频的时长。
注意：
1. Kling支持 5、10秒。默认: 5秒。
2. Hailuo的std模式可支持6、10秒，其他仅6秒。默认：6秒。
3. Vidu支持1-10秒。
4. GV支持 8秒。 默认：8秒。
5. OS支持4、8、12秒。 默认：8秒。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 用于传入要求的额外参数。 
     * @return ExtraParameters 用于传入要求的额外参数。
     */
    public AigcVideoExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set 用于传入要求的额外参数。
     * @param ExtraParameters 用于传入要求的额外参数。
     */
    public void setExtraParameters(AigcVideoExtraParam ExtraParameters) {
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
     * Get 用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。
示例：
{\"camera_control\":{\"type\":\"simple\"}} 
     * @return AdditionalParameters 用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。
示例：
{\"camera_control\":{\"type\":\"simple\"}}
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set 用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。
示例：
{\"camera_control\":{\"type\":\"simple\"}}
     * @param AdditionalParameters 用于传入一些模型需要的特殊场景参数，Json格式序列化成字符串。
示例：
{\"camera_control\":{\"type\":\"simple\"}}
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
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

    public CreateAigcVideoTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcVideoTaskRequest(CreateAigcVideoTaskRequest source) {
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
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.LastImageUrl != null) {
            this.LastImageUrl = new String(source.LastImageUrl);
        }
        if (source.ImageInfos != null) {
            this.ImageInfos = new AigcVideoReferenceImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new AigcVideoReferenceImageInfo(source.ImageInfos[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ExtraParameters != null) {
            this.ExtraParameters = new AigcVideoExtraParam(source.ExtraParameters);
        }
        if (source.StoreCosParam != null) {
            this.StoreCosParam = new AigcStoreCosParam(source.StoreCosParam);
        }
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
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
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "LastImageUrl", this.LastImageUrl);
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

