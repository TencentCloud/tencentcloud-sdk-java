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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExclusiveInstance extends AbstractModel {

    /**
    * 配置中心类型[注册中心Registration、配置中心Configuration]
    */
    @SerializedName("CenterType")
    @Expose
    private String CenterType;

    /**
    * 实例id，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例类型，例如北极星Polaris
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例地域id，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 实例命名空间ID，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
    */
    @SerializedName("InstanceNamespaceId")
    @Expose
    private String InstanceNamespaceId;

    /**
    * 部署组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 配置中心类型[注册中心Registration、配置中心Configuration] 
     * @return CenterType 配置中心类型[注册中心Registration、配置中心Configuration]
     */
    public String getCenterType() {
        return this.CenterType;
    }

    /**
     * Set 配置中心类型[注册中心Registration、配置中心Configuration]
     * @param CenterType 配置中心类型[注册中心Registration、配置中心Configuration]
     */
    public void setCenterType(String CenterType) {
        this.CenterType = CenterType;
    }

    /**
     * Get 实例id，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取 
     * @return InstanceId 实例id，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
     * @param InstanceId 实例id，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例类型，例如北极星Polaris 
     * @return InstanceType 实例类型，例如北极星Polaris
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，例如北极星Polaris
     * @param InstanceType 实例类型，例如北极星Polaris
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例地域id，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取 
     * @return RegionId 实例地域id，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 实例地域id，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
     * @param RegionId 实例地域id，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 实例命名空间ID，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取 
     * @return InstanceNamespaceId 实例命名空间ID，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
     */
    public String getInstanceNamespaceId() {
        return this.InstanceNamespaceId;
    }

    /**
     * Set 实例命名空间ID，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
     * @param InstanceNamespaceId 实例命名空间ID，通过[北极星控制台](https://console.cloud.tencent.com/tse/governance)获取
     */
    public void setInstanceNamespaceId(String InstanceNamespaceId) {
        this.InstanceNamespaceId = InstanceNamespaceId;
    }

    /**
     * Get 部署组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 部署组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 部署组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ExclusiveInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExclusiveInstance(ExclusiveInstance source) {
        if (source.CenterType != null) {
            this.CenterType = new String(source.CenterType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.InstanceNamespaceId != null) {
            this.InstanceNamespaceId = new String(source.InstanceNamespaceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CenterType", this.CenterType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceNamespaceId", this.InstanceNamespaceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

