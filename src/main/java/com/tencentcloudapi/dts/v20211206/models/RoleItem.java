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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleItem extends AbstractModel{

    /**
    * 角色名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 迁移后的角色名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewRoleName")
    @Expose
    private String NewRoleName;

    /**
     * Get 角色名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleName 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleName 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 迁移后的角色名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewRoleName 迁移后的角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewRoleName() {
        return this.NewRoleName;
    }

    /**
     * Set 迁移后的角色名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewRoleName 迁移后的角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewRoleName(String NewRoleName) {
        this.NewRoleName = NewRoleName;
    }

    public RoleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleItem(RoleItem source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.NewRoleName != null) {
            this.NewRoleName = new String(source.NewRoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "NewRoleName", this.NewRoleName);

    }
}

