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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VLTemplateInfo extends AbstractModel {

    /**
    * <p>模板ID</p>
    */
    @SerializedName("VLTemplateId")
    @Expose
    private String VLTemplateId;

    /**
    * <p>AI 模型</p><p>枚举值：</p><ul><li>IVC-G： 视图默认大模型</li></ul>
    */
    @SerializedName("AIModel")
    @Expose
    private String AIModel;

    /**
    * <p>AI场景名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>AI场景描述</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>提示词</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>分析模式</p><p>枚举值：</p><ul><li>image： 图片模式</li><li>video： 视频模式</li></ul>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
    * <p>图片场景配置</p>
    */
    @SerializedName("ImageConfig")
    @Expose
    private ImageSceneInfo ImageConfig;

    /**
    * <p>生效时段列表</p>
    */
    @SerializedName("Times")
    @Expose
    private EffectiveTime [] Times;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>最近一次更新时间</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>是否关联到视觉理解计划</p>
    */
    @SerializedName("IsUsed")
    @Expose
    private Boolean IsUsed;

    /**
    * <p>视频场景配置</p>
    */
    @SerializedName("VideoConfig")
    @Expose
    private VideoSceneInfo VideoConfig;

    /**
     * Get <p>模板ID</p> 
     * @return VLTemplateId <p>模板ID</p>
     */
    public String getVLTemplateId() {
        return this.VLTemplateId;
    }

    /**
     * Set <p>模板ID</p>
     * @param VLTemplateId <p>模板ID</p>
     */
    public void setVLTemplateId(String VLTemplateId) {
        this.VLTemplateId = VLTemplateId;
    }

    /**
     * Get <p>AI 模型</p><p>枚举值：</p><ul><li>IVC-G： 视图默认大模型</li></ul> 
     * @return AIModel <p>AI 模型</p><p>枚举值：</p><ul><li>IVC-G： 视图默认大模型</li></ul>
     */
    public String getAIModel() {
        return this.AIModel;
    }

    /**
     * Set <p>AI 模型</p><p>枚举值：</p><ul><li>IVC-G： 视图默认大模型</li></ul>
     * @param AIModel <p>AI 模型</p><p>枚举值：</p><ul><li>IVC-G： 视图默认大模型</li></ul>
     */
    public void setAIModel(String AIModel) {
        this.AIModel = AIModel;
    }

    /**
     * Get <p>AI场景名称</p> 
     * @return Name <p>AI场景名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>AI场景名称</p>
     * @param Name <p>AI场景名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>AI场景描述</p> 
     * @return Describe <p>AI场景描述</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>AI场景描述</p>
     * @param Describe <p>AI场景描述</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>提示词</p> 
     * @return Prompt <p>提示词</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>提示词</p>
     * @param Prompt <p>提示词</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>分析模式</p><p>枚举值：</p><ul><li>image： 图片模式</li><li>video： 视频模式</li></ul> 
     * @return AnalysisMode <p>分析模式</p><p>枚举值：</p><ul><li>image： 图片模式</li><li>video： 视频模式</li></ul>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>分析模式</p><p>枚举值：</p><ul><li>image： 图片模式</li><li>video： 视频模式</li></ul>
     * @param AnalysisMode <p>分析模式</p><p>枚举值：</p><ul><li>image： 图片模式</li><li>video： 视频模式</li></ul>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    /**
     * Get <p>图片场景配置</p> 
     * @return ImageConfig <p>图片场景配置</p>
     */
    public ImageSceneInfo getImageConfig() {
        return this.ImageConfig;
    }

    /**
     * Set <p>图片场景配置</p>
     * @param ImageConfig <p>图片场景配置</p>
     */
    public void setImageConfig(ImageSceneInfo ImageConfig) {
        this.ImageConfig = ImageConfig;
    }

    /**
     * Get <p>生效时段列表</p> 
     * @return Times <p>生效时段列表</p>
     */
    public EffectiveTime [] getTimes() {
        return this.Times;
    }

    /**
     * Set <p>生效时段列表</p>
     * @param Times <p>生效时段列表</p>
     */
    public void setTimes(EffectiveTime [] Times) {
        this.Times = Times;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>最近一次更新时间</p> 
     * @return UpdatedAt <p>最近一次更新时间</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>最近一次更新时间</p>
     * @param UpdatedAt <p>最近一次更新时间</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>是否关联到视觉理解计划</p> 
     * @return IsUsed <p>是否关联到视觉理解计划</p>
     */
    public Boolean getIsUsed() {
        return this.IsUsed;
    }

    /**
     * Set <p>是否关联到视觉理解计划</p>
     * @param IsUsed <p>是否关联到视觉理解计划</p>
     */
    public void setIsUsed(Boolean IsUsed) {
        this.IsUsed = IsUsed;
    }

    /**
     * Get <p>视频场景配置</p> 
     * @return VideoConfig <p>视频场景配置</p>
     */
    public VideoSceneInfo getVideoConfig() {
        return this.VideoConfig;
    }

    /**
     * Set <p>视频场景配置</p>
     * @param VideoConfig <p>视频场景配置</p>
     */
    public void setVideoConfig(VideoSceneInfo VideoConfig) {
        this.VideoConfig = VideoConfig;
    }

    public VLTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VLTemplateInfo(VLTemplateInfo source) {
        if (source.VLTemplateId != null) {
            this.VLTemplateId = new String(source.VLTemplateId);
        }
        if (source.AIModel != null) {
            this.AIModel = new String(source.AIModel);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.AnalysisMode != null) {
            this.AnalysisMode = new String(source.AnalysisMode);
        }
        if (source.ImageConfig != null) {
            this.ImageConfig = new ImageSceneInfo(source.ImageConfig);
        }
        if (source.Times != null) {
            this.Times = new EffectiveTime[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new EffectiveTime(source.Times[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.IsUsed != null) {
            this.IsUsed = new Boolean(source.IsUsed);
        }
        if (source.VideoConfig != null) {
            this.VideoConfig = new VideoSceneInfo(source.VideoConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VLTemplateId", this.VLTemplateId);
        this.setParamSimple(map, prefix + "AIModel", this.AIModel);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamObj(map, prefix + "ImageConfig.", this.ImageConfig);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "IsUsed", this.IsUsed);
        this.setParamObj(map, prefix + "VideoConfig.", this.VideoConfig);

    }
}

