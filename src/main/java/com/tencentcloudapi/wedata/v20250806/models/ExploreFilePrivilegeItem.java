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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExploreFilePrivilegeItem extends AbstractModel {

    /**
    * 权限点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
    * 用户：user 角色： role 组：group
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * 用户或角色ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 授权资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private ExploreFileResource Resource;

    /**
    * 是否可以被删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteAble")
    @Expose
    private Boolean DeleteAble;

    /**
     * Get 权限点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Privileges 权限点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 权限点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Privileges 权限点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get 用户：user 角色： role 组：group
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleType 用户：user 角色： role 组：group
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set 用户：user 角色： role 组：group
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleType 用户：user 角色： role 组：group
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get 用户或角色ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleId 用户或角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 用户或角色ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleId 用户或角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 授权资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 授权资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExploreFileResource getResource() {
        return this.Resource;
    }

    /**
     * Set 授权资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 授权资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(ExploreFileResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 是否可以被删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteAble 是否可以被删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteAble() {
        return this.DeleteAble;
    }

    /**
     * Set 是否可以被删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteAble 是否可以被删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteAble(Boolean DeleteAble) {
        this.DeleteAble = DeleteAble;
    }

    public ExploreFilePrivilegeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExploreFilePrivilegeItem(ExploreFilePrivilegeItem source) {
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.Resource != null) {
            this.Resource = new ExploreFileResource(source.Resource);
        }
        if (source.DeleteAble != null) {
            this.DeleteAble = new Boolean(source.DeleteAble);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "DeleteAble", this.DeleteAble);

    }
}

