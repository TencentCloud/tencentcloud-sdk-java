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

public class MigratingTopic extends AbstractModel {

    /**
    * 主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 迁移状态 S_RW_D_NA 源集群读写 S_RW_D_R 源集群读写目标集群读 S_RW_D_RW 源集群读写目标集群读写 S_R_D_RW 源集群读目标集群读写 S_NA_D_RW 目标集群读写
    */
    @SerializedName("MigrationStatus")
    @Expose
    private String MigrationStatus;

    /**
    * 是否完成健康检查	
    */
    @SerializedName("HealthCheckPassed")
    @Expose
    private Boolean HealthCheckPassed;

    /**
    * 上次健康检查返回的错误信息，仅在HealthCheckPassed为false时有效。 NotChecked 未执行检查， Unknown 未知错误, TopicNotImported 主题未导入, TopicNotExistsInSourceCluster 主题在源集群中不存在, TopicNotExistsInTargetCluster 主题在目标集群中不存在, ConsumerConnectedOnTarget 目标集群上存在消费者连接, SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入, TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入, SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, ConsumerGroupCountNotMatch 订阅组数量不一致, SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息,
    */
    @SerializedName("HealthCheckError")
    @Expose
    private String HealthCheckError;

    /**
    * 命名空间，仅4.x集群有效
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * 4.x的主题名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicNameV4")
    @Expose
    private String TopicNameV4;

    /**
    * 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
    * 上次健康检查返回的错误列表
    */
    @SerializedName("HealthCheckErrorList")
    @Expose
    private String [] HealthCheckErrorList;

    /**
     * Get 主题名称 
     * @return TopicName 主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称
     * @param TopicName 主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 迁移状态 S_RW_D_NA 源集群读写 S_RW_D_R 源集群读写目标集群读 S_RW_D_RW 源集群读写目标集群读写 S_R_D_RW 源集群读目标集群读写 S_NA_D_RW 目标集群读写 
     * @return MigrationStatus 迁移状态 S_RW_D_NA 源集群读写 S_RW_D_R 源集群读写目标集群读 S_RW_D_RW 源集群读写目标集群读写 S_R_D_RW 源集群读目标集群读写 S_NA_D_RW 目标集群读写
     */
    public String getMigrationStatus() {
        return this.MigrationStatus;
    }

    /**
     * Set 迁移状态 S_RW_D_NA 源集群读写 S_RW_D_R 源集群读写目标集群读 S_RW_D_RW 源集群读写目标集群读写 S_R_D_RW 源集群读目标集群读写 S_NA_D_RW 目标集群读写
     * @param MigrationStatus 迁移状态 S_RW_D_NA 源集群读写 S_RW_D_R 源集群读写目标集群读 S_RW_D_RW 源集群读写目标集群读写 S_R_D_RW 源集群读目标集群读写 S_NA_D_RW 目标集群读写
     */
    public void setMigrationStatus(String MigrationStatus) {
        this.MigrationStatus = MigrationStatus;
    }

    /**
     * Get 是否完成健康检查	 
     * @return HealthCheckPassed 是否完成健康检查	
     */
    public Boolean getHealthCheckPassed() {
        return this.HealthCheckPassed;
    }

    /**
     * Set 是否完成健康检查	
     * @param HealthCheckPassed 是否完成健康检查	
     */
    public void setHealthCheckPassed(Boolean HealthCheckPassed) {
        this.HealthCheckPassed = HealthCheckPassed;
    }

    /**
     * Get 上次健康检查返回的错误信息，仅在HealthCheckPassed为false时有效。 NotChecked 未执行检查， Unknown 未知错误, TopicNotImported 主题未导入, TopicNotExistsInSourceCluster 主题在源集群中不存在, TopicNotExistsInTargetCluster 主题在目标集群中不存在, ConsumerConnectedOnTarget 目标集群上存在消费者连接, SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入, TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入, SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, ConsumerGroupCountNotMatch 订阅组数量不一致, SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息, 
     * @return HealthCheckError 上次健康检查返回的错误信息，仅在HealthCheckPassed为false时有效。 NotChecked 未执行检查， Unknown 未知错误, TopicNotImported 主题未导入, TopicNotExistsInSourceCluster 主题在源集群中不存在, TopicNotExistsInTargetCluster 主题在目标集群中不存在, ConsumerConnectedOnTarget 目标集群上存在消费者连接, SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入, TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入, SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, ConsumerGroupCountNotMatch 订阅组数量不一致, SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息,
     */
    public String getHealthCheckError() {
        return this.HealthCheckError;
    }

