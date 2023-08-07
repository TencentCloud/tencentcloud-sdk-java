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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosPermission extends AbstractModel{

    /**
    * cos路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * 权限【"read","write"】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
     * Get cos路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosPath cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set cos路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosPath cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    /**
     * Get 权限【"read","write"】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permissions 权限【"read","write"】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 权限【"read","write"】
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permissions 权限【"read","write"】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    public CosPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosPermission(CosPermission source) {
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);

    }
}

