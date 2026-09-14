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

public class KBSpec extends AbstractModel {

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>ES 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsConfig")
    @Expose
    private ESConfig EsConfig;

    /**
    * <p>模型配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelConfig")
    @Expose
    private KBModelConfig ModelConfig;

    /**
    * <p>知识库名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>所有者 ID</p>
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>ES 配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsConfig <p>ES 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ESConfig getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set <p>ES 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsConfig <p>ES 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsConfig(ESConfig EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get <p>模型配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelConfig <p>模型配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KBModelConfig getModelConfig() {
        return this.ModelConfig;
    }

    /**
     * Set <p>模型配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelConfig <p>模型配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelConfig(KBModelConfig ModelConfig) {
        this.ModelConfig = ModelConfig;
    }

    /**
     * Get <p>知识库名称</p> 
     * @return Name <p>知识库名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>知识库名称</p>
     * @param Name <p>知识库名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>所有者 ID</p> 
     * @return OwnerId <p>所有者 ID</p>
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set <p>所有者 ID</p>
     * @param OwnerId <p>所有者 ID</p>
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    public KBSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBSpec(KBSpec source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EsConfig != null) {
            this.EsConfig = new ESConfig(source.EsConfig);
        }
        if (source.ModelConfig != null) {
            this.ModelConfig = new KBModelConfig(source.ModelConfig);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "EsConfig.", this.EsConfig);
        this.setParamObj(map, prefix + "ModelConfig.", this.ModelConfig);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);

    }
}