    /**
     * Set 上次健康检查返回的错误信息，仅在HealthCheckPassed为false时有效。 NotChecked 未执行检查， Unknown 未知错误, TopicNotImported 主题未导入, TopicNotExistsInSourceCluster 主题在源集群中不存在, TopicNotExistsInTargetCluster 主题在目标集群中不存在, ConsumerConnectedOnTarget 目标集群上存在消费者连接, SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入, TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入, SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, ConsumerGroupCountNotMatch 订阅组数量不一致, SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息,
     * @param HealthCheckError 上次健康检查返回的错误信息，仅在HealthCheckPassed为false时有效。 NotChecked 未执行检查， Unknown 未知错误, TopicNotImported 主题未导入, TopicNotExistsInSourceCluster 主题在源集群中不存在, TopicNotExistsInTargetCluster 主题在目标集群中不存在, ConsumerConnectedOnTarget 目标集群上存在消费者连接, SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入, TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入, SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, ConsumerGroupCountNotMatch 订阅组数量不一致, SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息,
     */
    public void setHealthCheckError(String HealthCheckError) {
        this.HealthCheckError = HealthCheckError;
    }

    /**
     * Get 命名空间，仅4.x集群有效 
     * @return Namespace 命名空间，仅4.x集群有效
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，仅4.x集群有效
     * @param Namespace 命名空间，仅4.x集群有效
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceV4 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceV4 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get 4.x的主题名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicNameV4 4.x的主题名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicNameV4() {
        return this.TopicNameV4;
    }

    /**
     * Set 4.x的主题名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicNameV4 4.x的主题名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicNameV4(String TopicNameV4) {
        this.TopicNameV4 = TopicNameV4;
    }

    /**
     * Get 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullNamespaceV4 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullNamespaceV4 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    /**
     * Get 上次健康检查返回的错误列表 
     * @return HealthCheckErrorList 上次健康检查返回的错误列表
     */
    public String [] getHealthCheckErrorList() {
        return this.HealthCheckErrorList;
    }

    /**
     * Set 上次健康检查返回的错误列表
     * @param HealthCheckErrorList 上次健康检查返回的错误列表
     */
    public void setHealthCheckErrorList(String [] HealthCheckErrorList) {
        this.HealthCheckErrorList = HealthCheckErrorList;
    }

    public MigratingTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigratingTopic(MigratingTopic source) {
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
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.NamespaceV4 != null) {
            this.NamespaceV4 = new String(source.NamespaceV4);
        }
        if (source.TopicNameV4 != null) {
            this.TopicNameV4 = new String(source.TopicNameV4);
        }
        if (source.FullNamespaceV4 != null) {
            this.FullNamespaceV4 = new String(source.FullNamespaceV4);
        }
        if (source.HealthCheckErrorList != null) {
            this.HealthCheckErrorList = new String[source.HealthCheckErrorList.length];
            for (int i = 0; i < source.HealthCheckErrorList.length; i++) {
                this.HealthCheckErrorList[i] = new String(source.HealthCheckErrorList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MigrationStatus", this.MigrationStatus);
        this.setParamSimple(map, prefix + "HealthCheckPassed", this.HealthCheckPassed);
        this.setParamSimple(map, prefix + "HealthCheckError", this.HealthCheckError);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "NamespaceV4", this.NamespaceV4);
        this.setParamSimple(map, prefix + "TopicNameV4", this.TopicNameV4);
        this.setParamSimple(map, prefix + "FullNamespaceV4", this.FullNamespaceV4);
        this.setParamArraySimple(map, prefix + "HealthCheckErrorList.", this.HealthCheckErrorList);

    }
}

