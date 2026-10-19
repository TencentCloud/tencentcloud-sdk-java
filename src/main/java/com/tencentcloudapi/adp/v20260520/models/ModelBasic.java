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
    * <p>模型描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模型图标地址</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>模型ID</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>模型类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_TYPE_LLM</td><td>1</td><td>LLM模型</td></tr><tr><td>MODEL_TYPE_RERANK</td><td>2</td><td>Rerank模型</td></tr><tr><td>MODEL_TYPE_EMBEDDING</td><td>3</td><td>Embedding模型</td></tr><tr><td>MODEL_TYPE_FILE_PARSE</td><td>4</td><td>文档解析模型</td></tr></table>
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>模型描述</p> 
     * @return Description <p>模型描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模型描述</p>
     * @param Description <p>模型描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>模型图标地址</p> 
     * @return IconUrl <p>模型图标地址</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>模型图标地址</p>
     * @param IconUrl <p>模型图标地址</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
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
     * Get <p>模型类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_TYPE_LLM</td><td>1</td><td>LLM模型</td></tr><tr><td>MODEL_TYPE_RERANK</td><td>2</td><td>Rerank模型</td></tr><tr><td>MODEL_TYPE_EMBEDDING</td><td>3</td><td>Embedding模型</td></tr><tr><td>MODEL_TYPE_FILE_PARSE</td><td>4</td><td>文档解析模型</td></tr></table> 
     * @return ModelType <p>模型类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_TYPE_LLM</td><td>1</td><td>LLM模型</td></tr><tr><td>MODEL_TYPE_RERANK</td><td>2</td><td>Rerank模型</td></tr><tr><td>MODEL_TYPE_EMBEDDING</td><td>3</td><td>Embedding模型</td></tr><tr><td>MODEL_TYPE_FILE_PARSE</td><td>4</td><td>文档解析模型</td></tr></table>
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_TYPE_LLM</td><td>1</td><td>LLM模型</td></tr><tr><td>MODEL_TYPE_RERANK</td><td>2</td><td>Rerank模型</td></tr><tr><td>MODEL_TYPE_EMBEDDING</td><td>3</td><td>Embedding模型</td></tr><tr><td>MODEL_TYPE_FILE_PARSE</td><td>4</td><td>文档解析模型</td></tr></table>
     * @param ModelType <p>模型类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_TYPE_LLM</td><td>1</td><td>LLM模型</td></tr><tr><td>MODEL_TYPE_RERANK</td><td>2</td><td>Rerank模型</td></tr><tr><td>MODEL_TYPE_EMBEDDING</td><td>3</td><td>Embedding模型</td></tr><tr><td>MODEL_TYPE_FILE_PARSE</td><td>4</td><td>文档解析模型</td></tr></table>
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>模型名称</p> 
     * @return Name <p>模型名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型名称</p>
     * @param Name <p>模型名称</p>
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

