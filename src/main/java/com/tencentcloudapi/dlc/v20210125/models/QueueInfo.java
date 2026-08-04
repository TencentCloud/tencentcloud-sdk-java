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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueueInfo extends AbstractModel {

    /**
    * <p>队列ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>队列名称</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>资源用量列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceUsage")
    @Expose
    private ResourceUsage [] ResourceUsage;

    /**
    * <p>队列描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>是否为默认队列</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * <p>队列类型：1-独占型，2-共享型</p>
    */
    @SerializedName("QueueType")
    @Expose
    private Long QueueType;

    /**
     * Get <p>队列ID</p> 
     * @return Id <p>队列ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>队列ID</p>
     * @param Id <p>队列ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>队列名称</p> 
     * @return QueueName <p>队列名称</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>队列名称</p>
     * @param QueueName <p>队列名称</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>资源用量列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceUsage <p>资源用量列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceUsage [] getResourceUsage() {
        return this.ResourceUsage;
    }

    /**
     * Set <p>资源用量列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceUsage <p>资源用量列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceUsage(ResourceUsage [] ResourceUsage) {
        this.ResourceUsage = ResourceUsage;
    }

    /**
     * Get <p>队列描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>队列描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>队列描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>队列描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>是否为默认队列</p> 
     * @return IsDefault <p>是否为默认队列</p>
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否为默认队列</p>
     * @param IsDefault <p>是否为默认队列</p>
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>队列类型：1-独占型，2-共享型</p> 
     * @return QueueType <p>队列类型：1-独占型，2-共享型</p>
     */
    public Long getQueueType() {
        return this.QueueType;
    }

    /**
     * Set <p>队列类型：1-独占型，2-共享型</p>
     * @param QueueType <p>队列类型：1-独占型，2-共享型</p>
     */
    public void setQueueType(Long QueueType) {
        this.QueueType = QueueType;
    }

    public QueueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueueInfo(QueueInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.ResourceUsage != null) {
            this.ResourceUsage = new ResourceUsage[source.ResourceUsage.length];
            for (int i = 0; i < source.ResourceUsage.length; i++) {
                this.ResourceUsage[i] = new ResourceUsage(source.ResourceUsage[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.QueueType != null) {
            this.QueueType = new Long(source.QueueType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamArrayObj(map, prefix + "ResourceUsage.", this.ResourceUsage);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);

    }
}

