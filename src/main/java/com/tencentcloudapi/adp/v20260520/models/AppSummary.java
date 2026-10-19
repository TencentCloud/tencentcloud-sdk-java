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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppSummary extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式</p>
    */
    @SerializedName("AppMode")
    @Expose
    private Long AppMode;

    /**
    * <p>应用头像</p>
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * <p>应用名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>操作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperationInfo")
    @Expose
    private AppOperation OperationInfo;

    /**
    * <p>状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private AppStatusInfo Status;

    /**
    * <p>子状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubStatus")
    @Expose
    private AppSubStatusInfo SubStatus;

    /**
    * <p>资源操作权限</p>
    */
    @SerializedName("PermissionIdList")
    @Expose
    private String [] PermissionIdList;

    /**
    * <p>应用描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式</p> 
     * @return AppMode <p>应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式</p>
     */
    public Long getAppMode() {
        return this.AppMode;
    }

    /**
     * Set <p>应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式</p>
     * @param AppMode <p>应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式</p>
     */
    public void setAppMode(Long AppMode) {
        this.AppMode = AppMode;
    }

    /**
     * Get <p>应用头像</p> 
     * @return Avatar <p>应用头像</p>
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set <p>应用头像</p>
     * @param Avatar <p>应用头像</p>
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get <p>应用名称</p> 
     * @return Name <p>应用名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>应用名称</p>
     * @param Name <p>应用名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>操作信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperationInfo <p>操作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppOperation getOperationInfo() {
        return this.OperationInfo;
    }

    /**
     * Set <p>操作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperationInfo <p>操作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperationInfo(AppOperation OperationInfo) {
        this.OperationInfo = OperationInfo;
    }

    /**
     * Get <p>状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppStatusInfo getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(AppStatusInfo Status) {
        this.Status = Status;
    }

    /**
     * Get <p>子状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubStatus <p>子状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppSubStatusInfo getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set <p>子状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubStatus <p>子状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubStatus(AppSubStatusInfo SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get <p>资源操作权限</p> 
     * @return PermissionIdList <p>资源操作权限</p>
     */
    public String [] getPermissionIdList() {
        return this.PermissionIdList;
    }

    /**
     * Set <p>资源操作权限</p>
     * @param PermissionIdList <p>资源操作权限</p>
     */
    public void setPermissionIdList(String [] PermissionIdList) {
        this.PermissionIdList = PermissionIdList;
    }

    /**
     * Get <p>应用描述信息</p> 
     * @return Description <p>应用描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>应用描述信息</p>
     * @param Description <p>应用描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AppSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppSummary(AppSummary source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppMode != null) {
            this.AppMode = new Long(source.AppMode);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OperationInfo != null) {
            this.OperationInfo = new AppOperation(source.OperationInfo);
        }
        if (source.Status != null) {
            this.Status = new AppStatusInfo(source.Status);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new AppSubStatusInfo(source.SubStatus);
        }
        if (source.PermissionIdList != null) {
            this.PermissionIdList = new String[source.PermissionIdList.length];
            for (int i = 0; i < source.PermissionIdList.length; i++) {
                this.PermissionIdList[i] = new String(source.PermissionIdList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "OperationInfo.", this.OperationInfo);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamObj(map, prefix + "SubStatus.", this.SubStatus);
        this.setParamArraySimple(map, prefix + "PermissionIdList.", this.PermissionIdList);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

