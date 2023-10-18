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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQSmoothMigrationTaskItem extends AbstractModel{

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
    * 目标集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
    * 任务状态
Configuration 迁移配置
SourceConnecting 连接源集群中
MetaDataImport 元数据导入
EndpointSetup 切换接入点
ServiceMigration 切流中
Completed 已完成
Cancelled 已取消
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

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
     * Get 目标集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 目标集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 目标集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 目标集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get 任务状态
Configuration 迁移配置
SourceConnecting 连接源集群中
MetaDataImport 元数据导入
EndpointSetup 切换接入点
ServiceMigration 切流中
Completed 已完成
Cancelled 已取消
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 任务状态
Configuration 迁移配置
SourceConnecting 连接源集群中
MetaDataImport 元数据导入
EndpointSetup 切换接入点
ServiceMigration 切流中
Completed 已完成
Cancelled 已取消
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
Configuration 迁移配置
SourceConnecting 连接源集群中
MetaDataImport 元数据导入
EndpointSetup 切换接入点
ServiceMigration 切流中
Completed 已完成
Cancelled 已取消
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 任务状态
Configuration 迁移配置
SourceConnecting 连接源集群中
MetaDataImport 元数据导入
EndpointSetup 切换接入点
ServiceMigration 切流中
Completed 已完成
Cancelled 已取消
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public RocketMQSmoothMigrationTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQSmoothMigrationTaskItem(RocketMQSmoothMigrationTaskItem source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.SourceClusterName != null) {
            this.SourceClusterName = new String(source.SourceClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "SourceClusterName", this.SourceClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "SourceNameServer", this.SourceNameServer);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

