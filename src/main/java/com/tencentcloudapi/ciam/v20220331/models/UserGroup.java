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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserGroup extends AbstractModel{

    /**
    * 用户组ID
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * 用户组名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 用户组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户目录ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 租户ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 创建时间
    */
    @SerializedName("CreatedDate")
    @Expose
    private Long CreatedDate;

    /**
    * 最近更新时间
    */
    @SerializedName("LastModifyDate")
    @Expose
    private Long LastModifyDate;

    /**
     * Get 用户组ID 
     * @return UserGroupId 用户组ID
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set 用户组ID
     * @param UserGroupId 用户组ID
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get 用户组名称 
     * @return DisplayName 用户组名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 用户组名称
     * @param DisplayName 用户组名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 用户组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 用户组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 用户组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户目录ID 
     * @return UserStoreId 用户目录ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set 用户目录ID
     * @param UserStoreId 用户目录ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get 租户ID 
     * @return TenantId 租户ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户ID
     * @param TenantId 租户ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 创建时间 
     * @return CreatedDate 创建时间
     */
    public Long getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set 创建时间
     * @param CreatedDate 创建时间
     */
    public void setCreatedDate(Long CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get 最近更新时间 
     * @return LastModifyDate 最近更新时间
     */
    public Long getLastModifyDate() {
        return this.LastModifyDate;
    }

    /**
     * Set 最近更新时间
     * @param LastModifyDate 最近更新时间
     */
    public void setLastModifyDate(Long LastModifyDate) {
        this.LastModifyDate = LastModifyDate;
    }

    public UserGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroup(UserGroup source) {
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new Long(source.CreatedDate);
        }
        if (source.LastModifyDate != null) {
            this.LastModifyDate = new Long(source.LastModifyDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "LastModifyDate", this.LastModifyDate);

    }
}

