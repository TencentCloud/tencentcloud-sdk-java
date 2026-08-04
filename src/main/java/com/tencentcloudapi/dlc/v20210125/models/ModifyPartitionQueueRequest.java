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

public class ModifyPartitionQueueRequest extends AbstractModel {

    /**
    * 资源队列ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 分区编码
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * 队列名称
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 队列描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 资源规格列表，定义队列的资源类型及大小范围
    */
    @SerializedName("ResourceUsages")
    @Expose
    private ResourceUsage [] ResourceUsages;

    /**
    * 队列类型：1-独占型，2-共享型
    */
    @SerializedName("QueueType")
    @Expose
    private Long QueueType;

    /**
     * Get 资源队列ID 
     * @return Id 资源队列ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 资源队列ID
     * @param Id 资源队列ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 分区编码 
     * @return PartitionCode 分区编码
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set 分区编码
     * @param PartitionCode 分区编码
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    /**
     * Get 队列名称 
     * @return QueueName 队列名称
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称
     * @param QueueName 队列名称
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 队列描述 
     * @return Description 队列描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 队列描述
     * @param Description 队列描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 资源规格列表，定义队列的资源类型及大小范围 
     * @return ResourceUsages 资源规格列表，定义队列的资源类型及大小范围
     */
    public ResourceUsage [] getResourceUsages() {
        return this.ResourceUsages;
    }

    /**
     * Set 资源规格列表，定义队列的资源类型及大小范围
     * @param ResourceUsages 资源规格列表，定义队列的资源类型及大小范围
     */
    public void setResourceUsages(ResourceUsage [] ResourceUsages) {
        this.ResourceUsages = ResourceUsages;
    }

    /**
     * Get 队列类型：1-独占型，2-共享型 
     * @return QueueType 队列类型：1-独占型，2-共享型
     */
    public Long getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 队列类型：1-独占型，2-共享型
     * @param QueueType 队列类型：1-独占型，2-共享型
     */
    public void setQueueType(Long QueueType) {
        this.QueueType = QueueType;
    }

    public ModifyPartitionQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPartitionQueueRequest(ModifyPartitionQueueRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ResourceUsages != null) {
            this.ResourceUsages = new ResourceUsage[source.ResourceUsages.length];
            for (int i = 0; i < source.ResourceUsages.length; i++) {
                this.ResourceUsages[i] = new ResourceUsage(source.ResourceUsages[i]);
            }
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
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ResourceUsages.", this.ResourceUsages);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);

    }
}

