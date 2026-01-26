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

public class PrivilegeInfo extends AbstractModel {

    /**
    * 权限名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 权限展示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 权限描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否为读取权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRead")
    @Expose
    private Boolean IsRead;

    /**
    * 是否为管理权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsManage")
    @Expose
    private Boolean IsManage;

    /**
    * 是否拥有此权限，检查权限时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Granted")
    @Expose
    private Boolean Granted;

    /**
    * 继承自哪个资源，查询权限详情时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InheritedObject")
    @Expose
    private PrivilegeResource InheritedObject;

    /**
    * 否继承获得，查询权限详情时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Inherited")
    @Expose
    private Boolean Inherited;

    /**
    * 是否为编辑权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEdit")
    @Expose
    private Boolean IsEdit;

    /**
    * 是否元数据权限（前端展示）
    */
    @SerializedName("IsMetaDataPermission")
    @Expose
    private Boolean IsMetaDataPermission;

    /**
    * CatalogID(废弃)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogID")
    @Expose
    private String CatalogID;

    /**
    * catalog名称(废弃)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * 空间ID(废弃)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceID")
    @Expose
    private String WorkSpaceID;

    /**
    * 空间名称(废弃)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceName")
    @Expose
    private String WorkSpaceName;

    /**
     * Get 权限名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 权限名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 权限名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 权限名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 权限展示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 权限展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 权限展示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 权限展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 权限描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 权限描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 权限描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 权限描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否为读取权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRead 是否为读取权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsRead() {
        return this.IsRead;
    }

    /**
     * Set 是否为读取权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRead 是否为读取权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRead(Boolean IsRead) {
        this.IsRead = IsRead;
    }

    /**
     * Get 是否为管理权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsManage 是否为管理权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsManage() {
        return this.IsManage;
    }

    /**
     * Set 是否为管理权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsManage 是否为管理权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsManage(Boolean IsManage) {
        this.IsManage = IsManage;
    }

    /**
     * Get 是否拥有此权限，检查权限时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Granted 是否拥有此权限，检查权限时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getGranted() {
        return this.Granted;
    }

    /**
     * Set 是否拥有此权限，检查权限时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Granted 是否拥有此权限，检查权限时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGranted(Boolean Granted) {
        this.Granted = Granted;
    }

    /**
     * Get 继承自哪个资源，查询权限详情时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InheritedObject 继承自哪个资源，查询权限详情时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrivilegeResource getInheritedObject() {
        return this.InheritedObject;
    }

    /**
     * Set 继承自哪个资源，查询权限详情时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param InheritedObject 继承自哪个资源，查询权限详情时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInheritedObject(PrivilegeResource InheritedObject) {
        this.InheritedObject = InheritedObject;
    }

    /**
     * Get 否继承获得，查询权限详情时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Inherited 否继承获得，查询权限详情时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInherited() {
        return this.Inherited;
    }

    /**
     * Set 否继承获得，查询权限详情时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Inherited 否继承获得，查询权限详情时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInherited(Boolean Inherited) {
        this.Inherited = Inherited;
    }

    /**
     * Get 是否为编辑权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEdit 是否为编辑权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsEdit() {
        return this.IsEdit;
    }

    /**
     * Set 是否为编辑权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEdit 是否为编辑权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEdit(Boolean IsEdit) {
        this.IsEdit = IsEdit;
    }

    /**
     * Get 是否元数据权限（前端展示） 
     * @return IsMetaDataPermission 是否元数据权限（前端展示）
     */
    public Boolean getIsMetaDataPermission() {
        return this.IsMetaDataPermission;
    }

    /**
     * Set 是否元数据权限（前端展示）
     * @param IsMetaDataPermission 是否元数据权限（前端展示）
     */
    public void setIsMetaDataPermission(Boolean IsMetaDataPermission) {
        this.IsMetaDataPermission = IsMetaDataPermission;
    }

    /**
     * Get CatalogID(废弃)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogID CatalogID(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogID() {
        return this.CatalogID;
    }

    /**
     * Set CatalogID(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogID CatalogID(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogID(String CatalogID) {
        this.CatalogID = CatalogID;
    }

    /**
     * Get catalog名称(废弃)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogName catalog名称(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set catalog名称(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogName catalog名称(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get 空间ID(废弃)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceID 空间ID(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkSpaceID() {
        return this.WorkSpaceID;
    }

    /**
     * Set 空间ID(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceID 空间ID(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceID(String WorkSpaceID) {
        this.WorkSpaceID = WorkSpaceID;
    }

    /**
     * Get 空间名称(废弃)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceName 空间名称(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkSpaceName() {
        return this.WorkSpaceName;
    }

    /**
     * Set 空间名称(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceName 空间名称(废弃)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceName(String WorkSpaceName) {
        this.WorkSpaceName = WorkSpaceName;
    }

    public PrivilegeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivilegeInfo(PrivilegeInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsRead != null) {
            this.IsRead = new Boolean(source.IsRead);
        }
        if (source.IsManage != null) {
            this.IsManage = new Boolean(source.IsManage);
        }
        if (source.Granted != null) {
            this.Granted = new Boolean(source.Granted);
        }
        if (source.InheritedObject != null) {
            this.InheritedObject = new PrivilegeResource(source.InheritedObject);
        }
        if (source.Inherited != null) {
            this.Inherited = new Boolean(source.Inherited);
        }
        if (source.IsEdit != null) {
            this.IsEdit = new Boolean(source.IsEdit);
        }
        if (source.IsMetaDataPermission != null) {
            this.IsMetaDataPermission = new Boolean(source.IsMetaDataPermission);
        }
        if (source.CatalogID != null) {
            this.CatalogID = new String(source.CatalogID);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.WorkSpaceID != null) {
            this.WorkSpaceID = new String(source.WorkSpaceID);
        }
        if (source.WorkSpaceName != null) {
            this.WorkSpaceName = new String(source.WorkSpaceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsRead", this.IsRead);
        this.setParamSimple(map, prefix + "IsManage", this.IsManage);
        this.setParamSimple(map, prefix + "Granted", this.Granted);
        this.setParamObj(map, prefix + "InheritedObject.", this.InheritedObject);
        this.setParamSimple(map, prefix + "Inherited", this.Inherited);
        this.setParamSimple(map, prefix + "IsEdit", this.IsEdit);
        this.setParamSimple(map, prefix + "IsMetaDataPermission", this.IsMetaDataPermission);
        this.setParamSimple(map, prefix + "CatalogID", this.CatalogID);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "WorkSpaceID", this.WorkSpaceID);
        this.setParamSimple(map, prefix + "WorkSpaceName", this.WorkSpaceName);

    }
}

