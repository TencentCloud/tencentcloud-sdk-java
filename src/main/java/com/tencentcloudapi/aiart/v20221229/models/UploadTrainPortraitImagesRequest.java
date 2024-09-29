/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadTrainPortraitImagesRequest extends AbstractModel {

    /**
    * 写真模型 ID。由英文大小写字母、数字及下划线组成。
用于唯一标识一个写真模型，一个写真模型只能用于一个人物的写真图片生成。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 写真模型训练用的基础图像 URL，用于固定写真模型可生成的人物。
图片数量：1张。
图片内容：单人，脸部清晰。
图片限制：单边分辨率小于2000，转成 Base64 字符串后小于 5MB。

    */
    @SerializedName("BaseUrl")
    @Expose
    private String BaseUrl;

    /**
    * 写真模型训练用的图像 URL 列表，仅常规训练模式需要上传。
图片数量：19 - 24 张。
图片内容：单人，脸部清晰，和基础图像中的人物为同一人。
图片限制：单边分辨率小于2000，转成 Base64 字符串后小于 5MB。
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 训练图像质量过滤开关配置。
支持开启或关闭对训练图像分辨率下限、脸部区域大小、脸部遮挡的过滤，默认开启以上过滤。
如果训练图像内包含多人脸或无人脸、和 Base 人像不为同一人也将被过滤，不可关闭该过滤条件。
建议：关闭以上过滤可能导致写真生成效果受损，建议使用单人、正脸、脸部区域占比较大、脸部清晰无遮挡、无大角度偏转、无夸张表情的图像进行训练。
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * 训练模式。
默认使用常规训练模式。如果使用快速训练模式和免训练模式，只需要在 BaseUrl 中传入1张图片，Urls.N 中无需传入图片。
0：常规训练模式，上传多张图片用于模型训练，完成训练后可生成写真图片。
1：快速训练模式，仅需上传1张图片用于模型训练，训练速度更快，完成训练后可生成写真图片。
2：免训练模式，仅需上传1张图片，跳过模型训练环节，直接生成写真图片。
    */
    @SerializedName("TrainMode")
    @Expose
    private Long TrainMode;

    /**
     * Get 写真模型 ID。由英文大小写字母、数字及下划线组成。
用于唯一标识一个写真模型，一个写真模型只能用于一个人物的写真图片生成。 
     * @return ModelId 写真模型 ID。由英文大小写字母、数字及下划线组成。
用于唯一标识一个写真模型，一个写真模型只能用于一个人物的写真图片生成。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 写真模型 ID。由英文大小写字母、数字及下划线组成。
用于唯一标识一个写真模型，一个写真模型只能用于一个人物的写真图片生成。
     * @param ModelId 写真模型 ID。由英文大小写字母、数字及下划线组成。
用于唯一标识一个写真模型，一个写真模型只能用于一个人物的写真图片生成。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 写真模型训练用的基础图像 URL，用于固定写真模型可生成的人物。
图片数量：1张。
图片内容：单人，脸部清晰。
图片限制：单边分辨率小于2000，转成 Base64 字符串后小于 5MB。
 
     * @return BaseUrl 写真模型训练用的基础图像 URL，用于固定写真模型可生成的人物。
图片数量：1张。
图片内容：单人，脸部清晰。
图片限制：单边分辨率小于2000，转成 Base64 字符串后小于 5MB。

     */
    public String getBaseUrl() {
        return this.BaseUrl;
    }

    /**
     * Set 写真模型训练用的基础图像 URL，用于固定写真模型可生成的人物。
图片数量：1张。
图片内容：单人，脸部清晰。
图片限制：单边分辨率小于2000，转成 Base64 字符串后小于 5MB。

     * @param BaseUrl 写真模型训练用的基础图像 URL，用于固定写真模型可生成的人物。
图片数量：1张。
图片内容：单人，脸部清晰。
图片限制：单边分辨率小于2000，转成 Base64 字符串后小于 5MB。

     */
    public void setBaseUrl(String BaseUrl) {
        this.BaseUrl = BaseUrl;
    }

    /**
     * Get 写真模型训练用的图像 URL 列表，仅常规训练模式需要上传。
图片数量：19 - 24 张。
图片内容：单人，脸部清晰，和基础图像中的人物为同一人。
图片限制：单边分辨率小于2000，转成 Base64 字符串后小于 5MB。 
     * @return Urls 写真模型训练用的图像 URL 列表，仅常规训练模式需要上传。
图片数量：19 - 24 张。
图片内容：单人，脸部清晰，和基础图像中的人物为同一人。
图片限制：单边分辨率小于2000，转成 Base64 字符串后小于 5MB。
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set 写真模型训练用的图像 URL 列表，仅常规训练模式需要上传。
图片数量：19 - 24 张。
图片内容：单人，脸部清晰，和基础图像中的人物为同一人。
图片限制：单边分辨率小于2000，转成 Base64 字符串后小于 5MB。
     * @param Urls 写真模型训练用的图像 URL 列表，仅常规训练模式需要上传。
图片数量：19 - 24 张。
图片内容：单人，脸部清晰，和基础图像中的人物为同一人。
图片限制：单边分辨率小于2000，转成 Base64 字符串后小于 5MB。
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get 训练图像质量过滤开关配置。
支持开启或关闭对训练图像分辨率下限、脸部区域大小、脸部遮挡的过滤，默认开启以上过滤。
如果训练图像内包含多人脸或无人脸、和 Base 人像不为同一人也将被过滤，不可关闭该过滤条件。
建议：关闭以上过滤可能导致写真生成效果受损，建议使用单人、正脸、脸部区域占比较大、脸部清晰无遮挡、无大角度偏转、无夸张表情的图像进行训练。 
     * @return Filter 训练图像质量过滤开关配置。
支持开启或关闭对训练图像分辨率下限、脸部区域大小、脸部遮挡的过滤，默认开启以上过滤。
如果训练图像内包含多人脸或无人脸、和 Base 人像不为同一人也将被过滤，不可关闭该过滤条件。
建议：关闭以上过滤可能导致写真生成效果受损，建议使用单人、正脸、脸部区域占比较大、脸部清晰无遮挡、无大角度偏转、无夸张表情的图像进行训练。
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set 训练图像质量过滤开关配置。
支持开启或关闭对训练图像分辨率下限、脸部区域大小、脸部遮挡的过滤，默认开启以上过滤。
如果训练图像内包含多人脸或无人脸、和 Base 人像不为同一人也将被过滤，不可关闭该过滤条件。
建议：关闭以上过滤可能导致写真生成效果受损，建议使用单人、正脸、脸部区域占比较大、脸部清晰无遮挡、无大角度偏转、无夸张表情的图像进行训练。
     * @param Filter 训练图像质量过滤开关配置。
支持开启或关闭对训练图像分辨率下限、脸部区域大小、脸部遮挡的过滤，默认开启以上过滤。
如果训练图像内包含多人脸或无人脸、和 Base 人像不为同一人也将被过滤，不可关闭该过滤条件。
建议：关闭以上过滤可能导致写真生成效果受损，建议使用单人、正脸、脸部区域占比较大、脸部清晰无遮挡、无大角度偏转、无夸张表情的图像进行训练。
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 训练模式。
默认使用常规训练模式。如果使用快速训练模式和免训练模式，只需要在 BaseUrl 中传入1张图片，Urls.N 中无需传入图片。
0：常规训练模式，上传多张图片用于模型训练，完成训练后可生成写真图片。
1：快速训练模式，仅需上传1张图片用于模型训练，训练速度更快，完成训练后可生成写真图片。
2：免训练模式，仅需上传1张图片，跳过模型训练环节，直接生成写真图片。 
     * @return TrainMode 训练模式。
默认使用常规训练模式。如果使用快速训练模式和免训练模式，只需要在 BaseUrl 中传入1张图片，Urls.N 中无需传入图片。
0：常规训练模式，上传多张图片用于模型训练，完成训练后可生成写真图片。
1：快速训练模式，仅需上传1张图片用于模型训练，训练速度更快，完成训练后可生成写真图片。
2：免训练模式，仅需上传1张图片，跳过模型训练环节，直接生成写真图片。
     */
    public Long getTrainMode() {
        return this.TrainMode;
    }

    /**
     * Set 训练模式。
默认使用常规训练模式。如果使用快速训练模式和免训练模式，只需要在 BaseUrl 中传入1张图片，Urls.N 中无需传入图片。
0：常规训练模式，上传多张图片用于模型训练，完成训练后可生成写真图片。
1：快速训练模式，仅需上传1张图片用于模型训练，训练速度更快，完成训练后可生成写真图片。
2：免训练模式，仅需上传1张图片，跳过模型训练环节，直接生成写真图片。
     * @param TrainMode 训练模式。
默认使用常规训练模式。如果使用快速训练模式和免训练模式，只需要在 BaseUrl 中传入1张图片，Urls.N 中无需传入图片。
0：常规训练模式，上传多张图片用于模型训练，完成训练后可生成写真图片。
1：快速训练模式，仅需上传1张图片用于模型训练，训练速度更快，完成训练后可生成写真图片。
2：免训练模式，仅需上传1张图片，跳过模型训练环节，直接生成写真图片。
     */
    public void setTrainMode(Long TrainMode) {
        this.TrainMode = TrainMode;
    }

    public UploadTrainPortraitImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadTrainPortraitImagesRequest(UploadTrainPortraitImagesRequest source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.BaseUrl != null) {
            this.BaseUrl = new String(source.BaseUrl);
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.TrainMode != null) {
            this.TrainMode = new Long(source.TrainMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "BaseUrl", this.BaseUrl);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "TrainMode", this.TrainMode);

    }
}

