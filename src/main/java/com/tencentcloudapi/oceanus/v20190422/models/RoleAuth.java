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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleAuth extends AbstractModel{

    /**
    * 用户 AppID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceSerialId")
    @Expose
    private String WorkSpaceSerialId;

    /**
    * 主账号 UIN
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 创建者 UIN
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 绑定授权的 UIN
    */
    @SerializedName("AuthSubAccountUin")
    @Expose
    private String AuthSubAccountUin;

    /**
    * 对应 role表的id
    */
    @SerializedName("Permission")
    @Expose
    private Long Permission;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后一次操作时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 2 启用 1 停用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 工作空间id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private Long WorkSpaceId;

    /**
    * 权限名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get 用户 AppID 
     * @return AppId 用户 AppID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户 AppID
     * @param AppId 用户 AppID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceSerialId 工作空间 SerialId
     */
    public String getWorkSpaceSerialId() {
        return this.WorkSpaceSerialId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceSerialId 工作空间 SerialId
     */
    public void setWorkSpaceSerialId(String WorkSpaceSerialId) {
        this.WorkSpaceSerialId = WorkSpaceSerialId;
    }

    /**
     * Get 主账号 UIN 
     * @return OwnerUin 主账号 UIN
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号 UIN
     * @param OwnerUin 主账号 UIN
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 创建者 UIN 
     * @return CreatorUin 创建者 UIN
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者 UIN
     * @param CreatorUin 创建者 UIN
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 绑定授权的 UIN 
     * @return AuthSubAccountUin 绑定授权的 UIN
     */
    public String getAuthSubAccountUin() {
        return this.AuthSubAccountUin;
    }

    /**
     * Set 绑定授权的 UIN
     * @param AuthSubAccountUin 绑定授权的 UIN
     */
    public void setAuthSubAccountUin(String AuthSubAccountUin) {
        this.AuthSubAccountUin = AuthSubAccountUin;
    }

    /**
     * Get 对应 role表的id 
     * @return Permission 对应 role表的id
     */
    public Long getPermission() {
        return this.Permission;
    }

    /**
     * Set 对应 role表的id
     * @param Permission 对应 role表的id
     */
    public void setPermission(Long Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后一次操作时间 
     * @return UpdateTime 最后一次操作时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后一次操作时间
     * @param UpdateTime 最后一次操作时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 2 启用 1 停用 
     * @return Status 2 启用 1 停用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 2 启用 1 停用
     * @param Status 2 启用 1 停用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 工作空间id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceId 工作空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceId 工作空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceId(Long WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get 权限名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleName 权限名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 权限名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleName 权限名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public RoleAuth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleAuth(RoleAuth source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.WorkSpaceSerialId != null) {
            this.WorkSpaceSerialId = new String(source.WorkSpaceSerialId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.AuthSubAccountUin != null) {
            this.AuthSubAccountUin = new String(source.AuthSubAccountUin);
        }
        if (source.Permission != null) {
            this.Permission = new Long(source.Permission);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new Long(source.WorkSpaceId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkSpaceSerialId", this.WorkSpaceSerialId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "AuthSubAccountUin", this.AuthSubAccountUin);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

