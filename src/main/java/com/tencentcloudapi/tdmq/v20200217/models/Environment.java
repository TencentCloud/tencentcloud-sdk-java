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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Environment extends AbstractModel{

    /**
    * 命名空间名称
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 未消费消息过期时间，单位：秒，最大1296000（15天）
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Topic数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * 消息保留策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionPolicy")
    @Expose
    private RetentionPolicy RetentionPolicy;

    /**
     * Get 命名空间名称 
     * @return EnvironmentId 命名空间名称
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 命名空间名称
     * @param EnvironmentId 命名空间名称
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 说明 
     * @return Remark 说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明
     * @param Remark 说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 未消费消息过期时间，单位：秒，最大1296000（15天） 
     * @return MsgTTL 未消费消息过期时间，单位：秒，最大1296000（15天）
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set 未消费消息过期时间，单位：秒，最大1296000（15天）
     * @param MsgTTL 未消费消息过期时间，单位：秒，最大1296000（15天）
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近修改时间 
     * @return UpdateTime 最近修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近修改时间
     * @param UpdateTime 最近修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Topic数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicNum Topic数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set Topic数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicNum Topic数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get 消息保留策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionPolicy 消息保留策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RetentionPolicy getRetentionPolicy() {
        return this.RetentionPolicy;
    }

    /**
     * Set 消息保留策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionPolicy 消息保留策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionPolicy(RetentionPolicy RetentionPolicy) {
        this.RetentionPolicy = RetentionPolicy;
    }

    public Environment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Environment(Environment source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.RetentionPolicy != null) {
            this.RetentionPolicy = new RetentionPolicy(source.RetentionPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamObj(map, prefix + "RetentionPolicy.", this.RetentionPolicy);

    }
}

