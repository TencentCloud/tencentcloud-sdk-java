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
    * 采集器输出的实例类型（支持elasticsearch、logstash）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 采集器输出的实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 采集器输出到的ES实例的用户名
    */
    @SerializedName("ESUserName")
    @Expose
    private String ESUserName;

    /**
    * 采集器输出到的ES实例的密码
    */
    @SerializedName("ESUserPasswd")
    @Expose
    private String ESUserPasswd;

    /**
    * 采集器输出到ES实例时，是否开启监控（1为开启，0为不开启，默认为0）
    */
    @SerializedName("EnableMonitoring")
    @Expose
    private Long EnableMonitoring;

    /**
    * 采集器输出到ES实例时，是否开启自动在kibana中生成Dashboard（1为开启，0为不开启，默认为0）
    */
    @SerializedName("EnableDashboard")
    @Expose
    private Long EnableDashboard;

    /**
    * Ckafka实例的vip
    */
    @SerializedName("KafkaEndpoint")
    @Expose
    private String KafkaEndpoint;

    /**
    * Ckafka实例中的Topic
    */
    @SerializedName("KafkaTopic")
    @Expose
    private String KafkaTopic;

    /**
    * Ckafka实例的版本号
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * topic id
    */
    @SerializedName("SesTopicId")
    @Expose
    private String SesTopicId;

    /**
    * topic name
    */
    @SerializedName("SesTopicName")
    @Expose
    private String SesTopicName;

    /**
    * topic address
    */
    @SerializedName("SesTopicAddress")
    @Expose
    private String SesTopicAddress;

    /**
    * /
    */
    @SerializedName("SesTopicUserName")
    @Expose
    private String SesTopicUserName;

    /**
    * /
    */
    @SerializedName("SesTopicPasswd")
    @Expose
    private String SesTopicPasswd;

    /**
    * /
    */
    @SerializedName("LogstashListenPort")
    @Expose
    private Long LogstashListenPort;

    /**
     * Get 采集器输出的实例类型（支持elasticsearch、logstash） 
     * @return Type 采集器输出的实例类型（支持elasticsearch、logstash）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 采集器输出的实例类型（支持elasticsearch、logstash）
     * @param Type 采集器输出的实例类型（支持elasticsearch、logstash）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 采集器输出的实例ID 
     * @return InstanceId 采集器输出的实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 采集器输出的实例ID
     * @param InstanceId 采集器输出的实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 采集器输出到的ES实例的用户名 
     * @return ESUserName 采集器输出到的ES实例的用户名
     */
    public String getESUserName() {
        return this.ESUserName;
    }

    /**
     * Set 采集器输出到的ES实例的用户名
     * @param ESUserName 采集器输出到的ES实例的用户名
     */
    public void setESUserName(String ESUserName) {
        this.ESUserName = ESUserName;
    }

    /**
     * Get 采集器输出到的ES实例的密码 
     * @return ESUserPasswd 采集器输出到的ES实例的密码
     */
    public String getESUserPasswd() {
        return this.ESUserPasswd;
    }

    /**
     * Set 采集器输出到的ES实例的密码
     * @param ESUserPasswd 采集器输出到的ES实例的密码
     */
    public void setESUserPasswd(String ESUserPasswd) {
        this.ESUserPasswd = ESUserPasswd;
    }

    /**
     * Get 采集器输出到ES实例时，是否开启监控（1为开启，0为不开启，默认为0） 
     * @return EnableMonitoring 采集器输出到ES实例时，是否开启监控（1为开启，0为不开启，默认为0）
     */
    public Long getEnableMonitoring() {
        return this.EnableMonitoring;
    }

    /**
     * Set 采集器输出到ES实例时，是否开启监控（1为开启，0为不开启，默认为0）
     * @param EnableMonitoring 采集器输出到ES实例时，是否开启监控（1为开启，0为不开启，默认为0）
     */
    public void setEnableMonitoring(Long EnableMonitoring) {
        this.EnableMonitoring = EnableMonitoring;
    }

    /**
     * Get 采集器输出到ES实例时，是否开启自动在kibana中生成Dashboard（1为开启，0为不开启，默认为0） 
     * @return EnableDashboard 采集器输出到ES实例时，是否开启自动在kibana中生成Dashboard（1为开启，0为不开启，默认为0）
     */
    public Long getEnableDashboard() {
        return this.EnableDashboard;
    }

    /**
     * Set 采集器输出到ES实例时，是否开启自动在kibana中生成Dashboard（1为开启，0为不开启，默认为0）
     * @param EnableDashboard 采集器输出到ES实例时，是否开启自动在kibana中生成Dashboard（1为开启，0为不开启，默认为0）
     */
    public void setEnableDashboard(Long EnableDashboard) {
        this.EnableDashboard = EnableDashboard;
    }

    /**
     * Get Ckafka实例的vip 
     * @return KafkaEndpoint Ckafka实例的vip
     */
    public String getKafkaEndpoint() {
        return this.KafkaEndpoint;
    }

    /**
     * Set Ckafka实例的vip
     * @param KafkaEndpoint Ckafka实例的vip
     */
    public void setKafkaEndpoint(String KafkaEndpoint) {
        this.KafkaEndpoint = KafkaEndpoint;
    }

    /**
     * Get Ckafka实例中的Topic 
     * @return KafkaTopic Ckafka实例中的Topic
     */
    public String getKafkaTopic() {
        return this.KafkaTopic;
    }

    /**
     * Set Ckafka实例中的Topic
     * @param KafkaTopic Ckafka实例中的Topic
     */
    public void setKafkaTopic(String KafkaTopic) {
        this.KafkaTopic = KafkaTopic;
    }

    /**
     * Get Ckafka实例的版本号 
     * @return KafkaVersion Ckafka实例的版本号
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set Ckafka实例的版本号
     * @param KafkaVersion Ckafka实例的版本号
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get topic id 
     * @return SesTopicId topic id
     */
    public String getSesTopicId() {
        return this.SesTopicId;
    }

    /**
     * Set topic id
     * @param SesTopicId topic id
     */
    public void setSesTopicId(String SesTopicId) {
        this.SesTopicId = SesTopicId;
    }

    /**
     * Get topic name 
     * @return SesTopicName topic name
     */
    public String getSesTopicName() {
        return this.SesTopicName;
    }

    /**
     * Set topic name
     * @param SesTopicName topic name
     */
    public void setSesTopicName(String SesTopicName) {
        this.SesTopicName = SesTopicName;
    }

    /**
     * Get topic address 
     * @return SesTopicAddress topic address
     */
    public String getSesTopicAddress() {
        return this.SesTopicAddress;
    }

    /**
     * Set topic address
     * @param SesTopicAddress topic address
     */
    public void setSesTopicAddress(String SesTopicAddress) {
        this.SesTopicAddress = SesTopicAddress;
    }

    /**
     * Get / 
     * @return SesTopicUserName /
     */
    public String getSesTopicUserName() {
        return this.SesTopicUserName;
    }

    /**
     * Set /
     * @param SesTopicUserName /
     */
    public void setSesTopicUserName(String SesTopicUserName) {
        this.SesTopicUserName = SesTopicUserName;
    }

    /**
     * Get / 
     * @return SesTopicPasswd /
     */
    public String getSesTopicPasswd() {
        return this.SesTopicPasswd;
    }

    /**
     * Set /
     * @param SesTopicPasswd /
     */
    public void setSesTopicPasswd(String SesTopicPasswd) {
        this.SesTopicPasswd = SesTopicPasswd;
    }

    /**
     * Get / 
     * @return LogstashListenPort /
     */
    public Long getLogstashListenPort() {
        return this.LogstashListenPort;
    }

    /**
     * Set /
     * @param LogstashListenPort /
     */
    public void setLogstashListenPort(Long LogstashListenPort) {
        this.LogstashListenPort = LogstashListenPort;
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

    }
}

