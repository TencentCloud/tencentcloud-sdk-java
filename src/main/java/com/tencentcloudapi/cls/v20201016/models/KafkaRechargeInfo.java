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

public class KafkaRechargeInfo extends AbstractModel {

    /**
    * <p>Kafka数据订阅配置的ID。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Kafka导入任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>导入Kafka类型，0: 腾讯云CKafka，1: 用户自建Kafka</p>
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * <p>腾讯云CKafka实例ID，KafkaType为0时必填</p>
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * <p>服务地址</p>
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * <p>ServerAddr是否为加密连接</p>
    */
    @SerializedName("IsEncryptionAddr")
    @Expose
    private Boolean IsEncryptionAddr;

    /**
    * <p>加密访问协议，IsEncryptionAddr参数为true时必填</p>
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

    /**
    * <p>用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开</p>
    */
    @SerializedName("UserKafkaTopics")
    @Expose
    private String UserKafkaTopics;

    /**
    * <p>用户Kafka消费组名称</p>
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * <p>状态 ，1：运行中；2：暂停。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>导入数据位置，-2:最早（默认），-1：最晚</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>创建时间。格式<code>YYYY-MM-DD HH:MM:SS</code></p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间。格式<code>YYYY-MM-DD HH:MM:SS</code></p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>日志导入规则</p>
    */
    @SerializedName("LogRechargeRule")
    @Expose
    private LogRechargeRuleInfo LogRechargeRule;

    /**
    * <p>私有网络信息</p>
    */
    @SerializedName("NetworkInfo")
    @Expose
    private NetworkInfo NetworkInfo;

    /**
    * <p>用户kafka拓展信息</p>
    */
    @SerializedName("UserKafkaMeta")
    @Expose
    private UserKafkaMeta UserKafkaMeta;

    /**
     * Get <p>Kafka数据订阅配置的ID。</p> 
     * @return Id <p>Kafka数据订阅配置的ID。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Kafka数据订阅配置的ID。</p>
     * @param Id <p>Kafka数据订阅配置的ID。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>日志主题ID</p> 
     * @return TopicId <p>日志主题ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param TopicId <p>日志主题ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Kafka导入任务名称</p> 
     * @return Name <p>Kafka导入任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Kafka导入任务名称</p>
     * @param Name <p>Kafka导入任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>导入Kafka类型，0: 腾讯云CKafka，1: 用户自建Kafka</p> 
     * @return KafkaType <p>导入Kafka类型，0: 腾讯云CKafka，1: 用户自建Kafka</p>
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set <p>导入Kafka类型，0: 腾讯云CKafka，1: 用户自建Kafka</p>
     * @param KafkaType <p>导入Kafka类型，0: 腾讯云CKafka，1: 用户自建Kafka</p>
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get <p>腾讯云CKafka实例ID，KafkaType为0时必填</p> 
     * @return KafkaInstance <p>腾讯云CKafka实例ID，KafkaType为0时必填</p>
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set <p>腾讯云CKafka实例ID，KafkaType为0时必填</p>
     * @param KafkaInstance <p>腾讯云CKafka实例ID，KafkaType为0时必填</p>
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get <p>服务地址</p> 
     * @return ServerAddr <p>服务地址</p>
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set <p>服务地址</p>
     * @param ServerAddr <p>服务地址</p>
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get <p>ServerAddr是否为加密连接</p> 
     * @return IsEncryptionAddr <p>ServerAddr是否为加密连接</p>
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set <p>ServerAddr是否为加密连接</p>
     * @param IsEncryptionAddr <p>ServerAddr是否为加密连接</p>
     */
    public void setIsEncryptionAddr(Boolean IsEncryptionAddr) {
        this.IsEncryptionAddr = IsEncryptionAddr;
    }

    /**
     * Get <p>加密访问协议，IsEncryptionAddr参数为true时必填</p> 
     * @return Protocol <p>加密访问协议，IsEncryptionAddr参数为true时必填</p>
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>加密访问协议，IsEncryptionAddr参数为true时必填</p>
     * @param Protocol <p>加密访问协议，IsEncryptionAddr参数为true时必填</p>
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开</p> 
     * @return UserKafkaTopics <p>用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开</p>
     */
    public String getUserKafkaTopics() {
        return this.UserKafkaTopics;
    }

