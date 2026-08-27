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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Producer extends AbstractModel {

    /**
    * 转发协议类型，0-stormRetPb, 1-tcbDispensePb, 2-stormRetJson, 3-ADPPb(废弃)，4-中台pb
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtocolType")
    @Expose
    private Long ProtocolType;

    /**
    * 目标类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 转发kafka地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Brokers")
    @Expose
    private String Brokers;

    /**
    * 转发kafka topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 是否合并指标,默认是1，合并
    */
    @SerializedName("Merge")
    @Expose
    private Long Merge;

    /**
    * 全局维度组
    */
    @SerializedName("GlobalTags")
    @Expose
    private DispenseGlobalTag [] GlobalTags;

    /**
    * 默认维度组，只提供维度即可
    */
    @SerializedName("DefaultTags")
    @Expose
    private String [] DefaultTags;

    /**
    * Kafka用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Kafka密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 转发协议类型，0-stormRetPb, 1-tcbDispensePb, 2-stormRetJson, 3-ADPPb(废弃)，4-中台pb
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtocolType 转发协议类型，0-stormRetPb, 1-tcbDispensePb, 2-stormRetJson, 3-ADPPb(废弃)，4-中台pb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 转发协议类型，0-stormRetPb, 1-tcbDispensePb, 2-stormRetJson, 3-ADPPb(废弃)，4-中台pb
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtocolType 转发协议类型，0-stormRetPb, 1-tcbDispensePb, 2-stormRetJson, 3-ADPPb(废弃)，4-中台pb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocolType(Long ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 目标类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 目标类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 目标类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 目标类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 转发kafka地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Brokers 转发kafka地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokers() {
        return this.Brokers;
    }

    /**
     * Set 转发kafka地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Brokers 转发kafka地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokers(String Brokers) {
        this.Brokers = Brokers;
    }

    /**
     * Get 转发kafka topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic 转发kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 转发kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic 转发kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 是否合并指标,默认是1，合并 
     * @return Merge 是否合并指标,默认是1，合并
     */
    public Long getMerge() {
        return this.Merge;
    }

    /**
     * Set 是否合并指标,默认是1，合并
     * @param Merge 是否合并指标,默认是1，合并
     */
    public void setMerge(Long Merge) {
        this.Merge = Merge;
    }

    /**
     * Get 全局维度组 
     * @return GlobalTags 全局维度组
     */
    public DispenseGlobalTag [] getGlobalTags() {
        return this.GlobalTags;
    }

    /**
     * Set 全局维度组
     * @param GlobalTags 全局维度组
     */
    public void setGlobalTags(DispenseGlobalTag [] GlobalTags) {
        this.GlobalTags = GlobalTags;
    }

    /**
     * Get 默认维度组，只提供维度即可 
     * @return DefaultTags 默认维度组，只提供维度即可
     */
    public String [] getDefaultTags() {
        return this.DefaultTags;
    }

    /**
     * Set 默认维度组，只提供维度即可
     * @param DefaultTags 默认维度组，只提供维度即可
     */
    public void setDefaultTags(String [] DefaultTags) {
        this.DefaultTags = DefaultTags;
    }

    /**
     * Get Kafka用户名 
     * @return Username Kafka用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Kafka用户名
     * @param Username Kafka用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Kafka密码 
     * @return Password Kafka密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Kafka密码
     * @param Password Kafka密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Producer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Producer(Producer source) {
        if (source.ProtocolType != null) {
            this.ProtocolType = new Long(source.ProtocolType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Brokers != null) {
            this.Brokers = new String(source.Brokers);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Merge != null) {
            this.Merge = new Long(source.Merge);
        }
        if (source.GlobalTags != null) {
            this.GlobalTags = new DispenseGlobalTag[source.GlobalTags.length];
            for (int i = 0; i < source.GlobalTags.length; i++) {
                this.GlobalTags[i] = new DispenseGlobalTag(source.GlobalTags[i]);
            }
        }
        if (source.DefaultTags != null) {
            this.DefaultTags = new String[source.DefaultTags.length];
            for (int i = 0; i < source.DefaultTags.length; i++) {
                this.DefaultTags[i] = new String(source.DefaultTags[i]);
            }
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Brokers", this.Brokers);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Merge", this.Merge);
        this.setParamArrayObj(map, prefix + "GlobalTags.", this.GlobalTags);
        this.setParamArraySimple(map, prefix + "DefaultTags.", this.DefaultTags);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

