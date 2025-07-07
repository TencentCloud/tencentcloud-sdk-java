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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateTopic extends AbstractModel {

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * topic名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 迁移状态
S_RW_D_NA 源集群读写
S_RW_D_R 源集群读写目标集群读
S_RW_D_RW 源集群读写目标集群读写
S_R_D_RW 源集群读目标集群读写
S_NA_D_RW 目标集群读写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigrationStatus")
    @Expose
    private String MigrationStatus;

    /**
    * 是否完成健康检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckPassed")
    @Expose
    private Boolean HealthCheckPassed;

    /**
    * 上次健康检查返回的错误信息，仅在HealthCheckPassed为false时有效。
NotChecked 未执行检查，
Unknown 未知错误,
TopicNotImported 主题未导入,
 TopicNotExistsInSourceCluster  主题在源集群中不存在,
    TopicNotExistsInTargetCluster 主题在目标集群中不存在,
    ConsumerConnectedOnTarget 目标集群上存在消费者连接,
    SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入,
TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入,
    SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入,
TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入,
    ConsumerGroupCountNotMatch 订阅组数量不一致,
    SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息,
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckError")
    @Expose
    private String HealthCheckError;

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get topic名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName topic名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set topic名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName topic名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 迁移状态
S_RW_D_NA 源集群读写
S_RW_D_R 源集群读写目标集群读
S_RW_D_RW 源集群读写目标集群读写
S_R_D_RW 源集群读目标集群读写
S_NA_D_RW 目标集群读写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigrationStatus 迁移状态
S_RW_D_NA 源集群读写
S_RW_D_R 源集群读写目标集群读
S_RW_D_RW 源集群读写目标集群读写
S_R_D_RW 源集群读目标集群读写
S_NA_D_RW 目标集群读写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMigrationStatus() {
        return this.MigrationStatus;
    }

    /**
     * Set 迁移状态
S_RW_D_NA 源集群读写
S_RW_D_R 源集群读写目标集群读
S_RW_D_RW 源集群读写目标集群读写
S_R_D_RW 源集群读目标集群读写
S_NA_D_RW 目标集群读写
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigrationStatus 迁移状态
S_RW_D_NA 源集群读写
S_RW_D_R 源集群读写目标集群读
S_RW_D_RW 源集群读写目标集群读写
S_R_D_RW 源集群读目标集群读写
S_NA_D_RW 目标集群读写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrationStatus(String MigrationStatus) {
        this.MigrationStatus = MigrationStatus;
    }

    /**
     * Get 是否完成健康检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckPassed 是否完成健康检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHealthCheckPassed() {
        return this.HealthCheckPassed;
    }

    /**
     * Set 是否完成健康检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckPassed 是否完成健康检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckPassed(Boolean HealthCheckPassed) {
        this.HealthCheckPassed = HealthCheckPassed;
    }

    /**
     * Get 上次健康检查返回的错误信息，仅在HealthCheckPassed为false时有效。
NotChecked 未执行检查，
Unknown 未知错误,
TopicNotImported 主题未导入,
 TopicNotExistsInSourceCluster  主题在源集群中不存在,
    TopicNotExistsInTargetCluster 主题在目标集群中不存在,
    ConsumerConnectedOnTarget 目标集群上存在消费者连接,
    SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入,
TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入,
    SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入,
TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入,
    ConsumerGroupCountNotMatch 订阅组数量不一致,
    SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息,
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckError 上次健康检查返回的错误信息，仅在HealthCheckPassed为false时有效。
NotChecked 未执行检查，
Unknown 未知错误,
TopicNotImported 主题未导入,
 TopicNotExistsInSourceCluster  主题在源集群中不存在,
    TopicNotExistsInTargetCluster 主题在目标集群中不存在,
    ConsumerConnectedOnTarget 目标集群上存在消费者连接,
    SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入,
TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入,
    SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入,
TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入,
    ConsumerGroupCountNotMatch 订阅组数量不一致,
    SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息,
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthCheckError() {
        return this.HealthCheckError;
    }

    /**
     * Set 上次健康检查返回的错误信息，仅在HealthCheckPassed为false时有效。
NotChecked 未执行检查，
Unknown 未知错误,
TopicNotImported 主题未导入,
 TopicNotExistsInSourceCluster  主题在源集群中不存在,
    TopicNotExistsInTargetCluster 主题在目标集群中不存在,
    ConsumerConnectedOnTarget 目标集群上存在消费者连接,
    SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入,
TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入,
    SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入,
TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入,
    ConsumerGroupCountNotMatch 订阅组数量不一致,
    SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息,
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckError 上次健康检查返回的错误信息，仅在HealthCheckPassed为false时有效。
NotChecked 未执行检查，
Unknown 未知错误,
TopicNotImported 主题未导入,
 TopicNotExistsInSourceCluster  主题在源集群中不存在,
    TopicNotExistsInTargetCluster 主题在目标集群中不存在,
    ConsumerConnectedOnTarget 目标集群上存在消费者连接,
    SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入,
TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入,
    SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入,
TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入,
    ConsumerGroupCountNotMatch 订阅组数量不一致,
    SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息,
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckError(String HealthCheckError) {
        this.HealthCheckError = HealthCheckError;
    }

    public MigrateTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateTopic(MigrateTopic source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MigrationStatus != null) {
            this.MigrationStatus = new String(source.MigrationStatus);
        }
        if (source.HealthCheckPassed != null) {
            this.HealthCheckPassed = new Boolean(source.HealthCheckPassed);
        }
        if (source.HealthCheckError != null) {
            this.HealthCheckError = new String(source.HealthCheckError);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MigrationStatus", this.MigrationStatus);
        this.setParamSimple(map, prefix + "HealthCheckPassed", this.HealthCheckPassed);
        this.setParamSimple(map, prefix + "HealthCheckError", this.HealthCheckError);

    }
}

