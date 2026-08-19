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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateInferenceModelRequest extends AbstractModel {

    /**
    * <p>推理模型UID</p>
    */
    @SerializedName("ModelUid")
    @Expose
    private String ModelUid;

    /**
    * <p>模型名称（可选，不传则不修改）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>模型描述（可选）</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模型参数量（可选，如 7B、1.5B）</p>
    */
    @SerializedName("ParameterSize")
    @Expose
    private String ParameterSize;

    /**
    * <p>模型标签列表（可选）</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>系统标签列表（TagKey-TagValue）</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
     * Get <p>推理模型UID</p> 
     * @return ModelUid <p>推理模型UID</p>
     */
    public String getModelUid() {
        return this.ModelUid;
    }

    /**
     * Set <p>推理模型UID</p>
     * @param ModelUid <p>推理模型UID</p>
     */
    public void setModelUid(String ModelUid) {
        this.ModelUid = ModelUid;
    }

    /**
     * Get <p>模型名称（可选，不传则不修改）</p> 
     * @return Name <p>模型名称（可选，不传则不修改）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型名称（可选，不传则不修改）</p>
     * @param Name <p>模型名称（可选，不传则不修改）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>模型描述（可选）</p> 
     * @return Description <p>模型描述（可选）</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模型描述（可选）</p>
     * @param Description <p>模型描述（可选）</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>模型参数量（可选，如 7B、1.5B）</p> 
     * @return ParameterSize <p>模型参数量（可选，如 7B、1.5B）</p>
     */
    public String getParameterSize() {
        return this.ParameterSize;
    }

    /**
     * Set <p>模型参数量（可选，如 7B、1.5B）</p>
     * @param ParameterSize <p>模型参数量（可选，如 7B、1.5B）</p>
     */
    public void setParameterSize(String ParameterSize) {
        this.ParameterSize = ParameterSize;
    }

    /**
     * Get <p>模型标签列表（可选）</p> 
     * @return Tags <p>模型标签列表（可选）</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>模型标签列表（可选）</p>
     * @param Tags <p>模型标签列表（可选）</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>系统标签列表（TagKey-TagValue）</p> 
     * @return ResourceTags <p>系统标签列表（TagKey-TagValue）</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>系统标签列表（TagKey-TagValue）</p>
     * @param ResourceTags <p>系统标签列表（TagKey-TagValue）</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    public UpdateInferenceModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateInferenceModelRequest(UpdateInferenceModelRequest source) {
        if (source.ModelUid != null) {
            this.ModelUid = new String(source.ModelUid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParameterSize != null) {
            this.ParameterSize = new String(source.ParameterSize);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelUid", this.ModelUid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ParameterSize", this.ParameterSize);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

