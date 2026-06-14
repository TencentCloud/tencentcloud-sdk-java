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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectConfigResult extends AbstractModel {

    /**
    * <p>配置名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * <p>配置方式</p><p>枚举值：</p><ul><li>usable： 可用</li><li>visible： 可见</li><li>disabled： 不可用</li><li>hidden： 隐藏</li></ul><p>默认值：disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeType")
    @Expose
    private String IncludeType;

    /**
    * <p>额外参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get <p>配置名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModuleId <p>配置名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set <p>配置名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModuleId <p>配置名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get <p>配置方式</p><p>枚举值：</p><ul><li>usable： 可用</li><li>visible： 可见</li><li>disabled： 不可用</li><li>hidden： 隐藏</li></ul><p>默认值：disabled</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeType <p>配置方式</p><p>枚举值：</p><ul><li>usable： 可用</li><li>visible： 可见</li><li>disabled： 不可用</li><li>hidden： 隐藏</li></ul><p>默认值：disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncludeType() {
        return this.IncludeType;
    }

    /**
     * Set <p>配置方式</p><p>枚举值：</p><ul><li>usable： 可用</li><li>visible： 可见</li><li>disabled： 不可用</li><li>hidden： 隐藏</li></ul><p>默认值：disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeType <p>配置方式</p><p>枚举值：</p><ul><li>usable： 可用</li><li>visible： 可见</li><li>disabled： 不可用</li><li>hidden： 隐藏</li></ul><p>默认值：disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeType(String IncludeType) {
        this.IncludeType = IncludeType;
    }

    /**
     * Get <p>额外参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params <p>额外参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set <p>额外参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params <p>额外参数</p>
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

