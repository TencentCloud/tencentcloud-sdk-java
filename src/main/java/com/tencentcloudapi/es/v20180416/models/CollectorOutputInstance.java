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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CollectorOutputInstance extends AbstractModel {

    /**
    * <p>采集器输出的实例类型（支持elasticsearch、logstash）</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>采集器输出的实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>采集器输出到的ES实例的用户名</p>
    */
    @SerializedName("ESUserName")
    @Expose
    private String ESUserName;

    /**
    * <p>采集器输出到的ES实例的密码</p>
    */
    @SerializedName("ESUserPasswd")
    @Expose
    private String ESUserPasswd;

    /**
    * <p>采集器输出到ES实例时，是否开启监控（1为开启，0为不开启，默认为0）</p>
    */
    @SerializedName("EnableMonitoring")
    @Expose
    private Long EnableMonitoring;

    /**
    * <p>采集器输出到ES实例时，是否开启自动在kibana中生成Dashboard（1为开启，0为不开启，默认为0）</p>
    */
    @SerializedName("EnableDashboard")
    @Expose
    private Long EnableDashboard;

    /**
    * <p>Ckafka实例的vip</p>
    */
    @SerializedName("KafkaEndpoint")
    @Expose
    private String KafkaEndpoint;

    /**
    * <p>Ckafka实例中的Topic</p>
    */
    @SerializedName("KafkaTopic")
    @Expose
    private String KafkaTopic;

    /**
    * <p>Ckafka实例的版本号</p>
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * <p>topic id</p>
    */
    @SerializedName("SesTopicId")
    @Expose
    private String SesTopicId;

    /**
    * <p>topic name</p>
    */
    @SerializedName("SesTopicName")
    @Expose
    private String SesTopicName;

    /**
    * <p>topic address</p>
    */
    @SerializedName("SesTopicAddress")
    @Expose
    private String SesTopicAddress;

    /**
    * <p>/</p>
    */
    @SerializedName("SesTopicUserName")
    @Expose
    private String SesTopicUserName;

    /**
    * <p>/</p>
    */
    @SerializedName("SesTopicPasswd")
    @Expose
    private String SesTopicPasswd;

    /**
    * <p>/</p>
    */
    @SerializedName("LogstashListenPort")
    @Expose
    private Long LogstashListenPort;

    /**
    * <p>serverless 的 spaceid</p>
    */
    @SerializedName("SesSpaceId")
    @Expose
    private String SesSpaceId;

    /**
     * Get <p>采集器输出的实例类型（支持elasticsearch、logstash）</p> 
     * @return Type <p>采集器输出的实例类型（支持elasticsearch、logstash）</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>采集器输出的实例类型（支持elasticsearch、logstash）</p>
     * @param Type <p>采集器输出的实例类型（支持elasticsearch、logstash）</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>采集器输出的实例ID</p> 
     * @return InstanceId <p>采集器输出的实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>采集器输出的实例ID</p>
     * @param InstanceId <p>采集器输出的实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>采集器输出到的ES实例的用户名</p> 
     * @return ESUserName <p>采集器输出到的ES实例的用户名</p>
     */
    public String getESUserName() {
        return this.ESUserName;
    }

    /**
     * Set <p>采集器输出到的ES实例的用户名</p>
     * @param ESUserName <p>采集器输出到的ES实例的用户名</p>
     */
    public void setESUserName(String ESUserName) {
        this.ESUserName = ESUserName;
    }

    /**
     * Get <p>采集器输出到的ES实例的密码</p> 
     * @return ESUserPasswd <p>采集器输出到的ES实例的密码</p>
     */
    public String getESUserPasswd() {
        return this.ESUserPasswd;
    }

    /**
     * Set <p>采集器输出到的ES实例的密码</p>
     * @param ESUserPasswd <p>采集器输出到的ES实例的密码</p>
     */
    public void setESUserPasswd(String ESUserPasswd) {
        this.ESUserPasswd = ESUserPasswd;
    }

    /**
     * Get <p>采集器输出到ES实例时，是否开启监控（1为开启，0为不开启，默认为0）</p> 
     * @return EnableMonitoring <p>采集器输出到ES实例时，是否开启监控（1为开启，0为不开启，默认为0）</p>
     */
    public Long getEnableMonitoring() {
        return this.EnableMonitoring;
    }

    /**
     * Set <p>采集器输出到ES实例时，是否开启监控（1为开启，0为不开启，默认为0）</p>
     * @param EnableMonitoring <p>采集器输出到ES实例时，是否开启监控（1为开启，0为不开启，默认为0）</p>
     */
    public void setEnableMonitoring(Long EnableMonitoring) {
        this.EnableMonitoring = EnableMonitoring;
    }

    /**
     * Get <p>采集器输出到ES实例时，是否开启自动在kibana中生成Dashboard（1为开启，0为不开启，默认为0）</p> 
     * @return EnableDashboard <p>采集器输出到ES实例时，是否开启自动在kibana中生成Dashboard（1为开启，0为不开启，默认为0）</p>
     */
    public Long getEnableDashboard() {
        return this.EnableDashboard;
    }

    /**
     * Set <p>采集器输出到ES实例时，是否开启自动在kibana中生成Dashboard（1为开启，0为不开启，默认为0）</p>
     * @param EnableDashboard <p>采集器输出到ES实例时，是否开启自动在kibana中生成Dashboard（1为开启，0为不开启，默认为0）</p>
     */
    public void setEnableDashboard(Long EnableDashboard) {
        this.EnableDashboard = EnableDashboard;
    }

    /**
     * Get <p>Ckafka实例的vip</p> 
     * @return KafkaEndpoint <p>Ckafka实例的vip</p>
     */
    public String getKafkaEndpoint() {
        return this.KafkaEndpoint;
    }

    /**
     * Set <p>Ckafka实例的vip</p>
     * @param KafkaEndpoint <p>Ckafka实例的vip</p>
     */
    public void setKafkaEndpoint(String KafkaEndpoint) {
        this.KafkaEndpoint = KafkaEndpoint;
    }

    /**
     * Get <p>Ckafka实例中的Topic</p> 
     * @return KafkaTopic <p>Ckafka实例中的Topic</p>
     */
    public String getKafkaTopic() {
        return this.KafkaTopic;
    }

    /**
     * Set <p>Ckafka实例中的Topic</p>
     * @param KafkaTopic <p>Ckafka实例中的Topic</p>
     */
    public void setKafkaTopic(String KafkaTopic) {
        this.KafkaTopic = KafkaTopic;
    }

    /**
     * Get <p>Ckafka实例的版本号</p> 
     * @return KafkaVersion <p>Ckafka实例的版本号</p>
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set <p>Ckafka实例的版本号</p>
     * @param KafkaVersion <p>Ckafka实例的版本号</p>
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get <p>topic id</p> 
     * @return SesTopicId <p>topic id</p>
     */
    public String getSesTopicId() {
        return this.SesTopicId;
    }

    /**
     * Set <p>topic id</p>
     * @param SesTopicId <p>topic id</p>
     */
    public void setSesTopicId(String SesTopicId) {
        this.SesTopicId = SesTopicId;
    }

    /**
     * Get <p>topic name</p> 
     * @return SesTopicName <p>topic name</p>
     */
    public String getSesTopicName() {
        return this.SesTopicName;
    }

    /**
     * Set <p>topic name</p>
     * @param SesTopicName <p>topic name</p>
     */
    public void setSesTopicName(String SesTopicName) {
        this.SesTopicName = SesTopicName;
    }

    /**
     * Get <p>topic address</p> 
     * @return SesTopicAddress <p>topic address</p>
     */
    public String getSesTopicAddress() {
        return this.SesTopicAddress;
    }

    /**
     * Set <p>topic address</p>
     * @param SesTopicAddress <p>topic address</p>
     */
    public void setSesTopicAddress(String SesTopicAddress) {
        this.SesTopicAddress = SesTopicAddress;
    }

    /**
     * Get <p>/</p> 
     * @return SesTopicUserName <p>/</p>
     */
    public String getSesTopicUserName() {
        return this.SesTopicUserName;
    }

    /**
     * Set <p>/</p>
     * @param SesTopicUserName <p>/</p>
     */
    public void setSesTopicUserName(String SesTopicUserName) {
        this.SesTopicUserName = SesTopicUserName;
    }

    /**
     * Get <p>/</p> 
     * @return SesTopicPasswd <p>/</p>
     */
    public String getSesTopicPasswd() {
        return this.SesTopicPasswd;
    }

    /**
     * Set <p>/</p>
     * @param SesTopicPasswd <p>/</p>
     */
    public void setSesTopicPasswd(String SesTopicPasswd) {
        this.SesTopicPasswd = SesTopicPasswd;
    }

    /**
     * Get <p>/</p> 
     * @return LogstashListenPort <p>/</p>
     */
    public Long getLogstashListenPort() {
        return this.LogstashListenPort;
    }

    /**
     * Set <p>/</p>
     * @param LogstashListenPort <p>/</p>
     */
    public void setLogstashListenPort(Long LogstashListenPort) {
        this.LogstashListenPort = LogstashListenPort;
    }

    /**
     * Get <p>serverless 的 spaceid</p> 
     * @return SesSpaceId <p>serverless 的 spaceid</p>
     */
    public String getSesSpaceId() {
        return this.SesSpaceId;
    }

    /**
     * Set <p>serverless 的 spaceid</p>
     * @param SesSpaceId <p>serverless 的 spaceid</p>
     */
    public void setSesSpaceId(String SesSpaceId) {
        this.SesSpaceId = SesSpaceId;
    }

    public CollectorOutputInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CollectorOutputInstance(CollectorOutputInstance source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ESUserName != null) {
            this.ESUserName = new String(source.ESUserName);
        }
        if (source.ESUserPasswd != null) {
            this.ESUserPasswd = new String(source.ESUserPasswd);
        }
        if (source.EnableMonitoring != null) {
            this.EnableMonitoring = new Long(source.EnableMonitoring);
        }
        if (source.EnableDashboard != null) {
            this.EnableDashboard = new Long(source.EnableDashboard);
        }
        if (source.KafkaEndpoint != null) {
            this.KafkaEndpoint = new String(source.KafkaEndpoint);
        }
        if (source.KafkaTopic != null) {
            this.KafkaTopic = new String(source.KafkaTopic);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.SesTopicId != null) {
            this.SesTopicId = new String(source.SesTopicId);
        }
        if (source.SesTopicName != null) {
            this.SesTopicName = new String(source.SesTopicName);
        }
        if (source.SesTopicAddress != null) {
            this.SesTopicAddress = new String(source.SesTopicAddress);
        }
        if (source.SesTopicUserName != null) {
            this.SesTopicUserName = new String(source.SesTopicUserName);
        }
        if (source.SesTopicPasswd != null) {
            this.SesTopicPasswd = new String(source.SesTopicPasswd);
        }
        if (source.LogstashListenPort != null) {
            this.LogstashListenPort = new Long(source.LogstashListenPort);
        }
        if (source.SesSpaceId != null) {
            this.SesSpaceId = new String(source.SesSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ESUserName", this.ESUserName);
        this.setParamSimple(map, prefix + "ESUserPasswd", this.ESUserPasswd);
        this.setParamSimple(map, prefix + "EnableMonitoring", this.EnableMonitoring);
        this.setParamSimple(map, prefix + "EnableDashboard", this.EnableDashboard);
        this.setParamSimple(map, prefix + "KafkaEndpoint", this.KafkaEndpoint);
        this.setParamSimple(map, prefix + "KafkaTopic", this.KafkaTopic);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "SesTopicId", this.SesTopicId);
        this.setParamSimple(map, prefix + "SesTopicName", this.SesTopicName);
        this.setParamSimple(map, prefix + "SesTopicAddress", this.SesTopicAddress);
        this.setParamSimple(map, prefix + "SesTopicUserName", this.SesTopicUserName);
        this.setParamSimple(map, prefix + "SesTopicPasswd", this.SesTopicPasswd);
        this.setParamSimple(map, prefix + "LogstashListenPort", this.LogstashListenPort);
        this.setParamSimple(map, prefix + "SesSpaceId", this.SesSpaceId);

    }
}

