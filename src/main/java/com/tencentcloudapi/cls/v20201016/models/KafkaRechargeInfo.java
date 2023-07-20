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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaRechargeInfo extends AbstractModel{

    /**
    * 主键ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Kafka导入任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 导入Kafka类型，0: 腾讯云CKafka，1: 用户自建Kafka
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * 腾讯云CKafka实例ID，KafkaType为0时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * 服务地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * ServerAddr是否为加密连接	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEncryptionAddr")
    @Expose
    private Boolean IsEncryptionAddr;

    /**
    * 加密访问协议，IsEncryptionAddr参数为true时必填
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

    /**
    * 用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserKafkaTopics")
    @Expose
    private String UserKafkaTopics;

    /**
    * 用户Kafka消费组名称	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * 状态   status 1: 运行中, 2: 暂停 ...
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 导入数据位置，-2:最早（默认），-1：最晚
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 日志导入规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogRechargeRule")
    @Expose
    private LogRechargeRuleInfo LogRechargeRule;

    /**
     * Get 主键ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 主键ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 主键ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Kafka导入任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name Kafka导入任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Kafka导入任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name Kafka导入任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 导入Kafka类型，0: 腾讯云CKafka，1: 用户自建Kafka
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaType 导入Kafka类型，0: 腾讯云CKafka，1: 用户自建Kafka
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set 导入Kafka类型，0: 腾讯云CKafka，1: 用户自建Kafka
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaType 导入Kafka类型，0: 腾讯云CKafka，1: 用户自建Kafka
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get 腾讯云CKafka实例ID，KafkaType为0时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaInstance 腾讯云CKafka实例ID，KafkaType为0时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set 腾讯云CKafka实例ID，KafkaType为0时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaInstance 腾讯云CKafka实例ID，KafkaType为0时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get 服务地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerAddr 服务地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set 服务地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerAddr 服务地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get ServerAddr是否为加密连接	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEncryptionAddr ServerAddr是否为加密连接	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set ServerAddr是否为加密连接	
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEncryptionAddr ServerAddr是否为加密连接	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEncryptionAddr(Boolean IsEncryptionAddr) {
        this.IsEncryptionAddr = IsEncryptionAddr;
    }

    /**
     * Get 加密访问协议，IsEncryptionAddr参数为true时必填 
     * @return Protocol 加密访问协议，IsEncryptionAddr参数为true时必填
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 加密访问协议，IsEncryptionAddr参数为true时必填
     * @param Protocol 加密访问协议，IsEncryptionAddr参数为true时必填
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserKafkaTopics 用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserKafkaTopics() {
        return this.UserKafkaTopics;
    }

    /**
     * Set 用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserKafkaTopics 用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserKafkaTopics(String UserKafkaTopics) {
        this.UserKafkaTopics = UserKafkaTopics;
    }

    /**
     * Get 用户Kafka消费组名称	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerGroupName 用户Kafka消费组名称	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set 用户Kafka消费组名称	
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerGroupName 用户Kafka消费组名称	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get 状态   status 1: 运行中, 2: 暂停 ...
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态   status 1: 运行中, 2: 暂停 ...
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态   status 1: 运行中, 2: 暂停 ...
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态   status 1: 运行中, 2: 暂停 ...
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 导入数据位置，-2:最早（默认），-1：最晚
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset 导入数据位置，-2:最早（默认），-1：最晚
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 导入数据位置，-2:最早（默认），-1：最晚
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 导入数据位置，-2:最早（默认），-1：最晚
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 日志导入规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogRechargeRule 日志导入规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogRechargeRuleInfo getLogRechargeRule() {
        return this.LogRechargeRule;
    }

    /**
     * Set 日志导入规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogRechargeRule 日志导入规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogRechargeRule(LogRechargeRuleInfo LogRechargeRule) {
        this.LogRechargeRule = LogRechargeRule;
    }

    public KafkaRechargeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaRechargeInfo(KafkaRechargeInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.KafkaType != null) {
            this.KafkaType = new Long(source.KafkaType);
        }
        if (source.KafkaInstance != null) {
            this.KafkaInstance = new String(source.KafkaInstance);
        }
        if (source.ServerAddr != null) {
            this.ServerAddr = new String(source.ServerAddr);
        }
        if (source.IsEncryptionAddr != null) {
            this.IsEncryptionAddr = new Boolean(source.IsEncryptionAddr);
        }
        if (source.Protocol != null) {
            this.Protocol = new KafkaProtocolInfo(source.Protocol);
        }
        if (source.UserKafkaTopics != null) {
            this.UserKafkaTopics = new String(source.UserKafkaTopics);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LogRechargeRule != null) {
            this.LogRechargeRule = new LogRechargeRuleInfo(source.LogRechargeRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "KafkaType", this.KafkaType);
        this.setParamSimple(map, prefix + "KafkaInstance", this.KafkaInstance);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "IsEncryptionAddr", this.IsEncryptionAddr);
        this.setParamObj(map, prefix + "Protocol.", this.Protocol);
        this.setParamSimple(map, prefix + "UserKafkaTopics", this.UserKafkaTopics);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "LogRechargeRule.", this.LogRechargeRule);

    }
}

