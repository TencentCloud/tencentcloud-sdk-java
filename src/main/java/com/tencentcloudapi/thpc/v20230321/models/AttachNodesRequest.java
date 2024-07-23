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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachNodesRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点的资源类型。<li>CVM：CVM实例类型资源</li><li>WORKSPACE：工作空间类型实例资源</li>默认值：CVM。
    */
    @SerializedName("ResourceSet")
    @Expose
    private String [] ResourceSet;

    /**
    * 队列名称。不指定则为默认队列：
SLURM默认队列为：compute。 
SGE默认队列为：all.q。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 指定有效的镜像ID，格式形如img-xxx。目前仅支持公有镜像和特定自定义镜像。如不指定，则该字段是默认镜像。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 要新增节点的资源类型。<li>CVM：CVM实例类型资源</li><li>WORKSPACE：工作空间类型实例资源</li>默认值：CVM。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点的资源类型。<li>CVM：CVM实例类型资源</li><li>WORKSPACE：工作空间类型实例资源</li>默认值：CVM。 
     * @return ResourceSet 节点的资源类型。<li>CVM：CVM实例类型资源</li><li>WORKSPACE：工作空间类型实例资源</li>默认值：CVM。
     */
    public String [] getResourceSet() {
        return this.ResourceSet;
    }

    /**
     * Set 节点的资源类型。<li>CVM：CVM实例类型资源</li><li>WORKSPACE：工作空间类型实例资源</li>默认值：CVM。
     * @param ResourceSet 节点的资源类型。<li>CVM：CVM实例类型资源</li><li>WORKSPACE：工作空间类型实例资源</li>默认值：CVM。
     */
    public void setResourceSet(String [] ResourceSet) {
        this.ResourceSet = ResourceSet;
    }

    /**
     * Get 队列名称。不指定则为默认队列：
SLURM默认队列为：compute。 
SGE默认队列为：all.q。 
     * @return QueueName 队列名称。不指定则为默认队列：
SLURM默认队列为：compute。 
SGE默认队列为：all.q。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称。不指定则为默认队列：
SLURM默认队列为：compute。 
SGE默认队列为：all.q。
     * @param QueueName 队列名称。不指定则为默认队列：
SLURM默认队列为：compute。 
SGE默认队列为：all.q。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 指定有效的镜像ID，格式形如img-xxx。目前仅支持公有镜像和特定自定义镜像。如不指定，则该字段是默认镜像。 
     * @return ImageId 指定有效的镜像ID，格式形如img-xxx。目前仅支持公有镜像和特定自定义镜像。如不指定，则该字段是默认镜像。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 指定有效的镜像ID，格式形如img-xxx。目前仅支持公有镜像和特定自定义镜像。如不指定，则该字段是默认镜像。
     * @param ImageId 指定有效的镜像ID，格式形如img-xxx。目前仅支持公有镜像和特定自定义镜像。如不指定，则该字段是默认镜像。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 要新增节点的资源类型。<li>CVM：CVM实例类型资源</li><li>WORKSPACE：工作空间类型实例资源</li>默认值：CVM。 
     * @return ResourceType 要新增节点的资源类型。<li>CVM：CVM实例类型资源</li><li>WORKSPACE：工作空间类型实例资源</li>默认值：CVM。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 要新增节点的资源类型。<li>CVM：CVM实例类型资源</li><li>WORKSPACE：工作空间类型实例资源</li>默认值：CVM。
     * @param ResourceType 要新增节点的资源类型。<li>CVM：CVM实例类型资源</li><li>WORKSPACE：工作空间类型实例资源</li>默认值：CVM。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public AttachNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachNodesRequest(AttachNodesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ResourceSet != null) {
            this.ResourceSet = new String[source.ResourceSet.length];
            for (int i = 0; i < source.ResourceSet.length; i++) {
                this.ResourceSet[i] = new String(source.ResourceSet[i]);
            }
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "ResourceSet.", this.ResourceSet);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

