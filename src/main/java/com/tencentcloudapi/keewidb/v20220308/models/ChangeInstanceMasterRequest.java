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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeInstanceMasterRequest extends AbstractModel {

    /**
    * <p>实例 ID，如：kee-6ubh****。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>副本节点组 ID，请通过接口DescribeInstanceReplicas获取多 AZ备节点组的 ID 信息。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>副本节点 ID。</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
     * Get <p>实例 ID，如：kee-6ubh****。</p> 
     * @return InstanceId <p>实例 ID，如：kee-6ubh****。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，如：kee-6ubh****。</p>
     * @param InstanceId <p>实例 ID，如：kee-6ubh****。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>副本节点组 ID，请通过接口DescribeInstanceReplicas获取多 AZ备节点组的 ID 信息。</p> 
     * @return GroupId <p>副本节点组 ID，请通过接口DescribeInstanceReplicas获取多 AZ备节点组的 ID 信息。</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>副本节点组 ID，请通过接口DescribeInstanceReplicas获取多 AZ备节点组的 ID 信息。</p>
     * @param GroupId <p>副本节点组 ID，请通过接口DescribeInstanceReplicas获取多 AZ备节点组的 ID 信息。</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>副本节点 ID。</p> 
     * @return NodeId <p>副本节点 ID。</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>副本节点 ID。</p>
     * @param NodeId <p>副本节点 ID。</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    public ChangeInstanceMasterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeInstanceMasterRequest(ChangeInstanceMasterRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);

    }
}

