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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HPCNode extends AbstractModel {

    /**
    * <p>节点ID</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>队列ID</p>
    */
    @SerializedName("QueueId")
    @Expose
    private String QueueId;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>角色</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>镜像ID</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>实例信息</p>
    */
    @SerializedName("Instance")
    @Expose
    private HPCInstance Instance;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>节点名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>队列名称</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>节点状态。取值范围：<br>IDLE 空闲<br>DOWN 节点下线<br>MIXED 节点部分使用<br>ALLOC  节点完全分配<br>DRAIN 排空，不接受新任务</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>节点ID</p> 
     * @return NodeId <p>节点ID</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点ID</p>
     * @param NodeId <p>节点ID</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>队列ID</p> 
     * @return QueueId <p>队列ID</p>
     */
    public String getQueueId() {
        return this.QueueId;
    }

    /**
     * Set <p>队列ID</p>
     * @param QueueId <p>队列ID</p>
     */
    public void setQueueId(String QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>角色</p> 
     * @return Role <p>角色</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>角色</p>
     * @param Role <p>角色</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>类型</p> 
     * @return Type <p>类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p>
     * @param Type <p>类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>镜像ID</p> 
     * @return ImageId <p>镜像ID</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像ID</p>
     * @param ImageId <p>镜像ID</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>实例信息</p> 
     * @return Instance <p>实例信息</p>
     */
    public HPCInstance getInstance() {
        return this.Instance;
    }

    /**
     * Set <p>实例信息</p>
     * @param Instance <p>实例信息</p>
     */
    public void setInstance(HPCInstance Instance) {
        this.Instance = Instance;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>节点名称</p> 
     * @return Name <p>节点名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>节点名称</p>
     * @param Name <p>节点名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>节点状态。取值范围：<br>IDLE 空闲<br>DOWN 节点下线<br>MIXED 节点部分使用<br>ALLOC  节点完全分配<br>DRAIN 排空，不接受新任务</p> 
     * @return Status <p>节点状态。取值范围：<br>IDLE 空闲<br>DOWN 节点下线<br>MIXED 节点部分使用<br>ALLOC  节点完全分配<br>DRAIN 排空，不接受新任务</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>节点状态。取值范围：<br>IDLE 空闲<br>DOWN 节点下线<br>MIXED 节点部分使用<br>ALLOC  节点完全分配<br>DRAIN 排空，不接受新任务</p>
     * @param Status <p>节点状态。取值范围：<br>IDLE 空闲<br>DOWN 节点下线<br>MIXED 节点部分使用<br>ALLOC  节点完全分配<br>DRAIN 排空，不接受新任务</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public HPCNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HPCNode(HPCNode source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.QueueId != null) {
            this.QueueId = new String(source.QueueId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Instance != null) {
            this.Instance = new HPCInstance(source.Instance);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "QueueId", this.QueueId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "Instance.", this.Instance);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

