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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceStatusInfo extends AbstractModel{

    /**
    * 命名空间id
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 命名空间名称
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * TCB envId | EKS clusterId
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 环境状态
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 环境启动状态（不在启动中为null）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentStartingStatus")
    @Expose
    private TemEnvironmentStartingStatus EnvironmentStartingStatus;

    /**
    * 环境停止状态（不在停止中为null）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentStoppingStatus")
    @Expose
    private TemEnvironmentStoppingStatus EnvironmentStoppingStatus;

    /**
     * Get 命名空间id 
     * @return EnvironmentId 命名空间id
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 命名空间id
     * @param EnvironmentId 命名空间id
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 命名空间名称 
     * @return EnvironmentName 命名空间名称
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 命名空间名称
     * @param EnvironmentName 命名空间名称
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get TCB envId | EKS clusterId 
     * @return ClusterId TCB envId | EKS clusterId
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set TCB envId | EKS clusterId
     * @param ClusterId TCB envId | EKS clusterId
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 环境状态 
     * @return ClusterStatus 环境状态
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 环境状态
     * @param ClusterStatus 环境状态
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 环境启动状态（不在启动中为null）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentStartingStatus 环境启动状态（不在启动中为null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TemEnvironmentStartingStatus getEnvironmentStartingStatus() {
        return this.EnvironmentStartingStatus;
    }

    /**
     * Set 环境启动状态（不在启动中为null）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentStartingStatus 环境启动状态（不在启动中为null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentStartingStatus(TemEnvironmentStartingStatus EnvironmentStartingStatus) {
        this.EnvironmentStartingStatus = EnvironmentStartingStatus;
    }

    /**
     * Get 环境停止状态（不在停止中为null）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentStoppingStatus 环境停止状态（不在停止中为null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TemEnvironmentStoppingStatus getEnvironmentStoppingStatus() {
        return this.EnvironmentStoppingStatus;
    }

    /**
     * Set 环境停止状态（不在停止中为null）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentStoppingStatus 环境停止状态（不在停止中为null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentStoppingStatus(TemEnvironmentStoppingStatus EnvironmentStoppingStatus) {
        this.EnvironmentStoppingStatus = EnvironmentStoppingStatus;
    }

    public NamespaceStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceStatusInfo(NamespaceStatusInfo source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.EnvironmentStartingStatus != null) {
            this.EnvironmentStartingStatus = new TemEnvironmentStartingStatus(source.EnvironmentStartingStatus);
        }
        if (source.EnvironmentStoppingStatus != null) {
            this.EnvironmentStoppingStatus = new TemEnvironmentStoppingStatus(source.EnvironmentStoppingStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamObj(map, prefix + "EnvironmentStartingStatus.", this.EnvironmentStartingStatus);
        this.setParamObj(map, prefix + "EnvironmentStoppingStatus.", this.EnvironmentStoppingStatus);

    }
}

