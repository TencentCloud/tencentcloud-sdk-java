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

public class ModifyKafkaRechargeRequest extends AbstractModel {

    /**
    * 导入配置Id。
- 通过 [创建Kafka数据订阅任务](https://cloud.tencent.com/document/product/614/94448)获取Kafka导入配置Id。
- 通过 [获取Kafka数据订阅任务列表](https://cloud.tencent.com/document/product/614/94446)获取Kafka导入配置Id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 导入CLS目标TopicId。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456)获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Kafka导入配置名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 导入Kafka类型，0：腾讯云CKafka：1：用户自建Kafka。
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * 腾讯云CKafka实例ID，KafkaType为0时必填。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取实例id。
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * 服务地址，KafkaType为1时必填。
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * ServerAddr是否为加密连接，KafkaType为1时必填。
    */
    @SerializedName("IsEncryptionAddr")
    @Expose
    private Boolean IsEncryptionAddr;

    /**
    * 加密访问协议，KafkaType参数为1并且IsEncryptionAddr参数为true时必填。
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

    /**
    * 用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开。

- Kafka类型为腾讯云CKafka时：通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获取TopicName。
    */
    @SerializedName("UserKafkaTopics")
    @Expose
    private String UserKafkaTopics;

    /**
    * 用户Kafka消费组名称
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * 日志导入规则
    */
    @SerializedName("LogRechargeRule")
    @Expose
    private LogRechargeRuleInfo LogRechargeRule;

    /**
    * 导入控制，1：暂停；2：启动。
    */
    @SerializedName("StatusControl")
    @Expose
    private Long StatusControl;

    /**
     * Get 导入配置Id。
- 通过 [创建Kafka数据订阅任务](https://cloud.tencent.com/document/product/614/94448)获取Kafka导入配置Id。
- 通过 [获取Kafka数据订阅任务列表](https://cloud.tencent.com/document/product/614/94446)获取Kafka导入配置Id。 
     * @return Id 导入配置Id。
- 通过 [创建Kafka数据订阅任务](https://cloud.tencent.com/document/product/614/94448)获取Kafka导入配置Id。
- 通过 [获取Kafka数据订阅任务列表](https://cloud.tencent.com/document/product/614/94446)获取Kafka导入配置Id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 导入配置Id。
- 通过 [创建Kafka数据订阅任务](https://cloud.tencent.com/document/product/614/94448)获取Kafka导入配置Id。
- 通过 [获取Kafka数据订阅任务列表](https://cloud.tencent.com/document/product/614/94446)获取Kafka导入配置Id。
     * @param Id 导入配置Id。
- 通过 [创建Kafka数据订阅任务](https://cloud.tencent.com/document/product/614/94448)获取Kafka导入配置Id。
- 通过 [获取Kafka数据订阅任务列表](https://cloud.tencent.com/document/product/614/94446)获取Kafka导入配置Id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 导入CLS目标TopicId。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456)获取日志主题Id。 
     * @return TopicId 导入CLS目标TopicId。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456)获取日志主题Id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 导入CLS目标TopicId。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456)获取日志主题Id。
     * @param TopicId 导入CLS目标TopicId。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456)获取日志主题Id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Kafka导入配置名称 
     * @return Name Kafka导入配置名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Kafka导入配置名称
     * @param Name Kafka导入配置名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 导入Kafka类型，0：腾讯云CKafka：1：用户自建Kafka。 
     * @return KafkaType 导入Kafka类型，0：腾讯云CKafka：1：用户自建Kafka。
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set 导入Kafka类型，0：腾讯云CKafka：1：用户自建Kafka。
     * @param KafkaType 导入Kafka类型，0：腾讯云CKafka：1：用户自建Kafka。
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get 腾讯云CKafka实例ID，KafkaType为0时必填。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取实例id。 
     * @return KafkaInstance 腾讯云CKafka实例ID，KafkaType为0时必填。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取实例id。
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set 腾讯云CKafka实例ID，KafkaType为0时必填。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取实例id。
     * @param KafkaInstance 腾讯云CKafka实例ID，KafkaType为0时必填。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取实例id。
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get 服务地址，KafkaType为1时必填。 
     * @return ServerAddr 服务地址，KafkaType为1时必填。
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set 服务地址，KafkaType为1时必填。
     * @param ServerAddr 服务地址，KafkaType为1时必填。
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get ServerAddr是否为加密连接，KafkaType为1时必填。 
     * @return IsEncryptionAddr ServerAddr是否为加密连接，KafkaType为1时必填。
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set ServerAddr是否为加密连接，KafkaType为1时必填。
     * @param IsEncryptionAddr ServerAddr是否为加密连接，KafkaType为1时必填。
     */
    public void setIsEncryptionAddr(Boolean IsEncryptionAddr) {
        this.IsEncryptionAddr = IsEncryptionAddr;
    }

    /**
     * Get 加密访问协议，KafkaType参数为1并且IsEncryptionAddr参数为true时必填。 
     * @return Protocol 加密访问协议，KafkaType参数为1并且IsEncryptionAddr参数为true时必填。
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 加密访问协议，KafkaType参数为1并且IsEncryptionAddr参数为true时必填。
     * @param Protocol 加密访问协议，KafkaType参数为1并且IsEncryptionAddr参数为true时必填。
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开。

- Kafka类型为腾讯云CKafka时：通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获取TopicName。 
     * @return UserKafkaTopics 用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开。

- Kafka类型为腾讯云CKafka时：通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获取TopicName。
     */
    public String getUserKafkaTopics() {
        return this.UserKafkaTopics;
    }

    /**
     * Set 用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开。

- Kafka类型为腾讯云CKafka时：通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获取TopicName。
     * @param UserKafkaTopics 用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开。

- Kafka类型为腾讯云CKafka时：通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获取TopicName。
     */
    public void setUserKafkaTopics(String UserKafkaTopics) {
        this.UserKafkaTopics = UserKafkaTopics;
    }

    /**
     * Get 用户Kafka消费组名称 
     * @return ConsumerGroupName 用户Kafka消费组名称
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set 用户Kafka消费组名称
     * @param ConsumerGroupName 用户Kafka消费组名称
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get 日志导入规则 
     * @return LogRechargeRule 日志导入规则
     */
    public LogRechargeRuleInfo getLogRechargeRule() {
        return this.LogRechargeRule;
    }

    /**
     * Set 日志导入规则
     * @param LogRechargeRule 日志导入规则
     */
    public void setLogRechargeRule(LogRechargeRuleInfo LogRechargeRule) {
        this.LogRechargeRule = LogRechargeRule;
    }

    /**
     * Get 导入控制，1：暂停；2：启动。 
     * @return StatusControl 导入控制，1：暂停；2：启动。
     */
    public Long getStatusControl() {
        return this.StatusControl;
    }

    /**
     * Set 导入控制，1：暂停；2：启动。
     * @param StatusControl 导入控制，1：暂停；2：启动。
     */
    public void setStatusControl(Long StatusControl) {
        this.StatusControl = StatusControl;
    }

    public ModifyKafkaRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKafkaRechargeRequest(ModifyKafkaRechargeRequest source) {
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
        if (source.LogRechargeRule != null) {
            this.LogRechargeRule = new LogRechargeRuleInfo(source.LogRechargeRule);
        }
        if (source.StatusControl != null) {
            this.StatusControl = new Long(source.StatusControl);
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
        this.setParamObj(map, prefix + "LogRechargeRule.", this.LogRechargeRule);
        this.setParamSimple(map, prefix + "StatusControl", this.StatusControl);

    }
}

