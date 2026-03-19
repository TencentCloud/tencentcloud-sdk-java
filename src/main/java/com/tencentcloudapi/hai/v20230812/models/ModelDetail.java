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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelDetail extends AbstractModel {

    /**
    * 模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 应用描述	
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 官方社区链接	
    */
    @SerializedName("CommunityUrl")
    @Expose
    private String CommunityUrl;

    /**
    * 最佳实践链接
    */
    @SerializedName("GuideUrl")
    @Expose
    private String GuideUrl;

    /**
    * 模型状态
    */
    @SerializedName("ModelState")
    @Expose
    private String ModelState;

    /**
    * 应用对应的标签，如机器学习
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 配置环境
    */
    @SerializedName("ConfigEnvironment")
    @Expose
    private String ConfigEnvironment;

    /**
     * Get 模型名称 
     * @return ModelName 模型名称
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
     * @param ModelName 模型名称
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 模型ID 
     * @return ModelId 模型ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型ID
     * @param ModelId 模型ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 应用描述	 
     * @return Description 应用描述	
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 应用描述	
     * @param Description 应用描述	
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 官方社区链接	 
     * @return CommunityUrl 官方社区链接	
     */
    public String getCommunityUrl() {
        return this.CommunityUrl;
    }

    /**
     * Set 官方社区链接	
     * @param CommunityUrl 官方社区链接	
     */
    public void setCommunityUrl(String CommunityUrl) {
        this.CommunityUrl = CommunityUrl;
    }

    /**
     * Get 最佳实践链接 
     * @return GuideUrl 最佳实践链接
     */
    public String getGuideUrl() {
        return this.GuideUrl;
    }

    /**
     * Set 最佳实践链接
     * @param GuideUrl 最佳实践链接
     */
    public void setGuideUrl(String GuideUrl) {
        this.GuideUrl = GuideUrl;
    }

    /**
     * Get 模型状态 
     * @return ModelState 模型状态
     */
    public String getModelState() {
        return this.ModelState;
    }

    /**
     * Set 模型状态
     * @param ModelState 模型状态
     */
    public void setModelState(String ModelState) {
        this.ModelState = ModelState;
    }

    /**
     * Get 应用对应的标签，如机器学习 
     * @return Tags 应用对应的标签，如机器学习
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 应用对应的标签，如机器学习
     * @param Tags 应用对应的标签，如机器学习
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 配置环境 
     * @return ConfigEnvironment 配置环境
     */
    public String getConfigEnvironment() {
        return this.ConfigEnvironment;
    }

    /**
     * Set 配置环境
     * @param ConfigEnvironment 配置环境
     */
    public void setConfigEnvironment(String ConfigEnvironment) {
        this.ConfigEnvironment = ConfigEnvironment;
    }

    public ModelDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelDetail(ModelDetail source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CommunityUrl != null) {
            this.CommunityUrl = new String(source.CommunityUrl);
        }
        if (source.GuideUrl != null) {
            this.GuideUrl = new String(source.GuideUrl);
        }
        if (source.ModelState != null) {
            this.ModelState = new String(source.ModelState);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.ConfigEnvironment != null) {
            this.ConfigEnvironment = new String(source.ConfigEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CommunityUrl", this.CommunityUrl);
        this.setParamSimple(map, prefix + "GuideUrl", this.GuideUrl);
        this.setParamSimple(map, prefix + "ModelState", this.ModelState);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ConfigEnvironment", this.ConfigEnvironment);

    }
}

