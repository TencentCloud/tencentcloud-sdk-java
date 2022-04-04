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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialInfo extends AbstractModel{

    /**
    * 素材id
    */
    @SerializedName("MaterialId")
    @Expose
    private Long MaterialId;

    /**
    * 素材名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaterialName")
    @Expose
    private String MaterialName;

    /**
    * 素材状态, -1: 删除 0: 启用 1: 禁用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 素材id 
     * @return MaterialId 素材id
     */
    public Long getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 素材id
     * @param MaterialId 素材id
     */
    public void setMaterialId(Long MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 素材名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaterialName 素材名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaterialName() {
        return this.MaterialName;
    }

    /**
     * Set 素材名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaterialName 素材名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }

    /**
     * Get 素材状态, -1: 删除 0: 启用 1: 禁用 
     * @return Status 素材状态, -1: 删除 0: 启用 1: 禁用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 素材状态, -1: 删除 0: 启用 1: 禁用
     * @param Status 素材状态, -1: 删除 0: 启用 1: 禁用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public MaterialInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaterialInfo(MaterialInfo source) {
        if (source.MaterialId != null) {
            this.MaterialId = new Long(source.MaterialId);
        }
        if (source.MaterialName != null) {
            this.MaterialName = new String(source.MaterialName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "MaterialName", this.MaterialName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

