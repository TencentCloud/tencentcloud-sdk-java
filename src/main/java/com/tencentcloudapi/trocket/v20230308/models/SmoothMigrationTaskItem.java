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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmoothMigrationTaskItem extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 源集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceClusterName")
    @Expose
    private String SourceClusterName;

    /**
    * 目标集群实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 网络连接类型， 
PUBLIC 公网 
VPC 私有网络 
OTHER 其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionType")
    @Expose
    private String ConnectionType;

    /**
    * 源集群NameServer地址	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceNameServer")
    @Expose
    private String SourceNameServer;

    /**
    * 任务状态 Configuration 迁移配置 SourceConnecting 连接源集群中 MetaDataImport 元数据导入 EndpointSetup 切换接入点 ServiceMigration 切流中 Completed 已完成 Cancelled 已取消
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 目标集群实例版本，
4 表示4.x版本
5 表示5.x版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称	
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 源集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceClusterName 源集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceClusterName() {
        return this.SourceClusterName;
    }

    /**
     * Set 源集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceClusterName 源集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceClusterName(String SourceClusterName) {
        this.SourceClusterName = SourceClusterName;
    }

    /**
     * Get 目标集群实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 目标集群实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 目标集群实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 目标集群实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 网络连接类型， 
PUBLIC 公网 
VPC 私有网络 
OTHER 其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionType 网络连接类型， 
PUBLIC 公网 
VPC 私有网络 
OTHER 其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set 网络连接类型， 
PUBLIC 公网 
VPC 私有网络 
OTHER 其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionType 网络连接类型， 
PUBLIC 公网 
VPC 私有网络 
OTHER 其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionType(String ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get 源集群NameServer地址	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceNameServer 源集群NameServer地址	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceNameServer() {
        return this.SourceNameServer;
    }

    /**
     * Set 源集群NameServer地址	
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceNameServer 源集群NameServer地址	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceNameServer(String SourceNameServer) {
        this.SourceNameServer = SourceNameServer;
    }

    /**
     * Get 任务状态 Configuration 迁移配置 SourceConnecting 连接源集群中 MetaDataImport 元数据导入 EndpointSetup 切换接入点 ServiceMigration 切流中 Completed 已完成 Cancelled 已取消
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 任务状态 Configuration 迁移配置 SourceConnecting 连接源集群中 MetaDataImport 元数据导入 EndpointSetup 切换接入点 ServiceMigration 切流中 Completed 已完成 Cancelled 已取消
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态 Configuration 迁移配置 SourceConnecting 连接源集群中 MetaDataImport 元数据导入 EndpointSetup 切换接入点 ServiceMigration 切流中 Completed 已完成 Cancelled 已取消
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 任务状态 Configuration 迁移配置 SourceConnecting 连接源集群中 MetaDataImport 元数据导入 EndpointSetup 切换接入点 ServiceMigration 切流中 Completed 已完成 Cancelled 已取消
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 目标集群实例版本，
4 表示4.x版本
5 表示5.x版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceVersion 目标集群实例版本，
4 表示4.x版本
5 表示5.x版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 目标集群实例版本，
4 表示4.x版本
5 表示5.x版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceVersion 目标集群实例版本，
4 表示4.x版本
5 表示5.x版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    public SmoothMigrationTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmoothMigrationTaskItem(SmoothMigrationTaskItem source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.SourceClusterName != null) {
            this.SourceClusterName = new String(source.SourceClusterName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
        if (source.SourceNameServer != null) {
            this.SourceNameServer = new String(source.SourceNameServer);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "SourceClusterName", this.SourceClusterName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "SourceNameServer", this.SourceNameServer);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);

    }
}

