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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQSmoothMigrationTaskResponse extends AbstractModel {

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 目标集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 源集群名称
    */
    @SerializedName("SourceClusterName")
    @Expose
    private String SourceClusterName;

    /**
    * 网络连接类型，
PUBLIC 公网
VPC 私有网络
OTHER 其它
    */
    @SerializedName("ConnectionType")
    @Expose
    private String ConnectionType;

    /**
    * 源集群NameServer地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceClusterNameServer")
    @Expose
    private String SourceClusterNameServer;

    /**
    * 源集群所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 源集群所在子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 是否开启ACL
    */
    @SerializedName("EnableACL")
    @Expose
    private Boolean EnableACL;

    /**
    * 源集群AccessKey
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 元集群SecretKey
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 配置源集群时发生的错误
TIMEOUT 连接超时，
SERVER_ERROR 服务错误，
INTERNAL_ERROR 内部错误，
CONNECT_NAMESERVER_ERROR 连接nameserver错误
CONNECT_BROKER_ERROR 连接broker错误
ACL_WRONG ACL信息不正确

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskError")
    @Expose
    private String TaskError;

    /**
    * 任务状态
Configuration 迁移配置
SourceConnecting 连接源集群中
SourceConnectionFailure 连接源集群失败
MetaDataImport 元数据导入
EndpointSetup 切换接入点
ServiceMigration 切流中
Completed 已完成
Cancelled 已取消
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 主题类型分布情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicTypeDistribution")
    @Expose
    private RocketMQTopicDistribution [] TopicTypeDistribution;

    /**
    * 主题迁移进度分布情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicStageDistribution")
    @Expose
    private RocketMQMigrationTopicDistribution [] TopicStageDistribution;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 目标集群ID 
     * @return ClusterId 目标集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 目标集群ID
     * @param ClusterId 目标集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 源集群名称 
     * @return SourceClusterName 源集群名称
     */
    public String getSourceClusterName() {
        return this.SourceClusterName;
    }

    /**
     * Set 源集群名称
     * @param SourceClusterName 源集群名称
     */
    public void setSourceClusterName(String SourceClusterName) {
        this.SourceClusterName = SourceClusterName;
    }

    /**
     * Get 网络连接类型，
PUBLIC 公网
VPC 私有网络
OTHER 其它 
     * @return ConnectionType 网络连接类型，
PUBLIC 公网
VPC 私有网络
OTHER 其它
     */
    public String getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set 网络连接类型，
PUBLIC 公网
VPC 私有网络
OTHER 其它
     * @param ConnectionType 网络连接类型，
PUBLIC 公网
VPC 私有网络
OTHER 其它
     */
    public void setConnectionType(String ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get 源集群NameServer地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceClusterNameServer 源集群NameServer地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceClusterNameServer() {
        return this.SourceClusterNameServer;
    }

    /**
     * Set 源集群NameServer地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceClusterNameServer 源集群NameServer地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceClusterNameServer(String SourceClusterNameServer) {
        this.SourceClusterNameServer = SourceClusterNameServer;
    }

    /**
     * Get 源集群所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 源集群所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 源集群所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 源集群所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 源集群所在子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 源集群所在子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 源集群所在子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 源集群所在子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 是否开启ACL 
     * @return EnableACL 是否开启ACL
     */
    public Boolean getEnableACL() {
        return this.EnableACL;
    }

    /**
     * Set 是否开启ACL
     * @param EnableACL 是否开启ACL
     */
    public void setEnableACL(Boolean EnableACL) {
        this.EnableACL = EnableACL;
    }

    /**
     * Get 源集群AccessKey
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessKey 源集群AccessKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 源集群AccessKey
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessKey 源集群AccessKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 元集群SecretKey
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey 元集群SecretKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 元集群SecretKey
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey 元集群SecretKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 配置源集群时发生的错误
TIMEOUT 连接超时，
SERVER_ERROR 服务错误，
INTERNAL_ERROR 内部错误，
CONNECT_NAMESERVER_ERROR 连接nameserver错误
CONNECT_BROKER_ERROR 连接broker错误
ACL_WRONG ACL信息不正确

注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskError 配置源集群时发生的错误
TIMEOUT 连接超时，
SERVER_ERROR 服务错误，
INTERNAL_ERROR 内部错误，
CONNECT_NAMESERVER_ERROR 连接nameserver错误
CONNECT_BROKER_ERROR 连接broker错误
ACL_WRONG ACL信息不正确

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskError() {
        return this.TaskError;
    }

    /**
     * Set 配置源集群时发生的错误
TIMEOUT 连接超时，
SERVER_ERROR 服务错误，
INTERNAL_ERROR 内部错误，
CONNECT_NAMESERVER_ERROR 连接nameserver错误
CONNECT_BROKER_ERROR 连接broker错误
ACL_WRONG ACL信息不正确

注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskError 配置源集群时发生的错误
TIMEOUT 连接超时，
SERVER_ERROR 服务错误，
INTERNAL_ERROR 内部错误，
CONNECT_NAMESERVER_ERROR 连接nameserver错误
CONNECT_BROKER_ERROR 连接broker错误
ACL_WRONG ACL信息不正确

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskError(String TaskError) {
        this.TaskError = TaskError;
    }

    /**
     * Get 任务状态
Configuration 迁移配置
SourceConnecting 连接源集群中
SourceConnectionFailure 连接源集群失败
MetaDataImport 元数据导入
EndpointSetup 切换接入点
ServiceMigration 切流中
Completed 已完成
Cancelled 已取消 
     * @return TaskStatus 任务状态
Configuration 迁移配置
SourceConnecting 连接源集群中
SourceConnectionFailure 连接源集群失败
MetaDataImport 元数据导入
EndpointSetup 切换接入点
ServiceMigration 切流中
Completed 已完成
Cancelled 已取消
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
Configuration 迁移配置
SourceConnecting 连接源集群中
SourceConnectionFailure 连接源集群失败
MetaDataImport 元数据导入
EndpointSetup 切换接入点
ServiceMigration 切流中
Completed 已完成
Cancelled 已取消
     * @param TaskStatus 任务状态
Configuration 迁移配置
SourceConnecting 连接源集群中
SourceConnectionFailure 连接源集群失败
MetaDataImport 元数据导入
EndpointSetup 切换接入点
ServiceMigration 切流中
Completed 已完成
Cancelled 已取消
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 主题类型分布情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicTypeDistribution 主题类型分布情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RocketMQTopicDistribution [] getTopicTypeDistribution() {
        return this.TopicTypeDistribution;
    }

    /**
     * Set 主题类型分布情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicTypeDistribution 主题类型分布情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicTypeDistribution(RocketMQTopicDistribution [] TopicTypeDistribution) {
        this.TopicTypeDistribution = TopicTypeDistribution;
    }

    /**
     * Get 主题迁移进度分布情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicStageDistribution 主题迁移进度分布情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RocketMQMigrationTopicDistribution [] getTopicStageDistribution() {
        return this.TopicStageDistribution;
    }

    /**
     * Set 主题迁移进度分布情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicStageDistribution 主题迁移进度分布情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicStageDistribution(RocketMQMigrationTopicDistribution [] TopicStageDistribution) {
        this.TopicStageDistribution = TopicStageDistribution;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRocketMQSmoothMigrationTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQSmoothMigrationTaskResponse(DescribeRocketMQSmoothMigrationTaskResponse source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SourceClusterName != null) {
            this.SourceClusterName = new String(source.SourceClusterName);
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
        if (source.SourceClusterNameServer != null) {
            this.SourceClusterNameServer = new String(source.SourceClusterNameServer);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EnableACL != null) {
            this.EnableACL = new Boolean(source.EnableACL);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.TaskError != null) {
            this.TaskError = new String(source.TaskError);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicTypeDistribution != null) {
            this.TopicTypeDistribution = new RocketMQTopicDistribution[source.TopicTypeDistribution.length];
            for (int i = 0; i < source.TopicTypeDistribution.length; i++) {
                this.TopicTypeDistribution[i] = new RocketMQTopicDistribution(source.TopicTypeDistribution[i]);
            }
        }
        if (source.TopicStageDistribution != null) {
            this.TopicStageDistribution = new RocketMQMigrationTopicDistribution[source.TopicStageDistribution.length];
            for (int i = 0; i < source.TopicStageDistribution.length; i++) {
                this.TopicStageDistribution[i] = new RocketMQMigrationTopicDistribution(source.TopicStageDistribution[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SourceClusterName", this.SourceClusterName);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "SourceClusterNameServer", this.SourceClusterNameServer);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EnableACL", this.EnableACL);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "TaskError", this.TaskError);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "TopicTypeDistribution.", this.TopicTypeDistribution);
        this.setParamArrayObj(map, prefix + "TopicStageDistribution.", this.TopicStageDistribution);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

