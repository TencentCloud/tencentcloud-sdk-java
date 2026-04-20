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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemRole extends AbstractModel {

    /**
    * <p>角色id</p>
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * <p>角色名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>角色昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameCn")
    @Expose
    private String NameCn;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>角色权限</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privileges")
    @Expose
    private RolePrivilege [] Privileges;

    /**
    * <p>方法路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MethodPaths")
    @Expose
    private String [] MethodPaths;

    /**
    * <p>角色类型, 分为System,Tenant,Project,Commercial</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * <p>是否系统默认</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemInit")
    @Expose
    private Boolean SystemInit;

    /**
    * <p>自定义参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTimeStr")
    @Expose
    private String CreateTimeStr;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
     * Get <p>角色id</p> 
     * @return RoleId <p>角色id</p>
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set <p>角色id</p>
     * @param RoleId <p>角色id</p>
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get <p>角色名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>角色名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>角色名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>角色名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>角色昵称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameCn <p>角色昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameCn() {
        return this.NameCn;
    }

    /**
     * Set <p>角色昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameCn <p>角色昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameCn(String NameCn) {
        this.NameCn = NameCn;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>角色权限</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Privileges <p>角色权限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RolePrivilege [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set <p>角色权限</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Privileges <p>角色权限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivileges(RolePrivilege [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get <p>方法路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MethodPaths <p>方法路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMethodPaths() {
        return this.MethodPaths;
    }

    /**
     * Set <p>方法路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MethodPaths <p>方法路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethodPaths(String [] MethodPaths) {
        this.MethodPaths = MethodPaths;
    }

    /**
     * Get <p>角色类型, 分为System,Tenant,Project,Commercial</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleType <p>角色类型, 分为System,Tenant,Project,Commercial</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set <p>角色类型, 分为System,Tenant,Project,Commercial</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleType <p>角色类型, 分为System,Tenant,Project,Commercial</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get <p>是否系统默认</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemInit <p>是否系统默认</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSystemInit() {
        return this.SystemInit;
    }

    /**
     * Set <p>是否系统默认</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemInit <p>是否系统默认</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemInit(Boolean SystemInit) {
        this.SystemInit = SystemInit;
    }

    /**
     * Get <p>自定义参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params <p>自定义参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set <p>自定义参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params <p>自定义参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTimeStr <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTimeStr() {
        return this.CreateTimeStr;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTimeStr <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTimeStr(String CreateTimeStr) {
        this.CreateTimeStr = CreateTimeStr;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
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
        if (source.CreateTimeStr != null) {
            this.CreateTimeStr = new String(source.CreateTimeStr);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
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
        this.setParamSimple(map, prefix + "CreateTimeStr", this.CreateTimeStr);
        this.setParamSimple(map, prefix + "Creator", this.Creator);

    }
}

