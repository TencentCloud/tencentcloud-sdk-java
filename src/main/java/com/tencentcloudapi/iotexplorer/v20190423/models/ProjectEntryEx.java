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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectEntryEx extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目描述
    */
    @SerializedName("ProjectDesc")
    @Expose
    private String ProjectDesc;

    /**
    * 项目创建时间，unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 项目更新时间，unix时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 产品数量
    */
    @SerializedName("ProductCount")
    @Expose
    private Long ProductCount;

    /**
    * NativeApp数量
    */
    @SerializedName("NativeAppCount")
    @Expose
    private Long NativeAppCount;

    /**
    * WebApp数量
    */
    @SerializedName("WebAppCount")
    @Expose
    private Long WebAppCount;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationCount")
    @Expose
    private Long ApplicationCount;

    /**
    * 设备注册总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceCount")
    @Expose
    private Long DeviceCount;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目描述 
     * @return ProjectDesc 项目描述
     */
    public String getProjectDesc() {
        return this.ProjectDesc;
    }

    /**
     * Set 项目描述
     * @param ProjectDesc 项目描述
     */
    public void setProjectDesc(String ProjectDesc) {
        this.ProjectDesc = ProjectDesc;
    }

    /**
     * Get 项目创建时间，unix时间戳 
     * @return CreateTime 项目创建时间，unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 项目创建时间，unix时间戳
     * @param CreateTime 项目创建时间，unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 项目更新时间，unix时间戳 
     * @return UpdateTime 项目更新时间，unix时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 项目更新时间，unix时间戳
     * @param UpdateTime 项目更新时间，unix时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 产品数量 
     * @return ProductCount 产品数量
     */
    public Long getProductCount() {
        return this.ProductCount;
    }

    /**
     * Set 产品数量
     * @param ProductCount 产品数量
     */
    public void setProductCount(Long ProductCount) {
        this.ProductCount = ProductCount;
    }

    /**
     * Get NativeApp数量 
     * @return NativeAppCount NativeApp数量
     */
    public Long getNativeAppCount() {
        return this.NativeAppCount;
    }

    /**
     * Set NativeApp数量
     * @param NativeAppCount NativeApp数量
     */
    public void setNativeAppCount(Long NativeAppCount) {
        this.NativeAppCount = NativeAppCount;
    }

    /**
     * Get WebApp数量 
     * @return WebAppCount WebApp数量
     */
    public Long getWebAppCount() {
        return this.WebAppCount;
    }

    /**
     * Set WebApp数量
     * @param WebAppCount WebApp数量
     */
    public void setWebAppCount(Long WebAppCount) {
        this.WebAppCount = WebAppCount;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationCount 应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApplicationCount() {
        return this.ApplicationCount;
    }

    /**
     * Set 应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationCount 应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationCount(Long ApplicationCount) {
        this.ApplicationCount = ApplicationCount;
    }

    /**
     * Get 设备注册总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceCount 设备注册总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceCount() {
        return this.DeviceCount;
    }

    /**
     * Set 设备注册总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceCount 设备注册总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceCount(Long DeviceCount) {
        this.DeviceCount = DeviceCount;
    }

    public ProjectEntryEx() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectEntryEx(ProjectEntryEx source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectDesc != null) {
            this.ProjectDesc = new String(source.ProjectDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.ProductCount != null) {
            this.ProductCount = new Long(source.ProductCount);
        }
        if (source.NativeAppCount != null) {
            this.NativeAppCount = new Long(source.NativeAppCount);
        }
        if (source.WebAppCount != null) {
            this.WebAppCount = new Long(source.WebAppCount);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ApplicationCount != null) {
            this.ApplicationCount = new Long(source.ApplicationCount);
        }
        if (source.DeviceCount != null) {
            this.DeviceCount = new Long(source.DeviceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDesc", this.ProjectDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ProductCount", this.ProductCount);
        this.setParamSimple(map, prefix + "NativeAppCount", this.NativeAppCount);
        this.setParamSimple(map, prefix + "WebAppCount", this.WebAppCount);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ApplicationCount", this.ApplicationCount);
        this.setParamSimple(map, prefix + "DeviceCount", this.DeviceCount);

    }
}

