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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwConsumerGroup extends AbstractModel {

    /**
    * <p>分组id</p>
    */
    @SerializedName("ConsumerGroupId")
    @Expose
    private String ConsumerGroupId;

    /**
    * <p>名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>状态Disable/Enable</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
    * <p>绑定的消费者数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindCount")
    @Expose
    private Long BindCount;

    /**
    * <p>同步状态</p><p>枚举值：</p><ul><li>Fail： 失败</li></ul>
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * <p>资源类型</p><p>枚举值：</p><ul><li>Public： 公有</li></ul>
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
     * Get <p>分组id</p> 
     * @return ConsumerGroupId <p>分组id</p>
     */
    public String getConsumerGroupId() {
        return this.ConsumerGroupId;
    }

    /**
     * Set <p>分组id</p>
     * @param ConsumerGroupId <p>分组id</p>
     */
    public void setConsumerGroupId(String ConsumerGroupId) {
        this.ConsumerGroupId = ConsumerGroupId;
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
     * Get <p>状态Disable/Enable</p> 
     * @return Status <p>状态Disable/Enable</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态Disable/Enable</p>
     * @param Status <p>状态Disable/Enable</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>绑定的消费者数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindCount <p>绑定的消费者数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBindCount() {
        return this.BindCount;
    }

    /**
     * Set <p>绑定的消费者数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindCount <p>绑定的消费者数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindCount(Long BindCount) {
        this.BindCount = BindCount;
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
     * Get <p>资源类型</p><p>枚举值：</p><ul><li>Public： 公有</li></ul> 
     * @return SourceType <p>资源类型</p><p>枚举值：</p><ul><li>Public： 公有</li></ul>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>资源类型</p><p>枚举值：</p><ul><li>Public： 公有</li></ul>
     * @param SourceType <p>资源类型</p><p>枚举值：</p><ul><li>Public： 公有</li></ul>
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

    public CNAPIGwConsumerGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwConsumerGroup(CNAPIGwConsumerGroup source) {
        if (source.ConsumerGroupId != null) {
            this.ConsumerGroupId = new String(source.ConsumerGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.BindCount != null) {
            this.BindCount = new Long(source.BindCount);
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
        this.setParamSimple(map, prefix + "ConsumerGroupId", this.ConsumerGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "BindCount", this.BindCount);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SyncedVersion", this.SyncedVersion);

    }
}

