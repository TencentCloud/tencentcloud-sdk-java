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
    * <p>配置中心类型[注册中心Registration、配置中心Configuration]</p>
    */
    @SerializedName("CenterType")
    @Expose
    private String CenterType;

    /**
    * <p>实例id，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例类型，例如北极星Polaris</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例地域id，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>实例命名空间ID，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
    */
    @SerializedName("InstanceNamespaceId")
    @Expose
    private String InstanceNamespaceId;

    /**
    * <p>部署组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>文档ID</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
     * Get <p>配置中心类型[注册中心Registration、配置中心Configuration]</p> 
     * @return CenterType <p>配置中心类型[注册中心Registration、配置中心Configuration]</p>
     */
    public String getCenterType() {
        return this.CenterType;
    }

    /**
     * Set <p>配置中心类型[注册中心Registration、配置中心Configuration]</p>
     * @param CenterType <p>配置中心类型[注册中心Registration、配置中心Configuration]</p>
     */
    public void setCenterType(String CenterType) {
        this.CenterType = CenterType;
    }

    /**
     * Get <p>实例id，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p> 
     * @return InstanceId <p>实例id，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
     * @param InstanceId <p>实例id，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例类型，例如北极星Polaris</p> 
     * @return InstanceType <p>实例类型，例如北极星Polaris</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型，例如北极星Polaris</p>
     * @param InstanceType <p>实例类型，例如北极星Polaris</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例地域id，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p> 
     * @return RegionId <p>实例地域id，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>实例地域id，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
     * @param RegionId <p>实例地域id，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>实例命名空间ID，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p> 
     * @return InstanceNamespaceId <p>实例命名空间ID，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
     */
    public String getInstanceNamespaceId() {
        return this.InstanceNamespaceId;
    }

    /**
     * Set <p>实例命名空间ID，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
     * @param InstanceNamespaceId <p>实例命名空间ID，通过<a href="https://console.cloud.tencent.com/tse/governance">北极星控制台</a>获取</p>
     */
    public void setInstanceNamespaceId(String InstanceNamespaceId) {
        this.InstanceNamespaceId = InstanceNamespaceId;
    }

    /**
     * Get <p>部署组Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId <p>部署组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>部署组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId <p>部署组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>文档ID</p> 
     * @return ApplicationId <p>文档ID</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>文档ID</p>
     * @param ApplicationId <p>文档ID</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
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
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);

    }
}

