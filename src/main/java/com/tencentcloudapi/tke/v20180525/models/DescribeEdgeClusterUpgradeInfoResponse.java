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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeClusterUpgradeInfoResponse extends AbstractModel{

    /**
    * 可升级的集群组件和
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentVersion")
    @Expose
    private String ComponentVersion;

    /**
    * 边缘集群当前版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EdgeVersionCurrent")
    @Expose
    private String EdgeVersionCurrent;

    /**
    * 边缘组件镜像仓库地址前缀，包含域名和命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryPrefix")
    @Expose
    private String RegistryPrefix;

    /**
    * 集群升级状态，可能值：running、updating、failed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterUpgradeStatus")
    @Expose
    private String ClusterUpgradeStatus;

    /**
    * 集群升级中状态或者失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterUpgradeStatusReason")
    @Expose
    private String ClusterUpgradeStatusReason;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 可升级的集群组件和
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentVersion 可升级的集群组件和
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentVersion() {
        return this.ComponentVersion;
    }

    /**
     * Set 可升级的集群组件和
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentVersion 可升级的集群组件和
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentVersion(String ComponentVersion) {
        this.ComponentVersion = ComponentVersion;
    }

    /**
     * Get 边缘集群当前版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EdgeVersionCurrent 边缘集群当前版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEdgeVersionCurrent() {
        return this.EdgeVersionCurrent;
    }

    /**
     * Set 边缘集群当前版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param EdgeVersionCurrent 边缘集群当前版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdgeVersionCurrent(String EdgeVersionCurrent) {
        this.EdgeVersionCurrent = EdgeVersionCurrent;
    }

    /**
     * Get 边缘组件镜像仓库地址前缀，包含域名和命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryPrefix 边缘组件镜像仓库地址前缀，包含域名和命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryPrefix() {
        return this.RegistryPrefix;
    }

    /**
     * Set 边缘组件镜像仓库地址前缀，包含域名和命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryPrefix 边缘组件镜像仓库地址前缀，包含域名和命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryPrefix(String RegistryPrefix) {
        this.RegistryPrefix = RegistryPrefix;
    }

    /**
     * Get 集群升级状态，可能值：running、updating、failed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterUpgradeStatus 集群升级状态，可能值：running、updating、failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterUpgradeStatus() {
        return this.ClusterUpgradeStatus;
    }

    /**
     * Set 集群升级状态，可能值：running、updating、failed
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterUpgradeStatus 集群升级状态，可能值：running、updating、failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterUpgradeStatus(String ClusterUpgradeStatus) {
        this.ClusterUpgradeStatus = ClusterUpgradeStatus;
    }

    /**
     * Get 集群升级中状态或者失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterUpgradeStatusReason 集群升级中状态或者失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterUpgradeStatusReason() {
        return this.ClusterUpgradeStatusReason;
    }

    /**
     * Set 集群升级中状态或者失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterUpgradeStatusReason 集群升级中状态或者失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterUpgradeStatusReason(String ClusterUpgradeStatusReason) {
        this.ClusterUpgradeStatusReason = ClusterUpgradeStatusReason;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEdgeClusterUpgradeInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeClusterUpgradeInfoResponse(DescribeEdgeClusterUpgradeInfoResponse source) {
        if (source.ComponentVersion != null) {
            this.ComponentVersion = new String(source.ComponentVersion);
        }
        if (source.EdgeVersionCurrent != null) {
            this.EdgeVersionCurrent = new String(source.EdgeVersionCurrent);
        }
        if (source.RegistryPrefix != null) {
            this.RegistryPrefix = new String(source.RegistryPrefix);
        }
        if (source.ClusterUpgradeStatus != null) {
            this.ClusterUpgradeStatus = new String(source.ClusterUpgradeStatus);
        }
        if (source.ClusterUpgradeStatusReason != null) {
            this.ClusterUpgradeStatusReason = new String(source.ClusterUpgradeStatusReason);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentVersion", this.ComponentVersion);
        this.setParamSimple(map, prefix + "EdgeVersionCurrent", this.EdgeVersionCurrent);
        this.setParamSimple(map, prefix + "RegistryPrefix", this.RegistryPrefix);
        this.setParamSimple(map, prefix + "ClusterUpgradeStatus", this.ClusterUpgradeStatus);
        this.setParamSimple(map, prefix + "ClusterUpgradeStatusReason", this.ClusterUpgradeStatusReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

