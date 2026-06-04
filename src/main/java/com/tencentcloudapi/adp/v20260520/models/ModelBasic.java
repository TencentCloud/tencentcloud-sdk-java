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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelBasic extends AbstractModel {

    /**
    * 模型描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模型图标地址
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型类型。1-LLM模型, 2-Rerank模型, 3-Embedding模型, 4-文档解析模型
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * 模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 模型描述 
     * @return Description 模型描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模型描述
     * @param Description 模型描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模型图标地址 
     * @return IconUrl 模型图标地址
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 模型图标地址
     * @param IconUrl 模型图标地址
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
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
     * Get 模型类型。1-LLM模型, 2-Rerank模型, 3-Embedding模型, 4-文档解析模型 
     * @return ModelType 模型类型。1-LLM模型, 2-Rerank模型, 3-Embedding模型, 4-文档解析模型
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set 模型类型。1-LLM模型, 2-Rerank模型, 3-Embedding模型, 4-文档解析模型
     * @param ModelType 模型类型。1-LLM模型, 2-Rerank模型, 3-Embedding模型, 4-文档解析模型
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 模型名称 
     * @return Name 模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模型名称
     * @param Name 模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ModelBasic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelBasic(ModelBasic source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelType != null) {
            this.ModelType = new Long(source.ModelType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

