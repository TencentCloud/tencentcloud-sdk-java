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

public class RocketMQTopicConfigOutput extends AbstractModel {

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 主题名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 主题类型：
Normal，普通
GlobalOrder， 全局顺序
PartitionedOrder, 分区顺序
Transaction，事务消息
DelayScheduled，延迟/定时消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 分区个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * 备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否导入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Imported")
    @Expose
    private Boolean Imported;

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
     * Get 主题名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName 主题名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName 主题名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 主题类型：
Normal，普通
GlobalOrder， 全局顺序
PartitionedOrder, 分区顺序
Transaction，事务消息
DelayScheduled，延迟/定时消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 主题类型：
Normal，普通
GlobalOrder， 全局顺序
PartitionedOrder, 分区顺序
Transaction，事务消息
DelayScheduled，延迟/定时消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 主题类型：
Normal，普通
GlobalOrder， 全局顺序
PartitionedOrder, 分区顺序
Transaction，事务消息
DelayScheduled，延迟/定时消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 主题类型：
Normal，普通
GlobalOrder， 全局顺序
PartitionedOrder, 分区顺序
Transaction，事务消息
DelayScheduled，延迟/定时消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 分区个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions 分区个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 分区个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions 分区个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否导入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Imported 是否导入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getImported() {
        return this.Imported;
    }

    /**
     * Set 是否导入
注意：此字段可能返回 null，表示取不到有效值。
     * @param Imported 是否导入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImported(Boolean Imported) {
        this.Imported = Imported;
    }

    public RocketMQTopicConfigOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQTopicConfigOutput(RocketMQTopicConfigOutput source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Imported != null) {
            this.Imported = new Boolean(source.Imported);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Imported", this.Imported);

    }
}

