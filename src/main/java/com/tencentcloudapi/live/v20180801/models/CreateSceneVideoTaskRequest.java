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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSceneVideoTaskRequest extends AbstractModel {

    /**
    * <p>模型名称。</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型版本号。</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>场景化类型。</p><p>枚举值：</p><ul><li>template_effect： 模板特效。</li></ul>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>输入的Prompt。避免出现违规词汇，审核会进行拦截。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>指定输出的视频时长。</p><p>部分场景不支持指定时长。</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>输入的首帧参考图片Url。需外网可访问。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>输入的尾帧参考图片Url。</p>
    */
    @SerializedName("LastImageUrl")
    @Expose
    private String LastImageUrl;

    /**
    * <p>多图参考生视频时，通过该参数指定多张参考图。</p>
    */
    @SerializedName("ImageInfos")
    @Expose
    private SceneVideoReferenceImageInfo [] ImageInfos;

    /**
    * <p>视频编辑时，指定参考视频信息。</p>
    */
    @SerializedName("VideoInfos")
    @Expose
    private SceneVideoReferenceVideoInfo [] VideoInfos;

    /**
    * <p>常规扩展参数。</p>
    */
    @SerializedName("ExtraParameters")
    @Expose
    private SceneVideoExtraParam ExtraParameters;

    /**
    * <p>模型扩展参数，用于透传到模型侧。</p>
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * <p>输出结果存储到私有cos，需授权响应角色权限。</p>
    */
    @SerializedName("StoreCosParam")
    @Expose
    private SceneStoreCosParam StoreCosParam;

    /**
    * <p>操作者名称。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>模型名称。</p> 
     * @return ModelName <p>模型名称。</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称。</p>
     * @param ModelName <p>模型名称。</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型版本号。</p> 
     * @return ModelVersion <p>模型版本号。</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本号。</p>
     * @param ModelVersion <p>模型版本号。</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>场景化类型。</p><p>枚举值：</p><ul><li>template_effect： 模板特效。</li></ul> 
     * @return SceneType <p>场景化类型。</p><p>枚举值：</p><ul><li>template_effect： 模板特效。</li></ul>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>场景化类型。</p><p>枚举值：</p><ul><li>template_effect： 模板特效。</li></ul>
     * @param SceneType <p>场景化类型。</p><p>枚举值：</p><ul><li>template_effect： 模板特效。</li></ul>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>输入的Prompt。避免出现违规词汇，审核会进行拦截。</p> 
     * @return Prompt <p>输入的Prompt。避免出现违规词汇，审核会进行拦截。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>输入的Prompt。避免出现违规词汇，审核会进行拦截。</p>
     * @param Prompt <p>输入的Prompt。避免出现违规词汇，审核会进行拦截。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>指定输出的视频时长。</p><p>部分场景不支持指定时长。</p> 
     * @return Duration <p>指定输出的视频时长。</p><p>部分场景不支持指定时长。</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>指定输出的视频时长。</p><p>部分场景不支持指定时长。</p>
     * @param Duration <p>指定输出的视频时长。</p><p>部分场景不支持指定时长。</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>输入的首帧参考图片Url。需外网可访问。</p> 
     * @return ImageUrl <p>输入的首帧参考图片Url。需外网可访问。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>输入的首帧参考图片Url。需外网可访问。</p>
     * @param ImageUrl <p>输入的首帧参考图片Url。需外网可访问。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>输入的尾帧参考图片Url。</p> 
     * @return LastImageUrl <p>输入的尾帧参考图片Url。</p>
     */
    public String getLastImageUrl() {
        return this.LastImageUrl;
    }

    /**
     * Set <p>输入的尾帧参考图片Url。</p>
     * @param LastImageUrl <p>输入的尾帧参考图片Url。</p>
     */
    public void setLastImageUrl(String LastImageUrl) {
        this.LastImageUrl = LastImageUrl;
    }

    /**
     * Get <p>多图参考生视频时，通过该参数指定多张参考图。</p> 
     * @return ImageInfos <p>多图参考生视频时，通过该参数指定多张参考图。</p>
     */
    public SceneVideoReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set <p>多图参考生视频时，通过该参数指定多张参考图。</p>
     * @param ImageInfos <p>多图参考生视频时，通过该参数指定多张参考图。</p>
     */
    public void setImageInfos(SceneVideoReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get <p>视频编辑时，指定参考视频信息。</p> 
     * @return VideoInfos <p>视频编辑时，指定参考视频信息。</p>
     */
    public SceneVideoReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set <p>视频编辑时，指定参考视频信息。</p>
     * @param VideoInfos <p>视频编辑时，指定参考视频信息。</p>
     */
    public void setVideoInfos(SceneVideoReferenceVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get <p>常规扩展参数。</p> 
     * @return ExtraParameters <p>常规扩展参数。</p>
     */
    public SceneVideoExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set <p>常规扩展参数。</p>
     * @param ExtraParameters <p>常规扩展参数。</p>
     */
    public void setExtraParameters(SceneVideoExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get <p>模型扩展参数，用于透传到模型侧。</p> 
     * @return AdditionalParameters <p>模型扩展参数，用于透传到模型侧。</p>
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set <p>模型扩展参数，用于透传到模型侧。</p>
     * @param AdditionalParameters <p>模型扩展参数，用于透传到模型侧。</p>
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get <p>输出结果存储到私有cos，需授权响应角色权限。</p> 
     * @return StoreCosParam <p>输出结果存储到私有cos，需授权响应角色权限。</p>
     */
    public SceneStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set <p>输出结果存储到私有cos，需授权响应角色权限。</p>
     * @param StoreCosParam <p>输出结果存储到私有cos，需授权响应角色权限。</p>
     */
    public void setStoreCosParam(SceneStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get <p>操作者名称。</p> 
     * @return Operator <p>操作者名称。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者名称。</p>
     * @param Operator <p>操作者名称。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public CreateSceneVideoTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSceneVideoTaskRequest(CreateSceneVideoTaskRequest source) {
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
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.LastImageUrl != null) {
            this.LastImageUrl = new String(source.LastImageUrl);
        }
        if (source.ImageInfos != null) {
            this.ImageInfos = new SceneVideoReferenceImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new SceneVideoReferenceImageInfo(source.ImageInfos[i]);
            }
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new SceneVideoReferenceVideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new SceneVideoReferenceVideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.ExtraParameters != null) {
            this.ExtraParameters = new SceneVideoExtraParam(source.ExtraParameters);
        }
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
        }
        if (source.StoreCosParam != null) {
            this.StoreCosParam = new SceneStoreCosParam(source.StoreCosParam);
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
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "LastImageUrl", this.LastImageUrl);
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

