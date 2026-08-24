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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwConsumer extends AbstractModel {

    /**
    * <p>消费者 ID。</p>
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * <p>名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>消费者优先级</p><p>枚举值：</p><ul><li>High： 高优</li><li>Medium： 中优</li><li>Low： 低优</li></ul>
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>消费者分组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerGroups")
    @Expose
    private CNAPIGwConsumerGroup [] ConsumerGroups;

    /**
    * <p>同步状态</p><p>枚举值：</p><ul><li>Fail： 失败</li></ul>
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * <p>资源类型</p><p>枚举值：</p><ul><li>ModelService： 模型服务</li><li>Consumer： 消费者</li><li>SecretKey： 密钥</li></ul>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>同步版本</p>
    */
    @SerializedName("SyncedVersion")
    @Expose
    private String SyncedVersion;

    /**
     * Get <p>消费者 ID。</p> 
     * @return ConsumerId <p>消费者 ID。</p>
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set <p>消费者 ID。</p>
     * @param ConsumerId <p>消费者 ID。</p>
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get <p>名字</p> 
     * @return Name <p>名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名字</p>
     * @param Name <p>名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间 yyyy-MM-dd hh:mm:ss</p> 
     * @return ModifyTime <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
     * @param ModifyTime <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>消费者优先级</p><p>枚举值：</p><ul><li>High： 高优</li><li>Medium： 中优</li><li>Low： 低优</li></ul> 
     * @return Priority <p>消费者优先级</p><p>枚举值：</p><ul><li>High： 高优</li><li>Medium： 中优</li><li>Low： 低优</li></ul>
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>消费者优先级</p><p>枚举值：</p><ul><li>High： 高优</li><li>Medium： 中优</li><li>Low： 低优</li></ul>
     * @param Priority <p>消费者优先级</p><p>枚举值：</p><ul><li>High： 高优</li><li>Medium： 中优</li><li>Low： 低优</li></ul>
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>消费者分组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerGroups <p>消费者分组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CNAPIGwConsumerGroup [] getConsumerGroups() {
        return this.ConsumerGroups;
    }

    /**
     * Set <p>消费者分组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerGroups <p>消费者分组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerGroups(CNAPIGwConsumerGroup [] ConsumerGroups) {
        this.ConsumerGroups = ConsumerGroups;
    }

    /**
     * Get <p>同步状态</p><p>枚举值：</p><ul><li>Fail： 失败</li></ul> 
     * @return SyncStatus <p>同步状态</p><p>枚举值：</p><ul><li>Fail： 失败</li></ul>
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>同步状态</p><p>枚举值：</p><ul><li>Fail： 失败</li></ul>
     * @param SyncStatus <p>同步状态</p><p>枚举值：</p><ul><li>Fail： 失败</li></ul>
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get <p>资源类型</p><p>枚举值：</p><ul><li>ModelService： 模型服务</li><li>Consumer： 消费者</li><li>SecretKey： 密钥</li></ul> 
     * @return SourceType <p>资源类型</p><p>枚举值：</p><ul><li>ModelService： 模型服务</li><li>Consumer： 消费者</li><li>SecretKey： 密钥</li></ul>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>资源类型</p><p>枚举值：</p><ul><li>ModelService： 模型服务</li><li>Consumer： 消费者</li><li>SecretKey： 密钥</li></ul>
     * @param SourceType <p>资源类型</p><p>枚举值：</p><ul><li>ModelService： 模型服务</li><li>Consumer： 消费者</li><li>SecretKey： 密钥</li></ul>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>同步版本</p> 
     * @return SyncedVersion <p>同步版本</p>
     */
    public String getSyncedVersion() {
        return this.SyncedVersion;
    }

    /**
     * Set <p>同步版本</p>
     * @param SyncedVersion <p>同步版本</p>
     */
    public void setSyncedVersion(String SyncedVersion) {
        this.SyncedVersion = SyncedVersion;
    }

    public CNAPIGwConsumer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwConsumer(CNAPIGwConsumer source) {
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Priority != null) {
            this.Priority = new String(source.Priority);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConsumerGroups != null) {
            this.ConsumerGroups = new CNAPIGwConsumerGroup[source.ConsumerGroups.length];
            for (int i = 0; i < source.ConsumerGroups.length; i++) {
                this.ConsumerGroups[i] = new CNAPIGwConsumerGroup(source.ConsumerGroups[i]);
            }
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new String(source.SyncStatus);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SyncedVersion != null) {
            this.SyncedVersion = new String(source.SyncedVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ConsumerGroups.", this.ConsumerGroups);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SyncedVersion", this.SyncedVersion);

    }
}

