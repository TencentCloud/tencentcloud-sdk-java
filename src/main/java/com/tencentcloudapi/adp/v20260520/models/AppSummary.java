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
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式
    */
    @SerializedName("AppMode")
    @Expose
    private Long AppMode;

    /**
    * 应用头像
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 操作信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperationInfo")
    @Expose
    private AppOperation OperationInfo;

    /**
    * 状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private AppStatusInfo Status;

    /**
    * 子状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubStatus")
    @Expose
    private AppSubStatusInfo SubStatus;

    /**
    * 资源操作权限
    */
    @SerializedName("PermissionIdList")
    @Expose
    private String [] PermissionIdList;

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式 
     * @return AppMode 应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式
     */
    public Long getAppMode() {
        return this.AppMode;
    }

    /**
     * Set 应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式
     * @param AppMode 应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式
     */
    public void setAppMode(Long AppMode) {
        this.AppMode = AppMode;
    }

    /**
     * Get 应用头像 
     * @return Avatar 应用头像
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 应用头像
     * @param Avatar 应用头像
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 应用名称 
     * @return Name 应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称
     * @param Name 应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 操作信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperationInfo 操作信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppOperation getOperationInfo() {
        return this.OperationInfo;
    }

    /**
     * Set 操作信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperationInfo 操作信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperationInfo(AppOperation OperationInfo) {
        this.OperationInfo = OperationInfo;
    }

    /**
     * Get 状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppStatusInfo getStatus() {
        return this.Status;
    }

    /**
     * Set 状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(AppStatusInfo Status) {
        this.Status = Status;
    }

    /**
     * Get 子状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubStatus 子状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppSubStatusInfo getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set 子状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubStatus 子状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubStatus(AppSubStatusInfo SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get 资源操作权限 
     * @return PermissionIdList 资源操作权限
     */
    public String [] getPermissionIdList() {
        return this.PermissionIdList;
    }

    /**
     * Set 资源操作权限
     * @param PermissionIdList 资源操作权限
     */
    public void setPermissionIdList(String [] PermissionIdList) {
        this.PermissionIdList = PermissionIdList;
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

    }
}

