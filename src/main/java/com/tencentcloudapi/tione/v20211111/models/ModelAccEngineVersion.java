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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelAccEngineVersion extends AbstractModel{

    /**
    * 模型格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelFormat")
    @Expose
    private String ModelFormat;

    /**
    * 引擎版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineVersions")
    @Expose
    private EngineVersion [] EngineVersions;

    /**
     * Get 模型格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelFormat 模型格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelFormat() {
        return this.ModelFormat;
    }

    /**
     * Set 模型格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelFormat 模型格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelFormat(String ModelFormat) {
        this.ModelFormat = ModelFormat;
    }

    /**
     * Get 引擎版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineVersions 引擎版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EngineVersion [] getEngineVersions() {
        return this.EngineVersions;
    }

    /**
     * Set 引擎版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineVersions 引擎版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineVersions(EngineVersion [] EngineVersions) {
        this.EngineVersions = EngineVersions;
    }

    public ModelAccEngineVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelAccEngineVersion(ModelAccEngineVersion source) {
        if (source.ModelFormat != null) {
            this.ModelFormat = new String(source.ModelFormat);
        }
        if (source.EngineVersions != null) {
            this.EngineVersions = new EngineVersion[source.EngineVersions.length];
            for (int i = 0; i < source.EngineVersions.length; i++) {
                this.EngineVersions[i] = new EngineVersion(source.EngineVersions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelFormat", this.ModelFormat);
        this.setParamArrayObj(map, prefix + "EngineVersions.", this.EngineVersions);

    }
}

