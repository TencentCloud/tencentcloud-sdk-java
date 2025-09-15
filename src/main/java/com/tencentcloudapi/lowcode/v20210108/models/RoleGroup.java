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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleGroup extends AbstractModel {

    /**
    * 权限组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 权限组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 权限组标识
    */
    @SerializedName("GroupIdentity")
    @Expose
    private String GroupIdentity;

    /**
    * 权限组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupDesc")
    @Expose
    private String GroupDesc;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 角色数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleList")
    @Expose
    private WedaRole [] RoleList;

    /**
     * Get 权限组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 权限组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 权限组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 权限组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 权限组名称 
     * @return Name 权限组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 权限组名称
     * @param Name 权限组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 权限组标识 
     * @return GroupIdentity 权限组标识
     */
    public String getGroupIdentity() {
        return this.GroupIdentity;
    }

    /**
     * Set 权限组标识
     * @param GroupIdentity 权限组标识
     */
    public void setGroupIdentity(String GroupIdentity) {
        this.GroupIdentity = GroupIdentity;
    }

    /**
     * Get 权限组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupDesc 权限组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupDesc() {
        return this.GroupDesc;
    }

    /**
     * Set 权限组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupDesc 权限组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupDesc(String GroupDesc) {
        this.GroupDesc = GroupDesc;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 角色数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleList 角色数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WedaRole [] getRoleList() {
        return this.RoleList;
    }

    /**
     * Set 角色数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleList 角色数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleList(WedaRole [] RoleList) {
        this.RoleList = RoleList;
    }

    public RoleGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleGroup(RoleGroup source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.GroupIdentity != null) {
            this.GroupIdentity = new String(source.GroupIdentity);
        }
        if (source.GroupDesc != null) {
            this.GroupDesc = new String(source.GroupDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RoleList != null) {
            this.RoleList = new WedaRole[source.RoleList.length];
            for (int i = 0; i < source.RoleList.length; i++) {
                this.RoleList[i] = new WedaRole(source.RoleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "GroupIdentity", this.GroupIdentity);
        this.setParamSimple(map, prefix + "GroupDesc", this.GroupDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "RoleList.", this.RoleList);

    }
}

