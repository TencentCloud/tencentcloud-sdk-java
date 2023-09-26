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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectConfigList extends AbstractModel{

    /**
    * 模块组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModuleGroup")
    @Expose
    private String ModuleGroup;

    /**
    * 内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Components")
    @Expose
    private ProjectConfigResult [] Components;

    /**
     * Get 模块组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModuleGroup 模块组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModuleGroup() {
        return this.ModuleGroup;
    }

    /**
     * Set 模块组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModuleGroup 模块组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModuleGroup(String ModuleGroup) {
        this.ModuleGroup = ModuleGroup;
    }

    /**
     * Get 内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Components 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProjectConfigResult [] getComponents() {
        return this.Components;
    }

    /**
     * Set 内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Components 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponents(ProjectConfigResult [] Components) {
        this.Components = Components;
    }

    public ProjectConfigList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectConfigList(ProjectConfigList source) {
        if (source.ModuleGroup != null) {
            this.ModuleGroup = new String(source.ModuleGroup);
        }
        if (source.Components != null) {
            this.Components = new ProjectConfigResult[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new ProjectConfigResult(source.Components[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleGroup", this.ModuleGroup);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);

    }
}

