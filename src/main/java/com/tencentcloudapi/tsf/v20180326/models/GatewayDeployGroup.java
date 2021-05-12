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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayDeployGroup extends AbstractModel{

    /**
    * 网关部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * 网关部署组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployGroupName")
    @Expose
    private String DeployGroupName;

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 应用分类：V：虚拟机应用，C：容器应用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 部署组应用状态,取值: Running、Waiting、Paused、Updating、RollingBack、Abnormal、Unknown
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupStatus")
    @Expose
    private String GroupStatus;

    /**
    * 集群类型，C ：容器，V：虚拟机
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get 网关部署组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployGroupId 网关部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set 网关部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployGroupId 网关部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get 网关部署组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployGroupName 网关部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployGroupName() {
        return this.DeployGroupName;
    }

    /**
     * Set 网关部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployGroupName 网关部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployGroupName(String DeployGroupName) {
        this.DeployGroupName = DeployGroupName;
    }

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 应用分类：V：虚拟机应用，C：容器应用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationType 应用分类：V：虚拟机应用，C：容器应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用分类：V：虚拟机应用，C：容器应用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationType 应用分类：V：虚拟机应用，C：容器应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 部署组应用状态,取值: Running、Waiting、Paused、Updating、RollingBack、Abnormal、Unknown
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupStatus 部署组应用状态,取值: Running、Waiting、Paused、Updating、RollingBack、Abnormal、Unknown
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupStatus() {
        return this.GroupStatus;
    }

    /**
     * Set 部署组应用状态,取值: Running、Waiting、Paused、Updating、RollingBack、Abnormal、Unknown
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupStatus 部署组应用状态,取值: Running、Waiting、Paused、Updating、RollingBack、Abnormal、Unknown
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupStatus(String GroupStatus) {
        this.GroupStatus = GroupStatus;
    }

    /**
     * Get 集群类型，C ：容器，V：虚拟机
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType 集群类型，C ：容器，V：虚拟机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，C ：容器，V：虚拟机
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType 集群类型，C ：容器，V：虚拟机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public GatewayDeployGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayDeployGroup(GatewayDeployGroup source) {
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.DeployGroupName != null) {
            this.DeployGroupName = new String(source.DeployGroupName);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.GroupStatus != null) {
            this.GroupStatus = new String(source.GroupStatus);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "DeployGroupName", this.DeployGroupName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "GroupStatus", this.GroupStatus);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

