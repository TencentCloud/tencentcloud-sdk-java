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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusTemplateSyncTarget extends AbstractModel {

    /**
    * <p>目标所在地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>目标实例</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>集群id，只有当采集模板的Level为cluster的时候需要</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>最后一次同步时间， 用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyncTime")
    @Expose
    private String SyncTime;

    /**
    * <p>当前使用的模板版本，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>集群类型，只有当采集模板的Level为cluster的时候需要</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>用于出参，实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>用于出参，集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>目标所在地域</p> 
     * @return Region <p>目标所在地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>目标所在地域</p>
     * @param Region <p>目标所在地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>目标实例</p> 
     * @return InstanceId <p>目标实例</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>目标实例</p>
     * @param InstanceId <p>目标实例</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>集群id，只有当采集模板的Level为cluster的时候需要</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>集群id，只有当采集模板的Level为cluster的时候需要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id，只有当采集模板的Level为cluster的时候需要</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>集群id，只有当采集模板的Level为cluster的时候需要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>最后一次同步时间， 用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyncTime <p>最后一次同步时间， 用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSyncTime() {
        return this.SyncTime;
    }

    /**
     * Set <p>最后一次同步时间， 用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyncTime <p>最后一次同步时间， 用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyncTime(String SyncTime) {
        this.SyncTime = SyncTime;
    }

    /**
     * Get <p>当前使用的模板版本，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>当前使用的模板版本，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>当前使用的模板版本，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>当前使用的模板版本，用于出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>集群类型，只有当采集模板的Level为cluster的时候需要</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType <p>集群类型，只有当采集模板的Level为cluster的时候需要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型，只有当采集模板的Level为cluster的时候需要</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType <p>集群类型，只有当采集模板的Level为cluster的时候需要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>用于出参，实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName <p>用于出参，实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>用于出参，实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName <p>用于出参，实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>用于出参，集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName <p>用于出参，集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>用于出参，集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName <p>用于出参，集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public PrometheusTemplateSyncTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusTemplateSyncTarget(PrometheusTemplateSyncTarget source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SyncTime != null) {
            this.SyncTime = new String(source.SyncTime);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SyncTime", this.SyncTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

