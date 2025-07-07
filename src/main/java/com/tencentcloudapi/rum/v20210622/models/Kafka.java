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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Kafka extends AbstractModel {

    /**
    * 1：开启
0：关闭
    */
    @SerializedName("EnableKafka")
    @Expose
    private Long EnableKafka;

    /**
    * host地址
    */
    @SerializedName("KafkaHost")
    @Expose
    private String KafkaHost;

    /**
    * topic
    */
    @SerializedName("KafkaTopic")
    @Expose
    private String KafkaTopic;

    /**
    * 版本
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * username
    */
    @SerializedName("SaslUserName")
    @Expose
    private String SaslUserName;

    /**
    * password
    */
    @SerializedName("SaslPassword")
    @Expose
    private String SaslPassword;

    /**
    * ssl
    */
    @SerializedName("SaslMechanism")
    @Expose
    private String SaslMechanism;

    /**
    * 默认算子id为0新增算子
一旦算子新增成功会返回正确的算子id值
    */
    @SerializedName("SinkId")
    @Expose
    private Long SinkId;

    /**
     * Get 1：开启
0：关闭 
     * @return EnableKafka 1：开启
0：关闭
     */
    public Long getEnableKafka() {
        return this.EnableKafka;
    }

    /**
     * Set 1：开启
0：关闭
     * @param EnableKafka 1：开启
0：关闭
     */
    public void setEnableKafka(Long EnableKafka) {
        this.EnableKafka = EnableKafka;
    }

    /**
     * Get host地址 
     * @return KafkaHost host地址
     */
    public String getKafkaHost() {
        return this.KafkaHost;
    }

    /**
     * Set host地址
     * @param KafkaHost host地址
     */
    public void setKafkaHost(String KafkaHost) {
        this.KafkaHost = KafkaHost;
    }

    /**
     * Get topic 
     * @return KafkaTopic topic
     */
    public String getKafkaTopic() {
        return this.KafkaTopic;
    }

    /**
     * Set topic
     * @param KafkaTopic topic
     */
    public void setKafkaTopic(String KafkaTopic) {
        this.KafkaTopic = KafkaTopic;
    }

    /**
     * Get 版本 
     * @return KafkaVersion 版本
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set 版本
     * @param KafkaVersion 版本
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get username 
     * @return SaslUserName username
     */
    public String getSaslUserName() {
        return this.SaslUserName;
    }

    /**
     * Set username
     * @param SaslUserName username
     */
    public void setSaslUserName(String SaslUserName) {
        this.SaslUserName = SaslUserName;
    }

    /**
     * Get password 
     * @return SaslPassword password
     */
    public String getSaslPassword() {
        return this.SaslPassword;
    }

    /**
     * Set password
     * @param SaslPassword password
     */
    public void setSaslPassword(String SaslPassword) {
        this.SaslPassword = SaslPassword;
    }

    /**
     * Get ssl 
     * @return SaslMechanism ssl
     */
    public String getSaslMechanism() {
        return this.SaslMechanism;
    }

    /**
     * Set ssl
     * @param SaslMechanism ssl
     */
    public void setSaslMechanism(String SaslMechanism) {
        this.SaslMechanism = SaslMechanism;
    }

    /**
     * Get 默认算子id为0新增算子
一旦算子新增成功会返回正确的算子id值 
     * @return SinkId 默认算子id为0新增算子
一旦算子新增成功会返回正确的算子id值
     */
    public Long getSinkId() {
        return this.SinkId;
    }

    /**
     * Set 默认算子id为0新增算子
一旦算子新增成功会返回正确的算子id值
     * @param SinkId 默认算子id为0新增算子
一旦算子新增成功会返回正确的算子id值
     */
    public void setSinkId(Long SinkId) {
        this.SinkId = SinkId;
    }

    public Kafka() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Kafka(Kafka source) {
        if (source.EnableKafka != null) {
            this.EnableKafka = new Long(source.EnableKafka);
        }
        if (source.KafkaHost != null) {
            this.KafkaHost = new String(source.KafkaHost);
        }
        if (source.KafkaTopic != null) {
            this.KafkaTopic = new String(source.KafkaTopic);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.SaslUserName != null) {
            this.SaslUserName = new String(source.SaslUserName);
        }
        if (source.SaslPassword != null) {
            this.SaslPassword = new String(source.SaslPassword);
        }
        if (source.SaslMechanism != null) {
            this.SaslMechanism = new String(source.SaslMechanism);
        }
        if (source.SinkId != null) {
            this.SinkId = new Long(source.SinkId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableKafka", this.EnableKafka);
        this.setParamSimple(map, prefix + "KafkaHost", this.KafkaHost);
        this.setParamSimple(map, prefix + "KafkaTopic", this.KafkaTopic);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "SaslUserName", this.SaslUserName);
        this.setParamSimple(map, prefix + "SaslPassword", this.SaslPassword);
        this.setParamSimple(map, prefix + "SaslMechanism", this.SaslMechanism);
        this.setParamSimple(map, prefix + "SinkId", this.SinkId);

    }
}

