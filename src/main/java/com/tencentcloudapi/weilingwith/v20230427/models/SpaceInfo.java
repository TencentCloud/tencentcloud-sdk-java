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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpaceInfo extends AbstractModel {

    /**
    * 项目空间id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private Long TenantId;

    /**
    * 英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnglishName")
    @Expose
    private String EnglishName;

    /**
    * 中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChineseName")
    @Expose
    private String ChineseName;

    /**
    * 项目空间描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 项目空间状态:0 启用 1 停用 -1 已删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否是公共空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCommWorkspace")
    @Expose
    private Boolean IsCommWorkspace;

    /**
    * 有效期开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidityStartTime")
    @Expose
    private String ValidityStartTime;

    /**
    * 有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidityEndTime")
    @Expose
    private String ValidityEndTime;

    /**
    * 选中状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Selected")
    @Expose
    private Long Selected;

    /**
    * 系统生成状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSystem")
    @Expose
    private Long IsSystem;

    /**
     * Get 项目空间id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceId 项目空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 项目空间id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceId 项目空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(Long TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnglishName 英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnglishName() {
        return this.EnglishName;
    }

    /**
     * Set 英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnglishName 英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnglishName(String EnglishName) {
        this.EnglishName = EnglishName;
    }

    /**
     * Get 中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChineseName 中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChineseName() {
        return this.ChineseName;
    }

    /**
     * Set 中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChineseName 中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChineseName(String ChineseName) {
        this.ChineseName = ChineseName;
    }

    /**
     * Get 项目空间描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 项目空间描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 项目空间描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 项目空间描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 项目空间状态:0 启用 1 停用 -1 已删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 项目空间状态:0 启用 1 停用 -1 已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 项目空间状态:0 启用 1 停用 -1 已删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 项目空间状态:0 启用 1 停用 -1 已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否是公共空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCommWorkspace 是否是公共空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCommWorkspace() {
        return this.IsCommWorkspace;
    }

    /**
     * Set 是否是公共空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCommWorkspace 是否是公共空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCommWorkspace(Boolean IsCommWorkspace) {
        this.IsCommWorkspace = IsCommWorkspace;
    }

    /**
     * Get 有效期开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidityStartTime 有效期开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidityStartTime() {
        return this.ValidityStartTime;
    }

    /**
     * Set 有效期开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidityStartTime 有效期开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidityStartTime(String ValidityStartTime) {
        this.ValidityStartTime = ValidityStartTime;
    }

    /**
     * Get 有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidityEndTime 有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidityEndTime() {
        return this.ValidityEndTime;
    }

    /**
     * Set 有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidityEndTime 有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidityEndTime(String ValidityEndTime) {
        this.ValidityEndTime = ValidityEndTime;
    }

    /**
     * Get 选中状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Selected 选中状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSelected() {
        return this.Selected;
    }

    /**
     * Set 选中状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Selected 选中状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelected(Long Selected) {
        this.Selected = Selected;
    }

    /**
     * Get 系统生成状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSystem 系统生成状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSystem() {
        return this.IsSystem;
    }

    /**
     * Set 系统生成状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSystem 系统生成状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSystem(Long IsSystem) {
        this.IsSystem = IsSystem;
    }

    public SpaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpaceInfo(SpaceInfo source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.TenantId != null) {
            this.TenantId = new Long(source.TenantId);
        }
        if (source.EnglishName != null) {
            this.EnglishName = new String(source.EnglishName);
        }
        if (source.ChineseName != null) {
            this.ChineseName = new String(source.ChineseName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsCommWorkspace != null) {
            this.IsCommWorkspace = new Boolean(source.IsCommWorkspace);
        }
        if (source.ValidityStartTime != null) {
            this.ValidityStartTime = new String(source.ValidityStartTime);
        }
        if (source.ValidityEndTime != null) {
            this.ValidityEndTime = new String(source.ValidityEndTime);
        }
        if (source.Selected != null) {
            this.Selected = new Long(source.Selected);
        }
        if (source.IsSystem != null) {
            this.IsSystem = new Long(source.IsSystem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "EnglishName", this.EnglishName);
        this.setParamSimple(map, prefix + "ChineseName", this.ChineseName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsCommWorkspace", this.IsCommWorkspace);
        this.setParamSimple(map, prefix + "ValidityStartTime", this.ValidityStartTime);
        this.setParamSimple(map, prefix + "ValidityEndTime", this.ValidityEndTime);
        this.setParamSimple(map, prefix + "Selected", this.Selected);
        this.setParamSimple(map, prefix + "IsSystem", this.IsSystem);

    }
}

