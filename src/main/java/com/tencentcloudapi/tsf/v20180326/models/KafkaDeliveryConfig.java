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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaDeliveryConfig extends AbstractModel{

    /**
    * 配置项id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 配置名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 采集路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectPath")
    @Expose
    private String [] CollectPath;

    /**
    * kafka vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaVIp")
    @Expose
    private String KafkaVIp;

    /**
    * kafka vport
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaVPort")
    @Expose
    private String KafkaVPort;

    /**
    * kafka topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 换行规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LineRule")
    @Expose
    private String LineRule;

    /**
     * Get 配置项id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigId 配置项id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置项id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigId 配置项id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 配置名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigName 配置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigName 配置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 采集路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectPath 采集路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCollectPath() {
        return this.CollectPath;
    }

    /**
     * Set 采集路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectPath 采集路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectPath(String [] CollectPath) {
        this.CollectPath = CollectPath;
    }

    /**
     * Get kafka vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaVIp kafka vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaVIp() {
        return this.KafkaVIp;
    }

    /**
     * Set kafka vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaVIp kafka vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaVIp(String KafkaVIp) {
        this.KafkaVIp = KafkaVIp;
    }

    /**
     * Get kafka vport
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaVPort kafka vport
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaVPort() {
        return this.KafkaVPort;
    }

    /**
     * Set kafka vport
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaVPort kafka vport
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaVPort(String KafkaVPort) {
        this.KafkaVPort = KafkaVPort;
    }

    /**
     * Get kafka topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 换行规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LineRule 换行规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLineRule() {
        return this.LineRule;
    }

    /**
     * Set 换行规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param LineRule 换行规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLineRule(String LineRule) {
        this.LineRule = LineRule;
    }

    public KafkaDeliveryConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaDeliveryConfig(KafkaDeliveryConfig source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.CollectPath != null) {
            this.CollectPath = new String[source.CollectPath.length];
            for (int i = 0; i < source.CollectPath.length; i++) {
                this.CollectPath[i] = new String(source.CollectPath[i]);
            }
        }
        if (source.KafkaVIp != null) {
            this.KafkaVIp = new String(source.KafkaVIp);
        }
        if (source.KafkaVPort != null) {
            this.KafkaVPort = new String(source.KafkaVPort);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.LineRule != null) {
            this.LineRule = new String(source.LineRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamArraySimple(map, prefix + "CollectPath.", this.CollectPath);
        this.setParamSimple(map, prefix + "KafkaVIp", this.KafkaVIp);
        this.setParamSimple(map, prefix + "KafkaVPort", this.KafkaVPort);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "LineRule", this.LineRule);

    }
}

