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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsoleRoleInfo extends AbstractModel {

    /**
    * 角色基本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicInfo")
    @Expose
    private RoleBasicInfo BasicInfo;

    /**
    * 角色元信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaData")
    @Expose
    private RoleMetaData MetaData;

    /**
    * 角色权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permissions")
    @Expose
    private RolePermission [] Permissions;

    /**
     * Get 角色基本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasicInfo 角色基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoleBasicInfo getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set 角色基本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicInfo 角色基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicInfo(RoleBasicInfo BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get 角色元信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaData 角色元信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoleMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 角色元信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaData 角色元信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaData(RoleMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get 角色权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permissions 角色权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RolePermission [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 角色权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permissions 角色权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissions(RolePermission [] Permissions) {
        this.Permissions = Permissions;
    }

    public ConsoleRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsoleRoleInfo(ConsoleRoleInfo source) {
        if (source.BasicInfo != null) {
            this.BasicInfo = new RoleBasicInfo(source.BasicInfo);
        }
        if (source.MetaData != null) {
            this.MetaData = new RoleMetaData(source.MetaData);
        }
        if (source.Permissions != null) {
            this.Permissions = new RolePermission[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new RolePermission(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BasicInfo.", this.BasicInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "Permissions.", this.Permissions);

    }
}

