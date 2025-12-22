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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerInfo extends AbstractModel {

    /**
    * 投递规则ID
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 投递任务是否生效
    */
    @SerializedName("Effective")
    @Expose
    private Boolean Effective;

    /**
    * CKafka的描述
    */
    @SerializedName("Ckafka")
    @Expose
    private Ckafka Ckafka;

    /**
    * 是否投递日志的元数据信息
    */
    @SerializedName("NeedContent")
    @Expose
    private Boolean NeedContent;

    /**
    * 如果需要投递元数据信息，元数据信息的描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private ConsumerContent Content;

    /**
    * 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * 投递任务创建毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 角色访问描述名 [创建角色](https://cloud.tencent.com/document/product/598/19381)	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * 外部ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * 任务运行状态。支持`0`,`1`,`2` - `0`: 停止 - `1`: 运行中 - `2`: 异常	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 高级配置
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private AdvancedConsumerConfiguration AdvancedConfig;

    /**
     * Get 投递规则ID 
     * @return ConsumerId 投递规则ID
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set 投递规则ID
     * @param ConsumerId 投递规则ID
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 投递任务是否生效 
     * @return Effective 投递任务是否生效
     */
    public Boolean getEffective() {
        return this.Effective;
    }

    /**
     * Set 投递任务是否生效
     * @param Effective 投递任务是否生效
     */
    public void setEffective(Boolean Effective) {
        this.Effective = Effective;
    }

    /**
     * Get CKafka的描述 
     * @return Ckafka CKafka的描述
     */
    public Ckafka getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set CKafka的描述
     * @param Ckafka CKafka的描述
     */
    public void setCkafka(Ckafka Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Get 是否投递日志的元数据信息 
     * @return NeedContent 是否投递日志的元数据信息
     */
    public Boolean getNeedContent() {
        return this.NeedContent;
    }

    /**
     * Set 是否投递日志的元数据信息
     * @param NeedContent 是否投递日志的元数据信息
     */
    public void setNeedContent(Boolean NeedContent) {
        this.NeedContent = NeedContent;
    }

    /**
     * Get 如果需要投递元数据信息，元数据信息的描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 如果需要投递元数据信息，元数据信息的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerContent getContent() {
        return this.Content;
    }

    /**
     * Set 如果需要投递元数据信息，元数据信息的描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 如果需要投递元数据信息，元数据信息的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(ConsumerContent Content) {
        this.Content = Content;
    }

    /**
     * Get 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compression 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compression 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get 投递任务创建毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 投递任务创建毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 投递任务创建毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 投递任务创建毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 角色访问描述名 [创建角色](https://cloud.tencent.com/document/product/598/19381)	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleArn 角色访问描述名 [创建角色](https://cloud.tencent.com/document/product/598/19381)	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 角色访问描述名 [创建角色](https://cloud.tencent.com/document/product/598/19381)	
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleArn 角色访问描述名 [创建角色](https://cloud.tencent.com/document/product/598/19381)	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 外部ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalId 外部ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set 外部ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalId 外部ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get 任务运行状态。支持`0`,`1`,`2` - `0`: 停止 - `1`: 运行中 - `2`: 异常	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 任务运行状态。支持`0`,`1`,`2` - `0`: 停止 - `1`: 运行中 - `2`: 异常	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务运行状态。支持`0`,`1`,`2` - `0`: 停止 - `1`: 运行中 - `2`: 异常	
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 任务运行状态。支持`0`,`1`,`2` - `0`: 停止 - `1`: 运行中 - `2`: 异常	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 高级配置 
     * @return AdvancedConfig 高级配置
     */
    public AdvancedConsumerConfiguration getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set 高级配置
     * @param AdvancedConfig 高级配置
     */
    public void setAdvancedConfig(AdvancedConsumerConfiguration AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    public ConsumerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerInfo(ConsumerInfo source) {
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Effective != null) {
            this.Effective = new Boolean(source.Effective);
        }
        if (source.Ckafka != null) {
            this.Ckafka = new Ckafka(source.Ckafka);
        }
        if (source.NeedContent != null) {
            this.NeedContent = new Boolean(source.NeedContent);
        }
        if (source.Content != null) {
            this.Content = new ConsumerContent(source.Content);
        }
        if (source.Compression != null) {
            this.Compression = new Long(source.Compression);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new AdvancedConsumerConfiguration(source.AdvancedConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Effective", this.Effective);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);
        this.setParamSimple(map, prefix + "NeedContent", this.NeedContent);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);

    }
}

