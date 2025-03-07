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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProjectRequest extends AbstractModel {

    /**
    * 项目 id
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 应用名称(可选，不为空且最长为 200字符)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目网页地址(可选，最长为 256)
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * 项目仓库地址(可选，最长为 256)
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * 项目需要转移到的实例 id(可选)
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 项目采样率(可选)
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * 是否开启聚类(可选)
    */
    @SerializedName("EnableURLGroup")
    @Expose
    private Long EnableURLGroup;

    /**
    * 项目类型(可接受值为 "web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 应用描述(可选，最长为 1000字符)
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 启动kafka配置
    */
    @SerializedName("EnableKafka")
    @Expose
    private Long EnableKafka;

    /**
    * kafka_host
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
    * kafka_version
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * kafka_username
    */
    @SerializedName("SaslUserName")
    @Expose
    private String SaslUserName;

    /**
    * kafka_pwd
    */
    @SerializedName("SaslPassword")
    @Expose
    private String SaslPassword;

    /**
    * SaslMechanism
    */
    @SerializedName("SaslMechanism")
    @Expose
    private String SaslMechanism;

    /**
    * sink_id，日知汇算子id
    */
    @SerializedName("SinkId")
    @Expose
    private Long SinkId;

    /**
     * Get 项目 id 
     * @return ID 项目 id
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 项目 id
     * @param ID 项目 id
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 应用名称(可选，不为空且最长为 200字符) 
     * @return Name 应用名称(可选，不为空且最长为 200字符)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称(可选，不为空且最长为 200字符)
     * @param Name 应用名称(可选，不为空且最长为 200字符)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 项目网页地址(可选，最长为 256) 
     * @return URL 项目网页地址(可选，最长为 256)
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 项目网页地址(可选，最长为 256)
     * @param URL 项目网页地址(可选，最长为 256)
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get 项目仓库地址(可选，最长为 256) 
     * @return Repo 项目仓库地址(可选，最长为 256)
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set 项目仓库地址(可选，最长为 256)
     * @param Repo 项目仓库地址(可选，最长为 256)
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get 项目需要转移到的实例 id(可选) 
     * @return InstanceID 项目需要转移到的实例 id(可选)
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 项目需要转移到的实例 id(可选)
     * @param InstanceID 项目需要转移到的实例 id(可选)
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 项目采样率(可选) 
     * @return Rate 项目采样率(可选)
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set 项目采样率(可选)
     * @param Rate 项目采样率(可选)
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 是否开启聚类(可选) 
     * @return EnableURLGroup 是否开启聚类(可选)
     */
    public Long getEnableURLGroup() {
        return this.EnableURLGroup;
    }

    /**
     * Set 是否开启聚类(可选)
     * @param EnableURLGroup 是否开启聚类(可选)
     */
    public void setEnableURLGroup(Long EnableURLGroup) {
        this.EnableURLGroup = EnableURLGroup;
    }

    /**
     * Get 项目类型(可接受值为 "web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn") 
     * @return Type 项目类型(可接受值为 "web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 项目类型(可接受值为 "web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
     * @param Type 项目类型(可接受值为 "web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 应用描述(可选，最长为 1000字符) 
     * @return Desc 应用描述(可选，最长为 1000字符)
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 应用描述(可选，最长为 1000字符)
     * @param Desc 应用描述(可选，最长为 1000字符)
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 启动kafka配置 
     * @return EnableKafka 启动kafka配置
     */
    public Long getEnableKafka() {
        return this.EnableKafka;
    }

    /**
     * Set 启动kafka配置
     * @param EnableKafka 启动kafka配置
     */
    public void setEnableKafka(Long EnableKafka) {
        this.EnableKafka = EnableKafka;
    }

    /**
     * Get kafka_host 
     * @return KafkaHost kafka_host
     */
    public String getKafkaHost() {
        return this.KafkaHost;
    }

    /**
     * Set kafka_host
     * @param KafkaHost kafka_host
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
     * Get kafka_version 
     * @return KafkaVersion kafka_version
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set kafka_version
     * @param KafkaVersion kafka_version
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get kafka_username 
     * @return SaslUserName kafka_username
     */
    public String getSaslUserName() {
        return this.SaslUserName;
    }

    /**
     * Set kafka_username
     * @param SaslUserName kafka_username
     */
    public void setSaslUserName(String SaslUserName) {
        this.SaslUserName = SaslUserName;
    }

    /**
     * Get kafka_pwd 
     * @return SaslPassword kafka_pwd
     */
    public String getSaslPassword() {
        return this.SaslPassword;
    }

    /**
     * Set kafka_pwd
     * @param SaslPassword kafka_pwd
     */
    public void setSaslPassword(String SaslPassword) {
        this.SaslPassword = SaslPassword;
    }

    /**
     * Get SaslMechanism 
     * @return SaslMechanism SaslMechanism
     */
    public String getSaslMechanism() {
        return this.SaslMechanism;
    }

    /**
     * Set SaslMechanism
     * @param SaslMechanism SaslMechanism
     */
    public void setSaslMechanism(String SaslMechanism) {
        this.SaslMechanism = SaslMechanism;
    }

    /**
     * Get sink_id，日知汇算子id 
     * @return SinkId sink_id，日知汇算子id
     */
    public Long getSinkId() {
        return this.SinkId;
    }

    /**
     * Set sink_id，日知汇算子id
     * @param SinkId sink_id，日知汇算子id
     */
    public void setSinkId(Long SinkId) {
        this.SinkId = SinkId;
    }

    public ModifyProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectRequest(ModifyProjectRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Rate != null) {
            this.Rate = new String(source.Rate);
        }
        if (source.EnableURLGroup != null) {
            this.EnableURLGroup = new Long(source.EnableURLGroup);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
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
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "EnableURLGroup", this.EnableURLGroup);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
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

