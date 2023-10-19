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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectConfigResult extends AbstractModel {

    /**
    * 配置名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 配置方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeType")
    @Expose
    private String IncludeType;

    /**
    * 额外参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get 配置名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModuleId 配置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 配置名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModuleId 配置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 配置方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeType 配置方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncludeType() {
        return this.IncludeType;
    }

    /**
     * Set 配置方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeType 配置方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeType(String IncludeType) {
        this.IncludeType = IncludeType;
    }

    /**
     * Get 额外参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 额外参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 额外参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 额外参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public ProjectConfigResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectConfigResult(ProjectConfigResult source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.IncludeType != null) {
            this.IncludeType = new String(source.IncludeType);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "IncludeType", this.IncludeType);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

