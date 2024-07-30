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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelInfo extends AbstractModel {

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelDesc")
    @Expose
    private String ModelDesc;

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * 提示词内容字符限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptWordsLimit")
    @Expose
    private String PromptWordsLimit;

    /**
     * Get 模型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 模型描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelDesc 模型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelDesc() {
        return this.ModelDesc;
    }

    /**
     * Set 模型描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelDesc 模型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelDesc(String ModelDesc) {
        this.ModelDesc = ModelDesc;
    }

    /**
     * Get 模型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceStatus 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceStatus 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get 提示词内容字符限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptWordsLimit 提示词内容字符限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPromptWordsLimit() {
        return this.PromptWordsLimit;
    }

    /**
     * Set 提示词内容字符限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptWordsLimit 提示词内容字符限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptWordsLimit(String PromptWordsLimit) {
        this.PromptWordsLimit = PromptWordsLimit;
    }

    public ModelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelInfo(ModelInfo source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelDesc != null) {
            this.ModelDesc = new String(source.ModelDesc);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
        if (source.PromptWordsLimit != null) {
            this.PromptWordsLimit = new String(source.PromptWordsLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelDesc", this.ModelDesc);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "PromptWordsLimit", this.PromptWordsLimit);

    }
}

