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
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型ID</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>应用描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>官方社区链接</p>
    */
    @SerializedName("CommunityUrl")
    @Expose
    private String CommunityUrl;

    /**
    * <p>最佳实践链接</p>
    */
    @SerializedName("GuideUrl")
    @Expose
    private String GuideUrl;

    /**
    * <p>模型状态</p>
    */
    @SerializedName("ModelState")
    @Expose
    private String ModelState;

    /**
    * <p>应用对应的标签，如机器学习</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>配置环境</p>
    */
    @SerializedName("ConfigEnvironment")
    @Expose
    private String ConfigEnvironment;

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型ID</p> 
     * @return ModelId <p>模型ID</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型ID</p>
     * @param ModelId <p>模型ID</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>应用描述</p> 
     * @return Description <p>应用描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>应用描述</p>
     * @param Description <p>应用描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>官方社区链接</p> 
     * @return CommunityUrl <p>官方社区链接</p>
     */
    public String getCommunityUrl() {
        return this.CommunityUrl;
    }

    /**
     * Set <p>官方社区链接</p>
     * @param CommunityUrl <p>官方社区链接</p>
     */
    public void setCommunityUrl(String CommunityUrl) {
        this.CommunityUrl = CommunityUrl;
    }

    /**
     * Get <p>最佳实践链接</p> 
     * @return GuideUrl <p>最佳实践链接</p>
     */
    public String getGuideUrl() {
        return this.GuideUrl;
    }

    /**
     * Set <p>最佳实践链接</p>
     * @param GuideUrl <p>最佳实践链接</p>
     */
    public void setGuideUrl(String GuideUrl) {
        this.GuideUrl = GuideUrl;
    }

    /**
     * Get <p>模型状态</p> 
     * @return ModelState <p>模型状态</p>
     */
    public String getModelState() {
        return this.ModelState;
    }

    /**
     * Set <p>模型状态</p>
     * @param ModelState <p>模型状态</p>
     */
    public void setModelState(String ModelState) {
        this.ModelState = ModelState;
    }

    /**
     * Get <p>应用对应的标签，如机器学习</p> 
     * @return Tags <p>应用对应的标签，如机器学习</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>应用对应的标签，如机器学习</p>
     * @param Tags <p>应用对应的标签，如机器学习</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>配置环境</p> 
     * @return ConfigEnvironment <p>配置环境</p>
     */
    public String getConfigEnvironment() {
        return this.ConfigEnvironment;
    }

    /**
     * Set <p>配置环境</p>
     * @param ConfigEnvironment <p>配置环境</p>
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