    /**
     * Set <p>用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开</p>
     * @param UserKafkaTopics <p>用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开</p>
     */
    public void setUserKafkaTopics(String UserKafkaTopics) {
        this.UserKafkaTopics = UserKafkaTopics;
    }

    /**
     * Get <p>用户Kafka消费组名称</p> 
     * @return ConsumerGroupName <p>用户Kafka消费组名称</p>
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set <p>用户Kafka消费组名称</p>
     * @param ConsumerGroupName <p>用户Kafka消费组名称</p>
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get <p>状态 ，1：运行中；2：暂停。</p> 
     * @return Status <p>状态 ，1：运行中；2：暂停。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态 ，1：运行中；2：暂停。</p>
     * @param Status <p>状态 ，1：运行中；2：暂停。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>导入数据位置，-2:最早（默认），-1：最晚</p> 
     * @return Offset <p>导入数据位置，-2:最早（默认），-1：最晚</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>导入数据位置，-2:最早（默认），-1：最晚</p>
     * @param Offset <p>导入数据位置，-2:最早（默认），-1：最晚</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>创建时间。格式<code>YYYY-MM-DD HH:MM:SS</code></p> 
     * @return CreateTime <p>创建时间。格式<code>YYYY-MM-DD HH:MM:SS</code></p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。格式<code>YYYY-MM-DD HH:MM:SS</code></p>
     * @param CreateTime <p>创建时间。格式<code>YYYY-MM-DD HH:MM:SS</code></p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间。格式<code>YYYY-MM-DD HH:MM:SS</code></p> 
     * @return UpdateTime <p>更新时间。格式<code>YYYY-MM-DD HH:MM:SS</code></p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间。格式<code>YYYY-MM-DD HH:MM:SS</code></p>
     * @param UpdateTime <p>更新时间。格式<code>YYYY-MM-DD HH:MM:SS</code></p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>日志导入规则</p> 
     * @return LogRechargeRule <p>日志导入规则</p>
     */
    public LogRechargeRuleInfo getLogRechargeRule() {
        return this.LogRechargeRule;
    }

    /**
     * Set <p>日志导入规则</p>
     * @param LogRechargeRule <p>日志导入规则</p>
     */
    public void setLogRechargeRule(LogRechargeRuleInfo LogRechargeRule) {
        this.LogRechargeRule = LogRechargeRule;
    }

    /**
     * Get <p>私有网络信息</p> 
     * @return NetworkInfo <p>私有网络信息</p>
     */
    public NetworkInfo getNetworkInfo() {
        return this.NetworkInfo;
    }

    /**
     * Set <p>私有网络信息</p>
     * @param NetworkInfo <p>私有网络信息</p>
     */
    public void setNetworkInfo(NetworkInfo NetworkInfo) {
        this.NetworkInfo = NetworkInfo;
    }

    /**
     * Get <p>用户kafka拓展信息</p> 
     * @return UserKafkaMeta <p>用户kafka拓展信息</p>
     */
    public UserKafkaMeta getUserKafkaMeta() {
        return this.UserKafkaMeta;
    }

    /**
     * Set <p>用户kafka拓展信息</p>
     * @param UserKafkaMeta <p>用户kafka拓展信息</p>
     */
    public void setUserKafkaMeta(UserKafkaMeta UserKafkaMeta) {
        this.UserKafkaMeta = UserKafkaMeta;
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
        if (source.NetworkInfo != null) {
            this.NetworkInfo = new NetworkInfo(source.NetworkInfo);
        }
        if (source.UserKafkaMeta != null) {
            this.UserKafkaMeta = new UserKafkaMeta(source.UserKafkaMeta);
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
        this.setParamObj(map, prefix + "NetworkInfo.", this.NetworkInfo);
        this.setParamObj(map, prefix + "UserKafkaMeta.", this.UserKafkaMeta);

    }
}

