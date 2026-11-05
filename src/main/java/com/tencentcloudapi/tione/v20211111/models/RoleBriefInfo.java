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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleBriefInfo extends AbstractModel {

    /**
    * <p>角色id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * <p>角色名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get <p>角色id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleId <p>角色id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set <p>角色id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleId <p>角色id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get <p>角色名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleName <p>角色名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>角色名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleName <p>角色名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public RoleBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleBriefInfo(RoleBriefInfo source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

