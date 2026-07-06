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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelListRequest extends AbstractModel {

    /**
    * <p>模型 ID 列表。最多支持 10 个，不支持重复。</p>
    */
    @SerializedName("ModelIds")
    @Expose
    private String [] ModelIds;

    /**
    * <p>模型名称列表。最多支持 10 个，不支持重复。</p>
    */
    @SerializedName("ModelNames")
    @Expose
    private String [] ModelNames;

    /**
    * <p>模型类型列表，筛选指定类型的模型。最多支持 10 个，不支持重复。取值：Text（文本）、Vision（视觉）、Multimodal（多模态）、Speech（语音）、Embedding（向量）。</p>
    */
    @SerializedName("ModelTypes")
    @Expose
    private String [] ModelTypes;

    /**
    * <p>模型标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>返回数量，默认为 20，最大值为 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>模型 ID 列表。最多支持 10 个，不支持重复。</p> 
     * @return ModelIds <p>模型 ID 列表。最多支持 10 个，不支持重复。</p>
     */
    public String [] getModelIds() {
        return this.ModelIds;
    }

    /**
     * Set <p>模型 ID 列表。最多支持 10 个，不支持重复。</p>
     * @param ModelIds <p>模型 ID 列表。最多支持 10 个，不支持重复。</p>
     */
    public void setModelIds(String [] ModelIds) {
        this.ModelIds = ModelIds;
    }

    /**
     * Get <p>模型名称列表。最多支持 10 个，不支持重复。</p> 
     * @return ModelNames <p>模型名称列表。最多支持 10 个，不支持重复。</p>
     */
    public String [] getModelNames() {
        return this.ModelNames;
    }

    /**
     * Set <p>模型名称列表。最多支持 10 个，不支持重复。</p>
     * @param ModelNames <p>模型名称列表。最多支持 10 个，不支持重复。</p>
     */
    public void setModelNames(String [] ModelNames) {
        this.ModelNames = ModelNames;
    }

    /**
     * Get <p>模型类型列表，筛选指定类型的模型。最多支持 10 个，不支持重复。取值：Text（文本）、Vision（视觉）、Multimodal（多模态）、Speech（语音）、Embedding（向量）。</p> 
     * @return ModelTypes <p>模型类型列表，筛选指定类型的模型。最多支持 10 个，不支持重复。取值：Text（文本）、Vision（视觉）、Multimodal（多模态）、Speech（语音）、Embedding（向量）。</p>
     */
    public String [] getModelTypes() {
        return this.ModelTypes;
    }

    /**
     * Set <p>模型类型列表，筛选指定类型的模型。最多支持 10 个，不支持重复。取值：Text（文本）、Vision（视觉）、Multimodal（多模态）、Speech（语音）、Embedding（向量）。</p>
     * @param ModelTypes <p>模型类型列表，筛选指定类型的模型。最多支持 10 个，不支持重复。取值：Text（文本）、Vision（视觉）、Multimodal（多模态）、Speech（语音）、Embedding（向量）。</p>
     */
    public void setModelTypes(String [] ModelTypes) {
        this.ModelTypes = ModelTypes;
    }

    /**
     * Get <p>模型标签</p> 
     * @return Tags <p>模型标签</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>模型标签</p>
     * @param Tags <p>模型标签</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>返回数量，默认为 20，最大值为 100。</p> 
     * @return Limit <p>返回数量，默认为 20，最大值为 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为 20，最大值为 100。</p>
     * @param Limit <p>返回数量，默认为 20，最大值为 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为 0。</p> 
     * @return Offset <p>偏移量，默认为 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为 0。</p>
     * @param Offset <p>偏移量，默认为 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeModelListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelListRequest(DescribeModelListRequest source) {
        if (source.ModelIds != null) {
            this.ModelIds = new String[source.ModelIds.length];
            for (int i = 0; i < source.ModelIds.length; i++) {
                this.ModelIds[i] = new String(source.ModelIds[i]);
            }
        }
        if (source.ModelNames != null) {
            this.ModelNames = new String[source.ModelNames.length];
            for (int i = 0; i < source.ModelNames.length; i++) {
                this.ModelNames[i] = new String(source.ModelNames[i]);
            }
        }
        if (source.ModelTypes != null) {
            this.ModelTypes = new String[source.ModelTypes.length];
            for (int i = 0; i < source.ModelTypes.length; i++) {
                this.ModelTypes[i] = new String(source.ModelTypes[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ModelIds.", this.ModelIds);
        this.setParamArraySimple(map, prefix + "ModelNames.", this.ModelNames);
        this.setParamArraySimple(map, prefix + "ModelTypes.", this.ModelTypes);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

