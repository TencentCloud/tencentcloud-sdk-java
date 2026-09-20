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
    * <p>导入配置Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/94448">创建Kafka数据订阅任务</a>获取Kafka导入配置Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/94446">获取Kafka数据订阅任务列表</a>获取Kafka导入配置Id。</li></ul>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>导入CLS目标TopicId。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a>获取日志主题Id。</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Kafka导入配置名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>导入Kafka类型，0：腾讯云CKafka：1：用户自建Kafka。</p>
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * <p>腾讯云CKafka实例ID，KafkaType为0时必填。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/597/40835">获取实例列表信息</a> 获取实例id。</li></ul>
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * <p>服务地址，KafkaType为1时必填。</p>
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * <p>ServerAddr是否为加密连接，KafkaType为1时必填。</p>
    */
    @SerializedName("IsEncryptionAddr")
    @Expose
    private Boolean IsEncryptionAddr;

    /**
    * <p>加密访问协议，KafkaType参数为1并且IsEncryptionAddr参数为true时必填。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

    /**
    * <p>用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开。</p><ul><li>Kafka类型为腾讯云CKafka时：通过 <a href="https://cloud.tencent.com/document/product/597/40847">获取主题列表</a> 获取TopicName。</li></ul>
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
    * <p>日志导入规则</p>
    */
    @SerializedName("LogRechargeRule")
    @Expose
    private LogRechargeRuleInfo LogRechargeRule;

    /**
    * <p>导入控制，1：暂停；2：启动。</p>
    */
    @SerializedName("StatusControl")
    @Expose
    private Long StatusControl;

    /**
    * <p>私有网络信息参数</p>
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
     * Get <p>导入配置Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/94448">创建Kafka数据订阅任务</a>获取Kafka导入配置Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/94446">获取Kafka数据订阅任务列表</a>获取Kafka导入配置Id。</li></ul> 
     * @return Id <p>导入配置Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/94448">创建Kafka数据订阅任务</a>获取Kafka导入配置Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/94446">获取Kafka数据订阅任务列表</a>获取Kafka导入配置Id。</li></ul>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>导入配置Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/94448">创建Kafka数据订阅任务</a>获取Kafka导入配置Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/94446">获取Kafka数据订阅任务列表</a>获取Kafka导入配置Id。</li></ul>
     * @param Id <p>导入配置Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/94448">创建Kafka数据订阅任务</a>获取Kafka导入配置Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/94446">获取Kafka数据订阅任务列表</a>获取Kafka导入配置Id。</li></ul>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>导入CLS目标TopicId。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a>获取日志主题Id。</li></ul> 
     * @return TopicId <p>导入CLS目标TopicId。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a>获取日志主题Id。</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>导入CLS目标TopicId。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a>获取日志主题Id。</li></ul>
     * @param TopicId <p>导入CLS目标TopicId。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a>获取日志主题Id。</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Kafka导入配置名称</p> 
     * @return Name <p>Kafka导入配置名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Kafka导入配置名称</p>
     * @param Name <p>Kafka导入配置名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>导入Kafka类型，0：腾讯云CKafka：1：用户自建Kafka。</p> 
     * @return KafkaType <p>导入Kafka类型，0：腾讯云CKafka：1：用户自建Kafka。</p>
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set <p>导入Kafka类型，0：腾讯云CKafka：1：用户自建Kafka。</p>
     * @param KafkaType <p>导入Kafka类型，0：腾讯云CKafka：1：用户自建Kafka。</p>
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get <p>腾讯云CKafka实例ID，KafkaType为0时必填。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/597/40835">获取实例列表信息</a> 获取实例id。</li></ul> 
     * @return KafkaInstance <p>腾讯云CKafka实例ID，KafkaType为0时必填。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/597/40835">获取实例列表信息</a> 获取实例id。</li></ul>
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set <p>腾讯云CKafka实例ID，KafkaType为0时必填。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/597/40835">获取实例列表信息</a> 获取实例id。</li></ul>
     * @param KafkaInstance <p>腾讯云CKafka实例ID，KafkaType为0时必填。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/597/40835">获取实例列表信息</a> 获取实例id。</li></ul>
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get <p>服务地址，KafkaType为1时必填。</p> 
     * @return ServerAddr <p>服务地址，KafkaType为1时必填。</p>
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set <p>服务地址，KafkaType为1时必填。</p>
     * @param ServerAddr <p>服务地址，KafkaType为1时必填。</p>
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get <p>ServerAddr是否为加密连接，KafkaType为1时必填。</p> 
     * @return IsEncryptionAddr <p>ServerAddr是否为加密连接，KafkaType为1时必填。</p>
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set <p>ServerAddr是否为加密连接，KafkaType为1时必填。</p>
     * @param IsEncryptionAddr <p>ServerAddr是否为加密连接，KafkaType为1时必填。</p>
     */
    public void setIsEncryptionAddr(Boolean IsEncryptionAddr) {
        this.IsEncryptionAddr = IsEncryptionAddr;
    }

    /**
     * Get <p>加密访问协议，KafkaType参数为1并且IsEncryptionAddr参数为true时必填。</p> 
     * @return Protocol <p>加密访问协议，KafkaType参数为1并且IsEncryptionAddr参数为true时必填。</p>
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>加密访问协议，KafkaType参数为1并且IsEncryptionAddr参数为true时必填。</p>
     * @param Protocol <p>加密访问协议，KafkaType参数为1并且IsEncryptionAddr参数为true时必填。</p>
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开。</p><ul><li>Kafka类型为腾讯云CKafka时：通过 <a href="https://cloud.tencent.com/document/product/597/40847">获取主题列表</a> 获取TopicName。</li></ul> 
     * @return UserKafkaTopics <p>用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开。</p><ul><li>Kafka类型为腾讯云CKafka时：通过 <a href="https://cloud.tencent.com/document/product/597/40847">获取主题列表</a> 获取TopicName。</li></ul>
     */
    public String getUserKafkaTopics() {
        return this.UserKafkaTopics;
    }

    /**
     * Set <p>用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开。</p><ul><li>Kafka类型为腾讯云CKafka时：通过 <a href="https://cloud.tencent.com/document/product/597/40847">获取主题列表</a> 获取TopicName。</li></ul>
     * @param UserKafkaTopics <p>用户需要导入的Kafka相关topic列表，多个topic之间使用半角逗号隔开。</p><ul><li>Kafka类型为腾讯云CKafka时：通过 <a href="https://cloud.tencent.com/document/product/597/40847">获取主题列表</a> 获取TopicName。</li></ul>
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
     * Get <p>导入控制，1：暂停；2：启动。</p> 
     * @return StatusControl <p>导入控制，1：暂停；2：启动。</p>
     */
    public Long getStatusControl() {
        return this.StatusControl;
    }

    /**
     * Set <p>导入控制，1：暂停；2：启动。</p>
     * @param StatusControl <p>导入控制，1：暂停；2：启动。</p>
     */
    public void setStatusControl(Long StatusControl) {
        this.StatusControl = StatusControl;
    }

    /**
     * Get <p>私有网络信息参数</p> 
     * @return NetworkInfo <p>私有网络信息参数</p>
     */
    public NetworkInfo getNetworkInfo() {
        return this.NetworkInfo;
    }

    /**
     * Set <p>私有网络信息参数</p>
     * @param NetworkInfo <p>私有网络信息参数</p>
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
        this.setParamObj(map, prefix + "LogRechargeRule.", this.LogRechargeRule);
        this.setParamSimple(map, prefix + "StatusControl", this.StatusControl);
        this.setParamObj(map, prefix + "NetworkInfo.", this.NetworkInfo);
        this.setParamObj(map, prefix + "UserKafkaMeta.", this.UserKafkaMeta);

    }
}

