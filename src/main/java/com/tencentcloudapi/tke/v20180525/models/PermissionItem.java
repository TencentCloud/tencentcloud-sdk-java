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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PermissionItem extends AbstractModel {

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 角色名称。预置角色包括：tke:admin（集群管理员）、tke:ops（运维人员）、tke:dev（开发人员）、tke:ro（只读用户）、tke:ns:dev（命名空间开发人员）、tke:ns:ro（命名空间只读用户），其余为用户自定义角色
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 授权类型。枚举值：cluster（集群级别权限，对应 ClusterRoleBinding）、namespace（命名空间级别权限，对应 RoleBinding）
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * 是否为自定义角色，默认 false
    */
    @SerializedName("IsCustom")
    @Expose
    private Boolean IsCustom;

    /**
    * 命名空间。当 RoleType 为 namespace 时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 角色名称。预置角色包括：tke:admin（集群管理员）、tke:ops（运维人员）、tke:dev（开发人员）、tke:ro（只读用户）、tke:ns:dev（命名空间开发人员）、tke:ns:ro（命名空间只读用户），其余为用户自定义角色 
     * @return RoleName 角色名称。预置角色包括：tke:admin（集群管理员）、tke:ops（运维人员）、tke:dev（开发人员）、tke:ro（只读用户）、tke:ns:dev（命名空间开发人员）、tke:ns:ro（命名空间只读用户），其余为用户自定义角色
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称。预置角色包括：tke:admin（集群管理员）、tke:ops（运维人员）、tke:dev（开发人员）、tke:ro（只读用户）、tke:ns:dev（命名空间开发人员）、tke:ns:ro（命名空间只读用户），其余为用户自定义角色
     * @param RoleName 角色名称。预置角色包括：tke:admin（集群管理员）、tke:ops（运维人员）、tke:dev（开发人员）、tke:ro（只读用户）、tke:ns:dev（命名空间开发人员）、tke:ns:ro（命名空间只读用户），其余为用户自定义角色
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 授权类型。枚举值：cluster（集群级别权限，对应 ClusterRoleBinding）、namespace（命名空间级别权限，对应 RoleBinding） 
     * @return RoleType 授权类型。枚举值：cluster（集群级别权限，对应 ClusterRoleBinding）、namespace（命名空间级别权限，对应 RoleBinding）
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set 授权类型。枚举值：cluster（集群级别权限，对应 ClusterRoleBinding）、namespace（命名空间级别权限，对应 RoleBinding）
     * @param RoleType 授权类型。枚举值：cluster（集群级别权限，对应 ClusterRoleBinding）、namespace（命名空间级别权限，对应 RoleBinding）
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get 是否为自定义角色，默认 false 
     * @return IsCustom 是否为自定义角色，默认 false
     */
    public Boolean getIsCustom() {
        return this.IsCustom;
    }

    /**
     * Set 是否为自定义角色，默认 false
     * @param IsCustom 是否为自定义角色，默认 false
     */
    public void setIsCustom(Boolean IsCustom) {
        this.IsCustom = IsCustom;
    }

    /**
     * Get 命名空间。当 RoleType 为 namespace 时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间。当 RoleType 为 namespace 时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间。当 RoleType 为 namespace 时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间。当 RoleType 为 namespace 时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public PermissionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermissionItem(PermissionItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.IsCustom != null) {
            this.IsCustom = new Boolean(source.IsCustom);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "IsCustom", this.IsCustom);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

