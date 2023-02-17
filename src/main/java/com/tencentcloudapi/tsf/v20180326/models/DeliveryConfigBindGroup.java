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

public class DeliveryConfigBindGroup extends AbstractModel{

    /**
    * 配置id
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 配置名
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
    * 关联部署组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Groups")
    @Expose
    private GroupInfo [] Groups;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * KafkaVIp
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaVIp")
    @Expose
    private String KafkaVIp;

    /**
    * KafkaAddress
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaAddress")
    @Expose
    private String KafkaAddress;

    /**
    * KafkaVPort
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaVPort")
    @Expose
    private String KafkaVPort;

    /**
    * Topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * LineRule
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LineRule")
    @Expose
    private String LineRule;

    /**
    * CustomRule
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomRule")
    @Expose
    private String CustomRule;

    /**
    * EnableGlobalLineRule
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableGlobalLineRule")
    @Expose
    private Boolean EnableGlobalLineRule;

    /**
    * EnableAuth
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableAuth")
    @Expose
    private Boolean EnableAuth;

    /**
    * Username
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Password
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * KafkaInfos
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaInfos")
    @Expose
    private DeliveryKafkaInfo [] KafkaInfos;

    /**
     * Get 配置id 
     * @return ConfigId 配置id
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置id
     * @param ConfigId 配置id
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 配置名 
     * @return ConfigName 配置名
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置名
     * @param ConfigName 配置名
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
     * Get 关联部署组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Groups 关联部署组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GroupInfo [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 关联部署组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Groups 关联部署组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroups(GroupInfo [] Groups) {
        this.Groups = Groups;
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
     * Get KafkaVIp
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaVIp KafkaVIp
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaVIp() {
        return this.KafkaVIp;
    }

    /**
     * Set KafkaVIp
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaVIp KafkaVIp
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaVIp(String KafkaVIp) {
        this.KafkaVIp = KafkaVIp;
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

    /**
     * Get KafkaVPort
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaVPort KafkaVPort
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaVPort() {
        return this.KafkaVPort;
    }

    /**
     * Set KafkaVPort
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaVPort KafkaVPort
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaVPort(String KafkaVPort) {
        this.KafkaVPort = KafkaVPort;
    }

    /**
     * Get Topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic Topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic Topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get LineRule
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LineRule LineRule
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLineRule() {
        return this.LineRule;
    }

    /**
     * Set LineRule
注意：此字段可能返回 null，表示取不到有效值。
     * @param LineRule LineRule
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLineRule(String LineRule) {
        this.LineRule = LineRule;
    }

    /**
     * Get CustomRule
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomRule CustomRule
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set CustomRule
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomRule CustomRule
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomRule(String CustomRule) {
        this.CustomRule = CustomRule;
    }

    /**
     * Get EnableGlobalLineRule
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableGlobalLineRule EnableGlobalLineRule
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableGlobalLineRule() {
        return this.EnableGlobalLineRule;
    }

    /**
     * Set EnableGlobalLineRule
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableGlobalLineRule EnableGlobalLineRule
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableGlobalLineRule(Boolean EnableGlobalLineRule) {
        this.EnableGlobalLineRule = EnableGlobalLineRule;
    }

    /**
     * Get EnableAuth
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableAuth EnableAuth
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableAuth() {
        return this.EnableAuth;
    }

    /**
     * Set EnableAuth
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableAuth EnableAuth
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableAuth(Boolean EnableAuth) {
        this.EnableAuth = EnableAuth;
    }

    /**
     * Get Username
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Username Username
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username
注意：此字段可能返回 null，表示取不到有效值。
     * @param Username Username
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Password
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password Password
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password Password
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get KafkaInfos
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaInfos KafkaInfos
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeliveryKafkaInfo [] getKafkaInfos() {
        return this.KafkaInfos;
    }

    /**
     * Set KafkaInfos
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaInfos KafkaInfos
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaInfos(DeliveryKafkaInfo [] KafkaInfos) {
        this.KafkaInfos = KafkaInfos;
    }

    public DeliveryConfigBindGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliveryConfigBindGroup(DeliveryConfigBindGroup source) {
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
        if (source.Groups != null) {
            this.Groups = new GroupInfo[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new GroupInfo(source.Groups[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.KafkaVIp != null) {
            this.KafkaVIp = new String(source.KafkaVIp);
        }
        if (source.KafkaAddress != null) {
            this.KafkaAddress = new String(source.KafkaAddress);
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
        if (source.CustomRule != null) {
            this.CustomRule = new String(source.CustomRule);
        }
        if (source.EnableGlobalLineRule != null) {
            this.EnableGlobalLineRule = new Boolean(source.EnableGlobalLineRule);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamArraySimple(map, prefix + "CollectPath.", this.CollectPath);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "KafkaVIp", this.KafkaVIp);
        this.setParamSimple(map, prefix + "KafkaAddress", this.KafkaAddress);
        this.setParamSimple(map, prefix + "KafkaVPort", this.KafkaVPort);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "LineRule", this.LineRule);
        this.setParamSimple(map, prefix + "CustomRule", this.CustomRule);
        this.setParamSimple(map, prefix + "EnableGlobalLineRule", this.EnableGlobalLineRule);
        this.setParamSimple(map, prefix + "EnableAuth", this.EnableAuth);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "KafkaInfos.", this.KafkaInfos);

    }
}

