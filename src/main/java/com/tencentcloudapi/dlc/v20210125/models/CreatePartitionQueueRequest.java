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

public class CreatePartitionQueueRequest extends AbstractModel {

    /**
    * <p>分区编码</p>
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * <p>队列名称</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>资源规格列表，定义队列的资源类型及大小范围</p>
    */
    @SerializedName("ResourceUsages")
    @Expose
    private ResourceUsage [] ResourceUsages;

    /**
    * <p>队列类型：1-独占型，2-共享型</p>
    */
    @SerializedName("QueueType")
    @Expose
    private Long QueueType;

    /**
    * <p>队列描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>分区编码</p> 
     * @return PartitionCode <p>分区编码</p>
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set <p>分区编码</p>
     * @param PartitionCode <p>分区编码</p>
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
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
     * Get <p>资源规格列表，定义队列的资源类型及大小范围</p> 
     * @return ResourceUsages <p>资源规格列表，定义队列的资源类型及大小范围</p>
     */
    public ResourceUsage [] getResourceUsages() {
        return this.ResourceUsages;
    }

    /**
     * Set <p>资源规格列表，定义队列的资源类型及大小范围</p>
     * @param ResourceUsages <p>资源规格列表，定义队列的资源类型及大小范围</p>
     */
    public void setResourceUsages(ResourceUsage [] ResourceUsages) {
        this.ResourceUsages = ResourceUsages;
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

    /**
     * Get <p>队列描述</p> 
     * @return Description <p>队列描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>队列描述</p>
     * @param Description <p>队列描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreatePartitionQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePartitionQueueRequest(CreatePartitionQueueRequest source) {
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamArrayObj(map, prefix + "ResourceUsages.", this.ResourceUsages);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

