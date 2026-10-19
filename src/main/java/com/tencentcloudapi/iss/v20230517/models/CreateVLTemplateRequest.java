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

public class CreateVLTemplateRequest extends AbstractModel {

    /**
    * <p>AI 模型</p><p>枚举值：</p><ul><li>ivc-vl-1.0： 视图大模型</li></ul>
    */
    @SerializedName("AIModel")
    @Expose
    private String AIModel;

    /**
    * <p>模板名称，仅支持中文/英文/数字/_/-，最长 32 个字符</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>提示词，最大 2MB</p>
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
    * <p>生效时段列表，最多 100 条</p>
    */
    @SerializedName("Times")
    @Expose
    private EffectiveTime [] Times;

    /**
    * <p>模板描述，最长 256 个字符</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>图片场景配置（AnalysisMode=image 时必填）</p>
    */
    @SerializedName("ImageConfig")
    @Expose
    private ImageSceneInfo ImageConfig;

    /**
     * Get <p>AI 模型</p><p>枚举值：</p><ul><li>ivc-vl-1.0： 视图大模型</li></ul> 
     * @return AIModel <p>AI 模型</p><p>枚举值：</p><ul><li>ivc-vl-1.0： 视图大模型</li></ul>
     */
    public String getAIModel() {
        return this.AIModel;
    }

    /**
     * Set <p>AI 模型</p><p>枚举值：</p><ul><li>ivc-vl-1.0： 视图大模型</li></ul>
     * @param AIModel <p>AI 模型</p><p>枚举值：</p><ul><li>ivc-vl-1.0： 视图大模型</li></ul>
     */
    public void setAIModel(String AIModel) {
        this.AIModel = AIModel;
    }

    /**
     * Get <p>模板名称，仅支持中文/英文/数字/_/-，最长 32 个字符</p> 
     * @return Name <p>模板名称，仅支持中文/英文/数字/_/-，最长 32 个字符</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模板名称，仅支持中文/英文/数字/_/-，最长 32 个字符</p>
     * @param Name <p>模板名称，仅支持中文/英文/数字/_/-，最长 32 个字符</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>提示词，最大 2MB</p> 
     * @return Prompt <p>提示词，最大 2MB</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>提示词，最大 2MB</p>
     * @param Prompt <p>提示词，最大 2MB</p>
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
     * Get <p>生效时段列表，最多 100 条</p> 
     * @return Times <p>生效时段列表，最多 100 条</p>
     */
    public EffectiveTime [] getTimes() {
        return this.Times;
    }

    /**
     * Set <p>生效时段列表，最多 100 条</p>
     * @param Times <p>生效时段列表，最多 100 条</p>
     */
    public void setTimes(EffectiveTime [] Times) {
        this.Times = Times;
    }

    /**
     * Get <p>模板描述，最长 256 个字符</p> 
     * @return Describe <p>模板描述，最长 256 个字符</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>模板描述，最长 256 个字符</p>
     * @param Describe <p>模板描述，最长 256 个字符</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>图片场景配置（AnalysisMode=image 时必填）</p> 
     * @return ImageConfig <p>图片场景配置（AnalysisMode=image 时必填）</p>
     */
    public ImageSceneInfo getImageConfig() {
        return this.ImageConfig;
    }

    /**
     * Set <p>图片场景配置（AnalysisMode=image 时必填）</p>
     * @param ImageConfig <p>图片场景配置（AnalysisMode=image 时必填）</p>
     */
    public void setImageConfig(ImageSceneInfo ImageConfig) {
        this.ImageConfig = ImageConfig;
    }

    public CreateVLTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVLTemplateRequest(CreateVLTemplateRequest source) {
        if (source.AIModel != null) {
            this.AIModel = new String(source.AIModel);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.AnalysisMode != null) {
            this.AnalysisMode = new String(source.AnalysisMode);
        }
        if (source.Times != null) {
            this.Times = new EffectiveTime[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new EffectiveTime(source.Times[i]);
            }
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.ImageConfig != null) {
            this.ImageConfig = new ImageSceneInfo(source.ImageConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AIModel", this.AIModel);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamObj(map, prefix + "ImageConfig.", this.ImageConfig);

    }
}

