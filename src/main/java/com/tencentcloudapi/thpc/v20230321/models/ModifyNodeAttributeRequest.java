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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNodeAttributeRequest extends AbstractModel {

    /**
    * <p>节点ID，节点ID通过调用接口 <a href="https://cloud.tencent.com/document/api/1527/89569">DescribeNodes</a>获取。</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>节点别名</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>资源的分配状态:  - IDLE: 资源空闲 - ISOLATE: 资源隔离</p>
    */
    @SerializedName("NodeAllocateState")
    @Expose
    private String NodeAllocateState;

    /**
    * <p>目标队列名</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
     * Get <p>节点ID，节点ID通过调用接口 <a href="https://cloud.tencent.com/document/api/1527/89569">DescribeNodes</a>获取。</p> 
     * @return NodeId <p>节点ID，节点ID通过调用接口 <a href="https://cloud.tencent.com/document/api/1527/89569">DescribeNodes</a>获取。</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点ID，节点ID通过调用接口 <a href="https://cloud.tencent.com/document/api/1527/89569">DescribeNodes</a>获取。</p>
     * @param NodeId <p>节点ID，节点ID通过调用接口 <a href="https://cloud.tencent.com/document/api/1527/89569">DescribeNodes</a>获取。</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>节点别名</p> 
     * @return NodeName <p>节点别名</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点别名</p>
     * @param NodeName <p>节点别名</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>资源的分配状态:  - IDLE: 资源空闲 - ISOLATE: 资源隔离</p> 
     * @return NodeAllocateState <p>资源的分配状态:  - IDLE: 资源空闲 - ISOLATE: 资源隔离</p>
     */
    public String getNodeAllocateState() {
        return this.NodeAllocateState;
    }

    /**
     * Set <p>资源的分配状态:  - IDLE: 资源空闲 - ISOLATE: 资源隔离</p>
     * @param NodeAllocateState <p>资源的分配状态:  - IDLE: 资源空闲 - ISOLATE: 资源隔离</p>
     */
    public void setNodeAllocateState(String NodeAllocateState) {
        this.NodeAllocateState = NodeAllocateState;
    }

    /**
     * Get <p>目标队列名</p> 
     * @return QueueName <p>目标队列名</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>目标队列名</p>
     * @param QueueName <p>目标队列名</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    public ModifyNodeAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNodeAttributeRequest(ModifyNodeAttributeRequest source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeAllocateState != null) {
            this.NodeAllocateState = new String(source.NodeAllocateState);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeAllocateState", this.NodeAllocateState);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);

    }
}

