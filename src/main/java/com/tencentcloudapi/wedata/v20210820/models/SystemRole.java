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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemRole extends AbstractModel {

    /**
    * 角色id
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 角色昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameCn")
    @Expose
    private String NameCn;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 角色权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privileges")
    @Expose
    private RolePrivilege [] Privileges;

    /**
    * 方法路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MethodPaths")
    @Expose
    private String [] MethodPaths;

    /**
    * 角色类型, 分为System,Tenant,Project,Commercial
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * 是否系统默认
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemInit")
    @Expose
    private Boolean SystemInit;

    /**
    * 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get 角色id 
     * @return RoleId 角色id
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色id
     * @param RoleId 角色id
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 角色名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 角色昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameCn 角色昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameCn() {
        return this.NameCn;
    }

    /**
     * Set 角色昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameCn 角色昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameCn(String NameCn) {
        this.NameCn = NameCn;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 角色权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Privileges 角色权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RolePrivilege [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 角色权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Privileges 角色权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivileges(RolePrivilege [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get 方法路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MethodPaths 方法路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMethodPaths() {
        return this.MethodPaths;
    }

    /**
     * Set 方法路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param MethodPaths 方法路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethodPaths(String [] MethodPaths) {
        this.MethodPaths = MethodPaths;
    }

    /**
     * Get 角色类型, 分为System,Tenant,Project,Commercial
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleType 角色类型, 分为System,Tenant,Project,Commercial
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set 角色类型, 分为System,Tenant,Project,Commercial
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleType 角色类型, 分为System,Tenant,Project,Commercial
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get 是否系统默认
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemInit 是否系统默认
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSystemInit() {
        return this.SystemInit;
    }

    /**
     * Set 是否系统默认
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemInit 是否系统默认
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemInit(Boolean SystemInit) {
        this.SystemInit = SystemInit;
    }

    /**
     * Get 自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public SystemRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemRole(SystemRole source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NameCn != null) {
            this.NameCn = new String(source.NameCn);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Privileges != null) {
            this.Privileges = new RolePrivilege[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new RolePrivilege(source.Privileges[i]);
            }
        }
        if (source.MethodPaths != null) {
            this.MethodPaths = new String[source.MethodPaths.length];
            for (int i = 0; i < source.MethodPaths.length; i++) {
                this.MethodPaths[i] = new String(source.MethodPaths[i]);
            }
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.SystemInit != null) {
            this.SystemInit = new Boolean(source.SystemInit);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NameCn", this.NameCn);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Privileges.", this.Privileges);
        this.setParamArraySimple(map, prefix + "MethodPaths.", this.MethodPaths);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "SystemInit", this.SystemInit);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

