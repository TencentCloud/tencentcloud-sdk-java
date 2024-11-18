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

public class RolePrivilege extends AbstractModel {

    /**
    * id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivilegeId")
    @Expose
    private String PrivilegeId;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivilegeName")
    @Expose
    private String PrivilegeName;

    /**
    * 路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestPath")
    @Expose
    private String RestPath;

    /**
    * 方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestMethod")
    @Expose
    private String RestMethod;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模块id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 权限类型 N、R、RW、RWD
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivilegeId id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivilegeId() {
        return this.PrivilegeId;
    }

    /**
     * Set id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivilegeId id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilegeId(String PrivilegeId) {
        this.PrivilegeId = PrivilegeId;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivilegeName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivilegeName() {
        return this.PrivilegeName;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivilegeName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilegeName(String PrivilegeName) {
        this.PrivilegeName = PrivilegeName;
    }

    /**
     * Get 路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestPath 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRestPath() {
        return this.RestPath;
    }

    /**
     * Set 路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestPath 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestPath(String RestPath) {
        this.RestPath = RestPath;
    }

    /**
     * Get 方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestMethod 方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRestMethod() {
        return this.RestMethod;
    }

    /**
     * Set 方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestMethod 方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestMethod(String RestMethod) {
        this.RestMethod = RestMethod;
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
     * Get 模块id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModuleId 模块id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModuleId 模块id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 权限类型 N、R、RW、RWD
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 权限类型 N、R、RW、RWD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 权限类型 N、R、RW、RWD
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 权限类型 N、R、RW、RWD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public RolePrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RolePrivilege(RolePrivilege source) {
        if (source.PrivilegeId != null) {
            this.PrivilegeId = new String(source.PrivilegeId);
        }
        if (source.PrivilegeName != null) {
            this.PrivilegeName = new String(source.PrivilegeName);
        }
        if (source.RestPath != null) {
            this.RestPath = new String(source.RestPath);
        }
        if (source.RestMethod != null) {
            this.RestMethod = new String(source.RestMethod);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivilegeId", this.PrivilegeId);
        this.setParamSimple(map, prefix + "PrivilegeName", this.PrivilegeName);
        this.setParamSimple(map, prefix + "RestPath", this.RestPath);
        this.setParamSimple(map, prefix + "RestMethod", this.RestMethod);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

