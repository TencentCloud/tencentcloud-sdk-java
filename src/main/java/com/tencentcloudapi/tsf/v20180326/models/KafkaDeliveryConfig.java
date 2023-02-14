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
    * 是否需要认证
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableAuth")
    @Expose
    private Boolean EnableAuth;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 投递的topic和path
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaInfos")
    @Expose
    private DeliveryKafkaInfo [] KafkaInfos;

    /**
    * 是否应用单行规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableGlobalLineRule")
    @Expose
    private Boolean EnableGlobalLineRule;

    /**
    * 自定义分行规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomRule")
    @Expose
    private String CustomRule;

    /**
    * KafkaAddress
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaAddress")
    @Expose
    private String KafkaAddress;

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

    /**
     * Get 是否需要认证
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableAuth 是否需要认证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableAuth() {
        return this.EnableAuth;
    }

    /**
     * Set 是否需要认证
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableAuth 是否需要认证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableAuth(Boolean EnableAuth) {
        this.EnableAuth = EnableAuth;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Username 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Username 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 投递的topic和path
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaInfos 投递的topic和path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeliveryKafkaInfo [] getKafkaInfos() {
        return this.KafkaInfos;
    }

    /**
     * Set 投递的topic和path
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaInfos 投递的topic和path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaInfos(DeliveryKafkaInfo [] KafkaInfos) {
        this.KafkaInfos = KafkaInfos;
    }

    /**
     * Get 是否应用单行规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableGlobalLineRule 是否应用单行规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableGlobalLineRule() {
        return this.EnableGlobalLineRule;
    }

    /**
     * Set 是否应用单行规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableGlobalLineRule 是否应用单行规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableGlobalLineRule(Boolean EnableGlobalLineRule) {
        this.EnableGlobalLineRule = EnableGlobalLineRule;
    }

    /**
     * Get 自定义分行规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomRule 自定义分行规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set 自定义分行规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomRule 自定义分行规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomRule(String CustomRule) {
        this.CustomRule = CustomRule;
    }

    /**
     * Get KafkaAddress
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaAddress KafkaAddress
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaAddress() {
        return this.KafkaAddress;
    }

    /**
     * Set KafkaAddress
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaAddress KafkaAddress
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaAddress(String KafkaAddress) {
        this.KafkaAddress = KafkaAddress;
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
        if (source.EnableAuth != null) {
            this.EnableAuth = new Boolean(source.EnableAuth);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.KafkaInfos != null) {
            this.KafkaInfos = new DeliveryKafkaInfo[source.KafkaInfos.length];
            for (int i = 0; i < source.KafkaInfos.length; i++) {
                this.KafkaInfos[i] = new DeliveryKafkaInfo(source.KafkaInfos[i]);
            }
        }
        if (source.EnableGlobalLineRule != null) {
            this.EnableGlobalLineRule = new Boolean(source.EnableGlobalLineRule);
        }
        if (source.CustomRule != null) {
            this.CustomRule = new String(source.CustomRule);
        }
        if (source.KafkaAddress != null) {
            this.KafkaAddress = new String(source.KafkaAddress);
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
        this.setParamSimple(map, prefix + "EnableAuth", this.EnableAuth);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "KafkaInfos.", this.KafkaInfos);
        this.setParamSimple(map, prefix + "EnableGlobalLineRule", this.EnableGlobalLineRule);
        this.setParamSimple(map, prefix + "CustomRule", this.CustomRule);
        this.setParamSimple(map, prefix + "KafkaAddress", this.KafkaAddress);

    }
}

